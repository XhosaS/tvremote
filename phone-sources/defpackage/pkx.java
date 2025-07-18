package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pkx {
    public final List c;
    public final SparseIntArray d;
    public final boolean g;
    private final int h;
    public final ucz a = pjc.a();
    public final List b = new ArrayList();
    public final List e = new ArrayList();
    public final SparseIntArray f = new SparseIntArray();

    public pkx(int i, int i2, boolean z) {
        this.h = i;
        this.c = new ArrayList(i2);
        this.d = new SparseIntArray(i2);
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Set] */
    final pka a(pju pjuVar, int i) {
        pjuVar.d = this.h;
        if (i == -1) {
            i = -1;
        }
        List list = this.c;
        vty vtyVar = pjuVar.e;
        int size = list.size();
        int iF = pjuVar.f();
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        pka pkaVar = (pka) vtyVar.b;
        pka pkaVar2 = pka.a;
        int i2 = iF - 1;
        if (iF == 0) {
            throw null;
        }
        pkaVar.e = i2;
        pkaVar.b |= 2;
        ucz uczVar = this.a;
        ucy ucyVar = ((pka) vtyVar.b).d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        vtw vtwVar = (vtw) ucyVar.a(5, null);
        vtwVar.x(ucyVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        ucy ucyVar2 = (ucy) vucVar;
        uczVar.getClass();
        ucyVar2.e = uczVar;
        ucyVar2.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        ucy ucyVar3 = (ucy) vtwVar.b;
        ucyVar3.b |= 1;
        ucyVar3.c = size;
        ucy ucyVar4 = (ucy) vtwVar.r();
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        pka pkaVar3 = (pka) vtyVar.b;
        ucyVar4.getClass();
        pkaVar3.d = ucyVar4;
        pkaVar3.b |= 1;
        ?? r1 = pjuVar.f.a;
        if (!r1.isEmpty()) {
            for (pku pkuVar : r1) {
            }
        }
        pka pkaVarA = pjuVar.a();
        list.add(pkaVarA);
        this.d.append(size, i);
        return pkaVarA;
    }

    final void b(pli pliVar) {
        if (pliVar.b == 1) {
            a.H(this.d.valueAt(pliVar.c()) == -1);
        }
        this.b.add(pliVar);
    }
}
