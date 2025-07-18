package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsx extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ gsy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsx(gsy gsyVar, agsw agswVar) {
        super(2, agswVar);
        this.e = gsyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gsx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object aagvVar;
        Object obj2;
        Object obj3;
        agtg agtgVar = agtg.a;
        if (this.d != 0) {
            obj3 = this.c;
            obj2 = this.b;
            aagvVar = this.a;
            agpl.b(obj);
        } else {
            agpl.b(obj);
            gsy gsyVar = this.e;
            aagu aaguVar = aagu.a;
            aagvVar = new aagv(new aagt());
            obj2 = lxj.b;
            obj2.getClass();
            this.a = aagvVar;
            this.b = obj2;
            this.c = aagvVar;
            this.d = 1;
            obj = gsyVar.a.a(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
            obj3 = aagvVar;
        }
        obj2.getClass();
        obj.getClass();
        ((aagv) obj3).a.f((abwk) obj2, obj);
        abxd abxdVarV = ((aagv) aagvVar).a.v();
        abxdVarV.getClass();
        return (aagu) abxdVarV;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gsx(this.e, agswVar);
    }
}
