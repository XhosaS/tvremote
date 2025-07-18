package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cug implements cqy, cro, cst {
    final Matrix a;
    final cqd b;
    final cuk c;
    public crx d;
    public cug e;
    public cug f;
    final csk g;
    float h;
    BlurMaskFilter i;
    private final Path j = new Path();
    private final Matrix k = new Matrix();
    private final Matrix l = new Matrix();
    private final Paint m = new cqs(1);
    private final Paint n = new cqs(PorterDuff.Mode.DST_IN, null);
    private final Paint o = new cqs(PorterDuff.Mode.DST_OUT, null);
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private final RectF v;
    private csb w;
    private List x;
    private final List y;
    private boolean z;

    public cug(cqd cqdVar, cuk cukVar) {
        cqs cqsVar = new cqs(1);
        this.p = cqsVar;
        this.q = new cqs(PorterDuff.Mode.CLEAR);
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new RectF();
        this.a = new Matrix();
        this.y = new ArrayList();
        this.z = true;
        this.h = 0.0f;
        this.b = cqdVar;
        this.c = cukVar;
        String str = cukVar.c;
        if (cukVar.x == 3) {
            cqsVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            cqsVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        csk cskVar = new csk(cukVar.h);
        this.g = cskVar;
        cskVar.d(this);
        List list = cukVar.g;
        if (list != null && !list.isEmpty()) {
            csb csbVar = new csb(cukVar.g);
            this.w = csbVar;
            Iterator it = csbVar.a.iterator();
            while (it.hasNext()) {
                ((crt) it.next()).h(this);
            }
            for (crt crtVar : this.w.b) {
                k(crtVar);
                crtVar.h(this);
            }
        }
        if (this.c.s.isEmpty()) {
            p(true);
            return;
        }
        crx crxVar = new crx(this.c.s);
        this.d = crxVar;
        crxVar.b = true;
        crxVar.h(new cro() { // from class: cuf
            @Override // defpackage.cro
            public final void d() {
                cug cugVar = this.a;
                cugVar.p(cugVar.d.k() == 1.0f);
            }
        });
        p(((Float) this.d.e()).floatValue() == 1.0f);
        k(this.d);
    }

    private final void s() {
        if (this.x != null) {
            return;
        }
        if (this.f == null) {
            this.x = Collections.EMPTY_LIST;
            return;
        }
        this.x = new ArrayList();
        for (cug cugVar = this.f; cugVar != null; cugVar = cugVar.f) {
            this.x.add(cugVar);
        }
    }

    private final void t(Canvas canvas) {
        RectF rectF = this.r;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.q);
        coy.a();
    }

    private final void u() {
        cqo cqoVar = this.b.a.a;
        String str = this.c.c;
    }

    @Override // defpackage.cst
    public void a(Object obj, cxb cxbVar) {
        this.g.e(obj, cxbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    @Override // defpackage.cqy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cug.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.cqy
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.r.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        if (z) {
            List list = this.x;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((cug) this.x.get(size)).g.a());
                    }
                }
            } else {
                cug cugVar = this.f;
                if (cugVar != null) {
                    matrix2.preConcat(cugVar.g.a());
                }
            }
        }
        matrix2.preConcat(this.g.a());
    }

    @Override // defpackage.cro
    public final void d() {
        this.b.invalidateSelf();
    }

    @Override // defpackage.cst
    public final void e(css cssVar, int i, List list, css cssVar2) {
        cug cugVar = this.e;
        if (cugVar != null) {
            css cssVarB = cssVar2.b(cugVar.c.c);
            if (cssVar.d(this.e.c.c, i)) {
                list.add(cssVarB.c(this.e));
            }
            if (cssVar.f(this.c.c, i)) {
                this.e.n(cssVar, cssVar.a(this.e.c.c, i) + i, list, cssVarB);
            }
        }
        String str = this.c.c;
        if (cssVar.e(str, i)) {
            if (!"__container".equals(str)) {
                cssVar2 = cssVar2.b(str);
                if (cssVar.d(str, i)) {
                    list.add(cssVar2.c(this));
                }
            }
            if (cssVar.f(str, i)) {
                n(cssVar, i + cssVar.a(str, i), list, cssVar2);
            }
        }
    }

    @Override // defpackage.cqw
    public final String g() {
        throw null;
    }

    public final BlurMaskFilter h(float f) {
        if (this.h == f) {
            return this.i;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.i = blurMaskFilter;
        this.h = f;
        return blurMaskFilter;
    }

    public ctl i() {
        return this.c.u;
    }

    public cvf j() {
        return this.c.v;
    }

    public final void k(crt crtVar) {
        if (crtVar == null) {
            return;
        }
        this.y.add(crtVar);
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i);

    public final void m(crt crtVar) {
        this.y.remove(crtVar);
    }

    public void o(float f) {
        csk cskVar = this.g;
        crt crtVar = cskVar.e;
        if (crtVar != null) {
            crtVar.j(f);
        }
        crt crtVar2 = cskVar.h;
        if (crtVar2 != null) {
            crtVar2.j(f);
        }
        crt crtVar3 = cskVar.i;
        if (crtVar3 != null) {
            crtVar3.j(f);
        }
        crt crtVar4 = cskVar.a;
        if (crtVar4 != null) {
            crtVar4.j(f);
        }
        crt crtVar5 = cskVar.b;
        if (crtVar5 != null) {
            crtVar5.j(f);
        }
        crt crtVar6 = cskVar.c;
        if (crtVar6 != null) {
            crtVar6.j(f);
        }
        crt crtVar7 = cskVar.d;
        if (crtVar7 != null) {
            crtVar7.j(f);
        }
        crx crxVar = cskVar.f;
        if (crxVar != null) {
            crxVar.j(f);
        }
        crx crxVar2 = cskVar.g;
        if (crxVar2 != null) {
            crxVar2.j(f);
        }
        int i = 0;
        if (this.w != null) {
            for (int i2 = 0; i2 < this.w.a.size(); i2++) {
                ((crt) this.w.a.get(i2)).j(f);
            }
        }
        crx crxVar3 = this.d;
        if (crxVar3 != null) {
            crxVar3.j(f);
        }
        cug cugVar = this.e;
        if (cugVar != null) {
            cugVar.o(f);
        }
        while (true) {
            List list = this.y;
            if (i >= list.size()) {
                return;
            }
            ((crt) list.get(i)).j(f);
            i++;
        }
    }

    public final void p(boolean z) {
        if (z != this.z) {
            this.z = z;
            this.b.invalidateSelf();
        }
    }

    final boolean q() {
        csb csbVar = this.w;
        return (csbVar == null || csbVar.a.isEmpty()) ? false : true;
    }

    final boolean r() {
        return this.e != null;
    }

    @Override // defpackage.cqw
    public final void f(List list, List list2) {
    }

    public void n(css cssVar, int i, List list, css cssVar2) {
    }
}
