package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nyl extends nyq {
    final /* synthetic */ nyr a;
    private final Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyl(nyr nyrVar, Map map) {
        super(nyrVar);
        this.a = nyrVar;
        this.c = map;
    }

    @Override // defpackage.nyq
    public final void a() {
        onj onjVar;
        nyr nyrVar = this.a;
        obl oblVar = new obl(nyrVar.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map = this.c;
        for (nwj nwjVar : map.keySet()) {
            if (!nwjVar.F() || ((nyi) map.get(nwjVar)).a) {
                arrayList2.add(nwjVar);
            } else {
                arrayList.add(nwjVar);
            }
        }
        int i = 0;
        int iA = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                iA = oblVar.a(nyrVar.c, (nwj) arrayList.get(i));
                i++;
                if (iA != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i < size2) {
                iA = oblVar.a(nyrVar.c, (nwj) arrayList2.get(i));
                i++;
                if (iA == 0) {
                    break;
                }
            }
        }
        if (iA != 0) {
            nyrVar.a.f(new nyj(this, nyrVar, new nve(iA, null)));
            return;
        }
        if (nyrVar.e && (onjVar = nyrVar.j) != null) {
            onjVar.m();
        }
        for (nwj nwjVar2 : map.keySet()) {
            oao oaoVar = (oao) map.get(nwjVar2);
            if (!nwjVar2.F() || oblVar.a(nyrVar.c, nwjVar2) == 0) {
                nwjVar2.B(oaoVar);
            } else {
                nyrVar.a.f(new nyk(nyrVar, oaoVar));
            }
        }
    }
}
