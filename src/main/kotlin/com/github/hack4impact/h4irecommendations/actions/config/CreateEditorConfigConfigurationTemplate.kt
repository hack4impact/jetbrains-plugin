package com.github.hack4impact.h4irecommendations.actions.config

import com.github.hack4impact.h4irecommendations.actions.Helpers
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class CreateEditorConfigConfigurationTemplate : AnAction() {
    var templateContent = """
        # EditorConfig helps developers define and maintain consistent coding styles between different editors and IDEs

        root = true

        [*]
        end_of_line = lf
        charset = utf-8
        trim_trailing_whitespace = true
        insert_final_newline = true
        indent_style = space
        indent_size = 2
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
            "EditorConfig",
            file.path + "/.editorconfig",
            templateContent,
            "https://editorconfig.org",
            project
        )
    }
}
