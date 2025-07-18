package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpn extends agtu implements agvb {
    int a;
    final /* synthetic */ bmn b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ agux e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpn(agsw agswVar, bmn bmnVar, boolean z, boolean z2, agux aguxVar) {
        super(2, agswVar);
        this.b = bmnVar;
        this.c = z;
        this.d = z2;
        this.e = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bpn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        bmn bmnVar = this.b;
        bpq bpqVar = new bpq(this.d, this.c, bmnVar, null, this.e);
        this.a = 1;
        Object objW = bmnVar.w(bpqVar, this);
        return objW == agtgVar ? agtgVar : objW;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bpn(agswVar, this.b, this.c, this.d, this.e);
    }
}
