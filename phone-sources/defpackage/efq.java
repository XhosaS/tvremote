package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efq implements ees {
    private final ees a;
    private final int b;
    private final nuh c;

    public efq(ees eesVar, nuh nuhVar, int i) {
        this.a = eesVar;
        this.c = nuhVar;
        this.b = i;
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) {
        this.c.o(this.b);
        return this.a.a(bArr, i, i2);
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) {
        this.c.o(this.b);
        return this.a.b(eeyVar);
    }

    @Override // defpackage.ees
    public final Uri c() {
        return this.a.c();
    }

    @Override // defpackage.ees
    public final void d() {
        this.a.d();
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
