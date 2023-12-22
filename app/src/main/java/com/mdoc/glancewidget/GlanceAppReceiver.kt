package com.mdoc.glancewidget

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class GlanceAppReceiver: GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = CamWidget
}