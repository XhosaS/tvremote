package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class csx implements cty {
    private final /* synthetic */ int a;

    public /* synthetic */ csx(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cty
    public final Object a(Object obj, Object obj2) {
        if (this.a != 0) {
            String str = (String) obj;
            str.getClass();
            if (str.length() == 0) {
                return obj2.toString();
            }
            return str + ", " + obj2;
        }
        cta ctaVar = (cta) obj;
        ctaVar.getClass();
        cta ctaVarMinusKey = ctaVar.minusKey(obj2.getKey());
        ctb ctbVar = ctb.a;
        if (ctaVarMinusKey == ctbVar) {
            return obj2;
        }
        cvj cvjVar = csw.a;
        csw cswVar = (csw) ctaVarMinusKey.get(cvjVar);
        if (cswVar == null) {
            return new csu(ctaVarMinusKey, obj2);
        }
        cta ctaVarMinusKey2 = ctaVarMinusKey.minusKey(cvjVar);
        return ctaVarMinusKey2 == ctbVar ? new csu(obj2, cswVar) : new csu(new csu(ctaVarMinusKey2, obj2), cswVar);
    }
}
