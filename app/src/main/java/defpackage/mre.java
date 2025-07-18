package defpackage;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mre {
    public LinearGradient a;
    private final float b;
    private final int[] c;
    private final float[] d;
    private final PointF e;
    private final PointF f;
    private final oco g;
    private final int h;

    public mre(float f, PointF pointF, PointF pointF2, int[] iArr, float[] fArr, int i, oco ocoVar) {
        this.b = f;
        this.c = iArr;
        this.d = fArr;
        this.e = pointF;
        this.f = pointF2;
        this.h = i;
        this.g = ocoVar;
    }

    static LinearGradient a(float f, float f2, float f3, float f4, int[] iArr, float[] fArr) {
        return (fArr == null || iArr.length != fArr.length) ? new LinearGradient(f, f2, f3, f4, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(f, f2, f3, f4, iArr, fArr, Shader.TileMode.CLAMP);
    }

    static PointF b(PointF pointF, double d, float f) {
        double dTan = Math.tan(Math.toRadians(f + 90.0f));
        double d2 = pointF.y;
        double dPow = Math.pow(dTan, 2.0d) + 1.0d;
        PointF pointF2 = new PointF();
        double d3 = (-(((pointF.x * dTan) + (-d2)) + d)) / dPow;
        pointF2.x = (float) (pointF.x + (dTan * d3));
        pointF2.y = (float) (pointF.y + (-d3));
        return pointF2;
    }

    static PointF c(RectF rectF, int i, oco ocoVar) {
        if (i == 0) {
            return new PointF(rectF.left, rectF.bottom);
        }
        if (i == 1) {
            return new PointF(rectF.left, rectF.top);
        }
        if (i == 2) {
            return new PointF(rectF.right, rectF.top);
        }
        if (i == 3) {
            return new PointF(rectF.right, rectF.bottom);
        }
        ocoVar.b(acsw.LOG_TYPE_INVALID_FIELD, oal.A, "ElementsLinearGradientWrapper Quadrant has to be in the range 0 to 3", new Object[0]);
        return new PointF(rectF.left, rectF.bottom);
    }

    public final void d(RectF rectF, boolean z, boolean z2) {
        float fAbs;
        float fAbs2;
        PointF pointF;
        float fWidth;
        float fWidth2;
        float fHeight;
        float fHeight2;
        PointF pointF2 = this.e;
        if (pointF2 == null || (pointF = this.f) == null) {
            float f = this.b;
            float fCenterX = rectF.centerX();
            double dCenterY = rectF.centerY();
            double dTan = Math.tan(Math.toRadians(f + 90.0f)) * fCenterX;
            int i = (int) (f / 90.0f);
            int i2 = (i + 2) % 4;
            oco ocoVar = this.g;
            double d = dCenterY - dTan;
            PointF pointFB = b(c(rectF, i % 4, ocoVar), d, f);
            PointF pointFB2 = b(c(rectF, i2, ocoVar), d, f);
            if (z && z2) {
                fAbs = rectF.right - Math.abs(pointFB.x - rectF.left);
                fAbs2 = rectF.right - Math.abs(pointFB2.x - rectF.left);
            } else {
                fAbs = pointFB.x;
                fAbs2 = pointFB2.x;
            }
            this.a = a(fAbs, pointFB.y, fAbs2, pointFB2.y, this.c, this.d);
            return;
        }
        if (this.h - 1 != 1) {
            if (z && z2) {
                fWidth = rectF.right - (rectF.width() * pointF2.x);
                fWidth2 = rectF.right - (rectF.width() * pointF.x);
            } else {
                fWidth = rectF.left + (rectF.width() * pointF2.x);
                fWidth2 = rectF.left + (rectF.width() * pointF.x);
            }
            fHeight = rectF.top + (rectF.height() * pointF2.y);
            fHeight2 = rectF.top + (rectF.height() * pointF.y);
        } else {
            if (z && z2) {
                fWidth = rectF.right - pointF2.x;
                fWidth2 = rectF.right - pointF.x;
            } else {
                fWidth = rectF.left + pointF2.x;
                fWidth2 = rectF.left + pointF.x;
            }
            fHeight = rectF.top + pointF2.y;
            fHeight2 = pointF.y + rectF.top;
        }
        this.a = a(fWidth, fHeight, fWidth2, fHeight2, this.c, this.d);
    }
}
