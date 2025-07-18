package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class buh extends Thread {
    private static final cbt a = cbt.k("com/google/android/tv/remote/service/server/PacketReaderThread");

    protected abstract InputStream a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    protected abstract void c(bux buxVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [clt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [cni] */
    /* JADX WARN: Type inference failed for: r7v3, types: [cno] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        InputStream inputStreamA;
        bux buxVar;
        cbt cbtVar = a;
        ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/server/PacketReaderThread", "run", 19, "PacketReaderThread.java")).t("Communication starting with %s", this);
        try {
            inputStreamA = a();
        } catch (IOException e) {
            ((cbs) ((cbs) a.g().i(e)).j("com/google/android/tv/remote/service/server/PacketReaderThread", "run", 35, "PacketReaderThread.java")).p("Failed connection");
        }
        try {
            if (inputStreamA == null) {
                ((cbs) cbtVar.g().j("com/google/android/tv/remote/service/server/PacketReaderThread", "run", 23, "PacketReaderThread.java")).t("Failed to prepare input stream for %s", this);
                return;
            }
            while (true) {
                cli cliVar = cli.a;
                cni cniVar = cni.a;
                cli cliVar2 = cli.a;
                bux buxVar2 = bux.a;
                try {
                    int i = inputStreamA.read();
                    if (i == -1) {
                        buxVar = null;
                    } else {
                        cky ckyVarK = cky.K(new ckc(inputStreamA, cky.I(i, inputStreamA)));
                        ?? P = buxVar2.p();
                        try {
                            try {
                                try {
                                    ?? B = cni.a.b(P);
                                    B.l(P, ckz.p(ckyVarK), cliVar2);
                                    B.g(P);
                                    try {
                                        ckyVarK.z(0);
                                        buxVar = P;
                                    } catch (cmh e2) {
                                        throw e2;
                                    }
                                } catch (IOException e3) {
                                    if (!(e3.getCause() instanceof cmh)) {
                                        throw new cmh(e3);
                                    }
                                    throw ((cmh) e3.getCause());
                                } catch (RuntimeException e4) {
                                    if (!(e4.getCause() instanceof cmh)) {
                                        throw e4;
                                    }
                                    throw ((cmh) e4.getCause());
                                }
                            } catch (cnw e5) {
                                throw e5.a();
                            }
                        } catch (cmh e6) {
                            if (!e6.a) {
                                throw e6;
                            }
                            throw new cmh(e6);
                        }
                    }
                    clt.B(buxVar);
                    bux buxVar3 = buxVar;
                    if (buxVar3 == null) {
                        break;
                    } else {
                        c(buxVar3);
                    }
                } catch (cmh e7) {
                    if (!e7.a) {
                        throw e7;
                    }
                    throw new cmh(e7);
                } catch (IOException e8) {
                    throw new cmh(e8);
                }
            }
            inputStreamA.close();
            ((cbs) a.e().j("com/google/android/tv/remote/service/server/PacketReaderThread", "run", 38, "PacketReaderThread.java")).t("Disconnecting client %s", this);
            b();
        } finally {
        }
    }
}
