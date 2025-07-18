package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahjk {
    public static final Object a(agte agteVar, Object obj, Object obj2, agvb agvbVar, agsw agswVar) {
        Object objA;
        Object objB = ahmn.b(agteVar, obj2);
        try {
            ahkj ahkjVar = new ahkj(agswVar, agteVar);
            if (agvbVar instanceof agto) {
                agwk.b(agvbVar, 2);
                objA = agvbVar.a(obj, ahkjVar);
            } else {
                objA = agth.a(agvbVar, obj, ahkjVar);
            }
            ahmn.c(agteVar, objB);
            if (objA == agtg.a) {
                agswVar.getClass();
            }
            return objA;
        } catch (Throwable th) {
            ahmn.c(agteVar, objB);
            throw th;
        }
    }
}
