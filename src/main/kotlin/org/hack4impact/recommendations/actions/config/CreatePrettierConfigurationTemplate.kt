package org.hack4impact.recommendations.actions.config

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import org.hack4impact.recommendations.Helpers

class CreatePrettierConfigurationTemplate : AnAction() {
    var templateContent = """
        {
          "singleQuote": false,
          "endOfLine": "lf",
          "semi": true,
          "arrowParens": "always",
          "useTabs": false,
          "tabWidth": 2,
          "bracketSpacing": true,
          "requirePragma": false,
          "trailingComma": "es5"
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
            "Prettier",
            folder.path + "/.prettierrc.json",
            templateContent,
            "https://prettier.io/docs/en/configuration.html",
            project
        )
    }
}
