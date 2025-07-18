package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zfl implements InvocationHandler {
    public boolean a;
    public String b;
    private final List c;

    public zfl(List list) {
        this.c = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (yks.e(name, "supports") && yks.e(Boolean.TYPE, returnType)) {
            return true;
        }
        if (yks.e(name, "unsupported") && yks.e(Void.TYPE, returnType)) {
            this.a = true;
            return null;
        }
        if (yks.e(name, "protocols") && objArr.length == 0) {
            return this.c;
        }
        if ((yks.e(name, "selectProtocol") || yks.e(name, "select")) && yks.e(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                obj2.getClass();
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        obj3.getClass();
                        String str = (String) obj3;
                        if (!this.c.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.b = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) this.c.get(0);
                this.b = str2;
                return str2;
            }
        }
        if ((!yks.e(name, "protocolSelected") && !yks.e(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        this.b = (String) obj4;
        return null;
    }
}
