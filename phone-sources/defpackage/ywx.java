package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywx {
    public static final /* synthetic */ int a = 0;
    private static final int b = c(Throwable.class, -1);
    private static final yws c;

    static {
        yws ywsVar;
        try {
            ywsVar = ywy.a ? yxx.a : ywm.a;
        } catch (Throwable unused) {
            ywsVar = yxx.a;
        }
        c = ywsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object objE;
        if (!(th instanceof yoq)) {
            return (Throwable) c.a(th.getClass()).a(th);
        }
        try {
            objE = ((yoq) th).a();
        } catch (Throwable th2) {
            objE = ybn.e(th2);
        }
        if (true == (objE instanceof yfx)) {
            objE = null;
        }
        return (Throwable) objE;
    }

    public static final yjv b(Class cls) throws SecurityException {
        Object next;
        yjv yjvVar;
        yfw yfwVar;
        abo aboVar = abo.m;
        if (b == c(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (true) {
                next = null;
                if (i >= length) {
                    break;
                }
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                int i2 = 3;
                if (length2 == 0) {
                    yfwVar = new yfw(new ynk(new ynk(constructor, 7), i2), 0);
                } else if (length2 != 1) {
                    yfwVar = length2 != 2 ? new yfw(null, -1) : (yks.e(parameterTypes[0], String.class) && yks.e(parameterTypes[1], Throwable.class)) ? new yfw(new ynk(new ynk(constructor, 4), i2), 3) : new yfw(null, -1);
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    yfwVar = yks.e(cls2, String.class) ? new yfw(new ynk(new ynk(constructor, 5), i2), 2) : yks.e(cls2, Throwable.class) ? new yfw(new ynk(new ynk(constructor, 6), i2), 1) : new yfw(null, -1);
                }
                arrayList.add(yfwVar);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((yfw) next).b).intValue();
                    while (true) {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((yfw) next2).b).intValue();
                        int i3 = iIntValue < iIntValue2 ? iIntValue2 : iIntValue;
                        if (iIntValue < iIntValue2) {
                            next = next2;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        iIntValue = i3;
                    }
                }
            }
            yfw yfwVar2 = (yfw) next;
            if (yfwVar2 != null && (yjvVar = (yjv) yfwVar2.a) != null) {
                return yjvVar;
            }
        }
        return aboVar;
    }

    private static final int c(Class cls, int i) {
        Object objE;
        wef.q(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objE = ybn.e(th);
            }
        } while (cls != null);
        objE = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (true == (objE instanceof yfx)) {
            objE = objValueOf;
        }
        return ((Number) objE).intValue();
    }
}
