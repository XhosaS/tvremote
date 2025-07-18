package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aat {
    public final afh a = new afi(10);
    public final wx b = new wx(0);
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();

    public final void a(Object obj) {
        wx wxVar = this.b;
        if (wxVar.containsKey(obj)) {
            return;
        }
        wxVar.put(obj, null);
    }

    public final void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
