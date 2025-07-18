package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
class nr extends ht {
    public boolean b;

    public nr(Drawable drawable) {
        super(drawable);
        this.b = true;
    }

    @Override // defpackage.ht, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b) {
            this.a.draw(canvas);
        }
    }

    @Override // defpackage.ht, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.b) {
            this.a.setHotspot(f, f2);
        }
    }

    @Override // defpackage.ht, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b) {
            this.a.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // defpackage.ht, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.b) {
            return this.a.setState(iArr);
        }
        return false;
    }

    @Override // defpackage.ht, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
