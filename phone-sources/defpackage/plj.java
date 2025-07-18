package defpackage;

import android.util.SparseIntArray;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class plj implements pjk, plh {
    public final ucz a;
    public final List b;
    public final List c;
    public final SparseIntArray d;
    public final List e;
    public final SparseIntArray f;
    private final ImmutableList g;

    public plj(ucz uczVar, List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        this.a = uczVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = sparseIntArray;
        this.e = DesugarCollections.unmodifiableList(list3);
        this.f = sparseIntArray2;
        sij.o(!list.isEmpty(), "Must have at least one graft");
        sij.o(list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size(), "All children must have a parent specified.");
        this.g = ImmutableList.of(qtl.aq((pli) list.get(0)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a.H(qtl.aq((pli) it.next()).equals(this.g.get(0)));
        }
    }

    @Override // defpackage.plh
    public final /* synthetic */ pka a() {
        return qtl.aq(this);
    }

    @Override // defpackage.plh
    public final List b() {
        return this.g;
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        ucy ucyVar = qtl.aq(this).d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        tssVarH.d("rootVeId", ucyVar.d);
        ucy ucyVar2 = qtl.ar(this).d;
        if (ucyVar2 == null) {
            ucyVar2 = ucy.a;
        }
        tssVarH.d("targetVeId", ucyVar2.d);
        return tssVarH.toString();
    }
}
