package com.github.hack4impact.h4irecommendations.actions

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.fileChooser.FileChooser
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.annotations.Nullable

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
}
