package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxr {
    public static final yxo a = new yxo("NO_THREAD_ELEMENTS");
    private static final yjz b = new dsc(19);
    private static final yjz c = new dsc(20);
    private static final yjz d = new yjz() { // from class: yxq
        @Override // defpackage.yjz
        public final Object a(Object obj, Object obj2) {
            yxw yxwVar = (yxw) obj;
            yij yijVar = (yij) obj2;
            if (yijVar instanceof yqz) {
                yqz yqzVar = (yqz) yijVar;
                Object objEI = yqzVar.eI(yxwVar.a);
                Object[] objArr = yxwVar.b;
                int i = yxwVar.d;
                objArr[i] = objEI;
                yqz[] yqzVarArr = yxwVar.c;
                yxwVar.d = i + 1;
                yqzVar.getClass();
                yqzVarArr[i] = yqzVar;
            }
            return yxwVar;
        }
    };

    public static final Object a(yil yilVar) {
        Object objFold = yilVar.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object b(yil yilVar, Object obj) {
        if (obj == null) {
            obj = a(yilVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? yilVar.fold(new yxw(yilVar, ((Number) obj).intValue()), d) : ((yqz) obj).eI(yilVar);
    }

    public static final void c(yil yilVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof yxw)) {
            Object objFold = yilVar.fold(null, c);
            objFold.getClass();
            ((yqz) objFold).eJ(obj);
            return;
        }
        yxw yxwVar = (yxw) obj;
        yqz[] yqzVarArr = yxwVar.c;
        int length = yqzVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            yqz yqzVar = yqzVarArr[length];
            yqzVar.getClass();
            yqzVar.eJ(yxwVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
