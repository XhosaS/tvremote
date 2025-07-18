package com.google.android.apps.play.movies.common.view.subtitles;

import java.io.Serializable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubtitleWindowSettingsTimeline2B implements Serializable {
    private static final long serialVersionUID = -4877109547949977886L;
    private List<SubtitleWindowSettings> settings;
    private List<Integer> startTimes;

    private Object readResolve() {
        return new SubtitleWindowSettingsTimeline(this.startTimes, this.settings);
    }
}
