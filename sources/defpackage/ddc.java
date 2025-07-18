package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddc extends czr {
    final dag a;
    public ddu b;
    public dcw c;
    public cyw d;

    private ddc(dag dagVar) {
        this.a = dagVar;
        if (dagVar.b() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.b = ddu.a(dagVar.h(0));
        this.c = dcw.a(dagVar.h(1));
        this.d = cyw.i(dagVar.h(2));
    }

    public static ddc c(Object obj) {
        if (obj instanceof ddc) {
            return (ddc) obj;
        }
        if (obj != null) {
            return new ddc(dag.j(obj));
        }
        return null;
    }

    public final dcp a() {
        return this.b.e;
    }

    public final dcp b() {
        return this.b.h;
    }

    public final ddv d() {
        return this.b.g;
    }

    public final ddv e() {
        return this.b.f;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return this.a;
    }
}
