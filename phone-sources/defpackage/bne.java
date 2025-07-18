package defpackage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.play.movies.mobile.presenter.helper.DetailsHeaderListLayout;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bne implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bne(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.b) {
            case 0:
                ((bnf) this.a).b(view.getContext());
                break;
            case 1:
                View view2 = (View) this.a;
                view2.removeOnAttachStateChangeListener(this);
                int[] iArr = cww.a;
                cwk.e(view2);
                break;
            case 2:
                cbi cbiVar = (cbi) this.a;
                AccessibilityManager accessibilityManager = cbiVar.d;
                cbiVar.g = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(cbiVar.e);
                accessibilityManager.addTouchExplorationStateChangeListener(cbiVar.f);
                break;
            case 3:
            case 4:
            case 9:
                break;
            case 5:
                view.getClass();
                mjo.s((View) this.a);
                break;
            case 6:
                if (mjo.u(view)) {
                    view.setSystemUiVisibility(1280);
                    DetailsActivity detailsActivity = (DetailsActivity) this.a;
                    detailsActivity.getWindow().setStatusBarColor(0);
                    detailsActivity.getWindow().setNavigationBarColor(0);
                    break;
                }
                break;
            case 7:
                Object obj = this.a;
                if (obj != null) {
                    AppCompatActivity appCompatActivity = (AppCompatActivity) obj;
                    if (appCompatActivity.getResources().getConfiguration().orientation == 2) {
                        Toolbar toolbar = ((DetailsHeaderListLayout) appCompatActivity.findViewById(R.id.details_header_list_layout)).b;
                        if (mjo.u(view)) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
                            WindowInsets rootWindowInsets = view.getRootWindowInsets();
                            DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                            marginLayoutParams.setMargins(rootWindowInsets.getSystemWindowInsetLeft() + displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), rootWindowInsets.getSystemWindowInsetRight() + displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                            toolbar.setLayoutParams(marginLayoutParams);
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
                            WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
                            marginLayoutParams2.setMargins(rootWindowInsets2.getSystemWindowInsetLeft(), 0, rootWindowInsets2.getSystemWindowInsetRight(), 0);
                            toolbar.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                mjo.r(view, true);
                break;
            case 8:
                mjo.s((View) this.a);
                break;
            case 10:
                qwb qwbVar = (qwb) this.a;
                rdd rddVar = qwbVar.d;
                qwn qwnVar = qwbVar.a;
                qwnVar.b.c(rddVar);
                qwbVar.b.b.c(qwbVar.c);
                tst tstVar = qwnVar.i;
                qwbVar.d();
                qwbVar.c(false);
                break;
            case 11:
                qwb qwbVar2 = (qwb) this.a;
                qwo qwoVar = qwbVar2.a.b;
                if (qwoVar.b()) {
                    qwbVar2.a(qwoVar.a());
                }
                qwbVar2.b.removeOnAttachStateChangeListener(this);
                break;
            default:
                ((tcn) this.a).d();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, yqe] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.b) {
            case 0:
                Context context = view.getContext();
                bnf bnfVar = (bnf) this.a;
                if (bnfVar.a) {
                    context.getApplicationContext().unregisterComponentCallbacks(bnfVar.b);
                    bnfVar.a = false;
                    break;
                }
                break;
            case 1:
            case 11:
                break;
            case 2:
                cbi cbiVar = (cbi) this.a;
                cbiVar.h.removeCallbacks(cbiVar.w);
                AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = cbiVar.e;
                AccessibilityManager accessibilityManager = cbiVar.d;
                accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
                accessibilityManager.removeTouchExplorationStateChangeListener(cbiVar.f);
                break;
            case 3:
                Object obj = this.a;
                Iterator itA = ykr.h(((View) obj).getParent(), cxc.a).a();
                while (itA.hasNext()) {
                    Object obj2 = (ViewParent) itA.next();
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null && bool.booleanValue()) {
                            break;
                        }
                    }
                }
                ((can) obj).e();
                break;
            case 4:
                view.removeOnAttachStateChangeListener(this);
                this.a.t(null);
                break;
            case 5:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                view.removeOnAttachStateChangeListener(this);
                break;
            case 7:
                view.removeOnAttachStateChangeListener(this);
                break;
            case 8:
                view.removeOnAttachStateChangeListener(this);
                break;
            case 9:
                pqw pqwVar = (pqw) this.a;
                pqwVar.h();
                pqwVar.d(1);
                break;
            case 10:
                qwb qwbVar = (qwb) this.a;
                qwn qwnVar = qwbVar.a;
                tst tstVar = qwnVar.i;
                qwnVar.b.d(qwbVar.d);
                AccountParticleDisc accountParticleDisc = qwbVar.b.b;
                accountParticleDisc.h(qwbVar.c);
                accountParticleDisc.n(null);
                break;
            default:
                ((tcn) this.a).h();
                break;
        }
    }
}
