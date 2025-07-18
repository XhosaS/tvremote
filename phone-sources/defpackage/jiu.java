package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiu extends sca {
    public SwitchCompat a;
    public View b;

    public final SwitchCompat a() {
        SwitchCompat switchCompat = this.a;
        if (switchCompat != null) {
            return switchCompat;
        }
        yks.c("switchView");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.familylibrary.FamilyLibraryViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (SwitchCompat) p(R.id.family_library_switch);
            try {
                this.b = p(R.id.add_more_card);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "add_more_card", "com.google.android.apps.googletv.app.presentation.components.entity.familylibrary.FamilyLibraryViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "family_library_switch", "com.google.android.apps.googletv.app.presentation.components.entity.familylibrary.FamilyLibraryViewBindable"));
        }
    }
}
