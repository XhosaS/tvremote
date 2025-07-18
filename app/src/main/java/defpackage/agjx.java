package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjx extends aght {
    final aggw e;
    Object f;
    boolean g;

    public agjx(agfs agfsVar, aggw aggwVar) {
        super(agfsVar);
        this.e = aggwVar;
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        try {
            if (this.g) {
                boolean zA = this.e.a(this.f, obj);
                this.f = obj;
                if (zA) {
                    return;
                }
            } else {
                this.g = true;
                this.f = obj;
            }
            this.a.c(obj);
        } catch (Throwable th) {
            e(th);
        }
    }

    @Override // defpackage.aghs
    public final Object ff() {
        Object objFf;
        boolean zA;
        do {
            objFf = this.c.ff();
            if (objFf == null) {
                return null;
            }
            if (!this.g) {
                this.g = true;
                this.f = objFf;
                return objFf;
            }
            zA = this.e.a(this.f, objFf);
            this.f = objFf;
        } while (zA);
        return objFf;
    }

    @Override // defpackage.aghq
    public final int i() {
        return 0;
    }
}
