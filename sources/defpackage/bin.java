package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bin extends abq {
    final /* synthetic */ biq b;

    public bin(biq biqVar) {
        this.b = biqVar;
    }

    @Override // defpackage.abq
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.abq
    public final void c(Drawable drawable) {
        biq biqVar = this.b;
        ColorStateList colorStateList = biqVar.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(biqVar.d, colorStateList.getDefaultColor()));
        }
    }
}
