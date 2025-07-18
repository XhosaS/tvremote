package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ixo extends agtu implements agvb {
    int a;
    final /* synthetic */ ixp b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixo(ixp ixpVar, List list, agsw agswVar) {
        super(2, agswVar);
        this.b = ixpVar;
        this.c = list;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ixo) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ixp ixpVar = this.b;
            final List list = this.c;
            this.a = 1;
            final ixz ixzVar = (ixz) ixpVar.d;
            if (bpr.c(ixzVar.a, new agux() { // from class: ixw
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    return ixr.a(ixzVar, list, (agsw) obj2);
                }
            }, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ixo(this.b, this.c, agswVar);
    }
}
