package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdd implements yow, bda {
    public static final yil a = new bai();
    public final yil b;
    public final yil c;
    private final Object d = this;
    private volatile yil e;

    public bdd(yil yilVar, yil yilVar2) {
        this.b = yilVar;
        this.c = yilVar2;
    }

    @Override // defpackage.yow
    public final yil c() {
        yil yilVarPlus = this.e;
        if (yilVarPlus == null || yilVarPlus == a) {
            yil yilVar = this.b;
            bju bjuVar = (bju) yilVar.get(bju.a);
            yil bdcVar = bjuVar != null ? new bdc(CoroutineExceptionHandler.d, bjuVar, this) : yim.a;
            synchronized (this.d) {
                yil yilVar2 = this.e;
                if (yilVar2 == null) {
                    yilVarPlus = yilVar.plus(new yqg((yqe) yilVar.get(yqe.c))).plus(this.c).plus(bdcVar);
                } else if (yilVar2 == a) {
                    yqg yqgVar = new yqg((yqe) yilVar.get(yqe.c));
                    yqgVar.t(new bbo());
                    yilVarPlus = yilVar.plus(yqgVar).plus(this.c).plus(bdcVar);
                } else {
                    yilVarPlus = yilVar2;
                }
                this.e = yilVarPlus;
            }
        }
        yilVarPlus.getClass();
        return yilVarPlus;
    }

    public final void d() {
        synchronized (this.d) {
            yil yilVar = this.e;
            if (yilVar == null) {
                this.e = a;
            } else {
                yoz.x(yilVar, new bbo());
            }
        }
    }

    @Override // defpackage.bda
    public final void dI() {
        d();
    }

    @Override // defpackage.bda
    public final void dJ() {
        d();
    }

    @Override // defpackage.bda
    public final void cb() {
    }
}
