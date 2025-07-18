package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sav implements sat {
    private static final zdy b = zdy.h("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter");
    public final sal a;
    private final sjs c;
    private final sau d;

    public sav(sal salVar, sjs sjsVar, sau sauVar) {
        this.a = salVar;
        this.c = sjsVar;
        this.d = sauVar;
    }

    @Override // defpackage.sai
    public final yqt a(sap sapVar) throws sln {
        sapVar.getClass();
        if (((sjv) this.c).a.isDone()) {
            ((zdv) b.d().q("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter", "startListening", 47, "RouteConnectionAwareAudioAdapter.kt")).x("#audio# Failed to start listening (%s), route disconnected", this.a.name());
            throw new sln(skj.b(rxh.FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING));
        }
        sau sauVar = this.d;
        sal salVar = this.a;
        sai saiVar = (sai) sauVar.a(salVar).f();
        if (saiVar == null) {
            ((zdv) b.d().q("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter", "startListening", 69, "RouteConnectionAwareAudioAdapter.kt")).x("#audio# Failed to start listening (%s), no adapter", salVar.name());
            throw new sln(skj.b(rxh.FAILED_OPENING_NO_AUDIO_ADAPTER_FOUND));
        }
        yqt yqtVarA = saiVar.a(sapVar);
        yqtVarA.getClass();
        return yqtVarA;
    }

    @Override // defpackage.sai
    public final zyd b(sar sarVar) {
        sarVar.getClass();
        if (((sjv) this.c).a.isDone()) {
            ((zdv) b.b().q("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter", "stopListening", 85, "RouteConnectionAwareAudioAdapter.kt")).x("#audio# Skipping stop listening (%s), route disconnected", this.a.name());
            rxd rxdVar = rxd.a;
            rxc rxcVar = new rxc();
            rwy.c(rxcVar);
            return zxn.h(rwy.a(rxcVar));
        }
        sau sauVar = this.d;
        sal salVar = this.a;
        sai saiVar = (sai) sauVar.a(salVar).f();
        if (saiVar != null) {
            return saiVar.b(sarVar);
        }
        ((zdv) b.b().q("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter", "stopListening", 106, "RouteConnectionAwareAudioAdapter.kt")).x("#audio# Skipping stop listening (%s), no adapter", salVar.name());
        rxd rxdVar2 = rxd.a;
        rxc rxcVar2 = new rxc();
        rwy.b(308, rxcVar2);
        return zxn.h(rwy.a(rxcVar2));
    }
}
