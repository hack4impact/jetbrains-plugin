package com.github.hack4impact.h4irecommendations.actions.config

import com.github.hack4impact.h4irecommendations.actions.Helpers
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

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
        var file = Helpers.getSingleFolder(project)

        if (file !== null) {
            createTemplate(file, project)
        }
    }

    fun createTemplate(file: VirtualFile, project: Project?) {
        Helpers.createTemplateFile(
            "Prettier",
            file.path + "/.prettierrc.json",
            templateContent,
            "https://prettier.io/docs/en/configuration.html",
            project
        )
    }
}
