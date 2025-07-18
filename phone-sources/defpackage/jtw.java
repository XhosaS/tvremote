package defpackage;

import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtw extends sca {
    public MaterialCheckBox a;

    public final MaterialCheckBox a() {
        MaterialCheckBox materialCheckBox = this.a;
        if (materialCheckBox != null) {
            return materialCheckBox;
        }
        yks.c("checkbox");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.selectionitem.SelectionItemViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (MaterialCheckBox) p(R.id.checkbox);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "checkbox", "com.google.android.apps.googletv.app.presentation.components.selectionitem.SelectionItemViewBindable"));
        }
    }
}
