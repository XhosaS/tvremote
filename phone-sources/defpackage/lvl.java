package defpackage;

import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowSettings;
import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvl extends mjo {
    public lvl() {
        super((char[]) null);
    }

    @Override // defpackage.mjo
    public final void a(mer merVar, Attributes attributes, String str) throws NumberFormatException {
        Subtitles.Builder builder = (Subtitles.Builder) merVar.a(Subtitles.Builder.class);
        int iB = ksh.b(lvw.e(attributes, "w", "win", "id"), 0);
        int i = Integer.parseInt(lvw.e(attributes, "t", "start"));
        String value = attributes.getValue("op");
        if (value == null || !value.equals("define")) {
            return;
        }
        String strE = lvw.e(attributes, "ap");
        int iA = strE != null ? lvw.a(Integer.parseInt(strE)) : 34;
        String strE2 = lvw.e(attributes, "ah");
        int iMax = strE2 != null ? Math.max(0, Math.min(Integer.parseInt(strE2), 100)) : 50;
        String strE3 = lvw.e(attributes, "av");
        int iMax2 = strE3 != null ? Math.max(0, Math.min(Integer.parseInt(strE3), 100)) : 95;
        String strE4 = lvw.e(attributes, "vs");
        builder.addSettingsToWindow(iB, i, new SubtitleWindowSettings(iA, iMax, iMax2, strE4 != null ? Boolean.parseBoolean(strE4) : true, ksh.b(lvw.e(attributes, "sd"), -1)));
    }
}
