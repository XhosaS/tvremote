package com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import defpackage.bg;
import defpackage.dxa;
import defpackage.hju;
import defpackage.jzo;
import defpackage.kdf;
import defpackage.kdg;
import defpackage.kdh;
import defpackage.kdi;
import defpackage.kdj;
import defpackage.kdk;
import defpackage.kdm;
import defpackage.kds;
import defpackage.pke;
import defpackage.pkg;
import defpackage.pnr;
import defpackage.sfg;
import defpackage.sfy;
import defpackage.vvj;
import defpackage.wae;
import defpackage.wll;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;
import defpackage.ygi;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ProviderSelectionMenuFragment extends sfg implements xce {
    public xcd<Object> childFragmentInjector;
    public pnr dialogVisualElement;
    public kdh pageViewModelFactoryFactory;
    public kdj providerSelectionMenuModelFactory;
    public kdk providerSelectionMenuPresenter;
    public pke viewVisualElements;
    public pkg visualElements;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ygi onCreateReplayDialogView$lambda$0(ProviderSelectionMenuFragment providerSelectionMenuFragment, kdi kdiVar, View view) {
        kdm kdmVar = (kdm) providerSelectionMenuFragment.getProviderSelectionMenuPresenter().l(kdiVar);
        view.getClass();
        sfy.l(providerSelectionMenuFragment, view).a(kdmVar);
        return ygi.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateReplayDialogView$lambda$1(ProviderSelectionMenuFragment providerSelectionMenuFragment, Dialog dialog, View view) {
        providerSelectionMenuFragment.getViewVisualElements().e(view, providerSelectionMenuFragment.getVisualElements().a(109942));
    }

    @Override // defpackage.xce
    public xby<Object> androidInjector() {
        return getChildFragmentInjector();
    }

    public final xcd<Object> getChildFragmentInjector() {
        xcd<Object> xcdVar = this.childFragmentInjector;
        if (xcdVar != null) {
            return xcdVar;
        }
        yks.c("childFragmentInjector");
        return null;
    }

    public final pnr getDialogVisualElement() {
        pnr pnrVar = this.dialogVisualElement;
        if (pnrVar != null) {
            return pnrVar;
        }
        yks.c("dialogVisualElement");
        return null;
    }

    public final kdh getPageViewModelFactoryFactory() {
        kdh kdhVar = this.pageViewModelFactoryFactory;
        if (kdhVar != null) {
            return kdhVar;
        }
        yks.c("pageViewModelFactoryFactory");
        return null;
    }

    public final kdj getProviderSelectionMenuModelFactory() {
        kdj kdjVar = this.providerSelectionMenuModelFactory;
        if (kdjVar != null) {
            return kdjVar;
        }
        yks.c("providerSelectionMenuModelFactory");
        return null;
    }

    public final kdk getProviderSelectionMenuPresenter() {
        kdk kdkVar = this.providerSelectionMenuPresenter;
        if (kdkVar != null) {
            return kdkVar;
        }
        yks.c("providerSelectionMenuPresenter");
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

    @Override // defpackage.bl, defpackage.bv
    public void onAttach(Context context) {
        context.getClass();
        wae.x(this);
        super.onAttach(context);
    }

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        allowCollapseBottomSheet(false);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yfo] */
    @Override // defpackage.sfg
    public View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.provider_selection_bottomsheet_view_layout, viewGroup, false);
        Bundle arguments = getArguments();
        arguments.getClass();
        wll wllVar = wll.a;
        wllVar.getClass();
        vvj vvjVarH = hju.H(arguments, "entity_id", wllVar);
        vvjVarH.getClass();
        Bundle arguments2 = getArguments();
        arguments2.getClass();
        String string = arguments2.getString("provider_selection_menu_title");
        string.getClass();
        Bundle arguments3 = getArguments();
        arguments3.getClass();
        kds kdsVar = kds.a;
        kdsVar.getClass();
        vvj vvjVarH2 = hju.H(arguments3, "provider_selection_menu_header", kdsVar);
        vvjVarH2.getClass();
        sfy.q(this, new bg(this, ((kdf) new dxa(this, new kdg((kdj) getPageViewModelFactoryFactory().a.b(), string, (wll) vvjVarH, (kds) vvjVarH2)).a(kdf.class)).a, viewInflate, 20, (char[]) null));
        getDialogVisualElement().a(this, getDialog(), new jzo(this, 2));
        viewInflate.getClass();
        return viewInflate;
    }

    public final void setChildFragmentInjector(xcd<Object> xcdVar) {
        xcdVar.getClass();
        this.childFragmentInjector = xcdVar;
    }

    public final void setDialogVisualElement(pnr pnrVar) {
        pnrVar.getClass();
        this.dialogVisualElement = pnrVar;
    }

    public final void setPageViewModelFactoryFactory(kdh kdhVar) {
        kdhVar.getClass();
        this.pageViewModelFactoryFactory = kdhVar;
    }

    public final void setProviderSelectionMenuModelFactory(kdj kdjVar) {
        kdjVar.getClass();
        this.providerSelectionMenuModelFactory = kdjVar;
    }

    public final void setProviderSelectionMenuPresenter(kdk kdkVar) {
        kdkVar.getClass();
        this.providerSelectionMenuPresenter = kdkVar;
    }

    public final void setViewVisualElements(pke pkeVar) {
        pkeVar.getClass();
        this.viewVisualElements = pkeVar;
    }

    public final void setVisualElements(pkg pkgVar) {
        pkgVar.getClass();
        this.visualElements = pkgVar;
    }
}
