package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skm implements sjp {
    public boolean a;
    private final boolean b;
    private final boolean c;

    public skm(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, skt] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, skt] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, skt] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, skt] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, skt] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, skt] */
    @Override // defpackage.sjp
    public final /* bridge */ /* synthetic */ Object a(unc uncVar) throws InterruptedException, IOException {
        sjy sjyVar;
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        tst tstVarA;
        ?? sjyVar2;
        FileLock fileLockTryLock;
        Uri uriBuild = ((Uri) uncVar.e).buildUpon().path(String.valueOf(((Uri) uncVar.c).getPath()).concat(".lock")).fragment("").build();
        Closeable closeable = null;
        if (this.a) {
            Semaphore semaphoreB = uncVar.a.a().b(uriBuild.toString());
            if (true != semaphoreB.tryAcquire()) {
                semaphoreB = null;
            }
            sjz sjzVar = new sjz(semaphoreB);
            try {
                if (sjzVar.a != null) {
                    sjyVar = new sjy(sjzVar.a(), 0);
                    sjzVar.close();
                } else {
                    sjzVar.close();
                    sjyVar = null;
                }
            } finally {
            }
        } else {
            Semaphore semaphoreB2 = uncVar.a.a().b(uriBuild.toString());
            try {
                semaphoreB2.acquire();
                sjz sjzVar2 = new sjz(semaphoreB2);
                try {
                    sjyVar = new sjy(sjzVar2.a(), 0);
                    sjzVar2.close();
                } finally {
                }
            } catch (InterruptedException e) {
                throw new InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
            }
        }
        skc skcVar = new skc(sjyVar);
        try {
            if (skcVar.a != null) {
                boolean z = this.b;
                skc skcVar2 = new skc((z && this.c) ? uncVar.a.c(uriBuild) : (!z || this.c) ? uncVar.a.d(uriBuild) : (Closeable) ((aafi) uncVar.b).r(uriBuild, new skn(0)));
                try {
                    Closeable closeable2 = skcVar2.a;
                    if (closeable2 instanceof sjv) {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((sjv) closeable2).a();
                    } else {
                        if (!(closeable2 instanceof RandomAccessFile)) {
                            throw new IOException("Lock stream not convertible to FileChannel");
                        }
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) closeable2).getChannel());
                    }
                    FileChannel fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                    if (this.a) {
                        uncVar.a.a();
                        try {
                            fileLockTryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, z);
                        } catch (IOException unused) {
                        }
                        sjyVar2 = fileLockTryLock == null ? 0 : new sjy(fileLockTryLock, 1);
                    } else {
                        uncVar.a.a();
                        tst tstVarA2 = ska.a(fileChannel, z);
                        if (tstVarA2.g()) {
                            sjyVar2 = tstVarA2.c();
                        } else {
                            ska.a.longValue();
                            ska.b.longValue();
                            a.H(true);
                            a.H(true);
                            skh skhVar = new skh();
                            do {
                                SystemClock.sleep(skhVar.next().longValue());
                                tstVarA = ska.a(fileChannel, z);
                            } while (!tstVarA.g());
                            sjyVar2 = tstVarA.c();
                        }
                    }
                    skc skcVar3 = new skc(sjyVar2);
                    try {
                        if (skcVar3.a == null) {
                            skcVar3.close();
                        } else {
                            final Closeable closeableA = skcVar.a();
                            final Closeable closeableA2 = skcVar2.a();
                            final Closeable closeableA3 = skcVar3.a();
                            closeable = new Closeable() { // from class: skl
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() throws IOException {
                                    Closeable closeable3 = closeableA;
                                    Closeable closeable4 = closeableA2;
                                    Closeable closeable5 = closeableA3;
                                    if (closeable5 != null) {
                                        try {
                                            try {
                                                closeable5.close();
                                            } catch (Throwable th) {
                                                if (closeable4 != null) {
                                                    try {
                                                        closeable4.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            if (closeable3 != null) {
                                                try {
                                                    closeable3.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (closeable4 != null) {
                                        closeable4.close();
                                    }
                                    if (closeable3 != null) {
                                        closeable3.close();
                                    }
                                }
                            };
                            skcVar3.close();
                        }
                        skcVar2.close();
                    } finally {
                    }
                } finally {
                }
            }
            skcVar.close();
            return closeable;
        } finally {
        }
    }
}
