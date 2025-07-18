package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class w {
    public static final Set a = new HashSet();
    public static final boolean b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i = Integer.parseInt(strNextToken);
                    int i2 = Integer.parseInt(strNextToken2);
                    if (i > 2 || (i == 2 && i2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder("VM with version ");
        sb.append(property);
        sb.append(true != z ? " does not have multidex support" : " has multidex support");
        Log.i("MultiDex", sb.toString());
        b = z;
    }

    public static Field a(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static void b(ClassLoader classLoader, File file, List list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IOException, IllegalArgumentException {
        IOException[] iOExceptionArr;
        if (list.isEmpty()) {
            return;
        }
        Object obj = a(classLoader, "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList);
                Field fieldA = a(obj, "dexElements");
                Object[] objArr2 = (Object[]) fieldA.get(obj);
                Class<?> componentType = objArr2.getClass().getComponentType();
                int length = objArr2.length;
                int length2 = objArr.length;
                Object[] objArr3 = (Object[]) Array.newInstance(componentType, length + length2);
                System.arraycopy(objArr2, 0, objArr3, 0, length);
                System.arraycopy(objArr, 0, objArr3, length, length2);
                fieldA.set(obj, objArr3);
                if (arrayList.size() > 0) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        Log.w("MultiDex", "Exception in makeDexElement", (IOException) arrayList.get(i));
                    }
                    Field fieldA2 = a(obj, "dexElementsSuppressedExceptions");
                    IOException[] iOExceptionArr2 = (IOException[]) fieldA2.get(obj);
                    if (iOExceptionArr2 == null) {
                        iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                    } else {
                        int size2 = arrayList.size();
                        int length3 = iOExceptionArr2.length;
                        IOException[] iOExceptionArr3 = new IOException[size2 + length3];
                        arrayList.toArray(iOExceptionArr3);
                        System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), length3);
                        iOExceptionArr = iOExceptionArr3;
                    }
                    fieldA2.set(obj, iOExceptionArr);
                    IOException iOException = new IOException("I/O exception during makeDexElement");
                    iOException.initCause((Throwable) arrayList.get(0));
                    throw iOException;
                }
                return;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static void c(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory ".concat(String.valueOf(file.getPath())));
    }
}
