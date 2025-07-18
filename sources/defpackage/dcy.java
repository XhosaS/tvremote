package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcy extends czr {
    cyz a;
    public czo b;

    public dcy() {
        this.b = null;
        this.a = null;
    }

    public static dcy a(Object obj) {
        if (obj != null) {
            return new dcy(dag.j(obj));
        }
        return null;
    }

    public final boolean b() {
        cyz cyzVar = this.a;
        return cyzVar != null && cyzVar.h();
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(2);
        cyz cyzVar = this.a;
        if (cyzVar != null) {
            czcVar.b(cyzVar);
        }
        czo czoVar = this.b;
        if (czoVar != null) {
            czcVar.b(czoVar);
        }
        return new dbk(czcVar);
    }

    public final String toString() {
        czo czoVar = this.b;
        if (czoVar == null) {
            return "BasicConstraints: isCa(" + b() + ")";
        }
        return "BasicConstraints: isCa(" + b() + "), pathLenConstraint = " + czoVar.j().toString();
    }

    private dcy(dag dagVar) {
        this.a = cyz.g(false);
        this.b = null;
        if (dagVar.b() == 0) {
            this.a = null;
            this.b = null;
            return;
        }
        if (dagVar.h(0) instanceof cyz) {
            this.a = cyz.f(dagVar.h(0));
        } else {
            this.a = null;
            this.b = czo.m(dagVar.h(0));
        }
        if (dagVar.b() > 1) {
            if (this.a == null) {
                throw new IllegalArgumentException("wrong sequence in constructor");
            }
            this.b = czo.m(dagVar.h(1));
        }
    }
}
