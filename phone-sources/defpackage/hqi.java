package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqi implements hqf {
    private final List a;
    private final cuj b;

    public hqi(List list, cuj cujVar) {
        this.a = list;
        this.b = cujVar;
    }

    @Override // defpackage.hqf
    public final boolean a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((hqf) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [hlg] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.hqf
    public final cvi e(Object obj, int i, int i2, hll hllVar) {
        cvi cviVarE;
        List list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        ?? r5 = 0;
        while (i3 < size) {
            hqf hqfVar = (hqf) list.get(i3);
            if (hqfVar.a(obj) && (cviVarE = hqfVar.e(obj, i, i2, hllVar)) != null) {
                arrayList.add(cviVarE.a);
                r5 = cviVarE.c;
            }
            i3++;
            r5 = r5;
        }
        if (arrayList.isEmpty() || r5 == 0) {
            return null;
        }
        return new cvi((hlg) r5, new hqh(arrayList, this.b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + "}";
    }
}
