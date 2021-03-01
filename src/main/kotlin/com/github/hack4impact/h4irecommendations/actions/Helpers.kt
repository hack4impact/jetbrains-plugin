package com.github.hack4impact.h4irecommendations.actions

import com.intellij.ide.BrowserUtil
import com.intellij.ide.actions.OpenFileAction
import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileChooser.FileChooser
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.annotations.Nullable
import java.io.File
import java.net.URI

object Helpers {
    var notificationGroup = NotificationGroup("Hack4Impact", NotificationDisplayType.BALLOON, true)

    fun getSingleFolder(project: Project?): @Nullable VirtualFile? {
        var file = FileChooser.chooseFile(
            FileChooserDescriptorFactory.createSingleFolderDescriptor(),
            null,
            null,
            null
        )

        if (file === null) {
            notificationGroup.createNotification(
                "Hack4Impact Error",
                "Please select a folder when creating a template file",
                NotificationType.ERROR,
            ).notify(project)
        }

        return file
    }

    fun createTemplateFile(name: String, filePath: String, fileContent: String, docsUrl: String, project: Project?) {
        File(filePath).writeText(fileContent, Charsets.UTF_8)
        notificationGroup.createNotification(
            "$name template successfully created!",
            NotificationType.INFORMATION
        ).addAction(object : AnAction("View Template") {
            override fun actionPerformed(e: AnActionEvent) {
                if (project != null) {
                    OpenFileAction.openFile(filePath, project)
                }
            }
        }).addAction(object : AnAction("View Docs") {
            override fun actionPerformed(e: AnActionEvent) {
                BrowserUtil.browse(URI.create(docsUrl))
            }
        }).notify(project)
    }
}
