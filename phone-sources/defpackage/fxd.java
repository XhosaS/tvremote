package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fxd extends fxb implements Iterable<fxb>, yli {
    public static final /* synthetic */ int g = 0;
    public final fyu f;

    public fxd(fxo fxoVar) {
        super(fxoVar);
        this.f = new fyu(this);
    }

    @Override // defpackage.fxb
    public final fxa d(fwz fwzVar) {
        fyu fyuVar = this.f;
        return fyuVar.c(super.d(fwzVar), fwzVar, false, fyuVar.a);
    }

    @Override // defpackage.fxb
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof fxd) && super.equals(obj)) {
            fxd fxdVar = (fxd) obj;
            if (i().c() == fxdVar.i().c() && h() == fxdVar.h()) {
                Iterator itA = ykr.f(hw.d(i())).a();
                while (itA.hasNext()) {
                    fxb fxbVar = (fxb) itA.next();
                    if (!yks.e(fxbVar, kq.a(fxdVar.i(), fxbVar.b()))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int h() {
        return this.f.c;
    }

    @Override // defpackage.fxb
    public final int hashCode() {
        int iH = h();
        kp kpVarI = i();
        int iC = kpVarI.c();
        for (int i = 0; i < iC; i++) {
            iH = (((iH * 31) + kpVarI.b(i)) * 31) + ((fxb) kpVarI.e(i)).hashCode();
        }
        return iH;
    }

    public final kp i() {
        return this.f.b;
    }

    @Override // java.lang.Iterable
    public final Iterator<fxb> iterator() {
        return new fyt(this.f);
    }

    public final fxb j(int i) {
        fyu fyuVar = this.f;
        return fyuVar.b(i, fyuVar.a, false, null);
    }

    public final fxb k(String str) {
        if (str == null || ylh.L(str)) {
            return null;
        }
        return this.f.a(str, true);
    }

    public final fxb l(int i, fxb fxbVar, boolean z, fxb fxbVar2) {
        return this.f.b(i, fxbVar, z, fxbVar2);
    }

    public final String m() {
        return this.f.e;
    }

    public final fxa n(fwz fwzVar, fxb fxbVar) {
        return this.f.c(super.d(fwzVar), fwzVar, true, fxbVar);
    }

    public final fxa o(String str, boolean z, fxb fxbVar) {
        fxa fxaVarO;
        fxd fxdVar = this.f.a;
        fxa fxaVarE = fxdVar.e(str);
        ArrayList arrayList = new ArrayList();
        Iterator<fxb> it = fxdVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fxb next = it.next();
            fxaVarO = yks.e(next, fxbVar) ? null : next instanceof fxd ? ((fxd) next).o(str, false, fxdVar) : next.e(str);
            if (fxaVarO != null) {
                arrayList.add(fxaVarO);
            }
        }
        fxa fxaVar = (fxa) yfm.Q(arrayList);
        fxd fxdVar2 = fxdVar.c;
        if (fxdVar2 != null && z && !yks.e(fxdVar2, fxbVar)) {
            fxaVarO = fxdVar2.o(str, true, fxdVar);
        }
        return (fxa) yfm.Q(yfm.aW(new fxa[]{fxaVarE, fxaVar, fxaVarO}));
    }

    @Override // defpackage.fxb
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        fxb fxbVarK = k(m());
        if (fxbVarK == null) {
            fxbVarK = j(h());
        }
        sb.append(" startDestination=");
        if (fxbVarK != null) {
            sb.append("{");
            sb.append(fxbVarK.toString());
            sb.append("}");
        } else if (m() != null) {
            sb.append(m());
        } else {
            fyu fyuVar = this.f;
            String str = fyuVar.d;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x".concat(String.valueOf(Integer.toHexString(fyuVar.c))));
            }
        }
        return sb.toString();
    }
}
