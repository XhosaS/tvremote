package com.google.android.apps.play.movies.common.view.subtitles;

import android.util.SparseArray;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindow;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Subtitles implements Serializable {
    private static final long serialVersionUID = 3938554934440246573L;
    private transient List<Integer> eventTimes;
    private final List<SubtitleWindow> windows;

    /* compiled from: PG */
    public final class Builder {
        private final SparseArray<SubtitleWindow.Builder> windowBuilders = new SparseArray<>();

        private SubtitleWindow.Builder getOrCreateWindowBuilder(int i) {
            SubtitleWindow.Builder builder = this.windowBuilders.get(i);
            if (builder != null) {
                return builder;
            }
            SubtitleWindow.Builder builder2 = new SubtitleWindow.Builder(i);
            this.windowBuilders.put(i, builder2);
            return builder2;
        }

        public Builder addLineToWindow(int i, String str, int i2, int i3, boolean z) {
            getOrCreateWindowBuilder(i).addLine(str, i2, i3, z);
            return this;
        }

        public Builder addSettingsToWindow(int i, int i2, SubtitleWindowSettings subtitleWindowSettings) {
            getOrCreateWindowBuilder(i).addSettings(i2, subtitleWindowSettings);
            return this;
        }

        public Subtitles build() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.windowBuilders.size(); i++) {
                arrayList.add(this.windowBuilders.valueAt(i).build());
            }
            return new Subtitles(arrayList);
        }
    }

    public Subtitles(List<SubtitleWindow> list) {
        this.windows = DesugarCollections.unmodifiableList(list);
        initEventTimes();
    }

    private void initEventTimes() {
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < this.windows.size(); i++) {
            SubtitleWindow subtitleWindow = this.windows.get(i);
            treeSet.addAll(subtitleWindow.textTimeline.startTimes);
            treeSet.addAll(subtitleWindow.textTimeline.endTimes);
            treeSet.addAll(subtitleWindow.settingsTimeline.startTimes);
        }
        this.eventTimes = DesugarCollections.unmodifiableList(new ArrayList(treeSet));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        initEventTimes();
    }

    public List<Integer> getEventTimes() {
        return this.eventTimes;
    }

    public List<SubtitleWindowSnapshot> getSubtitleWindowSnapshotsAt(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.windows.size(); i2++) {
            arrayList.add(this.windows.get(i2).getSubtitleWindowSnapshotAt(i));
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.windows.size(); i++) {
            sb.append("[");
            sb.append(this.windows.get(i).toString());
            sb.append("]");
        }
        return sb.toString();
    }
}
