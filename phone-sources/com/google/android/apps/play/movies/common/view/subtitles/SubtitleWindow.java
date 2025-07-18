package com.google.android.apps.play.movies.common.view.subtitles;

import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowSettingsTimeline;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowTextTimeline;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubtitleWindow implements Serializable {
    private static final long serialVersionUID = 3629783949825309462L;
    private final int id;
    public final SubtitleWindowSettingsTimeline settingsTimeline;
    public final SubtitleWindowTextTimeline textTimeline;

    /* compiled from: PG */
    public class Builder {
        private final int id;
        private final SubtitleWindowTextTimeline.Builder textTimelineBuilder = new SubtitleWindowTextTimeline.Builder();
        private final SubtitleWindowSettingsTimeline.Builder settingsTimelineBuilder = new SubtitleWindowSettingsTimeline.Builder();

        public Builder(int i) {
            this.id = i;
        }

        public Builder addLine(String str, int i, int i2, boolean z) {
            this.textTimelineBuilder.addLine(str, i, i2, z);
            return this;
        }

        public Builder addSettings(int i, SubtitleWindowSettings subtitleWindowSettings) {
            this.settingsTimelineBuilder.addSettings(i, subtitleWindowSettings);
            return this;
        }

        public SubtitleWindow build() {
            SubtitleWindowSettingsTimeline.Builder builder = this.settingsTimelineBuilder;
            return new SubtitleWindow(this.id, this.textTimelineBuilder.build(), builder.build());
        }
    }

    public SubtitleWindow(int i, SubtitleWindowTextTimeline subtitleWindowTextTimeline, SubtitleWindowSettingsTimeline subtitleWindowSettingsTimeline) {
        this.id = i;
        this.textTimeline = subtitleWindowTextTimeline;
        this.settingsTimeline = subtitleWindowSettingsTimeline;
    }

    public SubtitleWindowSettings getSettingsAt(int i) {
        return this.settingsTimeline.getSubtitleWindowSettingsAt(i);
    }

    public SubtitleWindowSnapshot getSubtitleWindowSnapshotAt(int i) {
        return new SubtitleWindowSnapshot(this.id, i, getTextAt(i), getSettingsAt(i));
    }

    public String getTextAt(int i) {
        SubtitleWindowSettings settingsAt = getSettingsAt(i);
        boolean z = false;
        if (settingsAt != null && settingsAt.getScrollDirection() != -1) {
            z = true;
        }
        return this.textTimeline.getSubtitleWindowTextAt(i, z);
    }

    public String toString() {
        SubtitleWindowSettingsTimeline subtitleWindowSettingsTimeline = this.settingsTimeline;
        return "id: " + this.id + " text: " + String.valueOf(this.textTimeline) + " settings: " + String.valueOf(subtitleWindowSettingsTimeline);
    }
}
