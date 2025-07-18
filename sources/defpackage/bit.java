package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bit {
    public static void b(Outline outline, Path path) {
        outline.setConvexPath(path);
    }

    public static int c(View view, int i) {
        Class<?> cls = view.getClass();
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = cls.getCanonicalName();
        TypedValue typedValueH = xo.h(context2, i);
        if (typedValueH != null) {
            return m(context, typedValueH);
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, context2.getResources().getResourceName(i)));
    }

    public static int d(int i, int i2, float f) {
        return ns.c(ns.d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int e(Context context, int i) {
        TypedValue typedValueH = xo.h(context, i);
        Integer numValueOf = typedValueH != null ? Integer.valueOf(m(context, typedValueH)) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public static Uri f(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static void g(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        }
        if (obj2 == null) {
            throw new NullPointerException(b.i(obj, "null value in entry: ", "=null"));
        }
    }

    public static void h(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void i(boolean z) {
        if (!z) {
            throw new byv();
        }
    }

    public static void j(Object obj) {
        Object[] objArr = new Object[0];
        if (obj == null) {
            throw new byv(l("expected a non-null reference", objArr));
        }
    }

    public static byo k(byo byoVar) {
        return ((byoVar instanceof byq) || (byoVar instanceof byp)) ? byoVar : byoVar instanceof Serializable ? new byp(byoVar) : new byq(byoVar);
    }

    public static String l(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static int m(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }

    public bgx a(Context context) {
        return new bgy(context, 1, null);
    }
}
