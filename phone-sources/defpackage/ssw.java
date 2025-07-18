package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ssw extends Drawable.ConstantState {
    final /* synthetic */ ssx a;

    public ssw(ssx ssxVar) {
        this.a = ssxVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.a;
    }
}
