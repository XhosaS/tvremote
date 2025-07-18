package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suy {
    private static final int[] a = {R.attr.colorPrimary};
    private static final int[] b = {R.attr.colorPrimaryVariant};

    public static TypedArray a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        f(context, attributeSet, i, i2);
        g(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static TintTypedArray b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        f(context, attributeSet, i, i2);
        g(context, attributeSet, iArr, i, i2, iArr2);
        return TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i, i2);
    }

    public static void c(Context context) {
        h(context, a, "Theme.AppCompat");
    }

    public static void d(Context context) {
        h(context, b, "Theme.MaterialComponents");
    }

    public static boolean e(Context context) {
        return sim.g(context, R.attr.isMaterial3Theme, false);
    }

    private static void f(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, suo.d, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                d(context);
            }
        }
        c(context);
    }

    private static void g(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, suo.d, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void h(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.recycle();
        } else {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalArgumentException(a.cg(str, "The style on this component requires your app theme to be ", " (or a descendant)."));
        }
    }
}
