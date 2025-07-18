package defpackage;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrx {
    public static final hlk a = new hlk("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", hkv.c, hlk.a);
    public static final hlk b = new hlk("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, hlk.a);
    public static final hlk c;
    public static final hlk d;
    public static final hrw e;
    private static final Queue h;
    public final List f;
    public final hok g;
    private final hod i;
    private final DisplayMetrics j;
    private final hsg k = hsg.a();

    static {
        hru hruVar = hru.b;
        c = new hlk("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false, hlk.a);
        d = new hlk("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false, hlk.a);
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new hrv();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = hwp.a;
        h = new ArrayDeque(0);
    }

    public hrx(List list, DisplayMetrics displayMetrics, hod hodVar, hok hokVar) {
        this.f = list;
        hju.p(displayMetrics);
        this.j = displayMetrics;
        hju.p(hodVar);
        this.i = hodVar;
        hju.p(hokVar);
        this.g = hokVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap d(defpackage.hsi r13, android.graphics.BitmapFactory.Options r14, defpackage.hrw r15, defpackage.hod r16) {
        /*
            java.lang.String r1 = "["
            java.lang.String r2 = "Exception decoding bitmap, outWidth: "
            java.lang.String r3 = " ("
            boolean r0 = r14.inJustDecodeBounds
            if (r0 != 0) goto L10
            r15.b()
            r13.d()
        L10:
            int r4 = r14.outWidth
            int r5 = r14.outHeight
            java.lang.String r6 = r14.outMimeType
            java.util.concurrent.locks.Lock r0 = defpackage.hsq.c
            r0.lock()
            android.graphics.Bitmap r13 = r13.b(r14)     // Catch: java.lang.IllegalArgumentException -> L21 java.lang.Throwable -> Laf
            goto La7
        L21:
            r0 = move-exception
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> Laf
            android.graphics.Bitmap r8 = r14.inBitmap     // Catch: java.lang.Throwable -> Laf
            r9 = 0
            if (r8 != 0) goto L2b
            r1 = r9
            goto L6f
        L2b:
            int r10 = r8.getAllocationByteCount()     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r11.<init>(r3)     // Catch: java.lang.Throwable -> Laf
            r11.append(r10)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = ")"
            r11.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = r11.toString()     // Catch: java.lang.Throwable -> Laf
            int r10 = r8.getWidth()     // Catch: java.lang.Throwable -> Laf
            int r11 = r8.getHeight()     // Catch: java.lang.Throwable -> Laf
            android.graphics.Bitmap$Config r8 = r8.getConfig()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r12.<init>(r1)     // Catch: java.lang.Throwable -> Laf
            r12.append(r10)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = "x"
            r12.append(r1)     // Catch: java.lang.Throwable -> Laf
            r12.append(r11)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = "] "
            r12.append(r1)     // Catch: java.lang.Throwable -> Laf
            r12.append(r8)     // Catch: java.lang.Throwable -> Laf
            r12.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r12.toString()     // Catch: java.lang.Throwable -> Laf
        L6f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Laf
            r3.append(r4)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = ", outHeight: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Laf
            r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = ", outMimeType: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Laf
            r3.append(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = ", inBitmap: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Laf
            r3.append(r1)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Laf
            r7.<init>(r1, r0)     // Catch: java.lang.Throwable -> Laf
            android.graphics.Bitmap r0 = r14.inBitmap     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lae
            android.graphics.Bitmap r0 = r14.inBitmap     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Laf
            r1 = r16
            r1.d(r0)     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Laf
            r14.inBitmap = r9     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Laf
            android.graphics.Bitmap r13 = d(r13, r14, r15, r16)     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Laf
        La7:
            java.util.concurrent.locks.Lock r14 = defpackage.hsq.c
            r14.unlock()
            return r13
        Lad:
            throw r7     // Catch: java.lang.Throwable -> Laf
        Lae:
            throw r7     // Catch: java.lang.Throwable -> Laf
        Laf:
            r0 = move-exception
            r13 = r0
            java.util.concurrent.locks.Lock r14 = defpackage.hsq.c
            r14.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrx.d(hsi, android.graphics.BitmapFactory$Options, hrw, hod):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        Queue queue = h;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options != null) {
            return options;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        g(options2);
        return options2;
    }

    private static void f(BitmapFactory.Options options) {
        g(options);
        Queue queue = h;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean h(int i) {
        return i == 90 || i == 270;
    }

    private static boolean i(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] j(hsi hsiVar, BitmapFactory.Options options, hrw hrwVar, hod hodVar) {
        options.inJustDecodeBounds = true;
        d(hsiVar, options, hrwVar, hodVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025c A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0253, B:118:0x0292, B:120:0x0298, B:123:0x02a1, B:126:0x02a9, B:127:0x02ab, B:129:0x02b3, B:131:0x02b9, B:133:0x02bf, B:135:0x02c5, B:137:0x02cf, B:139:0x02d8, B:138:0x02d4, B:140:0x02e0, B:142:0x02e4, B:143:0x02ef, B:145:0x02fa, B:159:0x0356, B:161:0x035c, B:148:0x0309, B:149:0x0316, B:158:0x0346, B:151:0x031a, B:152:0x031e, B:153:0x0327, B:154:0x032b, B:155:0x0334, B:156:0x033d, B:157:0x0341, B:162:0x035f, B:110:0x025c, B:112:0x0262, B:114:0x026c, B:94:0x022e, B:97:0x0234, B:99:0x023e, B:101:0x0243, B:103:0x024b, B:104:0x024f, B:100:0x0241), top: B:171:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0262 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0253, B:118:0x0292, B:120:0x0298, B:123:0x02a1, B:126:0x02a9, B:127:0x02ab, B:129:0x02b3, B:131:0x02b9, B:133:0x02bf, B:135:0x02c5, B:137:0x02cf, B:139:0x02d8, B:138:0x02d4, B:140:0x02e0, B:142:0x02e4, B:143:0x02ef, B:145:0x02fa, B:159:0x0356, B:161:0x035c, B:148:0x0309, B:149:0x0316, B:158:0x0346, B:151:0x031a, B:152:0x031e, B:153:0x0327, B:154:0x032b, B:155:0x0334, B:156:0x033d, B:157:0x0341, B:162:0x035f, B:110:0x025c, B:112:0x0262, B:114:0x026c, B:94:0x022e, B:97:0x0234, B:99:0x023e, B:101:0x0243, B:103:0x024b, B:104:0x024f, B:100:0x0241), top: B:171:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0298 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0253, B:118:0x0292, B:120:0x0298, B:123:0x02a1, B:126:0x02a9, B:127:0x02ab, B:129:0x02b3, B:131:0x02b9, B:133:0x02bf, B:135:0x02c5, B:137:0x02cf, B:139:0x02d8, B:138:0x02d4, B:140:0x02e0, B:142:0x02e4, B:143:0x02ef, B:145:0x02fa, B:159:0x0356, B:161:0x035c, B:148:0x0309, B:149:0x0316, B:158:0x0346, B:151:0x031a, B:152:0x031e, B:153:0x0327, B:154:0x032b, B:155:0x0334, B:156:0x033d, B:157:0x0341, B:162:0x035f, B:110:0x025c, B:112:0x0262, B:114:0x026c, B:94:0x022e, B:97:0x0234, B:99:0x023e, B:101:0x0243, B:103:0x024b, B:104:0x024f, B:100:0x0241), top: B:171:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a9 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0253, B:118:0x0292, B:120:0x0298, B:123:0x02a1, B:126:0x02a9, B:127:0x02ab, B:129:0x02b3, B:131:0x02b9, B:133:0x02bf, B:135:0x02c5, B:137:0x02cf, B:139:0x02d8, B:138:0x02d4, B:140:0x02e0, B:142:0x02e4, B:143:0x02ef, B:145:0x02fa, B:159:0x0356, B:161:0x035c, B:148:0x0309, B:149:0x0316, B:158:0x0346, B:151:0x031a, B:152:0x031e, B:153:0x0327, B:154:0x032b, B:155:0x0334, B:156:0x033d, B:157:0x0341, B:162:0x035f, B:110:0x025c, B:112:0x0262, B:114:0x026c, B:94:0x022e, B:97:0x0234, B:99:0x023e, B:101:0x0243, B:103:0x024b, B:104:0x024f, B:100:0x0241), top: B:171:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b3 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0253, B:118:0x0292, B:120:0x0298, B:123:0x02a1, B:126:0x02a9, B:127:0x02ab, B:129:0x02b3, B:131:0x02b9, B:133:0x02bf, B:135:0x02c5, B:137:0x02cf, B:139:0x02d8, B:138:0x02d4, B:140:0x02e0, B:142:0x02e4, B:143:0x02ef, B:145:0x02fa, B:159:0x0356, B:161:0x035c, B:148:0x0309, B:149:0x0316, B:158:0x0346, B:151:0x031a, B:152:0x031e, B:153:0x0327, B:154:0x032b, B:155:0x0334, B:156:0x033d, B:157:0x0341, B:162:0x035f, B:110:0x025c, B:112:0x0262, B:114:0x026c, B:94:0x022e, B:97:0x0234, B:99:0x023e, B:101:0x0243, B:103:0x024b, B:104:0x024f, B:100:0x0241), top: B:171:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fa A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0253, B:118:0x0292, B:120:0x0298, B:123:0x02a1, B:126:0x02a9, B:127:0x02ab, B:129:0x02b3, B:131:0x02b9, B:133:0x02bf, B:135:0x02c5, B:137:0x02cf, B:139:0x02d8, B:138:0x02d4, B:140:0x02e0, B:142:0x02e4, B:143:0x02ef, B:145:0x02fa, B:159:0x0356, B:161:0x035c, B:148:0x0309, B:149:0x0316, B:158:0x0346, B:151:0x031a, B:152:0x031e, B:153:0x0327, B:154:0x032b, B:155:0x0334, B:156:0x033d, B:157:0x0341, B:162:0x035f, B:110:0x025c, B:112:0x0262, B:114:0x026c, B:94:0x022e, B:97:0x0234, B:99:0x023e, B:101:0x0243, B:103:0x024b, B:104:0x024f, B:100:0x0241), top: B:171:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0253, B:118:0x0292, B:120:0x0298, B:123:0x02a1, B:126:0x02a9, B:127:0x02ab, B:129:0x02b3, B:131:0x02b9, B:133:0x02bf, B:135:0x02c5, B:137:0x02cf, B:139:0x02d8, B:138:0x02d4, B:140:0x02e0, B:142:0x02e4, B:143:0x02ef, B:145:0x02fa, B:159:0x0356, B:161:0x035c, B:148:0x0309, B:149:0x0316, B:158:0x0346, B:151:0x031a, B:152:0x031e, B:153:0x0327, B:154:0x032b, B:155:0x0334, B:156:0x033d, B:157:0x0341, B:162:0x035f, B:110:0x025c, B:112:0x0262, B:114:0x026c, B:94:0x022e, B:97:0x0234, B:99:0x023e, B:101:0x0243, B:103:0x024b, B:104:0x024f, B:100:0x0241), top: B:171:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0224 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0253, B:118:0x0292, B:120:0x0298, B:123:0x02a1, B:126:0x02a9, B:127:0x02ab, B:129:0x02b3, B:131:0x02b9, B:133:0x02bf, B:135:0x02c5, B:137:0x02cf, B:139:0x02d8, B:138:0x02d4, B:140:0x02e0, B:142:0x02e4, B:143:0x02ef, B:145:0x02fa, B:159:0x0356, B:161:0x035c, B:148:0x0309, B:149:0x0316, B:158:0x0346, B:151:0x031a, B:152:0x031e, B:153:0x0327, B:154:0x032b, B:155:0x0334, B:156:0x033d, B:157:0x0341, B:162:0x035f, B:110:0x025c, B:112:0x0262, B:114:0x026c, B:94:0x022e, B:97:0x0234, B:99:0x023e, B:101:0x0243, B:103:0x024b, B:104:0x024f, B:100:0x0241), top: B:171:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022e A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:23:0x009b, B:32:0x00b4, B:36:0x00bd, B:91:0x0218, B:93:0x0224, B:105:0x0253, B:118:0x0292, B:120:0x0298, B:123:0x02a1, B:126:0x02a9, B:127:0x02ab, B:129:0x02b3, B:131:0x02b9, B:133:0x02bf, B:135:0x02c5, B:137:0x02cf, B:139:0x02d8, B:138:0x02d4, B:140:0x02e0, B:142:0x02e4, B:143:0x02ef, B:145:0x02fa, B:159:0x0356, B:161:0x035c, B:148:0x0309, B:149:0x0316, B:158:0x0346, B:151:0x031a, B:152:0x031e, B:153:0x0327, B:154:0x032b, B:155:0x0334, B:156:0x033d, B:157:0x0341, B:162:0x035f, B:110:0x025c, B:112:0x0262, B:114:0x026c, B:94:0x022e, B:97:0x0234, B:99:0x023e, B:101:0x0243, B:103:0x024b, B:104:0x024f, B:100:0x0241), top: B:171:0x009b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.hnv a(defpackage.hsi r27, int r28, int r29, defpackage.hll r30, defpackage.hrw r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrx.a(hsi, int, int, hll, hrw):hnv");
    }
}
