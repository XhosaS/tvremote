package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsy extends nsw implements ntg {
    public ntm q;
    private final vvj r;

    public nsy(nsz nszVar, vvj vvjVar) {
        super(nszVar);
        this.r = vvjVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.nsw
    public final /* bridge */ /* synthetic */ nsw a() {
        Iterator it = ((nsz) this.a).m.iterator();
        nsy nsyVarA = this;
        while (it.hasNext()) {
            nsyVarA = ((nsx) it.next()).a();
            if (nsyVarA == null) {
                return null;
            }
        }
        for (ulp ulpVar : ntp.a().a) {
            if (!nsyVarA.a.e()) {
                unc.e(nsyVarA, new evk(ulpVar, nsyVarA, 20), new nbb(ulpVar, nsyVarA, 9));
                unc.e(nsyVarA, new rzm(ulpVar, nsyVarA, 1), new pgc(ulpVar.a, 12));
            }
        }
        Iterator it2 = nsz.l.iterator();
        while (it2.hasNext()) {
            nsyVarA = ((nsx) it2.next()).a();
            if (nsyVarA == null) {
                return null;
            }
        }
        return nsyVarA;
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
        vty vtyVar2 = this.p;
        vsz vszVarE2 = this.r.e();
        if (!vtyVar2.b.A()) {
            vtyVar2.u();
        }
        whm whmVar3 = (whm) vtyVar2.b;
        whm whmVar4 = whm.a;
        whmVar3.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        whmVar3.f = vszVarE2;
        nsz nszVar = (nsz) this.a;
        whm whmVar5 = (whm) vtyVar2.r();
        nuk nukVar = new nuk(nszVar.h, nsv.a(nszVar.e), this.j, this.i, h(), nszVar.i);
        byte[] bArrH = whmVar5.h();
        int[] iArrF = nsv.f(this.d);
        ArrayList arrayList = this.e;
        String[] strArr = arrayList != null ? (String[]) arrayList.toArray(nsv.b) : null;
        int[] iArrF2 = nsv.f(this.f);
        ArrayList arrayList2 = this.g;
        oly[] olyVarArr = arrayList2 != null ? (oly[]) arrayList2.toArray(nsv.a) : null;
        Set set = this.h;
        return new ntk(nukVar, whmVar5, bArrH, iArrF, strArr, iArrF2, olyVarArr, set != null ? (String[]) set.toArray(nsv.b) : null, whmVar5.e);
    }

    @Override // defpackage.nsw
    public final onz c() {
        if (this.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.b = true;
        nta ntaVar = ((nsz) this.a).f;
        return ((nty) ntaVar).c(this);
    }
}
