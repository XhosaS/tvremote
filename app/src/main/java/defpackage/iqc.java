package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iqc extends agtu implements agvb {
    int a;
    final /* synthetic */ iqd b;
    final /* synthetic */ String c;
    final /* synthetic */ agum d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqc(iqd iqdVar, String str, agum agumVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iqdVar;
        this.c = str;
        this.d = agumVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iqc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            iqd iqdVar = this.b;
            String str = this.c;
            this.a = 1;
            if (iqdVar.d(str, this) == agtgVar) {
                return agtgVar;
            }
        }
        this.d.a();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iqc(this.b, this.c, this.d, agswVar);
    }
}
