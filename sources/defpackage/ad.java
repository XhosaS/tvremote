package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ad extends kt {
    final /* synthetic */ am a;

    public ad(am amVar) {
        this.a = amVar;
    }

    @Override // defpackage.kt
    public final void a() {
        if (am.S(3)) {
            am amVar = this.a;
            Objects.toString(amVar);
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager ".concat(amVar.toString()));
        }
        am amVar2 = this.a;
        if (am.S(3)) {
            c cVar = amVar2.e;
            Objects.toString(cVar);
            Log.d("FragmentManager", "cancelBackStackTransition for transition ".concat(String.valueOf(cVar)));
        }
        c cVar2 = amVar2.e;
        if (cVar2 != null) {
            cVar2.b = false;
            cVar2.b();
            c cVar3 = amVar2.e;
            ac acVar = new ac(amVar2, 0);
            if (cVar3.s == null) {
                cVar3.s = new ArrayList();
            }
            cVar3.s.add(acVar);
            amVar2.e.g(true);
            amVar2.f = true;
            amVar2.ab(true);
            amVar2.E();
            amVar2.f = false;
            amVar2.e = null;
        }
    }

    @Override // defpackage.kt
    public final void b() {
        int i;
        if (am.S(3)) {
            am amVar = this.a;
            Objects.toString(amVar);
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager ".concat(amVar.toString()));
        }
        am amVar2 = this.a;
        amVar2.f = true;
        amVar2.ab(true);
        amVar2.f = false;
        if (amVar2.e == null) {
            if (amVar2.g.g()) {
                if (am.S(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                amVar2.W();
                return;
            } else {
                if (am.S(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                ((aaz) amVar2.v.b).c();
                return;
            }
        }
        ArrayList arrayList = amVar2.i;
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(am.X(amVar2.e));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                aj ajVar = (aj) arrayList.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        ajVar.c();
                    }
                }
                i2 = i;
            }
        }
        ArrayList arrayList2 = amVar2.e.d;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            q qVar = ((at) arrayList2.get(i3)).b;
            if (qVar != null) {
                qVar.o = false;
            }
        }
        for (bf bfVar : amVar2.h(new ArrayList(Collections.singletonList(amVar2.e)), 0, 1)) {
            if (am.S(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            List list = bfVar.c;
            bfVar.g(list);
            bfVar.e(list);
        }
        ArrayList arrayList3 = amVar2.e.d;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            q qVar2 = ((at) arrayList3.get(i4)).b;
            if (qVar2 != null && qVar2.K == null) {
                amVar2.g(qVar2).d();
            }
        }
        amVar2.e = null;
        amVar2.N();
        if (am.S(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + amVar2.g.g() + " for  FragmentManager " + amVar2);
        }
    }

    @Override // defpackage.kt
    public final void c(ke keVar) {
        if (am.S(2)) {
            am amVar = this.a;
            Objects.toString(amVar);
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager ".concat(amVar.toString()));
        }
        am amVar2 = this.a;
        c cVar = amVar2.e;
        if (cVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(cVar));
            for (bf bfVar : amVar2.h(arrayList, 0, 1)) {
                if (am.S(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + keVar.a);
                }
                List list = bfVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dnx.aP(arrayList2, ((be) it.next()).g);
                }
                List listAM = dnx.aM(dnx.aN(arrayList2));
                int size = listAM.size();
                for (int i = 0; i < size; i++) {
                    bc bcVar = (bc) listAM.get(i);
                    ViewGroup viewGroup = bfVar.a;
                    bcVar.e(keVar);
                }
            }
            ArrayList arrayList3 = amVar2.i;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((aj) arrayList3.get(i2)).d();
            }
        }
    }

    @Override // defpackage.kt
    public final void d() {
        if (am.S(3)) {
            am amVar = this.a;
            Objects.toString(amVar);
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager ".concat(amVar.toString()));
        }
        am amVar2 = this.a;
        amVar2.C();
        amVar2.ac(new al(amVar2));
    }
}
