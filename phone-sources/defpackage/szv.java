package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szv extends szz {
    private final szx a;
    private final float b;
    private final float e;

    public szv(szx szxVar, float f, float f2) {
        this.a = szxVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.szz
    public final void a(Matrix matrix, sza szaVar, int i, Canvas canvas) {
        szx szxVar = this.a;
        float f = szxVar.b;
        float f2 = this.e;
        float f3 = szxVar.a;
        float f4 = this.b;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = sza.a;
        iArr[0] = szaVar.j;
        iArr[1] = szaVar.i;
        iArr[2] = szaVar.h;
        LinearGradient linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, sza.b, Shader.TileMode.CLAMP);
        Paint paint = szaVar.g;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    final float b() {
        szx szxVar = this.a;
        return (float) Math.toDegrees(Math.atan((szxVar.b - this.e) / (szxVar.a - this.b)));
    }
}
