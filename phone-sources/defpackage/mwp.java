package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwp extends hrf {
    private final int b;
    private final int c;

    public mwp(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        messageDigest.update("top_horizontal_gradient:11".getBytes(a));
    }

    @Override // defpackage.hrf
    protected final Bitmap c(hod hodVar, Bitmap bitmap, int i, int i2) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i * 0.3f, this.b, this.c, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(linearGradient);
        new Canvas(bitmap).drawPaint(paint);
        return bitmap;
    }
}
