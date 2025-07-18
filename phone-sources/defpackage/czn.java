package defpackage;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchResultsPageActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class czn implements cvq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ czn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cvq
    public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
        switch (this.b) {
            case 0:
                csr csrVarA = czq.a(cyhVar);
                csr csrVarC = csr.c(cyhVar.g(519), cyhVar.g(64));
                czq czqVar = (czq) this.a;
                if (!csrVarA.equals(czqVar.c) || !csrVarC.equals(czqVar.d)) {
                    czqVar.c = csrVarA;
                    czqVar.d = csrVarC;
                    ArrayList arrayList = czqVar.b;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            fqv.f((fqv) arrayList.get(size));
                        }
                    }
                }
                return cyhVar;
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
                if (!Objects.equals(coordinatorLayout.e, cyhVar)) {
                    coordinatorLayout.e = cyhVar;
                    boolean z = cyhVar.d() > 0;
                    coordinatorLayout.f = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!cyhVar.u()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (iB < childCount) {
                            View childAt = coordinatorLayout.getChildAt(iB);
                            int[] iArr = cww.a;
                            if (!childAt.getFitsSystemWindows() || ((cqx) childAt.getLayoutParams()).a == null || !cyhVar.u()) {
                                iB++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    return cyhVar;
                }
                return cyhVar;
            case 2:
                view.getClass();
                cvb cvbVarJ = cyhVar.j();
                iB = cvbVarJ != null ? cvbVarJ.b() : 0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = iB + ((int) ((AppCompatActivity) this.a).getResources().getDimension(R.dimen.exo_position_horizontal_spacing));
                view.setLayoutParams(marginLayoutParams);
                return cyh.a;
            case 3:
                view.getClass();
                cvb cvbVarJ2 = cyhVar.j();
                iB = cvbVarJ2 != null ? cvbVarJ2.c() : 0;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.rightMargin = iB + ((int) ((AppCompatActivity) this.a).getResources().getDimension(R.dimen.exo_position_horizontal_spacing));
                view.setLayoutParams(marginLayoutParams2);
                return cyh.a;
            case 4:
                view.getClass();
                csr csrVarF = cyhVar.f(519);
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.bottomMargin = csrVarF.e + ((int) ((AppCompatActivity) this.a).getResources().getDimension(R.dimen.exo_position_bottom_margin));
                view.setLayoutParams(marginLayoutParams3);
                return cyh.a;
            case 5:
                jxm.m440$r8$lambda$4yqMpbDdansJgZth8LA6TFV_u8((jxm) this.a, view, cyhVar);
                return cyhVar;
            case 6:
                jxm.$r8$lambda$UUdttzYCVOqfgp4QEhvTq8v7boE((jxm) this.a, view, cyhVar);
                return cyhVar;
            case 7:
                jxm.$r8$lambda$x7GxonvvrxcdHcBLj5LE9DHI9Yc((jxm) this.a, view, cyhVar);
                return cyhVar;
            case 8:
                jxm.$r8$lambda$bIE_oFduKtkoUrs57zFmuooJEiE((jxm) this.a, view, cyhVar);
                return cyhVar;
            case 9:
                GtvHomePageActivity.$r8$lambda$kcXmvvJhfKMnm8isSoHX_P2l8WM((GtvHomePageActivity) this.a, view, cyhVar);
                return cyhVar;
            case 10:
                GtvHomePageActivity.$r8$lambda$LmMcRNqoJOJLwOIUUSxV1eozcPo((GtvHomePageActivity) this.a, view, cyhVar);
                return cyhVar;
            case 11:
                SearchResultsPageActivity.m124$r8$lambda$fGXH0Clu3skbJm6Q77C5iL1Xh8((SearchResultsPageActivity) this.a, view, cyhVar);
                return cyhVar;
            case 12:
                a.d((View) this.a, cyhVar);
                return cyhVar;
            case 13:
                a.d((View) this.a, cyhVar);
                return cyhVar;
            case 14:
                AppBarLayout appBarLayout = (AppBarLayout) this.a;
                cyh cyhVar2 = true != appBarLayout.getFitsSystemWindows() ? null : cyhVar;
                if (!Objects.equals(appBarLayout.c, cyhVar2)) {
                    appBarLayout.c = cyhVar2;
                    appBarLayout.l();
                    appBarLayout.requestLayout();
                    return cyhVar;
                }
                return cyhVar;
            case 15:
                sqg sqgVar = (sqg) this.a;
                sqf sqfVar = sqgVar.h;
                if (sqfVar != null) {
                    sqgVar.b.L(sqfVar);
                }
                sqgVar.h = new sqf(sqgVar.c, cyhVar);
                sqgVar.h.d(sqgVar.getWindow());
                sqgVar.b.H(sqgVar.h);
                return cyhVar;
            default:
                int i = cyhVar.f(647).c;
                sys sysVar = (sys) this.a;
                sysVar.k(i);
                if (!sysVar.r) {
                    sysVar.i(i > 0);
                }
                return cyhVar;
        }
    }

    public czn(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
