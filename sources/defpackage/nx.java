package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nx extends od {
    public static final Method a;
    private static final Class b;
    private static final Constructor c;
    private static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        a = method2;
        d = method;
    }

    private static Typeface g(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Object h() {
        try {
            return c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean i(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.od
    public final Typeface a(Context context, ou[] ouVarArr, int i) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objH = h();
        if (objH == null) {
            return null;
        }
        mi miVar = new mi();
        for (ou ouVar : ouVarArr) {
            Uri uri = ouVar.a;
            ByteBuffer byteBufferJ = (ByteBuffer) miVar.get(uri);
            if (byteBufferJ == null) {
                byteBufferJ = mo.J(context, uri);
                miVar.put(uri, byteBufferJ);
            }
            if (byteBufferJ == null || !i(objH, byteBufferJ, ouVar.b, ouVar.c, ouVar.d)) {
                return null;
            }
        }
        Typeface typefaceG = g(objH);
        if (typefaceG != null) {
            return Typeface.create(typefaceG, i);
        }
        return null;
    }

    @Override // defpackage.od
    public final Typeface b(Context context, asv asvVar, Resources resources, int i) {
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        Object objH = h();
        if (objH != null) {
            for (nl nlVar : (nl[]) asvVar.a) {
                int i2 = nlVar.f;
                File fileF = mo.F(context);
                if (fileF != null) {
                    try {
                        if (mo.I(fileF, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(fileF);
                            } catch (IOException unused) {
                                map = null;
                            }
                            try {
                                FileChannel fileChannelK = mo.K(fileInputStream);
                                map = fileChannelK.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelK.size());
                                fileInputStream.close();
                                if (map == null && i(objH, map, nlVar.e, nlVar.b, nlVar.c)) {
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileF.delete();
                    }
                }
                map = null;
                if (map == null) {
                }
            }
            return g(objH);
        }
        return null;
    }
}
