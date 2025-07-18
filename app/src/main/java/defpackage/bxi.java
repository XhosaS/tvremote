package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxi implements InvocationHandler {
    private final agxd a;
    private final agux b;

    public bxi(agxd agxdVar, agux aguxVar) {
        this.a = agxdVar;
        this.b = aguxVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (agvy.c(method.getName(), "accept") && objArr != null && objArr.length == 1) {
            agxd agxdVar = this.a;
            Object obj2 = objArr[0];
            if (!agxdVar.d(obj2)) {
                throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(agxdVar.b())));
            }
            obj2.getClass();
            this.b.a(obj2);
            return agpu.a;
        }
        if (agvy.c(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (agvy.c(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(this.b.hashCode());
        }
        if (agvy.c(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return this.b.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
