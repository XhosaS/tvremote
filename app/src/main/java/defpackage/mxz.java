package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mxz extends mxp {
    private final float a;
    private final RectF b;
    private final Paint c;
    private final oco d;
    private Path e;

    public mxz(int i, float f, RectF rectF, oco ocoVar) {
        this.a = f;
        this.b = rectF;
        Paint paint = new Paint();
        this.c = paint;
        this.d = ocoVar;
        paint.setColor(i);
        paint.setAntiAlias(true);
    }

    public static float[] d(float f) {
        return new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
    }

    public static float[] e(float f) {
        return new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7 A[Catch: IndexOutOfBoundsException -> 0x018f, TryCatch #0 {IndexOutOfBoundsException -> 0x018f, blocks: (B:29:0x0072, B:31:0x00a7, B:33:0x00b3, B:35:0x00b9, B:36:0x00bc, B:54:0x00fe, B:59:0x010c, B:63:0x0116, B:65:0x011c, B:67:0x0126, B:70:0x0143, B:73:0x0164, B:75:0x016d, B:74:0x0169, B:78:0x0178, B:80:0x0181, B:79:0x017d, B:81:0x0188, B:39:0x00c1, B:48:0x00e5, B:51:0x00ed, B:53:0x00f7, B:42:0x00ca, B:44:0x00d9, B:47:0x00e2), top: B:96:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.graphics.Path f(android.text.Layout r35) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxz.f(android.text.Layout):android.graphics.Path");
    }

    @Override // defpackage.mxp
    public final void a(Canvas canvas) {
        Path path = this.e;
        if (path != null) {
            canvas.drawPath(path, this.c);
        }
    }

    @Override // defpackage.mxp
    public final void b() {
        this.e = null;
    }

    @Override // defpackage.mxp
    public final void c(Layout layout) {
        this.e = f(layout);
    }
}
