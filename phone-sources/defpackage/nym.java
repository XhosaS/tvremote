package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nym extends nyq {
    final /* synthetic */ nyr a;
    private final ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nym(nyr nyrVar, ArrayList arrayList) {
        super(nyrVar);
        this.a = nyrVar;
        this.c = arrayList;
    }

    @Override // defpackage.nyq
    public final void a() {
        Set set;
        nyr nyrVar = this.a;
        nza nzaVar = nyrVar.a;
        oav oavVar = nyrVar.i;
        if (oavVar == null) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet(oavVar.b);
            Map map = oavVar.d;
            for (jzs jzsVar : map.keySet()) {
                if (!nzaVar.g.containsKey(jzsVar.b)) {
                    Object obj = ((kwy) map.get(jzsVar)).a;
                    hashSet.addAll(null);
                }
            }
            set = hashSet;
        }
        nyw nywVar = nzaVar.l;
        nywVar.j = set;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((nwj) arrayList.get(i)).I(nyrVar.k, nywVar.j);
        }
    }
}
