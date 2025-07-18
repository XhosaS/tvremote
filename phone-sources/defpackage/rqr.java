package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqr {
    public final File a;
    public int b = 0;
    public boolean c = false;
    private final String d;
    private File e;

    public rqr(File file, String str) {
        this.a = file;
        this.d = str;
    }

    public final int a() {
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
            ((tug) ((tug) ((tug) rnb.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "maybeLoad", 'f', "CrashCounter.java")).s("failed to read counter from disk.");
            return false;
        }
        try {
            vtp vtpVarA = vtp.a();
            rqx rqxVar = rqx.a;
            vte vteVarL = vte.L(fileInputStream);
            vuc vucVarO = rqxVar.o();
            try {
                try {
                    try {
                        try {
                            vvy vvyVarB = vvs.a.b(vucVarO);
                            vvyVarB.l(vucVarO, vtf.p(vteVarL), vtpVarA);
                            vvyVarB.g(vucVarO);
                            vuc.B(vucVarO);
                            this.b = ((rqx) vucVarO).c;
                            fileInputStream.close();
                            this.c = true;
                            return true;
                        } catch (RuntimeException e2) {
                            if (e2.getCause() instanceof vuq) {
                                throw ((vuq) e2.getCause());
                            }
                            throw e2;
                        }
                    } catch (IOException e3) {
                        if (e3.getCause() instanceof vuq) {
                            throw ((vuq) e3.getCause());
                        }
                        throw new vuq(e3);
                    }
                } catch (vuq e4) {
                    if (e4.a) {
                        throw new vuq(e4);
                    }
                    throw e4;
                }
            } catch (vwf e5) {
                throw e5.a();
            }
        } finally {
        }
    }
}
