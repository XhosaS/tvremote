package defpackage;

import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class hrk implements exm {
    final /* synthetic */ hrw a;

    public hrk(hrw hrwVar) {
        this.a = hrwVar;
    }

    @Override // defpackage.exm
    public final void a() {
        ((zdv) ((zdv) hrw.aG.c()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment$4", "onStartActivityFailure", 596, "SearchRowsFragment.java")).u("#onItemClicked: cannot start activity for item intent.");
        hrw hrwVar = this.a;
        hrwVar.aS.m(hrwVar.dZ().getResources().getString(R.string.assistant_internal_error));
    }

    @Override // defpackage.exm
    public final void b() {
    }
}
