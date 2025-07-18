package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddq extends czr {
    public dag a;
    ddi b;

    private ddq(dag dagVar) {
        if (dagVar.b() >= 2 && dagVar.b() <= 3) {
            this.a = dagVar;
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + dagVar.b());
    }

    public static ddq c(Object obj) {
        if (obj instanceof ddq) {
            return (ddq) obj;
        }
        if (obj != null) {
            return new ddq(dag.j(obj));
        }
        return null;
    }

    public final czo a() {
        return czo.m(this.a.h(0));
    }

    public final ddi b() {
        if (this.b == null && this.a.b() == 3) {
            this.b = ddi.c(this.a.h(2));
        }
        return this.b;
    }

    public final boolean d() {
        return this.a.b() == 3;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return this.a;
    }
}
