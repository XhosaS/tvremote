package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hth extends Drawable.ConstantState {
    final htn a;

    public hth(htn htnVar) {
        this.a = htnVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new hti(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new hti(this);
    }
}
