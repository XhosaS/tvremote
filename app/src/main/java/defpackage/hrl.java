package defpackage;

import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class hrl implements exm {
    final /* synthetic */ hrw a;

    public hrl(hrw hrwVar) {
        this.a = hrwVar;
    }

    @Override // defpackage.exm
    public final void a() {
        ((zdv) ((zdv) hrw.aG.d()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment$5", "onStartActivityFailure", 700, "SearchRowsFragment.java")).u("#onItemLongClicked: cannot start intent to https://tv.google.com.");
        hrw hrwVar = this.a;
        hrwVar.aS.m(hrwVar.dZ().getResources().getString(R.string.assistant_internal_error));
    }

    @Override // defpackage.exm
    public final void b() {
    }
}
