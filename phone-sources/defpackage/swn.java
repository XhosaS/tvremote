package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swn extends svw {
    public swn(Context context) {
        super(context);
    }

    @Override // defpackage.svw
    protected final int a() {
        return R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // defpackage.svw
    protected final int b() {
        return R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }
}
