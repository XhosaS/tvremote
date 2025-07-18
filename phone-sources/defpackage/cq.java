package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cq implements co {
    final /* synthetic */ cr a;

    public cq(cr crVar) {
        this.a = crVar;
    }

    @Override // defpackage.co
    public final boolean j(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zAe;
        int i;
        cr crVar = this.a;
        if (cr.Y(2)) {
            Objects.toString(crVar.b);
        }
        int i2 = 0;
        if (crVar.c.isEmpty()) {
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zAe = false;
        } else {
            crVar.f = (at) crVar.c.get(r1.size() - 1);
            ArrayList arrayList5 = crVar.f.d;
            int size = arrayList5.size();
            for (int i3 = 0; i3 < size; i3++) {
                bv bvVar = ((cx) arrayList5.get(i3)).b;
                if (bvVar != null) {
                    bvVar.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zAe = crVar.ae(arrayList3, arrayList4, null, -1, 0);
        }
        if (!crVar.j.isEmpty() && arrayList3.size() > 0) {
            ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(cr.ag((at) arrayList3.get(i4)));
            }
            ArrayList arrayList6 = crVar.j;
            int size3 = arrayList6.size();
            while (i2 < size3) {
                cn cnVar = (cn) arrayList6.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        cnVar.e();
                    }
                }
                i2 = i;
            }
        }
        return zAe;
    }
}
