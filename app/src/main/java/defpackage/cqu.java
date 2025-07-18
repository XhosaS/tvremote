package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cqu implements cro, cre, cqy {
    protected final cug a;
    final Paint b;
    float c;
    private final cqd h;
    private final float[] j;
    private final crt k;
    private final crt l;
    private final List m;
    private final crt n;
    private crt o;
    private crt p;
    private crw q;
    private final PathMeasure d = new PathMeasure();
    private final Path e = new Path();
    private final Path f = new Path();
    private final RectF g = new RectF();
    private final List i = new ArrayList();

    public cqu(cqd cqdVar, cug cugVar, Paint.Cap cap, Paint.Join join, float f, cta ctaVar, csy csyVar, List list, csy csyVar2) {
        cqs cqsVar = new cqs(1);
        this.b = cqsVar;
        this.c = 0.0f;
        this.h = cqdVar;
        this.a = cugVar;
        cqsVar.setStyle(Paint.Style.STROKE);
        cqsVar.setStrokeCap(cap);
        cqsVar.setStrokeJoin(join);
        cqsVar.setStrokeMiter(f);
        this.l = ctaVar.a();
        this.k = csyVar.a();
        if (csyVar2 == null) {
            this.n = null;
        } else {
            this.n = csyVar2.a();
        }
        this.m = new ArrayList(list.size());
        this.j = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.m.add(((csy) list.get(i)).a());
        }
        cugVar.k(this.l);
        cugVar.k(this.k);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            cugVar.k((crt) this.m.get(i2));
        }
        crt crtVar = this.n;
        if (crtVar != null) {
            cugVar.k(crtVar);
        }
        this.l.h(this);
        this.k.h(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((crt) this.m.get(i3)).h(this);
        }
        crt crtVar2 = this.n;
        if (crtVar2 != null) {
            crtVar2.h(this);
        }
        if (cugVar.i() != null) {
            crt crtVarA = cugVar.i().a.a();
            this.p = crtVarA;
            crtVarA.h(this);
            cugVar.k(this.p);
        }
        if (cugVar.j() != null) {
            this.q = new crw(this, cugVar, cugVar.j());
        }
    }

    @Override // defpackage.cst
    public void a(Object obj, cxb cxbVar) {
        crw crwVar;
        crw crwVar2;
        crw crwVar3;
        crw crwVar4;
        crw crwVar5;
        if (obj == cqi.d) {
            this.l.d = cxbVar;
            return;
        }
        if (obj == cqi.s) {
            this.k.d = cxbVar;
            return;
        }
        if (obj == cqi.K) {
            crt crtVar = this.o;
            if (crtVar != null) {
                this.a.m(crtVar);
            }
            csl cslVar = new csl(cxbVar, null);
            this.o = cslVar;
            cslVar.h(this);
            this.a.k(this.o);
            return;
        }
        if (obj == cqi.j) {
            crt crtVar2 = this.p;
            if (crtVar2 != null) {
                crtVar2.d = cxbVar;
                return;
            }
            csl cslVar2 = new csl(cxbVar, null);
            this.p = cslVar2;
            cslVar2.h(this);
            this.a.k(this.p);
            return;
        }
        if (obj == cqi.e && (crwVar5 = this.q) != null) {
            crwVar5.a.d = cxbVar;
            return;
        }
        if (obj == cqi.G && (crwVar4 = this.q) != null) {
            crwVar4.b(cxbVar);
            return;
        }
        if (obj == cqi.H && (crwVar3 = this.q) != null) {
            crwVar3.b.d = cxbVar;
            return;
        }
        if (obj == cqi.I && (crwVar2 = this.q) != null) {
            crwVar2.c.d = cxbVar;
        } else {
            if (obj != cqi.J || (crwVar = this.q) == null) {
                return;
            }
            crwVar.d.d = cxbVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01f2  */
    @Override // defpackage.cqy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqu.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.cqy
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.e;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.i;
            if (i >= list.size()) {
                RectF rectF2 = this.g;
                path.computeBounds(rectF2, false);
                float fK = ((crx) this.k).k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                coy.a();
                return;
            }
            cqt cqtVar = (cqt) list.get(i);
            int i2 = 0;
            while (true) {
                List list2 = cqtVar.a;
                if (i2 < list2.size()) {
                    path.addPath(((crg) list2.get(i2)).i(), matrix);
                    i2++;
                }
            }
            i++;
        }
    }

    @Override // defpackage.cro
    public final void d() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.cst
    public final void e(css cssVar, int i, List list, css cssVar2) {
        cwt.c(cssVar, i, list, cssVar2, this);
    }

    @Override // defpackage.cqw
    public final void f(List list, List list2) {
        cqt cqtVar = null;
        crn crnVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            cqw cqwVar = (cqw) list.get(size);
            if (cqwVar instanceof crn) {
                crn crnVar2 = (crn) cqwVar;
                if (crnVar2.e == 2) {
                    crnVar = crnVar2;
                }
            }
        }
        if (crnVar != null) {
            crnVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            cqw cqwVar2 = (cqw) list2.get(size2);
            if (cqwVar2 instanceof crn) {
                crn crnVar3 = (crn) cqwVar2;
                if (crnVar3.e == 2) {
                    if (cqtVar != null) {
                        this.i.add(cqtVar);
                    }
                    cqt cqtVar2 = new cqt(crnVar3);
                    crnVar3.a(this);
                    cqtVar = cqtVar2;
                }
            }
            if (cqwVar2 instanceof crg) {
                if (cqtVar == null) {
                    cqtVar = new cqt(crnVar);
                }
                cqtVar.a.add((crg) cqwVar2);
            }
        }
        if (cqtVar != null) {
            this.i.add(cqtVar);
        }
    }
}
