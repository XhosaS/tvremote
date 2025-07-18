package com.google.android.apps.googletv.app.presentation.pages.entitymenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import defpackage.bck;
import defpackage.iof;
import defpackage.isg;
import defpackage.iym;
import defpackage.iyn;
import defpackage.iyq;
import defpackage.jaf;
import defpackage.jbr;
import defpackage.jej;
import defpackage.jxj;
import defpackage.jzd;
import defpackage.jzo;
import defpackage.pke;
import defpackage.pkg;
import defpackage.pnr;
import defpackage.sfy;
import defpackage.yft;
import defpackage.ygi;
import defpackage.yhb;
import defpackage.yhc;
import defpackage.ykl;
import defpackage.yks;
import defpackage.ylg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EntityMenuFragment extends jxj {
    public pnr dialogVe;
    public iyn streamPagePresenter;
    public jaf veLogger;
    private final yft viewModel$delegate;
    public pke viewVisualElements;
    public pkg visualElements;
    public iof watchActionStore;

    public EntityMenuFragment() {
        int i = ylg.a;
        this.viewModel$delegate = new jej(new ykl(jzd.class), new bck(this, 6), this);
    }

    private final jzd getViewModel() {
        return (jzd) this.viewModel$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialogView$lambda$0(EntityMenuFragment entityMenuFragment, Dialog dialog, View view) {
        entityMenuFragment.getViewVisualElements().e(view, entityMenuFragment.getVisualElements().a(130666));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ygi onCreateDialogView$lambda$1(EntityMenuFragment entityMenuFragment, View view) {
        iyn streamPagePresenter = entityMenuFragment.getStreamPagePresenter();
        Object objA = entityMenuFragment.getViewModel().a.a();
        objA.getClass();
        iyq iyqVar = (iyq) streamPagePresenter.l((iym) objA);
        view.getClass();
        sfy.l(entityMenuFragment, view).a(iyqVar);
        return ygi.a;
    }

    public final pnr getDialogVe() {
        pnr pnrVar = this.dialogVe;
        if (pnrVar != null) {
            return pnrVar;
        }
        yks.c("dialogVe");
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

    public final pke getViewVisualElements() {
        pke pkeVar = this.viewVisualElements;
        if (pkeVar != null) {
            return pkeVar;
        }
        yks.c("viewVisualElements");
        return null;
    }

    public final pkg getVisualElements() {
        pkg pkgVar = this.visualElements;
        if (pkgVar != null) {
            return pkgVar;
        }
        yks.c("visualElements");
        return null;
    }

    public final iof getWatchActionStore() {
        iof iofVar = this.watchActionStore;
        if (iofVar != null) {
            return iofVar;
        }
        yks.c("watchActionStore");
        return null;
    }

    @Override // defpackage.jxj
    public View onCreateDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.stream_page_bottomsheet_layout, viewGroup, false);
        jaf veLogger = getVeLogger();
        viewInflate.getClass();
        veLogger.a(viewInflate, jbr.E(130666, null), yhc.a);
        getDialogVe().a(this, getDialog(), new jzo(this, 1));
        getWatchActionStore().f(getViewModel().a());
        sfy.q(this, new isg(this, viewInflate, 18, null));
        return viewInflate;
    }

    @Override // defpackage.bl, defpackage.bv
    public void onStop() {
        super.onStop();
        jaf veLogger = getVeLogger();
        View view = getView();
        view.getClass();
        veLogger.g(view, yhb.a);
    }

    public final void setDialogVe(pnr pnrVar) {
        pnrVar.getClass();
        this.dialogVe = pnrVar;
    }

    public final void setStreamPagePresenter(iyn iynVar) {
        iynVar.getClass();
        this.streamPagePresenter = iynVar;
    }

    public final void setVeLogger(jaf jafVar) {
        jafVar.getClass();
        this.veLogger = jafVar;
    }

    public final void setViewVisualElements(pke pkeVar) {
        pkeVar.getClass();
        this.viewVisualElements = pkeVar;
    }

    public final void setVisualElements(pkg pkgVar) {
        pkgVar.getClass();
        this.visualElements = pkgVar;
    }

    public final void setWatchActionStore(iof iofVar) {
        iofVar.getClass();
        this.watchActionStore = iofVar;
    }
}
