package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spl implements rux {
    private static final zdy c = zdy.h("com/google/android/libraries/search/audio/microphone/impl/AudioRequestListeningSessionImpl");
    public final zyd a;
    public final zyd b;
    private final int d;
    private final int e;
    private final sjw f;

    public spl(int i, int i2, zyd zydVar, zyd zydVar2, sjw sjwVar) {
        this.e = i;
        this.d = i2;
        this.a = zydVar;
        this.f = sjwVar;
        this.b = zydVar2;
    }

    @Override // defpackage.rux
    public final ruw a() {
        zdv zdvVar = (zdv) ((zdv) c.b().o(zfi.a, "ALT.ARCSession")).q("com/google/android/libraries/search/audio/microphone/impl/AudioRequestListeningSessionImpl", "stopListening", 53, "AudioRequestListeningSessionImpl.java");
        int i = this.e;
        int i2 = this.d;
        zdvVar.z("#audio# stop listening audio request client(token(%d)) session(token(%d))", i, i2);
        this.f.c(i, i2, rxn.CLIENT_REQUESTED);
        return new ruw() { // from class: spj
            @Override // defpackage.ruw
            public final zyd a() {
                return this.a.b;
            }
        };
    }

    @Override // defpackage.rzv
    public final zyd b() {
        return this.a;
    }

    @Override // defpackage.rzv
    public final /* synthetic */ Object c() {
        return new ruw() { // from class: spk
            @Override // defpackage.ruw
            public final zyd a() {
                return this.a.b;
            }
        };
    }
}
