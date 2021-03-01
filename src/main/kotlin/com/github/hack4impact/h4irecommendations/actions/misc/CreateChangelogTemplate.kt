package com.github.hack4impact.h4irecommendations.actions.misc

import com.github.hack4impact.h4irecommendations.actions.Helpers
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class CreateChangelogTemplate : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        var project = e.project
        Helpers.getSingleFolder(project)
    }
}
