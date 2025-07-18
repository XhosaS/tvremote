package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acd extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public acd(Drawable.ConstantState constantState) {
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
        ace aceVar = new ace();
        aceVar.e = (VectorDrawable) this.a.newDrawable();
        return aceVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        ace aceVar = new ace();
        aceVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return aceVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        ace aceVar = new ace();
        aceVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return aceVar;
    }
}
