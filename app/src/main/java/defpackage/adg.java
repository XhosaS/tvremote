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
public class adg {
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

    private static Object h(Object[] objArr, int i, adf adfVar) {
        int i2 = Integer.MAX_VALUE;
        Object obj = null;
        for (Object obj2 : objArr) {
            int i3 = i & 1;
            boolean z = (i & 2) != 0;
            int iAbs = Math.abs(adfVar.a(obj2) - (1 != i3 ? 400 : 700));
            int i4 = iAbs + iAbs + (adfVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > i4) {
                i2 = i4;
                obj = obj2;
            }
        }
        return obj;
    }

    public Typeface a(Context context, acb acbVar, Resources resources, int i) {
        acc accVar = (acc) h(acbVar.a, i, new ade());
        if (accVar == null) {
            return null;
        }
        Typeface typefaceA = acy.a(context, resources, accVar.f, accVar.a, 0, i);
        long jG = g(typefaceA);
        if (jG != 0) {
            this.a.put(Long.valueOf(jG), acbVar);
        }
        return typefaceA;
    }

    public Typeface b(Context context, aen[] aenVarArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (aenVarArr.length <= 0) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(m(aenVarArr, i).a);
            try {
                Typeface typefaceL = l(context, inputStreamOpenInputStream);
                adh.b(inputStreamOpenInputStream);
                return typefaceL;
            } catch (IOException unused) {
                adh.b(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                adh.b(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileA = adh.a(context);
        Typeface typefaceCreateFromFile = null;
        if (fileA == null) {
            return null;
        }
        try {
            if (adh.d(fileA, resources, i)) {
                typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            fileA.delete();
            throw th;
        }
        fileA.delete();
        return typefaceCreateFromFile;
    }

    public Typeface f(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface l(Context context, InputStream inputStream) {
        File fileA = adh.a(context);
        Typeface typefaceCreateFromFile = null;
        if (fileA == null) {
            return null;
        }
        try {
            if (adh.c(fileA, inputStream)) {
                typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            fileA.delete();
            throw th;
        }
        fileA.delete();
        return typefaceCreateFromFile;
    }

    protected aen m(aen[] aenVarArr, int i) {
        return (aen) h(aenVarArr, i, new add());
    }
}
