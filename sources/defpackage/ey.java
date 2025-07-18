package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ey extends fp implements fb {
    final /* synthetic */ fa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(fa faVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = faVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        ii.r(this, getContentDescription());
        setOnTouchListener(new ex(this, this));
    }

    @Override // defpackage.fb
    public final boolean c() {
        return false;
    }

    @Override // defpackage.fb
    public final boolean d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.m();
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
