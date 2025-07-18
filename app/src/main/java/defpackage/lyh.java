package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyh extends agtu implements agvb {
    int a;
    final /* synthetic */ lyp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyh(lyp lypVar, agsw agswVar) {
        super(2, agswVar);
        this.b = lypVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lyh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            zdy zdyVar = lyp.a;
            lyp lypVar = this.b;
            if (lypVar.v.l()) {
                ((zdv) lyp.a.b().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer$mirrorFlags$2", "invokeSuspend", 654, "KatnissVoiceInteractionServicePeer.kt")).u("Mirrored settings already exist. Skipping mirrored settings initialization.");
                return agpu.a;
            }
            ((zdv) lyp.a.b().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer$mirrorFlags$2", "invokeSuspend", 657, "KatnissVoiceInteractionServicePeer.kt")).u("Beginning mirrored settings initialization.");
            ((jod) lypVar.s.a()).e(true);
            lypVar.e.d(true);
            lypVar.q.h();
            lzb lzbVar = lypVar.x;
            synchronized (lzbVar.m) {
                lzbVar.o = false;
            }
            lzbVar.k();
            zyd zydVarA = this.b.v.a();
            this.a = 1;
            if (ahkr.b(zydVarA, this) == agtgVar) {
                return agtgVar;
            }
        }
        ((zdv) lyp.a.b().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer$mirrorFlags$2", "invokeSuspend", 663, "KatnissVoiceInteractionServicePeer.kt")).u("Settings set up successfully.");
        lyp lypVar2 = this.b;
        ((jod) lypVar2.s.a()).e(false);
        lypVar2.e.d(false);
        lypVar2.q.f();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new lyh(this.b, agswVar);
    }
}
