package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyv extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ iyw c;
    final /* synthetic */ zxe d;
    final /* synthetic */ Optional e;
    final /* synthetic */ Optional f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyv(iyw iywVar, zxe zxeVar, Optional optional, Optional optional2, agsw agswVar) {
        super(2, agswVar);
        this.c = iywVar;
        this.d = zxeVar;
        this.e = optional;
        this.f = optional2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iyv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iyv(this.c, this.d, this.e, this.f, agswVar);
    }
}
