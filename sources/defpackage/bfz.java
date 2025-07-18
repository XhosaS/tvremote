package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfz {
    public final String a;
    public final cja b;
    public final Executor c;
    public final byg d;
    public final bzt g;
    private final bge i;
    public final Object e = new Object();
    private final cih h = new cih();
    public cja f = null;

    public bfz(String str, cja cjaVar, bge bgeVar, Executor executor, bzt bztVar, byg bygVar) {
        this.a = str;
        this.b = qm.L(cjaVar);
        this.i = bgeVar;
        this.c = new cjk(executor);
        this.g = bztVar;
        this.d = bygVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: all -> 0x0036, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0032, B:16:0x0034), top: B:21:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cja a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            cja r1 = r4.f     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L16
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L16
            cja r1 = r4.f     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L36
            defpackage.qm.P(r1)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L36
            goto L16
        L13:
            r1 = 0
            r4.f = r1     // Catch: java.lang.Throwable -> L36
        L16:
            cja r1 = r4.f     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L32
            cih r1 = r4.h     // Catch: java.lang.Throwable -> L36
            ave r2 = new ave     // Catch: java.lang.Throwable -> L36
            r3 = 7
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L36
            chs r2 = defpackage.bxr.a(r2)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.Executor r3 = r4.c     // Catch: java.lang.Throwable -> L36
            cja r1 = r1.a(r2, r3)     // Catch: java.lang.Throwable -> L36
            cja r1 = defpackage.qm.L(r1)     // Catch: java.lang.Throwable -> L36
            r4.f = r1     // Catch: java.lang.Throwable -> L36
        L32:
            cja r1 = r4.f     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return r1
        L36:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfz.a():cja");
    }

    public final Object b(Uri uri) throws IOException {
        try {
            try {
                bxb bxbVarL = awn.l("Read " + this.a);
                try {
                    InputStream inputStream = (InputStream) this.g.g(uri, new bfe(0));
                    try {
                        bge bgeVar = this.i;
                        Object objA = bgeVar.a.u().a(inputStream, bgeVar.b);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        bxbVarL.close();
                        return objA;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        bxbVarL.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                if (this.g.i(uri)) {
                    throw e;
                }
                return this.i.a;
            }
        } catch (IOException e2) {
            throw wz.f(this.g, uri, e2, this.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bfi, java.lang.Object] */
    public final void c(Uri uri, Object obj) {
        Uri uriF = bit.f(uri, ".tmp");
        try {
            bxb bxbVarL = awn.l("Write " + this.a);
            try {
                dcq dcqVar = new dcq((byte[]) null);
                try {
                    bzt bztVar = this.g;
                    bfh bfhVar = new bfh();
                    bfhVar.a = new dcq[]{dcqVar};
                    OutputStream outputStream = (OutputStream) bztVar.g(uriF, bfhVar);
                    try {
                        ((cmz) obj).f(outputStream);
                        dcqVar.b();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        bxbVarL.close();
                        this.g.h(uriF, uri);
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
                    throw wz.f(this.g, uri, e, this.a);
                }
            } finally {
            }
        } catch (IOException e2) {
            bzt bztVar2 = this.g;
            if (bztVar2.i(uriF)) {
                try {
                    cmt cmtVarO = bztVar2.o(uriF);
                    cmtVarO.c.k((Uri) cmtVarO.d);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    public final cja d(cht chtVar, Executor executor) {
        return this.h.a(bxr.a(new bga(this, a(), chtVar, executor, 1)), chz.a);
    }
}
