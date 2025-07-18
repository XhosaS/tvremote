package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class reo implements rdn {
    private final yrp a;
    private boolean b;

    public reo(File file) {
        final ren renVar = new ren(file);
        this.a = yru.a(new yrp() { // from class: rel
            @Override // defpackage.yrp
            public final Object eV() {
                try {
                    File file2 = ((ren) renVar).a;
                    File parentFile = file2.getCanonicalFile().getParentFile();
                    if (parentFile == null) {
                        return null;
                    }
                    parentFile.mkdirs();
                    return new rek(new FileOutputStream(file2, true));
                } catch (IOException e) {
                    ((zdv) ((zdv) ((zdv) qps.a.c()).p(e)).q("com/google/android/libraries/performance/primes/transmitter/localstorage/LocalStorageTransmitter", "createWriter", 'w', "LocalStorageTransmitter.java")).u("An error occurred while creating output stream.");
                    return null;
                }
            }
        });
    }

    @Override // defpackage.rdn
    public final /* synthetic */ rdm a() {
        return rdm.a;
    }

    @Override // defpackage.rdn
    public final zyd b(ahvw ahvwVar) {
        if (this.b) {
            ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/transmitter/localstorage/LocalStorageTransmitter", "send", 132, "LocalStorageTransmitter.java")).u("Skip logging metric as previous error occurred");
            return zxy.a;
        }
        rek rekVar = (rek) this.a.eV();
        if (rekVar == null) {
            this.b = true;
            return zxy.a;
        }
        try {
            abvz abvzVar = rekVar.a;
            synchronized (abvzVar) {
                abvzVar.q(ahvwVar);
                abvzVar.O();
            }
        } catch (IOException e) {
            ((zdv) ((zdv) ((zdv) qps.a.c()).p(e)).q("com/google/android/libraries/performance/primes/transmitter/localstorage/LocalStorageTransmitter", "send", (char) 143, "LocalStorageTransmitter.java")).u("An error occurred while dumping data.");
            this.b = true;
        }
        return zxy.a;
    }

    public reo(final OutputStream outputStream) {
        this.a = yru.a(new yrp() { // from class: rem
            @Override // defpackage.yrp
            public final Object eV() {
                return new rek(outputStream);
            }
        });
    }
}
