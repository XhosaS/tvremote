package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbe {
    public static final Object a(Object obj, agsw agswVar) {
        if (!(obj instanceof ahbc)) {
            return obj;
        }
        Throwable thA = ((ahbc) obj).b;
        if (ahbx.b && (agswVar instanceof agtr)) {
            thA = ahmf.a(thA, (agtr) agswVar);
        }
        return agpl.a(thA);
    }

    public static final Object b(Object obj) {
        Throwable thA = agpk.a(obj);
        return thA == null ? obj : new ahbc(thA, false);
    }
}
