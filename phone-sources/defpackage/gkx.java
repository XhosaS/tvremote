package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkx extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public gkx(Drawable.ConstantState constantState) {
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
        gky gkyVar = new gky();
        gkyVar.e = this.a.newDrawable();
        gkyVar.e.setCallback(gkyVar.d);
        return gkyVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        gky gkyVar = new gky();
        gkyVar.e = this.a.newDrawable(resources);
        gkyVar.e.setCallback(gkyVar.d);
        return gkyVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        gky gkyVar = new gky();
        gkyVar.e = this.a.newDrawable(resources, theme);
        gkyVar.e.setCallback(gkyVar.d);
        return gkyVar;
    }
}
