package org.hack4impact.recommendations.actions.misc

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import org.hack4impact.recommendations.Helpers

class CreateChangelogTemplate : AnAction() {
    @Suppress("MaxLineLength")
    var templateContent = """
        # Changelog

        All notable changes to this project will be documented in this file.

        The format is based on [Keep a Changelog](http://keepachangelog.com/), and this project adheres to [Semantic Versioning](https://semver.org/).

        ## Table of Contents

        - [Unreleased](#unreleased)

        ## Unreleased
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
            "Changelog",
            folder.path + "/CHANGELOG.md",
            templateContent,
            "https://keepachangelog.com/",
            project
        )
    }
}
