package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sqi extends agtu implements agvb {
    final /* synthetic */ sqk a;
    final /* synthetic */ sqb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqi(sqk sqkVar, sqb sqbVar, agsw agswVar) {
        super(2, agswVar);
        this.a = sqkVar;
        this.b = sqbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqi) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        zdv zdvVar = (zdv) sqk.a.b().o(zfi.a, "ALT.SrcAccessor").q("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioSourceDataAccessorImpl$copyStarted$1", "invokeSuspend", 181, "AudioSourceDataAccessorImpl.kt");
        sqk sqkVar = this.a;
        zdvVar.F("#audio# copying audio source(%s), offset(%s)", sqkVar.g, this.b);
        sqkVar.i(rxh.FAILED_OPENING_NO_SOURCE_TO_COPY);
        return sqkVar.j(4);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sqi(this.a, this.b, agswVar);
    }
}
