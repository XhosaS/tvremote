package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eon {
    public static final void a(Context context, String str, Set set, eoo eooVar, tqo tqoVar, eoj eojVar) throws Throwable {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (eop.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        e("Beginning load of %s...", new Object[]{str}, tqoVar);
        f(context, str, set, eooVar, tqoVar, eojVar);
    }

    protected static final File b(Context context) {
        return context.getDir("lib", 0);
    }

    public static final void c(String str, tqo tqoVar) {
        if (tqoVar != null) {
            ((zdv) ((zdv) tqp.a.d()).q("com/google/android/libraries/speech/encoding/OggOpusInputStream", "maybeInitNativeOggOpusLib", 57, "OggOpusInputStream.java")).x("%s", str);
        }
    }

    protected static final File d(Context context, String str, eoo eooVar) {
        String strA = eooVar.a(str);
        return eop.a(null) ? new File(b(context), strA) : new File(b(context), String.valueOf(strA).concat(".null"));
    }

    public static final void e(String str, Object[] objArr, tqo tqoVar) {
        c(String.format(Locale.US, str, objArr), tqoVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
    
        r7 = new defpackage.eoi(r13, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v0, types: [eoj] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void f(android.content.Context r21, java.lang.String r22, java.util.Set r23, defpackage.eoo r24, defpackage.tqo r25, defpackage.eoj r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eon.f(android.content.Context, java.lang.String, java.util.Set, eoo, tqo, eoj):void");
    }
}
