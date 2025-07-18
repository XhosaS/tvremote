package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmn {
    public static final ahmg a = new ahmg("NO_THREAD_ELEMENTS");
    private static final agvb b = new agvb() { // from class: ahmk
        @Override // defpackage.agvb
        public final Object a(Object obj, Object obj2) {
            agtc agtcVar = (agtc) obj2;
            if (!(agtcVar instanceof ahek)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? agtcVar : Integer.valueOf(iIntValue + 1);
        }
    };
    private static final agvb c = new agvb() { // from class: ahml
        @Override // defpackage.agvb
        public final Object a(Object obj, Object obj2) {
            ahek ahekVar = (ahek) obj;
            agtc agtcVar = (agtc) obj2;
            if (ahekVar != null) {
                return ahekVar;
            }
            if (agtcVar instanceof ahek) {
                return (ahek) agtcVar;
            }
            return null;
        }
    };
    private static final agvb d = new agvb() { // from class: ahmm
        @Override // defpackage.agvb
        public final Object a(Object obj, Object obj2) {
            ahms ahmsVar = (ahms) obj;
            agtc agtcVar = (agtc) obj2;
            if (agtcVar instanceof ahek) {
                ahek ahekVar = (ahek) agtcVar;
                Object objA = ahekVar.a(ahmsVar.a);
                Object[] objArr = ahmsVar.b;
                int i = ahmsVar.d;
                objArr[i] = objA;
                ahek[] ahekVarArr = ahmsVar.c;
                ahmsVar.d = i + 1;
                ahekVar.getClass();
                ahekVarArr[i] = ahekVar;
            }
            return ahmsVar;
        }
    };

    public static final Object a(agte agteVar) {
        Object objFold = agteVar.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object b(agte agteVar, Object obj) {
        if (obj == null) {
            obj = a(agteVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? agteVar.fold(new ahms(agteVar, ((Number) obj).intValue()), d) : ((ahek) obj).a(agteVar);
    }

    public static final void c(agte agteVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof ahms)) {
            Object objFold = agteVar.fold(null, c);
            objFold.getClass();
            ((ahek) objFold).b(agteVar, obj);
            return;
        }
        ahms ahmsVar = (ahms) obj;
        ahek[] ahekVarArr = ahmsVar.c;
        int length = ahekVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ahek ahekVar = ahekVarArr[length];
            ahekVar.getClass();
            ahekVar.b(agteVar, ahmsVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
