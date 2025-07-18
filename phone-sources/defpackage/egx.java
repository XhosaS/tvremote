package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egx extends egl {
    private static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public egx(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[PHI: r2
  0x009f: PHI (r2v15 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:27:0x0095, B:23:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.egx c(java.io.File r16, long r17, long r19, defpackage.egr r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egx.c(java.io.File, long, long, egr):egx");
    }

    public static File d(File file, int i2, long j, long j2) {
        return new File(file, i2 + "." + j + "." + j2 + ".v3.exo");
    }
}
