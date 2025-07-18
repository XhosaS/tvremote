package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class wu {
    static final wu a = new wu();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, wt wtVar, xa xaVar, Class cls) {
        xa xaVar2 = (xa) map.get(wtVar);
        if (xaVar2 == null || xaVar == xaVar2) {
            if (xaVar2 == null) {
                map.put(wtVar, xaVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + wtVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + xaVar2 + ", new value " + xaVar);
    }

    public final ws a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                d(map, (wt) entry.getKey(), (xa) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            xm xmVar = (xm) method.getAnnotation(xm.class);
            if (xmVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!xf.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                xa xaVarA = xmVar.a();
                if (length > 1) {
                    if (!xa.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (xaVarA != xa.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(map, new wt(i, method), xaVarA, cls);
                z = true;
            }
        }
        ws wsVar = new ws(map);
        this.c.put(cls, wsVar);
        this.b.put(cls, Boolean.valueOf(z));
        return wsVar;
    }

    final ws b(Class cls) {
        ws wsVar = (ws) this.c.get(cls);
        return wsVar != null ? wsVar : a(cls, null);
    }

    public final Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
