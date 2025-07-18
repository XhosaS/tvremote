package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class htb implements hnv, hns {
    protected final Drawable a;

    public htb(Drawable drawable) {
        hju.p(drawable);
        this.a = drawable;
    }

    @Override // defpackage.hns
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof hti) {
            ((hti) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.hnv
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
