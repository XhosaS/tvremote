package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfd {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiostreamreader/AudioStreamReader");
    public final int b;
    public final yqt c;
    public final yqt d;
    public final smw e;
    private final Executor f;
    private final AtomicBoolean g;

    public sfd(int i, yqt yqtVar, yqt yqtVar2, smw smwVar, Executor executor) {
        this.b = i;
        this.c = yqtVar;
        this.d = yqtVar2;
        this.e = smwVar;
        this.f = executor;
        if (!(yqtVar.g() ^ yqtVar2.g())) {
            throw new IllegalStateException("Only one WriteableAudioBuffer implementation can be present.");
        }
        this.g = new AtomicBoolean(false);
    }

    public final void a(final sdt sdtVar) {
        if (this.g.compareAndSet(false, true)) {
            ((zdv) a.b().o(zfi.a, "ALT.AudioStreamReader").q("com/google/android/libraries/search/audio/audiostreamreader/AudioStreamReader", "startReading", 63, "AudioStreamReader.kt")).u("#audio# start audio buffering");
            Runnable runnable = new Runnable() { // from class: sfc
                @Override // java.lang.Runnable
                public final void run() {
                    sfd sfdVar = this.a;
                    tae taeVar = (sbl) sfdVar.c.f();
                    sdt sdtVar2 = sdtVar;
                    if (taeVar == null) {
                        taeVar = (tae) sfdVar.d.c();
                    }
                    while (true) {
                        int i = sfdVar.b;
                        byte[] bArr = new byte[i];
                        try {
                            sdx sdxVarA = sdtVar2.a(bArr, i);
                            if (!sdxVarA.c()) {
                                if (sdxVarA.a <= 0) {
                                    break;
                                } else {
                                    taeVar.h(sdxVarA, bArr);
                                }
                            } else {
                                smw smwVar = sfdVar.e;
                                String strA = szx.a(taeVar);
                                if (!sdxVarA.c()) {
                                    throw new IllegalStateException("This is not an error");
                                }
                                smwVar.f(strA, sdxVarA.a);
                            }
                        } catch (IOException e) {
                            sfdVar.e.g(szx.a(taeVar));
                            ((zdv) ((zdv) sfd.a.d().o(zfi.a, "ALT.AudioStreamReader")).p(e).q("com/google/android/libraries/search/audio/audiostreamreader/AudioStreamReader", "startBufferingInternal", 81, "AudioStreamReader.kt")).u("#audio# IOException reading from the AudioStream.");
                        }
                    }
                    taeVar.g();
                }
            };
            vqi.c(zxn.j(wyo.h(runnable), this.f), "#audio# Audio buffering failed", new Object[0]);
        }
    }
}
