package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vcb extends vcf {
    private final vcd a;
    private final float b;
    private final float e;

    public vcb(vcd vcdVar, float f, float f2) {
        this.a = vcdVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.vcf
    public final void a(Matrix matrix, vbe vbeVar, int i, Canvas canvas) {
        vcd vcdVar = this.a;
        float f = vcdVar.b;
        float f2 = this.e;
        float f3 = vcdVar.a;
        float f4 = this.b;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = vbe.a;
        iArr[0] = vbeVar.j;
        iArr[1] = vbeVar.i;
        iArr[2] = vbeVar.h;
        LinearGradient linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, vbe.b, Shader.TileMode.CLAMP);
        Paint paint = vbeVar.g;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    final float b() {
        vcd vcdVar = this.a;
        return (float) Math.toDegrees(Math.atan((vcdVar.b - this.e) / (vcdVar.a - this.b)));
    }
}
