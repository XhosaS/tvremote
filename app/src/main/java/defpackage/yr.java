package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yr extends yn {
    private boolean at;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public ym d = this.L;
    public int as = 0;

    public yr() {
        this.T.clear();
        this.T.add(this.d);
        int length = this.S.length;
        for (int i = 0; i < 6; i++) {
            this.S[i] = this.d;
        }
    }

    @Override // defpackage.yn
    public final void D(yc ycVar, boolean z) {
        if (this.V == null) {
            return;
        }
        int iA = ycVar.a(this.d);
        if (this.as == 1) {
            this.aa = iA;
            this.ab = 0;
            x(this.V.g());
            B(0);
            return;
        }
        this.aa = 0;
        this.ab = iA;
        B(this.V.h());
        x(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ym K(int r3) {
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
            ym r3 = r2.d
            return r3
        L1b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr.K(int):ym");
    }

    public final void a(int i) {
        this.d.e(i);
        this.at = true;
    }

    @Override // defpackage.yn
    public final void b(yc ycVar, boolean z) {
        yn ynVar = this.V;
        if (ynVar == null) {
            return;
        }
        Object objK = ynVar.K(2);
        Object objK2 = ynVar.K(4);
        yn ynVar2 = this.V;
        boolean z2 = ynVar2 != null && ynVar2.ar[0] == 2;
        if (this.as == 0) {
            objK = ynVar.K(3);
            objK2 = ynVar.K(5);
            z2 = ynVar2 != null && ynVar2.ar[1] == 2;
        }
        if (this.at) {
            ym ymVar = this.d;
            if (ymVar.c) {
                yh yhVarC = ycVar.c(ymVar);
                ycVar.g(yhVarC, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        ycVar.h(ycVar.c(objK2), yhVarC, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    yh yhVarC2 = ycVar.c(objK2);
                    ycVar.h(yhVarC, ycVar.c(objK), 0, 5);
                    ycVar.h(yhVarC2, yhVarC, 0, 5);
                }
                this.at = false;
                return;
            }
        }
        if (this.b != -1) {
            yh yhVarC3 = ycVar.c(this.d);
            ycVar.m(yhVarC3, ycVar.c(objK), this.b, 8);
            if (z2) {
                ycVar.h(ycVar.c(objK2), yhVarC3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            yh yhVarC4 = ycVar.c(this.d);
            yh yhVarC5 = ycVar.c(objK2);
            ycVar.m(yhVarC4, yhVarC5, -this.c, 8);
            if (z2) {
                ycVar.h(yhVarC4, ycVar.c(objK), 0, 5);
                ycVar.h(yhVarC5, yhVarC4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            yh yhVarC6 = ycVar.c(this.d);
            yh yhVarC7 = ycVar.c(objK2);
            float f = this.a;
            ya yaVarB = ycVar.b();
            yaVarB.e.g(yhVarC6, -1.0f);
            yaVarB.e.g(yhVarC7, f);
            ycVar.f(yaVarB);
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
        ym[] ymVarArr = this.S;
        int length = ymVarArr.length;
        for (int i2 = 0; i2 < 6; i2++) {
            ymVarArr[i2] = this.d;
        }
    }

    @Override // defpackage.yn
    public final boolean d() {
        return true;
    }

    @Override // defpackage.yn
    public final boolean e() {
        return this.at;
    }

    @Override // defpackage.yn
    public final boolean f() {
        return this.at;
    }
}
