package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afvz extends afhk {
    final /* synthetic */ afwb a;
    private final afwb b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public afvz(afwb afwbVar, afwb afwbVar2) {
        this.a = afwbVar;
        this.b = afwbVar2;
    }

    @Override // defpackage.afhk
    public final afhg a(afhh afhhVar) {
        if (this.c.compareAndSet(false, true)) {
            afwb afwbVar = this.a;
            final afwb afwbVar2 = this.b;
            afkc afkcVarB = afwbVar.g.b();
            afkcVarB.c(new Runnable() { // from class: afvy
                @Override // java.lang.Runnable
                public final void run() {
                    afwbVar2.c();
                }
            });
            afkcVarB.b();
        }
        return afhg.a;
    }
}
