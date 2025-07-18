package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class bbt {
    static final bbt a = new bbt();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private final void d(Map map, bbs bbsVar, bce bceVar, Class cls) {
        bce bceVar2 = (bce) map.get(bbsVar);
        if (bceVar2 == null || bceVar == bceVar2) {
            if (bceVar2 == null) {
                map.put(bbsVar, bceVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bbsVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bceVar2 + ", new value " + bceVar);
    }

    public final bbr a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                d(map, (bbs) entry.getKey(), (bce) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!bcl.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                bce bceVarA = onLifecycleEvent.a();
                if (length > 1) {
                    if (!bce.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (bceVarA != bce.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(map, new bbs(i, method), bceVarA, cls);
                z = true;
            }
        }
        bbr bbrVar = new bbr(map);
        this.c.put(cls, bbrVar);
        this.b.put(cls, Boolean.valueOf(z));
        return bbrVar;
    }

    final bbr b(Class cls) {
        bbr bbrVar = (bbr) this.c.get(cls);
        return bbrVar != null ? bbrVar : a(cls, null);
    }

    public final Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
