package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class r extends p {
    public float ah = -1.0f;
    public int ai = -1;
    public int aj = -1;
    private o al = this.j;
    public int ak = 0;

    public r() {
        this.q.clear();
        this.q.add(this.al);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001b A[ORIG_RETURN, RETURN] */
    @Override // defpackage.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.o q(int r3) {
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
            int r3 = r2.ak
            if (r3 == 0) goto L18
            goto L1b
        L14:
            int r3 = r2.ak
            if (r3 != r0) goto L1b
        L18:
            o r3 = r2.al
            return r3
        L1b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r.q(int):o");
    }

    @Override // defpackage.p
    public final void u(k kVar) {
        p pVar = this.r;
        if (pVar == null) {
            return;
        }
        o oVarQ = pVar.q(2);
        o oVarQ2 = pVar.q(4);
        if (this.ak == 0) {
            oVarQ = pVar.q(3);
            oVarQ2 = pVar.q(5);
        }
        if (this.ai != -1) {
            kVar.h(k.d(kVar, kVar.f(this.al), kVar.f(oVarQ), this.ai, false));
            return;
        }
        if (this.aj != -1) {
            kVar.h(k.d(kVar, kVar.f(this.al), kVar.f(oVarQ2), -this.aj, false));
            return;
        }
        if (this.ah != -1.0f) {
            m mVarF = kVar.f(this.al);
            m mVarF2 = kVar.f(oVarQ);
            m mVarF3 = kVar.f(oVarQ2);
            float f = this.ah;
            h hVarB = kVar.b();
            g gVar = hVarB.d;
            gVar.f(mVarF, -1.0f);
            gVar.f(mVarF2, 1.0f - f);
            gVar.f(mVarF3, f);
            kVar.h(hVarB);
        }
    }

    @Override // defpackage.p
    public final void v(k kVar) {
        if (this.r == null) {
            return;
        }
        int iA = kVar.a(this.al);
        if (this.ak == 1) {
            this.w = iA;
            this.x = 0;
            g(this.r.a());
            m(0);
            return;
        }
        this.w = 0;
        this.x = iA;
        m(this.r.d());
        g(0);
    }

    public final void w(int i) {
        if (this.ak == i) {
            return;
        }
        this.ak = i;
        ArrayList arrayList = this.q;
        arrayList.clear();
        if (this.ak == 1) {
            this.al = this.i;
        } else {
            this.al = this.j;
        }
        arrayList.add(this.al);
    }
}
