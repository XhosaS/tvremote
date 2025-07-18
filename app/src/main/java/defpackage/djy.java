package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
public final class djy {
    public static final dam a = new dam("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", czs.c, dam.a);
    public static final dam b = new dam("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, dam.a);
    public static final dam c;
    public static final dam d;
    public static final djx e;
    private static final Queue h;
    public final ddx f;
    public final List g;
    private final ddz i;
    private final DisplayMetrics j;
    private final dkh k = dkh.a();

    static {
        djv djvVar = djv.b;
        c = new dam("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false, dam.a);
        d = new dam("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false, dam.a);
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new djw();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = dqm.a;
        h = new ArrayDeque(0);
    }

    public djy(List list, DisplayMetrics displayMetrics, ddz ddzVar, ddx ddxVar) {
        this.g = list;
        dqk.d(displayMetrics, "Argument must not be null");
        this.j = displayMetrics;
        this.i = ddzVar;
        this.f = ddxVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap c(defpackage.dkl r9, android.graphics.BitmapFactory.Options r10, defpackage.djx r11, defpackage.ddz r12) {
        /*
            java.lang.String r0 = "Downsampler"
            java.lang.String r1 = "Exception decoding bitmap, outWidth: "
            boolean r2 = r10.inJustDecodeBounds
            if (r2 != 0) goto Le
            r11.b()
            r9.d()
        Le:
            int r2 = r10.outWidth
            int r3 = r10.outHeight
            java.lang.String r4 = r10.outMimeType
            java.util.concurrent.locks.Lock r5 = defpackage.dkv.a
            r5.lock()
            android.graphics.Bitmap r9 = r9.b(r10)     // Catch: java.lang.IllegalArgumentException -> L1e java.lang.Throwable -> L72
            goto L6a
        L1e:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L72
            android.graphics.Bitmap r7 = r10.inBitmap     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = e(r7)     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L72
            r8.append(r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = ", outHeight: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L72
            r8.append(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = ", outMimeType: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L72
            r8.append(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = ", inBitmap: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L72
            r8.append(r7)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L72
            r6.<init>(r1, r5)     // Catch: java.lang.Throwable -> L72
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L5a
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r6)     // Catch: java.lang.Throwable -> L72
        L5a:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L71
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L72
            r12.d(r0)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L72
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L72
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L72
        L6a:
            java.util.concurrent.locks.Lock r10 = defpackage.dkv.a
            r10.unlock()
            return r9
        L70:
            throw r6     // Catch: java.lang.Throwable -> L72
        L71:
            throw r6     // Catch: java.lang.Throwable -> L72
        L72:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = defpackage.dkv.a
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djy.c(dkl, android.graphics.BitmapFactory$Options, djx, ddz):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options d() {
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

    private static String e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String str = " (" + bitmap.getAllocationByteCount() + ")";
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str;
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
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
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

    private static int[] j(dkl dklVar, BitmapFactory.Options options, djx djxVar, ddz ddzVar) {
        options.inJustDecodeBounds = true;
        c(dklVar, options, djxVar, ddzVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x034a A[Catch: all -> 0x0542, TryCatch #0 {all -> 0x0542, blocks: (B:95:0x02ea, B:97:0x02f6, B:113:0x033e, B:129:0x03d1, B:132:0x03dc, B:134:0x03e2, B:135:0x03e4, B:137:0x03ec, B:139:0x03f2, B:141:0x03f8, B:143:0x0402, B:145:0x040b, B:144:0x0407, B:146:0x0412, B:148:0x0424, B:118:0x034a, B:120:0x0350, B:122:0x035a, B:124:0x0380, B:98:0x0300, B:101:0x0306, B:103:0x0310, B:109:0x032e, B:111:0x0336, B:108:0x032c, B:112:0x033a, B:105:0x0314, B:107:0x031b), top: B:186:0x02ea, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0350 A[Catch: all -> 0x0542, TryCatch #0 {all -> 0x0542, blocks: (B:95:0x02ea, B:97:0x02f6, B:113:0x033e, B:129:0x03d1, B:132:0x03dc, B:134:0x03e2, B:135:0x03e4, B:137:0x03ec, B:139:0x03f2, B:141:0x03f8, B:143:0x0402, B:145:0x040b, B:144:0x0407, B:146:0x0412, B:148:0x0424, B:118:0x034a, B:120:0x0350, B:122:0x035a, B:124:0x0380, B:98:0x0300, B:101:0x0306, B:103:0x0310, B:109:0x032e, B:111:0x0336, B:108:0x032c, B:112:0x033a, B:105:0x0314, B:107:0x031b), top: B:186:0x02ea, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0380 A[Catch: all -> 0x0542, TryCatch #0 {all -> 0x0542, blocks: (B:95:0x02ea, B:97:0x02f6, B:113:0x033e, B:129:0x03d1, B:132:0x03dc, B:134:0x03e2, B:135:0x03e4, B:137:0x03ec, B:139:0x03f2, B:141:0x03f8, B:143:0x0402, B:145:0x040b, B:144:0x0407, B:146:0x0412, B:148:0x0424, B:118:0x034a, B:120:0x0350, B:122:0x035a, B:124:0x0380, B:98:0x0300, B:101:0x0306, B:103:0x0310, B:109:0x032e, B:111:0x0336, B:108:0x032c, B:112:0x033a, B:105:0x0314, B:107:0x031b), top: B:186:0x02ea, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03dc A[Catch: all -> 0x0542, TryCatch #0 {all -> 0x0542, blocks: (B:95:0x02ea, B:97:0x02f6, B:113:0x033e, B:129:0x03d1, B:132:0x03dc, B:134:0x03e2, B:135:0x03e4, B:137:0x03ec, B:139:0x03f2, B:141:0x03f8, B:143:0x0402, B:145:0x040b, B:144:0x0407, B:146:0x0412, B:148:0x0424, B:118:0x034a, B:120:0x0350, B:122:0x035a, B:124:0x0380, B:98:0x0300, B:101:0x0306, B:103:0x0310, B:109:0x032e, B:111:0x0336, B:108:0x032c, B:112:0x033a, B:105:0x0314, B:107:0x031b), top: B:186:0x02ea, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ec A[Catch: all -> 0x0542, TryCatch #0 {all -> 0x0542, blocks: (B:95:0x02ea, B:97:0x02f6, B:113:0x033e, B:129:0x03d1, B:132:0x03dc, B:134:0x03e2, B:135:0x03e4, B:137:0x03ec, B:139:0x03f2, B:141:0x03f8, B:143:0x0402, B:145:0x040b, B:144:0x0407, B:146:0x0412, B:148:0x0424, B:118:0x034a, B:120:0x0350, B:122:0x035a, B:124:0x0380, B:98:0x0300, B:101:0x0306, B:103:0x0310, B:109:0x032e, B:111:0x0336, B:108:0x032c, B:112:0x033a, B:105:0x0314, B:107:0x031b), top: B:186:0x02ea, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0424 A[Catch: all -> 0x0542, TRY_LEAVE, TryCatch #0 {all -> 0x0542, blocks: (B:95:0x02ea, B:97:0x02f6, B:113:0x033e, B:129:0x03d1, B:132:0x03dc, B:134:0x03e2, B:135:0x03e4, B:137:0x03ec, B:139:0x03f2, B:141:0x03f8, B:143:0x0402, B:145:0x040b, B:144:0x0407, B:146:0x0412, B:148:0x0424, B:118:0x034a, B:120:0x0350, B:122:0x035a, B:124:0x0380, B:98:0x0300, B:101:0x0306, B:103:0x0310, B:109:0x032e, B:111:0x0336, B:108:0x032c, B:112:0x033a, B:105:0x0314, B:107:0x031b), top: B:186:0x02ea, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04b9 A[Catch: all -> 0x052e, TryCatch #4 {all -> 0x052e, blocks: (B:150:0x0445, B:153:0x04b9, B:167:0x051f, B:169:0x0525, B:174:0x0533, B:156:0x04ca, B:157:0x04d7, B:166:0x0507, B:159:0x04db, B:160:0x04df, B:161:0x04e8, B:162:0x04ec, B:163:0x04f5, B:164:0x04fe, B:165:0x0502), top: B:193:0x0445 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[Catch: all -> 0x0548, TryCatch #3 {all -> 0x0548, blocks: (B:8:0x006c, B:15:0x0093, B:16:0x0099, B:22:0x00ad, B:24:0x00b7, B:29:0x00c2, B:34:0x00cd), top: B:191:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2 A[Catch: all -> 0x0548, TryCatch #3 {all -> 0x0548, blocks: (B:8:0x006c, B:15:0x0093, B:16:0x0099, B:22:0x00ad, B:24:0x00b7, B:29:0x00c2, B:34:0x00cd), top: B:191:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b7 A[Catch: all -> 0x0544, TryCatch #1 {all -> 0x0544, blocks: (B:40:0x00ed, B:47:0x0103, B:49:0x010d, B:51:0x0136, B:53:0x013f, B:55:0x0149, B:57:0x0150, B:58:0x0151, B:60:0x0157, B:62:0x0171, B:79:0x01b9, B:81:0x01e3, B:84:0x01ef, B:86:0x01f5, B:83:0x01e8, B:63:0x0174, B:65:0x0178, B:68:0x017d, B:70:0x0183, B:71:0x0190, B:73:0x0194, B:76:0x0199, B:77:0x019e, B:78:0x01a9, B:52:0x013b, B:89:0x0273, B:90:0x02b6, B:91:0x02b7, B:93:0x02c2), top: B:188:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c2 A[Catch: all -> 0x0544, TRY_LEAVE, TryCatch #1 {all -> 0x0544, blocks: (B:40:0x00ed, B:47:0x0103, B:49:0x010d, B:51:0x0136, B:53:0x013f, B:55:0x0149, B:57:0x0150, B:58:0x0151, B:60:0x0157, B:62:0x0171, B:79:0x01b9, B:81:0x01e3, B:84:0x01ef, B:86:0x01f5, B:83:0x01e8, B:63:0x0174, B:65:0x0178, B:68:0x017d, B:70:0x0183, B:71:0x0190, B:73:0x0194, B:76:0x0199, B:77:0x019e, B:78:0x01a9, B:52:0x013b, B:89:0x0273, B:90:0x02b6, B:91:0x02b7, B:93:0x02c2), top: B:188:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f6 A[Catch: all -> 0x0542, TryCatch #0 {all -> 0x0542, blocks: (B:95:0x02ea, B:97:0x02f6, B:113:0x033e, B:129:0x03d1, B:132:0x03dc, B:134:0x03e2, B:135:0x03e4, B:137:0x03ec, B:139:0x03f2, B:141:0x03f8, B:143:0x0402, B:145:0x040b, B:144:0x0407, B:146:0x0412, B:148:0x0424, B:118:0x034a, B:120:0x0350, B:122:0x035a, B:124:0x0380, B:98:0x0300, B:101:0x0306, B:103:0x0310, B:109:0x032e, B:111:0x0336, B:108:0x032c, B:112:0x033a, B:105:0x0314, B:107:0x031b), top: B:186:0x02ea, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0300 A[Catch: all -> 0x0542, TRY_LEAVE, TryCatch #0 {all -> 0x0542, blocks: (B:95:0x02ea, B:97:0x02f6, B:113:0x033e, B:129:0x03d1, B:132:0x03dc, B:134:0x03e2, B:135:0x03e4, B:137:0x03ec, B:139:0x03f2, B:141:0x03f8, B:143:0x0402, B:145:0x040b, B:144:0x0407, B:146:0x0412, B:148:0x0424, B:118:0x034a, B:120:0x0350, B:122:0x035a, B:124:0x0380, B:98:0x0300, B:101:0x0306, B:103:0x0310, B:109:0x032e, B:111:0x0336, B:108:0x032c, B:112:0x033a, B:105:0x0314, B:107:0x031b), top: B:186:0x02ea, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ddp a(defpackage.dkl r44, int r45, int r46, defpackage.dan r47, defpackage.djx r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djy.a(dkl, int, int, dan, djx):ddp");
    }
}
