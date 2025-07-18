package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sye implements syb {
    final /* synthetic */ syf a;
    private final syb b;
    private final sya c;
    private final List d;

    public sye(syf syfVar, ryr ryrVar) {
        syj syjVar;
        this.a = syfVar;
        abxc abxcVar = sls.a;
        abxcVar.getClass();
        int iA = slr.a(((slp) acay.a(ryrVar, abxcVar)).c);
        int i = (iA == 0 ? 1 : iA) - 1;
        sya szdVar = null;
        if (i == 0 || i == 1) {
            syl sylVar = syfVar.b;
            syjVar = new syj(sylVar, ryrVar, sylVar.f.a.incrementAndGet());
        } else {
            syjVar = null;
        }
        this.b = syjVar;
        if (syfVar.c.b) {
            abxcVar.getClass();
            if ((slr.a(((slp) acay.a(ryrVar, abxcVar)).c) == 0 ? 1 : r0) - 1 != 0) {
                sze szeVar = syfVar.c;
                szdVar = szeVar.b ? new szd(szeVar, ryrVar) : sze.a;
            }
        }
        this.c = szdVar;
        this.d = agqq.d(syjVar, szdVar);
    }

    private final zyd d(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((zyd) obj2).isCancelled()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2.isEmpty() ? zxn.f() : xab.a(arrayList2).b(new zvh() { // from class: syd
            @Override // defpackage.zvh
            public final zyd a() {
                return zxn.h(agpu.a);
            }
        }, zwk.a);
    }

    @Override // defpackage.sya
    public final zyd a() {
        List<sya> list = this.d;
        ArrayList arrayList = new ArrayList(agqq.i(list, 10));
        for (sya syaVar : list) {
            arrayList.add(syaVar != null ? syaVar.a() : null);
        }
        return d(arrayList);
    }

    @Override // defpackage.sya
    public final zyd b(rsu rsuVar) {
        List<sya> list = this.d;
        ArrayList arrayList = new ArrayList(agqq.i(list, 10));
        for (sya syaVar : list) {
            arrayList.add(syaVar != null ? syaVar.b(rsuVar) : null);
        }
        return d(arrayList);
    }

    @Override // defpackage.sya
    public final zyd c(abvo abvoVar) {
        List<sya> list = this.d;
        ArrayList arrayList = new ArrayList(agqq.i(list, 10));
        for (sya syaVar : list) {
            arrayList.add(syaVar != null ? syaVar.c(abvoVar) : null);
        }
        return d(arrayList);
    }
}
