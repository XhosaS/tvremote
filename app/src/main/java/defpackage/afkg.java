package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afkg {
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final List e;

    public afkg(Class cls, ClassLoader classLoader) throws NoSuchMethodException, SecurityException {
        Class clsAsSubclass = cls.asSubclass(yox.class);
        this.a = clsAsSubclass;
        this.d = clsAsSubclass.getMethod("getScopes", null);
        Method declaredMethod = Class.forName("ypm", false, classLoader).asSubclass(yox.class).getDeclaredMethod("newBuilder", null);
        this.b = declaredMethod;
        Class<?> returnType = declaredMethod.getReturnType();
        this.c = returnType.getMethod("build", null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        Method method = clsAsSubclass.getMethod("getClientId", null);
        arrayList.add(new afkh(method, returnType.getMethod("setClientId", method.getReturnType())));
        Method method2 = clsAsSubclass.getMethod("getClientEmail", null);
        arrayList.add(new afkh(method2, returnType.getMethod("setClientEmail", method2.getReturnType())));
        Method method3 = clsAsSubclass.getMethod("getPrivateKey", null);
        arrayList.add(new afkh(method3, returnType.getMethod("setPrivateKey", method3.getReturnType())));
        Method method4 = clsAsSubclass.getMethod("getPrivateKeyId", null);
        arrayList.add(new afkh(method4, returnType.getMethod("setPrivateKeyId", method4.getReturnType())));
        Method method5 = clsAsSubclass.getMethod("getQuotaProjectId", null);
        arrayList.add(new afkh(method5, returnType.getMethod("setQuotaProjectId", method5.getReturnType())));
    }
}
