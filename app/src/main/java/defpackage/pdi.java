package defpackage;

import android.util.SparseIntArray;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdi implements pbd, pdf {
    public final zpn a;
    public final List b;
    public final List c;
    public final SparseIntArray d;
    private final yyk e;

    public pdi(zpn zpnVar, List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        this.a = zpnVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = sparseIntArray;
        DesugarCollections.unmodifiableList(list3);
        yqw.B(!list.isEmpty(), "Must have at least one graft");
        yqw.B(list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size(), "All children must have a parent specified.");
        this.e = yyk.o(pde.a((pdh) list.get(0)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pcc pccVarA = pde.a((pdh) it.next());
            Object obj = this.e.get(0);
            yqw.A(pccVarA == obj ? true : pccVarA.getClass() != obj.getClass() ? false : abza.a.a(pccVarA.getClass()).k(pccVarA, (abxd) obj));
        }
    }

    @Override // defpackage.pdf
    public final /* synthetic */ pcc a() {
        return pde.a(this);
    }

    @Override // defpackage.pdf
    public final List b() {
        return this.e;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        zpk zpkVar = pde.a(this).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        yqqVarB.c("rootVeId", String.valueOf(zpkVar.d));
        zpk zpkVar2 = pde.b(this).d;
        if (zpkVar2 == null) {
            zpkVar2 = zpk.a;
        }
        yqqVarB.c("targetVeId", String.valueOf(zpkVar2.d));
        return yqqVarB.toString();
    }
}
