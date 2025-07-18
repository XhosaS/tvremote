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
public final class hcn implements hcl, hdb, hcr {
    float a;
    private final Path b;
    private final Paint c;
    private final hfk d;
    private final String e;
    private final boolean f;
    private final List g;
    private final hdg h;
    private final hdg i;
    private hdg j;
    private final hbv k;
    private hdg l;
    private hdj m;

    public hcn(hbv hbvVar, hfk hfkVar, hfe hfeVar) {
        Path path = new Path();
        this.b = path;
        this.c = new hch(1);
        this.g = new ArrayList();
        this.d = hfkVar;
        this.e = hfeVar.b;
        this.f = hfeVar.e;
        this.k = hbvVar;
        if (hfkVar.q() != null) {
            hdg hdgVarA = ((hei) hfkVar.q().a).a();
            this.l = hdgVarA;
            hdgVarA.h(this);
            hfkVar.i(this.l);
        }
        if (hfkVar.r() != null) {
            this.m = new hdj(this, hfkVar, hfkVar.r());
        }
        if (hfeVar.c == null) {
            this.h = null;
            this.i = null;
            return;
        }
        path.setFillType(hfeVar.a);
        hdg hdgVarA2 = hfeVar.c.a();
        this.h = hdgVarA2;
        hdgVarA2.h(this);
        hfkVar.i(hdgVarA2);
        hdg hdgVarA3 = hfeVar.d.a();
        this.i = hdgVarA3;
        hdgVarA3.h(this);
        hfkVar.i(hdgVarA3);
    }

    @Override // defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        hdj hdjVar;
        hdj hdjVar2;
        hdj hdjVar3;
        hdj hdjVar4;
        hdj hdjVar5;
        if (obj == hca.a) {
            this.h.d = hhuVar;
            return;
        }
        if (obj == hca.d) {
            this.i.d = hhuVar;
            return;
        }
        if (obj == hca.K) {
            hdg hdgVar = this.j;
            if (hdgVar != null) {
                this.d.k(hdgVar);
            }
            hdx hdxVar = new hdx(hhuVar);
            this.j = hdxVar;
            hdxVar.h(this);
            this.d.i(this.j);
            return;
        }
        if (obj == hca.j) {
            hdg hdgVar2 = this.l;
            if (hdgVar2 != null) {
                hdgVar2.d = hhuVar;
                return;
            }
            hdx hdxVar2 = new hdx(hhuVar);
            this.l = hdxVar2;
            hdxVar2.h(this);
            this.d.i(this.l);
            return;
        }
        if (obj == hca.e && (hdjVar5 = this.m) != null) {
            hdjVar5.b(hhuVar);
            return;
        }
        if (obj == hca.G && (hdjVar4 = this.m) != null) {
            hdjVar4.f(hhuVar);
            return;
        }
        if (obj == hca.H && (hdjVar3 = this.m) != null) {
            hdjVar3.c(hhuVar);
            return;
        }
        if (obj == hca.I && (hdjVar2 = this.m) != null) {
            hdjVar2.e(hhuVar);
        } else {
            if (obj != hca.J || (hdjVar = this.m) == null) {
                return;
            }
            hdjVar.g(hhuVar);
        }
    }

    @Override // defpackage.hcl
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        hdg hdgVar = this.h;
        hdg hdgVar2 = this.i;
        int iK = ((hdh) hdgVar).k();
        float fIntValue = ((Integer) hdgVar2.e()).intValue();
        Paint paint = this.c;
        paint.setColor((hhm.e((int) ((((i / 255.0f) * fIntValue) / 100.0f) * 255.0f)) << 24) | (iK & 16777215));
        hdg hdgVar3 = this.j;
        if (hdgVar3 != null) {
            paint.setColorFilter((ColorFilter) hdgVar3.e());
        }
        hdg hdgVar4 = this.l;
        if (hdgVar4 != null) {
            float fFloatValue = ((Float) hdgVar4.e()).floatValue();
            if (fFloatValue == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue != this.a) {
                paint.setMaskFilter(this.d.h(fFloatValue));
            }
            this.a = fFloatValue;
        }
        hdj hdjVar = this.m;
        if (hdjVar != null) {
            hdjVar.a(paint);
        }
        Path path = this.b;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.g;
            if (i2 >= list.size()) {
                canvas.drawPath(path, paint);
                hbd.a();
                return;
            } else {
                path.addPath(((hct) list.get(i2)).i(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.hcl
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
                path.addPath(((hct) list.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.hdb
    public final void d() {
        this.k.invalidateSelf();
    }

    @Override // defpackage.hee
    public final void e(hed hedVar, int i, List list, hed hedVar2) {
        hhm.d(hedVar, i, list, hedVar2, this);
    }

    @Override // defpackage.hcj
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            hcj hcjVar = (hcj) list2.get(i);
            if (hcjVar instanceof hct) {
                this.g.add((hct) hcjVar);
            }
        }
    }

    @Override // defpackage.hcj
    public final String g() {
        return this.e;
    }
}
