package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sne extends agtu implements agvb {
    int a;
    final /* synthetic */ snh b;
    final /* synthetic */ sgo c;
    final /* synthetic */ long d;
    final /* synthetic */ sjs e;
    final /* synthetic */ rvf f;
    final /* synthetic */ rux g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sne(snh snhVar, sgo sgoVar, long j, sjs sjsVar, rvf rvfVar, rux ruxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = snhVar;
        this.c = sgoVar;
        this.d = j;
        this.e = sjsVar;
        this.f = rvfVar;
        this.g = ruxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sne) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r0 != r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        if (r0 == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        return r2;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sne.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        sne sneVar = new sne(this.b, this.c, this.d, this.e, this.f, this.g, agswVar);
        sneVar.h = obj;
        return sneVar;
    }
}
