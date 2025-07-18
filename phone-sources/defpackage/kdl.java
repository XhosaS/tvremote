package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdl extends sca {
    public View a;
    public TextView b;

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.provider_selection_menu_layout);
            try {
                this.b = (TextView) p(R.id.title_text);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title_text", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "provider_selection_menu_layout", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuViewBindable"));
        }
    }
}
