package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdw {
    public hdg a;
    public hdg b;
    public hdg c;
    public hdg d;
    public hdg e;
    public hdk f;
    public hdk g;
    public hdg h;
    public hdg i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public hdw(her herVar) {
        hel helVar = herVar.a;
        this.a = helVar == null ? null : helVar.a();
        hes hesVar = herVar.b;
        this.b = hesVar == null ? null : hesVar.a();
        hen henVar = herVar.c;
        this.c = henVar == null ? null : henVar.a();
        hei heiVar = herVar.d;
        this.d = heiVar == null ? null : heiVar.a();
        hei heiVar2 = herVar.f;
        hdk hdkVar = (hdk) (heiVar2 == null ? null : heiVar2.a());
        this.f = hdkVar;
        if (hdkVar != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        hei heiVar3 = herVar.g;
        this.g = (hdk) (heiVar3 == null ? null : heiVar3.a());
        hek hekVar = herVar.e;
        if (hekVar != null) {
            this.e = hekVar.a();
        }
        hei heiVar4 = herVar.h;
        if (heiVar4 != null) {
            this.h = heiVar4.a();
        } else {
            this.h = null;
        }
        hei heiVar5 = herVar.i;
        if (heiVar5 != null) {
            this.i = heiVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a() {
        PointF pointF;
        PointF pointF2;
        Matrix matrix = this.j;
        matrix.reset();
        hdg hdgVar = this.b;
        if (hdgVar != null && (pointF2 = (PointF) hdgVar.e()) != null && (pointF2.x != 0.0f || pointF2.y != 0.0f)) {
            matrix.preTranslate(pointF2.x, pointF2.y);
        }
        hdg hdgVar2 = this.d;
        if (hdgVar2 != null) {
            float fFloatValue = hdgVar2 instanceof hdx ? ((Float) hdgVar2.e()).floatValue() : ((hdk) hdgVar2).k();
            if (fFloatValue != 0.0f) {
                matrix.preRotate(fFloatValue);
            }
        }
        if (this.f != null) {
            float fCos = this.g == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.k()) + 90.0f));
            float fSin = this.g == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.k()));
            f();
            float[] fArr = this.n;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f = -fSin;
            fArr[3] = f;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.k;
            matrix2.setValues(fArr);
            f();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.l;
            matrix3.setValues(fArr);
            f();
            fArr[0] = fCos;
            fArr[1] = f;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.m;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        hdg hdgVar3 = this.c;
        if (hdgVar3 != null) {
            hhv hhvVar = (hhv) hdgVar3.e();
            float f2 = hhvVar.a;
            if (f2 != 1.0f || hhvVar.b != 1.0f) {
                matrix.preScale(f2, hhvVar.b);
            }
        }
        hdg hdgVar4 = this.a;
        if (hdgVar4 != null && (((pointF = (PointF) hdgVar4.e()) != null && pointF.x != 0.0f) || pointF.y != 0.0f)) {
            matrix.preTranslate(-pointF.x, -pointF.y);
        }
        return matrix;
    }

    public final Matrix b(float f) {
        hdg hdgVar = this.b;
        PointF pointF = hdgVar == null ? null : (PointF) hdgVar.e();
        hdg hdgVar2 = this.c;
        hhv hhvVar = hdgVar2 == null ? null : (hhv) hdgVar2.e();
        Matrix matrix = this.j;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (hhvVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(hhvVar.a, d), (float) Math.pow(hhvVar.b, d));
        }
        hdg hdgVar3 = this.d;
        if (hdgVar3 != null) {
            float fFloatValue = ((Float) hdgVar3.e()).floatValue();
            hdg hdgVar4 = this.a;
            PointF pointF2 = hdgVar4 != null ? (PointF) hdgVar4.e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }

    public final void c(hfk hfkVar) {
        hfkVar.i(this.e);
        hfkVar.i(this.h);
        hfkVar.i(this.i);
        hfkVar.i(this.a);
        hfkVar.i(this.b);
        hfkVar.i(this.c);
        hfkVar.i(this.d);
        hfkVar.i(this.f);
        hfkVar.i(this.g);
    }

    public final void d(hdb hdbVar) {
        hdg hdgVar = this.e;
        if (hdgVar != null) {
            hdgVar.h(hdbVar);
        }
        hdg hdgVar2 = this.h;
        if (hdgVar2 != null) {
            hdgVar2.h(hdbVar);
        }
        hdg hdgVar3 = this.i;
        if (hdgVar3 != null) {
            hdgVar3.h(hdbVar);
        }
        hdg hdgVar4 = this.a;
        if (hdgVar4 != null) {
            hdgVar4.h(hdbVar);
        }
        hdg hdgVar5 = this.b;
        if (hdgVar5 != null) {
            hdgVar5.h(hdbVar);
        }
        hdg hdgVar6 = this.c;
        if (hdgVar6 != null) {
            hdgVar6.h(hdbVar);
        }
        hdg hdgVar7 = this.d;
        if (hdgVar7 != null) {
            hdgVar7.h(hdbVar);
        }
        hdk hdkVar = this.f;
        if (hdkVar != null) {
            hdkVar.h(hdbVar);
        }
        hdk hdkVar2 = this.g;
        if (hdkVar2 != null) {
            hdkVar2.h(hdbVar);
        }
    }

    public final boolean e(Object obj, hhu hhuVar) {
        if (obj == hca.f) {
            hdg hdgVar = this.a;
            if (hdgVar == null) {
                this.a = new hdx(hhuVar, new PointF());
                return true;
            }
            hdgVar.d = hhuVar;
            return true;
        }
        if (obj == hca.g) {
            hdg hdgVar2 = this.b;
            if (hdgVar2 == null) {
                this.b = new hdx(hhuVar, new PointF());
                return true;
            }
            hdgVar2.d = hhuVar;
            return true;
        }
        if (obj == hca.h) {
            hdg hdgVar3 = this.b;
            if (hdgVar3 instanceof hdt) {
                hdt hdtVar = (hdt) hdgVar3;
                hhu hhuVar2 = hdtVar.e;
                hdtVar.e = hhuVar;
                return true;
            }
        }
        if (obj == hca.i) {
            hdg hdgVar4 = this.b;
            if (hdgVar4 instanceof hdt) {
                hdt hdtVar2 = (hdt) hdgVar4;
                hhu hhuVar3 = hdtVar2.f;
                hdtVar2.f = hhuVar;
                return true;
            }
        }
        if (obj == hca.o) {
            hdg hdgVar5 = this.c;
            if (hdgVar5 == null) {
                this.c = new hdx(hhuVar, new hhv());
                return true;
            }
            hdgVar5.d = hhuVar;
            return true;
        }
        if (obj == hca.p) {
            hdg hdgVar6 = this.d;
            if (hdgVar6 == null) {
                this.d = new hdx(hhuVar, Float.valueOf(0.0f));
                return true;
            }
            hdgVar6.d = hhuVar;
            return true;
        }
        if (obj == hca.c) {
            hdg hdgVar7 = this.e;
            if (hdgVar7 == null) {
                this.e = new hdx(hhuVar, 100);
                return true;
            }
            hdgVar7.d = hhuVar;
            return true;
        }
        if (obj == hca.C) {
            hdg hdgVar8 = this.h;
            if (hdgVar8 == null) {
                this.h = new hdx(hhuVar, Float.valueOf(100.0f));
                return true;
            }
            hdgVar8.d = hhuVar;
            return true;
        }
        if (obj == hca.D) {
            hdg hdgVar9 = this.i;
            if (hdgVar9 == null) {
                this.i = new hdx(hhuVar, Float.valueOf(100.0f));
                return true;
            }
            hdgVar9.d = hhuVar;
            return true;
        }
        if (obj == hca.q) {
            if (this.f == null) {
                this.f = new hdk(Collections.singletonList(new hhs(Float.valueOf(0.0f))));
            }
            this.f.d = hhuVar;
            return true;
        }
        if (obj != hca.r) {
            return false;
        }
        if (this.g == null) {
            this.g = new hdk(Collections.singletonList(new hhs(Float.valueOf(0.0f))));
        }
        this.g.d = hhuVar;
        return true;
    }
}
