package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdl extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ agvb d;
    final /* synthetic */ fdn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdl(agvb agvbVar, fdn fdnVar, agsw agswVar) {
        super(2, agswVar);
        this.d = agvbVar;
        this.e = fdnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdl) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        agvb agvbVar;
        Object obj2;
        agvb agvbVar2;
        agtg agtgVar = agtg.a;
        int i = this.c;
        if (i == 0) {
            agpl.b(obj);
            agvb agvbVar3 = this.d;
            fdn fdnVar = this.e;
            this.a = agvbVar3;
            this.c = 1;
            Object objE = fdnVar.e(this);
            if (objE != agtgVar) {
                agvbVar = agvbVar3;
                obj = objE;
            }
            return agtgVar;
        }
        if (i != 1) {
            obj2 = this.b;
            Object obj3 = this.a;
            agpl.b(obj);
            agvbVar2 = obj3;
            agvbVar2.a(obj2, obj);
            return agpu.a;
        }
        Object obj4 = this.a;
        agpl.b(obj);
        agvbVar = obj4;
        fdn fdnVar2 = this.e;
        this.a = agvbVar;
        this.b = obj;
        this.c = 2;
        Object objD = fdnVar2.d(this);
        if (objD != agtgVar) {
            obj2 = obj;
            obj = objD;
            agvbVar2 = agvbVar;
            agvbVar2.a(obj2, obj);
            return agpu.a;
        }
        return agtgVar;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fdl(this.d, this.e, agswVar);
    }
}
