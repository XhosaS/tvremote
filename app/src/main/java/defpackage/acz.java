package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
class acz extends adg {
    private static Class a = null;
    private static Constructor b = null;
    private static Method c = null;
    private static Method d = null;
    private static boolean e = false;

    private final File g(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static Object h() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        i();
        try {
            return b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void i() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    @Override // defpackage.adg
    public Typeface a(Context context, acb acbVar, Resources resources, int i) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        acc[] accVarArr = acbVar.a;
        Object objH = h();
        for (acc accVar : accVarArr) {
            File fileA = adh.a(context);
            if (fileA != null) {
                try {
                    if (adh.d(fileA, resources, accVar.f)) {
                        String path = fileA.getPath();
                        int i2 = accVar.b;
                        boolean z = accVar.c;
                        i();
                        try {
                            if (((Boolean) c.invoke(objH, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                                fileA.delete();
                            }
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    fileA.delete();
                    throw th;
                }
                fileA.delete();
            }
            return null;
        }
        i();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(objNewInstance, 0, objH);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.adg
    public Typeface b(Context context, aen[] aenVarArr, int i) throws IOException {
        Typeface typefaceL;
        if (aenVarArr.length <= 0) {
            return null;
        }
        aen aenVarM = m(aenVarArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(aenVarM.a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return null;
            }
            try {
                File fileG = g(parcelFileDescriptorOpenFileDescriptor);
                if (fileG == null || !fileG.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceL = super.l(context, fileInputStream);
                        fileInputStream.close();
                    } finally {
                    }
                } else {
                    typefaceL = Typeface.createFromFile(fileG);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceL;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
