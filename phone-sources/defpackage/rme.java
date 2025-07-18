package defpackage;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Property;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rme extends AppCompatDialogFragment implements rhv {
    public static final Property a = new rls(Float.class);
    public static final Property b = new rlt(Integer.class);
    public rlp c;
    public boolean d;
    public SparseArray e;
    public rmg f;
    public ExpandableDialogView g;
    public rlz h;
    public tko i;
    private boolean k;
    private rmd l;
    public final rzy j = new rzy(this);
    private final fv m = new rlq(this);

    private static void f(ViewGroup viewGroup, rma rmaVar) {
        viewGroup.removeAllViews();
        viewGroup.addView(rmaVar.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }

    public final void a(rmg rmgVar, View view) {
        sjl.c();
        this.k = true;
        f((ViewGroup) view.findViewById(R.id.og_container_footer), rmgVar.c);
        f((ViewGroup) view.findViewById(R.id.og_header_container), rmgVar.a);
        f((ViewGroup) view.findViewById(R.id.og_container_content_view), rmgVar.b);
        cww.r(view.findViewById(R.id.og_header_close_button), view.getResources().getString(rmgVar.d));
        view.setVisibility(0);
        rmd rmdVar = this.l;
        if (rmdVar != null) {
            rmdVar.a(view);
        }
    }

    public final void b() {
        if (isAdded()) {
            if (isStateSaved()) {
                super.dismissAllowingStateLoss();
            } else {
                super.dismiss();
            }
            rlz rlzVar = this.h;
            if (rlzVar != null) {
                rlzVar.b.a();
            }
        }
    }

    public final void c() {
        ExpandableDialogView expandableDialogView;
        View view;
        rlz rlzVar = this.h;
        if (rlzVar != null && (expandableDialogView = this.g) != null && (view = expandableDialogView.h) != null) {
            rlzVar.d.f(new ntp(5), view);
        }
        dismiss();
    }

    @Override // defpackage.rhv
    public final boolean d() {
        return this.h != null;
    }

    @Override // defpackage.bl
    public final void dismiss() {
        if (getDialog() == null || getDialog().getWindow() == null) {
            b();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getDialog().getWindow().getDecorView(), (Property<View, Float>) a, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(83L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new rlr(this));
        objectAnimatorOfFloat.start();
    }

    public final void e(rmd rmdVar) {
        ExpandableDialogView expandableDialogView;
        this.l = rmdVar;
        if (!this.k || rmdVar == null || (expandableDialogView = this.g) == null) {
            return;
        }
        rmdVar.a(expandableDialogView);
    }

    @Override // defpackage.bv, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ExpandableDialogView expandableDialogView = this.g;
        if (expandableDialogView != null) {
            expandableDialogView.onConfigurationChanged(configuration);
        }
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.OneGoogle_Dialog);
    }

    @Override // android.support.v7.app.AppCompatDialogFragment, defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        ((fm) dialogOnCreateDialog).getOnBackPressedDispatcher().b(this, this.m);
        return dialogOnCreateDialog;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.j.s(new fnc(this, layoutInflater, viewGroup, frameLayout, bundle, 4));
        return frameLayout;
    }

    @Override // defpackage.bv
    public final void onDestroy() {
        super.onDestroy();
        this.i = null;
        this.f = null;
        this.h = null;
        this.l = null;
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onDestroyView() {
        super.onDestroyView();
        rlp rlpVar = this.c;
        if (rlpVar != null) {
            View view = rlpVar.d;
            view.getViewTreeObserver().removeOnScrollChangedListener(rlpVar.b);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(rlpVar.c);
            this.c = null;
        }
        rlz rlzVar = this.h;
        if (rlzVar != null) {
            rlzVar.c.a();
        }
        this.g = null;
        this.k = false;
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.g != null) {
            SparseArray sparseArray = new SparseArray();
            this.e = sparseArray;
            this.g.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("viewHierarchyState", this.e);
        }
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onStart() {
        super.onStart();
        this.d = true;
        tko tkoVar = this.i;
        if (tkoVar != null) {
            tkoVar.e();
        }
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onStop() {
        super.onStop();
        this.d = false;
        tko tkoVar = this.i;
        if (tkoVar != null) {
            tkoVar.f();
        }
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        rrx.aa(view);
        this.j.s(new rvp(this, view, bundle, 1));
    }
}
