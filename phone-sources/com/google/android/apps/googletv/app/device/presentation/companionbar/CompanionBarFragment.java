package com.google.android.apps.googletv.app.device.presentation.companionbar;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.videos.R;
import defpackage.bhq;
import defpackage.gag;
import defpackage.gp;
import defpackage.grq;
import defpackage.gz;
import defpackage.hiq;
import defpackage.idr;
import defpackage.idz;
import defpackage.igy;
import defpackage.ihg;
import defpackage.ivd;
import defpackage.ivj;
import defpackage.jan;
import defpackage.kiq;
import defpackage.kpp;
import defpackage.kuw;
import defpackage.sfy;
import defpackage.xch;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CompanionBarFragment extends xch {
    public ivd a;
    public ihg b;
    public kiq c;
    public View d;
    public jan h;
    public kuw i;
    public gag j;
    private boolean k;
    private boolean l = true;
    public final idr e = new idz(new ivj((byte[]) null));
    public final gp f = registerForActivityResult(new gz(), new hiq(this, 5));
    public final idr g = new idz(0);

    public final ihg a() {
        ihg ihgVar = this.b;
        if (ihgVar != null) {
            return ihgVar;
        }
        yks.c("bc25FlagsManager");
        return null;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (a().d()) {
            Context contextRequireContext = requireContext();
            boolean z = contextRequireContext.getResources().getConfiguration().orientation == 2;
            ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
            composeView.i();
            composeView.b(new bhq(746285267, true, new kpp(z, this, contextRequireContext, 1)));
            return composeView;
        }
        this.d = layoutInflater.inflate(R.layout.companion_bar_fragment_layout, viewGroup);
        int i = igy.a;
        View view = this.d;
        if (view == null) {
            yks.c("fragmentView");
            view = null;
        }
        igy.a(view, this.g);
        this.k = false;
        this.l = false;
        View view2 = this.d;
        if (view2 != null) {
            return view2;
        }
        yks.c("fragmentView");
        return null;
    }

    @Override // defpackage.bv
    public final void onPause() {
        super.onPause();
        this.k = true;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [idr, java.lang.Object] */
    @Override // defpackage.bv
    public final void onResume() {
        super.onResume();
        if (a().d()) {
            return;
        }
        if (!this.l) {
            sfy.q(this, new grq(this, 14));
            this.l = true;
        }
        View view = this.d;
        gag gagVar = null;
        if (view == null) {
            yks.c("fragmentView");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.companion_bar_view);
        View view2 = this.d;
        if (view2 == null) {
            yks.c("fragmentView");
            view2 = null;
        }
        View viewFindViewById2 = view2.findViewById(R.id.companion_bar_container);
        if (this.k) {
            viewFindViewById2.getClass();
            if (viewFindViewById2.getVisibility() == 0) {
                gag gagVar2 = this.j;
                if (gagVar2 == null) {
                    yks.c("mediaDeviceUiController");
                } else {
                    gagVar = gagVar2;
                }
                gagVar.b.c(Integer.valueOf(viewFindViewById.getHeight()));
            }
        }
    }
}
