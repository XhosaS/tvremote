package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.csm;
import defpackage.cso;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TintTypedArray {
    private final Context mContext;
    private TypedValue mTypedValue;
    private final TypedArray mWrapped;

    /* compiled from: PG */
    class Api21Impl {
        private Api21Impl() {
        }

        static int getChangingConfigurations(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        static int getType(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    private TintTypedArray(Context context, TypedArray typedArray) {
        this.mContext = context;
        this.mWrapped = typedArray;
    }

    public static TintTypedArray obtainStyledAttributes(Context context, int i, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(i, iArr));
    }

    public boolean getBoolean(int i, boolean z) {
        return this.mWrapped.getBoolean(i, z);
    }

    public int getChangingConfigurations() {
        return Api21Impl.getChangingConfigurations(this.mWrapped);
    }

    public int getColor(int i, int i2) {
        return this.mWrapped.getColor(i, i2);
    }

    public ColorStateList getColorStateList(int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!this.mWrapped.hasValue(i) || (resourceId = this.mWrapped.getResourceId(i, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(this.mContext, resourceId)) == null) ? this.mWrapped.getColorStateList(i) : colorStateList;
    }

    public float getDimension(int i, float f) {
        return this.mWrapped.getDimension(i, f);
    }

    public int getDimensionPixelOffset(int i, int i2) {
        return this.mWrapped.getDimensionPixelOffset(i, i2);
    }

    public int getDimensionPixelSize(int i, int i2) {
        return this.mWrapped.getDimensionPixelSize(i, i2);
    }

    public Drawable getDrawable(int i) {
        int resourceId;
        return (!this.mWrapped.hasValue(i) || (resourceId = this.mWrapped.getResourceId(i, 0)) == 0) ? this.mWrapped.getDrawable(i) : AppCompatResources.getDrawable(this.mContext, resourceId);
    }

    public Drawable getDrawableIfKnown(int i) {
        int resourceId;
        if (!this.mWrapped.hasValue(i) || (resourceId = this.mWrapped.getResourceId(i, 0)) == 0) {
            return null;
        }
        return AppCompatDrawableManager.get().getDrawable(this.mContext, resourceId, true);
    }

    public float getFloat(int i, float f) {
        return this.mWrapped.getFloat(i, f);
    }

    public Typeface getFont(int i, int i2, csm csmVar) {
        int resourceId = this.mWrapped.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        Context context = this.mContext;
        TypedValue typedValue = this.mTypedValue;
        ThreadLocal threadLocal = cso.a;
        if (context.isRestricted()) {
            return null;
        }
        return cso.b(context, resourceId, typedValue, i2, csmVar, true, false);
    }

    public float getFraction(int i, int i2, int i3, float f) {
        return this.mWrapped.getFraction(i, i2, i3, f);
    }

    public int getIndex(int i) {
        return this.mWrapped.getIndex(i);
    }

    public int getIndexCount() {
        return this.mWrapped.getIndexCount();
    }

    public int getInt(int i, int i2) {
        return this.mWrapped.getInt(i, i2);
    }

    public int getInteger(int i, int i2) {
        return this.mWrapped.getInteger(i, i2);
    }

    public int getLayoutDimension(int i, int i2) {
        return this.mWrapped.getLayoutDimension(i, i2);
    }

    public String getNonResourceString(int i) {
        return this.mWrapped.getNonResourceString(i);
    }

    public String getPositionDescription() {
        return this.mWrapped.getPositionDescription();
    }

    public int getResourceId(int i, int i2) {
        return this.mWrapped.getResourceId(i, i2);
    }

    public Resources getResources() {
        return this.mWrapped.getResources();
    }

    public String getString(int i) {
        return this.mWrapped.getString(i);
    }

    public CharSequence getText(int i) {
        return this.mWrapped.getText(i);
    }

    public CharSequence[] getTextArray(int i) {
        return this.mWrapped.getTextArray(i);
    }

    public int getType(int i) {
        return Api21Impl.getType(this.mWrapped, i);
    }

    public boolean getValue(int i, TypedValue typedValue) {
        return this.mWrapped.getValue(i, typedValue);
    }

    public TypedArray getWrappedTypeArray() {
        return this.mWrapped;
    }

    public boolean hasValue(int i) {
        return this.mWrapped.hasValue(i);
    }

    public int length() {
        return this.mWrapped.length();
    }

    public TypedValue peekValue(int i) {
        return this.mWrapped.peekValue(i);
    }

    public void recycle() {
        this.mWrapped.recycle();
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public int getLayoutDimension(int i, String str) {
        return this.mWrapped.getLayoutDimension(i, str);
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
