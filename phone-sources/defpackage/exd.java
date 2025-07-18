package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exd implements evx, ezr {
    final dze b;
    boolean c;
    byte[] d;
    int e;
    public final eph f;
    private final eey g;
    private final eer h;
    private final efy i;
    private final exi j;
    private final sew l;
    private final ArrayList k = new ArrayList();
    final ezw a = new ezw("SingleSampleMediaPeriod");

    public exd(eey eeyVar, eer eerVar, efy efyVar, dze dzeVar, sew sewVar, eph ephVar) {
        this.g = eeyVar;
        this.h = eerVar;
        this.i = efyVar;
        this.b = dzeVar;
        this.l = sewVar;
        this.f = ephVar;
        this.j = new exi(new eba(dzeVar));
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long c() {
        return this.c ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long d() {
        return (this.c || this.a.h()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.ezr
    public final /* bridge */ /* synthetic */ void dn(ezt eztVar, long j, long j2, int i) {
        evq evqVar;
        exc excVar = (exc) eztVar;
        efw efwVar = excVar.c;
        if (i == 0) {
            long j3 = excVar.a;
            evqVar = new evq(excVar.b, j);
        } else {
            long j4 = excVar.a;
            evqVar = new evq(excVar.b, j, j2);
        }
        this.f.q(evqVar, 1, -1, this.b, 0, 0L, -9223372036854775807L, i);
    }

    @Override // defpackage.ezr
    /* renamed from: do */
    public final /* bridge */ /* synthetic */ aacv mo349do(ezt eztVar, long j, long j2, IOException iOException, int i) {
        aacv aacvVar;
        exc excVar = (exc) eztVar;
        efw efwVar = excVar.c;
        long j3 = excVar.a;
        evq evqVar = new evq(excVar.b, j, j2);
        String str = edt.a;
        long jI = sew.i(new zuw(iOException, i));
        if (jI == -9223372036854775807L || i >= this.l.h(1)) {
            edb.f("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.c = true;
            aacvVar = ezw.e;
        } else {
            aacvVar = new aacv(0, jI);
        }
        this.f.p(evqVar, 1, -1, this.b, 0, 0L, -9223372036854775807L, iOException, !aacvVar.c());
        return aacvVar;
    }

    @Override // defpackage.ezr
    public final /* bridge */ /* synthetic */ void ds(ezt eztVar, long j, long j2, boolean z) {
        exc excVar = (exc) eztVar;
        efw efwVar = excVar.c;
        long j3 = excVar.a;
        this.f.n(new evq(excVar.b, j, j2), 1, -1, null, 0, 0L, -9223372036854775807L);
    }

    @Override // defpackage.ezr
    public final /* bridge */ /* synthetic */ void du(ezt eztVar, long j, long j2) {
        exc excVar = (exc) eztVar;
        this.e = (int) excVar.c.a;
        byte[] bArr = excVar.d;
        bArr.getClass();
        this.d = bArr;
        this.c = true;
        long j3 = excVar.a;
        this.f.o(new evq(excVar.b, j, j2), 1, -1, this.b, 0, 0L, -9223372036854775807L);
    }

    @Override // defpackage.evx
    public final long e() {
        return -9223372036854775807L;
    }

    @Override // defpackage.evx
    public final long f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return j;
            }
            exb exbVar = (exb) arrayList.get(i);
            if (exbVar.a == 2) {
                exbVar.a = 1;
            }
            i++;
        }
    }

    @Override // defpackage.evx
    public final long g(ezf[] ezfVarArr, boolean[] zArr, ewx[] ewxVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < ezfVarArr.length; i++) {
            ewx ewxVar = ewxVarArr[i];
            if (ewxVar != null && (ezfVarArr[i] == null || !zArr[i])) {
                this.k.remove(ewxVar);
                ewxVar = null;
                ewxVarArr[i] = null;
            }
            if (ewxVar == null && ezfVarArr[i] != null) {
                exb exbVar = new exb(this);
                this.k.add(exbVar);
                ewxVarArr[i] = exbVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.evx
    public final exi h() {
        return this.j;
    }

    @Override // defpackage.evx
    public final /* synthetic */ List i(List list) {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.evx
    public final void l(evw evwVar, long j) {
        evwVar.dp(this);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean n(eji ejiVar) {
        if (this.c) {
            return false;
        }
        ezw ezwVar = this.a;
        if (ezwVar.h() || ezwVar.g()) {
            return false;
        }
        eer eerVar = this.h;
        efy efyVar = this.i;
        efa efaVarA = ((eez) eerVar).a();
        if (efyVar != null) {
            efaVarA.f(efyVar);
        }
        ezwVar.i(new exc(this.g, efaVarA), this, this.l.h(1));
        return true;
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean o() {
        return this.a.h();
    }

    @Override // defpackage.evx
    public final void dr() {
    }

    @Override // defpackage.evx
    public final void dt(long j) {
    }

    @Override // defpackage.evx, defpackage.ewz
    public final void m(long j) {
    }

    @Override // defpackage.evx
    public final long a(long j, ekj ekjVar) {
        return j;
    }
}
