package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyu extends agtu implements agvb {
    int a;
    final /* synthetic */ gyv b;
    final /* synthetic */ List c;
    final /* synthetic */ yrn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyu(gyv gyvVar, List list, yrn yrnVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gyvVar;
        this.c = list;
        this.d = yrnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gyu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gyv gyvVar = this.b;
            List list = this.c;
            yrn yrnVar = this.d;
            this.a = 1;
            if (gyvVar.b(list, yrnVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        this.b.e();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gyu(this.b, this.c, this.d, agswVar);
    }
}
