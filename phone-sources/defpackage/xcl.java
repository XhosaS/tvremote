package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcl implements xcq, xbw {
    private static final Object a = new Object();
    private volatile xcq b;
    private volatile Object c = a;

    private xcl(xcq xcqVar) {
        this.b = xcqVar;
    }

    public static xbw a(xcq xcqVar) {
        if (xcqVar instanceof xbw) {
            return (xbw) xcqVar;
        }
        xcqVar.getClass();
        return new xcl(xcqVar);
    }

    public static xcq c(xcq xcqVar) {
        xcqVar.getClass();
        return xcqVar instanceof xcl ? xcqVar : new xcl(xcqVar);
    }

    private final synchronized Object d() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        Object objB = this.b.b();
        Object obj3 = this.c;
        if (obj3 != obj2 && obj3 != objB) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objB + ". This is likely due to a circular dependency.");
        }
        this.c = objB;
        this.b = null;
        return objB;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final Object b() {
        Object obj = this.c;
        return obj == a ? d() : obj;
    }
}
