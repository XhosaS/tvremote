package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glg extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public glg(Drawable.ConstantState constantState) {
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
        glh glhVar = new glh();
        glhVar.e = (VectorDrawable) this.a.newDrawable();
        return glhVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        glh glhVar = new glh();
        glhVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return glhVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        glh glhVar = new glh();
        glhVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return glhVar;
    }
}
