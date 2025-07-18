package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crc extends cqu {
    private final String d;
    private final boolean e;
    private final wr f;
    private final wr g;
    private final RectF h;
    private final int i;
    private final crt j;
    private final crt k;
    private final crt l;
    private csl m;
    private final int n;

    public crc(cqd cqdVar, cug cugVar, ctq ctqVar) {
        super(cqdVar, cugVar, cub.a(ctqVar.l), cuc.a(ctqVar.m), ctqVar.g, ctqVar.c, ctqVar.f, ctqVar.h, ctqVar.i);
        this.f = new wr(10);
        this.g = new wr(10);
        this.h = new RectF();
        this.d = ctqVar.a;
        this.n = ctqVar.k;
        this.e = ctqVar.j;
        this.i = (int) (cqdVar.a.a() / 32.0f);
        crt crtVarA = ctqVar.b.a();
        this.j = crtVarA;
        crtVarA.h(this);
        cugVar.k(crtVarA);
        crt crtVarA2 = ctqVar.d.a();
        this.k = crtVarA2;
        crtVarA2.h(this);
        cugVar.k(crtVarA2);
        crt crtVarA3 = ctqVar.e.a();
        this.l = crtVarA3;
        crtVarA3.h(this);
        cugVar.k(crtVarA3);
    }

    private final int h() {
        float f = this.k.c;
        float f2 = this.i;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.l.c * f2);
        int iRound3 = Math.round(this.j.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        csl cslVar = this.m;
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

    @Override // defpackage.cqu, defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        super.a(obj, cxbVar);
        if (obj == cqi.L) {
            csl cslVar = this.m;
            if (cslVar != null) {
                this.a.m(cslVar);
            }
            csl cslVar2 = new csl(cxbVar, null);
            this.m = cslVar2;
            cslVar2.h(this);
            this.a.k(this.m);
        }
    }

    @Override // defpackage.cqu, defpackage.cqy
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.e) {
            return;
        }
        c(this.h, matrix, false);
        if (this.n == 1) {
            int iH = h();
            wr wrVar = this.f;
            long j = iH;
            shader = (LinearGradient) wrVar.e(j);
            if (shader == null) {
                PointF pointF = (PointF) this.k.e();
                PointF pointF2 = (PointF) this.l.e();
                cto ctoVar = (cto) this.j.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i(ctoVar.b), ctoVar.a, Shader.TileMode.CLAMP);
                wrVar.i(j, radialGradient);
                shader = radialGradient;
            }
        } else {
            int iH2 = h();
            wr wrVar2 = this.g;
            long j2 = iH2;
            shader = (RadialGradient) wrVar2.e(j2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.k.e();
                PointF pointF4 = (PointF) this.l.e();
                cto ctoVar2 = (cto) this.j.e();
                int[] iArrI = i(ctoVar2.b);
                float[] fArr = ctoVar2.a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrI, fArr, Shader.TileMode.CLAMP);
                wrVar2.i(j2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.cqw
    public final String g() {
        return this.d;
    }
}
