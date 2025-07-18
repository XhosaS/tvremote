package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.google.android.libraries.storage.protostore.MappedCounterCacheVersion;
import com.google.protobuf.MessageLite;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uld implements unl {
    public final zyd a;
    public final Executor b;
    public final ueg c;
    public final boolean d;
    public final yqt e;
    public final vrf g;
    public final String h;
    public final wuw i;
    private final ukj l;
    public final zwv f = new zwv();
    private final zwv m = new zwv();
    public final ulc j = new ulc(this);
    private final AtomicBoolean n = new AtomicBoolean(false);
    public final AtomicReference k = new AtomicReference(null);
    private final AtomicReference o = new AtomicReference(null);

    public uld(String str, zyd zydVar, ukj ukjVar, Executor executor, ueg uegVar, yqt yqtVar, boolean z, final ulb ulbVar, wuw wuwVar) {
        this.h = str;
        this.a = zxn.i(zydVar);
        this.l = ukjVar;
        this.b = executor;
        this.c = uegVar;
        this.i = wuwVar;
        this.d = z;
        this.e = yqtVar;
        this.g = new vrf(new zvh() { // from class: ukx
            @Override // defpackage.zvh
            public final zyd a() throws IOException {
                uld uldVar = this.a;
                Uri uriBuild = unp.a((Uri) zxn.o(uldVar.a), ".version").buildUpon().fragment("").build();
                new uks(ulbVar).a.a();
                uhg uhgVar = new uhg();
                uhgVar.a = true;
                File file = (File) uldVar.c.c(uriBuild, uhgVar);
                zkt.b(file);
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 939524096);
                try {
                    int fd = parcelFileDescriptorOpen.getFd();
                    if (MappedCounterCacheVersion.nativeFileTruncate(fd) != 0) {
                        throw new IOException("Failed to truncate counter file");
                    }
                    long jNativeMmap = MappedCounterCacheVersion.nativeMmap(fd, false);
                    if (jNativeMmap < 0) {
                        throw new IOException("Failed to mmap counter file");
                    }
                    MappedCounterCacheVersion mappedCounterCacheVersion = new MappedCounterCacheVersion(jNativeMmap);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return zxn.h(mappedCounterCacheVersion);
                } catch (Throwable th) {
                    if (parcelFileDescriptorOpen != null) {
                        try {
                            parcelFileDescriptorOpen.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }, executor);
    }

    public static zyd b(final zyd zydVar, final Closeable closeable, Executor executor) {
        return zxn.b(zydVar).a(new Callable() { // from class: ukt
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                closeable.close();
                return zxn.o(zydVar);
            }
        }, executor);
    }

    public static boolean g(IOException iOException) {
        return (iOException instanceof ufg) || (iOException.getCause() instanceof ufg);
    }

    private final void j(Uri uri, IOException iOException) throws IOException {
        ueg uegVar = this.c;
        if (!uegVar.h(uri)) {
            throw iOException;
        }
        try {
            uegVar.f(uri);
            throw iOException;
        } catch (IOException e) {
            iOException.addSuppressed(e);
            throw iOException;
        }
    }

    @Override // defpackage.unl
    public final zvh a() {
        return new zvh() { // from class: ukl
            @Override // defpackage.zvh
            public final zyd a() {
                final uld uldVar = this.a;
                zyd zydVarH = zuz.h(uldVar.a, new zvi() { // from class: uky
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        return uldVar.g.b();
                    }
                }, zwk.a);
                if (uldVar.d) {
                    zydVarH = zuz.h(zydVarH, wyo.c(new zvi() { // from class: ukm
                        @Override // defpackage.zvi
                        public final zyd a(Object obj) {
                            final uld uldVar2 = uldVar;
                            final Uri uri = (Uri) zxn.o(uldVar2.a);
                            return zxn.i(uldVar2.h(wyo.c(new zvi() { // from class: ukn
                                @Override // defpackage.zvi
                                public final zyd a(Object obj2) {
                                    uld uldVar3 = uldVar2;
                                    Uri uriA = unp.a(uri, ".bak");
                                    try {
                                        ueg uegVar = uldVar3.c;
                                        if (!uegVar.h(uriA)) {
                                            return zxn.h(obj2);
                                        }
                                        Object objC = uldVar3.c(uriA);
                                        uegVar.f(uriA);
                                        return zxn.h(objC);
                                    } catch (IOException e) {
                                        return zxn.g(e);
                                    }
                                }
                            }), uldVar2.b, null));
                        }
                    }), uldVar.b);
                }
                return uno.a(zydVarH);
            }
        };
    }

    public final Object c(Uri uri) throws IOException {
        InputStream inputStream;
        try {
            try {
                wvx wvxVarB = this.i.b("Read " + this.h);
                try {
                    inputStream = (InputStream) this.c.c(uri, new uhi());
                    try {
                        MessageLite messageLiteC = ((uog) this.l).c(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        wvxVarB.close();
                        return messageLiteC;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        wvxVarB.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                ueg uegVar = this.c;
                if (!uegVar.h(uri)) {
                    return ((uof) this.l).a;
                }
                inputStream = (InputStream) uegVar.c(uri, new uhi());
                try {
                    MessageLite messageLiteC2 = ((uog) this.l).c(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return messageLiteC2;
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw unn.a(this.c, uri, e, this.h);
        }
    }

    public final Object d(Uri uri, MappedCounterCacheVersion mappedCounterCacheVersion) throws IOException {
        AtomicReference atomicReference = this.k;
        Pair pair = (Pair) atomicReference.get();
        long jNativeGetCounter = MappedCounterCacheVersion.nativeGetCounter(mappedCounterCacheVersion.a);
        if (pair != null && ((Long) pair.second).longValue() == jNativeGetCounter) {
            return pair.first;
        }
        ueg uegVar = this.c;
        uhe uheVar = new uhe(true, false);
        uheVar.a = true;
        Closeable closeable = (Closeable) uegVar.c(uri, uheVar);
        try {
            Object objC = c(uri);
            if (this.n.get()) {
                this.o.set(objC);
            }
            if (closeable != null) {
                atomicReference.set(Pair.create(objC, Long.valueOf(jNativeGetCounter)));
            }
            if (closeable != null) {
                closeable.close();
            }
            return objC;
        } catch (Throwable th) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void e(Uri uri, Object obj, MappedCounterCacheVersion mappedCounterCacheVersion) throws IOException {
        Uri uriA = unp.a(uri, ".tmp");
        try {
            ufd ufdVar = new ufd();
            try {
                ueg uegVar = this.c;
                uhn uhnVar = new uhn();
                uhnVar.a = new ufd[]{ufdVar};
                OutputStream outputStream = (OutputStream) uegVar.c(uriA, uhnVar);
                try {
                    ((MessageLite) obj).e(outputStream);
                    ufdVar.b();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } catch (IOException e) {
                throw unn.a(this.c, uri, e, this.h);
            }
        } catch (IOException e2) {
            j(uriA, e2);
        }
        long jNativeIncrementCounter = MappedCounterCacheVersion.nativeIncrementCounter(mappedCounterCacheVersion.a);
        Uri uriA2 = unp.a(uri, ".tmp");
        try {
            this.c.g(uriA2, uri);
        } catch (IOException e3) {
            j(uriA2, e3);
        }
        if (this.n.get()) {
            this.o.set(obj);
        }
        this.k.set(Pair.create(obj, Long.valueOf(jNativeIncrementCounter)));
    }

    @Override // defpackage.unl
    public final String f() {
        return this.h;
    }

    @Override // defpackage.unl
    public final zyd h(final zvi zviVar, final Executor executor, umc umcVar) {
        return this.f.b(wyo.b(new zvh() { // from class: ukp
            @Override // defpackage.zvh
            public final zyd a() throws IOException {
                final zyd zydVarH;
                final uld uldVar = this.a;
                final Uri uri = (Uri) zxn.o(uldVar.a);
                zvi zviVar2 = zviVar;
                Executor executor2 = executor;
                try {
                    ufv ufvVar = new ufv((Closeable) uldVar.c.c(uri, new uhe(false, false)));
                    try {
                        try {
                            zydVarH = zxn.h(uldVar.c(uri));
                        } catch (IOException e) {
                            yqt yqtVar = uldVar.e;
                            if (yqtVar.g() && !uld.g(e)) {
                                zydVarH = zuz.h(((uid) yqtVar.c()).a(e, uldVar.j), wyo.c(new zvi() { // from class: ukq
                                    @Override // defpackage.zvi
                                    public final zyd a(Object obj) {
                                        return zxn.h(uldVar.c(uri));
                                    }
                                }), uldVar.b);
                            } else {
                                zydVarH = zxn.g(e);
                            }
                        }
                        zyd zydVarH2 = zuz.h(zwx.u(zydVarH), wyo.c(zviVar2), executor2);
                        zvi zviVarC = wyo.c(new zvi() { // from class: ukv
                            @Override // defpackage.zvi
                            public final zyd a(Object obj) {
                                Object objO = zxn.o(zydVarH);
                                if (objO.equals(obj)) {
                                    return zxn.h(obj);
                                }
                                uld uldVar2 = uldVar;
                                MappedCounterCacheVersion mappedCounterCacheVersion = (MappedCounterCacheVersion) zxn.o(uldVar2.g.b());
                                Uri uri2 = (Uri) zxn.o(uldVar2.a);
                                Pair pair = (Pair) uldVar2.k.get();
                                long jNativeGetCounter = MappedCounterCacheVersion.nativeGetCounter(mappedCounterCacheVersion.a);
                                if (pair != null && jNativeGetCounter == ((Long) pair.second).longValue()) {
                                    yqw.M(objO.equals(pair.first), "Cache is inconsistent when it shouldn't be");
                                }
                                wvx wvxVarB = uldVar2.i.b("Write ".concat(String.valueOf(uldVar2.h)));
                                try {
                                    uldVar2.e(uri2, obj, mappedCounterCacheVersion);
                                    wvxVarB.close();
                                    return zxn.h(obj);
                                } catch (Throwable th) {
                                    try {
                                        wvxVarB.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        });
                        Executor executor3 = uldVar.b;
                        zyd zydVarH3 = zuz.h(zydVarH2, zviVarC, executor3);
                        Closeable closeable = ufvVar.a;
                        ufvVar.a = null;
                        zyd zydVarB = uld.b(zydVarH3, closeable, executor3);
                        ufvVar.close();
                        return zydVarB;
                    } catch (Throwable th) {
                        try {
                            ufvVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    throw unn.a(uldVar.c, unp.a(uri, ".lock"), e2, uldVar.h);
                }
            }
        }), this.b);
    }

    @Override // defpackage.unl
    public final zyd i(umb umbVar) {
        try {
            final MappedCounterCacheVersion mappedCounterCacheVersion = (MappedCounterCacheVersion) zxn.o(this.g.b());
            Pair pair = (Pair) this.k.get();
            return (pair == null || ((Long) pair.second).longValue() != ((long) MappedCounterCacheVersion.nativeGetCounter(mappedCounterCacheVersion.a))) ? this.m.b(wyo.b(new zvh() { // from class: ukr
                @Override // defpackage.zvh
                public final zyd a() {
                    final uld uldVar = this.a;
                    final Uri uri = (Uri) zxn.o(uldVar.a);
                    final MappedCounterCacheVersion mappedCounterCacheVersion2 = mappedCounterCacheVersion;
                    try {
                        return zxn.h(uldVar.d(uri, mappedCounterCacheVersion2));
                    } catch (IOException e) {
                        yqt yqtVar = uldVar.e;
                        if (!yqtVar.g()) {
                            return zxn.g(e);
                        }
                        if (uld.g(e)) {
                            return zxn.g(e);
                        }
                        Object objC = yqtVar.c();
                        zwv zwvVar = uldVar.f;
                        final uid uidVar = (uid) objC;
                        zvh zvhVarB = wyo.b(new zvh() { // from class: ukw
                            @Override // defpackage.zvh
                            public final zyd a() throws IOException {
                                zyd zydVarG;
                                uhe uheVar = new uhe(false, false);
                                uld uldVar2 = uldVar;
                                ueg uegVar = uldVar2.c;
                                Uri uri2 = uri;
                                ufv ufvVar = new ufv((Closeable) uegVar.c(uri2, uheVar));
                                uid uidVar2 = uidVar;
                                try {
                                    try {
                                        uldVar2.c(uri2);
                                        zydVarG = zxy.a;
                                    } catch (Throwable th) {
                                        try {
                                            ufvVar.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    zydVarG = uld.g(e2) ? zxn.g(e2) : uidVar2.a(e2, uldVar2.j);
                                }
                                Closeable closeable = ufvVar.a;
                                ufvVar.a = null;
                                zyd zydVarA = uno.a(uld.b(zydVarG, closeable, uldVar2.b));
                                ufvVar.close();
                                return zydVarA;
                            }
                        });
                        Executor executor = uldVar.b;
                        return zuz.h(zwvVar.b(zvhVarB, executor), wyo.c(new zvi() { // from class: uko
                            @Override // defpackage.zvi
                            public final zyd a(Object obj) {
                                return zxn.h(uldVar.d(uri, mappedCounterCacheVersion2));
                            }
                        }), executor);
                    }
                }
            }), this.b) : zxn.h(pair.first);
        } catch (ExecutionException e) {
            return zxn.g(e);
        }
    }
}
