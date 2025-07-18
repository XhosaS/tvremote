package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class zdu implements zho {
    public boolean a;
    final /* synthetic */ zdy b;
    private final zgv c;

    public zdu(zdy zdyVar) {
        this.b = zdyVar;
        this.c = new zgv(zdyVar.c.b());
    }

    @Override // defpackage.zho
    public long a(zgk zgkVar, long j) throws IOException {
        try {
            return this.b.c.a(zgkVar, j);
        } catch (IOException e) {
            this.b.b.e();
            c();
            throw e;
        }
    }

    @Override // defpackage.zho
    public final zhq b() {
        return this.c;
    }

    public final void c() {
        zdy zdyVar = this.b;
        int i = zdyVar.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException(a.cf(i, "state: "));
        }
        zgv zgvVar = this.c;
        zhq zhqVar = zgvVar.a;
        zgvVar.a = zhq.j;
        zhqVar.m();
        zhqVar.i();
        zdyVar.d = 6;
    }

    protected final void d() {
        this.a = true;
    }
}
