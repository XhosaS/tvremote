package defpackage;

import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvm extends mjo {
    public lvm() {
        super((char[]) null);
    }

    @Override // defpackage.mjo
    public final void a(mer merVar, Attributes attributes, String str) throws NumberFormatException {
        Subtitles.Builder builder = (Subtitles.Builder) merVar.a(Subtitles.Builder.class);
        int iB = ksh.b(lvw.e(attributes, "w", "win"), 0);
        int i = Integer.parseInt(lvw.e(attributes, "t", "start"));
        builder.addLineToWindow(iB, str.replaceAll("\n", "<br/>"), i, i + ksh.b(lvw.e(attributes, "d", "dur"), lvw.a), lvw.e(attributes, "append") != null);
    }
}
