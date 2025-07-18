package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bcw {
    public static final Object a = new Object();
    final Object b;
    public final vr c;
    public int d;
    public boolean e;
    public volatile Object f;
    volatile Object g;
    public int h;
    public final Runnable i;
    private boolean j;
    private boolean k;

    public bcw() {
        this.b = new Object();
        this.c = new vr();
        this.d = 0;
        Object obj = a;
        this.g = obj;
        this.i = new bcs(this);
        this.f = obj;
        this.h = -1;
    }

    public static void a(String str) {
        if (!vg.a().b.b()) {
            throw new IllegalStateException(a.e(str, "Cannot invoke ", " on a background thread"));
        }
    }

    private final void h(bcv bcvVar) {
        if (bcvVar.d) {
            if (!bcvVar.ct()) {
                bcvVar.d(false);
                return;
            }
            int i = bcvVar.e;
            int i2 = this.h;
            if (i < i2) {
                bcvVar.e = i2;
                bcvVar.c.a(this.f);
            }
        }
    }

    final void b(bcv bcvVar) {
        if (this.j) {
            this.k = true;
            return;
        }
        this.j = true;
        while (true) {
            this.k = false;
            if (bcvVar != null) {
                h(bcvVar);
            } else {
                vo voVarD = this.c.d();
                while (voVarD.hasNext()) {
                    h((bcv) ((vn) voVarD.next()).b);
                    if (this.k) {
                        break;
                    }
                }
            }
            if (!this.k) {
                this.j = false;
                return;
            }
            bcvVar = null;
        }
    }

    public void c(bcl bclVar, bcy bcyVar) {
        a("observe");
        if (bclVar.ek().a() == bcf.a) {
            return;
        }
        bcu bcuVar = new bcu(this, bclVar, bcyVar);
        bcv bcvVar = (bcv) this.c.e(bcyVar, bcuVar);
        if (bcvVar != null && !bcvVar.c(bclVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (bcvVar != null) {
            return;
        }
        bclVar.ek().b(bcuVar);
    }

    public void f(bcy bcyVar) {
        a("removeObserver");
        bcv bcvVar = (bcv) this.c.b(bcyVar);
        if (bcvVar == null) {
            return;
        }
        bcvVar.b();
        bcvVar.d(false);
    }

    protected void g(Object obj) {
        throw null;
    }

    public bcw(Object obj) {
        this.b = new Object();
        this.c = new vr();
        this.d = 0;
        this.g = a;
        this.i = new bcs(this);
        this.f = obj;
        this.h = 0;
    }

    protected void d() {
    }

    protected void e() {
    }
}
