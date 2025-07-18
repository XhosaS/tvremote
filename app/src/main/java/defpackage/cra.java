package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cra implements cqy, cro, cre {
    float a;
    private final Path b;
    private final Paint c;
    private final cug d;
    private final String e;
    private final boolean f;
    private final List g;
    private final crt h;
    private final crt i;
    private crt j;
    private final cqd k;
    private crt l;
    private crw m;

    public cra(cqd cqdVar, cug cugVar, cty ctyVar) {
        Path path = new Path();
        this.b = path;
        this.c = new cqs(1);
        this.g = new ArrayList();
        this.d = cugVar;
        this.e = ctyVar.b;
        this.f = ctyVar.e;
        this.k = cqdVar;
        if (cugVar.i() != null) {
            crt crtVarA = cugVar.i().a.a();
            this.l = crtVarA;
            crtVarA.h(this);
            cugVar.k(this.l);
        }
        if (cugVar.j() != null) {
            this.m = new crw(this, cugVar, cugVar.j());
        }
        if (ctyVar.c == null) {
            this.h = null;
            this.i = null;
            return;
        }
        path.setFillType(ctyVar.a);
        crt crtVarA2 = ctyVar.c.a();
        this.h = crtVarA2;
        crtVarA2.h(this);
        cugVar.k(crtVarA2);
        crt crtVarA3 = ctyVar.d.a();
        this.i = crtVarA3;
        crtVarA3.h(this);
        cugVar.k(crtVarA3);
    }

    @Override // defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        crw crwVar;
        crw crwVar2;
        crw crwVar3;
        crw crwVar4;
        crw crwVar5;
        if (obj == cqi.a) {
            this.h.d = cxbVar;
            return;
        }
        if (obj == cqi.d) {
            this.i.d = cxbVar;
            return;
        }
        if (obj == cqi.K) {
            crt crtVar = this.j;
            if (crtVar != null) {
                this.d.m(crtVar);
            }
            csl cslVar = new csl(cxbVar, null);
            this.j = cslVar;
            cslVar.h(this);
            this.d.k(this.j);
            return;
        }
        if (obj == cqi.j) {
            crt crtVar2 = this.l;
            if (crtVar2 != null) {
                crtVar2.d = cxbVar;
                return;
            }
            csl cslVar2 = new csl(cxbVar, null);
            this.l = cslVar2;
            cslVar2.h(this);
            this.d.k(this.l);
            return;
        }
        if (obj == cqi.e && (crwVar5 = this.m) != null) {
            crwVar5.a.d = cxbVar;
            return;
        }
        if (obj == cqi.G && (crwVar4 = this.m) != null) {
            crwVar4.b(cxbVar);
            return;
        }
        if (obj == cqi.H && (crwVar3 = this.m) != null) {
            crwVar3.b.d = cxbVar;
            return;
        }
        if (obj == cqi.I && (crwVar2 = this.m) != null) {
            crwVar2.c.d = cxbVar;
        } else {
            if (obj != cqi.J || (crwVar = this.m) == null) {
                return;
            }
            crwVar.d.d = cxbVar;
        }
    }

    @Override // defpackage.cqy
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        crt crtVar = this.h;
        crt crtVar2 = this.i;
        int iK = ((cru) crtVar).k();
        float fIntValue = ((Integer) crtVar2.e()).intValue();
        Paint paint = this.c;
        paint.setColor((cwt.d((int) ((((i / 255.0f) * fIntValue) / 100.0f) * 255.0f)) << 24) | (iK & 16777215));
        crt crtVar3 = this.j;
        if (crtVar3 != null) {
            paint.setColorFilter((ColorFilter) crtVar3.e());
        }
        crt crtVar4 = this.l;
        if (crtVar4 != null) {
            float fFloatValue = ((Float) crtVar4.e()).floatValue();
            if (fFloatValue == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue != this.a) {
                paint.setMaskFilter(this.d.h(fFloatValue));
            }
            this.a = fFloatValue;
        }
        crw crwVar = this.m;
        if (crwVar != null) {
            crwVar.a(paint);
        }
        Path path = this.b;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.g;
            if (i2 >= list.size()) {
                canvas.drawPath(path, paint);
                coy.a();
                return;
            } else {
                path.addPath(((crg) list.get(i2)).i(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.cqy
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.g;
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
        this.k.invalidateSelf();
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
                this.g.add((crg) cqwVar);
            }
        }
    }

    @Override // defpackage.cqw
    public final String g() {
        return this.e;
    }
}
