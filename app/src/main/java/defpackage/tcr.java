package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcr implements aejg {
    public static wnw b(final tcl tclVar, final yzq yzqVar) {
        abwf abwfVar = acbg.a;
        abwf abwfVar2 = abwf.a;
        abwe abweVar = new abwe();
        long jB = ztc.b(2L, 3600L);
        if ((abweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar.y();
        }
        ((abwf) abweVar.b).b = jB;
        if ((abweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar.y();
        }
        ((abwf) abweVar.b).c = 0;
        abwf abwfVar3 = (abwf) abweVar.v();
        wnq wnqVar = new wnq();
        wnqVar.a = wns.ON_NETWORK_UNMETERED;
        abwf abwfVar4 = tcl.a;
        wnqVar.b(acbg.a(abwfVar4), TimeUnit.HOURS);
        wnr wnrVarA = wnqVar.a();
        wnq wnqVar2 = new wnq();
        wnqVar2.a = wns.ON_CHARGER;
        wnqVar2.b(acbg.a(abwfVar4), TimeUnit.HOURS);
        wnr wnrVarA2 = wnqVar2.a();
        wnq wnqVar3 = new wnq();
        wnqVar3.a = wns.ON_NETWORK_CONNECTED;
        yzq yzqVarR = yzq.r(wnrVarA, wnrVarA2, wnqVar3.a());
        wnw wnwVar = wnw.a;
        agow agowVar = new agow() { // from class: tck
            @Override // defpackage.agow
            public final Object a() {
                tcl tclVar2 = tclVar;
                tcm tcmVar = tclVar2.b;
                tcg tcgVar = (tcg) tcmVar.a.a();
                tcgVar.getClass();
                ExecutorService executorService = (ExecutorService) tcmVar.b.a();
                executorService.getClass();
                return new tcj(yzqVar, tcgVar, executorService, tclVar2.c);
            }
        };
        wno wnoVar = new wno();
        wnoVar.c(acbg.a(abwfVar3), TimeUnit.HOURS);
        wny wnyVar = tclVar.d;
        wnoVar.d(wnyVar.c ? wnyVar.a("internalCoreCorporaSync") : 1.0d);
        zdl it = yzqVarR.iterator();
        while (it.hasNext()) {
            wnoVar.b((wnr) it.next());
        }
        return wnv.a(wnoVar.a(), agowVar);
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
