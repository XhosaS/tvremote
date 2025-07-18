package com.google.android.apps.play.movies.common.view.subtitles;

import defpackage.fsp;
import defpackage.mga;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface SubtitlesOverlay extends mga {
    void clear();

    void setCaptionStyle(fsp fspVar);

    void setFontScale(float f);

    void update(List<SubtitleWindowSnapshot> list);
}
