package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sev implements sdp {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiosource/impl/RouteAwareAudioSource");
    private final sjs b;
    private final sdp c;
    private final String d = szx.a(this);

    public sev(sjs sjsVar, sdp sdpVar) {
        this.b = sjsVar;
        this.c = sdpVar;
    }

    @Override // defpackage.sdp
    public final rxd a() {
        rxd rxdVarA = this.c.a();
        rxdVarA.getClass();
        return rxdVarA;
    }

    @Override // defpackage.sdp
    public final sds b() {
        sds sdsVarB = this.c.b();
        sdsVarB.getClass();
        return sdsVarB;
    }

    @Override // defpackage.sdp
    public final yqt c() throws sln {
        if (((sjv) this.b).a.isDone()) {
            throw new sln("#openAudioSource failed: routing failed.", skc.a.d(rxh.FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING));
        }
        zdv zdvVar = (zdv) a.b().o(zfi.a, "ALT.RouteAwareSource").q("com/google/android/libraries/search/audio/audiosource/impl/RouteAwareAudioSource", "openAudioSource", 39, "RouteAwareAudioSource.kt");
        String str = this.d;
        sdp sdpVar = this.c;
        zdvVar.F("#audio# delegating source(%s) opening to(%s)", str, szx.a(sdpVar));
        return sdpVar.c();
    }
}
