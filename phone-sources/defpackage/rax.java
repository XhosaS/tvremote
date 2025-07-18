package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rax extends rbn {
    private final rar a;
    private final rbm b;
    private final rbl c;
    private final rbt d;
    private final rcy e;
    private final rao f;
    private final rba g;
    private final rbh h;
    private final yyh i;

    public rax(rar rarVar, rbm rbmVar, rbl rblVar, rbt rbtVar, rcy rcyVar, rao raoVar, rba rbaVar, rbh rbhVar, yyh yyhVar) {
        this.a = rarVar;
        this.b = rbmVar;
        this.c = rblVar;
        this.d = rbtVar;
        this.e = rcyVar;
        this.f = raoVar;
        this.g = rbaVar;
        this.h = rbhVar;
        this.i = yyhVar;
    }

    private final void d(vqs vqsVar, ttm ttmVar, ViewGroup viewGroup) {
        if (vqsVar == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        rcy rcyVar = this.e;
        Object obj = ttmVar.get();
        obj.getClass();
        rcyVar.c(obj, vqsVar);
    }

    private static final void e(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int marginStart = marginLayoutParams.getMarginStart();
        int marginEnd = marginLayoutParams.getMarginEnd();
        int i2 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(marginStart);
        marginLayoutParams.topMargin = i;
        marginLayoutParams.setMarginEnd(marginEnd);
        marginLayoutParams.bottomMargin = i2;
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vpb) obj2).getClass();
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) throws Resources.NotFoundException, NumberFormatException {
        int iAh;
        boolean z;
        vqs vqsVar;
        boolean z2;
        vqs vqsVar2;
        vpe vpeVar;
        ray rayVar = (ray) obj;
        vpb vpbVar = (vpb) obj2;
        vpbVar.getClass();
        vqe vqeVar = new vqe(vpy.w);
        ViewGroup viewGroup = rayVar.a;
        Context context = viewGroup.getContext();
        context.getClass();
        vqe vqeVar2 = vpbVar.f;
        yyh yyhVar = this.i;
        String strK = yyhVar.k(vqeVar2, context);
        Context context2 = viewGroup.getContext();
        context2.getClass();
        cww.r(viewGroup, strK + "\n" + yyhVar.k(vqeVar, context2));
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i = vpbVar.h - 1;
        if (i == 1) {
            Resources resources = viewGroup.getResources();
            layoutParams2.gravity = 8388613;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.og_bento_menu_large_screen_content_container_default_width);
            float f = resources.getConfiguration().screenWidthDp * resources.getDisplayMetrics().density;
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.og_bento_menu_content_container_horizontal_margin);
            layoutParams2.width = Math.min(dimensionPixelSize, (int) ((f / 2.0f) - (dimensionPixelSize2 + dimensionPixelSize2)));
        } else if (i == 2) {
            layoutParams2.gravity = 1;
        }
        viewGroup.setLayoutParams(layoutParams2);
        vvd vvdVar = rayVar.w;
        boolean z3 = rayVar.s;
        rbg rbgVar = (rbg) vvdVar.d;
        MaterialButton materialButton = rbgVar.j;
        int iAh2 = rrx.ah(materialButton.getResources().getDisplayMetrics(), true != z3 ? 8 : 16);
        materialButton.setPadding(iAh2, materialButton.getPaddingTop(), iAh2, materialButton.getPaddingBottom());
        MaterialButton materialButton2 = rbgVar.k;
        materialButton2.setPadding(iAh2, materialButton2.getPaddingTop(), iAh2, materialButton2.getPaddingBottom());
        MaterialButton materialButton3 = rbgVar.l;
        materialButton3.setPadding(iAh2, materialButton3.getPaddingTop(), iAh2, materialButton3.getPaddingBottom());
        this.g.c(vvdVar, vpbVar.c);
        vpf vpfVar = vpbVar.a;
        boolean z4 = vpfVar instanceof vqq;
        vqj vqjVar = z4 ? ((vqq) vpfVar).a : null;
        if (z4) {
            z2 = !z3;
            rayVar.d.setVisibility(vqjVar == null ? 8 : 0);
            if (vqjVar != null) {
                rbl rblVar = this.c;
                Object obj3 = rayVar.e.get();
                obj3.getClass();
                rblVar.c(obj3, vqjVar);
            }
            vqq vqqVar = (vqq) vpfVar;
            vqsVar2 = vqqVar.c;
            vov vovVar = vqqVar.b;
            if (vovVar != null) {
                rao raoVar = this.f;
                Object obj4 = rayVar.j.get();
                obj4.getClass();
                raoVar.c(obj4, vovVar);
            }
            vqsVar = vqqVar.e;
            View view = rayVar.g;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            if (!(vpfVar instanceof vqr)) {
                throw new yfu();
            }
            FrameLayout frameLayout = rayVar.d;
            ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            boolean z5 = !z3;
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = -2;
            frameLayout.setLayoutParams(layoutParams4);
            rbu rbuVar = (rbu) rayVar.f.get();
            if (z3) {
                iAh = rrx.ah(((raz) rbuVar.c).getContext().getResources().getDisplayMetrics(), 2);
                z = true;
            } else {
                iAh = rrx.ah(((raz) rbuVar.c).getContext().getResources().getDisplayMetrics(), 12);
                z = false;
            }
            rbuVar.a = iAh;
            rbt rbtVar = this.d;
            rbuVar.getClass();
            rbtVar.c(rbuVar, ((vqr) vpfVar).a);
            View view2 = rayVar.g;
            if (view2 != null) {
                view2.setVisibility(true != z ? 8 : 0);
            }
            vqsVar = null;
            z2 = z5;
            vqsVar2 = null;
        }
        d(vqsVar2, rayVar.i, rayVar.h);
        d(null, rayVar.l, rayVar.k);
        d(null, rayVar.n, rayVar.m);
        d(vqsVar, rayVar.p, rayVar.o);
        this.a.c(rayVar.u, vpbVar.b);
        if (vqjVar != null || true == z2) {
            e(rayVar.b, 0);
        } else {
            ViewGroup viewGroup2 = rayVar.b;
            e(viewGroup2, viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.account_menu_container_top_padding_without_selected_account));
        }
        rbm rbmVar = this.b;
        vvd vvdVar2 = rayVar.v;
        if (true != z2) {
            vpeVar = vpbVar.e;
        } else {
            vpe vpeVar2 = vpbVar.e;
            vpeVar = new vpe(vpeVar2.a, null, vpeVar2.c);
        }
        rbmVar.c(vvdVar2, vpeVar);
        vqg vqgVar = vpbVar.d;
        if (vqgVar == null || vqgVar.b.isEmpty()) {
            rayVar.q.setVisibility(8);
        } else {
            rbh rbhVar = this.h;
            ttm ttmVar = rayVar.r;
            Object obj5 = ttmVar.get();
            obj5.getClass();
            rbhVar.c(obj5, vqgVar);
            rayVar.q.setVisibility(0);
            if (true == z3 || !(vpfVar instanceof vqr)) {
                Object obj6 = ((rbi) ttmVar.get()).a;
                e((View) obj6, rrx.ah(((TextView) obj6).getContext().getResources().getDisplayMetrics(), 16));
            } else {
                e((View) ((rbi) ttmVar.get()).a, 0);
            }
        }
        rayVar.c.setVisibility((true != z3 && vqgVar == null && vpfVar.a()) ? 8 : 0);
        rayVar.t.setVisibility(true != vpbVar.g ? 0 : 8);
    }
}
