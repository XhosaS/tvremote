package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suk extends agtu implements agvb {
    final /* synthetic */ sum a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suk(sum sumVar, agsw agswVar) {
        super(2, agswVar);
        this.a = sumVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((suk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ((zdv) sum.a.b().o(zfi.a, "ALT.PbAudioUpdater").q("com/google/android/libraries/search/audio/playback/impl/session/impl/PlaybackAudioUpdater$release$1", "invokeSuspend", 106, "PlaybackAudioUpdater.kt")).x("#audio# Job released for %s.", null);
        sum sumVar = this.a;
        sumVar.e.g();
        sumVar.g.cancel(false);
        sumVar.h = 0L;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new suk(this.a, agswVar);
    }
}
