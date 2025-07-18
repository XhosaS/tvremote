package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crb implements cqy, cro, cre {
    float a;
    private final String b;
    private final boolean c;
    private final cug d;
    private final wr e = new wr(10);
    private final wr f = new wr(10);
    private final Path g;
    private final Paint h;
    private final RectF i;
    private final List j;
    private final crt k;
    private final crt l;
    private final crt m;
    private final crt n;
    private crt o;
    private csl p;
    private final cqd q;
    private final int r;
    private crt s;
    private crw t;
    private final int u;

    public crb(cqd cqdVar, cph cphVar, cug cugVar, ctp ctpVar) {
        Path path = new Path();
        this.g = path;
        this.h = new cqs(1);
        this.i = new RectF();
        this.j = new ArrayList();
        this.a = 0.0f;
        this.d = cugVar;
        this.b = ctpVar.f;
        this.c = ctpVar.g;
        this.q = cqdVar;
        this.u = ctpVar.h;
        path.setFillType(ctpVar.a);
        this.r = (int) (cphVar.a() / 32.0f);
        crt crtVarA = ctpVar.b.a();
        this.k = crtVarA;
        crtVarA.h(this);
        cugVar.k(crtVarA);
        crt crtVarA2 = ctpVar.c.a();
        this.l = crtVarA2;
        crtVarA2.h(this);
        cugVar.k(crtVarA2);
        crt crtVarA3 = ctpVar.d.a();
        this.m = crtVarA3;
        crtVarA3.h(this);
        cugVar.k(crtVarA3);
        crt crtVarA4 = ctpVar.e.a();
        this.n = crtVarA4;
        crtVarA4.h(this);
        cugVar.k(crtVarA4);
        if (cugVar.i() != null) {
            crt crtVarA5 = cugVar.i().a.a();
            this.s = crtVarA5;
            crtVarA5.h(this);
            cugVar.k(this.s);
        }
        if (cugVar.j() != null) {
            this.t = new crw(this, cugVar, cugVar.j());
        }
    }

    private final int h() {
        float f = this.m.c;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.c * f2);
        int iRound3 = Math.round(this.k.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        csl cslVar = this.p;
        if (cslVar != null) {
            Integer[] numArr = (Integer[]) cslVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        crw crwVar;
        crw crwVar2;
        crw crwVar3;
        crw crwVar4;
        crw crwVar5;
        if (obj == cqi.d) {
            this.l.d = cxbVar;
            return;
        }
        if (obj == cqi.K) {
            crt crtVar = this.o;
            if (crtVar != null) {
                this.d.m(crtVar);
            }
            csl cslVar = new csl(cxbVar, null);
            this.o = cslVar;
            cslVar.h(this);
            this.d.k(this.o);
            return;
        }
        if (obj == cqi.L) {
            csl cslVar2 = this.p;
            if (cslVar2 != null) {
                this.d.m(cslVar2);
            }
            this.e.h();
            this.f.h();
            csl cslVar3 = new csl(cxbVar, null);
            this.p = cslVar3;
            cslVar3.h(this);
            this.d.k(this.p);
            return;
        }
        if (obj == cqi.j) {
            crt crtVar2 = this.s;
            if (crtVar2 != null) {
                crtVar2.d = cxbVar;
                return;
            }
            csl cslVar4 = new csl(cxbVar, null);
            this.s = cslVar4;
            cslVar4.h(this);
            this.d.k(this.s);
            return;
        }
        if (obj == cqi.e && (crwVar5 = this.t) != null) {
            crwVar5.a.d = cxbVar;
            return;
        }
        if (obj == cqi.G && (crwVar4 = this.t) != null) {
            crwVar4.b(cxbVar);
            return;
        }
        if (obj == cqi.H && (crwVar3 = this.t) != null) {
            crwVar3.b.d = cxbVar;
            return;
        }
        if (obj == cqi.I && (crwVar2 = this.t) != null) {
            crwVar2.c.d = cxbVar;
        } else {
            if (obj != cqi.J || (crwVar = this.t) == null) {
                return;
            }
            crwVar.d.d = cxbVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
    @Override // defpackage.cqy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crb.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.cqy
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.g;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.j;
            if (i >= list.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((crg) list.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.cro
    public final void d() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.cst
    public final void e(css cssVar, int i, List list, css cssVar2) {
        cwt.c(cssVar, i, list, cssVar2, this);
    }

    @Override // defpackage.cqw
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            cqw cqwVar = (cqw) list2.get(i);
            if (cqwVar instanceof crg) {
                this.j.add((crg) cqwVar);
            }
        }
    }

    @Override // defpackage.cqw
    public final String g() {
        return this.b;
    }
}
