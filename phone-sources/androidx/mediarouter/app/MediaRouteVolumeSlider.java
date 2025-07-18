package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
class MediaRouteVolumeSlider extends AppCompatSeekBar {
    private final float a;
    private boolean b;
    private Drawable c;
    private int d;
    private int e;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    @Override // android.support.v7.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.a * 255.0f);
        this.c.setColorFilter(this.d, PorterDuff.Mode.SRC_IN);
        this.c.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.e, PorterDuff.Mode.SRC_IN);
            progressDrawable = drawableFindDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.d, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    public void setColor(int i) {
        setColor(i, i);
    }

    public void setHideThumb(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        super.setThumb(z ? null : this.c);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.c = drawable;
        if (this.b) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.seekBarStyle);
    }

    public void setColor(int i, int i2) {
        if (this.d != i) {
            if (Color.alpha(i) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #".concat(String.valueOf(Integer.toHexString(i))));
            }
            this.d = i;
        }
        if (this.e != i2) {
            if (Color.alpha(i2) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #".concat(String.valueOf(Integer.toHexString(i2))));
            }
            this.e = i2;
        }
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = MediaRouterThemeHelper.a(context);
    }
}
