package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aafj implements aaft, aafs {
    private final aaft[] a;
    private final aafs[] b;

    public aafj(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof aaft) {
                if (obj instanceof aafj) {
                    a(arrayList, ((aafj) obj).a);
                } else {
                    arrayList.add(obj);
                }
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof aafs) {
                if (obj2 instanceof aafj) {
                    a(arrayList2, ((aafj) obj2).b);
                } else {
                    arrayList2.add(obj2);
                }
            }
        }
        if (arrayList.size() <= 0) {
            this.a = null;
        } else {
            this.a = (aaft[]) arrayList.toArray(new aaft[arrayList.size()]);
        }
        if (arrayList2.size() <= 0) {
            this.b = null;
        } else {
            this.b = (aafs[]) arrayList2.toArray(new aafs[arrayList2.size()]);
        }
    }

    private static final void a(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }
}
