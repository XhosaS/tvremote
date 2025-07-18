package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vca extends vcf {
    private final vcc a;

    public vca(vcc vccVar) {
        this.a = vccVar;
    }

    @Override // defpackage.vcf
    public final void a(Matrix matrix, vbe vbeVar, int i, Canvas canvas) {
        vcc vccVar = this.a;
        float f = vccVar.e;
        float f2 = vccVar.f;
        RectF rectF = new RectF(vccVar.a, vccVar.b, vccVar.c, vccVar.d);
        boolean z = f2 < 0.0f;
        Path path = vbeVar.k;
        if (z) {
            int[] iArr = vbe.c;
            iArr[0] = 0;
            iArr[1] = vbeVar.j;
            iArr[2] = vbeVar.i;
            iArr[3] = vbeVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = vbe.c;
            iArr2[0] = 0;
            iArr2[1] = vbeVar.h;
            iArr2[2] = vbeVar.i;
            iArr2[3] = vbeVar.j;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = vbe.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, vbe.c, fArr, Shader.TileMode.CLAMP);
        boolean z2 = z;
        Paint paint = vbeVar.f;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, vbeVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
