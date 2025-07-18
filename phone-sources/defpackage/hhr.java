package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhr {
    private static final ThreadLocal b = new hhn();
    private static final ThreadLocal c = new hho();
    private static final ThreadLocal d = new hhp();
    public static final ThreadLocal a = new hhq();
    private static final float e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static float a() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float b(Matrix matrix) {
        float[] fArr = (float[]) a.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap c(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void d(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) b.get();
        Path path2 = (Path) c.get();
        Path path3 = (Path) d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            hbd.a();
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            hbd.a();
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = hhm.b(fMin, length);
            fMax = hhm.b(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = hhm.b(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = hhm.b(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            hbd.a();
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        hbd.a();
    }

    public static void e(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void f(Canvas canvas, RectF rectF, Paint paint) {
        canvas.saveLayer(rectF, paint);
        hbd.a();
    }
}
