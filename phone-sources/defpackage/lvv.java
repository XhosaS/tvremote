package defpackage;

import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvv extends mjo {
    public lvv() {
        super((char[]) null);
    }

    @Override // defpackage.mjo
    public final void a(mer merVar, Attributes attributes, String str) {
        merVar.poll();
    }

    @Override // defpackage.mjo
    public final void b(mer merVar, Attributes attributes) {
        merVar.offer(new Subtitles.Builder());
    }
}
