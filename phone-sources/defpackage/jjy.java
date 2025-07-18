package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjy extends sca {
    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.providerselection.ProviderSelectionViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            p(R.id.provider_selection_component);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "provider_selection_component", "com.google.android.apps.googletv.app.presentation.components.entity.providerselection.ProviderSelectionViewBindable"));
        }
    }
}
