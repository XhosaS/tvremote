package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnm extends dnn {
    @Override // defpackage.diz
    public final diz a() {
        dnm dnmVar = new dnm();
        dnmVar.a = this.a;
        dnmVar.e = this.e;
        List list = dnmVar.d;
        List list2 = this.d;
        ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((diz) it.next()).a());
        }
        list.addAll(arrayList);
        return dnmVar;
    }
}
