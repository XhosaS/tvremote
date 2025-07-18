package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afwg extends afhk {
    public final afhj a;
    final /* synthetic */ afwh b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public afwg(afwh afwhVar, afhj afhjVar) {
        this.b = afwhVar;
        this.a = afhjVar;
    }

    @Override // defpackage.afhk
    public final afhg a(afhh afhhVar) {
        if (this.c.compareAndSet(false, true)) {
            afkc afkcVarB = this.b.f.b();
            afkcVarB.c(new afwf(this));
            afkcVarB.b();
        }
        return afhg.a;
    }
}
