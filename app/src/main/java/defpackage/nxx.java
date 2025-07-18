package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxx extends djg {
    private final Context b;
    private final oal c;
    private final float d;
    private final oco e;
    private final int f;

    public nxx(Context context, oal oalVar, oco ocoVar, int i, float f) {
        this.b = context.getApplicationContext();
        this.c = oalVar;
        this.e = ocoVar;
        this.f = i;
        this.d = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(android.graphics.Bitmap r9, float r10) throws java.lang.Throwable {
        /*
            r8 = this;
            r1 = 0
            android.content.Context r0 = r8.b     // Catch: java.lang.Throwable -> L3f android.renderscript.RSRuntimeException -> L44
            android.renderscript.RenderScript r0 = android.renderscript.RenderScript.create(r0)     // Catch: java.lang.Throwable -> L3f android.renderscript.RSRuntimeException -> L44
            android.renderscript.Element r2 = android.renderscript.Element.U8_4(r0)     // Catch: java.lang.Throwable -> L3f android.renderscript.RSRuntimeException -> L44
            android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r0, r2)     // Catch: java.lang.Throwable -> L3f android.renderscript.RSRuntimeException -> L44
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r0, r9)     // Catch: java.lang.Throwable -> L33 android.renderscript.RSRuntimeException -> L39
            android.renderscript.Type r4 = r3.getType()     // Catch: java.lang.Throwable -> L28 android.renderscript.RSRuntimeException -> L2c
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createTyped(r0, r4)     // Catch: java.lang.Throwable -> L28 android.renderscript.RSRuntimeException -> L2c
            r2.setRadius(r10)     // Catch: java.lang.Throwable -> L28 android.renderscript.RSRuntimeException -> L2c
            r2.setInput(r3)     // Catch: java.lang.Throwable -> L28 android.renderscript.RSRuntimeException -> L2c
            r2.forEach(r1)     // Catch: java.lang.Throwable -> L28 android.renderscript.RSRuntimeException -> L2c
            r1.copyTo(r9)     // Catch: java.lang.Throwable -> L28 android.renderscript.RSRuntimeException -> L2c
            goto L5a
        L28:
            r0 = move-exception
            r9 = r0
            r10 = r1
            goto L37
        L2c:
            r0 = move-exception
            r9 = r0
            r5 = r9
            r9 = r1
            r10 = r2
            r1 = r3
            goto L49
        L33:
            r0 = move-exception
            r9 = r0
            r10 = r1
            r3 = r10
        L37:
            r1 = r2
            goto L6f
        L39:
            r0 = move-exception
            r9 = r0
            r5 = r9
            r9 = r1
            r10 = r2
            goto L49
        L3f:
            r0 = move-exception
            r9 = r0
            r10 = r1
            r3 = r10
            goto L6f
        L44:
            r0 = move-exception
            r9 = r0
            r5 = r9
            r9 = r1
            r10 = r9
        L49:
            oco r2 = r8.e     // Catch: java.lang.Throwable -> L6a
            acsw r3 = defpackage.acsw.LOG_LEVEL_WARN     // Catch: java.lang.Throwable -> L6a
            oal r4 = r8.c     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "Failed to blur image"
            r0 = 0
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6a
            r2.d(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6a
            r2 = r10
            r3 = r1
            r1 = r9
        L5a:
            if (r2 == 0) goto L5f
            r2.destroy()
        L5f:
            if (r3 == 0) goto L64
            r3.destroy()
        L64:
            if (r1 == 0) goto L69
            r1.destroy()
        L69:
            return
        L6a:
            r0 = move-exception
            r3 = r1
            r1 = r10
            r10 = r9
            r9 = r0
        L6f:
            if (r1 == 0) goto L74
            r1.destroy()
        L74:
            if (r3 == 0) goto L79
            r3.destroy()
        L79:
            if (r10 == 0) goto L7e
            r10.destroy()
        L7e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxx.d(android.graphics.Bitmap, float):void");
    }

    private final void e(Bitmap bitmap, Bitmap bitmap2) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        new Canvas(bitmap2).drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), paint);
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(("blur:" + this.d).getBytes(StandardCharsets.UTF_8));
    }

    @Override // defpackage.djg
    protected final Bitmap c(ddz ddzVar, Bitmap bitmap) throws Throwable {
        Bitmap bitmapA;
        float f = this.d;
        if (f < 0.01f) {
            return bitmap;
        }
        float f2 = 25.0f;
        if (f > 25.0f) {
            float f3 = 25.0f / f;
            bitmapA = ddzVar.a(Math.round(bitmap.getWidth() * f3), Math.round(bitmap.getHeight() * f3), Bitmap.Config.ARGB_8888);
            e(bitmap, bitmapA);
        } else {
            f2 = f;
            bitmapA = bitmap;
        }
        d(bitmapA, f2);
        if (this.f != 5 || f <= 25.0f) {
            return bitmapA;
        }
        e(bitmapA, bitmap);
        ddzVar.d(bitmapA);
        return bitmap;
    }
}
