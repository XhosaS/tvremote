package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import com.google.common.collect.UnmodifiableIterator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgg {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    private static final String[] c;
    private static final String[] d;

    static {
        c = new String[]{"media", (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        d = new String[]{Build.VERSION.SDK_INT <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : "", Build.VERSION.SDK_INT <= 25 ? "com.google.android.inputmethod.latin.dev.inputcontent" : "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static Uri a(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    public static void b(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) throws IOException {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r5, android.os.ParcelFileDescriptor r6, android.net.Uri r7, defpackage.sgf r8) throws java.io.IOException, android.system.ErrnoException {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r7 = r7.getPath()
            r0.<init>(r7)
            java.lang.String r7 = r0.getCanonicalPath()
            h(r6, r7)
            java.lang.String r6 = "/proc/"
            boolean r6 = r7.startsWith(r6)
            if (r6 != 0) goto Ld4
            java.lang.String r6 = "/data/misc/"
            boolean r6 = r7.startsWith(r6)
            if (r6 != 0) goto Ld4
            sgf r6 = defpackage.sgf.a
            boolean r6 = r8.d
            if (r6 != 0) goto Ld4
            com.google.common.collect.ImmutableList r6 = r8.f
            com.google.common.collect.UnmodifiableIterator r6 = r6.iterator()
        L2c:
            boolean r0 = r6.hasNext()
            r1 = 1
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r6.next()
            sgb r0 = (defpackage.sgb) r0
            boolean r2 = r8.c
            int r0 = r0.a()
            int r2 = r0 + (-1)
            if (r0 == 0) goto L4c
            if (r2 == 0) goto L4a
            if (r2 == r1) goto L48
            goto L2c
        L48:
            r6 = 2
            goto L4f
        L4a:
            r6 = r1
            goto L4f
        L4c:
            r5 = 0
            throw r5
        L4e:
            r6 = 3
        L4f:
            int r6 = r6 + (-1)
            if (r6 == 0) goto Ld3
            if (r6 == r1) goto Ld4
            java.io.File r6 = defpackage.a$$ExternalSyntheticApiModelOutline0.m8m(r5)
            if (r6 == 0) goto L67
            java.lang.String r6 = g(r6)
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L76
            goto Lcf
        L67:
            java.io.File r6 = android.os.Environment.getDataDirectory()
            java.lang.String r6 = g(r6)
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L76
            goto Lcf
        L76:
            android.content.Context r6 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r5)
            if (r6 == 0) goto L8d
            java.io.File r6 = defpackage.a$$ExternalSyntheticApiModelOutline0.m8m(r6)
            if (r6 == 0) goto L8d
            java.lang.String r6 = g(r6)
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L8d
            goto Lcf
        L8d:
            rjs r6 = new rjs
            r0 = 5
            r6.<init>(r5, r0)
            java.io.File[] r6 = j(r6)
            int r0 = r6.length
            r2 = 0
            r3 = r2
        L9a:
            if (r3 >= r0) goto Lae
            r4 = r6[r3]
            if (r4 == 0) goto Lab
            java.lang.String r4 = g(r4)
            boolean r4 = r7.startsWith(r4)
            if (r4 == 0) goto Lab
            goto Lcf
        Lab:
            int r3 = r3 + 1
            goto L9a
        Lae:
            rjs r6 = new rjs
            r0 = 6
            r6.<init>(r5, r0)
            java.io.File[] r5 = j(r6)
            int r6 = r5.length
            r0 = r2
        Lba:
            if (r0 >= r6) goto Lce
            r3 = r5[r0]
            if (r3 == 0) goto Lcb
            java.lang.String r3 = g(r3)
            boolean r3 = r7.startsWith(r3)
            if (r3 == 0) goto Lcb
            goto Lcf
        Lcb:
            int r0 = r0 + 1
            goto Lba
        Lce:
            r1 = r2
        Lcf:
            boolean r5 = r8.c
            if (r1 != r5) goto Ld4
        Ld3:
            return
        Ld4:
            java.lang.String r5 = java.lang.String.valueOf(r7)
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r7 = "Can't open file: "
            java.lang.String r5 = r7.concat(r5)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sgg.c(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, sgf):void");
    }

    public static void d(Object obj) throws FileNotFoundException {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }

    public static AssetFileDescriptor e(Context context, Uri uri, CancellationSignal cancellationSignal, sgf sgfVar) throws IOException, ErrnoException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriA = a(uri);
        String scheme = uriA.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(uriA, "r", cancellationSignal);
        }
        if ("content".equals(scheme)) {
            if (!f(context, uriA, sgfVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriA, "r", cancellationSignal);
            d(assetFileDescriptorOpenAssetFileDescriptor);
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uriA, "r", cancellationSignal);
        try {
            c(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uriA, sgfVar);
            return assetFileDescriptorOpenAssetFileDescriptor2;
        } catch (FileNotFoundException e) {
            i(assetFileDescriptorOpenAssetFileDescriptor2, e);
            throw e;
        } catch (IOException e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e2);
            i(assetFileDescriptorOpenAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Context context, Uri uri, sgf sgfVar) {
        int i;
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider == null) {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                sgf sgfVar2 = sgf.a;
                return !sgfVar.c;
            }
        }
        rzy rzyVar = new rzy(uri, providerInfoResolveContentProvider, (char[]) null);
        sgf sgfVar3 = sgf.a;
        UnmodifiableIterator it = sgfVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 3;
                break;
            }
            int iA = ((sgh) it.next()).a(context, rzyVar, sgfVar.c) - 1;
            if (iA == 0) {
                i = 1;
                break;
            }
            if (iA == 1) {
                i = 2;
                break;
            }
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return true;
        }
        if (i2 == 1) {
            return false;
        }
        if (context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
            return sgfVar.c;
        }
        if (sgfVar.c) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && providerInfoResolveContentProvider.exported) {
            String[] strArr = c;
            int length = strArr.length;
            for (int i3 = 0; i3 < 2; i3++) {
                if (strArr[i3].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = d;
            int length2 = strArr2.length;
            for (int i4 = 0; i4 < 3; i4++) {
                if (strArr2[i4].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = b;
            for (int i5 = 0; i5 < 7; i5++) {
                String str = strArr3[i5];
                if (str.charAt(str.length() - 1) == '.') {
                    if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (providerInfoResolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String g(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static void h(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException, ErrnoException {
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

    private static void i(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) throws IOException {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static File[] j(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
