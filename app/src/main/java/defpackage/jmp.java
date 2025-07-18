package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmp extends agtu implements agvb {
    /* synthetic */ Object a;

    public jmp(agsw agswVar) {
        super(2, agswVar);
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jmp) c((Throwable) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        Throwable th = (Throwable) this.a;
        ((zdv) jmr.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/updaters/CastIdFetcher$tryGetCastDeviceId$2", "invokeSuspend", 56, "CastIdFetcher.kt")).u("Retrying to retrieve [CastId]");
        return Boolean.valueOf(th instanceof Exception);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        jmp jmpVar = new jmp(agswVar);
        jmpVar.a = obj;
        return jmpVar;
    }
}
