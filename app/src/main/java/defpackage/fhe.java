package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhe implements fgx {
    private final amb a;

    public fhe(amb ambVar) {
        this.a = ambVar;
    }

    @Override // defpackage.fgx
    public final Object a(agsw agswVar) {
        return ahii.a(((ano) this.a).c, agswVar);
    }

    @Override // defpackage.fgx
    public final Object b(xbg xbgVar, agsw agswVar) {
        Object objA;
        int i = xbgVar.b;
        if (i != 2) {
            if (i == 1) {
                xbf xbfVar = new xbf();
                xaq xaqVar = xaq.a;
                xap xapVar = new xap();
                String str = (xbgVar.b == 1 ? (xaq) xbgVar.c : xaq.a).c;
                str.getClass();
                xah.c(str, xapVar);
                xaq xaqVarA = xah.a(xapVar);
                if ((xbfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xbfVar.y();
                }
                xbg xbgVar2 = (xbg) xbfVar.b;
                xbgVar2.c = xaqVarA;
                xbgVar2.b = 1;
                xbgVar = xao.a(xbfVar);
            } else {
                xbgVar = null;
            }
        }
        return (xbgVar != null && (objA = this.a.a(new fhd(xbgVar, null), agswVar)) == agtg.a) ? objA : agpu.a;
    }
}
