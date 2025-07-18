package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezd extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ eze c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezd(eze ezeVar, agsw agswVar) {
        super(2, agswVar);
        this.c = ezeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ezd) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        idl idlVar;
        idl idlVar2;
        idl idlVar3;
        agtg agtgVar = agtg.a;
        boolean z = true;
        if (this.b == 0) {
            agpl.b(obj);
            eze ezeVar = this.c;
            idlVar = ezeVar.b;
            if (idlVar.ag() == 2) {
                fjr fjrVar = ezeVar.a;
                this.a = idlVar;
                this.b = 1;
                obj = fjrVar.a(this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
                idlVar2 = idlVar;
            }
            z = false;
            idlVar3 = idlVar;
            idlVar3.y(z);
            return agpu.a;
        }
        Object obj2 = this.a;
        agpl.b(obj);
        idlVar2 = obj2;
        idlVar3 = idlVar2;
        if (obj != foc.TOGGLE_ON) {
            idlVar = idlVar2;
            z = false;
            idlVar3 = idlVar;
        }
        idlVar3.y(z);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ezd(this.c, agswVar);
    }
}
