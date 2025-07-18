package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vba {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = abs.b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }
}
