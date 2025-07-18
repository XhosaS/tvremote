package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class srr extends agtu implements agvb {
    int a;
    final /* synthetic */ agux b;
    final /* synthetic */ srs c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srr(agux aguxVar, srs srsVar, agsw agswVar) {
        super(2, agswVar);
        this.b = aguxVar;
        this.c = srsVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((srr) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [sra, srs] */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                ?? r5 = this.c;
                this.a = 1;
                obj = sqy.a(r5, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            objA = Boolean.valueOf(((rxj) obj).b == 1);
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        if (true == (objA instanceof agpj)) {
            objA = false;
        }
        if (!((Boolean) objA).booleanValue()) {
            this.b.a(rxn.FAILED_START_LISTENING);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        srr srrVar = new srr(this.b, this.c, agswVar);
        srrVar.d = obj;
        return srrVar;
    }
}
