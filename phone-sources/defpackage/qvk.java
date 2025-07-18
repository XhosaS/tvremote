package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvk implements duv {
    public static final String a = "qvk";
    public final qvn b;
    private final rjq c;
    private final rjp d;
    private final zft e;

    public qvk(qvn qvnVar, zft zftVar, rjq rjqVar) {
        qvnVar.getClass();
        this.b = qvnVar;
        this.e = zftVar;
        this.c = rjqVar;
        this.d = new rjp() { // from class: qvi
            @Override // defpackage.rjp
            public final void a() {
                this.a.b();
            }
        };
    }

    public final void a() {
        this.c.d(this.d);
    }

    public final void b() {
        uhi uhiVarV = uhi.v(this.c.a());
        prn prnVar = new prn(10);
        ugk ugkVar = ugk.a;
        sfy.K(ufn.j(ufn.i(ues.i(uhiVarV, Exception.class, prnVar, ugkVar), new prn(11), ugkVar), new pbb(this.e, 12), ugkVar), new qvj(this, 0), ugkVar);
    }

    @Override // defpackage.duv
    public final void f(dvk dvkVar) {
        this.c.c(this.d);
        b();
    }

    @Override // defpackage.duv
    public final void l() {
        a();
    }

    @Override // defpackage.duv
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void e(dvk dvkVar) {
    }
}
