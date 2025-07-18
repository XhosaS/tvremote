package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyt implements iys, pim {
    private final ntp a;

    public iyt(ntp ntpVar) {
        ntpVar.getClass();
        this.a = ntpVar;
    }

    @Override // defpackage.iys
    public final void a(pim pimVar) {
        ((AtomicReference) this.a.a).set(pimVar);
    }

    @Override // defpackage.iys
    public final void b() {
        ((AtomicReference) this.a.a).set(null);
    }

    @Override // defpackage.pim
    public final /* synthetic */ uhp d(String str) {
        return rdd.ae(str);
    }

    @Override // defpackage.pim
    public final /* synthetic */ by dR() {
        return null;
    }

    @Override // defpackage.pim
    public final /* synthetic */ rzg dU(pil pilVar) {
        return null;
    }
}
