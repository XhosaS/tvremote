package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class idq extends agtu implements agvb {
    int a;
    final /* synthetic */ idt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idq(idt idtVar, agsw agswVar) {
        super(2, agswVar);
        this.b = idtVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((idq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            idt idtVar = this.b;
            this.a = 1;
            if (idtVar.b.g("", this) == agtgVar) {
                return agtgVar;
            }
        }
        this.b.M();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new idq(this.b, agswVar);
    }
}
