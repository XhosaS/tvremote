package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class haw extends agtu implements agvb {
    int a;
    final /* synthetic */ hba b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haw(hba hbaVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = hbaVar;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((haw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            hba hbaVar = this.b;
            String str = this.c;
            this.a = 1;
            if (hbaVar.j.l(str, "", "", fwx.PROFILE_LOCK_UNSPECIFIED, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new haw(this.b, this.c, agswVar);
    }
}
