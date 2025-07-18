package defpackage;

import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvr extends mjo {
    public lvr() {
        super((char[]) null);
    }

    @Override // defpackage.mjo
    public final void a(mer merVar, Attributes attributes, String str) {
        Subtitles.Builder builder = (Subtitles.Builder) merVar.a(Subtitles.Builder.class);
        int iC = lvw.c(lvw.e(attributes, "begin"));
        int iC2 = lvw.c(lvw.e(attributes, "end"));
        builder.addLineToWindow(lvw.c, String.valueOf(str).concat(String.valueOf(lvw.d)), iC, iC2, false);
        lvw.d = "";
    }
}
