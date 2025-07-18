package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bia implements bda {
    public bii a;
    public bie b;
    public String c;
    public Object d;
    public Object[] e;
    public gmz f;
    private final yjk g = new awa(this, 13);

    public bia(bii biiVar, bie bieVar, String str, Object obj, Object[] objArr) {
        this.a = biiVar;
        this.b = bieVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    @Override // defpackage.bda
    public final void cb() {
        d();
    }

    public final void d() {
        String strN;
        bie bieVar = this.b;
        if (this.f != null) {
            throw new IllegalArgumentException("entry(" + this.f + ") is not null");
        }
        if (bieVar != null) {
            yjk yjkVar = this.g;
            Object objA = yjkVar.a();
            if (objA == null || bieVar.e(objA)) {
                this.f = bieVar.f(this.c, yjkVar);
                return;
            }
            if (objA instanceof bjc) {
                bjc bjcVar = (bjc) objA;
                if (bjcVar.f() == bcz.b || bjcVar.f() == bcz.c || bjcVar.f() == bcz.a) {
                    strN = "MutableState containing " + bjcVar.a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strN = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strN = bga.n(objA);
            }
            throw new IllegalArgumentException(strN);
        }
    }

    @Override // defpackage.bda
    public final void dI() {
        gmz gmzVar = this.f;
        if (gmzVar != null) {
            gmzVar.b();
        }
    }

    @Override // defpackage.bda
    public final void dJ() {
        gmz gmzVar = this.f;
        if (gmzVar != null) {
            gmzVar.b();
        }
    }
}
