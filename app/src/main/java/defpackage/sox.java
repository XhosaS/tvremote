package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sox implements sos {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider");
    public final sgo b;
    private final sbb c;
    private final suh d;
    private final Object e;
    private rsp f;
    private final ruo g;

    public sox(sgo sgoVar, ruo ruoVar, sbb sbbVar, suh suhVar) {
        ruo ruoVarA;
        suhVar.getClass();
        this.b = sgoVar;
        this.c = sbbVar;
        this.d = suhVar;
        this.e = new Object();
        if (ruoVar != null) {
            ruoVarA = szq.a.a(ruoVar);
        } else {
            szq szqVar = szq.a;
            ruo ruoVar2 = ruo.a;
            rui ruiVar = new rui();
            if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ruiVar.y();
            }
            ruo ruoVar3 = (ruo) ruiVar.b;
            ruoVar3.b |= 2048;
            ruoVar3.l = true;
            rul rulVar = sot.a;
            if ((Integer.MIN_VALUE & ruiVar.b.memoizedSerializedSize) == 0) {
                ruiVar.y();
            }
            ruo ruoVar4 = (ruo) ruiVar.b;
            rulVar.getClass();
            ruoVar4.k = rulVar;
            ruoVar4.b |= 512;
            abxd abxdVarV = ruiVar.v();
            abxdVarV.getClass();
            ruoVarA = szqVar.a((ruo) abxdVarV);
        }
        this.g = ruoVarA;
    }

    @Override // defpackage.sos
    public final rsp a() {
        Object obj = this.e;
        synchronized (obj) {
            ruo ruoVar = this.g;
            rul rulVar = ruoVar.k;
            if (rulVar == null) {
                rulVar = rul.a;
            }
            int iA = ruk.a(rulVar.c);
            if (iA == 0 || iA != 3) {
                ((zdv) a.c().o(zfi.a, "ALT.PlaybackLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "startListening", 64, "PlaybackLoopbackAudioProvider.kt")).u("#audio# cannot start playback loopback, type not relevant.");
                return null;
            }
            rul rulVar2 = ruoVar.k;
            if (rulVar2 == null) {
                rulVar2 = rul.a;
            }
            if ((rulVar2.b & 2) == 0) {
                ((zdv) a.c().o(zfi.a, "ALT.PlaybackLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "startListening", 68, "PlaybackLoopbackAudioProvider.kt")).u("#audio# cannot start playback loopback, no channel config.");
                return null;
            }
            if (!ruoVar.l) {
                ((zdv) a.c().o(zfi.a, "ALT.PlaybackLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "startListening", 72, "PlaybackLoopbackAudioProvider.kt")).u("#audio# Only push mechanism is supported for loopback audio.");
                return null;
            }
            rsp rspVar = this.f;
            if (rspVar != null) {
                return rspVar;
            }
            zdy zdyVar = a;
            zeo zeoVarB = zdyVar.b();
            zer zerVar = zfi.a;
            zdv zdvVar = (zdv) zeoVarB.o(zerVar, "ALT.PlaybackLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "startListening", 80, "PlaybackLoopbackAudioProvider.kt");
            sgo sgoVar = this.b;
            zdvVar.F("#audio# Starting listening to loopback for %s, with params %s", szx.d(sgoVar), sxy.a(ruoVar));
            sbl sblVarB = this.c.b(ruoVar, ypv.a, agrd.a);
            if (sgoVar.b == 41) {
                synchronized (obj) {
                    ((zdv) zdyVar.c().o(zerVar, "ALT.PlaybackLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "startListeningFromService", 115, "PlaybackLoopbackAudioProvider.kt")).u("#audio# no playback service found, check modules setup");
                    this.f = sblVarB;
                    return sblVarB;
                }
            }
            suh suhVar = this.d;
            sgo sgoVar2 = this.b;
            ruo ruoVar2 = this.g;
            synchronized (suhVar.b) {
                long jA = suhVar.d.a();
                sum sumVar = suhVar.c;
                if (sumVar != null) {
                    ((zdv) suh.a.d().o(zfi.a, "ALT.ActivePlayback").q("com/google/android/libraries/search/audio/playback/impl/session/impl/ActivePlaybackSession", "startListeningPlaybackAudio", 138, "ActivePlaybackSession.kt")).F("#audio# New buffer listening to playback for %s. Closing buffer for %s", szx.d(sgoVar2), szx.d(sumVar.c));
                    sumVar.a(new suk(sumVar, null));
                }
                ((zdv) suh.a.b().o(zfi.a, "ALT.ActivePlayback").q("com/google/android/libraries/search/audio/playback/impl/session/impl/ActivePlaybackSession", "startListeningPlaybackAudio", 147, "ActivePlaybackSession.kt")).F("#audio# Start listening for %s, with params %s.", szx.d(sgoVar2), sxy.a(ruoVar2));
                eup eupVar = suhVar.e.a.a;
                suhVar.c = new sum(sgoVar2, ruoVar2, sblVarB, jA, (mcw) eupVar.i.a(), (zyh) eupVar.m.a(), (ahbt) eupVar.q.a(), (Executor) eupVar.m.a(), (abwf) ((waa) eupVar.P.a()).a("com.google.android.libraries.search.audio.device", "45651394").b());
            }
            this.f = sblVarB;
            return sblVarB;
        }
    }

    @Override // defpackage.sos
    public final void b() {
        synchronized (this.e) {
            ((zdv) a.b().o(zfi.a, "ALT.PlaybackLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "stopListening", 103, "PlaybackLoopbackAudioProvider.kt")).x("#audio# Stop called for %s.", szx.d(this.b));
            this.f = null;
        }
    }
}
