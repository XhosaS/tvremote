package com.google.android.apps.play.movies.common.view.subtitles;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubtitleWindow2B implements Serializable {
    private static final long serialVersionUID = 6099628791227411723L;
    private int id;
    private SubtitleWindowSettingsTimeline settingsTimeline;
    private SubtitleWindowTextTimeline textTimeline;

    private Object readResolve() {
        return new SubtitleWindow(this.id, this.textTimeline, this.settingsTimeline);
    }
}
