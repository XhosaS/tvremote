package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xck implements xcm {
    private xcq a;

    public static void a(xck xckVar, xcq xcqVar) {
        if (xckVar.a != null) {
            throw new IllegalStateException();
        }
        xckVar.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final Object b() {
        xcq xcqVar = this.a;
        if (xcqVar != null) {
            return xcqVar.b();
        }
        throw new IllegalStateException();
    }
}
