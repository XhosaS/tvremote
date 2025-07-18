package defpackage;

import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowSettings;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvo extends mjo {
    public lvo() {
        super((char[]) null);
    }

    @Override // defpackage.mjo
    public final void a(mer merVar, Attributes attributes, String str) {
        String strE = lvw.e(attributes, "xml:id");
        String strE2 = lvw.e(attributes, "tts:extent");
        if (strE2 == null) {
            return;
        }
        int[] iArrF = lvw.f(strE2);
        String strE3 = lvw.e(attributes, "tts:origin");
        if (strE3 != null) {
            int[] iArrF2 = lvw.f(strE3);
            lvw.b.put(strE, new SubtitleWindowSettings(lvw.a(4), (iArrF[0] / 2) + iArrF2[0], (iArrF[1] / 2) + iArrF2[1], true, -1));
        }
    }
}
