package com.github.nnyjk.nandemoplugin.services

import com.github.nnyjk.nandemoplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
