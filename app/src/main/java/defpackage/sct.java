package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sct implements sch {
    private static final zdy b = zdy.h("com/google/android/libraries/search/audio/audiobuffer/processing/FirstByteReadProcessor");
    public final ahaz a;
    private final ruo c;
    private final AtomicBoolean d;
    private final scs e;

    public sct(ruo ruoVar) {
        this.c = ruoVar;
        ((zdv) b.b().q("com/google/android/libraries/search/audio/audiobuffer/processing/FirstByteReadProcessor", "<init>", 33, "FirstByteReadProcessor.kt")).x("#audio# loading processor(%s)", szx.a(this));
        this.d = new AtomicBoolean(false);
        this.a = new ahaz();
        this.e = new scs() { // from class: scr
            @Override // defpackage.scg
            public final Object a() {
                return ahkr.a(this.a.a);
            }
        };
    }

    @Override // defpackage.sch
    public final /* synthetic */ scg a() {
        return this.e;
    }

    @Override // defpackage.sch
    public final synchronized void b() {
        if (!this.d.getAndSet(true)) {
            zdy zdyVar = b;
            zeo zeoVarB = zdyVar.b();
            zer zerVar = zfi.a;
            ((zdv) zeoVarB.o(zerVar, "ALT.ProcFirstByteTime").q("com/google/android/libraries/search/audio/audiobuffer/processing/FirstByteReadProcessor", "close", 72, "FirstByteReadProcessor.kt")).x("#audio# close processor (%s)", szx.a(this));
            ahaz ahazVar = this.a;
            if (!ahazVar.v()) {
                ((zdv) zdyVar.b().o(zerVar, "ALT.ProcFirstByteTime").q("com/google/android/libraries/search/audio/audiobuffer/processing/FirstByteReadProcessor", "close", 74, "FirstByteReadProcessor.kt")).u("#audio# mark first byte read result as non-determined");
                rut rutVar = rut.a;
                ahazVar.N(rzd.a(new rus()));
            }
        }
    }

    @Override // defpackage.sch
    public final synchronized int c(byte[] bArr, int i) {
        if (!this.d.get()) {
            ahaz ahazVar = this.a;
            if (!ahazVar.v() && i > 0) {
                long jB = (i * 1000) / szr.b(this.c);
                rut rutVar = rut.a;
                rus rusVar = new rus();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jB;
                if ((rusVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rusVar.y();
                }
                rut rutVar2 = (rut) rusVar.b;
                rutVar2.b |= 1;
                rutVar2.c = jElapsedRealtime;
                ahazVar.N(rzd.a(rusVar));
                ((zdv) b.b().o(zfi.a, "ALT.ProcFirstByteTime").q("com/google/android/libraries/search/audio/audiobuffer/processing/FirstByteReadProcessor", "process", 64, "FirstByteReadProcessor.kt")).w("#audio# mark first byte read result as non-empty, actual(%dms ago)", jB);
                return 1;
            }
        }
        return 2;
    }
}
