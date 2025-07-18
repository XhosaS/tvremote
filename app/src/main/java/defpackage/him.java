package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class him extends azm {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/disclaimer/DisclaimerItemPresenter");

    @Override // defpackage.azm
    public final azk q(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.disclaimer_item, viewGroup, false);
        viewInflate.getClass();
        return new hil(viewInflate);
    }

    @Override // defpackage.azm
    public final void s(azk azkVar, Object obj) {
        if (!(obj instanceof hik)) {
            ((zdv) a.c().q("com/google/android/apps/tvsearch/results/disclaimer/DisclaimerItemPresenter", "onBindViewHolder", 30, "DisclaimerItemPresenter.kt")).x("Wrong use of the item %s", obj);
            return;
        }
        hik hikVar = (hik) obj;
        hikVar.getClass();
        ((hil) azkVar).a.setText(hikVar.a);
        paq.c(azkVar.g, hikVar.o());
    }

    @Override // defpackage.azm
    public final void u(azk azkVar) {
    }
}
