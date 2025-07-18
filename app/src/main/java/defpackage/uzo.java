package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uzo extends bwd {
    final /* synthetic */ uzr b;

    public uzo(uzr uzrVar) {
        this.b = uzrVar;
    }

    @Override // defpackage.bwd
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.a;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.bwd
    public final void c(Drawable drawable) {
        uzr uzrVar = this.b;
        ColorStateList colorStateList = uzrVar.a;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(uzrVar.c, colorStateList.getDefaultColor()));
        }
    }
}
