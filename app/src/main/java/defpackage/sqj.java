package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sqj extends agtu implements agvb {
    int a;
    final /* synthetic */ sqk b;
    final /* synthetic */ sqb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqj(sqk sqkVar, sqb sqbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = sqkVar;
        this.c = sqbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        Object obj2;
        Object objA2;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                sqk sqkVar = this.b;
                sqb sqbVar = this.c;
                this.a = 1;
                ((zdv) sqk.a.b().o(zfi.a, "ALT.SrcAccessor").q("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioSourceDataAccessorImpl", "startListeningInternal", 133, "AudioSourceDataAccessorImpl.kt")).F("#audio# opening audio source(%s), offset(%s)", sqkVar.g, sqbVar);
                sos sosVarE = sqkVar.e();
                sdt sdtVar = null;
                sqkVar.h = sosVarE != null ? sosVarE.a() : null;
                agpk agpkVar = sqkVar.f;
                if (agpkVar == null) {
                    try {
                        objA2 = sqkVar.c.c();
                    } catch (Throwable th) {
                        objA2 = agpl.a(th);
                    }
                    agpkVar = new agpk(objA2);
                }
                sqkVar.f = agpkVar;
                agpk agpkVar2 = sqkVar.f;
                if (agpkVar2 != null) {
                    Object obj3 = agpkVar2.a;
                    agpl.b(obj3);
                    yqt yqtVar = (yqt) obj3;
                    if (yqtVar != null) {
                        sdtVar = (sdt) yqtVar.f();
                    }
                }
                if (sdtVar != null) {
                    sqkVar.d.a(sdtVar);
                    obj = sqkVar.j(2);
                } else {
                    obj = skc.a(rxh.FAILED_TO_OPEN_AUDIO_SOURCE);
                }
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            objA = (ruv) obj;
        } catch (Throwable th2) {
            objA = agpl.a(th2);
        }
        sqk sqkVar2 = this.b;
        if (agpk.b(objA)) {
            obj2 = ((rvk) ((ruv) objA).f()).c;
            if (obj2 == null) {
                obj2 = rxj.a;
            }
            obj2.getClass();
        } else {
            obj2 = objA;
        }
        ahba.b(sqkVar2.i, obj2);
        agpl.b(objA);
        return objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        sqj sqjVar = new sqj(this.b, this.c, agswVar);
        sqjVar.d = obj;
        return sqjVar;
    }
}
