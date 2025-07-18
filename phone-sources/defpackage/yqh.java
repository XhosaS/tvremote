package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yqh extends yxf implements ypm, yqa {
    public yql d;

    public abstract void a(Throwable th);

    public abstract boolean b();

    public final yql e() {
        yql yqlVar = this.d;
        if (yqlVar != null) {
            return yqlVar;
        }
        yks.c("job");
        return null;
    }

    @Override // defpackage.yqa
    public final yqq eC() {
        return null;
    }

    @Override // defpackage.ypm
    public final void eD() {
        Object objEQ;
        Object objF;
        yxf yxfVar;
        yxj yxjVar;
        yql yqlVarE = e();
        do {
            objEQ = yqlVarE.eQ();
            if (!(objEQ instanceof yqh)) {
                if (!(objEQ instanceof yqa) || ((yqa) objEQ).eC() == null) {
                    return;
                }
                do {
                    objF = f();
                    if (objF instanceof yxj) {
                        yxf yxfVar2 = ((yxj) objF).a;
                        return;
                    }
                    if (objF == this) {
                        return;
                    }
                    objF.getClass();
                    yxfVar = (yxf) objF;
                    ynu ynuVar = yxfVar.g;
                    yxjVar = (yxj) ynuVar.a;
                    if (yxjVar == null) {
                        yxjVar = new yxj(yxfVar);
                        ynuVar.b(yxjVar);
                    }
                } while (!this.e.d(objF, yxjVar));
                yxfVar.g();
                return;
            }
            if (objEQ != this) {
                return;
            }
        } while (!yqlVarE.d.d(objEQ, yqm.g));
    }

    @Override // defpackage.yqa
    public final boolean eE() {
        return true;
    }

    @Override // defpackage.yxf
    public final String toString() {
        return yoz.a(this) + "@" + yoz.b(this) + "[job@" + yoz.b(e()) + "]";
    }
}
