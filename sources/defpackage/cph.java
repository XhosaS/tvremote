package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cph implements cpm, cov {
    private static final Object a = new Object();
    private volatile cpm b;
    private volatile Object c = a;

    private cph(cpm cpmVar) {
        this.b = cpmVar;
    }

    public static cov b(cpm cpmVar) {
        if (cpmVar instanceof cov) {
            return (cov) cpmVar;
        }
        cpmVar.getClass();
        return new cph(cpmVar);
    }

    public static cpm c(cpm cpmVar) {
        return cpmVar instanceof cph ? cpmVar : new cph(cpmVar);
    }

    private final synchronized Object d() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        Object objA = this.b.a();
        Object obj3 = this.c;
        if (obj3 != obj2 && obj3 != objA) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
        }
        this.c = objA;
        this.b = null;
        return objA;
    }

    @Override // defpackage.crv, defpackage.cru
    public final Object a() {
        Object obj = this.c;
        return obj == a ? d() : obj;
    }
}
