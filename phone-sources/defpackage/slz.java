package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slz implements smd {
    public final uhp a;
    public final Executor b;
    public final tst c;
    public final aafi f;
    private final String g;
    private final smg h;
    public final Object d = new Object();
    private final unx i = new unx();
    public uhp e = null;

    public slz(String str, uhp uhpVar, smg smgVar, Executor executor, aafi aafiVar, tst tstVar) {
        this.g = str;
        this.a = sfy.D(uhpVar);
        this.h = smgVar;
        this.b = new uib(executor);
        this.f = aafiVar;
        this.c = tstVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0033, B:16:0x0035), top: B:21:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.uhp d() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            uhp r1 = r4.e     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L16
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L16
            uhp r1 = r4.e     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L37
            defpackage.sfy.J(r1)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L37
            goto L16
        L13:
            r1 = 0
            r4.e = r1     // Catch: java.lang.Throwable -> L37
        L16:
            uhp r1 = r4.e     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L33
            unx r1 = r4.i     // Catch: java.lang.Throwable -> L37
            osv r2 = new osv     // Catch: java.lang.Throwable -> L37
            r3 = 14
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L37
            ufv r2 = defpackage.trc.b(r2)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.Executor r3 = r4.b     // Catch: java.lang.Throwable -> L37
            uhp r1 = r1.e(r2, r3)     // Catch: java.lang.Throwable -> L37
            uhp r1 = defpackage.sfy.D(r1)     // Catch: java.lang.Throwable -> L37
            r4.e = r1     // Catch: java.lang.Throwable -> L37
        L33:
            uhp r1 = r4.e     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r1
        L37:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.slz.d():uhp");
    }

    @Override // defpackage.smd
    public final ufv a() {
        return new osv(this, 13);
    }

    public final Object b(Uri uri) throws IOException {
        try {
            try {
                tql tqlVarJ = sss.j("Read " + this.g);
                try {
                    InputStream inputStream = (InputStream) this.f.r(uri, new skn(2));
                    try {
                        vvj vvjVarA = this.h.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        tqlVarJ.close();
                        return vvjVarA;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        tqlVarJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                if (this.f.u(uri)) {
                    throw e;
                }
                return this.h.a;
            }
        } catch (IOException e2) {
            throw sik.B(this.f, uri, e2, this.g);
        }
    }

    public final void c(Uri uri, Object obj) {
        Uri uriB = sil.b(uri, ".tmp");
        try {
            tql tqlVarJ = sss.j("Write " + this.g);
            try {
                uri uriVar = new uri();
                try {
                    aafi aafiVar = this.f;
                    sks sksVar = new sks();
                    sksVar.a = new uri[]{uriVar};
                    OutputStream outputStream = (OutputStream) aafiVar.r(uriB, sksVar);
                    try {
                        ((vvj) obj).g(outputStream);
                        uriVar.d();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        tqlVarJ.close();
                        this.f.t(uriB, uri);
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
                    throw sik.B(this.f, uri, e, this.g);
                }
            } finally {
            }
        } catch (IOException e2) {
            aafi aafiVar2 = this.f;
            if (aafiVar2.u(uriB)) {
                try {
                    aafiVar2.s(uriB);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.smd
    public final String f() {
        return this.g;
    }

    @Override // defpackage.smd
    public final uhp h(ufw ufwVar, Executor executor) {
        return this.i.e(trc.b(new sla(this, d(), ufwVar, executor, 2)), ugk.a);
    }

    @Override // defpackage.smd
    public final uhp i() {
        return d();
    }
}
