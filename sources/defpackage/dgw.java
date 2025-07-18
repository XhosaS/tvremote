package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgw extends czr {
    public final int a;
    public final int b;
    public final dcw c;
    private final czo d;

    public dgw(int i, int i2, dcw dcwVar) {
        this.d = new czo(0L);
        this.a = i;
        this.b = i2;
        this.c = dcwVar;
    }

    public static dgw a(Object obj) {
        if (obj instanceof dgw) {
            return (dgw) obj;
        }
        if (obj != null) {
            return new dgw(dag.j(obj));
        }
        return null;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(this.d);
        czcVar.b(new czo(this.a));
        czcVar.b(new czo(this.b));
        czcVar.b(this.c);
        return new dbk(czcVar);
    }

    private dgw(dag dagVar) {
        this.d = czo.m(dagVar.h(0));
        this.a = czo.m(dagVar.h(1)).f();
        this.b = czo.m(dagVar.h(2)).f();
        this.c = dcw.a(dagVar.h(3));
    }
}
