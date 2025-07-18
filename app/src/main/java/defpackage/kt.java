package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kt extends lu implements kx {
    final /* synthetic */ kw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(kw kwVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = kwVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new ks(this, this));
    }

    @Override // defpackage.kx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.kx
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.p();
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
