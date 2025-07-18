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
class cq extends ue {
    final /* synthetic */ de a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(de deVar) {
        super(false);
        this.a = deVar;
    }

    @Override // defpackage.ue
    public final void a() {
        if (de.S(3)) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        final de deVar = this.a;
        if (de.S(3)) {
            ab abVar = deVar.f;
            Objects.toString(abVar);
            Log.d("FragmentManager", "cancelBackStackTransition for transition ".concat(String.valueOf(abVar)));
        }
        ab abVar2 = deVar.f;
        if (abVar2 != null) {
            abVar2.b = false;
            abVar2.d();
            ab abVar3 = deVar.f;
            Runnable runnable = new Runnable() { // from class: ck
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList = deVar.j;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                    }
                }
            };
            if (abVar3.t == null) {
                abVar3.t = new ArrayList();
            }
            abVar3.t.add(runnable);
            deVar.f.i();
            deVar.g = true;
            deVar.ac();
            deVar.g = false;
            deVar.f = null;
        }
    }

    @Override // defpackage.ue
    public final void b() {
        int i;
        if (de.S(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        de deVar = this.a;
        deVar.g = true;
        deVar.ae(true);
        deVar.g = false;
        if (deVar.f == null) {
            if (deVar.h.c) {
                if (de.S(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                deVar.Y();
                return;
            } else {
                if (de.S(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                deVar.e.a.c();
                return;
            }
        }
        ArrayList arrayList = deVar.j;
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(deVar.i(deVar.f));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                    }
                }
                i2 = i;
            }
        }
        ArrayList arrayList2 = deVar.f.d;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bq bqVar = ((C0000do) arrayList2.get(i3)).b;
            if (bqVar != null) {
                bqVar.u = false;
            }
        }
        for (eo eoVar : deVar.h(new ArrayList(Collections.singletonList(deVar.f)), 0, 1)) {
            if (de.S(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            List list = eoVar.d;
            eoVar.g(list);
            eoVar.e(list);
        }
        ArrayList arrayList3 = deVar.f.d;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            bq bqVar2 = ((C0000do) arrayList3.get(i4)).b;
            if (bqVar2 != null && bqVar2.Q == null) {
                deVar.g(bqVar2).d();
            }
        }
        deVar.f = null;
        deVar.N();
        if (de.S(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + deVar.h.c + " for  FragmentManager " + deVar);
        }
    }

    @Override // defpackage.ue
    public final void c(ta taVar) {
        if (de.S(2)) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        de deVar = this.a;
        ab abVar = deVar.f;
        if (abVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(abVar));
            for (eo eoVar : deVar.h(arrayList, 0, 1)) {
                if (de.S(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + taVar.a);
                }
                List list = eoVar.d;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    agqq.k(arrayList2, ((en) it.next()).g);
                }
                List listX = agqq.x(agqq.A(arrayList2));
                int size = listX.size();
                for (int i = 0; i < size; i++) {
                    ei eiVar = (ei) listX.get(i);
                    ViewGroup viewGroup = eoVar.b;
                    eiVar.e(taVar);
                }
            }
            ArrayList arrayList3 = deVar.j;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
            }
        }
    }

    @Override // defpackage.ue
    public final void d() {
        if (de.S(3)) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        de deVar = this.a;
        deVar.B();
        deVar.C(new dd(deVar), false);
    }
}
