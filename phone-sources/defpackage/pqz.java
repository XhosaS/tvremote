package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqz {
    public final int c;
    public final pqw d;
    private final int g;
    private final int h;
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public boolean e = false;
    public int f = 0;

    public pqz(pqw pqwVar) {
        this.d = pqwVar;
        Resources resources = pqwVar.getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_text_max_width);
        this.g = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_text_horizontal_offset);
        this.c = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_text_vertical_offset);
    }

    public final int a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = i4 - i;
        int i6 = i2 - i4;
        int i7 = i4 - (i3 / 2);
        int i8 = i5 <= i6 ? i7 + this.g : i7 - this.g;
        return i8 - marginLayoutParams.leftMargin < i ? i + marginLayoutParams.leftMargin : (i8 + i3) + marginLayoutParams.rightMargin > i2 ? (i2 - i3) - marginLayoutParams.rightMargin : i8;
    }

    public final void b(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.min((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, this.h), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }
}
