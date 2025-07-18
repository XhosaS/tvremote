package defpackage;

import com.google.android.apps.play.movies.common.view.subtitles.SubtitleWindowSettings;
import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvp extends mjo {
    public lvp() {
        super((char[]) null);
    }

    @Override // defpackage.mjo
    public final void a(mer merVar, Attributes attributes, String str) {
        ((Subtitles.Builder) merVar.a(Subtitles.Builder.class)).addSettingsToWindow(ksh.b(lvw.e(attributes, "xml:id"), 0), 0, (SubtitleWindowSettings) lvw.b.get(lvw.e(attributes, "style")));
    }
}
