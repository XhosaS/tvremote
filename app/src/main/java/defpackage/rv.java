package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rv {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    private rv(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static rv d(Context context, int i, int[] iArr) {
        return new rv(context, context.obtainStyledAttributes(i, iArr));
    }

    public static rv e(Context context, AttributeSet attributeSet, int[] iArr) {
        return new rv(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static rv f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new rv(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = abs.b(this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : ra.e().c(this.a, resourceId);
    }

    public final Drawable c(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return ll.d().g(this.a, resourceId);
    }
}
