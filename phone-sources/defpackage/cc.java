package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cc {
    public static final /* synthetic */ int a = 0;
    private static final ko b = new ko();

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        ko koVar = b;
        ko koVar2 = (ko) koVar.get(classLoader);
        if (koVar2 == null) {
            koVar2 = new ko();
            koVar.put(classLoader, koVar2);
        }
        Class cls = (Class) koVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        koVar2.put(str, cls2);
        return cls2;
    }

    public bv b(String str) {
        throw null;
    }
}
