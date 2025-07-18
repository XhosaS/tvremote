package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcs implements aejg {
    public static wnw b(agow agowVar, boolean z, wny wnyVar) {
        if (!z) {
            return wnw.a;
        }
        wnw wnwVar = wnw.a;
        wno wnoVar = new wno();
        wnoVar.c(12L, TimeUnit.HOURS);
        wnq wnqVar = new wnq();
        wnqVar.a = wns.ON_CHARGER;
        wnqVar.b(12L, TimeUnit.HOURS);
        wnoVar.b(wnqVar.a());
        wnoVar.d(wnyVar.c ? wnyVar.a("gellerInternalCleanup") : 1.0d);
        return wnv.a(wnoVar.a(), agowVar);
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
