package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfo extends FrameLayout {
    private final int a;
    private final int b;

    public sfo(Context context) {
        super(context);
        setId(R.id.replay_dialog_container);
        this.a = sfy.f(context, R.attr.replayDialogCenteredDialogWidth, getResources().getDimensionPixelSize(R.dimen.replay__replaydialog_centered_dialog_width));
        this.b = sfy.f(context, R.attr.replayDialogCenteredDialogMaxHeight, getResources().getDimensionPixelSize(R.dimen.replay__replaydialog_centered_dialog_max_height));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i3 = point.x;
        int iG = sfy.g(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.replay__replaydialog_horizontal_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.replay__replaydialog_vertical_padding);
        int i4 = i3 - (dimensionPixelSize + dimensionPixelSize);
        int i5 = iG - (dimensionPixelSize2 + dimensionPixelSize2);
        if (sfy.c(getContext())) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(this.a, i4), 1073741824);
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.b, i5), Integer.MIN_VALUE);
        } else if (sfy.h(getContext())) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.b, i5), Integer.MIN_VALUE);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(this.b, i4), 1073741824);
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
    }
}
