package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aheq extends ahbm {
    public static final /* synthetic */ int a = 0;

    static {
        new aheq();
    }

    private aheq() {
    }

    @Override // defpackage.ahbm
    public final void a(agte agteVar, Runnable runnable) {
        ahev ahevVar = (ahev) agteVar.get(ahev.a);
        if (ahevVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        ahevVar.b = true;
    }

    @Override // defpackage.ahbm
    public final boolean b(agte agteVar) {
        return false;
    }

    @Override // defpackage.ahbm
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
