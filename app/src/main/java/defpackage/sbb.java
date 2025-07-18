package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbb {
    private final sbm a;
    private final say b;

    public sbb(sbm sbmVar, say sayVar) {
        sayVar.getClass();
        this.a = sbmVar;
        this.b = sayVar;
    }

    public final sax a(ruo ruoVar, List list) {
        ruoVar.getClass();
        list.getClass();
        agow agowVar = this.b.a;
        int iA = sjx.a(ruoVar);
        smw smwVar = (smw) agowVar.a();
        smwVar.getClass();
        return new sax(iA, list, smwVar);
    }

    public final sbl b(ruo ruoVar, yqt yqtVar, List list) {
        ruoVar.getClass();
        list.getClass();
        int iC = szr.c(ruoVar);
        int iA = sjx.a(ruoVar);
        int i = iA % iC == 0 ? iA / iC : (iA / iC) + 1;
        sbm sbmVar = this.a;
        Executor executor = (Executor) sbmVar.a.a();
        executor.getClass();
        smw smwVar = (smw) sbmVar.b.a();
        smwVar.getClass();
        sca scaVar = (sca) sbmVar.c.a();
        scaVar.getClass();
        return new sbl(ruoVar, i, iC, yqtVar, list, executor, smwVar, scaVar);
    }

    public final tae c(ruo ruoVar, List list) {
        return ruoVar.l ? b(ruoVar, ypv.a, list) : a(ruoVar, list);
    }
}
