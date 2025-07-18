package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbv implements sbo {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverWithSequencing");
    public final rsm b;
    public final String c;
    private final Executor d;

    public sbv(rsm rsmVar) {
        this.b = rsmVar;
        this.d = new zyt(rsmVar.a());
        this.c = szx.a(rsmVar);
    }

    @Override // defpackage.sbo
    public final void b(final rsu rsuVar) {
        rsuVar.getClass();
        this.d.execute(wyo.h(new Runnable() { // from class: sbu
            @Override // java.lang.Runnable
            public final void run() {
                rsu rsuVar2 = rsuVar;
                int i = rsuVar2.c;
                sbv sbvVar = this;
                if (i == 7) {
                    ((zdv) sbv.a.b().o(zfi.a, "ALT.ReceiverSequencer").q("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverWithSequencing", "onNext$lambda$0", 26, "AudioBytesReceiverWithSequencing.kt")).F("#audio# sending %s to receiver(%s)", rsuVar2.c == 7 ? (rsw) rsuVar2.d : rsw.a, sbvVar.c);
                }
                sbvVar.b.b(rsuVar2);
            }
        }));
    }
}
