package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmo extends agtu implements agvb {
    int a;
    final /* synthetic */ gmq b;
    final /* synthetic */ ahvw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmo(gmq gmqVar, ahvw ahvwVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gmqVar;
        this.c = ahvwVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gmo) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        gmq gmqVar = this.b;
        ahvw ahvwVar = this.c;
        this.a = 1;
        Object objD = gmqVar.d(ahvwVar, this);
        return objD == agtgVar ? agtgVar : objD;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gmo(this.b, this.c, agswVar);
    }
}
