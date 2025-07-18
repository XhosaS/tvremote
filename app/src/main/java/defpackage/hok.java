package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hok extends hpt {
    private static final zdy f = zdy.h("com/google/android/apps/tvsearch/results/searchgrid/AmatiGridSearchItemDetailPresenter");

    public hok(boolean z, hmb hmbVar, zyg zygVar, zyg zygVar2) {
        super(hmbVar, z, zygVar, zygVar2);
    }

    @Override // defpackage.hpt
    protected final hps b(View view) {
        return new hoj(view, this.c, this.b, this.d, this.e);
    }

    @Override // defpackage.hpt, defpackage.azm
    public final void s(azk azkVar, Object obj) {
        if (!(obj instanceof hkk)) {
            ((zdv) ((zdv) f.c()).q("com/google/android/apps/tvsearch/results/searchgrid/AmatiGridSearchItemDetailPresenter", "onBindViewHolder", 52, "AmatiGridSearchItemDetailPresenter.java")).x("Wrong use of the item %s", obj);
            return;
        }
        hoj hojVar = (hoj) azkVar;
        hkk hkkVar = (hkk) obj;
        hojVar.f(hkkVar);
        paq.c(hojVar.g, hkkVar.o());
    }

    @Override // defpackage.hpt, defpackage.azm
    public final void u(azk azkVar) {
        ((hoj) azkVar).i();
    }
}
