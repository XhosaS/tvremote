package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class npg extends npj {
    final /* synthetic */ nph a;

    public npg(nph nphVar) {
        this.a = nphVar;
    }

    @Override // defpackage.npj
    public final void b() {
        nph nphVar = this.a;
        long jA = nphVar.a();
        if (jA != nphVar.b) {
            nphVar.b = jA;
            nphVar.b();
            if (nphVar.b != 0) {
                nphVar.d();
            }
        }
    }

    @Override // defpackage.npj
    public final void d(int[] iArr) {
        nph nphVar = this.a;
        List listF = nrv.f(iArr);
        if (nphVar.d.equals(listF)) {
            return;
        }
        nph.f(nphVar);
        nphVar.f.evictAll();
        nphVar.g.clear();
        nphVar.d = listF;
        nphVar.c();
        nph.f(nphVar);
        nph.f(nphVar);
    }

    @Override // defpackage.npj
    public final void e(int[] iArr, int i) {
        int size;
        if (i == 0) {
            size = this.a.d.size();
        } else {
            size = this.a.e.get(i, -1);
            if (size == -1) {
                this.a.d();
                return;
            }
        }
        nph nphVar = this.a;
        nph.f(nphVar);
        nphVar.d.addAll(size, nrv.f(iArr));
        nphVar.c();
        Set set = nphVar.k;
        synchronized (set) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
        nph.f(this.a);
    }

    @Override // defpackage.npj
    public final void f(nll[] nllVarArr) {
        HashSet hashSet = new HashSet();
        nph nphVar = this.a;
        List list = nphVar.g;
        list.clear();
        for (nll nllVar : nllVarArr) {
            int i = nllVar.b;
            nphVar.f.put(Integer.valueOf(i), nllVar);
            int i2 = nphVar.e.get(i, -1);
            if (i2 == -1) {
                nphVar.d();
                return;
            }
            hashSet.add(Integer.valueOf(i2));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i3 = nphVar.e.get(((Integer) it.next()).intValue(), -1);
            if (i3 != -1) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        list.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        nph.f(nphVar);
        nrv.j(arrayList);
        nph.f(nphVar);
        nph.f(nphVar);
    }

    @Override // defpackage.npj
    public final void g(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            nph nphVar = this.a;
            nphVar.f.remove(Integer.valueOf(i));
            SparseIntArray sparseIntArray = nphVar.e;
            int i2 = sparseIntArray.get(i, -1);
            if (i2 == -1) {
                nphVar.d();
                return;
            } else {
                sparseIntArray.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        nph nphVar2 = this.a;
        nph.f(nphVar2);
        nphVar2.d.removeAll(nrv.f(iArr));
        nphVar2.c();
        nrv.j(arrayList);
        Set set = nphVar2.k;
        synchronized (set) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
        nph.f(this.a);
    }

    @Override // defpackage.npj
    public final void h(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            this.a.d.size();
        } else if (list2.isEmpty()) {
            this.a.a.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
        } else {
            SparseIntArray sparseIntArray = this.a.e;
            if (sparseIntArray.get(i, -1) == -1) {
                sparseIntArray.get(((Integer) list2.get(0)).intValue(), -1);
            }
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            nph nphVar = this.a;
            int i2 = nphVar.e.get(iIntValue, -1);
            if (i2 == -1) {
                nphVar.d();
                return;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        nph nphVar2 = this.a;
        nph.f(nphVar2);
        nphVar2.d = list;
        nphVar2.c();
        Set set = nphVar2.k;
        synchronized (set) {
            Iterator it2 = set.iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        nph.f(this.a);
    }

    @Override // defpackage.npj
    public final void i(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            nph nphVar = this.a;
            nphVar.f.remove(Integer.valueOf(i));
            int i2 = nphVar.e.get(i, -1);
            if (i2 == -1) {
                nphVar.d();
                return;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        Collections.sort(arrayList);
        nph nphVar2 = this.a;
        nph.f(nphVar2);
        nrv.j(arrayList);
        nph.f(nphVar2);
        nph.f(nphVar2);
    }

    @Override // defpackage.npj
    public final void j() {
        this.a.d();
    }
}
