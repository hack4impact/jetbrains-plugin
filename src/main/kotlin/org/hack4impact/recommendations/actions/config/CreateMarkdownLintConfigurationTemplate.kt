package org.hack4impact.recommendations.actions.config

import org.hack4impact.recommendations.Helpers
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class CreateMarkdownLintConfigurationTemplate : AnAction() {
    var templateContent = """
        {
          "no-inline-html": false
        }
    """.trimIndent()

    override fun actionPerformed(e: AnActionEvent) {
        var project = e.project
        var folder = Helpers.getSingleFolder(project)

        if (folder !== null) {
            createTemplate(folder, project)
        }
    }

    fun createTemplate(folder: VirtualFile, project: Project?) {
        Helpers.createTemplateFile(
            "MarkdownLint",
            folder.path + "/.markdownlint.json",
            templateContent,
            "https://github.com/DavidAnson/markdownlint/blob/main/doc/Rules.md",
            project
        )
    }
}
