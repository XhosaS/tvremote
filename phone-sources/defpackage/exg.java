package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exg implements evx, evw {
    public final evx a;
    private final long b;
    private evw c;

    public exg(evx evxVar, long j) {
        this.a = evxVar;
        this.b = j;
    }

    @Override // defpackage.evx
    public final long a(long j, ekj ekjVar) {
        long j2 = this.b;
        return this.a.a(j - j2, ekjVar) + j2;
    }

    @Override // defpackage.ewy
    public final /* bridge */ /* synthetic */ void b(ewz ewzVar) {
        evw evwVar = this.c;
        evwVar.getClass();
        evwVar.b(this);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long c() {
        long jC = this.a.c();
        if (jC == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jC + this.b;
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long d() {
        long jD = this.a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.b;
    }

    @Override // defpackage.evw
    public final void dp(evx evxVar) {
        evw evwVar = this.c;
        evwVar.getClass();
        evwVar.dp(this);
    }

    @Override // defpackage.evx
    public final void dr() {
        this.a.dr();
    }

    @Override // defpackage.evx
    public final void dt(long j) {
        this.a.dt(j - this.b);
    }

    @Override // defpackage.evx
    public final long e() {
        long jE = this.a.e();
        if (jE == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jE + this.b;
    }

    @Override // defpackage.evx
    public final long f(long j) {
        long j2 = this.b;
        return this.a.f(j - j2) + j2;
    }

    @Override // defpackage.evx
    public final long g(ezf[] ezfVarArr, boolean[] zArr, ewx[] ewxVarArr, boolean[] zArr2, long j) {
        ewx[] ewxVarArr2 = new ewx[ewxVarArr.length];
        int i = 0;
        while (true) {
            ewx ewxVar = null;
            if (i >= ewxVarArr.length) {
                break;
            }
            exf exfVar = (exf) ewxVarArr[i];
            if (exfVar != null) {
                ewxVar = exfVar.a;
            }
            ewxVarArr2[i] = ewxVar;
            i++;
        }
        evx evxVar = this.a;
        long j2 = this.b;
        long jG = evxVar.g(ezfVarArr, zArr, ewxVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < ewxVarArr.length; i2++) {
            ewx ewxVar2 = ewxVarArr2[i2];
            if (ewxVar2 == null) {
                ewxVarArr[i2] = null;
            } else {
                ewx ewxVar3 = ewxVarArr[i2];
                if (ewxVar3 == null || ((exf) ewxVar3).a != ewxVar2) {
                    ewxVarArr[i2] = new exf(ewxVar2, j2);
                }
            }
        }
        return jG + j2;
    }

    @Override // defpackage.evx
    public final exi h() {
        return this.a.h();
    }

    @Override // defpackage.evx
    public final List i(List list) {
        return this.a.i(list);
    }

    @Override // defpackage.evx
    public final void l(evw evwVar, long j) {
        this.c = evwVar;
        this.a.l(this, j - this.b);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final void m(long j) {
        this.a.m(j - this.b);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean n(eji ejiVar) {
        ejh ejhVar = new ejh(ejiVar);
        ejhVar.a = ejiVar.a - this.b;
        return this.a.n(new eji(ejhVar));
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean o() {
        return this.a.o();
    }
}
