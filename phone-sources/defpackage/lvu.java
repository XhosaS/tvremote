package defpackage;

import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvu extends mjo {
    public lvu() {
        super((char[]) null);
    }

    @Override // defpackage.mjo
    public final void a(mer merVar, Attributes attributes, String str) {
        Subtitles.Builder builder = (Subtitles.Builder) merVar.a(Subtitles.Builder.class);
        int iD = lvw.d(Float.parseFloat(lvw.e(attributes, "start")));
        builder.addLineToWindow(0, str.replaceAll("\n", "<br/>"), iD, iD + lvw.d(ksh.a(lvw.e(attributes, "dur"), 5.0f)), false);
    }
}
