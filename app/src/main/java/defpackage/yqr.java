package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqr {
    public static yqq a(Class cls) {
        return new yqq(cls.getSimpleName());
    }

    public static yqq b(Object obj) {
        return new yqq(obj.getClass().getSimpleName());
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
