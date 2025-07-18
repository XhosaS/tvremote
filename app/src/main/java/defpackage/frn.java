package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frn extends agtu implements agvb {
    int a;
    final /* synthetic */ fro b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frn(fro froVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = froVar;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((frn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fro froVar = this.b;
            String str = this.c;
            this.a = 1;
            if (froVar.b.j(str, true, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new frn(this.b, this.c, agswVar);
    }
}
