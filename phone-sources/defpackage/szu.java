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
final class szu extends szz {
    private final szw a;

    public szu(szw szwVar) {
        this.a = szwVar;
    }

    @Override // defpackage.szz
    public final void a(Matrix matrix, sza szaVar, int i, Canvas canvas) {
        szw szwVar = this.a;
        float f = szwVar.e;
        float f2 = szwVar.f;
        RectF rectF = new RectF(szwVar.a, szwVar.b, szwVar.c, szwVar.d);
        boolean z = f2 < 0.0f;
        Path path = szaVar.k;
        if (z) {
            int[] iArr = sza.c;
            iArr[0] = 0;
            iArr[1] = szaVar.j;
            iArr[2] = szaVar.i;
            iArr[3] = szaVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = sza.c;
            iArr2[0] = 0;
            iArr2[1] = szaVar.h;
            iArr2[2] = szaVar.i;
            iArr2[3] = szaVar.j;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = sza.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, sza.c, fArr, Shader.TileMode.CLAMP);
        boolean z2 = z;
        Paint paint = szaVar.f;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, szaVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
