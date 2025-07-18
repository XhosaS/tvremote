package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spw extends agtu implements agvb {
    final /* synthetic */ spz a;
    final /* synthetic */ sqb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spw(spz spzVar, sqb sqbVar, agsw agswVar) {
        super(2, agswVar);
        this.a = spzVar;
        this.b = sqbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        zdv zdvVar = (zdv) spz.a.b().o(zfi.a, "ALT.AdapterSrcAccessor").q("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioAdapterAudioSourceDataAccessor$copyStarted$1", "invokeSuspend", 248, "AudioAdapterAudioSourceDataAccessor.kt");
        spz spzVar = this.a;
        zdvVar.I("#audio# copying %s session(%d) source, offset(%s)", spzVar.k(), new Integer(spzVar.c), this.b);
        spzVar.l(rxh.FAILED_OPENING_NO_SOURCE_TO_COPY);
        return spzVar.q(4);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new spw(this.a, this.b, agswVar);
    }
}
