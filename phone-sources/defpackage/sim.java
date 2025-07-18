package defpackage;

import android.animation.TimeInterpolator;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.videos.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sim {
    public sim() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r2, defpackage.six r3) throws java.lang.ClassNotFoundException {
        /*
            java.lang.String r0 = "gen_binder.root.RootModule$Generated"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            sjf r0 = (defpackage.sjf) r0     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            boolean r1 = r3.c     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            java.util.concurrent.CopyOnWriteArrayList r1 = r3.b     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            r1.add(r0)     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            r0.b()     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            goto L38
        L17:
            java.lang.String r0 = "com.google.android.apps.photos.PhotosApplication"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L28
            android.content.Context r2 = r2.getApplicationContext()
            boolean r2 = r0.isInstance(r2)
            defpackage.a.ab(r2)
        L28:
            java.lang.String r2 = "Binder"
            r0 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r0)
            if (r2 == 0) goto L38
            java.lang.String r2 = "Binder"
            java.lang.String r0 = "To use Binder more efficiently, your android_binary target should include \"//java/com/google/android/libraries/stitch/binder:rootmodule\" in srcs."
            android.util.Log.w(r2, r0)
        L38:
            java.lang.Class<sjc> r2 = defpackage.sjc.class
            java.lang.String r0 = "gen_binder.root.RootActivityModule$Generated$Factory"
            m(r3, r2, r0)
            java.lang.Class<sje> r2 = defpackage.sje.class
            java.lang.String r0 = "gen_binder.root.RootFragmentModule$Generated$Factory"
            m(r3, r2, r0)
            monitor-enter(r3)
            siz r2 = r3.d     // Catch: java.lang.Throwable -> L58
            boolean r2 = r2 instanceof defpackage.sjg     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L4f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            goto L57
        L4f:
            sja r2 = new sja     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r3.d = r2     // Catch: java.lang.Throwable -> L58
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
        L57:
            return
        L58:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            throw r2
        L5b:
            r2 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to instantiate root module gen_binder.root.RootModule$Generated"
            r3.<init>(r0, r2)
            throw r3
        L64:
            r2 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to instantiate root module gen_binder.root.RootModule$Generated"
            r3.<init>(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sim.a(android.content.Context, six):void");
    }

    public static int b(Context context, int i, int i2) {
        TypedValue typedValueD = d(context, i);
        return (typedValueD == null || typedValueD.type != 16) ? i2 : typedValueD.data;
    }

    public static int c(Context context) {
        TypedValue typedValueD = d(context, R.attr.minTouchTargetSize);
        return (int) ((typedValueD == null || typedValueD.type != 5) ? context.getResources().getDimension(R.dimen.mtrl_min_touch_target_size) : typedValueD.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static TypedValue d(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue e(View view, int i) {
        return f(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static TypedValue f(Context context, int i, String str) {
        TypedValue typedValueD = d(context, i);
        if (typedValueD != null) {
            return typedValueD;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean g(Context context, int i, boolean z) {
        TypedValue typedValueD = d(context, i);
        return (typedValueD == null || typedValueD.type != 18) ? z : typedValueD.data != 0;
    }

    public static float h(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static final float j(float f) {
        TimeInterpolator timeInterpolator = sns.a;
        return (f * 0.6f) + 0.4f;
    }

    public static TimeInterpolator k(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!p(strValueOf, "cubic-bezier") && !p(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!p(strValueOf, "cubic-bezier")) {
            if (p(strValueOf, "path")) {
                return new PathInterpolator(crn.c(o(strValueOf, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(strValueOf)));
        }
        String[] strArrSplit = o(strValueOf, "cubic-bezier").split(",");
        int length = strArrSplit.length;
        if (length == 4) {
            return new PathInterpolator(n(strArrSplit, 0), n(strArrSplit, 1), n(strArrSplit, 2), n(strArrSplit, 3));
        }
        throw new IllegalArgumentException(a.cf(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
    }

    public static aafi l(String str, StringBuilder sb, ArrayList arrayList) {
        return new aafi(str, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    private static void m(six sixVar, Class cls, String str) {
        try {
            try {
                sixVar.b(cls, Class.forName(str).getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Failed to instantiate ".concat(str), e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("Failed to instantiate ".concat(str), e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("Failed to instantiate ".concat(str), e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("Failed to instantiate ".concat(str), e4);
            }
        } catch (ClassNotFoundException e5) {
            if (Log.isLoggable("Binder", 5)) {
                Log.w("Binder", "Cannot find ".concat(str), e5);
            }
        }
    }

    private static float n(String[] strArr, int i) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    private static String o(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean p(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public float i(float f) {
        return 1.0f;
    }

    public sim(byte[] bArr, byte[] bArr2) {
    }
}
