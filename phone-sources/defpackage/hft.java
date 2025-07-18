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
public final class hft extends hfk {
    private hdg A;
    private hdg B;
    private hdg C;
    private hdg D;
    private final StringBuilder j;
    private final RectF k;
    private final Matrix l;
    private final Paint m;
    private final Paint n;
    private final Map o;
    private final jn p;
    private final List q;
    private final hdv r;
    private final hbv s;
    private final hbk t;
    private hdg u;
    private hdg v;
    private hdg w;
    private hdg x;
    private hdg y;
    private hdg z;

    public hft(hbv hbvVar, hfn hfnVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        super(hbvVar, hfnVar);
        this.j = new StringBuilder(2);
        this.k = new RectF();
        this.l = new Matrix();
        this.m = new hfr(null);
        this.n = new hfr();
        this.o = new HashMap();
        this.p = new jn();
        this.q = new ArrayList();
        this.s = hbvVar;
        this.t = hfnVar.b;
        hdv hdvVarA = hfnVar.p.a();
        this.r = hdvVarA;
        hdvVarA.h(this);
        i(hdvVarA);
        isy isyVar = hfnVar.x;
        if (isyVar != null && (obj4 = isyVar.b) != null) {
            hdg hdgVarA = ((heh) obj4).a();
            this.u = hdgVarA;
            hdgVarA.h(this);
            i(this.u);
        }
        if (isyVar != null && (obj3 = isyVar.c) != null) {
            hdg hdgVarA2 = ((heh) obj3).a();
            this.w = hdgVarA2;
            hdgVarA2.h(this);
            i(this.w);
        }
        if (isyVar != null && (obj2 = isyVar.a) != null) {
            hdg hdgVarA3 = ((hei) obj2).a();
            this.y = hdgVarA3;
            hdgVarA3.h(this);
            i(this.y);
        }
        if (isyVar == null || (obj = isyVar.d) == null) {
            return;
        }
        hdg hdgVarA4 = ((hei) obj).a();
        this.A = hdgVarA4;
        hdgVarA4.h(this);
        i(this.A);
    }

    private final hfs s(int i) {
        List list = this.q;
        for (int size = list.size(); size < i; size++) {
            list.add(new hfs());
        }
        return (hfs) list.get(i - 1);
    }

    private final List t(String str, float f, heb hebVar, float f2, float f3, boolean z) {
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
                hec hecVar = (hec) kq.a(this.t.d, hec.a(cCharAt, hebVar.a, hebVar.c));
                if (hecVar != null) {
                    fMeasureText = ((float) hecVar.b) * f2 * hhr.a();
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
                hfs hfsVarS = s(i2);
                if (i4 == i3) {
                    hfsVarS.a(str.substring(i3, i).trim(), (f5 - f8) - ((r10.length() - r8.length()) * f7));
                    f5 = f8;
                    f6 = f5;
                    i3 = i;
                    i4 = i3;
                } else {
                    hfsVarS.a(str.substring(i3, i4 - 1).trim(), ((f5 - f6) - ((r3.length() - r5.length()) * f7)) - f7);
                    f5 = f6;
                    i3 = i4;
                }
            }
            i = i5;
        }
        if (f5 > 0.0f) {
            i2++;
            s(i2).a(str.substring(i3), f5);
        }
        return this.q.subList(0, i2);
    }

    private static final void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private static final void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static final List w(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private static final void x(Canvas canvas, hea heaVar, int i, float f) {
        PointF pointF = heaVar.k;
        PointF pointF2 = heaVar.l;
        float fA = hhr.a();
        float f2 = pointF == null ? 0.0f : (heaVar.e * fA) + pointF.y;
        float f3 = i * heaVar.e * fA;
        float f4 = pointF == null ? 0.0f : pointF.x;
        float f5 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = heaVar.m;
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

    @Override // defpackage.hfk, defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        super.a(obj, hhuVar);
        if (obj == hca.a) {
            hdg hdgVar = this.v;
            if (hdgVar != null) {
                k(hdgVar);
            }
            hdx hdxVar = new hdx(hhuVar);
            this.v = hdxVar;
            hdxVar.h(this);
            i(this.v);
            return;
        }
        if (obj == hca.b) {
            hdg hdgVar2 = this.x;
            if (hdgVar2 != null) {
                k(hdgVar2);
            }
            hdx hdxVar2 = new hdx(hhuVar);
            this.x = hdxVar2;
            hdxVar2.h(this);
            i(this.x);
            return;
        }
        if (obj == hca.s) {
            hdg hdgVar3 = this.z;
            if (hdgVar3 != null) {
                k(hdgVar3);
            }
            hdx hdxVar3 = new hdx(hhuVar);
            this.z = hdxVar3;
            hdxVar3.h(this);
            i(this.z);
            return;
        }
        if (obj == hca.t) {
            hdg hdgVar4 = this.B;
            if (hdgVar4 != null) {
                k(hdgVar4);
            }
            hdx hdxVar4 = new hdx(hhuVar);
            this.B = hdxVar4;
            hdxVar4.h(this);
            i(this.B);
            return;
        }
        if (obj == hca.F) {
            hdg hdgVar5 = this.C;
            if (hdgVar5 != null) {
                k(hdgVar5);
            }
            hdx hdxVar5 = new hdx(hhuVar);
            this.C = hdxVar5;
            hdxVar5.h(this);
            i(this.C);
            return;
        }
        if (obj != hca.M) {
            if (obj == hca.O) {
                this.r.d = new hdu(new hht(), hhuVar, new hea());
                return;
            }
            return;
        }
        hdg hdgVar6 = this.D;
        if (hdgVar6 != null) {
            k(hdgVar6);
        }
        hdx hdxVar6 = new hdx(hhuVar);
        this.D = hdxVar6;
        hdxVar6.h(this);
        i(this.D);
    }

    @Override // defpackage.hfk, defpackage.hcl
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        hbk hbkVar = this.t;
        rectF.set(0.0f, 0.0f, hbkVar.g.width(), hbkVar.g.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.hfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hft.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
