package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ntr extends nsw {
    public ntr(nts ntsVar, vsz vszVar) {
        super(ntsVar);
        vty vtyVar = this.p;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        whm whmVar = (whm) vtyVar.b;
        whm whmVar2 = whm.a;
        whmVar.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        whmVar.f = vszVar;
    }

    @Override // defpackage.nsw
    public final /* bridge */ /* synthetic */ nsw a() {
        Iterator it = ((nts) this.a).l.iterator();
        ntr ntrVarA = this;
        while (it.hasNext()) {
            ntrVarA = ((ntq) it.next()).a();
            if (ntrVarA == null) {
                return null;
            }
        }
        return ntrVarA;
    }

    @Override // defpackage.nsw
    public final ntk b() {
        uao uaoVar = this.c;
        if (uaoVar != null) {
            vty vtyVar = this.p;
            vsz vszVarE = uaoVar.e();
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            whm whmVar = (whm) vtyVar.b;
            whm whmVar2 = whm.a;
            whmVar.b |= 524288;
            whmVar.h = vszVarE;
        }
        whm whmVar3 = (whm) this.p.r();
        nts ntsVar = (nts) this.a;
        nuk nukVar = new nuk(ntsVar.h, nsv.a(ntsVar.e), this.j, this.i, h(), ntsVar.i);
        byte[] bArrH = whmVar3.h();
        int[] iArrF = nsv.f(this.d);
        ArrayList arrayList = this.e;
        String[] strArr = arrayList != null ? (String[]) arrayList.toArray(nsv.b) : null;
        int[] iArrF2 = nsv.f(this.f);
        ArrayList arrayList2 = this.g;
        oly[] olyVarArr = arrayList2 != null ? (oly[]) arrayList2.toArray(nsv.a) : null;
        Set set = this.h;
        return new ntk(nukVar, whmVar3, bArrH, iArrF, strArr, iArrF2, olyVarArr, set != null ? (String[]) set.toArray(nsv.b) : null, whmVar3.e);
    }

    @Override // defpackage.nsw
    public final onz c() {
        throw null;
    }
}
