package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpg extends agtu implements agvb {
    int a;
    final /* synthetic */ bmn b;
    final /* synthetic */ agux c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpg(agsw agswVar, bmn bmnVar, agux aguxVar) {
        super(2, agswVar);
        this.b = bmnVar;
        this.c = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bpg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
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
        bpm bpmVar = new bpm(bmnVar, null, this.c);
        this.a = 1;
        Object objW = bmnVar.w(bpmVar, this);
        return objW == agtgVar ? agtgVar : objW;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bpg(agswVar, this.b, this.c);
    }
}
