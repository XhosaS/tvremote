package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahjl extends agtu implements agvb {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ahjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahjl(ahjm ahjmVar, agsw agswVar) {
        super(2, agswVar);
        this.c = ahjmVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahjl) c((ahgs) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ahgs ahgsVar = (ahgs) this.b;
            ahjm ahjmVar = this.c;
            this.a = 1;
            if (ahjmVar.d(ahgsVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ahjl ahjlVar = new ahjl(this.c, agswVar);
        ahjlVar.b = obj;
        return ahjlVar;
    }
}
