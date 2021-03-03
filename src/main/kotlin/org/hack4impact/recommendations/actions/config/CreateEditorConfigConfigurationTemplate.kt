package org.hack4impact.recommendations.actions.config

import org.hack4impact.recommendations.Helpers
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
        var folder = Helpers.getSingleFolder(project)

        if (folder !== null) {
            createTemplate(folder, project)
        }
    }

    fun createTemplate(folder: VirtualFile, project: Project?) {
        Helpers.createTemplateFile(
            "EditorConfig",
            folder.path + "/.editorconfig",
            templateContent,
            "https://editorconfig.org",
            project
        )
    }
}
