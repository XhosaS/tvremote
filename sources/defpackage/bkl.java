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
/* loaded from: classes.dex */
final class bkl extends bkq {
    private final bkn a;

    public bkl(bkn bknVar) {
        this.a = bknVar;
    }

    @Override // defpackage.bkq
    public final void a(Matrix matrix, bjt bjtVar, int i, Canvas canvas) {
        bkn bknVar = this.a;
        float f = bknVar.e;
        float f2 = bknVar.f;
        RectF rectF = new RectF(bknVar.a, bknVar.b, bknVar.c, bknVar.d);
        boolean z = f2 < 0.0f;
        Path path = bjtVar.k;
        if (z) {
            int[] iArr = bjt.c;
            iArr[0] = 0;
            iArr[1] = bjtVar.j;
            iArr[2] = bjtVar.i;
            iArr[3] = bjtVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = bjt.c;
            iArr2[0] = 0;
            iArr2[1] = bjtVar.h;
            iArr2[2] = bjtVar.i;
            iArr2[3] = bjtVar.j;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = bjt.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, bjt.c, fArr, Shader.TileMode.CLAMP);
        boolean z2 = z;
        Paint paint = bjtVar.f;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, bjtVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
