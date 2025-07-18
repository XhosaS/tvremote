package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tgp extends agtu implements agvb {
    int a;
    final /* synthetic */ tgq b;
    final /* synthetic */ String c;
    final /* synthetic */ aece d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgp(tgq tgqVar, String str, aece aeceVar, agsw agswVar) {
        super(2, agswVar);
        this.b = tgqVar;
        this.c = str;
        this.d = aeceVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tgp) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        tgq tgqVar = this.b;
        String str = this.c;
        aece aeceVar = this.d;
        this.a = 1;
        Object objC = tgqVar.c(str, aeceVar, this);
        return objC == agtgVar ? agtgVar : objC;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new tgp(this.b, this.c, this.d, agswVar);
    }
}
