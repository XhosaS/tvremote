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
public abstract class hfk implements hcl, hdb, hee {
    final Matrix a;
    final hbv b;
    final hfn c;
    public hdk d;
    public hfk e;
    public hfk f;
    final hdw g;
    float h;
    BlurMaskFilter i;
    private final Path j = new Path();
    private final Matrix k = new Matrix();
    private final Matrix l = new Matrix();
    private final Paint m = new hch(1);
    private final Paint n = new hch(PorterDuff.Mode.DST_IN, null);
    private final Paint o = new hch(PorterDuff.Mode.DST_OUT, null);
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private final RectF v;
    private List w;
    private final List x;
    private boolean y;
    private cvi z;

    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.util.List] */
    public hfk(hbv hbvVar, hfn hfnVar) {
        hch hchVar = new hch(1);
        this.p = hchVar;
        this.q = new hch(PorterDuff.Mode.CLEAR);
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new RectF();
        this.a = new Matrix();
        this.x = new ArrayList();
        this.y = true;
        this.h = 0.0f;
        this.b = hbvVar;
        this.c = hfnVar;
        String str = hfnVar.c;
        if (hfnVar.u == 3) {
            hchVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            hchVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        hdw hdwVar = new hdw(hfnVar.h);
        this.g = hdwVar;
        hdwVar.d(this);
        List list = hfnVar.g;
        if (list != null && !list.isEmpty()) {
            cvi cviVar = new cvi(hfnVar.g);
            this.z = cviVar;
            Iterator it = cviVar.b.iterator();
            while (it.hasNext()) {
                ((hdg) it.next()).h(this);
            }
            for (hdg hdgVar : this.z.c) {
                i(hdgVar);
                hdgVar.h(this);
            }
        }
        if (this.c.r.isEmpty()) {
            n(true);
            return;
        }
        hdk hdkVar = new hdk(this.c.r);
        this.d = hdkVar;
        hdkVar.b = true;
        hdkVar.h(new hdb() { // from class: hfj
            @Override // defpackage.hdb
            public final void d() {
                hfk hfkVar = this.a;
                hfkVar.n(hfkVar.d.k() == 1.0f);
            }
        });
        n(((Float) this.d.e()).floatValue() == 1.0f);
        i(this.d);
    }

    private final void s() {
        if (this.w != null) {
            return;
        }
        if (this.f == null) {
            this.w = Collections.EMPTY_LIST;
            return;
        }
        this.w = new ArrayList();
        for (hfk hfkVar = this.f; hfkVar != null; hfkVar = hfkVar.f) {
            this.w.add(hfkVar);
        }
    }

    private final void t(Canvas canvas) {
        RectF rectF = this.r;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.q);
        hbd.a();
    }

    private final void u() {
        this.b.invalidateSelf();
    }

    private final void v() {
        hjs hjsVar = this.b.a.m;
        String str = this.c.c;
    }

    @Override // defpackage.hee
    public void a(Object obj, hhu hhuVar) {
        this.g.e(obj, hhuVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v46, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v49, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hcl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfk.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.hcl
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.r.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        if (z) {
            List list = this.w;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((hfk) this.w.get(size)).g.a());
                    }
                }
            } else {
                hfk hfkVar = this.f;
                if (hfkVar != null) {
                    matrix2.preConcat(hfkVar.g.a());
                }
            }
        }
        matrix2.preConcat(this.g.a());
    }

    @Override // defpackage.hdb
    public final void d() {
        u();
    }

    @Override // defpackage.hee
    public final void e(hed hedVar, int i, List list, hed hedVar2) {
        hfk hfkVar = this.e;
        if (hfkVar != null) {
            hed hedVarB = hedVar2.b(hfkVar.g());
            if (hedVar.d(this.e.g(), i)) {
                list.add(hedVarB.c(this.e));
            }
            if (hedVar.f(g(), i)) {
                this.e.l(hedVar, hedVar.a(this.e.g(), i) + i, list, hedVarB);
            }
        }
        if (hedVar.e(g(), i)) {
            if (!"__container".equals(g())) {
                hedVar2 = hedVar2.b(g());
                if (hedVar.d(g(), i)) {
                    list.add(hedVar2.c(this));
                }
            }
            if (hedVar.f(g(), i)) {
                l(hedVar, i + hedVar.a(g(), i), list, hedVar2);
            }
        }
    }

    @Override // defpackage.hcj
    public final String g() {
        return this.c.c;
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

    public final void i(hdg hdgVar) {
        if (hdgVar == null) {
            return;
        }
        this.x.add(hdgVar);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i);

    public final void k(hdg hdgVar) {
        this.x.remove(hdgVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    public void m(float f) {
        hdw hdwVar = this.g;
        hdg hdgVar = hdwVar.e;
        if (hdgVar != null) {
            hdgVar.j(f);
        }
        hdg hdgVar2 = hdwVar.h;
        if (hdgVar2 != null) {
            hdgVar2.j(f);
        }
        hdg hdgVar3 = hdwVar.i;
        if (hdgVar3 != null) {
            hdgVar3.j(f);
        }
        hdg hdgVar4 = hdwVar.a;
        if (hdgVar4 != null) {
            hdgVar4.j(f);
        }
        hdg hdgVar5 = hdwVar.b;
        if (hdgVar5 != null) {
            hdgVar5.j(f);
        }
        hdg hdgVar6 = hdwVar.c;
        if (hdgVar6 != null) {
            hdgVar6.j(f);
        }
        hdg hdgVar7 = hdwVar.d;
        if (hdgVar7 != null) {
            hdgVar7.j(f);
        }
        hdk hdkVar = hdwVar.f;
        if (hdkVar != null) {
            hdkVar.j(f);
        }
        hdk hdkVar2 = hdwVar.g;
        if (hdkVar2 != null) {
            hdkVar2.j(f);
        }
        int i = 0;
        if (this.z != null) {
            for (int i2 = 0; i2 < this.z.b.size(); i2++) {
                ((hdg) this.z.b.get(i2)).j(f);
            }
        }
        hdk hdkVar3 = this.d;
        if (hdkVar3 != null) {
            hdkVar3.j(f);
        }
        hfk hfkVar = this.e;
        if (hfkVar != null) {
            hfkVar.m(f);
        }
        while (true) {
            List list = this.x;
            if (i >= list.size()) {
                return;
            }
            ((hdg) list.get(i)).j(f);
            i++;
        }
    }

    public final void n(boolean z) {
        if (z != this.y) {
            this.y = z;
            u();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    final boolean o() {
        cvi cviVar = this.z;
        return (cviVar == null || cviVar.b.isEmpty()) ? false : true;
    }

    final boolean p() {
        return this.e != null;
    }

    public hfw q() {
        return this.c.v;
    }

    public gag r() {
        return this.c.w;
    }

    @Override // defpackage.hcj
    public final void f(List list, List list2) {
    }

    public void l(hed hedVar, int i, List list, hed hedVar2) {
    }
}
