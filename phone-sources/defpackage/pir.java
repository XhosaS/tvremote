package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pir implements xcm {
    private final xcq a;

    public pir(xcq xcqVar) {
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pim b() {
        ntp ntpVar = (ntp) this.a.b();
        ntpVar.getClass();
        return (pim) ((AtomicReference) ntpVar.a).get();
    }
}
