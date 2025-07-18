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
public final class SubtitleWindowTextTimeline implements Serializable {
    private static final long serialVersionUID = -9059109722975469027L;
    private final List<Boolean> appends;
    public final List<Integer> endTimes;
    private final List<String> lines;
    public final List<Integer> startTimes;

    /* compiled from: PG */
    public class Builder {
        private final List<Integer> startTimes = new ArrayList();
        private final List<Integer> endTimes = new ArrayList();
        private final List<String> lines = new ArrayList();
        private final List<Boolean> appends = new ArrayList();

        public Builder addLine(String str, int i, int i2, boolean z) {
            if (!this.startTimes.isEmpty()) {
                if (i < this.startTimes.get(r0.size() - 1).intValue()) {
                    krd.f("subtitles are not given in non-decreasing start time order");
                }
            }
            this.startTimes.add(Integer.valueOf(i));
            this.endTimes.add(Integer.valueOf(i2));
            this.lines.add(str);
            this.appends.add(Boolean.valueOf(z));
            return this;
        }

        public SubtitleWindowTextTimeline build() {
            return new SubtitleWindowTextTimeline(this.startTimes, this.endTimes, this.lines, this.appends);
        }
    }

    public SubtitleWindowTextTimeline(List<Integer> list, List<Integer> list2, List<String> list3, List<Boolean> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        a.ah(list.size() == list2.size(), "startTimes and endTimes differ in size");
        a.ah(list.size() == list3.size(), "startTimes and lines differ in size");
        a.ah(list.size() == list3.size(), "startTimes and lines differ in size");
        this.startTimes = DesugarCollections.unmodifiableList(list);
        this.endTimes = DesugarCollections.unmodifiableList(list2);
        this.lines = DesugarCollections.unmodifiableList(list3);
        this.appends = DesugarCollections.unmodifiableList(list4);
    }

    public String getSubtitleWindowTextAt(int i, boolean z) {
        int iBinarySearch = Collections.binarySearch(this.startTimes, Integer.valueOf(i));
        StringBuilder sb = null;
        if (iBinarySearch < 0 && ((-iBinarySearch) - 2 < 0 || i >= this.endTimes.get(iBinarySearch).intValue())) {
            return null;
        }
        while (iBinarySearch > 0) {
            int i2 = iBinarySearch - 1;
            if (this.startTimes.get(i2).intValue() > i || this.endTimes.get(i2).intValue() <= i) {
                break;
            }
            iBinarySearch = i2;
        }
        String str = this.lines.get(iBinarySearch);
        if (z && str.equals("<br/>")) {
            str = "";
        }
        while (true) {
            iBinarySearch++;
            if (iBinarySearch >= this.startTimes.size() || this.startTimes.get(iBinarySearch).intValue() > i || this.endTimes.get(iBinarySearch).intValue() <= i) {
                break;
            }
            if (sb == null) {
                sb = new StringBuilder(str);
            }
            List<Boolean> list = this.appends;
            if (list != null && !list.get(iBinarySearch).booleanValue() && !z) {
                sb.append("<br/>");
            }
            sb.append(this.lines.get(iBinarySearch));
        }
        return sb != null ? sb.toString() : str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.startTimes.size(); i++) {
            sb.append("[");
            sb.append(this.startTimes.get(i));
            sb.append(" - ");
            sb.append(this.endTimes.get(i));
            sb.append(": ");
            sb.append(this.lines.get(i));
            sb.append("]");
        }
        return sb.toString();
    }
}
