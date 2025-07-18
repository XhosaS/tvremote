package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scy implements sch {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiobuffer/processing/MicMuterProcessor");
    private final agpc b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;

    public scy(final boolean z, final boolean z2, final etx etxVar) {
        ((zdv) a.b().q("com/google/android/libraries/search/audio/audiobuffer/processing/MicMuterProcessor", "<init>", 25, "MicMuterProcessor.kt")).x("#audio# loading processor(%s)", szx.a(this));
        this.b = new agpn(new agum() { // from class: scx
            @Override // defpackage.agum
            public final Object a() {
                eup eupVar = etxVar.a.a;
                return new spa(z, z2, eupVar.o(), (acfo) ((waa) eupVar.P.a()).a("com.google.android.libraries.search.audio.device", "45692757").b());
            }
        });
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
    }

    private final spa d() {
        return (spa) this.b.a();
    }

    @Override // defpackage.sch
    public final scg a() {
        return scf.a;
    }

    @Override // defpackage.sch
    public final synchronized void b() {
        if (this.c.getAndSet(true)) {
            return;
        }
        ((zdv) a.b().o(zfi.a, "ALT.ProcMicMuter").q("com/google/android/libraries/search/audio/audiobuffer/processing/MicMuterProcessor", "close", 50, "MicMuterProcessor.kt")).x("#audio# close processor (%s)", szx.a(this));
        d().d();
    }

    @Override // defpackage.sch
    public final synchronized int c(byte[] bArr, int i) {
        if (this.c.get()) {
            return 2;
        }
        if (i <= 0) {
            return 2;
        }
        if (!d().c) {
            return 2;
        }
        if (!this.d.getAndSet(true)) {
            d().c();
        }
        spa spaVarD = d();
        if (!spaVarD.a.b()) {
            if (!spaVarD.b.b()) {
                return 1;
            }
        }
        return 3;
    }
}
