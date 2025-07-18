package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csk {
    public crt a;
    public crt b;
    public crt c;
    public crt d;
    public crt e;
    public crx f;
    public crx g;
    public crt h;
    public crt i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public csk(cti ctiVar) {
        ctb ctbVar = ctiVar.a;
        this.a = ctbVar == null ? null : ctbVar.a();
        ctj ctjVar = ctiVar.b;
        this.b = ctjVar == null ? null : ctjVar.a();
        ctd ctdVar = ctiVar.c;
        this.c = ctdVar == null ? null : ctdVar.a();
        csy csyVar = ctiVar.d;
        this.d = csyVar == null ? null : csyVar.a();
        csy csyVar2 = ctiVar.f;
        crx crxVar = (crx) (csyVar2 == null ? null : csyVar2.a());
        this.f = crxVar;
        if (crxVar != null) {
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
        csy csyVar3 = ctiVar.g;
        this.g = (crx) (csyVar3 == null ? null : csyVar3.a());
        cta ctaVar = ctiVar.e;
        if (ctaVar != null) {
            this.e = ctaVar.a();
        }
        csy csyVar4 = ctiVar.h;
        if (csyVar4 != null) {
            this.h = csyVar4.a();
        } else {
            this.h = null;
        }
        csy csyVar5 = ctiVar.i;
        if (csyVar5 != null) {
            this.i = csyVar5.a();
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
        crt crtVar = this.b;
        if (crtVar != null && (pointF2 = (PointF) crtVar.e()) != null && (pointF2.x != 0.0f || pointF2.y != 0.0f)) {
            matrix.preTranslate(pointF2.x, pointF2.y);
        }
        crt crtVar2 = this.d;
        if (crtVar2 != null) {
            float fFloatValue = crtVar2 instanceof csl ? ((Float) crtVar2.e()).floatValue() : ((crx) crtVar2).k();
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
        crt crtVar3 = this.c;
        if (crtVar3 != null) {
            cxc cxcVar = (cxc) crtVar3.e();
            float f2 = cxcVar.a;
            if (f2 != 1.0f || cxcVar.b != 1.0f) {
                matrix.preScale(f2, cxcVar.b);
            }
        }
        crt crtVar4 = this.a;
        if (crtVar4 != null && (((pointF = (PointF) crtVar4.e()) != null && pointF.x != 0.0f) || pointF.y != 0.0f)) {
            matrix.preTranslate(-pointF.x, -pointF.y);
        }
        return matrix;
    }

    public final Matrix b(float f) {
        crt crtVar = this.b;
        PointF pointF = crtVar == null ? null : (PointF) crtVar.e();
        crt crtVar2 = this.c;
        cxc cxcVar = crtVar2 == null ? null : (cxc) crtVar2.e();
        Matrix matrix = this.j;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (cxcVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(cxcVar.a, d), (float) Math.pow(cxcVar.b, d));
        }
        crt crtVar3 = this.d;
        if (crtVar3 != null) {
            float fFloatValue = ((Float) crtVar3.e()).floatValue();
            crt crtVar4 = this.a;
            PointF pointF2 = crtVar4 != null ? (PointF) crtVar4.e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }

    public final void c(cug cugVar) {
        cugVar.k(this.e);
        cugVar.k(this.h);
        cugVar.k(this.i);
        cugVar.k(this.a);
        cugVar.k(this.b);
        cugVar.k(this.c);
        cugVar.k(this.d);
        cugVar.k(this.f);
        cugVar.k(this.g);
    }

    public final void d(cro croVar) {
        crt crtVar = this.e;
        if (crtVar != null) {
            crtVar.h(croVar);
        }
        crt crtVar2 = this.h;
        if (crtVar2 != null) {
            crtVar2.h(croVar);
        }
        crt crtVar3 = this.i;
        if (crtVar3 != null) {
            crtVar3.h(croVar);
        }
        crt crtVar4 = this.a;
        if (crtVar4 != null) {
            crtVar4.h(croVar);
        }
        crt crtVar5 = this.b;
        if (crtVar5 != null) {
            crtVar5.h(croVar);
        }
        crt crtVar6 = this.c;
        if (crtVar6 != null) {
            crtVar6.h(croVar);
        }
        crt crtVar7 = this.d;
        if (crtVar7 != null) {
            crtVar7.h(croVar);
        }
        crx crxVar = this.f;
        if (crxVar != null) {
            crxVar.h(croVar);
        }
        crx crxVar2 = this.g;
        if (crxVar2 != null) {
            crxVar2.h(croVar);
        }
    }

    public final boolean e(Object obj, cxb cxbVar) {
        if (obj == cqi.f) {
            crt crtVar = this.a;
            if (crtVar == null) {
                this.a = new csl(cxbVar, new PointF());
                return true;
            }
            crtVar.d = cxbVar;
            return true;
        }
        if (obj == cqi.g) {
            crt crtVar2 = this.b;
            if (crtVar2 == null) {
                this.b = new csl(cxbVar, new PointF());
                return true;
            }
            crtVar2.d = cxbVar;
            return true;
        }
        if (obj == cqi.h) {
            crt crtVar3 = this.b;
            if (crtVar3 instanceof csh) {
                csh cshVar = (csh) crtVar3;
                cxb cxbVar2 = cshVar.e;
                cshVar.e = cxbVar;
                return true;
            }
        }
        if (obj == cqi.i) {
            crt crtVar4 = this.b;
            if (crtVar4 instanceof csh) {
                csh cshVar2 = (csh) crtVar4;
                cxb cxbVar3 = cshVar2.f;
                cshVar2.f = cxbVar;
                return true;
            }
        }
        if (obj == cqi.o) {
            crt crtVar5 = this.c;
            if (crtVar5 == null) {
                this.c = new csl(cxbVar, new cxc(1.0f, 1.0f));
                return true;
            }
            crtVar5.d = cxbVar;
            return true;
        }
        if (obj == cqi.p) {
            crt crtVar6 = this.d;
            if (crtVar6 == null) {
                this.d = new csl(cxbVar, Float.valueOf(0.0f));
                return true;
            }
            crtVar6.d = cxbVar;
            return true;
        }
        if (obj == cqi.c) {
            crt crtVar7 = this.e;
            if (crtVar7 == null) {
                this.e = new csl(cxbVar, 100);
                return true;
            }
            crtVar7.d = cxbVar;
            return true;
        }
        if (obj == cqi.C) {
            crt crtVar8 = this.h;
            if (crtVar8 == null) {
                this.h = new csl(cxbVar, Float.valueOf(100.0f));
                return true;
            }
            crtVar8.d = cxbVar;
            return true;
        }
        if (obj == cqi.D) {
            crt crtVar9 = this.i;
            if (crtVar9 == null) {
                this.i = new csl(cxbVar, Float.valueOf(100.0f));
                return true;
            }
            crtVar9.d = cxbVar;
            return true;
        }
        if (obj == cqi.q) {
            if (this.f == null) {
                this.f = new crx(Collections.singletonList(new cwz(Float.valueOf(0.0f))));
            }
            this.f.d = cxbVar;
            return true;
        }
        if (obj != cqi.r) {
            return false;
        }
        if (this.g == null) {
            this.g = new crx(Collections.singletonList(new cwz(Float.valueOf(0.0f))));
        }
        this.g.d = cxbVar;
        return true;
    }
}
