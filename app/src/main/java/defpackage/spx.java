package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spx extends agtu implements agvb {
    int a;
    final /* synthetic */ spz b;
    final /* synthetic */ sqb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spx(spz spzVar, sqb sqbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = spzVar;
        this.c = sqbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        Object obj2;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                spz spzVar = this.b;
                sqb sqbVar = this.c;
                this.a = 1;
                obj = spzVar.o(sqbVar, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            objA = (ruv) obj;
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        spz spzVar2 = this.b;
        if (agpk.b(objA)) {
            obj2 = ((rvk) ((ruv) objA).f()).c;
            if (obj2 == null) {
                obj2 = rxj.a;
            }
            obj2.getClass();
        } else {
            obj2 = objA;
        }
        ahba.b(spzVar2.g, obj2);
        agpl.b(objA);
        return objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        spx spxVar = new spx(this.b, this.c, agswVar);
        spxVar.d = obj;
        return spxVar;
    }
}
