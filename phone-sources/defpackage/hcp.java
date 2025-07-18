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
public final class hcp extends hci {
    private final String d;
    private final boolean e;
    private final jn f;
    private final jn g;
    private final RectF h;
    private final int i;
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private hdx m;
    private final int n;

    public hcp(hbv hbvVar, hfk hfkVar, hex hexVar) {
        super(hbvVar, hfkVar, hjs.u(hexVar.l), hjs.t(hexVar.m), hexVar.g, hexVar.c, hexVar.f, hexVar.h, hexVar.i);
        this.f = new jn();
        this.g = new jn();
        this.h = new RectF();
        this.d = hexVar.a;
        this.n = hexVar.k;
        this.e = hexVar.j;
        this.i = (int) (hbvVar.a.a() / 32.0f);
        hdg hdgVarA = hexVar.b.a();
        this.j = hdgVarA;
        hdgVarA.h(this);
        hfkVar.i(hdgVarA);
        hdg hdgVarA2 = hexVar.d.a();
        this.k = hdgVarA2;
        hdgVarA2.h(this);
        hfkVar.i(hdgVarA2);
        hdg hdgVarA3 = hexVar.e.a();
        this.l = hdgVarA3;
        hdgVarA3.h(this);
        hfkVar.i(hdgVarA3);
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
        hdx hdxVar = this.m;
        if (hdxVar != null) {
            Integer[] numArr = (Integer[]) hdxVar.e();
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

    @Override // defpackage.hci, defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        super.a(obj, hhuVar);
        if (obj == hca.L) {
            hdx hdxVar = this.m;
            if (hdxVar != null) {
                this.a.k(hdxVar);
            }
            hdx hdxVar2 = new hdx(hhuVar);
            this.m = hdxVar2;
            hdxVar2.h(this);
            this.a.i(this.m);
        }
    }

    @Override // defpackage.hci, defpackage.hcl
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.e) {
            return;
        }
        c(this.h, matrix, false);
        if (this.n == 1) {
            int iH = h();
            jn jnVar = this.f;
            long j = iH;
            shader = (LinearGradient) jnVar.e(j);
            if (shader == null) {
                PointF pointF = (PointF) this.k.e();
                PointF pointF2 = (PointF) this.l.e();
                ghd ghdVar = (ghd) this.j.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i((int[]) ghdVar.b), (float[]) ghdVar.a, Shader.TileMode.CLAMP);
                jnVar.j(j, radialGradient);
                shader = radialGradient;
            }
        } else {
            int iH2 = h();
            jn jnVar2 = this.g;
            long j2 = iH2;
            shader = (RadialGradient) jnVar2.e(j2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.k.e();
                PointF pointF4 = (PointF) this.l.e();
                ghd ghdVar2 = (ghd) this.j.e();
                int[] iArrI = i((int[]) ghdVar2.b);
                Object obj = ghdVar2.a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrI, (float[]) obj, Shader.TileMode.CLAMP);
                jnVar2.j(j2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.hcj
    public final String g() {
        return this.d;
    }
}
