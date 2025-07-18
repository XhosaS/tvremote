package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dsq {
    public static dvp a(dru druVar, Exception exc) {
        return exc instanceof dvp ? (dvp) exc : new dvp(druVar, null, exc);
    }

    public static void b(dru druVar, dto dtoVar) {
        dtu dtuVarD = druVar.d();
        if (dtuVarD != null) {
            dtuVarD.cC(dtoVar);
        }
    }

    static void c(dru druVar, Exception exc) {
        dto dtoVar = new dto();
        dtoVar.b = exc;
        dtoVar.a = druVar != null ? druVar.h : null;
        b(druVar, dtoVar);
    }

    public static void d(dru druVar, Exception exc) {
        String strGroup;
        boolean z = ebc.a;
        try {
            if (druVar.c == null) {
                c(druVar, exc);
                return;
            }
            dvp dvpVarA = a(druVar, exc);
            String strI = druVar.i();
            Map map = drq.g;
            LinkedList linkedList = new LinkedList();
            String[] strArrSplit = strI.split(",");
            Map map2 = drq.g;
            synchronized (map2) {
                for (String string : strArrSplit) {
                    Pattern pattern = dsd.a;
                    if (!string.startsWith("$")) {
                        String str = "id(" + string + ")";
                        Matcher matcher = dsd.a.matcher(string);
                        if (!matcher.find() || (strGroup = matcher.group(0)) == null) {
                            string = str;
                        } else {
                            try {
                                int i = Integer.parseInt(strGroup);
                                for (Map.Entry entry : map2.entrySet()) {
                                    if (((Integer) entry.getValue()).equals(Integer.valueOf(i))) {
                                        Object key = entry.getKey();
                                        string = key instanceof Class ? "<cls>" + ((Class) key).getName() + "</cls>" : key.toString();
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                            string = str;
                        }
                    }
                    linkedList.add(string);
                }
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                dvpVarA.b.add((String) it.next());
            }
            c(druVar, dvpVarA);
        } catch (dxf unused2) {
            throw a(druVar, exc);
        } catch (Exception e) {
            throw a(druVar, e);
        }
    }

    static void e(dru druVar, drq drqVar, Exception exc) {
        boolean z = exc instanceof dxf;
        dtu dtuVarD = druVar.d();
        dtu dtuVar = null;
        if (z) {
            exc = null;
        } else if (exc instanceof dvp) {
            dtuVar = ((dvp) exc).a;
        }
        dvp dvpVarA = a(druVar, exc);
        dvpVarA.b.add(drqVar.d());
        if (dtuVar == dtuVarD) {
            dvpVarA.a = dtuVar;
            throw dvpVarA;
        }
        if (dtuVarD instanceof dtp) {
            ((dtp) dtuVarD).b(druVar.h, dvpVarA);
        } else {
            try {
                c(druVar, exc);
            } catch (dxf unused) {
                dvpVarA.a = dtuVarD;
                throw dvpVarA;
            }
        }
    }

    static void f(Exception exc) {
        if (exc instanceof dxf) {
            Exception exc2 = ((dxf) exc).a;
            f(null);
        } else {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
    }

    public static boolean g(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        if (obj != null && obj2 != null) {
            if (obj.getClass() == obj2.getClass()) {
                for (Field field : obj.getClass().getDeclaredFields()) {
                    if (field.isAnnotationPresent(eat.class)) {
                        Class<?> type = field.getType();
                        try {
                            field.setAccessible(true);
                            Object obj3 = field.get(obj);
                            Object obj4 = field.get(obj2);
                            field.setAccessible(false);
                            boolean z = ebc.a;
                            if (!k(field, type, obj3, obj4)) {
                                return false;
                            }
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Unable to get fields by reflection.", e);
                        }
                    }
                }
                return true;
            }
        }
        throw new IllegalArgumentException("The input is invalid.");
    }

    public static boolean h(dxx dxxVar, dxx dxxVar2) {
        if (dxxVar == null && dxxVar2 == null) {
            return true;
        }
        if (dxxVar == null || dxxVar2 == null) {
            return false;
        }
        return g(dxxVar, dxxVar2);
    }

    public static boolean i(drq drqVar, drq drqVar2) {
        if (drqVar == drqVar2) {
            return true;
        }
        if (drqVar == null || drqVar2 == null) {
            return false;
        }
        return drqVar.getClass().equals(drqVar2.getClass());
    }

    private static boolean j(int i, Collection collection, Collection collection2) {
        if (i <= 0) {
            throw new IllegalArgumentException("Level cannot be < 1");
        }
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        Iterator it2 = collection2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (i == 1) {
                drq drqVar = (drq) it.next();
                drq drqVar2 = (drq) it2.next();
                boolean z = ebc.a;
                if (!drqVar.g(drqVar2)) {
                    return false;
                }
            } else if (!j(i - 1, (Collection) it.next(), (Collection) it2.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean k(Field field, Class cls, Object obj, Object obj2) {
        try {
            int iA = ((eat) field.getAnnotation(eat.class)).a();
            switch (iA) {
                case 0:
                    if (Float.compare(((Float) obj).floatValue(), ((Float) obj2).floatValue()) != 0) {
                    }
                    break;
                case 1:
                    if (Double.compare(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()) != 0) {
                    }
                    break;
                case 2:
                    Class<?> componentType = cls.getComponentType();
                    if (Byte.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        }
                    } else if (Short.TYPE.isAssignableFrom(componentType)) {
                        if (Arrays.equals((short[]) obj, (short[]) obj2)) {
                        }
                    } else if (Character.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        }
                    } else if (Integer.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        }
                    } else if (Long.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        }
                    } else if (Float.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        }
                    } else if (Double.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        }
                    } else if (Boolean.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        }
                    } else if (!Arrays.equals((Object[]) obj, (Object[]) obj2)) {
                    }
                    break;
                case 3:
                    if (!obj.equals(obj2)) {
                    }
                    break;
                case 4:
                    if (!((ebz) obj).a((ebz) obj2)) {
                    }
                    break;
                case 5:
                    Collection collection = (Collection) obj;
                    Collection collection2 = (Collection) obj2;
                    if (collection != null) {
                        if (!collection.equals(collection2)) {
                        }
                    } else if (collection2 != null) {
                    }
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    if (!j(iA - 5, (Collection) obj, (Collection) obj2)) {
                    }
                    break;
                case 10:
                    if (obj != null) {
                        boolean z = ebc.a;
                        if (!((drq) obj).g((drq) obj2)) {
                        }
                    } else if (obj2 != null) {
                    }
                    break;
                case 11:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (obj != null) {
                        if (!((dtu) obj).a((dtu) obj2)) {
                        }
                    } else if (obj2 != null) {
                    }
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (obj != null) {
                        if (!obj.equals(obj2)) {
                        }
                    } else if (obj2 != null) {
                    }
                    break;
                case 15:
                    if (obj != null) {
                        if (!((dtn) obj).a(obj2)) {
                        }
                    } else if (obj2 != null) {
                    }
                    break;
            }
            return false;
        }
    }
}
