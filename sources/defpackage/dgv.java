package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgv extends czr {
    public final int a;
    public final dcw b;
    private final czo c;

    public dgv(int i, dcw dcwVar) {
        this.c = new czo(0L);
        this.a = i;
        this.b = dcwVar;
    }

    public static dgv a(Object obj) {
        if (obj instanceof dgv) {
            return (dgv) obj;
        }
        if (obj != null) {
            return new dgv(dag.j(obj));
        }
        return null;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(this.c);
        czcVar.b(new czo(this.a));
        czcVar.b(this.b);
        return new dbk(czcVar);
    }

    private dgv(dag dagVar) {
        this.c = czo.m(dagVar.h(0));
        this.a = czo.m(dagVar.h(1)).f();
        this.b = dcw.a(dagVar.h(2));
    }
}
