package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uzt {
    public static int a(View view, int i) {
        Class<?> cls = view.getClass();
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = cls.getCanonicalName();
        TypedValue typedValueB = vaz.b(context2, i);
        if (typedValueB != null) {
            return d(context, typedValueB);
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, context2.getResources().getResourceName(i)));
    }

    public static int b(int i, int i2, float f) {
        return acr.e(acr.f(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int c(Context context, int i) {
        TypedValue typedValueB = vaz.b(context, i);
        Integer numValueOf = typedValueB != null ? Integer.valueOf(d(context, typedValueB)) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private static int d(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }
}
