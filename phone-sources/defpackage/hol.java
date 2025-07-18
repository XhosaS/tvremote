package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hol implements hod {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final hom b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    public hol(long j) {
        hor horVar = new hor();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.b = horVar;
        this.c = setUnmodifiableSet;
    }

    private static Bitmap f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008c A[Catch: all -> 0x00e3, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000e, B:10:0x0012, B:11:0x0014, B:13:0x002a, B:15:0x0034, B:29:0x005a, B:31:0x005d, B:33:0x0072, B:35:0x007a, B:40:0x0085, B:43:0x008c, B:44:0x0098, B:45:0x009b, B:47:0x00a8, B:49:0x00b8, B:50:0x00be, B:16:0x0037, B:24:0x004a, B:25:0x004f, B:26:0x0052, B:27:0x0055, B:28:0x0058, B:6:0x0008, B:53:0x00d5, B:54:0x00e2), top: B:58:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized android.graphics.Bitmap g(int r13, int r14, android.graphics.Bitmap.Config r15) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hol.g(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    private final synchronized void h(long j) {
        while (this.e > j) {
            hom homVar = this.b;
            Bitmap bitmap = (Bitmap) ((hor) homVar).g.b();
            if (bitmap != null) {
                ((hor) homVar).c(Integer.valueOf(hwp.a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    homVar.toString();
                }
                this.e = 0L;
                return;
            }
            this.e -= hwp.a(bitmap);
            this.i++;
            bitmap.recycle();
        }
    }

    @Override // defpackage.hod
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        if (bitmapG == null) {
            return f(i, i2, config);
        }
        bitmapG.eraseColor(0);
        return bitmapG;
    }

    @Override // defpackage.hod
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        return bitmapG == null ? f(i, i2, config) : bitmapG;
    }

    @Override // defpackage.hod
    public final void c() {
        h(0L);
    }

    @Override // defpackage.hod
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                hom homVar = this.b;
                long jA = hwp.a(bitmap);
                long j = this.d;
                if (jA <= j && this.c.contains(bitmap.getConfig())) {
                    int iA = hwp.a(bitmap);
                    hop hopVarD = ((hor) homVar).f.d(hwp.a(bitmap), bitmap.getConfig());
                    ((hor) homVar).g.c(hopVarD, bitmap);
                    NavigableMap navigableMapB = ((hor) homVar).b(bitmap.getConfig());
                    Integer num = (Integer) navigableMapB.get(Integer.valueOf(hopVarD.a));
                    navigableMapB.put(Integer.valueOf(hopVarD.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                    this.h++;
                    this.e += iA;
                    h(j);
                    return;
                }
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.hod
    public final void e(int i) {
        if (i >= 40 || i >= 20) {
            c();
        } else if (i == 15) {
            h(this.d >> 1);
        }
    }
}
