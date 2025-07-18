package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class x {
    public static final /* synthetic */ int a = 0;
    private static final mi b = new mi();

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        mi miVar = b;
        mi miVar2 = (mi) miVar.get(classLoader);
        if (miVar2 == null) {
            miVar2 = new mi();
            miVar.put(classLoader, miVar2);
        }
        Class cls = (Class) miVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        miVar2.put(str, cls2);
        return cls2;
    }

    public q b(String str) {
        throw null;
    }
}
