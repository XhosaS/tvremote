package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szt extends agtu implements agvb {
    final /* synthetic */ szv a;
    final /* synthetic */ agux b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szt(szv szvVar, agux aguxVar, agsw agswVar) {
        super(2, agswVar);
        this.a = szvVar;
        this.b = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((szt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        szv szvVar = this.a;
        for (Object obj2 : szvVar.b) {
            agux aguxVar = this.b;
            Map map = szvVar.c;
            Object obj3 = map.get(obj2);
            if (obj3 == null) {
                sjp sjpVar = new sjp(szvVar.a);
                map.put(obj2, sjpVar);
                obj3 = sjpVar;
            }
            ((sjp) obj3).b(new szu(aguxVar, obj2, null));
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new szt(this.a, this.b, agswVar);
    }
}
