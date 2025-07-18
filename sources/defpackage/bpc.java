package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpc extends btc {
    final /* synthetic */ bpd a;
    private final bug b;

    public bpc(bpd bpdVar, bug bugVar) {
        this.a = bpdVar;
        this.b = bugVar;
    }

    @Override // defpackage.btc
    public final int a() {
        return 32;
    }

    @Override // defpackage.btc
    public final void b(int i) {
        if (i(buy.POWER, i)) {
            this.a.a(this.b);
        }
    }

    @Override // defpackage.btc
    public final void c(int i, int i2) {
        buy buyVar = buy.POWER;
        if (h(buyVar, i, i2)) {
            if (i(buyVar, i2)) {
                this.a.d(this.b);
            } else {
                this.a.a(this.b);
            }
        }
    }

    @Override // defpackage.btc
    public final boolean d(bux buxVar) {
        return false;
    }

    @Override // defpackage.btc
    public final boolean e(int i, bsw bswVar) {
        return true;
    }

    @Override // defpackage.btc
    public final void f(bxj bxjVar) {
    }
}
