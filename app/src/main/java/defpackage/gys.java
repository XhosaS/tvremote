package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gys extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ gyi c;
    final /* synthetic */ gyv d;
    final /* synthetic */ gyn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gys(gyi gyiVar, gyv gyvVar, gyn gynVar, agsw agswVar) {
        super(2, agswVar);
        this.c = gyiVar;
        this.d = gyvVar;
        this.e = gynVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gys) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(6:5|33|6|23|29|30)(1:10))(4:11|(6:13|(2:16|14)|35|17|(0)|25)|29|30)|19|31|20|(4:22|23|29|30)|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010e, code lost:
    
        r0 = r12;
        r12 = r0;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gys.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gys(this.c, this.d, this.e, agswVar);
    }
}
