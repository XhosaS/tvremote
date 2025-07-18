package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aps {
    public final Object a;
    public final Object b;
    public Object c;

    public aps(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public static aps p(Context context, int i, int[] iArr) {
        return new aps(context, context.obtainStyledAttributes(i, iArr));
    }

    public static aps q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new aps(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static aps r(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new aps(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final File a() {
        Object obj;
        synchronized (this.a) {
            if (this.c == null) {
                this.c = ((Context) this.b).getDataDir();
            }
            obj = this.c;
        }
        return (File) obj;
    }

    public final int b(int i, int i2) {
        return ((TypedArray) this.a).getDimensionPixelOffset(i, i2);
    }

    public final int c(int i, int i2) {
        return ((TypedArray) this.a).getDimensionPixelSize(i, i2);
    }

    public final int d(int i, int i2) {
        return ((TypedArray) this.a).getInt(i, i2);
    }

    public final int e(int i, int i2) {
        return ((TypedArray) this.a).getInteger(i, i2);
    }

    public final int f(int i, int i2) {
        return ((TypedArray) this.a).getLayoutDimension(i, i2);
    }

    public final int g(int i, int i2) {
        return ((TypedArray) this.a).getResourceId(i, i2);
    }

    public final ColorStateList h(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = nf.b((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public final Drawable i(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : ii.J((Context) this.b, resourceId);
    }

    public final Drawable j(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return fm.d().g((Context) this.b, resourceId);
    }

    public final CharSequence k(int i) {
        return ((TypedArray) this.a).getText(i);
    }

    public final String l(int i) {
        return ((TypedArray) this.a).getString(i);
    }

    public final void m() {
        ((TypedArray) this.a).recycle();
    }

    public final boolean n(int i, boolean z) {
        return ((TypedArray) this.a).getBoolean(i, z);
    }

    public final boolean o(int i) {
        return ((TypedArray) this.a).hasValue(i);
    }

    public aps(Context context) {
        this.a = new Object();
        this.b = context.getApplicationContext();
    }
}
