package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hxw extends agtu implements agvb {
    int a;
    final /* synthetic */ hxz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxw(hxz hxzVar, agsw agswVar) {
        super(2, agswVar);
        this.b = hxzVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hxw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            hxz hxzVar = this.b;
            try {
                hxzVar.b.registerContentObserver(urr.b, true, new hxy(hxzVar));
            } catch (Exception e) {
                if (e instanceof IllegalArgumentException) {
                    ((zdv) ((zdv) hxz.a.d()).p(e).q("com/google/android/apps/tvsearch/searchbar/features/GeminiPoweredImpl", "registerFeaturesEligibilityContentObserver", 80, "GeminiPoweredImpl.kt")).u("Invalid URI used for registration.");
                } else {
                    ((zdv) ((zdv) hxz.a.d()).p(e).q("com/google/android/apps/tvsearch/searchbar/features/GeminiPoweredImpl", "registerFeaturesEligibilityContentObserver", 85, "GeminiPoweredImpl.kt")).u("Failed to register an observer for the features API.");
                }
            }
            hxz hxzVar2 = this.b;
            this.a = 1;
            if (hxzVar2.d() == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hxw(this.b, agswVar);
    }
}
