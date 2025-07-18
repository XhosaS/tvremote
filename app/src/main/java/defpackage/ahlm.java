package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahlm {
    public static final /* synthetic */ int a = 0;
    private static final int b = c(Throwable.class, -1);
    private static final ahlb c;

    static {
        ahlb ahlbVar;
        try {
            ahlbVar = ahln.a ? ahmt.a : ahku.a;
        } catch (Throwable unused) {
            ahlbVar = ahmt.a;
        }
        c = ahlbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object objA;
        if (!(th instanceof ahbf)) {
            return (Throwable) c.a(th.getClass()).a(th);
        }
        try {
            objA = ((ahbf) th).a();
        } catch (Throwable th2) {
            objA = agpl.a(th2);
        }
        if (true == (objA instanceof agpj)) {
            objA = null;
        }
        return (Throwable) objA;
    }

    public static final agux b(Class cls) throws SecurityException {
        Object next;
        agux aguxVar;
        agpi agpiVar;
        ahll ahllVar = ahll.a;
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
                final Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    final agux aguxVar2 = new agux() { // from class: ahlk
                        @Override // defpackage.agux
                        public final Object a(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                            int i2 = ahlm.a;
                            Object objNewInstance = constructor.newInstance(null);
                            objNewInstance.getClass();
                            Throwable th = (Throwable) objNewInstance;
                            th.initCause((Throwable) obj);
                            return th;
                        }
                    };
                    agpiVar = new agpi(new agux() { // from class: ahlg
                        @Override // defpackage.agux
                        public final Object a(Object obj) {
                            Object objA;
                            Throwable th = (Throwable) obj;
                            int i2 = ahlm.a;
                            try {
                                Throwable th2 = (Throwable) aguxVar2.a(th);
                                boolean zC = agvy.c(th.getMessage(), th2.getMessage());
                                objA = th2;
                                if (!zC) {
                                    boolean zC2 = agvy.c(th2.getMessage(), th.toString());
                                    objA = th2;
                                    if (!zC2) {
                                        objA = null;
                                    }
                                }
                            } catch (Throwable th3) {
                                objA = agpl.a(th3);
                            }
                            return (Throwable) (true != (objA instanceof agpj) ? objA : null);
                        }
                    }, 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (agvy.c(cls2, String.class)) {
                        final agux aguxVar3 = new agux() { // from class: ahli
                            @Override // defpackage.agux
                            public final Object a(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                Throwable th = (Throwable) obj;
                                int i2 = ahlm.a;
                                Object objNewInstance = constructor.newInstance(th.getMessage());
                                objNewInstance.getClass();
                                Throwable th2 = (Throwable) objNewInstance;
                                th2.initCause(th);
                                return th2;
                            }
                        };
                        agpiVar = new agpi(new agux() { // from class: ahlg
                            @Override // defpackage.agux
                            public final Object a(Object obj) {
                                Object objA;
                                Throwable th = (Throwable) obj;
                                int i2 = ahlm.a;
                                try {
                                    Throwable th2 = (Throwable) aguxVar3.a(th);
                                    boolean zC = agvy.c(th.getMessage(), th2.getMessage());
                                    objA = th2;
                                    if (!zC) {
                                        boolean zC2 = agvy.c(th2.getMessage(), th.toString());
                                        objA = th2;
                                        if (!zC2) {
                                            objA = null;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    objA = agpl.a(th3);
                                }
                                return (Throwable) (true != (objA instanceof agpj) ? objA : null);
                            }
                        }, 2);
                    } else if (agvy.c(cls2, Throwable.class)) {
                        final agux aguxVar4 = new agux() { // from class: ahlj
                            @Override // defpackage.agux
                            public final Object a(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                int i2 = ahlm.a;
                                Object objNewInstance = constructor.newInstance((Throwable) obj);
                                objNewInstance.getClass();
                                return (Throwable) objNewInstance;
                            }
                        };
                        agpiVar = new agpi(new agux() { // from class: ahlg
                            @Override // defpackage.agux
                            public final Object a(Object obj) {
                                Object objA;
                                Throwable th = (Throwable) obj;
                                int i2 = ahlm.a;
                                try {
                                    Throwable th2 = (Throwable) aguxVar4.a(th);
                                    boolean zC = agvy.c(th.getMessage(), th2.getMessage());
                                    objA = th2;
                                    if (!zC) {
                                        boolean zC2 = agvy.c(th2.getMessage(), th.toString());
                                        objA = th2;
                                        if (!zC2) {
                                            objA = null;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    objA = agpl.a(th3);
                                }
                                return (Throwable) (true != (objA instanceof agpj) ? objA : null);
                            }
                        }, 1);
                    } else {
                        agpiVar = new agpi(null, -1);
                    }
                } else if (length2 != 2) {
                    agpiVar = new agpi(null, -1);
                } else if (agvy.c(parameterTypes[0], String.class) && agvy.c(parameterTypes[1], Throwable.class)) {
                    final agux aguxVar5 = new agux() { // from class: ahlh
                        @Override // defpackage.agux
                        public final Object a(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                            Throwable th = (Throwable) obj;
                            int i2 = ahlm.a;
                            Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                            objNewInstance.getClass();
                            return (Throwable) objNewInstance;
                        }
                    };
                    agpiVar = new agpi(new agux() { // from class: ahlg
                        @Override // defpackage.agux
                        public final Object a(Object obj) {
                            Object objA;
                            Throwable th = (Throwable) obj;
                            int i2 = ahlm.a;
                            try {
                                Throwable th2 = (Throwable) aguxVar5.a(th);
                                boolean zC = agvy.c(th.getMessage(), th2.getMessage());
                                objA = th2;
                                if (!zC) {
                                    boolean zC2 = agvy.c(th2.getMessage(), th.toString());
                                    objA = th2;
                                    if (!zC2) {
                                        objA = null;
                                    }
                                }
                            } catch (Throwable th3) {
                                objA = agpl.a(th3);
                            }
                            return (Throwable) (true != (objA instanceof agpj) ? objA : null);
                        }
                    }, 3);
                } else {
                    agpiVar = new agpi(null, -1);
                }
                arrayList.add(agpiVar);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((agpi) next).b).intValue();
                    while (true) {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((agpi) next2).b).intValue();
                        int i2 = iIntValue < iIntValue2 ? iIntValue2 : iIntValue;
                        if (iIntValue < iIntValue2) {
                            next = next2;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        iIntValue = i2;
                    }
                }
            }
            agpi agpiVar2 = (agpi) next;
            if (agpiVar2 != null && (aguxVar = (agux) agpiVar2.a) != null) {
                return aguxVar;
            }
        }
        return ahllVar;
    }

    private static final int c(Class cls, int i) {
        Object objA;
        cls.getClass();
        agwj agwjVar = agwi.a;
        new agvq(cls);
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
                objA = agpl.a(th);
            }
        } while (cls != null);
        objA = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (true == (objA instanceof agpj)) {
            objA = objValueOf;
        }
        return ((Number) objA).intValue();
    }
}
