package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cii extends agtu implements agvb {
    int a;
    final /* synthetic */ cij b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cii(cij cijVar, agsw agswVar) {
        super(2, agswVar);
        this.b = cijVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cii) c((ahge) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ahge ahgeVar = (ahge) this.c;
            cij cijVar = this.b;
            final cih cihVar = new cih(cijVar, ahgeVar);
            cja cjaVar = cijVar.a;
            synchronized (cjaVar.b) {
                LinkedHashSet linkedHashSet = cjaVar.c;
                if (linkedHashSet.add(cihVar)) {
                    if (linkedHashSet.size() == 1) {
                        cjaVar.d = cjaVar.b();
                        cbx.c().a(cjb.a, cjaVar.getClass().getSimpleName() + ": initial state = " + cjaVar.d);
                        cjaVar.d();
                    }
                    cihVar.a(cjaVar.d);
                }
            }
            final cij cijVar2 = this.b;
            agum agumVar = new agum() { // from class: cig
                @Override // defpackage.agum
                public final Object a() {
                    cih cihVar2 = cihVar;
                    cja cjaVar2 = cijVar2.a;
                    synchronized (cjaVar2.b) {
                        LinkedHashSet linkedHashSet2 = cjaVar2.c;
                        if (linkedHashSet2.remove(cihVar2) && linkedHashSet2.isEmpty()) {
                            cjaVar2.e();
                        }
                    }
                    return agpu.a;
                }
            };
            this.a = 1;
            if (ahgd.a(ahgeVar, agumVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        cii ciiVar = new cii(this.b, agswVar);
        ciiVar.c = obj;
        return ciiVar;
    }
}
