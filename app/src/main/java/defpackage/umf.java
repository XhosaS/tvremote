package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.protobuf.MessageLite;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umf implements unl {
    public final String a;
    public final zyd b;
    public final ukj c;
    public final Executor d;
    public final ueg e;
    public final uln f;
    public final yqt g;
    public final wuw i;
    private boolean q;
    static final umb n = new umb();
    static final umc m = new umc();
    public final uie h = new ume(this);
    public final Object j = new Object();
    public final zwv k = new zwv();
    private final zwv o = new zwv();
    private final zwv p = new zwv();
    public Object l = null;
    private ukh r = null;

    public umf(String str, zyd zydVar, ukj ukjVar, Executor executor, ueg uegVar, uln ulnVar, yqt yqtVar, wuw wuwVar) {
        this.a = str;
        this.b = zxn.i(zydVar);
        this.c = ukjVar;
        this.d = executor;
        this.e = uegVar;
        this.f = ulnVar;
        this.g = yqtVar;
        this.i = wuwVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID.randomUUID().toString();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static zyd b(final zyd zydVar, final Closeable closeable, Executor executor) {
        return zxn.b(zydVar).a(new Callable() { // from class: ulw
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                closeable.close();
                return zxn.o(zydVar);
            }
        }, executor);
    }

    public static boolean e(IOException iOException) {
        return (iOException instanceof ufg) || (iOException.getCause() instanceof ufg);
    }

    private final Closeable k(Uri uri, umb umbVar) throws ufx {
        boolean z = umbVar != n;
        try {
            ueg uegVar = this.e;
            uhe uheVar = new uhe(true, true);
            uheVar.a = z;
            return (Closeable) uegVar.c(uri, uheVar);
        } catch (ufx e) {
            if (z) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.unl
    public final zvh a() {
        return new zvh() { // from class: ulq
            @Override // defpackage.zvh
            public final zyd a() {
                umf umfVar = this.a;
                zyd zydVarI = zxn.i(umfVar.b);
                final ulx ulxVar = new ulx(umfVar);
                final uio uioVar = (uio) umfVar.f;
                return zuz.g(zydVarI, new yqi() { // from class: uih
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        Uri uri = (Uri) obj;
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        intentFilter.addDataScheme(uri.getScheme());
                        intentFilter.addDataPath(uri.getPath(), 0);
                        int i = zjr.b;
                        intentFilter.addDataPath(uri.buildUpon().path(zjy.a.a(uri.getPath(), StandardCharsets.UTF_8).toString()).build().getPath(), 0);
                        intentFilter.addDataAuthority("*", null);
                        Runnable runnable = ulxVar;
                        uim uimVar = new uim(runnable);
                        int i2 = Build.VERSION.SDK_INT;
                        uio uioVar2 = uioVar;
                        if (i2 >= 33) {
                            uioVar2.b.registerReceiver(uimVar, intentFilter, uioVar2.d, uioVar2.e, 2);
                        } else {
                            uioVar2.b.registerReceiver(uimVar, intentFilter, uioVar2.d, uioVar2.e);
                        }
                        synchronized (uioVar2.i) {
                            uioVar2.h.l(uri, runnable);
                        }
                        return null;
                    }
                }, zwk.a);
            }
        };
    }

    public final Object c(Uri uri) throws IOException {
        InputStream inputStream;
        try {
            try {
                wvx wvxVarB = this.i.b("Read " + this.a);
                try {
                    inputStream = (InputStream) this.e.c(uri, new uhi());
                    try {
                        MessageLite messageLiteC = ((uog) this.c).c(inputStream);
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
                ueg uegVar = this.e;
                if (!uegVar.h(uri)) {
                    return ((uof) this.c).a;
                }
                inputStream = (InputStream) uegVar.c(uri, new uhi());
                try {
                    MessageLite messageLiteC2 = ((uog) this.c).c(inputStream);
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
            throw unn.a(this.e, uri, e, this.a);
        }
    }

    public final void d() {
        Object obj = this.j;
        synchronized (obj) {
            this.l = null;
            this.q = true;
            synchronized (obj) {
            }
        }
    }

    @Override // defpackage.unl
    public final String f() {
        return this.a;
    }

    public final Object g(umb umbVar, Uri uri) throws IOException {
        Closeable closeableK;
        synchronized (this.j) {
            Object obj = this.l;
            if (obj != null) {
                return obj;
            }
            try {
                closeableK = k(uri, umbVar);
            } catch (FileNotFoundException unused) {
                Object objC = c(uri);
                synchronized (this.j) {
                    if (this.q) {
                        objC = null;
                    } else {
                        this.l = objC;
                    }
                    if (objC != null) {
                        return objC;
                    }
                    closeableK = k(uri, umbVar);
                }
            }
            try {
                Object objC2 = c(uri);
                synchronized (this.j) {
                    if (closeableK != null) {
                        this.l = objC2;
                        closeableK.close();
                    }
                }
                return objC2;
            } catch (Throwable th) {
                if (closeableK != null) {
                    try {
                        closeableK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // defpackage.unl
    public final zyd h(final zvi zviVar, final Executor executor, umc umcVar) {
        final umc umcVar2 = null;
        return this.k.b(wyo.b(new zvh(zviVar, executor, umcVar2) { // from class: ulu
            public final /* synthetic */ zvi b;
            public final /* synthetic */ Executor c;
            public final /* synthetic */ umc d = null;

            @Override // defpackage.zvh
            public final zyd a() throws IOException {
                zyd zydVarA;
                final zyd zydVarH;
                zyd zydVarG;
                final umf umfVar = this.a;
                final Uri uri = (Uri) zxn.o(umfVar.b);
                ufv ufvVar = new ufv((Closeable) umfVar.e.c(uri, new uhe(false, false)));
                zvi zviVar2 = this.b;
                Executor executor2 = this.c;
                try {
                    try {
                        zydVarH = zxn.h(umfVar.c(uri));
                    } catch (IOException e) {
                        yqt yqtVar = umfVar.g;
                        if (yqtVar.g()) {
                            if (umf.e(e)) {
                                zydVarA = zxn.g(e);
                            } else {
                                zydVarA = ((uid) yqtVar.c()).a(e, umfVar.h);
                            }
                            zydVarH = zuz.h(zydVarA, wyo.c(new zvi() { // from class: ulz
                                @Override // defpackage.zvi
                                public final zyd a(Object obj) {
                                    return zxn.h(umfVar.c(uri));
                                }
                            }), umfVar.d);
                        } else {
                            zydVarG = zxn.g(e);
                        }
                    }
                    final zyd zydVarH2 = zuz.h(zydVarH, zviVar2, executor2);
                    zyd zydVarH3 = zuz.h(zydVarH2, wyo.c(new zvi() { // from class: uly
                        @Override // defpackage.zvi
                        public final zyd a(Object obj) {
                            final zyd zydVar = zydVarH2;
                            return zxn.o(zydVarH).equals(zxn.o(zydVar)) ? zydVar : zuz.h(umfVar.j(zydVar), wyo.c(new zvi() { // from class: ulp
                                @Override // defpackage.zvi
                                public final zyd a(Object obj2) {
                                    return zydVar;
                                }
                            }), zwk.a);
                        }
                    }), zwk.a);
                    Closeable closeable = ufvVar.a;
                    ufvVar.a = null;
                    zydVarG = umf.b(zydVarH3, closeable, umfVar.d);
                    ufvVar.close();
                    return zydVarG;
                } catch (Throwable th) {
                    try {
                        ufvVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }), this.d);
    }

    @Override // defpackage.unl
    public final zyd i(final umb umbVar) {
        synchronized (this.j) {
            Object obj = this.l;
            if (obj != null) {
                return zxn.h(obj);
            }
            return zxn.i((umbVar == n ? this.p : this.o).b(wyo.b(new zvh() { // from class: ult
                @Override // defpackage.zvh
                public final zyd a() {
                    final umf umfVar = this.a;
                    final Uri uri = (Uri) zxn.o(umfVar.b);
                    final umb umbVar2 = umbVar;
                    try {
                        return zxn.h(umfVar.g(umbVar2, uri));
                    } catch (IOException e) {
                        yqt yqtVar = umfVar.g;
                        if (!yqtVar.g()) {
                            return zxn.g(e);
                        }
                        if (umf.e(e)) {
                            return zxn.g(e);
                        }
                        Object objC = yqtVar.c();
                        zwv zwvVar = umfVar.k;
                        final uid uidVar = (uid) objC;
                        zvh zvhVarB = wyo.b(new zvh() { // from class: ulv
                            @Override // defpackage.zvh
                            public final zyd a() throws IOException {
                                zyd zydVarG;
                                umf umfVar2 = umfVar;
                                Uri uri2 = (Uri) zxn.o(umfVar2.b);
                                ufv ufvVar = new ufv((Closeable) umfVar2.e.c(uri2, new uhe(false, false)));
                                uid uidVar2 = uidVar;
                                try {
                                    try {
                                        umfVar2.c(uri2);
                                        zydVarG = zxy.a;
                                    } catch (IOException e2) {
                                        zydVarG = umf.e(e2) ? zxn.g(e2) : uidVar2.a(e2, umfVar2.h);
                                    }
                                    Closeable closeable = ufvVar.a;
                                    ufvVar.a = null;
                                    zyd zydVarB = umf.b(zydVarG, closeable, umfVar2.d);
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
                            }
                        });
                        Executor executor = umfVar.d;
                        return zuz.h(zwvVar.b(zvhVarB, executor), wyo.c(new zvi() { // from class: uma
                            @Override // defpackage.zvi
                            public final zyd a(Object obj2) {
                                return zxn.h(umfVar.g(umbVar2, uri));
                            }
                        }), executor);
                    }
                }
            }), this.d));
        }
    }

    public final zyd j(final zyd zydVar) {
        zyd zydVarB;
        final uio uioVar = (uio) this.f;
        final Integer num = (Integer) ((yrt) uioVar.f).a;
        if (num.intValue() < 0) {
            zydVarB = zxy.a;
        } else {
            final zyd zydVar2 = this.b;
            zvi zviVar = uioVar.c;
            zwk zwkVar = zwk.a;
            final zyd zydVarH = zuz.h(zydVar2, zviVar, zwkVar);
            zydVarB = zxn.d(zydVar2, zydVarH).b(new zvh() { // from class: uij
                @Override // defpackage.zvh
                public final zyd a() {
                    Uri uri = (Uri) zxn.o(zydVar2);
                    Set set = (Set) zxn.o(zydVarH);
                    uin uinVar = new uin(set);
                    Iterator it = set.iterator();
                    while (true) {
                        uio uioVar2 = uioVar;
                        if (!it.hasNext()) {
                            uin uinVar2 = uinVar;
                            Integer num2 = num;
                            yrn yrnVarC = yrn.c(yps.a);
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                            zwx zwxVar = (zwx) zxn.n(zwx.u(uinVar2.a), num2.intValue(), uioVar2.g, null);
                            yqi yqiVar = new yqi() { // from class: uii
                                @Override // defpackage.yqi
                                public final Object apply(Object obj) {
                                    atomicBoolean.set(false);
                                    return null;
                                }
                            };
                            zwk zwkVar2 = zwk.a;
                            zyd zydVarG = zud.g(zwxVar, TimeoutException.class, yqiVar, zwkVar2);
                            zxn.p(zydVarG, new uik(uioVar2, atomicBoolean, set, yrnVarC, uinVar2, num2), zwkVar2);
                            return zydVarG;
                        }
                        String str = (String) it.next();
                        uin uinVar3 = uinVar;
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        Boolean bool = false;
                        bool.getClass();
                        intent.setData(uri);
                        intent.setPackage(str);
                        intent.setFlags(268435456);
                        uioVar2.b.sendOrderedBroadcast(intent, null, uinVar3, uioVar2.e, -1, null, null);
                        uinVar = uinVar3;
                    }
                }
            }, zwkVar);
        }
        return zuz.h(zydVarB, wyo.c(new zvi() { // from class: ulr
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final umf umfVar = this.a;
                return zuz.h(zydVar, wyo.c(new zvi() { // from class: uls
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) throws IOException {
                        umf umfVar2 = umfVar;
                        Uri uri = (Uri) zxn.o(umfVar2.b);
                        Uri uriA = unp.a(uri, ".tmp");
                        try {
                            wvx wvxVarB = umfVar2.i.b("Write " + umfVar2.a);
                            try {
                                ufd ufdVar = new ufd();
                                try {
                                    ueg uegVar = umfVar2.e;
                                    uhn uhnVar = new uhn();
                                    uhnVar.a = new ufd[]{ufdVar};
                                    OutputStream outputStream = (OutputStream) uegVar.c(uriA, uhnVar);
                                    try {
                                        ((MessageLite) obj2).e(outputStream);
                                        ufdVar.b();
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        wvxVarB.close();
                                        umfVar2.e.g(uriA, uri);
                                        synchronized (umfVar2.j) {
                                            umfVar2.l = obj2;
                                        }
                                        return zxy.a;
                                    } catch (Throwable th) {
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    throw unn.a(umfVar2.e, uri, e, umfVar2.a);
                                }
                            } finally {
                            }
                        } catch (IOException e2) {
                            ueg uegVar2 = umfVar2.e;
                            if (uegVar2.h(uriA)) {
                                try {
                                    uegVar2.f(uriA);
                                } catch (IOException e3) {
                                    e2.addSuppressed(e3);
                                }
                            }
                            throw e2;
                        }
                    }
                }), umfVar.d);
            }
        }), zwk.a);
    }
}
