package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kch extends xch {
    public kcn a;
    public ihg b;
    public kdh c;

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, yfo] */
    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = getLayoutInflater().inflate(R.layout.managed_services_page_view_layout, viewGroup, false);
        ((RecyclerView) viewInflate.findViewById(R.id.recycler_view)).addItemDecoration(new kcg());
        kdh kdhVar = this.c;
        ihg ihgVar = null;
        if (kdhVar == null) {
            yks.c("viewModelFactory");
            kdhVar = null;
        }
        kcl kclVar = ((kcs) new dxa(this, new kfj(kdhVar.a.b(), 1)).a(kcs.class)).a;
        ihg ihgVar2 = this.b;
        if (ihgVar2 == null) {
            yks.c("bc25FlagsManager");
        } else {
            ihgVar = ihgVar2;
        }
        if (ihgVar.e()) {
            View viewFindViewById = viewInflate.findViewById(R.id.nav);
            View viewFindViewById2 = viewInflate.findViewById(R.id.stream_view);
            int i = igw.a;
            viewFindViewById.setBackgroundColor(igw.b);
            viewFindViewById2.setBackgroundColor(igw.a);
        }
        sfy.q(this, new bg(this, kclVar, viewInflate, 19, (char[]) null));
        return viewInflate;
    }
}
