package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phk extends bv {
    private static final tvn l = tvn.n("GnpSdk");
    public pfs a;
    public pho c;
    public oyd f;
    public uyv g;
    public pkg i;
    public kwy j;
    public kwy k;
    private boolean m;
    public boolean b = false;
    public boolean d = true;
    public boolean e = false;
    public Boolean h = false;

    public final void a() {
        if (getActivity() == null || getActivity().isFinishing() || !isAdded() || isRemoving()) {
            return;
        }
        oyd oydVar = this.f;
        if (oydVar != null) {
            kwy kwyVar = this.j;
            by activity = getActivity();
            uyr uyrVar = oydVar.c.f;
            if (uyrVar == null) {
                uyrVar = uyr.a;
            }
            View viewO = kwyVar.o(activity, uyrVar.c == 5 ? (uzb) uyrVar.d : uzb.a);
            if (viewO != null) {
                cww.p(viewO, null);
            }
        }
        cr fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            at atVar = new at(fragmentManager);
            atVar.m(this);
            atVar.l();
        }
    }

    @Override // defpackage.bv
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null && !this.b) {
            a();
            return;
        }
        View viewFindViewById = getActivity().findViewById(R.id.content);
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new kag(this, viewFindViewById, 2));
        viewFindViewById.requestLayout();
    }

    @Override // defpackage.bv
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            ((owv) ((yfo) qhj.a(context).ab().get(phk.class)).b()).a(this);
        } catch (Exception e) {
            ((tvk) ((tvk) ((tvk) l.g()).i(e)).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/tooltip/TooltipFragment", "onAttach", '_', "TooltipFragment.java")).s("Failed to inject members.");
        }
    }

    @Override // defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = bundle != null && bundle.getBoolean("showing");
        this.h = Boolean.valueOf(bundle != null && bundle.getBoolean("IS_IMPRESSION_REPORTED"));
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(com.google.android.videos.R.layout.gm_tooltip_fragment, viewGroup);
    }

    @Override // defpackage.bv
    public final void onDestroy() {
        pho phoVar = this.c;
        if (phoVar != null) {
            phoVar.a();
            if (!this.e && !this.m) {
                this.i.i(this.f, uxd.DISMISSED);
            }
        }
        super.onDestroy();
    }

    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("showing", this.b);
        bundle.putBoolean("IS_IMPRESSION_REPORTED", this.h.booleanValue());
        this.m = true;
    }
}
