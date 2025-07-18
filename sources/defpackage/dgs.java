package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgs extends czr {
    public final dcw a;
    private final czo b;

    private dgs(dag dagVar) {
        this.b = czo.m(dagVar.h(0));
        this.a = dcw.a(dagVar.h(1));
    }

    public static final dgs a(Object obj) {
        if (obj instanceof dgs) {
            return (dgs) obj;
        }
        if (obj != null) {
            return new dgs(dag.j(obj));
        }
        return null;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(this.b);
        czcVar.b(this.a);
        return new dbk(czcVar);
    }

    public dgs(dcw dcwVar) {
        this.b = new czo(0L);
        this.a = dcwVar;
    }
}
