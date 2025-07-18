package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spu extends agtu implements agvb {
    int a;
    final /* synthetic */ spz b;
    final /* synthetic */ rxn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spu(spz spzVar, rxn rxnVar, agsw agswVar) {
        super(2, agswVar);
        this.b = spzVar;
        this.c = rxnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        if (r11 == r0) goto L43;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        spu spuVar = new spu(this.b, this.c, agswVar);
        spuVar.d = obj;
        return spuVar;
    }
}
