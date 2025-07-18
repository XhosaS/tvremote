package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ao extends am {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private al aj = this.j;
    public int ai = 0;

    public ao() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        if (this.ai == i) {
            return;
        }
        this.ai = i;
        ArrayList arrayList = this.q;
        arrayList.clear();
        if (this.ai == 1) {
            this.aj = this.i;
        } else {
            this.aj = this.j;
        }
        arrayList.add(this.aj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001b A[ORIG_RETURN, RETURN] */
    @Override // defpackage.am
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.al t(int r3) {
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
            int r3 = r2.ai
            if (r3 == 0) goto L18
            goto L1b
        L14:
            int r3 = r2.ai
            if (r3 != r0) goto L1b
        L18:
            al r3 = r2.aj
            return r3
        L1b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.t(int):al");
    }

    @Override // defpackage.am
    public final void x(aj ajVar) {
        am amVar = this.r;
        if (amVar == null) {
            return;
        }
        al alVarT = amVar.t(2);
        al alVarT2 = amVar.t(4);
        if (this.ai == 0) {
            alVarT = amVar.t(3);
            alVarT2 = amVar.t(5);
        }
        if (this.ag != -1) {
            ajVar.g(aj.c(ajVar, ajVar.e(this.aj), ajVar.e(alVarT), this.ag, false));
            return;
        }
        if (this.ah != -1) {
            ajVar.g(aj.c(ajVar, ajVar.e(this.aj), ajVar.e(alVarT2), -this.ah, false));
            return;
        }
        if (this.af != -1.0f) {
            ak akVarE = ajVar.e(this.aj);
            ak akVarE2 = ajVar.e(alVarT);
            ak akVarE3 = ajVar.e(alVarT2);
            float f = this.af;
            ah ahVarA = ajVar.a();
            ag agVar = ahVarA.d;
            agVar.f(akVarE, -1.0f);
            agVar.f(akVarE2, 1.0f - f);
            agVar.f(akVarE3, f);
            ajVar.g(ahVarA);
        }
    }

    @Override // defpackage.am
    public final void y() {
        if (this.r == null) {
            return;
        }
        int iP = aj.p(this.aj);
        if (this.ai == 1) {
            this.w = iP;
            this.x = 0;
            j(this.r.d());
            p(0);
            return;
        }
        this.w = 0;
        this.x = iP;
        p(this.r.h());
        j(0);
    }
}
