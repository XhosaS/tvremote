package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjp extends ft {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public bjp(Context context, AttributeSet attributeSet) {
        super(blh.a(context, attributeSet, com.google.android.tv.remote.service.R.attr.radioButtonStyle, com.google.android.tv.remote.service.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayC = bjj.c(context2, attributeSet, bjq.a, com.google.android.tv.remote.service.R.attr.radioButtonStyle, com.google.android.tv.remote.service.R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        if (typedArrayC.hasValue(0)) {
            setButtonTintList(xo.f(context2, typedArrayC, 0));
        }
        this.c = typedArrayC.getBoolean(1, false);
        typedArrayC.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                int iC = bit.c(this, com.google.android.tv.remote.service.R.attr.colorControlActivated);
                int iC2 = bit.c(this, com.google.android.tv.remote.service.R.attr.colorOnSurface);
                int iC3 = bit.c(this, com.google.android.tv.remote.service.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{bit.d(iC3, iC, 1.0f), bit.d(iC3, iC2, 0.54f), bit.d(iC3, iC2, 0.38f), bit.d(iC3, iC2, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }
}
