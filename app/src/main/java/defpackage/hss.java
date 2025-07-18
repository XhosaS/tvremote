package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hss extends azm {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/stickeritem/StickerItemPresenter");

    @Override // defpackage.azm
    public final azk q(ViewGroup viewGroup) {
        return new hsr(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_item, viewGroup, false));
    }

    @Override // defpackage.azm
    public final void s(azk azkVar, Object obj) {
        if (!(obj instanceof hsq)) {
            ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/results/stickeritem/StickerItemPresenter", "onBindViewHolder", 61, "StickerItemPresenter.java")).x("Wrong use of the item %s", obj);
        } else {
            ((hsr) azkVar).b = (hsq) obj;
            throw null;
        }
    }

    @Override // defpackage.azm
    public final void u(azk azkVar) {
        ((hsr) azkVar).b = null;
    }
}
