package com.google.android.apps.play.movies.common.view.subtitles;

import defpackage.a;
import defpackage.krd;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubtitleWindowSettingsTimeline implements Serializable {
    private static final long serialVersionUID = -8964628709188155848L;
    private final List<SubtitleWindowSettings> settings;
    public final List<Integer> startTimes;

    /* compiled from: PG */
    public class Builder {
        private final List<Integer> startTimes = new ArrayList();
        private final List<SubtitleWindowSettings> settings = new ArrayList();

        public Builder() {
            addSettings(0, SubtitleWindowSettings.DEFAULT_SUBTITLE_WINDOW_SETTINGS);
        }

        public Builder addSettings(int i, SubtitleWindowSettings subtitleWindowSettings) {
            if (!this.startTimes.isEmpty()) {
                if (i < this.startTimes.get(r0.size() - 1).intValue()) {
                    krd.f("subtitle settings are not given in non-decreasing start time order");
                }
            }
            this.startTimes.add(Integer.valueOf(i));
            this.settings.add(subtitleWindowSettings);
            return this;
        }

        public SubtitleWindowSettingsTimeline build() {
            return new SubtitleWindowSettingsTimeline(this.startTimes, this.settings);
        }
    }

    public SubtitleWindowSettingsTimeline(List<Integer> list, List<SubtitleWindowSettings> list2) {
        list.getClass();
        list2.getClass();
        a.ah(list.size() == list2.size(), "startTimes and settings differ in size");
        this.startTimes = DesugarCollections.unmodifiableList(list);
        this.settings = DesugarCollections.unmodifiableList(list2);
    }

    public synchronized SubtitleWindowSettings getSubtitleWindowSettingsAt(int i) {
        int iBinarySearch = Collections.binarySearch(this.startTimes, Integer.valueOf(i));
        if (iBinarySearch >= 0) {
            return this.settings.get(iBinarySearch);
        }
        int i2 = (-iBinarySearch) - 2;
        if (i2 < 0) {
            return null;
        }
        return this.settings.get(i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.startTimes.size(); i++) {
            sb.append("[");
            sb.append(this.startTimes.get(i));
            sb.append(": ");
            sb.append(this.settings.get(i));
            sb.append("]");
        }
        return sb.toString();
    }
}
