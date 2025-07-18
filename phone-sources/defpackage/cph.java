package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cph extends cpd {
    private boolean at;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public cpc d = this.L;
    public int as = 0;

    public cph() {
        this.T.clear();
        this.T.add(this.d);
        int length = this.S.length;
        for (int i = 0; i < 6; i++) {
            this.S[i] = this.d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cpd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cpc M(int r3) {
        /*
            r2 = this;
            int r3 = r3 + (-1)
            r0 = 1
            if (r3 == r0) goto L14
            r1 = 2
            if (r3 == r1) goto Lf
            r1 = 3
            if (r3 == r1) goto L14
            r0 = 4
            if (r3 == r0) goto Lf
            goto L1b
        Lf:
            int r3 = r2.as
            if (r3 != 0) goto L1b
            goto L18
        L14:
            int r3 = r2.as
            if (r3 != r0) goto L1b
        L18:
            cpc r3 = r2.d
            return r3
        L1b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cph.M(int):cpc");
    }

    @Override // defpackage.cpd
    public final void U(boolean z) {
        if (this.V == null) {
            return;
        }
        int iO = cov.o(this.d);
        if (this.as == 1) {
            this.aa = iO;
            this.ab = 0;
            z(this.V.h());
            E(0);
            return;
        }
        this.aa = 0;
        this.ab = iO;
        E(this.V.j());
        z(0);
    }

    public final void a(int i) {
        this.d.f(i);
        this.at = true;
    }

    @Override // defpackage.cpd
    public final void b(cov covVar, boolean z) {
        cpd cpdVar = this.V;
        if (cpdVar == null) {
            return;
        }
        Object objM = cpdVar.M(2);
        Object objM2 = cpdVar.M(4);
        cpd cpdVar2 = this.V;
        boolean z2 = cpdVar2 != null && cpdVar2.ar[0] == 2;
        if (this.as == 0) {
            objM = cpdVar.M(3);
            objM2 = cpdVar.M(5);
            z2 = cpdVar2 != null && cpdVar2.ar[1] == 2;
        }
        if (this.at) {
            cpc cpcVar = this.d;
            if (cpcVar.c) {
                coy coyVarB = covVar.b(cpcVar);
                covVar.f(coyVarB, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        covVar.g(covVar.b(objM2), coyVarB, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    coy coyVarB2 = covVar.b(objM2);
                    covVar.g(coyVarB, covVar.b(objM), 0, 5);
                    covVar.g(coyVarB2, coyVarB, 0, 5);
                }
                this.at = false;
                return;
            }
        }
        if (this.b != -1) {
            coy coyVarB3 = covVar.b(this.d);
            covVar.m(coyVarB3, covVar.b(objM), this.b, 8);
            if (z2) {
                covVar.g(covVar.b(objM2), coyVarB3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            coy coyVarB4 = covVar.b(this.d);
            coy coyVarB5 = covVar.b(objM2);
            covVar.m(coyVarB4, coyVarB5, -this.c, 8);
            if (z2) {
                covVar.g(coyVarB4, covVar.b(objM), 0, 5);
                covVar.g(coyVarB5, coyVarB4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            coy coyVarB6 = covVar.b(this.d);
            coy coyVarB7 = covVar.b(objM2);
            float f = this.a;
            cou couVarA = covVar.a();
            couVarA.e.g(coyVarB6, -1.0f);
            couVarA.e.g(coyVarB7, f);
            covVar.e(couVarA);
        }
    }

    public final void c(int i) {
        if (this.as == i) {
            return;
        }
        this.as = i;
        ArrayList arrayList = this.T;
        arrayList.clear();
        if (this.as == 1) {
            this.d = this.K;
        } else {
            this.d = this.L;
        }
        arrayList.add(this.d);
        cpc[] cpcVarArr = this.S;
        int length = cpcVarArr.length;
        for (int i2 = 0; i2 < 6; i2++) {
            cpcVarArr[i2] = this.d;
        }
    }

    @Override // defpackage.cpd
    public final boolean d() {
        return true;
    }

    @Override // defpackage.cpd
    public final boolean e() {
        return this.at;
    }

    @Override // defpackage.cpd
    public final boolean f() {
        return this.at;
    }
}
