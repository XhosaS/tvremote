package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkr extends aght {
    final aggz e;

    public agkr(agfs agfsVar, aggz aggzVar) {
        super(agfsVar);
        this.e = aggzVar;
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        try {
            Object objA = this.e.a(obj);
            aghn.b(objA, "The mapper function returned a null value.");
            this.a.c(objA);
        } catch (Throwable th) {
            e(th);
        }
    }

    @Override // defpackage.aghs
    public final Object ff() {
        Object objFf = this.c.ff();
        if (objFf == null) {
            return null;
        }
        Object objA = this.e.a(objFf);
        aghn.b(objA, "The mapper function returned a null value.");
        return objA;
    }

    @Override // defpackage.aghq
    public final int i() {
        return 0;
    }
}
