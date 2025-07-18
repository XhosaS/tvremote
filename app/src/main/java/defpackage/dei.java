package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dei implements ddz {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final dej b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    public dei(long j) {
        deo deoVar = new deo();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.b = deoVar;
        this.c = setUnmodifiableSet;
    }

    private static Bitmap f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d A[Catch: all -> 0x0122, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000f, B:10:0x0017, B:12:0x0035, B:24:0x0059, B:26:0x005c, B:28:0x0073, B:30:0x007b, B:41:0x00a2, B:43:0x00af, B:45:0x00c0, B:47:0x00c9, B:48:0x00d8, B:50:0x00f7, B:52:0x0100, B:53:0x010f, B:49:0x00df, B:35:0x0086, B:38:0x008d, B:39:0x0099, B:13:0x0038, B:19:0x0049, B:20:0x004e, B:21:0x0051, B:22:0x0054, B:23:0x0057, B:9:0x0015, B:56:0x0114, B:57:0x0121), top: B:61:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized android.graphics.Bitmap g(int r18, int r19, android.graphics.Bitmap.Config r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dei.g(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    private final void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private final void i() {
        dej dejVar = this.b;
        Log.v("LruBitmapPool", "Hits=" + this.f + ", misses=" + this.g + ", puts=" + this.h + ", evictions=" + this.i + ", currentSize=" + this.e + ", maxSize=" + this.d + "\nStrategy=" + dejVar.toString());
    }

    private final synchronized void j(long j) {
        while (this.e > j) {
            dej dejVar = this.b;
            Bitmap bitmap = (Bitmap) ((deo) dejVar).g.b();
            if (bitmap != null) {
                ((deo) dejVar).e(Integer.valueOf(dqm.a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    i();
                }
                this.e = 0L;
                return;
            }
            this.e -= dqm.a(bitmap);
            this.i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=".concat(dejVar.a(bitmap)));
            }
            h();
            bitmap.recycle();
        }
    }

    @Override // defpackage.ddz
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        if (bitmapG == null) {
            return f(i, i2, config);
        }
        bitmapG.eraseColor(0);
        return bitmapG;
    }

    @Override // defpackage.ddz
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        return bitmapG == null ? f(i, i2, config) : bitmapG;
    }

    @Override // defpackage.ddz
    public final void c() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        j(0L);
    }

    @Override // defpackage.ddz
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                dej dejVar = this.b;
                long jA = dqm.a(bitmap);
                long j = this.d;
                if (jA <= j && this.c.contains(bitmap.getConfig())) {
                    int iA = dqm.a(bitmap);
                    dem demVarD = ((deo) dejVar).f.d(dqm.a(bitmap), bitmap.getConfig());
                    ((deo) dejVar).g.c(demVarD, bitmap);
                    NavigableMap navigableMapD = ((deo) dejVar).d(bitmap.getConfig());
                    Integer num = (Integer) navigableMapD.get(Integer.valueOf(demVarD.a));
                    navigableMapD.put(Integer.valueOf(demVarD.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                    this.h++;
                    this.e += iA;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(dejVar.a(bitmap)));
                    }
                    h();
                    j(j);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.b.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ddz
    public final void e(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", a.b(i, "trimMemory, level="));
        }
        if (i >= 40 || i >= 20) {
            c();
        } else if (i == 15) {
            j(this.d >> 1);
        }
    }
}
