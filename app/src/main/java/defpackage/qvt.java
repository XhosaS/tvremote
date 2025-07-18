package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qvt {
    public final File a;
    public int b = 0;
    public boolean c = false;
    private final String d;
    private File e;

    public qvt(File file, String str) {
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
            ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "maybeLoad", 'f', "CrashCounter.java")).u("failed to read counter from disk.");
            return false;
        }
        try {
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            qwb qwbVar = qwb.a;
            abvt abvtVarK = abvt.K(fileInputStream, 4096);
            qwb qwbVar2 = new qwb();
            try {
                try {
                    abzj abzjVarA = abza.a.a(qwbVar2.getClass());
                    abzjVarA.i(qwbVar2, abvu.p(abvtVarK), generatedRegistry);
                    abzjVarA.g(qwbVar2);
                    Byte b = (byte) 1;
                    b.getClass();
                    this.b = qwbVar2.c;
                    fileInputStream.close();
                    this.c = true;
                    return true;
                } catch (abzz e2) {
                    throw e2.a();
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof abxv) {
                        throw ((abxv) e3.getCause());
                    }
                    throw e3;
                }
            } catch (abxv e4) {
                if (e4.a) {
                    throw new abxv(e4);
                }
                throw e4;
            } catch (IOException e5) {
                if (e5.getCause() instanceof abxv) {
                    throw ((abxv) e5.getCause());
                }
                throw new abxv(e5);
            }
        } finally {
        }
    }
}
