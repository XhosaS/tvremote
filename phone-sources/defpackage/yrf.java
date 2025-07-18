package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrf extends yot {
    public static final /* synthetic */ int a = 0;

    static {
        new yrf();
    }

    private yrf() {
    }

    @Override // defpackage.yot
    public final void a(yil yilVar, Runnable runnable) {
        yrj yrjVar = (yrj) yilVar.get(yrj.b);
        if (yrjVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        yrjVar.a = true;
    }

    @Override // defpackage.yot
    public final boolean cF(yil yilVar) {
        return false;
    }

    @Override // defpackage.yot
    public final yot g(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.yot
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
