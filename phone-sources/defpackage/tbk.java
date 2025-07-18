package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbk {
    public boolean a;
    public final /* synthetic */ Object b;

    public tbk() {
        throw null;
    }

    public final void a(Bitmap bitmap, String str, long j) {
        if (this.a) {
            return;
        }
        liw liwVar = (liw) this.b;
        nhl nhlVar = liwVar.h;
        nhlVar.g(j);
        nhlVar.h("android.media.metadata.TITLE", str);
        nhlVar.h("android.media.metadata.DISPLAY_TITLE", str);
        if (bitmap != null) {
            nhlVar.f("android.media.metadata.ART", bitmap);
        }
        liwVar.b.h(nhlVar.e());
    }

    public tbk(Object obj) {
        this.b = obj;
    }

    public tbk(pgz pgzVar) {
        this.b = pgzVar;
        this.a = false;
    }
}
