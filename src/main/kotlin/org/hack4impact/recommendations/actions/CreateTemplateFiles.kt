package org.hack4impact.recommendations.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.openapi.vfs.VirtualFile
import org.hack4impact.recommendations.Helpers
import org.hack4impact.recommendations.actions.config.CreateESLintConfigurationTemplate
import org.hack4impact.recommendations.actions.config.CreateEditorConfigConfigurationTemplate
import org.hack4impact.recommendations.actions.config.CreateMarkdownLintConfigurationTemplate
import org.hack4impact.recommendations.actions.config.CreatePrettierConfigurationTemplate
import org.hack4impact.recommendations.actions.misc.CreateChangelogTemplate
import org.hack4impact.recommendations.actions.misc.CreateGitIgnoreTemplate
import org.hack4impact.recommendations.actions.misc.CreateLicenseTemplate
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
        if (chosen) {
            val checkboxes = dialog.checkboxes
            val anySelected = checkboxes.find {
                it.isSelected
            }

            if (anySelected !== null) {
                val folder = Helpers.getSingleFolder(project)

                if (folder !== null) {
                    createTemplates(checkboxes, folder, project)
                }
            }
        }
    }

    fun createTemplates(checkboxes: ArrayList<JCheckBox>, folder: VirtualFile, project: Project?) {
        checkboxes.forEach {
            if (it.isSelected) {
                createTemplate(it.text, folder, project)
            }
        }
    }

    fun createTemplate(name: String, folder: VirtualFile, project: Project?) {
        when (name) {
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
