package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahby {
    public static final String a(agsw agswVar) {
        Object objA;
        if (agswVar instanceof ahld) {
            return ((ahld) agswVar).toString();
        }
        try {
            objA = agswVar + "@" + Integer.toHexString(System.identityHashCode(agswVar));
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        if (agpk.a(objA) != null) {
            objA = agswVar.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(agswVar));
        }
        return (String) objA;
    }
}
