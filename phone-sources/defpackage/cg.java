package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cg extends fv {
    final /* synthetic */ cr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(cr crVar) {
        super(false);
        this.a = crVar;
    }

    @Override // defpackage.fv
    public final void a() {
        if (cr.Y(3)) {
            Objects.toString(this.a);
        }
        cr crVar = this.a;
        if (cr.Y(3)) {
            Objects.toString(crVar.f);
        }
        at atVar = crVar.f;
        if (atVar != null) {
            atVar.b = false;
            atVar.d();
            at atVar2 = crVar.f;
            bf bfVar = new bf(crVar, 8);
            if (atVar2.t == null) {
                atVar2.t = new ArrayList();
            }
            atVar2.t.add(bfVar);
            crVar.f.a();
            crVar.g = true;
            crVar.af();
            crVar.g = false;
            crVar.f = null;
        }
    }

    @Override // defpackage.fv
    public final void b() {
        int i;
        if (cr.Y(3)) {
            Objects.toString(this.a);
        }
        cr crVar = this.a;
        crVar.g = true;
        crVar.ak(true);
        crVar.g = false;
        if (crVar.f == null) {
            if (crVar.h.b) {
                crVar.ac();
                return;
            } else {
                crVar.e.c();
                return;
            }
        }
        if (!crVar.j.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(cr.ag(crVar.f));
            ArrayList arrayList = crVar.j;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                cn cnVar = (cn) arrayList.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        cnVar.c();
                    }
                }
                i2 = i;
            }
        }
        ArrayList arrayList2 = crVar.f.d;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bv bvVar = ((cx) arrayList2.get(i3)).b;
            if (bvVar != null) {
                bvVar.mTransitioning = false;
            }
        }
        for (dp dpVar : crVar.k(new ArrayList(Collections.singletonList(crVar.f)), 0, 1)) {
            List list = dpVar.c;
            dpVar.i(list);
            dpVar.e(list);
        }
        ArrayList arrayList3 = crVar.f.d;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            bv bvVar2 = ((cx) arrayList3.get(i4)).b;
            if (bvVar2 != null && bvVar2.mContainer == null) {
                crVar.an(bvVar2).i();
            }
        }
        crVar.f = null;
        crVar.T();
        if (cr.Y(3)) {
            boolean z = crVar.h.b;
            Objects.toString(crVar);
        }
    }

    @Override // defpackage.fv
    public final void c(fd fdVar) {
        if (cr.Y(2)) {
            Objects.toString(this.a);
        }
        cr crVar = this.a;
        at atVar = crVar.f;
        if (atVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(atVar));
            for (dp dpVar : crVar.k(arrayList, 0, 1)) {
                if (cr.Y(2)) {
                    float f = fdVar.b;
                }
                List list = dpVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    yfm.I(arrayList2, ((C0038do) it.next()).g);
                }
                List listAl = yfm.al(yfm.aq(arrayList2));
                int size = listAl.size();
                for (int i = 0; i < size; i++) {
                    dm dmVar = (dm) listAl.get(i);
                    ViewGroup viewGroup = dpVar.a;
                    dmVar.e(fdVar);
                }
            }
            ArrayList arrayList3 = crVar.j;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((cn) arrayList3.get(i2)).d();
            }
        }
    }

    @Override // defpackage.fv
    public final void d(fd fdVar) {
        if (cr.Y(3)) {
            Objects.toString(this.a);
        }
        cr crVar = this.a;
        crVar.G();
        crVar.H(new cq(crVar), false);
    }
}
