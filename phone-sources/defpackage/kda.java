package defpackage;

import android.widget.CheckBox;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kda extends sca {
    public CheckBox a;

    public final CheckBox a() {
        CheckBox checkBox = this.a;
        if (checkBox != null) {
            return checkBox;
        }
        yks.c("checkbox");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferenceViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (CheckBox) p(R.id.checkbox);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "checkbox", "com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferenceViewBindable"));
        }
    }
}
