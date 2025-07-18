package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class dd implements db {
    final /* synthetic */ de a;

    public dd(de deVar) {
        this.a = deVar;
    }

    @Override // defpackage.db
    public final boolean h(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zAa;
        int i;
        de deVar = this.a;
        if (de.S(2)) {
            ArrayList arrayList5 = deVar.a;
            Objects.toString(arrayList5);
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: ".concat(arrayList5.toString()));
        }
        int i2 = 0;
        if (deVar.c.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zAa = false;
        } else {
            deVar.f = (ab) deVar.c.get(r1.size() - 1);
            ArrayList arrayList6 = deVar.f.d;
            int size = arrayList6.size();
            for (int i3 = 0; i3 < size; i3++) {
                bq bqVar = ((C0000do) arrayList6.get(i3)).b;
                if (bqVar != null) {
                    bqVar.u = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zAa = deVar.aa(arrayList3, arrayList4, null, -1, 0);
        }
        ArrayList arrayList7 = deVar.j;
        if (!arrayList7.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(deVar.i((ab) arrayList3.get(i4)));
            }
            int size3 = arrayList7.size();
            while (i2 < size3) {
                wxb wxbVar = (wxb) arrayList7.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        wxbVar.a((bq) it.next(), zBooleanValue);
                    }
                }
                i2 = i;
            }
        }
        return zAa;
    }
}
