package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jak extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ jal f;
    final /* synthetic */ jba g;
    final /* synthetic */ String h;
    final /* synthetic */ boolean i;
    final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jak(jal jalVar, jba jbaVar, String str, boolean z, boolean z2, agsw agswVar) {
        super(2, agswVar);
        this.f = jalVar;
        this.g = jbaVar;
        this.h = str;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jak) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jak.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jak(this.f, this.g, this.h, this.i, this.j, agswVar);
    }
}
