package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aor implements aof {
    public static final aom a = new aom();
    public final String b;
    private final agte c;
    private final File d;
    private final ahgr e;
    private final String f;
    private final String g;
    private final ahni h;
    private final agpc i;
    private final agpc j;

    public aor(agte agteVar, File file) {
        agteVar.getClass();
        this.c = agteVar;
        this.d = file;
        Object obj = aoy.a;
        this.e = new ahgn(new aox(file, null));
        this.b = ".lock";
        this.f = ".version";
        this.g = "fcntl failed: EAGAIN";
        this.h = new ahnm(false);
        this.i = new agpn(new agum() { // from class: aoi
            @Override // defpackage.agum
            public final Object a() throws IOException {
                aor aorVar = this.a;
                File fileG = aorVar.g(aorVar.b);
                aorVar.i(fileG);
                return fileG;
            }
        });
        this.j = new agpn(new agum() { // from class: aoj
            @Override // defpackage.agum
            public final Object a() throws Throwable {
                ParcelFileDescriptor parcelFileDescriptorOpen;
                int i = apg.a;
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open(aor.h(new aok(this.a).a), 939524096);
                } catch (Throwable th) {
                    th = th;
                    parcelFileDescriptorOpen = null;
                }
                try {
                    parcelFileDescriptorOpen.getClass();
                    NativeSharedCounter nativeSharedCounter = ape.a;
                    if (nativeSharedCounter == null) {
                        throw new IllegalStateException("DataStore failed to load the native library to create SharedCounter.");
                    }
                    int fd = parcelFileDescriptorOpen.getFd();
                    if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                        throw new IOException("Failed to truncate counter file");
                    }
                    long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                    if (jNativeCreateSharedCounter < 0) {
                        throw new IOException("Failed to mmap counter file");
                    }
                    apf apfVar = new apf(nativeSharedCounter, jNativeCreateSharedCounter);
                    parcelFileDescriptorOpen.close();
                    return apfVar;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            }
        });
    }

    public static final File h(aor aorVar) throws IOException {
        File fileG = aorVar.g(aorVar.f);
        aorVar.i(fileG);
        return fileG;
    }

    private final File j() {
        return (File) this.i.a();
    }

    @Override // defpackage.aof
    public final Object a(agsw agswVar) {
        return this.j.b() ? new Integer(f().a()) : ahal.a(this.c, new aon(this, null), agswVar);
    }

    @Override // defpackage.aof
    public final Object b(agsw agswVar) {
        return this.j.b() ? new Integer(f().b()) : ahal.a(this.c, new aoo(this, null), agswVar);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00b3, blocks: (B:38:0x00af, B:52:0x00cb, B:53:0x00ce), top: B:66:0x0022, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb A[Catch: all -> 0x00b3, TRY_ENTER, TryCatch #2 {all -> 0x00b3, blocks: (B:38:0x00af, B:52:0x00cb, B:53:0x00ce), top: B:66:0x0022, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[Catch: all -> 0x00b3, SYNTHETIC, TRY_LEAVE, TryCatch #2 {all -> 0x00b3, blocks: (B:38:0x00af, B:52:0x00cb, B:53:0x00ce), top: B:66:0x0022, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [ahni] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [agtg, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    @Override // defpackage.aof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agux r9, defpackage.agsw r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aor.c(agux, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc A[Catch: all -> 0x00c2, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00c2, blocks: (B:48:0x00bc, B:59:0x00d4, B:60:0x00d9), top: B:83:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4 A[Catch: all -> 0x00c2, TRY_ENTER, TryCatch #3 {all -> 0x00c2, blocks: (B:48:0x00bc, B:59:0x00d4, B:60:0x00d9), top: B:83:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v0, types: [agvb] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11, types: [ahni] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [aoq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [ahni] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [agtg, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    @Override // defpackage.aof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.agvb r20, defpackage.agsw r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aor.d(agvb, agsw):java.lang.Object");
    }

    @Override // defpackage.aof
    public final ahgr e() {
        return this.e;
    }

    public final apg f() {
        return (apg) this.j.a();
    }

    public final File g(String str) {
        return new File(String.valueOf(this.d.getAbsolutePath()).concat(str));
    }

    public final void i(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Objects.toString(file);
                throw new IOException("Unable to create parent directories of ".concat(file.toString()));
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }
}
