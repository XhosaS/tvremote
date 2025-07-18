package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ids extends agtu implements agvb {
    int a;
    final /* synthetic */ idt b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ids(idt idtVar, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.b = idtVar;
        this.c = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ids) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            idt idtVar = this.b;
            foc focVar = this.c ? foc.TOGGLE_ON : foc.TOGGLE_OFF;
            fjr fjrVar = idtVar.c;
            this.a = 1;
            if (fjrVar.b(focVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ids(this.b, this.c, agswVar);
    }
}
