package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class idg implements idf {
    private final /* synthetic */ int a;
    private final Object b;

    public idg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Comparator] */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        if (this.a == 0) {
            ArrayList arrayList = new ArrayList((List) obj);
            Collections.sort(arrayList, this.b);
            return arrayList;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.b.b(it.next()));
        }
        return arrayList2;
    }
}
