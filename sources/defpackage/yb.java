package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yb {
    public static final ye a = new xt();

    public static final xx a(Class cls, cmt cmtVar) {
        String str;
        int i = cun.a;
        cui cuiVar = new cui(cls);
        Class cls2 = cuiVar.c;
        String canonicalName = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                if (componentType.isPrimitive() && (str = (String) cui.b.get(componentType.getName())) != null) {
                    canonicalName = str.concat("Array");
                }
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                canonicalName = (String) cui.b.get(cls2.getName());
                if (canonicalName == null) {
                    canonicalName = cls2.getCanonicalName();
                }
            }
        }
        if (canonicalName != null) {
            return cmtVar.e(cuiVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
