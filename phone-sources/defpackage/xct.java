package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xct implements xcq {
    private static final Object a = new Object();
    private volatile xcq b;
    private volatile Object c = a;

    private xct(xcq xcqVar) {
        this.b = xcqVar;
    }

    public static xcq a(xcq xcqVar) {
        if ((xcqVar instanceof xct) || (xcqVar instanceof xcl)) {
            return xcqVar;
        }
        xcqVar.getClass();
        return new xct(xcqVar);
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final Object b() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        xcq xcqVar = this.b;
        if (xcqVar == null) {
            return this.c;
        }
        Object objB = xcqVar.b();
        this.c = objB;
        this.b = null;
        return objB;
    }
}
