package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gaq extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ gar b;
    final /* synthetic */ xgw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaq(int i, gar garVar, xgw xgwVar, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.b = garVar;
        this.c = xgwVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gaq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        if (r8 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        if (r8 != false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gaq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gaq(this.a, this.b, this.c, agswVar);
    }
}
