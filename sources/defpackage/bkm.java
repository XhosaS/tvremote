package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkm extends bkq {
    private final bko a;
    private final float b;
    private final float e;

    public bkm(bko bkoVar, float f, float f2) {
        this.a = bkoVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.bkq
    public final void a(Matrix matrix, bjt bjtVar, int i, Canvas canvas) {
        bko bkoVar = this.a;
        float f = bkoVar.b;
        float f2 = this.e;
        float f3 = bkoVar.a;
        float f4 = this.b;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = bjt.a;
        iArr[0] = bjtVar.j;
        iArr[1] = bjtVar.i;
        iArr[2] = bjtVar.h;
        LinearGradient linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, bjt.b, Shader.TileMode.CLAMP);
        Paint paint = bjtVar.g;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    final float b() {
        bko bkoVar = this.a;
        return (float) Math.toDegrees(Math.atan((bkoVar.b - this.e) / (bkoVar.a - this.b)));
    }
}
