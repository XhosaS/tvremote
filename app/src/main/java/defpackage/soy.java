package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class soy implements sos {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider");
    private final sgo b;
    private final ruo c;
    private final sbb d;
    private final sma e;
    private final sot f;
    private final Object g;
    private rux h;

    public soy(sgo sgoVar, ruo ruoVar, sbb sbbVar, sma smaVar, sot sotVar) {
        ruoVar.getClass();
        sotVar.getClass();
        this.b = sgoVar;
        this.c = ruoVar;
        this.d = sbbVar;
        this.e = smaVar;
        this.f = sotVar;
        this.g = new Object();
    }

    @Override // defpackage.sos
    public final rsp a() {
        sec secVarA;
        sow sowVarA;
        int i;
        synchronized (this.g) {
            ruo ruoVar = this.c;
            rul rulVar = ruoVar.k;
            if (rulVar == null) {
                rulVar = rul.a;
            }
            int iA = ruk.a(rulVar.c);
            if (iA == 0 || iA != 4) {
                ((zdv) a.c().o(zfi.a, "ALT.RealLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider", "startListening", 36, "RealLoopbackAudioProvider.kt")).u("#audio# cannot start real loopback, type not relevant.");
                return null;
            }
            rul rulVar2 = ruoVar.k;
            if (rulVar2 == null) {
                rulVar2 = rul.a;
            }
            if ((rulVar2.b & 2) == 0) {
                ((zdv) a.c().o(zfi.a, "ALT.RealLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider", "startListening", 40, "RealLoopbackAudioProvider.kt")).u("#audio# cannot start playback loopback, no channel config.");
                return null;
            }
            if (!ruoVar.l) {
                ((zdv) a.c().o(zfi.a, "ALT.RealLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider", "startListening", 44, "RealLoopbackAudioProvider.kt")).u("#audio# Only push mechanism is supported for loopback audio.");
                return null;
            }
            sou souVar = (sou) ((yqt) this.f.b.a()).f();
            if (souVar == null || (sowVarA = souVar.a()) == null) {
                secVarA = null;
            } else {
                sec secVar = sec.a;
                seb sebVar = new seb();
                rui ruiVar = new rui();
                ruiVar.B(ruoVar);
                int i2 = sowVarA.c;
                if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ruiVar.y();
                }
                ruo ruoVar2 = (ruo) ruiVar.b;
                ruoVar2.b |= 1;
                ruoVar2.c = i2;
                int i3 = sowVarA.b;
                if (i3 == 1) {
                    i = 16;
                } else if (i3 == 2) {
                    i = 12;
                } else {
                    if (i3 != 4) {
                        throw new IllegalArgumentException(a.a(i3, "Real loopback channelCount=", " invalid"));
                    }
                    i = 15;
                }
                if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ruiVar.y();
                }
                ruo ruoVar3 = (ruo) ruiVar.b;
                ruoVar3.b |= 4;
                ruoVar3.e = i;
                ruo ruoVarA = rue.a(ruiVar);
                if ((sebVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    sebVar.y();
                }
                sec secVar2 = (sec) sebVar.b;
                secVar2.e = ruoVarA;
                secVar2.b |= 1;
                if (sowVarA.b == 4) {
                    if ((sebVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        sebVar.y();
                    }
                    sec secVar3 = (sec) sebVar.b;
                    secVar3.b |= 128;
                    secVar3.j = 15;
                }
                secVarA = sed.a(sebVar);
            }
            if (secVarA == null) {
                ((zdv) a.d().o(zfi.a, "ALT.RealLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider", "startListening", 52, "RealLoopbackAudioProvider.kt")).u("#audio# Real audio loopback not supported. (system module missing?)");
                return null;
            }
            ((zdv) a.b().o(zfi.a, "ALT.RealLpbkPrvdr").q("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider", "startListening", 58, "RealLoopbackAudioProvider.kt")).x("#audio# Starting listening to the real loopback audio for %s.", szx.d(this.b));
            sbb sbbVar = this.d;
            ruo ruoVar4 = secVarA.e;
            if (ruoVar4 == null) {
                ruoVar4 = ruo.a;
            }
            ruoVar4.getClass();
            tae taeVarC = sbbVar.c(ruoVar4, agrd.a);
            this.h = this.e.c(secVarA, taeVarC);
            return (rsp) taeVarC;
        }
    }

    @Override // defpackage.sos
    public final void b() {
        synchronized (this.g) {
            try {
                rux ruxVar = this.h;
                if (ruxVar != null) {
                    ((sme) ruxVar).d(rxn.CLIENT_REQUESTED);
                }
            } finally {
            }
        }
    }
}
