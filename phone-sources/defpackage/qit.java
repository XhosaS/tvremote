package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qit implements xcm {
    private final xcq a;
    private final xcq b;
    private final /* synthetic */ int c;

    public qit(xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    public final Boolean a() {
        boolean z = false;
        if (this.c != 0) {
            return (Boolean) ((tst) ((xcn) this.b).a).e((Boolean) ((tst) ((xcn) this.a).a).e(false));
        }
        Context contextA = ((rgq) this.a).a();
        qps qpsVar = new qps();
        qei qeiVar = (qei) this.b.b();
        qeiVar.getClass();
        qpsVar.a(contextA);
        if (xgg.a.get().c() && qeiVar.k) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        return this.c != 0 ? a() : a();
    }

    public qit(xcq xcqVar, xcq xcqVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = xcqVar;
        this.a = xcqVar2;
    }
}
