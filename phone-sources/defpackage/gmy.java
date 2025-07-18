package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmy implements InvocationHandler {
    private final ymh a;
    private final yjv b;

    public gmy(ymh ymhVar, yjv yjvVar) {
        this.a = ymhVar;
        this.b = yjvVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (yks.e(method.getName(), "accept") && objArr != null && objArr.length == 1) {
            ymh ymhVar = this.a;
            Object obj2 = objArr[0];
            if (!ymhVar.d(obj2)) {
                throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(ymhVar.b())));
            }
            obj2.getClass();
            this.b.a(obj2);
            return ygi.a;
        }
        if (yks.e(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (yks.e(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(this.b.hashCode());
        }
        if (yks.e(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return this.b.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
