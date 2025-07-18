package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqy extends gku {
    final /* synthetic */ MaterialCheckBox b;

    public sqy(MaterialCheckBox materialCheckBox) {
        this.b = materialCheckBox;
    }

    @Override // defpackage.gku
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.a;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.gku
    public final void c(Drawable drawable) {
        MaterialCheckBox materialCheckBox = this.b;
        ColorStateList colorStateList = materialCheckBox.a;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.c, colorStateList.getDefaultColor()));
        }
    }
}
