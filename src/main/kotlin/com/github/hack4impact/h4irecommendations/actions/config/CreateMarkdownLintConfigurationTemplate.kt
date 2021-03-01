package com.github.hack4impact.h4irecommendations.actions.config

import com.github.hack4impact.h4irecommendations.actions.Helpers
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
        var file = Helpers.getSingleFolder(project)

        if (file !== null) {
            createTemplate(file, project)
        }
    }

    fun createTemplate(file: VirtualFile, project: Project?) {
        Helpers.createTemplateFile(
            "MarkdownLint",
            file.path + "/.markdownlint.json",
            templateContent,
            "https://github.com/DavidAnson/markdownlint/blob/main/doc/Rules.md",
            project
        )
    }
}
