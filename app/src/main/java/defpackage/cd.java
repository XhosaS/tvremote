package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cd {
    public static final /* synthetic */ int a = 0;
    private static final wx b = new wx(0);

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        wx wxVar = b;
        wx wxVar2 = (wx) wxVar.get(classLoader);
        if (wxVar2 == null) {
            wxVar2 = new wx(0);
            wxVar.put(classLoader, wxVar2);
        }
        Class cls = (Class) wxVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        wxVar2.put(str, cls2);
        return cls2;
    }

    public bq b(String str) {
        throw null;
    }
}
