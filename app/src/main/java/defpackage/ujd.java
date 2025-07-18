package defpackage;

import android.net.Uri;
import com.google.protobuf.MessageLite;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujd implements unl {
    public final String a;
    public final zyd b;
    public final ukj c;
    public final Executor d;
    public final ueg e;
    public final wuw f;
    public final uie g = new ujb(this);
    public final zwv h = new zwv();
    private final yqt i;

    public ujd(String str, zyd zydVar, ukj ukjVar, Executor executor, ueg uegVar, yqt yqtVar, wuw wuwVar) {
        this.a = str;
        this.b = zxn.i(zydVar);
        this.c = ukjVar;
        this.d = executor;
        this.e = uegVar;
        this.i = yqtVar;
        this.f = wuwVar;
    }

    public static zyd b(final zyd zydVar, final Closeable closeable) {
        return zxn.b(zydVar).a(new Callable() { // from class: uiz
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                closeable.close();
                return zxn.o(zydVar);
            }
        }, zwk.a);
    }

    public static boolean g(IOException iOException) {
        return (iOException instanceof ufg) || (iOException.getCause() instanceof ufg);
    }

    @Override // defpackage.unl
    public final zvh a() {
        return new zvh() { // from class: uit
            @Override // defpackage.zvh
            public final zyd a() {
                return zxn.i(uno.a(this.a.b));
            }
        };
    }

    public final zyd c(final Uri uri, ujc ujcVar) {
        try {
            return zxn.h(e(uri));
        } catch (IOException e) {
            yqt yqtVar = this.i;
            return !yqtVar.g() ? zxn.g(e) : g(e) ? zxn.g(e) : zuz.h(ujcVar.a(e, (uid) yqtVar.c()), wyo.c(new zvi() { // from class: uiy
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    return zxn.h(this.a.e(uri));
                }
            }), this.d);
        }
    }

    public final zyd d(zyd zydVar) {
        return zuz.h(zydVar, wyo.c(new zvi() { // from class: uiv
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws IOException {
                ujd ujdVar = this.a;
                MessageLite messageLite = (MessageLite) obj;
                Uri uri = (Uri) zxn.o(ujdVar.b);
                Uri uriA = unp.a(uri, ".tmp");
                try {
                    wvx wvxVarB = ujdVar.f.b("Write " + ujdVar.a);
                    try {
                        ufd ufdVar = new ufd();
                        try {
                            ueg uegVar = ujdVar.e;
                            uhn uhnVar = new uhn();
                            uhnVar.a = new ufd[]{ufdVar};
                            OutputStream outputStream = (OutputStream) uegVar.c(uriA, uhnVar);
                            try {
                                messageLite.e(outputStream);
                                ufdVar.b();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                wvxVarB.close();
                                ujdVar.e.g(uriA, uri);
                                return zxn.h(messageLite);
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
                            throw unn.a(ujdVar.e, uri, e, ujdVar.a);
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    ueg uegVar2 = ujdVar.e;
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
        }), this.d);
    }

    public final MessageLite e(Uri uri) throws IOException {
        InputStream inputStream;
        try {
            try {
                wvx wvxVarB = this.f.b("Read " + this.a);
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

    @Override // defpackage.unl
    public final String f() {
        return this.a;
    }

    @Override // defpackage.unl
    public final zyd h(final zvi zviVar, final Executor executor, umc umcVar) {
        return this.h.b(wyo.b(new zvh() { // from class: uir
            @Override // defpackage.zvh
            public final zyd a() throws IOException {
                final ujd ujdVar = this.a;
                Uri uri = (Uri) zxn.o(ujdVar.b);
                ufv ufvVar = new ufv((Closeable) ujdVar.e.c(uri, new uhe(false, false)));
                zvi zviVar2 = zviVar;
                Executor executor2 = executor;
                try {
                    final zyd zydVarC = ujdVar.c(uri, new ujc() { // from class: uiw
                        @Override // defpackage.ujc
                        public final zyd a(IOException iOException, uid uidVar) {
                            return uidVar.a(iOException, ujdVar.g);
                        }
                    });
                    final zyd zydVarH = zuz.h(zydVarC, zviVar2, executor2);
                    zyd zydVarH2 = zuz.h(zydVarH, wyo.c(new zvi() { // from class: uix
                        @Override // defpackage.zvi
                        public final zyd a(Object obj) {
                            MessageLite messageLite = (MessageLite) zxn.o(zydVarC);
                            zyd zydVar = zydVarH;
                            return messageLite.equals(zxn.o(zydVar)) ? zydVar : ujdVar.d(zydVar);
                        }
                    }), zwk.a);
                    Closeable closeable = ufvVar.a;
                    ufvVar.a = null;
                    zyd zydVarB = ujd.b(zydVarH2, closeable);
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
        }), this.d);
    }

    @Override // defpackage.unl
    public final zyd i(umb umbVar) {
        return zxn.i(zxn.l(wyo.b(new zvh() { // from class: uiu
            @Override // defpackage.zvh
            public final zyd a() {
                final ujd ujdVar = this.a;
                return ujdVar.c((Uri) zxn.o(ujdVar.b), new ujc() { // from class: uis
                    @Override // defpackage.ujc
                    public final zyd a(IOException iOException, final uid uidVar) {
                        final ujd ujdVar2 = ujdVar;
                        return ujdVar2.h.b(wyo.b(new zvh() { // from class: uiq
                            @Override // defpackage.zvh
                            public final zyd a() throws IOException {
                                zyd zydVarG;
                                ujd ujdVar3 = ujdVar2;
                                Uri uri = (Uri) zxn.o(ujdVar3.b);
                                ufv ufvVar = new ufv((Closeable) ujdVar3.e.c(uri, new uhe(false, false)));
                                uid uidVar2 = uidVar;
                                try {
                                    try {
                                        ujdVar3.e(uri);
                                        zydVarG = zxy.a;
                                    } catch (IOException e) {
                                        zydVarG = ujd.g(e) ? zxn.g(e) : uidVar2.a(e, ujdVar3.g);
                                    }
                                    Closeable closeable = ufvVar.a;
                                    ufvVar.a = null;
                                    zyd zydVarB = ujd.b(zydVarG, closeable);
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
                        }), ujdVar2.d);
                    }
                });
            }
        }), this.d));
    }
}
