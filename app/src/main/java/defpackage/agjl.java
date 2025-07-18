package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjl extends agno {
    final aggz a;

    public agjl(aide aideVar, aggz aggzVar) {
        super(aideVar);
        this.a = aggzVar;
    }

    @Override // defpackage.aghs
    public final Object ff() {
        Object objFf = this.d.ff();
        if (objFf == null) {
            return null;
        }
        Object objA = this.a.a(objFf);
        aghn.b(objA, "The mapper function returned a null value.");
        return objA;
    }

    @Override // defpackage.aide
    public final void g(Object obj) {
        if (this.e) {
            return;
        }
        if (this.f != 0) {
            this.b.g(null);
            return;
        }
        try {
            Object objA = this.a.a(obj);
            aghn.b(objA, "The mapper function returned a null value.");
            this.b.g(objA);
        } catch (Throwable th) {
            aggq.a(th);
            this.c.fh();
            e(th);
        }
    }

    @Override // defpackage.aghq
    public final int i() {
        aghr aghrVar = this.d;
        if (aghrVar == null) {
            return 0;
        }
        int i = aghrVar.i();
        if (i == 0) {
            return i;
        }
        this.f = i;
        return i;
    }
}
