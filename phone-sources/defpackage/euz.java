package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euz implements evx, evw {
    public final evx a;
    long b;
    long c;
    public evc d;
    private evw e;
    private euy[] f = new euy[0];
    private long g;

    public euz(evx evxVar, boolean z, long j, long j2) {
        this.a = evxVar;
        this.g = true != z ? -9223372036854775807L : j;
        this.b = j;
        this.c = j2;
    }

    private static long r(long j, long j2, long j3) {
        long jMax = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.evx
    public final long a(long j, ekj ekjVar) {
        long j2 = this.b;
        if (j == j2) {
            return j2;
        }
        long j3 = ekjVar.c;
        long jT = edt.t(j3, 0L, j - j2);
        long j4 = ekjVar.d;
        long j5 = this.c;
        long jT2 = edt.t(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (jT != j3 || jT2 != j4) {
            ekjVar = new ekj(jT, jT2);
        }
        return this.a.a(j, ekjVar);
    }

    @Override // defpackage.ewy
    public final /* bridge */ /* synthetic */ void b(ewz ewzVar) {
        evw evwVar = this.e;
        evwVar.getClass();
        evwVar.b(this);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long c() {
        long jC = this.a.c();
        if (jC != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || jC < j) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long d() {
        long jD = this.a.d();
        if (jD != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || jD < j) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.evw
    public final void dp(evx evxVar) {
        if (this.d != null) {
            return;
        }
        evw evwVar = this.e;
        evwVar.getClass();
        evwVar.dp(this);
    }

    @Override // defpackage.evx
    public final void dr() throws evc {
        evc evcVar = this.d;
        if (evcVar != null) {
            throw evcVar;
        }
        this.a.dr();
    }

    @Override // defpackage.evx
    public final void dt(long j) {
        this.a.dt(j);
    }

    @Override // defpackage.evx
    public final long e() {
        if (q()) {
            long j = this.g;
            this.g = -9223372036854775807L;
            long jE = e();
            return jE != -9223372036854775807L ? jE : j;
        }
        long jE2 = this.a.e();
        if (jE2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return r(jE2, this.b, this.c);
    }

    @Override // defpackage.evx
    public final long f(long j) {
        this.g = -9223372036854775807L;
        for (euy euyVar : this.f) {
            if (euyVar != null) {
                euyVar.b = false;
            }
        }
        return r(this.a.f(j), this.b, this.c);
    }

    @Override // defpackage.evx
    public final long g(ezf[] ezfVarArr, boolean[] zArr, ewx[] ewxVarArr, boolean[] zArr2, long j) {
        int length = ewxVarArr.length;
        this.f = new euy[length];
        ewx[] ewxVarArr2 = new ewx[length];
        int i = 0;
        while (true) {
            ewx ewxVar = null;
            if (i >= ewxVarArr.length) {
                break;
            }
            euy[] euyVarArr = this.f;
            euy euyVar = (euy) ewxVarArr[i];
            euyVarArr[i] = euyVar;
            if (euyVar != null) {
                ewxVar = euyVar.a;
            }
            ewxVarArr2[i] = ewxVar;
            i++;
        }
        long jG = this.a.g(ezfVarArr, zArr, ewxVarArr2, zArr2, j);
        long jR = r(jG, j, this.c);
        long j2 = -9223372036854775807L;
        if (q()) {
            if (jG < j) {
                j2 = jR;
                break;
            }
            if (jG != 0) {
                for (ezf ezfVar : ezfVarArr) {
                    if (ezfVar != null) {
                        dze dzeVarG = ezfVar.g();
                        if (!eae.j(dzeVarG.Y, dzeVarG.U)) {
                            j2 = jR;
                            break;
                        }
                    }
                }
            }
        }
        this.g = j2;
        for (int i2 = 0; i2 < ewxVarArr.length; i2++) {
            ewx ewxVar2 = ewxVarArr2[i2];
            if (ewxVar2 == null) {
                this.f[i2] = null;
            } else {
                euy[] euyVarArr2 = this.f;
                euy euyVar2 = euyVarArr2[i2];
                if (euyVar2 == null || euyVar2.a != ewxVar2) {
                    euyVarArr2[i2] = new euy(this, ewxVar2);
                }
            }
            ewxVarArr[i2] = this.f[i2];
        }
        return jR;
    }

    @Override // defpackage.evx
    public final exi h() {
        return this.a.h();
    }

    @Override // defpackage.evx
    public final List i(List list) {
        return this.a.i(list);
    }

    public final void k(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.evx
    public final void l(evw evwVar, long j) {
        this.e = evwVar;
        this.a.l(this, j);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final void m(long j) {
        this.a.m(j);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean n(eji ejiVar) {
        return this.a.n(ejiVar);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean o() {
        return this.a.o();
    }

    final boolean q() {
        return this.g != -9223372036854775807L;
    }
}
