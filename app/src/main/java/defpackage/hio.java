package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hio extends huw {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/disclaimer/DisclaimerLabelRowPresenter");

    public hio() {
        this.e = null;
        this.f = false;
    }

    @Override // defpackage.azx
    protected final azw b(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.disclaimer_label_row, viewGroup, false);
        viewInflate.getClass();
        return new hip(viewInflate);
    }

    @Override // defpackage.azx
    protected final void g(azw azwVar, Object obj) {
        obj.getClass();
        if (!(obj instanceof hin)) {
            ((zdv) a.c().q("com/google/android/apps/tvsearch/results/disclaimer/DisclaimerLabelRowPresenter", "onBindRowViewHolder", 40, "DisclaimerLabelRowPresenter.kt")).x("Wrong use of the item %s", obj);
        } else {
            super.g(azwVar, obj);
            ((hip) azwVar).a.setText(((hin) obj).a);
        }
    }

    @Override // defpackage.huw, defpackage.azx
    protected final void z(azw azwVar) {
        super.z(azwVar);
        azwVar.g.setActivated(false);
    }
}
