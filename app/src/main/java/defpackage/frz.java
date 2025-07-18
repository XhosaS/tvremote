package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frz extends agtu implements agvb {
    int a;
    final /* synthetic */ fsb b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frz(fsb fsbVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = fsbVar;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((frz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fsb fsbVar = this.b;
            String str = this.c;
            this.a = 1;
            if (fsbVar.b.a(str, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new frz(this.b, this.c, agswVar);
    }
}
