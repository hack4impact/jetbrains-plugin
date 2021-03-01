package com.github.hack4impact.h4irecommendations.actions.misc

import com.github.hack4impact.h4irecommendations.actions.Helpers
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class CreateGitIgnoreTemplate : AnAction() {
    var templateContent = """
        # See https://help.github.com/articles/ignoring-files/ for more information on ignoring files.

        # dependencies
        node_modules/

        # testing
        coverage/

        # production
        dist/
        out/
        build/

        # private/secret files
        .env

        # misc
        .DS_Store
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
            "GitIgnore",
            file.path + "/.gitignore",
            templateContent,
            "https://git-scm.com/docs/gitignore",
            project
        )
    }
}
