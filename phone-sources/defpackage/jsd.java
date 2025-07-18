package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsd extends sca {
    public View a;
    public final kuw b;

    public jsd() {
        throw null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.newprovidercard.NewProviderCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.dismiss);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "dismiss", "com.google.android.apps.googletv.app.presentation.components.newprovidercard.NewProviderCardViewBindable"));
        }
    }

    public jsd(kuw kuwVar) {
        this.b = kuwVar;
    }
}
