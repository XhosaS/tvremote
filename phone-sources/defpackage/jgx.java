package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgx extends sca {
    public View a;
    public View b;
    public View c;

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.purchase_actions_spacer);
            try {
                this.b = p(R.id.watch_actions_spacer);
                try {
                    this.c = p(R.id.companion_cast_disclaimer);
                } catch (scr unused) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_cast_disclaimer", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
                }
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "watch_actions_spacer", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        } catch (scr unused3) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "purchase_actions_spacer", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
        }
    }
}
