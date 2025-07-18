package com.google.android.apps.googletv.app.device.presentation.companionbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import defpackage.gp;
import defpackage.gwp;
import defpackage.gz;
import defpackage.hiq;
import defpackage.idr;
import defpackage.idz;
import defpackage.igy;
import defpackage.iof;
import defpackage.isg;
import defpackage.itk;
import defpackage.ivd;
import defpackage.ivj;
import defpackage.sfy;
import defpackage.xch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CompanionBarFullscreenFragment extends xch {
    public itk a;
    public ivd b;
    public iof c;
    public final idr d = new idz(new ivj(new gwp(17)));
    public final gp e = registerForActivityResult(new gz(), new hiq(this, 6));
    public final idr f = new idz(0);

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.companion_bar_fragment_layout, viewGroup);
        View viewFindViewById = viewInflate.findViewById(R.id.companion_bar_container);
        int i = igy.a;
        viewInflate.getClass();
        igy.a(viewInflate, this.f);
        sfy.q(this, new isg(this, viewFindViewById, 3, null));
        return viewInflate;
    }
}
