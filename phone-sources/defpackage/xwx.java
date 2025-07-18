package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class xwx extends xsx {
    public final xsx a;

    public xwx(xsx xsxVar) {
        this.a = xsxVar;
    }

    @Override // defpackage.xsx
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.xsx
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.xsx
    public void c() {
        throw null;
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("delegate", this.a);
        return tssVarH.toString();
    }
}
