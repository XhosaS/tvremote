package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbt extends rbn implements quz, rbi {
    private static final Callable a = new Callable() { // from class: rbs
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }
    };
    private final rbr b;
    private final rcc c;

    public rbt(rbr rbrVar, yqt yqtVar) {
        this.b = rbrVar;
        this.c = (rcc) ((agow) yqtVar.c()).a();
    }

    @Override // defpackage.rbi
    public final zyd a(qpi qpiVar, long j, long j2, ahqu ahquVar) {
        return this.b.a(qpiVar, j, j2, ahquVar);
    }

    @Override // defpackage.rbn
    public final synchronized rbm b(qpi qpiVar) {
        rbm rbmVarB;
        rbmVarB = this.b.b(qpiVar);
        if (!rbm.a(rbmVarB) && rbmVarB.d) {
            this.c.b();
        }
        return rbmVarB;
    }

    @Override // defpackage.rbn
    public final rbm c(qpi qpiVar) {
        rbm rbmVarC = this.b.c(qpiVar);
        if (!rbm.a(rbmVarC)) {
            if (this.c.d(qpiVar.a)) {
                rbmVarC.d = true;
            }
        }
        return rbmVarC;
    }

    @Override // defpackage.rbn
    public final zyd d(qpi qpiVar, qpi qpiVar2, ahqu ahquVar, rbl rblVar) {
        zyd zydVarA;
        rbr rbrVar = this.b;
        ConcurrentHashMap concurrentHashMap = rbrVar.c;
        String str = qpiVar.a;
        rbm rbmVar = (rbm) concurrentHashMap.get(str);
        zyd[] zydVarArr = new zyd[2];
        zydVarArr[0] = rbrVar.d(qpiVar, qpiVar2, ahquVar, rblVar);
        String strB = qpi.b(qpiVar2);
        if (rbmVar == null || rbm.a(rbmVar)) {
            zydVarA = zxy.a;
        } else if (rbmVar.d) {
            zydVarA = this.c.a(str, strB);
        } else {
            rcc rccVar = this.c;
            qve qveVar = rbmVar.b;
            rccVar.c(str, ((quj) qveVar.a).a, qveVar.a());
            zydVarA = zxy.a;
        }
        zydVarArr[1] = zydVarA;
        return zxn.d(zydVarArr).a(a, zwk.a);
    }

    @Override // defpackage.quz
    public final /* synthetic */ void k() {
    }
}
