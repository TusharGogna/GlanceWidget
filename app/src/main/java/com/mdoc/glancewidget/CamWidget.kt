package com.mdoc.glancewidget

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceTheme
import androidx.glance.GlanceTheme.colors
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Column

object CamWidget: GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
    provideContent {
        GlanceTheme(colors = colors) {
            Column {
                Button(text = "Feeling Lucky", onClick = {
                    context.startActivity(Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://doodles.google/")).apply {
                        flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    })

                })
            }

        }

    }
    }
}