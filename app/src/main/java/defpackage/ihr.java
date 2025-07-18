package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ihr extends agtu implements agvb {
    int a;
    final /* synthetic */ iht b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihr(iht ihtVar, List list, agsw agswVar) {
        super(2, agswVar);
        this.b = ihtVar;
        this.c = list;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ihr) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r13 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r13 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        if (r13 == r0) goto L47;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ihr ihrVar = new ihr(this.b, this.c, agswVar);
        ihrVar.d = obj;
        return ihrVar;
    }
}
