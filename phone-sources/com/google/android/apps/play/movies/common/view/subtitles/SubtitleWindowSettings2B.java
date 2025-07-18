package com.google.android.apps.play.movies.common.view.subtitles;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubtitleWindowSettings2B implements Serializable {
    private static final long serialVersionUID = -3234304299850435221L;
    public int anchorHorizontalPos;
    public int anchorPoint;
    public int anchorVerticalPos;
    private Integer scrollDirection;
    public boolean visible;

    private Object readResolve() {
        int i = this.anchorPoint;
        int i2 = this.anchorHorizontalPos;
        int i3 = this.anchorVerticalPos;
        boolean z = this.visible;
        Integer num = this.scrollDirection;
        return new SubtitleWindowSettings(i, i2, i3, z, num == null ? -1 : num.intValue());
    }
}
