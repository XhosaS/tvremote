package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyi extends agtu implements agvb {
    int a;
    final /* synthetic */ lyp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyi(lyp lypVar, agsw agswVar) {
        super(2, agswVar);
        this.b = lypVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lyi) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ((zdv) lyp.a.b().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer$onConfigurationChanged$1", "invokeSuspend", 554, "KatnissVoiceInteractionServicePeer.kt")).u("Restarting libAS to handle locale change.");
            lyp lypVar = this.b;
            this.a = 1;
            if (lypVar.f.h(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new lyi(this.b, agswVar);
    }
}
