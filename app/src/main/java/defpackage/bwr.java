package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
class bwr extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public bwr(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        bws bwsVar = new bws();
        bwsVar.e = (VectorDrawable) this.a.newDrawable();
        return bwsVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        bws bwsVar = new bws();
        bwsVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return bwsVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        bws bwsVar = new bws();
        bwsVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return bwsVar;
    }
}
