package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmk extends agtu implements agvb {
    int a;
    final /* synthetic */ jml b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(jml jmlVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jmlVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jmk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                fae faeVar = this.b.b;
                this.a = 1;
                obj = faeVar.b(this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            xgt xgtVar = ((xfp) obj).j;
            if (xgtVar == null) {
                xgtVar = xgt.a;
            }
            xgtVar.getClass();
            for (Object obj2 : agqq.x(this.b.c)) {
                obj2.getClass();
                ((jlq) obj2).as(xgtVar);
            }
        } catch (Exception e) {
            ((zdv) ((zdv) jml.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/params/ThirdPartyCapabilitiesUpdater$updateThirdPartyCapabilities$1", "invokeSuspend", 82, "ThirdPartyCapabilitiesUpdater.kt")).u("Failed to get DeviceCapabilities from DeviceCapabilitiesParamsBuilder.");
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jmk(this.b, agswVar);
    }
}
