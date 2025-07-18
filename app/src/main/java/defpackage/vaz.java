package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vaz {
    public static int a(Context context, int i, int i2) {
        TypedValue typedValueB = b(context, i);
        return (typedValueB == null || typedValueB.type != 16) ? i2 : typedValueB.data;
    }

    public static TypedValue b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean c(Context context, int i, boolean z) {
        TypedValue typedValueB = b(context, i);
        return (typedValueB == null || typedValueB.type != 18) ? z : typedValueB.data != 0;
    }
}
