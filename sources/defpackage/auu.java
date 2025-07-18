package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auu {
    public final File a;
    public int b = 0;
    public boolean c = false;
    private final String d;
    private File e;

    public auu(File file, String str) {
        this.a = file;
        this.d = str;
    }

    final int a() {
        if (c()) {
            return this.b;
        }
        return 0;
    }

    public final File b() {
        if (this.e == null) {
            this.e = new File(this.a, this.d.concat("_crash_counter_storage.pb"));
        }
        return this.e;
    }

    public final boolean c() throws IOException {
        FileInputStream fileInputStream;
        if (this.c) {
            return true;
        }
        try {
            fileInputStream = new FileInputStream(b());
        } catch (FileNotFoundException unused) {
            this.b = 0;
        } catch (IOException e) {
            ((cbs) ((cbs) aqn.a.g().i(e)).j("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "maybeLoad", 102, "CrashCounter.java")).p("failed to read counter from disk.");
            return false;
        }
        try {
            cli cliVarA = cli.a();
            avb avbVar = avb.a;
            cky ckyVarK = cky.K(fileInputStream);
            clt cltVarP = avbVar.p();
            try {
                try {
                    try {
                        cno cnoVarB = cni.a.b(cltVarP);
                        cnoVarB.l(cltVarP, ckz.p(ckyVarK), cliVarA);
                        cnoVarB.g(cltVarP);
                        clt.B(cltVarP);
                        this.b = ((avb) cltVarP).c;
                        fileInputStream.close();
                        this.c = true;
                        return true;
                    } catch (cmh e2) {
                        if (e2.a) {
                            throw new cmh(e2);
                        }
                        throw e2;
                    } catch (cnw e3) {
                        throw e3.a();
                    }
                } catch (RuntimeException e4) {
                    if (e4.getCause() instanceof cmh) {
                        throw ((cmh) e4.getCause());
                    }
                    throw e4;
                }
            } catch (IOException e5) {
                if (e5.getCause() instanceof cmh) {
                    throw ((cmh) e5.getCause());
                }
                throw new cmh(e5);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
