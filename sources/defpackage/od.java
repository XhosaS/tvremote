package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class od {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long g(Typeface typeface) throws NoSuchFieldException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object h(Object[] objArr, int i, oc ocVar) {
        int i2 = Integer.MAX_VALUE;
        Object obj = null;
        for (Object obj2 : objArr) {
            int i3 = i & 1;
            boolean z = (i & 2) != 0;
            int iAbs = Math.abs(ocVar.a(obj2) - (1 != i3 ? 400 : 700));
            int i4 = iAbs + iAbs + (ocVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > i4) {
                i2 = i4;
                obj = obj2;
            }
        }
        return obj;
    }

    public Typeface a(Context context, ou[] ouVarArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (ouVarArr.length <= 0) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(m(ouVarArr, i).a);
            try {
                Typeface typefaceL = l(context, inputStreamOpenInputStream);
                mo.G(inputStreamOpenInputStream);
                return typefaceL;
            } catch (IOException unused) {
                mo.G(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                mo.G(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface b(Context context, asv asvVar, Resources resources, int i) throws NoSuchFieldException {
        nl nlVar = (nl) h((Object[]) asvVar.a, i, new ob(0));
        if (nlVar == null) {
            return null;
        }
        Typeface typefaceA = nv.a(context, resources, nlVar.f, nlVar.a, 0, i);
        long jG = g(typefaceA);
        if (jG != 0) {
            this.a.put(Long.valueOf(jG), asvVar);
        }
        return typefaceA;
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileF = mo.F(context);
        Typeface typefaceCreateFromFile = null;
        if (fileF == null) {
            return null;
        }
        try {
            if (mo.I(fileF, resources, i)) {
                typefaceCreateFromFile = Typeface.createFromFile(fileF.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            fileF.delete();
            throw th;
        }
        fileF.delete();
        return typefaceCreateFromFile;
    }

    public Typeface f(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface l(Context context, InputStream inputStream) {
        File fileF = mo.F(context);
        Typeface typefaceCreateFromFile = null;
        if (fileF == null) {
            return null;
        }
        try {
            if (mo.H(fileF, inputStream)) {
                typefaceCreateFromFile = Typeface.createFromFile(fileF.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            fileF.delete();
            throw th;
        }
        fileF.delete();
        return typefaceCreateFromFile;
    }

    protected ou m(ou[] ouVarArr, int i) {
        return (ou) h(ouVarArr, i, new ob(1));
    }
}
