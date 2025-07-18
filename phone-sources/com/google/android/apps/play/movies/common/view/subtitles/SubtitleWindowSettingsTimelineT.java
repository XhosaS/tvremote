package com.google.android.apps.play.movies.common.view.subtitles;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubtitleWindowSettingsTimelineT implements Serializable {
    private static final long serialVersionUID = 5573215994047403715L;
    private final List<SubtitleWindowSettings> settings;
    final List<Integer> startTimes;

    private SubtitleWindowSettingsTimelineT(List<Integer> list, List<SubtitleWindowSettings> list2) {
        this.startTimes = DesugarCollections.unmodifiableList(list);
        this.settings = DesugarCollections.unmodifiableList(list2);
    }

    private Object readResolve() {
        return new SubtitleWindowSettingsTimeline(this.startTimes, this.settings);
    }
}
