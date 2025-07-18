package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmd extends sbx {
    public final jaf a;
    private final jzs b;
    private final dhq c;

    public jmd(dhq dhqVar, jaf jafVar, jzs jzsVar, lfn lfnVar) {
        jafVar.getClass();
        jzsVar.getClass();
        lfnVar.getClass();
        this.c = dhqVar;
        this.a = jafVar;
        this.b = jzsVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jry jryVar = (jry) obj;
        jmh jmhVar = new jmh();
        jmhVar.a = new jmm(this, jryVar, 1);
        jmhVar.b = new jev(this, jryVar, 17);
        return jmhVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        jry jryVar = (jry) obj;
        jmh jmhVar = (jmh) obj2;
        jmhVar.F(((ixi) jryVar).a, new String[0]);
        vun vunVar = ((wve) jryVar.b).b;
        vunVar.getClass();
        ArrayList<wkx> arrayList = new ArrayList();
        for (Object obj3 : vunVar) {
            wkx wkxVar = (wkx) obj3;
            Object obj4 = jryVar.d;
            wkxVar.getClass();
            if (((jzs) obj4).f(wkxVar)) {
                arrayList.add(obj3);
            }
        }
        ArrayList<ixh> arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        for (wkx wkxVar2 : arrayList) {
            Object obj5 = jryVar.d;
            wkxVar2.getClass();
            arrayList2.add(((jzs) obj5).b(wkxVar2));
        }
        ArrayList arrayList3 = new ArrayList(yfm.z(arrayList2, 10));
        for (ixh ixhVar : arrayList2) {
            arrayList3.add((scf) this.b.c(ixhVar).l(ixhVar));
        }
        boolean z = !arrayList3.isEmpty();
        if (jmhVar.e != z) {
            jmhVar.e = z;
            Iterator it = jmhVar.f.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayList3);
        if (!yks.e(jmhVar.d, immutableListCopyOf)) {
            jmhVar.d = immutableListCopyOf;
            jmhVar.G(1);
        }
        int size = arrayList3.isEmpty() ? 1 : arrayList3.size();
        if (a.r(jmhVar.c, size)) {
            return;
        }
        jmhVar.c = size;
        jmhVar.G(0);
    }
}
