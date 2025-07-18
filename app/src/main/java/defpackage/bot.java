package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bot extends agtu implements agvb {
    int a;
    final /* synthetic */ ahaz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bot(ahaz ahazVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ahazVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bot) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        ahaz ahazVar = this.b;
        this.a = 1;
        Object objFy = ahazVar.fy(this);
        return objFy == agtgVar ? agtgVar : objFy;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bot(this.b, agswVar);
    }
}
