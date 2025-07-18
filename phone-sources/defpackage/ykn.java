package defpackage;

import android.support.v7.widget.ActivityChooserView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ykn {
    private static ykn a;

    public ykn() {
    }

    public static long A(long j, yno ynoVar, yno ynoVar2) {
        ynoVar.getClass();
        ynoVar2.getClass();
        return ynoVar2.h.convert(j, ynoVar.h);
    }

    public static long B(long j, yno ynoVar, yno ynoVar2) {
        ynoVar.getClass();
        ynoVar2.getClass();
        return ynoVar2.h.convert(j, ynoVar.h);
    }

    public static xxy C() {
        return yak.a == null ? new yak() : new xur();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.List] */
    public static List D(Class cls, Iterable iterable, ClassLoader classLoader, xtg xtgVar) {
        ?? Load;
        if (E(classLoader)) {
            Load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object objNewInstance = null;
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } else {
            Load = ServiceLoader.load(cls, classLoader);
            if (!Load.iterator().hasNext()) {
                Load = ServiceLoader.load(cls);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            xtgVar.b(obj);
            arrayList.add(obj);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new acs(xtgVar, 20)));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean E(ClassLoader classLoader) throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static synchronized void F() {
        if (a == null) {
            a = new ykn(null, null, null);
        }
    }

    public static Iterator e(Object[] objArr) {
        objArr.getClass();
        return new ymr(objArr, 1);
    }

    public static double f(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + ".");
    }

    public static float g(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static float h(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static float i(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + ".");
    }

    public static int j(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int k(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int l(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException(a.cn(i2, i3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "."));
    }

    public static long m(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static long n(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static long o(long j, yma ymaVar) {
        return j < ((Number) ymaVar.b()).longValue() ? ((Number) ymaVar.b()).longValue() : j <= ((Number) ymaVar.a()).longValue() ? j : ((Number) ymaVar.a()).longValue();
    }

    public static long p(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + ".");
    }

    public static ymb q(ymb ymbVar, int i) {
        ymbVar.getClass();
        if (ymbVar.c <= 0) {
            i = -i;
        }
        return new ymb(ymbVar.a, ymbVar.b, i);
    }

    public static ymd r(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? ymd.d : new ymd(i, i2 - 1);
    }

    public static Comparable s(Comparable comparable, ylz ylzVar) {
        ylzVar.getClass();
        if (ylzVar.d()) {
            throw new IllegalArgumentException(a.cj(ylzVar, "Cannot coerce value to an empty range: ", "."));
        }
        return (!ylz.e(comparable, ylzVar.b()) || ylz.e(ylzVar.b(), comparable)) ? (!ylz.e(ylzVar.a(), comparable) || ylz.e(comparable, ylzVar.a())) ? comparable : ylzVar.a() : ylzVar.b();
    }

    public static double t(double d) {
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static int u(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int v(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static long w(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    public static Object x(Collection collection, yih yihVar) {
        if (collection.isEmpty()) {
            return yhb.a;
        }
        ztj ztjVar = new ztj((ypc[]) collection.toArray(new ypc[0]));
        yof yofVar = new yof(wcq.S(yihVar), 1);
        yofVar.v();
        ypc[] ypcVarArr = (ypc[]) ztjVar.b;
        int length = ypcVarArr.length;
        yny[] ynyVarArr = new yny[length];
        for (int i = 0; i < length; i++) {
            ypc ypcVar = ypcVarArr[i];
            ypcVar.y();
            yny ynyVar = new yny(ztjVar, yofVar);
            ynyVar.a = yoz.E(ypcVar, ynyVar);
            ynyVarArr[i] = ynyVar;
        }
        ynz ynzVar = new ynz(ynyVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            ynyVarArr[i2].b.c(ynzVar);
        }
        if (yofVar.g()) {
            ynzVar.a();
        } else {
            yofVar.w(ynzVar);
        }
        return yofVar.i();
    }

    public static long y(long j) {
        return j < 0 ? ynm.b : ynm.a;
    }

    public static double z(double d, yno ynoVar, yno ynoVar2) {
        ynoVar.getClass();
        ynoVar2.getClass();
        TimeUnit timeUnit = ynoVar.h;
        long jConvert = ynoVar2.h.convert(1L, timeUnit);
        return jConvert > 0 ? d * jConvert : d / timeUnit.convert(1L, r9);
    }

    public xtk G(xsv xsvVar) {
        throw null;
    }

    public ykn(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        new HashSet();
    }

    public void b(long j) {
    }

    public void c(long j) {
    }
}
