package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mr {
    public final mz a;
    public final bcb b;
    public final ne c;
    public final ne d;
    public ne e;
    public ne f;
    public final bhi g;
    private final Object h;
    private final bcb i;
    private final os j;
    private final bhi k;

    public mr(Object obj, bhi bhiVar, Object obj2) {
        this.g = bhiVar;
        this.h = obj2;
        this.a = new mz(bhiVar, obj, null, 60);
        bcz bczVar = bcz.c;
        this.b = new bci(false, bczVar);
        this.i = new bci(obj, bczVar);
        this.k = new bhi((int[]) null);
        this.j = new os(obj2, 3);
        ne neVarA = a();
        ne neVar = neVarA instanceof na ? ms.e : neVarA instanceof nb ? ms.f : neVarA instanceof nc ? ms.g : ms.h;
        this.c = neVar;
        ne neVarA2 = a();
        ne neVar2 = neVarA2 instanceof na ? ms.a : neVarA2 instanceof nb ? ms.b : neVarA2 instanceof nc ? ms.c : ms.d;
        this.d = neVar2;
        this.e = neVar;
        this.f = neVar2;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, yjv] */
    public static /* synthetic */ Object j(mr mrVar, Object obj, my myVar, yjv yjvVar, yih yihVar, int i) {
        if ((i & 2) != 0) {
            myVar = mrVar.j;
        }
        my myVar2 = myVar;
        Object objA = (i & 4) != 0 ? mrVar.g.b.a(mrVar.a()) : null;
        yjv yjvVar2 = (i & 8) != 0 ? null : yjvVar;
        Object objD = mrVar.d();
        bhi bhiVar = mrVar.g;
        return yoz.k(new rx(oe.a, mrVar.k, new mq(mrVar, objA, new oz(myVar2, bhiVar, objD, obj, (ne) bhiVar.a.a(objA)), mrVar.a.b, yjvVar2, null), (yih) null, 1), yihVar);
    }

    public final ne a() {
        return this.a.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, yjv] */
    public final Object b(Object obj) {
        if (yks.e(this.e, this.c) && yks.e(this.f, this.d)) {
            return obj;
        }
        bhi bhiVar = this.g;
        ne neVar = (ne) bhiVar.a.a(obj);
        int iB = neVar.b();
        boolean z = false;
        for (int i = 0; i < iB; i++) {
            if (neVar.a(i) < this.e.a(i) || neVar.a(i) > this.f.a(i)) {
                neVar.e(i, ykn.i(neVar.a(i), this.e.a(i), this.f.a(i)));
                z = true;
            }
        }
        return z ? bhiVar.b.a(neVar) : obj;
    }

    public final Object c() {
        return this.i.a();
    }

    public final Object d() {
        return this.a.a();
    }

    public final Object e(Object obj, yih yihVar) {
        Object objK = yoz.k(new rx(oe.a, this.k, new dsw(this, obj, (yih) null, 1), (yih) null, 1), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    public final Object f(yih yihVar) {
        Object objK = yoz.k(new rx(oe.a, this.k, new ajh(this, (yih) null, 1), (yih) null, 1), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    public final void g() {
        mz mzVar = this.a;
        mzVar.a.d();
        mzVar.b = Long.MIN_VALUE;
        h(false);
    }

    public final void h(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    public final void i(Object obj) {
        this.i.b(obj);
    }

    public /* synthetic */ mr(Object obj, bhi bhiVar, Object obj2, int i) {
        this(obj, bhiVar, (i & 4) != 0 ? null : obj2);
    }
}
