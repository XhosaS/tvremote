package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class ekx {
    static final Drawable a;
    protected static final ColorStateList b;
    protected static final ColorStateList c;
    static final CharSequence d;
    static final CharSequence e;
    protected static final Drawable f;
    protected static final Typeface g;
    protected static final MovementMethod h;
    public static final /* synthetic */ int i = 0;
    private static final Rect j;
    private static final InputFilter[] k;

    static {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        a = colorDrawable;
        b = ColorStateList.valueOf(-16777216);
        c = ColorStateList.valueOf(-3355444);
        d = "";
        e = "";
        f = colorDrawable;
        g = Typeface.DEFAULT;
        h = ArrowKeyMovementMethod.getInstance();
        j = new Rect();
        k = new InputFilter[0];
    }

    static Drawable a(dru druVar, Drawable drawable) {
        if (drawable != a) {
            return drawable;
        }
        TypedArray typedArrayObtainStyledAttributes = druVar.a.obtainStyledAttributes(null, new int[]{R.attr.background}, R.attr.editTextStyle, 0);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable2;
    }

    static void b(dru druVar, EditText editText, CharSequence charSequence, Drawable drawable, ColorStateList colorStateList, ColorStateList colorStateList2, Integer num, int i2, Typeface typeface, int i3, int i4, boolean z, int i5, int i6, int i7, List list, boolean z2, TextUtils.TruncateAt truncateAt, int i8, MovementMethod movementMethod, CharSequence charSequence2, boolean z3, int i9) {
        int i10;
        if (i2 == -1) {
            editText.setTextSize(2, 14.0f);
        } else {
            editText.setTextSize(0, i2);
        }
        if (z2) {
            i10 = i5 | 131073;
            editText.setMinLines(1);
            editText.setMaxLines(i8);
        } else {
            i10 = i5 & (-131073);
            editText.setLines(1);
        }
        if (true != z) {
            i10 = 0;
        }
        if (i6 != 0) {
            editText.setRawInputType(i6);
        } else if (i10 != editText.getInputType()) {
            editText.setInputType(i10);
        }
        if (list != null) {
            editText.setFilters((InputFilter[]) list.toArray(new InputFilter[list.size()]));
        } else {
            editText.setFilters(k);
        }
        editText.setHint(charSequence);
        editText.setBackground(drawable);
        if (drawable == null || !drawable.getPadding(j)) {
            editText.setPadding(0, 0, 0, 0);
        }
        editText.setShadowLayer(0.0f, 0.0f, 0.0f, -7829368);
        editText.setTypeface(typeface, 0);
        editText.setGravity(i4);
        editText.setFocusable(z);
        editText.setFocusableInTouchMode(z);
        editText.setLongClickable(z);
        editText.setCursorVisible(z);
        editText.setTextColor(colorStateList);
        editText.setHintTextColor(colorStateList2);
        if (num != null) {
            editText.setHighlightColor(num.intValue());
        }
        editText.setMovementMethod(movementMethod);
        int imeOptions = editText.getImeOptions();
        editText.setImeOptions(i7);
        if (imeOptions != i7) {
            ((InputMethodManager) druVar.a.getSystemService("input_method")).restartInput(editText);
        }
        editText.setError(null, null);
        editText.setEllipsize(truncateAt);
        editText.setTextAlignment(i3);
        if (charSequence2 != null && !Objects.equals(editText.getText().toString(), charSequence2.toString())) {
            editText.setText(charSequence2);
            if (!z3) {
                editText.setSelection(editText.getText().toString().length());
            }
        }
        if (i9 != 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
            if (Build.VERSION.SDK_INT >= 29) {
                Drawable textCursorDrawable = editText.getTextCursorDrawable();
                textCursorDrawable.setColorFilter(porterDuffColorFilter);
                editText.setTextCursorDrawable(textCursorDrawable);
            } else {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    int i11 = declaredField.getInt(editText);
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(editText);
                    Drawable drawable2 = editText.getContext().getDrawable(i11);
                    drawable2.setColorFilter(porterDuffColorFilter);
                    Drawable[] drawableArr = {drawable2, drawable2};
                    Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj, drawableArr);
                } catch (Exception unused) {
                }
            }
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i9);
            int[] iArr = ahj.a;
            ahc.h(editText, colorStateListValueOf);
        }
    }
}
