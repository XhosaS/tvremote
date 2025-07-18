package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abu extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public abu(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        abv abvVar = new abv();
        abvVar.e = this.a.newDrawable();
        abvVar.e.setCallback(abvVar.d);
        return abvVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        abv abvVar = new abv();
        abvVar.e = this.a.newDrawable(resources);
        abvVar.e.setCallback(abvVar.d);
        return abvVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        abv abvVar = new abv();
        abvVar.e = this.a.newDrawable(resources, theme);
        abvVar.e.setCallback(abvVar.d);
        return abvVar;
    }
}
