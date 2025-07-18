package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxr extends AppCompatDialogFragment implements rhv {
    public static final String a;
    public qyb b;
    public qyf c;
    public qxm d;
    public qyc e;
    public yqe f;
    public gp g;
    public final qxr h;
    public qyn i;
    public final rzy j;
    private final yft k;

    static {
        String name = qxv.class.getName();
        name.getClass();
        a = name;
    }

    public qxr() {
        yft yftVarG = ybn.g(3, new bck(new bck(this, 16), 17));
        int i = ylg.a;
        this.k = new dwv(new ykl(qxo.class), new bck(yftVarG, 18), new kfd(this, yftVarG, 2), new bck(yftVarG, 19));
        this.j = new rzy(this);
        this.h = this;
        new qxq(this);
    }

    public final qxo a() {
        return (qxo) this.k.a();
    }

    public final qyb b() {
        qyb qybVar = this.b;
        if (qybVar != null) {
            return qybVar;
        }
        yks.c("fragmentInjectables");
        return null;
    }

    public final yqe c(ray rayVar, qyf qyfVar) {
        qxo qxoVarA = a();
        qyc qycVar = this.e;
        if (qycVar == null) {
            yks.c("fragmentScopedData");
            qycVar = null;
        }
        qyfVar.getClass();
        qycVar.getClass();
        if (qxoVarA.c == null) {
            qyk qykVar = qycVar.a;
            qxoVarA.c = new qyh(qykVar.n, qykVar.b, (ulo) qykVar.o.a);
        }
        qyk qykVar2 = qycVar.a;
        qyh qyhVar = qxoVarA.c;
        if (qyhVar == null) {
            yks.c("persistentObjects");
            qyhVar = null;
        }
        xzg xzgVar = qykVar2.o;
        xzgVar.a = qyhVar.c;
        yqe yqeVar = qxoVarA.b;
        if (yqeVar != null) {
            yqeVar.t(null);
        }
        qyh qyhVar2 = qxoVarA.c;
        if (qyhVar2 == null) {
            yks.c("persistentObjects");
            qyhVar2 = null;
        }
        rdd rddVar = qyhVar2.b;
        qyh qyhVar3 = qxoVarA.c;
        if (qyhVar3 == null) {
            yks.c("persistentObjects");
            qyhVar3 = null;
        }
        qxoVarA.b = ykr.q(dwu.a(qxoVarA), null, 0, new oza(new qxh(new qyc(qycVar.d, new qyk(qykVar2.a, xzgVar, qyhVar3.a, qykVar2.c, qykVar2.m, qykVar2.q, qykVar2.d, qykVar2.e, qykVar2.f, qykVar2.g, qykVar2.p, qykVar2.h, rddVar, qykVar2.i, qykVar2.j, qykVar2.l, qykVar2.k), qycVar.b, qycVar.c), qxoVarA.d, qyfVar, qxoVarA.e), (yih) null, 15), 3);
        return ykr.q(dvb.d(this), null, 0, new qxa(this, rayVar, null, 3, null), 3);
    }

    @Override // defpackage.rhv
    public final boolean d() {
        return this.b != null;
    }

    @Override // defpackage.bl
    public final void dismiss() {
        if (isAdded()) {
            if (isStateSaved()) {
                super.dismissAllowingStateLoss();
            } else {
                super.dismiss();
            }
        }
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof Activity) {
            this.g = registerForActivityResult(new ha(), new hiq(this, 9));
        }
    }

    @Override // defpackage.bv, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        View view = getView();
        if (view == null || !d()) {
            return;
        }
        yqe yqeVar = this.f;
        if (yqeVar != null) {
            yqeVar.t(null);
        }
        a().a();
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.og_bento_menu_content_container);
        frameLayout.removeAllViews();
        Object objB = b().b.a.b();
        frameLayout.getClass();
        ray rayVarI = ((yyh) objB).i(frameLayout);
        qyf qyfVar = this.c;
        if (qyfVar == null) {
            yks.c("initialModelData");
            qyfVar = null;
        }
        this.f = c(rayVarI, qyfVar);
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.d = (qxm) d.d(bundle, "activityResultContextKey", qxm.class);
        }
        this.j.s(new qxp(this, 0));
    }

    @Override // android.support.v7.app.AppCompatDialogFragment, defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        this.j.s(new qto(dialogOnCreateDialog, this, 10));
        AppCompatDialog appCompatDialog = (AppCompatDialog) dialogOnCreateDialog;
        Context context = appCompatDialog.getContext();
        context.getClass();
        boolean zF = rdd.f(context);
        if (bundle == null) {
            Window window = appCompatDialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(true != zF ? R.style.OneGoogle_Dialog_Bento_Animation : R.style.OneGoogle_Dialog_Bento_Animation_LargeScreen);
                return dialogOnCreateDialog;
            }
        } else {
            Window window2 = appCompatDialog.getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(true != zF ? R.style.OneGoogle_Dialog_Bento_Animation_Exit : R.style.OneGoogle_Dialog_Bento_Animation_LargeScreen_Exit);
            }
        }
        return dialogOnCreateDialog;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        View viewInflate = LayoutInflater.from((arguments == null || !arguments.getBoolean("enableDynamicColors")) ? layoutInflater.getContext() : sru.a(layoutInflater.getContext())).inflate(R.layout.bento_layout, viewGroup);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // defpackage.bv
    public final void onDestroy() {
        a().a();
        this.j.s(new pqi(this, 19));
        super.onDestroy();
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onDestroyView() {
        super.onDestroyView();
        this.j.s(new qxp(this, 1));
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("activityResultContextKey", this.d);
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        View viewFindViewById = view.findViewById(R.id.og_bento_menu_content_container);
        viewFindViewById.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        Context context = view.getContext();
        context.getClass();
        if (rdd.f(context) && bundle == null) {
            frameLayout.startAnimation(AnimationUtils.loadAnimation(frameLayout.getContext(), R.anim.scale_enter));
        }
        this.j.s(new lke((Object) this, (Object) view, (Object) frameLayout, 17, (short[]) null));
    }
}
