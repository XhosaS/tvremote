package com.google.android.apps.play.movies.common.view.subtitles;

import java.io.Serializable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubtitleWindowTextTimeline2B implements Serializable {
    private static final long serialVersionUID = -7782531310480411935L;
    private List<Boolean> appends;
    private List<Integer> endTimes;
    private List<String> lines;
    private List<Integer> startTimes;

    private Object readResolve() {
        return new SubtitleWindowTextTimeline(this.startTimes, this.endTimes, this.lines, this.appends);
    }
}
