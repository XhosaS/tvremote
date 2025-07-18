package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cur extends cug {
    private crt A;
    private crt B;
    private crt C;
    private crt D;
    private final StringBuilder j;
    private final RectF k;
    private final Matrix l;
    private final Paint m;
    private final Paint n;
    private final Map o;
    private final wr p;
    private final List q;
    private final csj r;
    private final cqd s;
    private final cph t;
    private crt u;
    private crt v;
    private crt w;
    private crt x;
    private crt y;
    private crt z;

    public cur(cqd cqdVar, cuk cukVar) {
        csy csyVar;
        csy csyVar2;
        csx csxVar;
        csx csxVar2;
        super(cqdVar, cukVar);
        this.j = new StringBuilder(2);
        this.k = new RectF();
        this.l = new Matrix();
        this.m = new cuo();
        this.n = new cup();
        this.o = new HashMap();
        this.p = new wr(10);
        this.q = new ArrayList();
        this.s = cqdVar;
        this.t = cukVar.b;
        csj csjVarA = cukVar.p.a();
        this.r = csjVarA;
        csjVarA.h(this);
        k(csjVarA);
        cth cthVar = cukVar.q;
        if (cthVar != null && (csxVar2 = cthVar.a) != null) {
            crt crtVarA = csxVar2.a();
            this.u = crtVarA;
            crtVarA.h(this);
            k(this.u);
        }
        if (cthVar != null && (csxVar = cthVar.b) != null) {
            crt crtVarA2 = csxVar.a();
            this.w = crtVarA2;
            crtVarA2.h(this);
            k(this.w);
        }
        if (cthVar != null && (csyVar2 = cthVar.c) != null) {
            crt crtVarA3 = csyVar2.a();
            this.y = crtVarA3;
            crtVarA3.h(this);
            k(this.y);
        }
        if (cthVar == null || (csyVar = cthVar.d) == null) {
            return;
        }
        crt crtVarA4 = csyVar.a();
        this.A = crtVarA4;
        crtVarA4.h(this);
        k(this.A);
    }

    private final cuq s(int i) {
        List list = this.q;
        for (int size = list.size(); size < i; size++) {
            list.add(new cuq());
        }
        return (cuq) list.get(i - 1);
    }

    private final List t(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private final List u(String str, float f, csq csqVar, float f2, float f3, boolean z) {
        float f4;
        float fMeasureText;
        int i = 0;
        float f5 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        float f6 = 0.0f;
        int i4 = 0;
        float f7 = 0.0f;
        while (i < str.length()) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (z) {
                f4 = 0.0f;
                csr csrVar = (csr) wz.a(this.t.e, csr.a(cCharAt, csqVar.a, csqVar.c));
                if (csrVar != null) {
                    fMeasureText = ((float) csrVar.b) * f2 * cwy.a();
                } else {
                    i = i5;
                }
            } else {
                f4 = 0.0f;
                fMeasureText = this.m.measureText(str.substring(i, i5));
            }
            float f8 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f7 = f8;
            } else {
                if (z2) {
                    f6 = f8;
                    i4 = i;
                } else {
                    f6 += f8;
                }
                z2 = false;
            }
            f5 += f8;
            if (f > f4 && f5 >= f && cCharAt != ' ') {
                i2++;
                cuq cuqVarS = s(i2);
                if (i4 == i3) {
                    String strTrim = str.substring(i3, i).trim();
                    cuqVarS.a = strTrim;
                    cuqVarS.b = (f5 - f8) - ((strTrim.length() - r8.length()) * f7);
                    f5 = f8;
                    f6 = f5;
                    i3 = i;
                    i4 = i3;
                } else {
                    cuqVarS.a = str.substring(i3, i4 - 1).trim();
                    cuqVarS.b = ((f5 - f6) - ((r3.length() - r5.length()) * f7)) - f7;
                    f5 = f6;
                    i3 = i4;
                }
            }
            i = i5;
        }
        if (f5 > 0.0f) {
            i2++;
            cuq cuqVarS2 = s(i2);
            cuqVarS2.a = str.substring(i3);
            cuqVarS2.b = f5;
        }
        return this.q.subList(0, i2);
    }

    private final void v(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private final void w(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private final void x(Canvas canvas, csp cspVar, int i, float f) {
        PointF pointF = cspVar.k;
        PointF pointF2 = cspVar.l;
        float fA = cwy.a();
        float f2 = pointF == null ? 0.0f : (cspVar.e * fA) + pointF.y;
        float f3 = i * cspVar.e * fA;
        float f4 = pointF == null ? 0.0f : pointF.x;
        float f5 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = cspVar.m;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        float f6 = f3 + f2;
        if (i3 == 0) {
            canvas.translate(f4, f6);
        } else if (i3 == 1) {
            canvas.translate((f4 + f5) - f, f6);
        } else {
            if (i3 != 2) {
                return;
            }
            canvas.translate((f4 + (f5 / 2.0f)) - (f / 2.0f), f6);
        }
    }

    @Override // defpackage.cug, defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        this.g.e(obj, cxbVar);
        if (obj == cqi.a) {
            crt crtVar = this.v;
            if (crtVar != null) {
                m(crtVar);
            }
            csl cslVar = new csl(cxbVar, null);
            this.v = cslVar;
            cslVar.h(this);
            k(this.v);
            return;
        }
        if (obj == cqi.b) {
            crt crtVar2 = this.x;
            if (crtVar2 != null) {
                m(crtVar2);
            }
            csl cslVar2 = new csl(cxbVar, null);
            this.x = cslVar2;
            cslVar2.h(this);
            k(this.x);
            return;
        }
        if (obj == cqi.s) {
            crt crtVar3 = this.z;
            if (crtVar3 != null) {
                m(crtVar3);
            }
            csl cslVar3 = new csl(cxbVar, null);
            this.z = cslVar3;
            cslVar3.h(this);
            k(this.z);
            return;
        }
        if (obj == cqi.t) {
            crt crtVar4 = this.B;
            if (crtVar4 != null) {
                m(crtVar4);
            }
            csl cslVar4 = new csl(cxbVar, null);
            this.B = cslVar4;
            cslVar4.h(this);
            k(this.B);
            return;
        }
        if (obj == cqi.F) {
            crt crtVar5 = this.C;
            if (crtVar5 != null) {
                m(crtVar5);
            }
            csl cslVar5 = new csl(cxbVar, null);
            this.C = cslVar5;
            cslVar5.h(this);
            k(this.C);
            return;
        }
        if (obj != cqi.M) {
            if (obj == cqi.O) {
                this.r.d = new csi(new cxa(), cxbVar, new csp());
                return;
            }
            return;
        }
        crt crtVar6 = this.D;
        if (crtVar6 != null) {
            m(crtVar6);
        }
        csl cslVar6 = new csl(cxbVar, null);
        this.D = cslVar6;
        cslVar6.h(this);
        k(this.D);
    }

    @Override // defpackage.cug, defpackage.cqy
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        cph cphVar = this.t;
        rectF.set(0.0f, 0.0f, cphVar.h.width(), cphVar.h.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    @Override // defpackage.cug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cur.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
