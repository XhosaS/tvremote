package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vdc {
    private static final int[] a = {R.attr.theme, com.google.android.katniss.R.attr.theme};
    private static final int[] b = {com.google.android.katniss.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        return b(context, attributeSet, i, i2, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        int i3 = c(context, attributeSet, b, i, i2)[0];
        boolean z = (context instanceof ve) && ((ve) context).a == i3;
        if (i3 == 0 || z) {
            return context;
        }
        ve veVar = new ve(context, i3);
        int[] iArrC = c(context, attributeSet, iArr, i, i2);
        int length = iArrC.length;
        for (int i4 = 0; i4 < length; i4 = 1) {
            int i5 = iArrC[0];
            if (i5 != 0) {
                veVar.getTheme().applyStyle(i5, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            veVar.getTheme().applyStyle(resourceId, true);
        }
        return veVar;
    }

    private static int[] c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        if (length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 = 0; i3 < iArr.length; i3 = 1) {
                iArr2[0] = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }
}
