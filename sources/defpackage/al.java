package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class al implements ak {
    final /* synthetic */ am a;

    public al(am amVar) {
        this.a = amVar;
    }

    @Override // defpackage.ak
    public final boolean e(ArrayList arrayList, ArrayList arrayList2) {
        boolean zAd;
        int i;
        am amVar = this.a;
        if (am.S(2)) {
            ArrayList arrayList3 = amVar.a;
            Objects.toString(arrayList3);
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: ".concat(arrayList3.toString()));
        }
        int i2 = 0;
        if (amVar.c.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zAd = false;
        } else {
            amVar.e = (c) amVar.c.get(r1.size() - 1);
            ArrayList arrayList4 = amVar.e.d;
            int size = arrayList4.size();
            for (int i3 = 0; i3 < size; i3++) {
                q qVar = ((at) arrayList4.get(i3)).b;
                if (qVar != null) {
                    qVar.o = true;
                }
            }
            zAd = amVar.ad(arrayList, arrayList2);
        }
        ArrayList arrayList5 = amVar.i;
        if (!arrayList5.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(am.X((c) arrayList.get(i4)));
            }
            int size3 = arrayList5.size();
            while (i2 < size3) {
                aj ajVar = (aj) arrayList5.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        ajVar.e();
                    }
                }
                i2 = i;
            }
        }
        return zAd;
    }
}
