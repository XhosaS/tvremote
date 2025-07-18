package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class smj extends agtu implements agvb {
    final /* synthetic */ sml a;
    final /* synthetic */ sdp b;
    final /* synthetic */ rxn c;
    final /* synthetic */ agux d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smj(sml smlVar, sdp sdpVar, rxn rxnVar, agux aguxVar, agsw agswVar) {
        super(2, agswVar);
        this.a = smlVar;
        this.b = sdpVar;
        this.c = rxnVar;
        this.d = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((smj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        agpl.b(obj);
        try {
            objA = this.b.a();
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        agux aguxVar = this.d;
        rxn rxnVar = this.c;
        skc skcVar = skc.a;
        Object objH = skcVar.h(1);
        if (true == (objA instanceof agpj)) {
            objA = objH;
        }
        rxd rxdVar = (rxd) objA;
        rxdVar.getClass();
        aguxVar.a(skcVar.c(rxdVar, rxnVar));
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new smj(this.a, this.b, this.c, this.d, agswVar);
    }
}
