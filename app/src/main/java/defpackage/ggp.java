package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggp extends agtu implements agvb {
    int a;
    final /* synthetic */ ggr b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ abjd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggp(ggr ggrVar, String str, String str2, abjd abjdVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ggrVar;
        this.c = str;
        this.d = str2;
        this.e = abjdVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ggp) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ggr ggrVar = this.b;
            String str = this.c;
            String str2 = this.d;
            abjd abjdVar = this.e;
            this.a = 1;
            if (ggrVar.d(str, str2, abjdVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ggp(this.b, this.c, this.d, this.e, agswVar);
    }
}
