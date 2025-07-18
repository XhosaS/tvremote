package com.google.android.apps.googletv.app.presentation.pages.genericstreamdialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import defpackage.bck;
import defpackage.iym;
import defpackage.iyn;
import defpackage.iyq;
import defpackage.jaf;
import defpackage.jej;
import defpackage.jzo;
import defpackage.jzp;
import defpackage.jzx;
import defpackage.pnr;
import defpackage.sfg;
import defpackage.sfy;
import defpackage.wae;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;
import defpackage.yft;
import defpackage.ygi;
import defpackage.ykl;
import defpackage.yks;
import defpackage.ylg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GenericStreamDialogFragment extends sfg implements xce {
    public pnr dialogVisualElement;
    public xcd<Object> injector;
    private final yft pageViewModel$delegate;
    public iyn streamPagePresenter;
    public jaf veLogger;

    public GenericStreamDialogFragment() {
        int i = ylg.a;
        this.pageViewModel$delegate = new jej(new ykl(jzp.class), new bck(this, 8), this);
    }

    private final jzp getPageViewModel() {
        return (jzp) this.pageViewModel$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ygi onCreateReplayDialogView$lambda$0(GenericStreamDialogFragment genericStreamDialogFragment, View view) {
        iyn streamPagePresenter = genericStreamDialogFragment.getStreamPagePresenter();
        Object objA = genericStreamDialogFragment.getPageViewModel().b.a();
        objA.getClass();
        iyq iyqVar = (iyq) streamPagePresenter.l((iym) objA);
        View viewFindViewById = view.findViewById(R.id.generic_stream_page_view);
        viewFindViewById.getClass();
        sfy.l(genericStreamDialogFragment, viewFindViewById).a(iyqVar);
        return ygi.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateReplayDialogView$lambda$1(GenericStreamDialogFragment genericStreamDialogFragment, Dialog dialog, View view) {
        jaf veLogger = genericStreamDialogFragment.getVeLogger();
        view.getClass();
        veLogger.i(view, genericStreamDialogFragment.getPageViewModel().a());
    }

    @Override // defpackage.xce
    public xby<Object> androidInjector() {
        return getInjector();
    }

    public final pnr getDialogVisualElement() {
        pnr pnrVar = this.dialogVisualElement;
        if (pnrVar != null) {
            return pnrVar;
        }
        yks.c("dialogVisualElement");
        return null;
    }

    public final xcd<Object> getInjector() {
        xcd<Object> xcdVar = this.injector;
        if (xcdVar != null) {
            return xcdVar;
        }
        yks.c("injector");
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

    public final jaf getVeLogger() {
        jaf jafVar = this.veLogger;
        if (jafVar != null) {
            return jafVar;
        }
        yks.c("veLogger");
        return null;
    }

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wae.x(this);
        allowCollapseBottomSheet(false);
    }

    @Override // defpackage.sfg
    public View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.generic_stream_dialog_layout, viewGroup, false);
        sfy.q(this, new jzx(this, viewInflate, 1));
        if (getPageViewModel().a().c != 0) {
            getDialogVisualElement().a(this, getDialog(), new jzo(this, i));
        }
        viewInflate.getClass();
        return viewInflate;
    }

    public final void setDialogVisualElement(pnr pnrVar) {
        pnrVar.getClass();
        this.dialogVisualElement = pnrVar;
    }

    public final void setInjector(xcd<Object> xcdVar) {
        xcdVar.getClass();
        this.injector = xcdVar;
    }

    public final void setStreamPagePresenter(iyn iynVar) {
        iynVar.getClass();
        this.streamPagePresenter = iynVar;
    }

    public final void setVeLogger(jaf jafVar) {
        jafVar.getClass();
        this.veLogger = jafVar;
    }
}
