package com.google.android.apps.googletv.app.presentation.pages.purchase;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import defpackage.bck;
import defpackage.dvb;
import defpackage.ihg;
import defpackage.iym;
import defpackage.iyn;
import defpackage.iyq;
import defpackage.jej;
import defpackage.jxj;
import defpackage.jzx;
import defpackage.kbl;
import defpackage.kdw;
import defpackage.kdx;
import defpackage.kja;
import defpackage.sfy;
import defpackage.wae;
import defpackage.yft;
import defpackage.ygi;
import defpackage.yih;
import defpackage.ykl;
import defpackage.ykr;
import defpackage.yks;
import defpackage.ylg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PrePurchaseBottomSheetFragment extends jxj {
    public static final kdw Companion = new kdw();
    public static final String TAG = "pre-purchase-fragment";
    public ihg bc25FlagsManager;
    public kja dynamicColorViewModel;
    public iyn streamPagePresenter;
    private final yft viewModel$delegate;

    public PrePurchaseBottomSheetFragment() {
        int i = ylg.a;
        this.viewModel$delegate = new jej(new ykl(kdx.class), new bck(this, 12), this);
    }

    private final kdx getViewModel() {
        return (kdx) this.viewModel$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ygi onCreateDialogView$lambda$0(PrePurchaseBottomSheetFragment prePurchaseBottomSheetFragment, View view) {
        iyn streamPagePresenter = prePurchaseBottomSheetFragment.getStreamPagePresenter();
        Object objA = prePurchaseBottomSheetFragment.getViewModel().d.a();
        objA.getClass();
        iyq iyqVar = (iyq) streamPagePresenter.l((iym) objA);
        view.getClass();
        sfy.l(prePurchaseBottomSheetFragment, view).a(iyqVar);
        return ygi.a;
    }

    public final ihg getBc25FlagsManager() {
        ihg ihgVar = this.bc25FlagsManager;
        if (ihgVar != null) {
            return ihgVar;
        }
        yks.c("bc25FlagsManager");
        return null;
    }

    public final kja getDynamicColorViewModel() {
        kja kjaVar = this.dynamicColorViewModel;
        if (kjaVar != null) {
            return kjaVar;
        }
        yks.c("dynamicColorViewModel");
        return null;
    }

    public final iyn getStreamPagePresenter() {
        iyn iynVar = this.streamPagePresenter;
        if (iynVar != null) {
            return iynVar;
        }
        yks.c("streamPagePresenter");
        return null;
    }

    @Override // defpackage.jxj, defpackage.bl, defpackage.bv
    public void onAttach(Context context) {
        context.getClass();
        wae.x(this);
        super.onAttach(context);
    }

    @Override // defpackage.jxj
    public View onCreateDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.stream_page_bottomsheet_layout, viewGroup);
        if (getBc25FlagsManager().a()) {
            ykr.q(dvb.d(this), null, 0, new kbl(this, viewInflate, (yih) null, 4), 3);
        }
        sfy.q(this, new jzx(this, viewInflate, 9));
        viewInflate.getClass();
        return viewInflate;
    }

    public final void setBc25FlagsManager(ihg ihgVar) {
        ihgVar.getClass();
        this.bc25FlagsManager = ihgVar;
    }

    public final void setDynamicColorViewModel(kja kjaVar) {
        kjaVar.getClass();
        this.dynamicColorViewModel = kjaVar;
    }

    public final void setStreamPagePresenter(iyn iynVar) {
        iynVar.getClass();
        this.streamPagePresenter = iynVar;
    }
}
