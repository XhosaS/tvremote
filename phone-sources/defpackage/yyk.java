package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyk extends yyo {
    public final ynu a;

    public yyk() {
        super(1);
        this.a = new ynu(yyl.a, ynv.a);
    }

    public final boolean a() {
        return Math.max(this.c.b, 0) == 0;
    }

    public final Object b(yih yihVar) {
        if (c()) {
            return ygi.a;
        }
        yof yofVarO = yks.o(wcq.S(yihVar));
        try {
            f(new yyj(this, yofVarO));
            Object objI = yofVarO.i();
            yio yioVar = yio.a;
            if (objI == yioVar) {
                yihVar.getClass();
            }
            if (objI != yioVar) {
                objI = ygi.a;
            }
            return objI != yioVar ? ygi.a : objI;
        } catch (Throwable th) {
            yofVarO.x();
            throw th;
        }
    }

    public final boolean c() {
        while (true) {
            yns ynsVar = this.c;
            int i = this.b;
            int i2 = ynsVar.b;
            if (i2 > i) {
                super.g();
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (ynsVar.d(i2, i2 - 1)) {
                    boolean z = yoy.a;
                    this.a.c(null);
                    return true;
                }
            }
        }
    }

    public final void d() {
        while (a()) {
            ynu ynuVar = this.a;
            Object obj = ynuVar.a;
            yxo yxoVar = yyl.a;
            if (obj != yxoVar && ynuVar.d(obj, yxoVar)) {
                h();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + yoz.b(this) + "[isLocked=" + a() + ",owner=" + this.a.a + "]";
    }
}
