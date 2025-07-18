package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bwh extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public bwh(Drawable.ConstantState constantState) {
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
        bwi bwiVar = new bwi(null);
        bwiVar.e = this.a.newDrawable();
        bwiVar.e.setCallback(bwiVar.d);
        return bwiVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        bwi bwiVar = new bwi(null);
        bwiVar.e = this.a.newDrawable(resources);
        bwiVar.e.setCallback(bwiVar.d);
        return bwiVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        bwi bwiVar = new bwi(null);
        bwiVar.e = this.a.newDrawable(resources, theme);
        bwiVar.e.setCallback(bwiVar.d);
        return bwiVar;
    }
}
