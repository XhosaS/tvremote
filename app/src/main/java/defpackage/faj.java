package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class faj extends agtu implements agvb {
    int a;
    final /* synthetic */ fal b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public faj(fal falVar, agsw agswVar) {
        super(2, agswVar);
        this.b = falVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((faj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        fal falVar = this.b;
        this.a = 1;
        Object objB = falVar.b(this);
        return objB == agtgVar ? agtgVar : objB;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new faj(this.b, agswVar);
    }
}
