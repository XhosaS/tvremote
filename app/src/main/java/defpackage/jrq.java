package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrq extends RippleDrawable {
    private static final int[] a = {R.attr.state_pressed};
    private static final int[] b = {R.attr.state_enabled, R.attr.state_pressed};
    private static final int[] c = {R.attr.state_enabled};
    private static final int[] d = {0};

    public jrq(ColorStateList colorStateList, int i) {
        super(colorStateList, null, null);
        setRadius(i);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int length = iArr.length;
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            z |= !(i2 != 16842919);
            z2 |= !(i2 != 16842910);
        }
        return super.onStateChange((z && z2) ? b : z ? a : z2 ? c : d);
    }
}
