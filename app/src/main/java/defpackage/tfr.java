package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfr {
    private static final zdy a = zdy.h("com/google/android/libraries/search/loader/SafeLibraryLoader");
    private static final Pattern b = Pattern.compile("\\d+(\\.\\d+)+(\\.[a-z0-9]+)*");

    private tfr() {
    }

    static /* synthetic */ String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void b(Context context, String str, boolean z) {
        c(context, str, z, new tfq(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02c6, code lost:
    
        throw new java.io.IOException(defpackage.a.s(r4, r0, "Did not find ", " in "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d4, code lost:
    
        throw new java.io.IOException(defpackage.a.j(r4, "Failed to open zip file "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d8, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e8, code lost:
    
        if (r9 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ea, code lost:
    
        r13 = r2;
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ed, code lost:
    
        r17 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ef, code lost:
    
        if (r13 >= 5) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f1, code lost:
    
        r16 = r9.getEntry(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f5, code lost:
    
        if (r16 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f8, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0200, code lost:
    
        r13 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0202, code lost:
    
        if (r13 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0204, code lost:
    
        r0 = r2;
        r16 = null;
        r17 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d8 A[Catch: IOException -> 0x0372, all -> 0x0412, TRY_ENTER, TryCatch #2 {IOException -> 0x0372, blocks: (B:106:0x0256, B:141:0x02d8, B:142:0x02db, B:144:0x02e1, B:158:0x0319, B:161:0x0325, B:179:0x0359), top: B:208:0x0359 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0369 A[Catch: IOException -> 0x0373, all -> 0x0412, TryCatch #0 {IOException -> 0x0373, blocks: (B:181:0x0362, B:184:0x0369, B:186:0x036e, B:187:0x0371), top: B:206:0x0362 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x036e A[Catch: IOException -> 0x0373, all -> 0x0412, TryCatch #0 {IOException -> 0x0373, blocks: (B:181:0x0362, B:184:0x0369, B:186:0x036e, B:187:0x0371), top: B:206:0x0362 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0359 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c6 A[Catch: all -> 0x0412, TRY_LEAVE, TryCatch #13 {, blocks: (B:8:0x004b, B:10:0x008e, B:12:0x0094, B:14:0x0099, B:17:0x00a6, B:19:0x00ac, B:20:0x00c9, B:23:0x00cf, B:24:0x00de, B:26:0x00e4, B:28:0x00e8, B:30:0x00f4, B:32:0x0102, B:34:0x0108, B:36:0x010e, B:38:0x0114, B:40:0x011c, B:42:0x0124, B:44:0x014e, B:58:0x01a4, B:59:0x01c0, B:61:0x01c6, B:64:0x01cc, B:106:0x0256, B:162:0x032b, B:141:0x02d8, B:142:0x02db, B:144:0x02e1, B:158:0x0319, B:160:0x0322, B:161:0x0325, B:179:0x0359, B:181:0x0362, B:184:0x0369, B:186:0x036e, B:187:0x0371, B:190:0x037a, B:191:0x03a3, B:45:0x0157, B:47:0x0163), top: B:222:0x004b }] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r23, java.lang.String r24, boolean r25, defpackage.aehf r26) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfr.c(android.content.Context, java.lang.String, boolean, aehf):void");
    }

    private static boolean d(File file) {
        if (!file.exists()) {
            return false;
        }
        try {
            file.setWritable(true, true);
            return file.delete();
        } catch (SecurityException e) {
            ((zdv) ((zdv) ((zdv) a.c().o(zfi.a, "NativeLibraryLoader")).p(e)).q("com/google/android/libraries/search/loader/SafeLibraryLoader", "deleteFile", (char) 275, "SafeLibraryLoader.java")).u("Failed to remove old lib, ");
            return false;
        }
    }
}
