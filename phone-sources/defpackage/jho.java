package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jho extends sca {
    public MaterialButton a;

    public final MaterialButton a() {
        MaterialButton materialButton = this.a;
        if (materialButton != null) {
            return materialButton;
        }
        yks.c("button");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ElevatedButtonViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (MaterialButton) p(R.id.button);
            try {
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button_annotation", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ElevatedButtonViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ElevatedButtonViewBindable"));
        }
    }
}
