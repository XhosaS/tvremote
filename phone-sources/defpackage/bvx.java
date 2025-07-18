package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvx implements bvs {
    private final buy a;
    private final int b;
    private final int c;
    private final /* synthetic */ int d;

    public bvx(buy buyVar, int i, int i2, int i3) {
        this.d = i3;
        this.a = buyVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.buy
    public final int c(int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? this.a.c(i) : this.a.c(i) : this.a.c(i);
    }

    @Override // defpackage.buy
    public final int d(int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? this.a.d(i) : this.a.d(i) : this.a.d(i);
    }

    @Override // defpackage.buy
    public final int e(int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? this.a.e(i) : this.a.e(i) : this.a.e(i);
    }

    @Override // defpackage.buy
    public final int f(int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? this.a.f(i) : this.a.f(i) : this.a.f(i);
    }

    @Override // defpackage.buy
    public final Object g() {
        int i = this.d;
        return i != 0 ? i != 1 ? this.a.g() : this.a.g() : this.a.g();
    }

    @Override // defpackage.bvs
    public final bwj u(long j) {
        int i = this.d;
        if (i == 0) {
            if (this.c == 1) {
                return new bvy(this.b == 2 ? this.a.d(clv.a(j)) : this.a.f(clv.a(j)), clv.g(j) ? clv.a(j) : 32767);
            }
            return new bvy(clv.h(j) ? clv.b(j) : 32767, this.b == 2 ? this.a.c(clv.b(j)) : this.a.e(clv.b(j)));
        }
        if (i != 1) {
            if (this.c == 1) {
                return new bzs(this.b == 2 ? this.a.d(clv.a(j)) : this.a.f(clv.a(j)), clv.g(j) ? clv.a(j) : 32767);
            }
            return new bzs(clv.h(j) ? clv.b(j) : 32767, this.b == 2 ? this.a.c(clv.b(j)) : this.a.e(clv.b(j)));
        }
        if (this.c == 1) {
            return new bur(this.b == 2 ? this.a.d(clv.a(j)) : this.a.f(clv.a(j)), clv.g(j) ? clv.a(j) : 32767);
        }
        return new bur(clv.h(j) ? clv.b(j) : 32767, this.b == 2 ? this.a.c(clv.b(j)) : this.a.e(clv.b(j)));
    }
}
