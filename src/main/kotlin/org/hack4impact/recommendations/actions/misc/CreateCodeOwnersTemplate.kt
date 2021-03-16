package org.hack4impact.recommendations.actions.misc

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import org.hack4impact.recommendations.Helpers

class CreateCodeOwnersTemplate : AnAction() {
    @Suppress("MaxLineLength")
    var templateContent = """
        # Lines starting with '#' are comments.
        # Each line is a file pattern followed by one or more owners.

        # More details are here: https://help.github.com/articles/about-codeowners/

        # The '*' pattern is global owners.

        # Order is important. The last matching pattern has the most precedence.
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
            "CodeOwners",
            folder.path + "/CODEOWNERS",
            templateContent,
            "https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/about-code-owners",
            project
        )
    }
}
