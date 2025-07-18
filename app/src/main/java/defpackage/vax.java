package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vax extends ly {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public vax(Context context, AttributeSet attributeSet) {
        super(vdc.a(context, attributeSet, com.google.android.katniss.R.attr.radioButtonStyle, com.google.android.katniss.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayC = vam.c(context2, attributeSet, vay.a, com.google.android.katniss.R.attr.radioButtonStyle, com.google.android.katniss.R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        if (typedArrayC.hasValue(0)) {
            setButtonTintList(vba.a(context2, typedArrayC, 0));
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
                int iA = uzt.a(this, com.google.android.katniss.R.attr.colorControlActivated);
                int iA2 = uzt.a(this, com.google.android.katniss.R.attr.colorOnSurface);
                int iA3 = uzt.a(this, com.google.android.katniss.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{uzt.b(iA3, iA, 1.0f), uzt.b(iA3, iA2, 0.54f), uzt.b(iA3, iA2, 0.38f), uzt.b(iA3, iA2, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }
}
