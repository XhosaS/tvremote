package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdd implements mcw {
    public final ltt a;
    public final kwy b;
    public final kuw c;
    private final ldv d;
    private final Executor e;

    public mdd(kuw kuwVar, ldv ldvVar, ltt lttVar, Executor executor, kwy kwyVar) {
        kuwVar.getClass();
        ldvVar.getClass();
        lttVar.getClass();
        kwyVar.getClass();
        this.c = kuwVar;
        this.d = ldvVar;
        this.a = lttVar;
        this.e = executor;
        this.b = kwyVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lor] */
    @Override // defpackage.mcw
    public final void a(idy idyVar) {
        kuw kuwVar = this.c;
        List listAn = yfm.an(kuwVar.a.g(4));
        Account[] accountArrU = this.d.u();
        accountArrU.getClass();
        for (Account account : accountArrU) {
            listAn.remove(account.name);
        }
        if (listAn.isEmpty()) {
            return;
        }
        Iterator it = listAn.iterator();
        while (it.hasNext()) {
            ((mdw) kuwVar.b).d((String) it.next());
        }
        idyVar.c(kvk.b);
    }

    @Override // defpackage.mcw
    public final void b(ksn ksnVar, idy idyVar, mfm mfmVar) {
        mfmVar.getClass();
        if (mfm.b(mfmVar)) {
            return;
        }
        g(ksnVar, idyVar);
    }

    @Override // defpackage.mfk
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void g(ksn ksnVar, idy idyVar) {
        ksnVar.getClass();
        let letVarC = this.b.c(new les(ksnVar.a));
        luk lukVar = new luk(ksnVar, (String) (letVarC != null ? letVarC.a : ""));
        this.e.execute(new fnc(this, lukVar, lukVar.b, ksnVar, idyVar, 2));
    }
}
