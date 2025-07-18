package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.TintTypedArray;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcw extends LinearLayout {
    public final TextView a;
    public CharSequence b;
    public final CheckableImageButton c;
    private final TextInputLayout d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private int g;
    private boolean h;

    public tcw(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.c = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.a = appCompatTextView;
        if (sin.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        h();
        i();
        int[] iArr = tcv.a;
        if (tintTypedArray.hasValue(70)) {
            this.e = sin.i(getContext(), tintTypedArray, 70);
        }
        if (tintTypedArray.hasValue(71)) {
            this.f = a.ae(tintTypedArray.getInt(71, -1), null);
        }
        if (tintTypedArray.hasValue(67)) {
            Drawable drawable = tintTypedArray.getDrawable(67);
            checkableImageButton.setImageDrawable(drawable);
            if (drawable != null) {
                ssr.t(textInputLayout, checkableImageButton, this.e, this.f);
                e(true);
                c();
            } else {
                e(false);
                h();
                i();
                d(null);
            }
            if (tintTypedArray.hasValue(66)) {
                d(tintTypedArray.getText(66));
            }
            checkableImageButton.a(tintTypedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = tintTypedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.g) {
            this.g = dimensionPixelSize;
            ssr.v(checkableImageButton, dimensionPixelSize);
        }
        if (tintTypedArray.hasValue(69)) {
            checkableImageButton.setScaleType(ssr.s(tintTypedArray.getInt(69, -1)));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(tintTypedArray.getResourceId(61, 0));
        if (tintTypedArray.hasValue(62)) {
            appCompatTextView.setTextColor(tintTypedArray.getColorStateList(62));
        }
        CharSequence text = tintTypedArray.getText(60);
        this.b = true != TextUtils.isEmpty(text) ? text : null;
        appCompatTextView.setText(text);
        j();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private final void j() {
        int i = 0;
        int i2 = (this.b == null || this.h) ? 8 : 0;
        if (this.c.getVisibility() != 0 && i2 != 0) {
            i = 8;
        }
        setVisibility(i);
        this.a.setVisibility(i2);
        this.d.A();
    }

    public final int a() {
        int measuredWidth;
        if (g()) {
            CheckableImageButton checkableImageButton = this.c;
            measuredWidth = checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd();
        } else {
            measuredWidth = 0;
        }
        return getPaddingStart() + this.a.getPaddingStart() + measuredWidth;
    }

    public final void b(boolean z) {
        this.h = z;
        j();
    }

    public final void c() {
        ssr.u(this.d, this.c, this.e);
    }

    final void d(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    final void e(boolean z) {
        if (g() != z) {
            this.c.setVisibility(true != z ? 8 : 0);
            f();
            j();
        }
    }

    final void f() {
        EditText editText = this.d.c;
        if (editText == null) {
            return;
        }
        this.a.setPaddingRelative(g() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    final boolean g() {
        return this.c.getVisibility() == 0;
    }

    final void h() {
        ssr.w(this.c, null);
    }

    final void i() {
        ssr.x(this.c);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        f();
    }
}
