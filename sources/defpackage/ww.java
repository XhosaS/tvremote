package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ww implements xd {
    private final wv a;
    private final xd b;

    public ww(wv wvVar, xd xdVar) {
        this.a = wvVar;
        this.b = xdVar;
    }

    @Override // defpackage.xd
    public final void a(xf xfVar, xa xaVar) {
        switch (xaVar.ordinal()) {
            case 0:
                this.a.a();
                break;
            case 1:
                this.a.e();
                break;
            case 2:
                this.a.d();
                break;
            case 3:
                this.a.c();
                break;
            case 4:
                this.a.f();
                break;
            case 5:
                this.a.b();
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new crz();
        }
        xd xdVar = this.b;
        if (xdVar != null) {
            xdVar.a(xfVar, xaVar);
        }
    }
}
