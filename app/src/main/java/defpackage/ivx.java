package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivx extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ List e;
    final /* synthetic */ boolean f;
    final /* synthetic */ iwd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivx(List list, boolean z, iwd iwdVar, agsw agswVar) {
        super(2, agswVar);
        this.e = list;
        this.f = z;
        this.g = iwdVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ivx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[LOOP:3: B:19:0x007f->B:21:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x030c A[LOOP:1: B:234:0x0306->B:236:0x030c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0320 A[LOOP:2: B:238:0x031a->B:240:0x0320, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0071 -> B:18:0x0076). Please report as a decompilation issue!!! */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ivx(this.e, this.f, this.g, agswVar);
    }
}
