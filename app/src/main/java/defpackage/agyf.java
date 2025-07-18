package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyf implements agxs {
    final /* synthetic */ agxs a;
    final /* synthetic */ Comparator b;

    public agyf(agxs agxsVar, Comparator comparator) {
        this.a = agxsVar;
        this.b = comparator;
    }

    @Override // defpackage.agxs
    public final Iterator a() {
        ArrayList arrayList = new ArrayList();
        agyj agyjVar = new agyj((agyk) this.a);
        while (agyjVar.hasNext()) {
            arrayList.add(agyjVar.next());
        }
        Comparator comparator = this.b;
        if (arrayList.size() > 1) {
            Collections.sort(arrayList, comparator);
        }
        return arrayList.iterator();
    }
}
