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
public final class uhe implements uef {
    public boolean a;
    private final boolean b;
    private final boolean c;

    public uhe(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    @Override // defpackage.uef
    public final /* synthetic */ Object a(uee ueeVar) throws InterruptedException, IOException {
        ufr ufrVar;
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        yqt yqtVarA;
        ?? ufqVar;
        FileLock fileLockTryLock;
        Uri uriBuild = ueeVar.e.buildUpon().path(String.valueOf(ueeVar.f.getPath()).concat(".lock")).fragment("").build();
        Closeable closeable = null;
        if (this.a) {
            Semaphore semaphoreB = ueeVar.b.b().b(uriBuild.toString());
            if (true != semaphoreB.tryAcquire()) {
                semaphoreB = null;
            }
            ufs ufsVar = new ufs(semaphoreB);
            try {
                Semaphore semaphore = ufsVar.a;
                if (semaphore != null) {
                    ufsVar.a = null;
                    ufrVar = new ufr(semaphore);
                    ufsVar.close();
                } else {
                    ufsVar.close();
                    ufrVar = null;
                }
            } finally {
            }
        } else {
            Semaphore semaphoreB2 = ueeVar.b.b().b(uriBuild.toString());
            try {
                semaphoreB2.acquire();
                ufs ufsVar2 = new ufs(semaphoreB2);
                try {
                    Semaphore semaphore2 = ufsVar2.a;
                    ufsVar2.a = null;
                    ufrVar = new ufr(semaphore2);
                    ufsVar2.close();
                } finally {
                }
            } catch (InterruptedException e) {
                throw new InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
            }
        }
        ufv ufvVar = new ufv(ufrVar);
        try {
            if (ufvVar.a != null) {
                boolean z = this.b;
                ufv ufvVar2 = new ufv((z && this.c) ? ueeVar.b.d(uriBuild) : (!z || this.c) ? ueeVar.b.f(uriBuild) : (Closeable) ueeVar.a.c(uriBuild, new uhf()));
                try {
                    Closeable closeable2 = ufvVar2.a;
                    if (closeable2 instanceof ufe) {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((ufe) closeable2).a();
                    } else {
                        if (!(closeable2 instanceof RandomAccessFile)) {
                            throw new IOException("Lock stream not convertible to FileChannel");
                        }
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) closeable2).getChannel());
                    }
                    FileChannel fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                    if (this.a) {
                        ueeVar.b.b();
                        try {
                            fileLockTryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, z);
                        } catch (IOException unused) {
                        }
                        ufqVar = fileLockTryLock == null ? 0 : new ufq(fileLockTryLock);
                    } else {
                        ueeVar.b.b();
                        yqt yqtVarA2 = uft.a(fileChannel, z);
                        if (yqtVarA2.g()) {
                            ufqVar = yqtVarA2.c();
                        } else {
                            uft.a.longValue();
                            uft.b.longValue();
                            ugb ugbVar = new ugb();
                            do {
                                SystemClock.sleep(ugbVar.next().longValue());
                                yqtVarA = uft.a(fileChannel, z);
                            } while (!yqtVarA.g());
                            ufqVar = yqtVarA.c();
                        }
                    }
                    ufv ufvVar3 = new ufv(ufqVar);
                    try {
                        if (ufvVar3.a == null) {
                            ufvVar3.close();
                        } else {
                            final Closeable closeable3 = ufvVar.a;
                            ufvVar.a = null;
                            final Closeable closeable4 = ufvVar2.a;
                            ufvVar2.a = null;
                            final Closeable closeable5 = ufvVar3.a;
                            ufvVar3.a = null;
                            closeable = new Closeable() { // from class: uhd
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() throws IOException {
                                    Closeable closeable6 = closeable3;
                                    Closeable closeable7 = closeable4;
                                    Closeable closeable8 = closeable5;
                                    if (closeable8 != null) {
                                        try {
                                            try {
                                                closeable8.close();
                                            } catch (Throwable th) {
                                                if (closeable7 != null) {
                                                    try {
                                                        closeable7.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            if (closeable6 != null) {
                                                try {
                                                    closeable6.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (closeable7 != null) {
                                        closeable7.close();
                                    }
                                    if (closeable6 != null) {
                                        closeable6.close();
                                    }
                                }
                            };
                            ufvVar3.close();
                        }
                        ufvVar2.close();
                    } finally {
                    }
                } finally {
                }
            }
            ufvVar.close();
            return closeable;
        } finally {
        }
    }
}
