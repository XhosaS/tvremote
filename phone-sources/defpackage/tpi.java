package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpi {
    public static final Object a = new Object();
    private final Map b = new ConcurrentHashMap();

    public tpi(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.b.put((Type) entry.getKey(), entry.getValue());
        }
    }

    public final Object a(Type type) {
        Object objA;
        if (type == null) {
            return a;
        }
        Map map = this.b;
        Object obj = map.get(type);
        if (obj != null) {
            return obj;
        }
        if (type instanceof ParameterizedType) {
            objA = a(((ParameterizedType) type).getRawType());
        } else if (type instanceof Class) {
            Class cls = (Class) type;
            Object objA2 = a(cls.getSuperclass());
            Object obj2 = a;
            if (objA2 == obj2) {
                for (Class<?> cls2 : cls.getInterfaces()) {
                    objA2 = a(cls2);
                    if (objA2 != obj2) {
                        break;
                    }
                }
            }
            objA = objA2;
        } else {
            objA = a(sis.f(type));
        }
        map.put(type, objA);
        return objA;
    }

    public final String toString() {
        tss tssVarG = sij.G(getClass());
        tssVarG.a(this.b);
        return tssVarG.toString();
    }
}
