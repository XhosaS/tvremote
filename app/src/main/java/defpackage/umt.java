package defpackage;

import android.net.Uri;
import com.google.protobuf.MessageLite;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umt implements unl {
    public final String a;
    public final zyd b;
    public final Executor c;
    public final ueg d;
    public final yqt e;
    private final ukj i;
    private final wuw j;
    public final Object f = new Object();
    private final zwv k = new zwv();
    public zyd g = null;
    public ukh h = null;

    public umt(String str, zyd zydVar, ukj ukjVar, Executor executor, ueg uegVar, yqt yqtVar, wuw wuwVar) {
        this.a = str;
        this.b = zxn.i(zydVar);
        this.i = ukjVar;
        this.c = new zyt(executor);
        this.d = uegVar;
        this.e = yqtVar;
        this.j = wuwVar;
    }

    @Override // defpackage.unl
    public final zvh a() {
        return new umm(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0031, B:16:0x0033), top: B:21:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zyd b() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f
            monitor-enter(r0)
            zyd r1 = r4.g     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L16
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L16
            zyd r1 = r4.g     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L35
            defpackage.zxn.o(r1)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L35
            goto L16
        L13:
            r1 = 0
            r4.g = r1     // Catch: java.lang.Throwable -> L35
        L16:
            zyd r1 = r4.g     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L31
            zwv r1 = r4.k     // Catch: java.lang.Throwable -> L35
            umn r2 = new umn     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
            zvh r2 = defpackage.wyo.b(r2)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.Executor r3 = r4.c     // Catch: java.lang.Throwable -> L35
            zyd r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> L35
            zyd r1 = defpackage.zxn.i(r1)     // Catch: java.lang.Throwable -> L35
            r4.g = r1     // Catch: java.lang.Throwable -> L35
        L31:
            zyd r1 = r4.g     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return r1
        L35:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umt.b():zyd");
    }

    public final Object c(Uri uri) throws IOException {
        try {
            try {
                wvx wvxVarB = this.j.b("Read " + this.a);
                try {
                    InputStream inputStream = (InputStream) this.d.c(uri, new uhi());
                    try {
                        MessageLite messageLiteC = ((uog) this.i).c(inputStream);
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
            } catch (FileNotFoundException e) {
                if (this.d.h(uri)) {
                    throw e;
                }
                return ((uof) this.i).a;
            }
        } catch (IOException e2) {
            throw unn.a(this.d, uri, e2, this.a);
        }
    }

    public final void d(Uri uri, Object obj) throws IOException {
        Uri uriA = unp.a(uri, ".tmp");
        try {
            wvx wvxVarB = this.j.b("Write " + this.a);
            try {
                ufd ufdVar = new ufd();
                try {
                    ueg uegVar = this.d;
                    uhn uhnVar = new uhn();
                    uhnVar.a = new ufd[]{ufdVar};
                    OutputStream outputStream = (OutputStream) uegVar.c(uriA, uhnVar);
                    try {
                        ((MessageLite) obj).e(outputStream);
                        ufdVar.b();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        wvxVarB.close();
                        this.d.g(uriA, uri);
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
                    throw unn.a(this.d, uri, e, this.a);
                }
            } finally {
            }
        } catch (IOException e2) {
            ueg uegVar2 = this.d;
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

    @Override // defpackage.unl
    public final String f() {
        return this.a;
    }

    @Override // defpackage.unl
    public final zyd h(final zvi zviVar, final Executor executor, umc umcVar) {
        final zyd zydVarB = b();
        return this.k.b(wyo.b(new zvh() { // from class: umo
            @Override // defpackage.zvh
            public final zyd a() {
                final umt umtVar = this.a;
                zvi zviVar2 = new zvi() { // from class: umk
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        zyd zydVar;
                        umt umtVar2 = umtVar;
                        synchronized (umtVar2.f) {
                            zydVar = umtVar2.g;
                        }
                        return zydVar;
                    }
                };
                zyd zydVar = zydVarB;
                zwk zwkVar = zwk.a;
                final zyd zydVarH = zuz.h(zydVar, zviVar2, zwkVar);
                final zyd zydVarH2 = zuz.h(zydVarH, zviVar, executor);
                return zuz.h(zydVarH2, wyo.c(new zvi() { // from class: ump
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        final zyd zydVar2 = zydVarH2;
                        if (zxn.o(zydVarH).equals(zxn.o(zydVar2))) {
                            return zxn.h(obj);
                        }
                        final umt umtVar2 = umtVar;
                        zyd zydVarH3 = zuz.h(zydVar2, wyo.c(new zvi() { // from class: uml
                            @Override // defpackage.zvi
                            public final zyd a(Object obj2) throws IOException {
                                umt umtVar3 = umtVar2;
                                umtVar3.d((Uri) zxn.o(umtVar3.b), obj2);
                                zyd zydVar3 = zydVar2;
                                synchronized (umtVar3.f) {
                                    umtVar3.g = zydVar3;
                                }
                                return zxn.h(obj2);
                            }
                        }), umtVar2.c);
                        synchronized (umtVar2.f) {
                            ukh ukhVar = umtVar2.h;
                            if (ukhVar != null) {
                                zxn.p(zydVarH3, new umq(ukhVar), zwk.a);
                            }
                        }
                        return zydVarH3;
                    }
                }), zwkVar);
            }
        }), zwk.a);
    }

    @Override // defpackage.unl
    public final zyd i(umb umbVar) {
        return b();
    }
}
