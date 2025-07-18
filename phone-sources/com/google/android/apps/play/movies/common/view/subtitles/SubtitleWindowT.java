package com.google.android.apps.play.movies.common.view.subtitles;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubtitleWindowT implements Serializable {
    private static final long serialVersionUID = 1022474571685379818L;
    private final int id;
    final SubtitleWindowSettingsTimeline settingsTimeline;
    final SubtitleWindowTextTimeline textTimeline;

    private SubtitleWindowT(int i, SubtitleWindowTextTimeline subtitleWindowTextTimeline, SubtitleWindowSettingsTimeline subtitleWindowSettingsTimeline) {
        this.id = i;
        this.textTimeline = subtitleWindowTextTimeline;
        this.settingsTimeline = subtitleWindowSettingsTimeline;
    }

    private Object readResolve() {
        return new SubtitleWindow(this.id, this.textTimeline, this.settingsTimeline);
    }
}
