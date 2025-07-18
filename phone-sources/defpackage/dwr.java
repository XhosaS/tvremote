package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwr {
    public static final List a = yfm.s(Application.class, dwi.class);
    public static final List b = yfm.p(dwi.class);

    public static final dwt a(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (dwt) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Failed to access ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(a.cj(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            Objects.toString(cls);
            throw new RuntimeException("An exception happened in constructor of ".concat(cls.toString()), e3.getCause());
        }
    }

    public static final Constructor b(Class cls, List list) {
        list.getClass();
        Iterator itE = ykn.e(cls.getConstructors());
        while (itE.hasNext()) {
            Constructor constructor = (Constructor) itE.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listAX = yfm.aX(parameterTypes);
            if (yks.e(list, listAX)) {
                constructor.getClass();
                return constructor;
            }
            if (list.size() == listAX.size() && listAX.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
