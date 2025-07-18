package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqi implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public kqi(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    public static idf c(lxp lxpVar) {
        return lxpVar.c(kst.class);
    }

    public final idf a() {
        int i = this.b;
        if (i == 0) {
            lys lysVar = (lys) this.a.b();
            lysVar.getClass();
            return new jxt(lysVar, 4);
        }
        if (i == 1) {
            return ((lhj) this.a).b();
        }
        if (i == 2) {
            return c((lxp) this.a.b());
        }
        if (i == 3) {
            return ((lxp) this.a.b()).e(kst.class);
        }
        if (i == 4) {
            return ((kdh) this.a.b()).k(kvf.class);
        }
        if (i == 5) {
            return ((kdh) this.a.b()).k(kwn.class);
        }
        lys lysVar2 = (lys) this.a.b();
        lysVar2.getClass();
        return new lxt(lysVar2, 9);
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? a() : a() : a() : a() : a() : a() : a();
    }
}
