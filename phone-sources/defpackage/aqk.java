package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqk extends RippleDrawable {
    public bnq a;
    public Integer b;
    private final boolean c;
    private boolean d;

    public aqk(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.c = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.c) {
            this.d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.d;
    }
}
