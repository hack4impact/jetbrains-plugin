package com.github.hack4impact.h4irecommendations.actions.config

import com.github.hack4impact.h4irecommendations.actions.Helpers
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class CreateESLintConfigurationTemplate : AnAction() {
    var templateContent = """
        {
          "plugins": ["@hack4impact-uiuc"],
          "extends": [
            "plugin:@hack4impact-uiuc/base",
            "plugin:@hack4impact-uiuc/react"
          ],
          "env": {
            "browser": true
          },
          "rules": {
            "react/react-in-jsx-scope": "off",
            "jsx-a11y/anchor-is-valid": [
              "error",
              {
                "components": ["Link"],
                "specialLink": ["hrefLeft", "hrefRight"],
                "aspects": ["invalidHref", "preferButton"]
              }
            ],
            "prettier/prettier": ["error", {}, { "usePrettierrc": true }]
          }
        }
    """.trimIndent()

    override fun actionPerformed(e: AnActionEvent) {
        var project = e.project
        var file = Helpers.getSingleFolder(project)

        if (file !== null) {
            createTemplate(file, project)
        }
    }

    fun createTemplate(folder: VirtualFile, project: Project?) {
        Helpers.createTemplateFile(
            "ESLint",
            folder.path + "/.eslintrc.json",
            templateContent,
            "https://eslint.org/",
            project
        )
    }
}
