package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kag implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public kag(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TextView textView;
        TextView textView2;
        int i = this.c;
        try {
            if (i != 0) {
                if (i != 1) {
                    View view = (View) this.a;
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    View rootView = view.getRootView();
                    Runnable runnable = new Runnable() { // from class: phi
                        @Override // java.lang.Runnable
                        public final void run() {
                            View view2;
                            int i2;
                            int i3;
                            int i4;
                            boolean z;
                            final Object obj = this.a.b;
                            bv bvVar = (bv) obj;
                            Bundle arguments = bvVar.getArguments();
                            arguments.setClassLoader(oyd.class.getClassLoader());
                            phk phkVar = (phk) obj;
                            phkVar.f = (oyd) arguments.getParcelable("promo_context");
                            uyv uyvVar = uyv.UNSPECIFIED;
                            phkVar.g = uyv.b(arguments.getInt("theme", uyvVar.d));
                            uyr uyrVar = phkVar.f.c.f;
                            if (uyrVar == null) {
                                uyrVar = uyr.a;
                            }
                            uzb uzbVar = uyrVar.c == 5 ? (uzb) uyrVar.d : uzb.a;
                            View viewO = phkVar.j.o(bvVar.getActivity(), uzbVar);
                            if (!pho.c(viewO)) {
                                phkVar.i.j(phkVar.f, pfq.FAILED_VIEW_MOSTLY_HIDDEN);
                                phkVar.a();
                                return;
                            }
                            int iBm = a.bm(uyrVar.h);
                            final int i5 = 1;
                            boolean z2 = iBm != 0 && iBm == 3 && sru.c();
                            Context context = bvVar.getContext();
                            int iBm2 = a.bm(uyrVar.h);
                            if (iBm2 == 0) {
                                iBm2 = 1;
                            }
                            pfy pfyVarAl = rdd.al(context, phkVar.g, iBm2 == 3 && sru.c());
                            try {
                                php phpVar = new php(null);
                                phpVar.c(false);
                                if (viewO == null) {
                                    throw new NullPointerException("Null targetView");
                                }
                                phpVar.a = viewO;
                                phpVar.c = uzbVar.g;
                                phpVar.c(uzbVar.i);
                                phpVar.e = uzbVar.i ? ((phk) obj).k.q(uzbVar.h) : uzbVar.h;
                                phpVar.r = 2;
                                uza uzaVarB = uza.b(uzbVar.l);
                                if (uzaVarB == null) {
                                    uzaVarB = uza.UNKNOWN;
                                }
                                phpVar.q = uzaVarB.ordinal() != 1 ? 2 : 1;
                                phpVar.n = 0.95f;
                                phpVar.o = (byte) (phpVar.o | 2);
                                phpVar.p = 2;
                                uyv uyvVar2 = ((phk) obj).g;
                                if (uyvVar2 == uyvVar) {
                                    if ((uzbVar.b & 1) != 0) {
                                        wes wesVar = uzbVar.e;
                                        if (wesVar == null) {
                                            wesVar = wes.a;
                                        }
                                        phpVar.b(Integer.valueOf(qtl.y(wesVar)));
                                    }
                                    if ((uzbVar.b & 2) != 0) {
                                        wes wesVar2 = uzbVar.f;
                                        if (wesVar2 == null) {
                                            wesVar2 = wes.a;
                                        }
                                        phpVar.d(Integer.valueOf(qtl.y(wesVar2)));
                                    }
                                } else if (!z2 || pfyVarAl == null) {
                                    uxq uxqVar = rdd.aj(uyvVar2, uzbVar.j).d;
                                    if (uxqVar == null) {
                                        uxqVar = uxq.a;
                                    }
                                    wes wesVar3 = uxqVar.c;
                                    if (wesVar3 == null) {
                                        wesVar3 = wes.a;
                                    }
                                    phpVar.e(Integer.valueOf(qtl.y(wesVar3)));
                                    wes wesVar4 = uxqVar.d;
                                    if (wesVar4 == null) {
                                        wesVar4 = wes.a;
                                    }
                                    phpVar.d(Integer.valueOf(qtl.y(wesVar4)));
                                    wes wesVar5 = uxqVar.e;
                                    if (wesVar5 == null) {
                                        wesVar5 = wes.a;
                                    }
                                    phpVar.b(Integer.valueOf(qtl.y(wesVar5)));
                                } else {
                                    Integer numValueOf = Integer.valueOf(pfyVarAl.b);
                                    phpVar.e(numValueOf);
                                    phpVar.d(numValueOf);
                                    phpVar.b(Integer.valueOf(pfyVarAl.a));
                                }
                                if ((uzbVar.b & 32) != 0) {
                                    uyv uyvVar3 = ((phk) obj).g;
                                    if (uyvVar3 == uyvVar) {
                                        uxw uxwVar = uzbVar.k;
                                        if (uxwVar == null) {
                                            uxwVar = uxw.a;
                                        }
                                        if ((uxwVar.b & 4) != 0) {
                                            uxw uxwVar2 = uzbVar.k;
                                            if (uxwVar2 == null) {
                                                uxwVar2 = uxw.a;
                                            }
                                            wes wesVar6 = uxwVar2.g;
                                            if (wesVar6 == null) {
                                                wesVar6 = wes.a;
                                            }
                                            phpVar.a(Integer.valueOf(qtl.y(wesVar6)));
                                        }
                                    } else if (!z2 || pfyVarAl == null) {
                                        uxw uxwVar3 = uzbVar.k;
                                        if (uxwVar3 == null) {
                                            uxwVar3 = uxw.a;
                                        }
                                        uxq uxqVar2 = rdd.aj(uyvVar3, uxwVar3.i).d;
                                        if (uxqVar2 == null) {
                                            uxqVar2 = uxq.a;
                                        }
                                        wes wesVar7 = uxqVar2.c;
                                        if (wesVar7 == null) {
                                            wesVar7 = wes.a;
                                        }
                                        phpVar.a(Integer.valueOf(qtl.y(wesVar7)));
                                    } else {
                                        phpVar.a(Integer.valueOf(pfyVarAl.b));
                                    }
                                    uxw uxwVar4 = uzbVar.k;
                                    if (uxwVar4 == null) {
                                        uxwVar4 = uxw.a;
                                    }
                                    phpVar.i = uxwVar4.f;
                                    phpVar.k = new nay(obj, uzbVar, 2);
                                }
                                phpVar.l = new PopupWindow.OnDismissListener() { // from class: phm
                                    @Override // android.widget.PopupWindow.OnDismissListener
                                    public final void onDismiss() {
                                        if (i5 != 0) {
                                            phk phkVar2 = (phk) obj;
                                            if (phkVar2.e && phkVar2.d) {
                                                phkVar2.i.i(phkVar2.f, uxd.DISMISSED);
                                            }
                                            phkVar2.a();
                                            return;
                                        }
                                        pho phoVar = (pho) obj;
                                        phoVar.c.b(null);
                                        PopupWindow.OnDismissListener onDismissListener = phoVar.b.l;
                                        if (onDismissListener != null) {
                                            onDismissListener.onDismiss();
                                        }
                                    }
                                };
                                phpVar.m = new mqw(obj, 19);
                                phpVar.d = new mqw(obj, 20);
                                if (phpVar.o == 3 && (view2 = phpVar.a) != null && (i2 = phpVar.p) != 0 && (i3 = phpVar.q) != 0 && (i4 = phpVar.r) != 0) {
                                    ((phk) obj).c = new pho(new phq(view2, phpVar.b, phpVar.c, phpVar.d, phpVar.e, phpVar.f, phpVar.g, phpVar.h, phpVar.i, phpVar.j, phpVar.k, phpVar.l, phpVar.m, i2, i3, i4, phpVar.n));
                                    final pho phoVar = ((phk) obj).c;
                                    View view3 = phoVar.b.a;
                                    phoVar.d = view3.getRootView();
                                    hc hcVar = new hc(phoVar.b.a.getContext(), R.style.Theme_GrowthKit_Tooltip);
                                    View viewInflate = (TextUtils.isEmpty(phoVar.b.c) || TextUtils.isEmpty(phoVar.b.e) || TextUtils.isEmpty(phoVar.b.i)) ? (TextUtils.isEmpty(phoVar.b.c) || TextUtils.isEmpty(phoVar.b.e) || !TextUtils.isEmpty(phoVar.b.i)) ? (!TextUtils.isEmpty(phoVar.b.c) && TextUtils.isEmpty(phoVar.b.e) && TextUtils.isEmpty(phoVar.b.i)) ? View.inflate(hcVar, R.layout.gm3_tooltip_title_content_view, null) : (TextUtils.isEmpty(phoVar.b.c) && !TextUtils.isEmpty(phoVar.b.e) && TextUtils.isEmpty(phoVar.b.i)) ? View.inflate(hcVar, R.layout.gm3_tooltip_body_content_view, null) : (!TextUtils.isEmpty(phoVar.b.c) || TextUtils.isEmpty(phoVar.b.e) || TextUtils.isEmpty(phoVar.b.i)) ? View.inflate(hcVar, R.layout.gm3_tooltip_title_body_button_content_view, null) : View.inflate(hcVar, R.layout.gm3_tooltip_body_button_content_view, null) : View.inflate(hcVar, R.layout.gm3_tooltip_title_body_content_view, null) : View.inflate(hcVar, R.layout.gm3_tooltip_title_body_button_content_view, null);
                                    if (!TextUtils.isEmpty(phoVar.b.c)) {
                                        TextView textView3 = (TextView) viewInflate.findViewById(R.id.gm_tooltip_title);
                                        if (phoVar.b.g.g()) {
                                            textView3.setTextColor(((Integer) phoVar.b.g.c()).intValue());
                                        }
                                        if (phoVar.b.h.g()) {
                                            textView3.setTextColor(((Integer) phoVar.b.h.c()).intValue());
                                        }
                                        if (xfi.c()) {
                                            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                                            DisplayMetrics displayMetrics = view3.getContext().getResources().getDisplayMetrics();
                                            int iX = qtl.x(displayMetrics, 12);
                                            int iX2 = qtl.x(displayMetrics, 6);
                                            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(iX, iX2, iX, iX2);
                                            textView3.setLayoutParams(layoutParams);
                                        }
                                        qtl.A(textView3, phoVar.b.c);
                                    }
                                    if (!TextUtils.isEmpty(phoVar.b.e)) {
                                        TextView textView4 = (TextView) viewInflate.findViewById(R.id.gm_tooltip_detail);
                                        if (phoVar.b.g.g()) {
                                            textView4.setTextColor(((Integer) phoVar.b.g.c()).intValue());
                                        }
                                        if (xfi.c()) {
                                            ViewGroup.LayoutParams layoutParams2 = textView4.getLayoutParams();
                                            DisplayMetrics displayMetrics2 = view3.getContext().getResources().getDisplayMetrics();
                                            int iX3 = qtl.x(displayMetrics2, 12);
                                            int iX4 = qtl.x(displayMetrics2, 6);
                                            ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(iX3, iX4, iX3, iX4);
                                            textView4.setLayoutParams(layoutParams2);
                                        }
                                        phq phqVar = phoVar.b;
                                        CharSequence charSequence = phqVar.e;
                                        if (phqVar.f) {
                                            textView4.setMovementMethod(LinkMovementMethod.getInstance());
                                        }
                                        qtl.A(textView4, charSequence);
                                    }
                                    phq phqVar2 = phoVar.b;
                                    phoVar.a = new phh(viewInflate, view3, phqVar2.p, phqVar2.q);
                                    if (phoVar.b.b.g()) {
                                        phoVar.a.b.b(((Integer) phoVar.b.b.c()).intValue());
                                    }
                                    if (TextUtils.isEmpty(phoVar.b.i)) {
                                        z = false;
                                    } else {
                                        TextView textView5 = (TextView) viewInflate.findViewById(R.id.gm_tooltip_action_button);
                                        phh phhVar = phoVar.a;
                                        phq phqVar3 = phoVar.b;
                                        CharSequence charSequence2 = phqVar3.i;
                                        tst tstVar = phqVar3.j;
                                        View.OnClickListener onClickListener = phqVar3.k;
                                        if (TextUtils.isEmpty(charSequence2)) {
                                            textView5.setVisibility(8);
                                            z = false;
                                        } else {
                                            textView5.setText(charSequence2);
                                            if (tstVar.g()) {
                                                textView5.setTextColor(((Integer) tstVar.c()).intValue());
                                            }
                                            textView5.setOnClickListener(new kaj(onClickListener, textView5, phhVar, 5, (short[]) null));
                                            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_focused}}, new int[]{Color.argb(51, 0, 0, 0)});
                                            int[] iArr = cww.a;
                                            cwm.h(textView5, colorStateList);
                                            z = true;
                                        }
                                    }
                                    phh phhVar2 = phoVar.a;
                                    phq phqVar4 = phoVar.b;
                                    boolean z3 = phqVar4.o == 2;
                                    phg phgVar = phhVar2.b;
                                    phgVar.d = z3;
                                    phgVar.g = phqVar4.n;
                                    if (phgVar.isShown()) {
                                        phgVar.requestLayout();
                                    }
                                    if (!z) {
                                        phoVar.a.b.setOnClickListener(new phn(phoVar, 1));
                                    }
                                    phh phhVar3 = phoVar.a;
                                    final int i6 = 0;
                                    PopupWindow.OnDismissListener onDismissListener = new PopupWindow.OnDismissListener() { // from class: phm
                                        @Override // android.widget.PopupWindow.OnDismissListener
                                        public final void onDismiss() {
                                            if (i6 != 0) {
                                                phk phkVar2 = (phk) phoVar;
                                                if (phkVar2.e && phkVar2.d) {
                                                    phkVar2.i.i(phkVar2.f, uxd.DISMISSED);
                                                }
                                                phkVar2.a();
                                                return;
                                            }
                                            pho phoVar2 = (pho) phoVar;
                                            phoVar2.c.b(null);
                                            PopupWindow.OnDismissListener onDismissListener2 = phoVar2.b.l;
                                            if (onDismissListener2 != null) {
                                                onDismissListener2.onDismiss();
                                            }
                                        }
                                    };
                                    PopupWindow popupWindow = phhVar3.b.c;
                                    if (popupWindow != null) {
                                        popupWindow.setOnDismissListener(onDismissListener);
                                    }
                                    phh phhVar4 = phoVar.a;
                                    phn phnVar = new phn(phoVar, 0);
                                    phg phgVar2 = phhVar4.b;
                                    phgVar2.k = phnVar;
                                    phgVar2.j = phoVar.b.d;
                                    phoVar.c = new phw(phoVar.d);
                                    phw phwVar = phoVar.c;
                                    phwVar.b = phoVar;
                                    phwVar.a = phoVar;
                                    phwVar.b(view3);
                                    if (xfi.b()) {
                                        tst tstVarI = !uzbVar.g.isEmpty() ? tst.i(uzbVar.g) : !uzbVar.h.isEmpty() ? tst.i(uzbVar.h) : trk.a;
                                        if (tstVarI.g()) {
                                            cww.p(viewO, new phj((phk) obj, tstVarI));
                                        }
                                    }
                                    if (!((phk) obj).h.booleanValue()) {
                                        ((phk) obj).i.j(((phk) obj).f, pfq.SUCCESS);
                                        ((phk) obj).h = true;
                                    }
                                    ((phk) obj).b = true;
                                    return;
                                }
                                StringBuilder sb = new StringBuilder();
                                if (phpVar.a == null) {
                                    sb.append(" targetView");
                                }
                                if ((phpVar.o & 1) == 0) {
                                    sb.append(" isHtmlBodyText");
                                }
                                if (phpVar.p == 0) {
                                    sb.append(" tapDismissalType");
                                }
                                if (phpVar.q == 0) {
                                    sb.append(" placement");
                                }
                                if (phpVar.r == 0) {
                                    sb.append(" alignment");
                                }
                                if ((phpVar.o & 2) == 0) {
                                    sb.append(" maxWidthPercentage");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                            } catch (pgf unused) {
                                phkVar.i.j(phkVar.f, pfq.FAILED_THEME_NOT_FOUND);
                                phkVar.a();
                            }
                        }
                    };
                    int[] iArr = cww.a;
                    rootView.postOnAnimation(runnable);
                    return;
                }
                View view2 = (View) this.a;
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                EntityPageActivity entityPageActivity = (EntityPageActivity) this.b;
                if (entityPageActivity.P()) {
                    entityPageActivity.N().f.c(Integer.valueOf(view2.getMeasuredHeight()));
                    return;
                }
                return;
            }
            try {
                Object obj = this.a;
                int dimensionPixelSize = ((AppCompatActivity) obj).getResources().getDimensionPixelSize(R.dimen.bottom_tabs_text_size_max);
                vun vunVar = ((GtvHomePageActivity) obj).E.b;
                vunVar.getClass();
                Object obj2 = this.b;
                int i2 = 0;
                for (Object obj3 : vunVar) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        yfm.w();
                    }
                    wlf wlfVar = (wlf) obj3;
                    svw svwVarD = ((swa) obj2).d(i2);
                    if (svwVarD != null) {
                        TextView textView3 = (TextView) svwVarD.findViewById(R.id.navigation_bar_item_large_label_view);
                        if (textView3.getLayout() != null) {
                            float length = wlfVar.f.length();
                            float ellipsisStart = textView3.getLayout().getEllipsisStart(0);
                            dimensionPixelSize = Math.min(dimensionPixelSize, (int) (textView3.getResources().getDimensionPixelSize(R.dimen.bottom_tabs_text_size_max) / (ellipsisStart > 0.0f ? length / ellipsisStart : 1.0f)));
                        }
                    }
                    i2 = i3;
                }
                float fMax = Math.max(dimensionPixelSize, ((AppCompatActivity) obj).getResources().getDimensionPixelSize(R.dimen.bottom_tabs_text_size_min));
                vun vunVar2 = ((GtvHomePageActivity) obj).E.b;
                vunVar2.getClass();
                int i4 = 0;
                for (Object obj4 : vunVar2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        yfm.w();
                    }
                    svw svwVarD2 = ((swa) obj2).d(i4);
                    if (svwVarD2 != null && (textView2 = (TextView) svwVarD2.findViewById(R.id.navigation_bar_item_small_label_view)) != null) {
                        textView2.setTextSize(0, fMax);
                    }
                    svw svwVarD3 = ((swa) obj2).d(i4);
                    if (svwVarD3 != null && (textView = (TextView) svwVarD3.findViewById(R.id.navigation_bar_item_large_label_view)) != null) {
                        textView.setTextSize(0, fMax);
                    }
                    i4 = i5;
                }
            } catch (Exception unused) {
                krd.c("Can not resize bottom navigation tabs text.");
            }
        } finally {
            ((swa) this.b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public kag(phk phkVar, View view, int i) {
        this.c = i;
        this.a = view;
        this.b = phkVar;
    }
}
