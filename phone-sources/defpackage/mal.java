package defpackage;

import java.io.InputStream;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mal extends lfd {
    @Override // defpackage.lfd
    protected final ObjectInputStream c(InputStream inputStream) {
        mec mecVar = new mec(inputStream);
        mecVar.a("com.google.android.videos.subtitles.SubtitleTrack", kwx.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleTrack", maq.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleTrack", mar.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleTrack", mas.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleTrack", mat.class);
        mecVar.a("com.google.android.videos.subtitles.SubtitleTrack$Serializer", kwv.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleTrack$Serializer", kww.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleTrack", kwx.class);
        mecVar.a("com.google.android.videos.service.subtitles.SubtitleTrack$Serializer", kwv.class);
        mecVar.a("com.google.android.videos.service.service.subtitles.SubtitleTrack$Serializer", kww.class);
        return mecVar;
    }
}
