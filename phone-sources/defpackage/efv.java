package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efv implements ees {
    private final ees a;
    private final efu b;
    private boolean c;

    public efv(ees eesVar, efu efuVar) {
        this.a = eesVar;
        this.b = efuVar;
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) {
        eey eeyVarB = this.b.b(eeyVar);
        this.c = true;
        return this.a.b(eeyVarB);
    }

    @Override // defpackage.ees
    public final Uri c() {
        Uri uriC = this.a.c();
        if (uriC == null) {
            return null;
        }
        return this.b.a(uriC);
    }

    @Override // defpackage.ees
    public final void d() {
        if (this.c) {
            this.c = false;
            this.a.d();
        }
    }

    @Override // defpackage.ees
    public final Map e() {
        return this.a.e();
    }

    @Override // defpackage.ees
    public final void f(efy efyVar) {
        efyVar.getClass();
        this.a.f(efyVar);
    }
}
