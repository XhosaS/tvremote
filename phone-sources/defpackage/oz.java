package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oz implements mv {
    public Object a;
    public Object b;
    private final pn c;
    private ne d;
    private ne e;
    private final ne f;
    private long g;
    private ne h;
    private final bhi i;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, yjv] */
    public oz(my myVar, bhi bhiVar, Object obj, Object obj2, ne neVar) {
        this.c = myVar.a(bhiVar);
        this.i = bhiVar;
        this.a = obj2;
        this.b = obj;
        this.d = (ne) bhiVar.a.a(obj);
        this.e = (ne) bhiVar.a.a(obj2);
        this.f = neVar != null ? hp.i(neVar) : ((ne) bhiVar.a.a(obj)).c();
        this.g = -1L;
    }

    @Override // defpackage.mv
    public final long a() {
        long j = this.g;
        if (j >= 0) {
            return j;
        }
        long jA = this.c.a(this.d, this.e, this.f);
        this.g = jA;
        return jA;
    }

    @Override // defpackage.mv
    public final ne b(long j) {
        if (!fh.j(this, j)) {
            return this.c.d(j, this.d, this.e, this.f);
        }
        ne neVar = this.h;
        if (neVar != null) {
            return neVar;
        }
        ne neVarB = this.c.b(this.d, this.e, this.f);
        this.h = neVarB;
        return neVarB;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, yjv] */
    @Override // defpackage.mv
    public final Object c(long j) {
        if (fh.j(this, j)) {
            return this.a;
        }
        ne neVarC = this.c.c(j, this.d, this.e, this.f);
        int iB = neVarC.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(neVarC.a(i))) {
                og.b("AnimationVector cannot contain a NaN. " + neVarC + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.i.b.a(neVarC);
    }

    @Override // defpackage.mv
    public final /* synthetic */ boolean d(long j) {
        return fh.j(this, j);
    }

    @Override // defpackage.mv
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.mv
    public final bhi g() {
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjv] */
    public final void h(Object obj) {
        if (yks.e(obj, this.b)) {
            return;
        }
        this.b = obj;
        this.d = (ne) this.i.a.a(obj);
        this.h = null;
        this.g = -1L;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjv] */
    public final void i(Object obj) {
        if (yks.e(this.a, obj)) {
            return;
        }
        this.a = obj;
        this.e = (ne) this.i.a.a(obj);
        this.h = null;
        this.g = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.b + " -> " + this.a + ",initial velocity: " + this.f + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.c;
    }

    public /* synthetic */ oz(my myVar, bhi bhiVar, Object obj, Object obj2) {
        this(myVar, bhiVar, obj, obj2, null);
    }

    @Override // defpackage.mv
    public final void f() {
    }
}
