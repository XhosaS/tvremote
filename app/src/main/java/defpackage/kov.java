package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kov {
    public static Object a(Class cls, String str, Object obj, kou... kouVarArr) {
        int length = kouVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < kouVarArr.length; i++) {
            kou kouVar = kouVarArr[i];
            kouVar.getClass();
            clsArr[i] = kouVar.a;
            objArr[i] = kouVarArr[i].b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(obj, objArr);
    }
}
