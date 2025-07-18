package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faa implements ezt {
    public final long a = evq.a();
    public final eey b;
    public final int c;
    public volatile Object d;
    private final efw e;
    private final ezz f;

    public faa(ees eesVar, eey eeyVar, int i, ezz ezzVar) {
        this.e = new efw(eesVar);
        this.b = eeyVar;
        this.c = i;
        this.f = ezzVar;
    }

    public final Uri a() {
        return this.e.b;
    }

    @Override // defpackage.ezt
    public final void e() throws IOException {
        efw efwVar = this.e;
        efwVar.g();
        eew eewVar = new eew(efwVar, this.b);
        try {
            eewVar.a();
            Uri uriC = efwVar.c();
            uriC.getClass();
            this.d = this.f.a(uriC, eewVar);
        } finally {
            edt.ac(eewVar);
        }
    }

    @Override // defpackage.ezt
    public final void c() {
    }
}
