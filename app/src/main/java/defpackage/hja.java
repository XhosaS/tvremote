package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hja extends azm {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/discovery/DiscoveryItemPresenter");

    @Override // defpackage.azm
    public final azk q(ViewGroup viewGroup) {
        return new hiz(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.discovery_item, viewGroup, false));
    }

    @Override // defpackage.azm
    public final void s(azk azkVar, Object obj) {
        if (!(obj instanceof hiy)) {
            ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/results/discovery/DiscoveryItemPresenter", "onBindViewHolder", 58, "DiscoveryItemPresenter.java")).x("Wrong use of the item %s", obj);
        } else {
            ((hiz) azkVar).c = (hiy) obj;
            throw null;
        }
    }

    @Override // defpackage.azm
    public final void u(azk azkVar) {
        hiz hizVar = (hiz) azkVar;
        hizVar.c = null;
        hizVar.b.removeAllViews();
    }
}
