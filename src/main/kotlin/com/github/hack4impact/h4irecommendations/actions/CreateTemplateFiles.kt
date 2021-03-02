package com.github.hack4impact.h4irecommendations.actions

import com.github.hack4impact.h4irecommendations.actions.config.CreateESLintConfigurationTemplate
import com.github.hack4impact.h4irecommendations.actions.config.CreateEditorConfigConfigurationTemplate
import com.github.hack4impact.h4irecommendations.actions.config.CreateMarkdownLintConfigurationTemplate
import com.github.hack4impact.h4irecommendations.actions.config.CreatePrettierConfigurationTemplate
import com.github.hack4impact.h4irecommendations.actions.misc.CreateChangelogTemplate
import com.github.hack4impact.h4irecommendations.actions.misc.CreateGitIgnoreTemplate
import com.github.hack4impact.h4irecommendations.actions.misc.CreateLicenseTemplate
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.annotations.Nullable
import javax.swing.BoxLayout
import javax.swing.JCheckBox
import javax.swing.JComponent
import javax.swing.JPanel

class CreateTemplateFiles : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project
        val dialog = SampleDialogWrapper()
        val chosen = dialog.showAndGet()

        println(chosen)

        if (chosen) {
            val checkboxes = dialog.checkboxes
            val anySelected = checkboxes.find {
                it.isSelected
            }

            if (anySelected !== null) {
                val folder = Helpers.getSingleFolder(project)

                if (folder !== null) {
                    checkboxes.forEach {
                        if (it.isSelected) {
                            createTemplate(it.text, folder, project)
                        }
                    }
                }
            }
        }
    }

    fun createTemplate(name: String, folder: VirtualFile, project: Project?) {
        when(name) {
            "ESLint" -> CreateESLintConfigurationTemplate().createTemplate(folder, project)
            "Prettier" -> CreatePrettierConfigurationTemplate().createTemplate(folder, project)
            "MarkdownLint" -> CreateMarkdownLintConfigurationTemplate().createTemplate(
                folder, project
            )
            "EditorConfig" -> CreateEditorConfigConfigurationTemplate().createTemplate(
                folder, project
            )
            "GitIgnore" -> CreateGitIgnoreTemplate().createTemplate(folder, project)
            "Changelog" -> CreateChangelogTemplate().createTemplate(folder, project)
            "License" -> CreateLicenseTemplate().createTemplate(folder, project)
        }
    }
}

class SampleDialogWrapper : DialogWrapper(true) {
    private val dialogPanel = JPanel()
    private val templates = listOf<String>(
        "ESLint",
        "Prettier",
        "MarkdownLint",
        "EditorConfig",
        "GitIgnore",
        "Changelog",
        "License"
    )
    val checkboxes = arrayListOf<JCheckBox>()

    @Nullable
    override fun createCenterPanel(): JComponent {
        dialogPanel.layout = BoxLayout(dialogPanel, BoxLayout.Y_AXIS)
        templates.forEach {
            val checkbox = JCheckBox(it)
            checkboxes.add(checkbox)
            dialogPanel.add(checkbox)
        }
        return dialogPanel
    }

    init {
        init()
        title = "Choose Template Files"
    }
}
