package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afet {
    public static afen a(afen afenVar, List list) {
        afenVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            afenVar = new afes(afenVar, (afer) it.next());
        }
        return afenVar;
    }

    public static afen b(afen afenVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return a(afenVar, arrayList);
    }
}
