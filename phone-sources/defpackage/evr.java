package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evr implements evx, evw {
    public final evz a;
    public final long b;
    public ewb c;
    public evx d;
    public long e = -9223372036854775807L;
    private evw f;
    private final ezp g;

    public evr(evz evzVar, ezp ezpVar, long j) {
        this.a = evzVar;
        this.g = ezpVar;
        this.b = j;
    }

    private final long q(long j) {
        long j2 = this.e;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // defpackage.evx
    public final long a(long j, ekj ekjVar) {
        evx evxVar = this.d;
        String str = edt.a;
        return evxVar.a(j, ekjVar);
    }

    @Override // defpackage.ewy
    public final /* bridge */ /* synthetic */ void b(ewz ewzVar) {
        evw evwVar = this.f;
        String str = edt.a;
        evwVar.b(this);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long c() {
        evx evxVar = this.d;
        String str = edt.a;
        return evxVar.c();
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long d() {
        evx evxVar = this.d;
        String str = edt.a;
        return evxVar.d();
    }

    @Override // defpackage.evw
    public final void dp(evx evxVar) {
        evw evwVar = this.f;
        String str = edt.a;
        evwVar.dp(this);
    }

    @Override // defpackage.evx
    public final void dr() {
        evx evxVar = this.d;
        if (evxVar != null) {
            evxVar.dr();
            return;
        }
        ewb ewbVar = this.c;
        if (ewbVar != null) {
            ewbVar.c();
        }
    }

    @Override // defpackage.evx
    public final void dt(long j) {
        evx evxVar = this.d;
        String str = edt.a;
        evxVar.dt(j);
    }

    @Override // defpackage.evx
    public final long e() {
        evx evxVar = this.d;
        String str = edt.a;
        return evxVar.e();
    }

    @Override // defpackage.evx
    public final long f(long j) {
        evx evxVar = this.d;
        String str = edt.a;
        return evxVar.f(j);
    }

    @Override // defpackage.evx
    public final long g(ezf[] ezfVarArr, boolean[] zArr, ewx[] ewxVarArr, boolean[] zArr2, long j) {
        long j2 = this.e;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.e = -9223372036854775807L;
        evx evxVar = this.d;
        String str = edt.a;
        return evxVar.g(ezfVarArr, zArr, ewxVarArr, zArr2, j3);
    }

    @Override // defpackage.evx
    public final exi h() {
        evx evxVar = this.d;
        String str = edt.a;
        return evxVar.h();
    }

    @Override // defpackage.evx
    public final /* synthetic */ List i(List list) {
        return Collections.EMPTY_LIST;
    }

    public final void k(evz evzVar) {
        long jQ = q(this.b);
        ewb ewbVar = this.c;
        ewbVar.getClass();
        evx evxVarP = ewbVar.p(evzVar, this.g, jQ);
        this.d = evxVarP;
        if (this.f != null) {
            evxVarP.l(this, jQ);
        }
    }

    @Override // defpackage.evx
    public final void l(evw evwVar, long j) {
        this.f = evwVar;
        evx evxVar = this.d;
        if (evxVar != null) {
            evxVar.l(this, q(this.b));
        }
    }

    @Override // defpackage.evx, defpackage.ewz
    public final void m(long j) {
        evx evxVar = this.d;
        String str = edt.a;
        evxVar.m(j);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean n(eji ejiVar) {
        evx evxVar = this.d;
        return evxVar != null && evxVar.n(ejiVar);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean o() {
        evx evxVar = this.d;
        return evxVar != null && evxVar.o();
    }
}
