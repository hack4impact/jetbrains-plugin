package com.github.hack4impact.h4irecommendations.actions.misc

import com.github.hack4impact.h4irecommendations.actions.Helpers
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class CreateChangelogTemplate : AnAction() {
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
        var file = Helpers.getSingleFolder(project)

        if (file !== null) {
            createTemplate(file, project)
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
