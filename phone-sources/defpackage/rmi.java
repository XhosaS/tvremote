package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmi implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public rmi(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                rqq rqqVar = (rqq) rrx.N((tst) ((xcn) this.a).a, new pep(15));
                rqqVar.getClass();
                return rqqVar;
            case 1:
                rql rqlVar = (rql) rrx.N((tst) ((xcn) this.a).a, new pep(6));
                rqlVar.getClass();
                return rqlVar;
            case 2:
                rrq rrqVar = (rrq) rrx.N((tst) ((xcn) this.a).a, new pep(7));
                rrqVar.getClass();
                return rrqVar;
            case 3:
                tst tstVar = (tst) ((xcn) this.a).a;
                return tstVar.g() ? tst.h((rpv) ((yfo) tstVar.c()).b()) : trk.a;
            case 4:
                rsf rsfVar = (rsf) rrx.N((tst) ((xcn) this.a).a, new pep(9));
                rsfVar.getClass();
                return rsfVar;
            case 5:
                ruc rucVar = (ruc) rrx.N((tst) ((xcn) this.a).a, new pep(10));
                rucVar.getClass();
                return rucVar;
            case 6:
                return (rnd) ((tst) ((xcn) this.a).a).e(rnd.a().a());
            case 7:
                ruu ruuVar = (ruu) rrx.N((tst) ((xcn) this.a).a, new pep(16));
                ruuVar.getClass();
                return ruuVar;
            case 8:
                ruk rukVar = (ruk) rrx.N((tst) ((xcn) this.a).a, new pep(12));
                rukVar.getClass();
                return rukVar;
            case 9:
                ruw ruwVar = (ruw) rrx.N((tst) ((xcn) this.a).a, new pep(14));
                ruwVar.getClass();
                return ruwVar;
            case 10:
                return new rqb((Context) ((xcn) this.a).a);
            case 11:
                return new Random(SystemClock.elapsedRealtime());
            case 12:
                return (osk) ((tst) ((xcn) this.a).a).e(new osk());
            case 13:
                return new rmv();
            case 14:
                Set set = (Set) ((ttm) ((xcn) this.a).a).get();
                set.getClass();
                return set;
            case 15:
                rsq rsqVar = (rsq) ((yfo) ((tst) ((xcn) this.a).a).e(new pep(17))).b();
                rsqVar.getClass();
                return rsqVar;
            case 16:
                return Boolean.valueOf(xoa.a.get().f((Context) ((xcn) this.a).a));
            case 17:
                return xoa.a.get().e((Context) ((xcn) this.a).a);
            case 18:
                return Boolean.valueOf(xoy.a.get().a((Context) ((xcn) this.a).a));
            case 19:
                return Boolean.valueOf(xoy.a.get().b((Context) ((xcn) this.a).a));
            default:
                return Boolean.valueOf(xoy.a.get().c((Context) ((xcn) this.a).a));
        }
    }
}
