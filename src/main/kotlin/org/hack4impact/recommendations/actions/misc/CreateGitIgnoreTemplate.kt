package org.hack4impact.recommendations.actions.misc

import org.hack4impact.recommendations.Helpers
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
        var folder = Helpers.getSingleFolder(project)

        if (folder !== null) {
            createTemplate(folder, project)
        }
    }

    fun createTemplate(folder: VirtualFile, project: Project?) {
        Helpers.createTemplateFile(
            "GitIgnore",
            folder.path + "/.gitignore",
            templateContent,
            "https://git-scm.com/docs/gitignore",
            project
        )
    }
}
