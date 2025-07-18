package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpp implements cpm {
    private static final Object a = new Object();
    private volatile cpm b;
    private volatile Object c = a;

    private cpp(cpm cpmVar) {
        this.b = cpmVar;
    }

    public static cpm b(cpm cpmVar) {
        return ((cpmVar instanceof cpp) || (cpmVar instanceof cph)) ? cpmVar : new cpp(cpmVar);
    }

    @Override // defpackage.crv, defpackage.cru
    public final Object a() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        cpm cpmVar = this.b;
        if (cpmVar == null) {
            return this.c;
        }
        Object objA = cpmVar.a();
        this.c = objA;
        this.b = null;
        return objA;
    }
}
