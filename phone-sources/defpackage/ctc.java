package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.widget.ActivityChooserView;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctc {
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

    private static Object h(Object[] objArr, int i, ctb ctbVar) {
        int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        Object obj = null;
        for (Object obj2 : objArr) {
            int i3 = i & 1;
            boolean z = (i & 2) != 0;
            int iAbs = Math.abs(ctbVar.a(obj2) - (1 != i3 ? 400 : 700));
            int i4 = iAbs + iAbs + (ctbVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > i4) {
                i2 = i4;
                obj = obj2;
            }
        }
        return obj;
    }

    public Typeface a(Context context, cty[] ctyVarArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (ctyVarArr.length <= 0) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(m(ctyVarArr, i).a);
            try {
                Typeface typefaceL = l(context, inputStreamOpenInputStream);
                cry.c(inputStreamOpenInputStream);
                return typefaceL;
            } catch (IOException unused) {
                cry.c(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                cry.c(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface b(Context context, cvw cvwVar, Resources resources, int i) {
        csi csiVar = (csi) h((Object[]) cvwVar.a, i, new cta(0));
        if (csiVar == null) {
            return null;
        }
        Typeface typefaceA = csu.a(context, resources, csiVar.f, csiVar.a, 0, i);
        long jG = g(typefaceA);
        if (jG != 0) {
            this.a.put(Long.valueOf(jG), cvwVar);
        }
        return typefaceA;
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileB = cry.b(context);
        Typeface typefaceCreateFromFile = null;
        if (fileB == null) {
            return null;
        }
        try {
            if (cry.e(fileB, resources, i)) {
                typefaceCreateFromFile = Typeface.createFromFile(fileB.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            fileB.delete();
            throw th;
        }
        fileB.delete();
        return typefaceCreateFromFile;
    }

    public Typeface f(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface l(Context context, InputStream inputStream) {
        File fileB = cry.b(context);
        Typeface typefaceCreateFromFile = null;
        if (fileB == null) {
            return null;
        }
        try {
            if (cry.d(fileB, inputStream)) {
                typefaceCreateFromFile = Typeface.createFromFile(fileB.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            fileB.delete();
            throw th;
        }
        fileB.delete();
        return typefaceCreateFromFile;
    }

    protected cty m(cty[] ctyVarArr, int i) {
        return (cty) h(ctyVarArr, i, new cta(1));
    }
}
