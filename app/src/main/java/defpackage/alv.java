package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alv extends agtu implements agvb {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alv(List list, agsw agswVar) {
        super(2, agswVar);
        this.c = list;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alv) c((ami) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ami amiVar = (ami) this.b;
            List list = this.c;
            alz alzVar = ama.a;
            this.a = 1;
            if (alzVar.a(list, amiVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        alv alvVar = new alv(this.c, agswVar);
        alvVar.b = obj;
        return alvVar;
    }
}
