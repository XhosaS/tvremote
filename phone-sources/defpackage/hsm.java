package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsm extends hrf {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(a);
    private final int c;

    public hsm(int i) {
        a.aD(i > 0, "roundingRadius must be greater than 0.");
        this.c = i;
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.hrf
    protected final Bitmap c(hod hodVar, Bitmap bitmap, int i, int i2) {
        int i3 = this.c;
        boolean z = i3 > 0;
        Paint paint = hsq.a;
        a.aD(z, "roundingRadius must be greater than 0.");
        Bitmap.Config configA = hsq.a(bitmap);
        Bitmap bitmapD = hsq.d(hodVar, bitmap);
        Bitmap bitmapA = hodVar.a(bitmapD.getWidth(), bitmapD.getHeight(), configA);
        bitmapA.setHasAlpha(true);
        BitmapShader bitmapShader = new BitmapShader(bitmapD, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapA.getWidth(), bitmapA.getHeight());
        hsq.c.lock();
        try {
            Canvas canvas = new Canvas(bitmapA);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            hsq.f(canvas);
            hsq.c.unlock();
            if (!bitmapD.equals(bitmap)) {
                hodVar.d(bitmapD);
            }
            return bitmapA;
        } catch (Throwable th) {
            hsq.c.unlock();
            throw th;
        }
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        return (obj instanceof hsm) && this.c == ((hsm) obj).c;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        return hwp.c(-569625254, hwp.c(this.c, 17));
    }
}
