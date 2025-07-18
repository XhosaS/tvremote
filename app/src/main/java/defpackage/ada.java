package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ada extends acz {
    protected final Class a;
    protected final Constructor b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public ada() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodE;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, Boolean.TYPE, cls3, cls3, cls3, FontVariationAxis[].class);
            Class<?> cls4 = Integer.TYPE;
            method2 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls4, FontVariationAxis[].class, cls4, cls4);
            method3 = cls2.getMethod("freeze", null);
            method4 = cls2.getMethod("abortCreation", null);
            methodE = e(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(String.valueOf(e.getClass().getName())), e);
            methodE = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
        }
        this.a = cls;
        this.b = constructor;
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = method4;
        this.g = methodE;
    }

    private final Object g() {
        try {
            return this.b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private final void h(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private final boolean i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean j(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean k() {
        Method method = this.c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // defpackage.acz, defpackage.adg
    public final Typeface a(Context context, acb acbVar, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!k()) {
            return super.a(context, acbVar, resources, i);
        }
        Object objG = g();
        if (objG != null) {
            acc[] accVarArr = acbVar.a;
            int length = accVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                acc accVar = accVarArr[i2];
                Context context2 = context;
                if (!i(context2, objG, accVar.a, accVar.e, accVar.b, accVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(accVar.d))) {
                    h(objG);
                    return null;
                }
                i2++;
                context = context2;
            }
            if (j(objG)) {
                return c(objG);
            }
        }
        return null;
    }

    @Override // defpackage.acz, defpackage.adg
    public final Typeface b(Context context, aen[] aenVarArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceC;
        if (aenVarArr.length <= 0) {
            return null;
        }
        if (!k()) {
            aen aenVarM = m(aenVarArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(aenVarM.a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(aenVarM.c).setItalic(aenVarM.d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (aen aenVar : aenVarArr) {
            if (aenVar.e == 0) {
                Uri uri = aenVar.a;
                if (!map.containsKey(uri)) {
                    map.put(uri, adh.e(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
        Object objG = g();
        if (objG == null) {
            return null;
        }
        int length = aenVarArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            aen aenVar2 = aenVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(aenVar2.a);
            if (byteBuffer != null) {
                if (!((Boolean) this.d.invoke(objG, byteBuffer, Integer.valueOf(aenVar2.b), null, Integer.valueOf(aenVar2.c), Integer.valueOf(aenVar2.d ? 1 : 0))).booleanValue()) {
                    h(objG);
                    return null;
                }
                z = true;
            }
            i2++;
            z = z;
        }
        if (!z) {
            h(objG);
            return null;
        }
        if (j(objG) && (typefaceC = c(objG)) != null) {
            return Typeface.create(typefaceC, i);
        }
        return null;
    }

    protected Typeface c(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.g.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.adg
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!k()) {
            return super.d(context, resources, i, str, i2);
        }
        Object objG = g();
        if (objG != null) {
            if (!i(context, objG, str, 0, -1, -1, null)) {
                h(objG);
                return null;
            }
            if (j(objG)) {
                return c(objG);
            }
        }
        return null;
    }

    protected Method e(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
