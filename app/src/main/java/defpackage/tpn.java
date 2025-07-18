package defpackage;

import android.content.res.AssetFileDescriptor;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpn {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    private static final String[] c;
    private static final String[] d;

    static {
        c = new String[]{"media", (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        d = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ec, code lost:
    
        if (r4.startsWith(c(r3)) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0257, code lost:
    
        if (r9 != r20.c) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        if (r20.c == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fa, code lost:
    
        if (r20.c != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.AssetFileDescriptor a(final android.content.Context r17, android.net.Uri r18, java.lang.String r19, defpackage.tpm r20) throws java.io.IOException, android.system.ErrnoException {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpn.a(android.content.Context, android.net.Uri, java.lang.String, tpm):android.content.res.AssetFileDescriptor");
    }

    public static void b(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) throws IOException {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static String c(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static void d(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException, ErrnoException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    private static File[] e(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void f(Object obj) throws FileNotFoundException {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }
}
