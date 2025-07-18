package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.android.videos.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhd {
    public final qwn a;
    public final rdd b;
    private final rme c;
    private final rma d;
    private final rma e;
    private final rma f;
    private final rma g;
    private final rma h;
    private final rma i;
    private final rma j;
    private final rma k;
    private final rma l;
    private int m;

    public rhd(final qwn qwnVar, final rme rmeVar, final wds wdsVar) {
        rmd rmdVar;
        rmc rmcVar;
        rmb rmbVar;
        rjg rjgVar;
        rrx rrxVar;
        final boolean z = true ? 1 : 0;
        this.l = new rma() { // from class: rgz
            @Override // defpackage.rma
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int i = z;
                if (i == 0) {
                    FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
                    frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
                    return frameLayout;
                }
                if (i == 1) {
                    return rhd.c(layoutInflater);
                }
                if (i != 2) {
                    Context context = layoutInflater.getContext();
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, rgs.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
                    try {
                        typedArrayObtainStyledAttributes.getColor(4, rrx.aB(context, R.color.og_background_light));
                        typedArrayObtainStyledAttributes.getColor(10, rrx.aB(context, R.color.og_default_icon_color_light));
                        typedArrayObtainStyledAttributes.getColor(11, rrx.aB(context, R.color.og_incognito_top_tight_icon_color_light));
                        typedArrayObtainStyledAttributes.getColor(8, rrx.aB(context, R.color.og_menu_title_color_light));
                        typedArrayObtainStyledAttributes.getColor(9, rrx.aB(context, R.color.google_white));
                        Drawable drawable = AppCompatResources.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
                        typedArrayObtainStyledAttributes.recycle();
                        ImageView imageView = new ImageView(layoutInflater.getContext());
                        imageView.setImageDrawable(drawable);
                        return imageView;
                    } catch (Throwable th) {
                        typedArrayObtainStyledAttributes.recycle();
                        throw th;
                    }
                }
                Context context2 = layoutInflater.getContext();
                TextView textView = new TextView(context2);
                textView.setText(R.string.og_choose_an_account_title);
                textView.setTextAppearance(rrx.av(context2, R.attr.ogTextAppearanceSubhead1));
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
                try {
                    int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
                    typedArrayObtainStyledAttributes2.recycle();
                    textView.setTextColor(color);
                    textView.setGravity(1);
                    textView.setMaxLines(2);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    cww.p(textView, new qtm());
                    return textView;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            }
        };
        this.a = qwnVar;
        this.c = rmeVar;
        new rhc(rmeVar);
        rly rlyVar = new rly();
        rlyVar.a = new rmd() { // from class: rlu
            @Override // defpackage.rmd
            public final void a(View view) {
            }
        };
        rlyVar.b = new rmc() { // from class: rlv
            @Override // defpackage.rmc
            public final void a() {
            }
        };
        rlyVar.c = new rmb() { // from class: rlw
            @Override // defpackage.rmb
            public final void a() {
            }
        };
        rlyVar.c();
        rlyVar.a(1);
        final int i = 0;
        rlyVar.b(new rlx(0));
        rlyVar.a = new rgu(this, i);
        rlyVar.b = new rmc() { // from class: rgv
            @Override // defpackage.rmc
            public final void a() {
                this.a.d(38);
            }
        };
        rlyVar.c = new rmb() { // from class: rgw
            @Override // defpackage.rmb
            public final void a() {
                tst tstVar = this.a.a.e.m;
            }
        };
        rlyVar.b(qwnVar.m);
        rlyVar.c();
        rlyVar.a(qwnVar.e.p);
        rrx rrxVar2 = qwnVar.e.q;
        if (rrxVar2 == null) {
            throw new NullPointerException("Null materialVersion");
        }
        rlyVar.g = rrxVar2;
        if (rlyVar.e != 1 || (rmdVar = rlyVar.a) == null || (rmcVar = rlyVar.b) == null || (rmbVar = rlyVar.c) == null || (rjgVar = rlyVar.d) == null || rlyVar.f == 0 || (rrxVar = rlyVar.g) == null) {
            StringBuilder sb = new StringBuilder();
            if (rlyVar.a == null) {
                sb.append(" onViewCreatedCallback");
            }
            if (rlyVar.b == null) {
                sb.append(" onDismissCallback");
            }
            if (rlyVar.c == null) {
                sb.append(" onDestroyCallback");
            }
            if (rlyVar.d == null) {
                sb.append(" visualElements");
            }
            if (rlyVar.e == 0) {
                sb.append(" isExperimental");
            }
            if (rlyVar.f == 0) {
                sb.append(" largeScreenDialogAlignment");
            }
            if (rlyVar.g == null) {
                sb.append(" materialVersion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        rlz rlzVar = new rlz(rmdVar, rmcVar, rmbVar, rjgVar, rrxVar);
        if (rmeVar.h == null) {
            sij.x(rmeVar.f == null, "initialize() must be called before setViewProviders()");
            rmeVar.h = rlzVar;
            rmeVar.j.r();
        }
        final rha rhaVar = new rha(rmeVar);
        this.d = new rma() { // from class: rhh
            @Override // defpackage.rma
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                qvf qvfVar = new qvf(layoutInflater.getContext());
                qwn qwnVar2 = qwnVar;
                rfg rfgVar = qwnVar2.e;
                rrx rrxVar3 = rfgVar.r;
                tst tstVar = rfgVar.m;
                trk trkVar = trk.a;
                final aafi aafiVar = new aafi(qwnVar2.c, (tst) trkVar, qwnVar2.n);
                cwx cwxVar = new cwx(qwnVar2, 2);
                ril rilVar = qwnVar2.g;
                if (rilVar == null) {
                    throw new NullPointerException("Null eventLogger");
                }
                wds wdsVar2 = wdsVar;
                if (wdsVar2 == null) {
                    throw new NullPointerException("Null logContext");
                }
                rjg rjgVar2 = qwnVar2.m;
                if (rjgVar2 == null) {
                    throw new NullPointerException("Null visualElements");
                }
                rhu rhuVar = rhaVar;
                final int i2 = 1;
                qtg qtgVar = new qtg() { // from class: rhi
                    @Override // defpackage.qtg
                    public final void a(View view, Object obj) {
                        if (i2 != 0) {
                            aafiVar.w(view, obj);
                        } else {
                            aafiVar.x(view, obj);
                        }
                    }
                };
                final int i3 = 0;
                qtg qtgVar2 = new qtg() { // from class: rhi
                    @Override // defpackage.qtg
                    public final void a(View view, Object obj) {
                        if (i3 != 0) {
                            aafiVar.w(view, obj);
                        } else {
                            aafiVar.x(view, obj);
                        }
                    }
                };
                a.H(true);
                qvb qvbVar = new qvb(cwxVar, rilVar, wdsVar2, rjgVar2, qtgVar, qtgVar2, trkVar, trkVar, rhuVar);
                qvfVar.p = qvbVar.b;
                qvfVar.q = qvbVar.c;
                qvfVar.u = qvbVar.d;
                qvfVar.r = qvbVar.a;
                qvfVar.t = qvbVar.g;
                ArrayList arrayList = qvfVar.o;
                arrayList.clear();
                qvfVar.j.setOnClickListener(qvfVar.g(qvbVar.e, 18));
                qvfVar.k.setOnClickListener(qvfVar.g(qvbVar.f, 19));
                arrayList.add(new qve(qvfVar));
                qvfVar.s = new qvd(qvfVar);
                qvfVar.b(qvfVar.u);
                int iAu = rrx.au(qvfVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + rrx.au(qvfVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing);
                qvfVar.setPadding(qvfVar.getPaddingLeft() + iAu, qvfVar.getPaddingTop(), qvfVar.getPaddingRight() + iAu, qvfVar.getPaddingBottom());
                return qvfVar;
            }
        };
        final int i2 = 3;
        this.e = new rma() { // from class: rgz
            @Override // defpackage.rma
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int i3 = i2;
                if (i3 == 0) {
                    FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
                    frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
                    return frameLayout;
                }
                if (i3 == 1) {
                    return rhd.c(layoutInflater);
                }
                if (i3 != 2) {
                    Context context = layoutInflater.getContext();
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, rgs.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
                    try {
                        typedArrayObtainStyledAttributes.getColor(4, rrx.aB(context, R.color.og_background_light));
                        typedArrayObtainStyledAttributes.getColor(10, rrx.aB(context, R.color.og_default_icon_color_light));
                        typedArrayObtainStyledAttributes.getColor(11, rrx.aB(context, R.color.og_incognito_top_tight_icon_color_light));
                        typedArrayObtainStyledAttributes.getColor(8, rrx.aB(context, R.color.og_menu_title_color_light));
                        typedArrayObtainStyledAttributes.getColor(9, rrx.aB(context, R.color.google_white));
                        Drawable drawable = AppCompatResources.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
                        typedArrayObtainStyledAttributes.recycle();
                        ImageView imageView = new ImageView(layoutInflater.getContext());
                        imageView.setImageDrawable(drawable);
                        return imageView;
                    } catch (Throwable th) {
                        typedArrayObtainStyledAttributes.recycle();
                        throw th;
                    }
                }
                Context context2 = layoutInflater.getContext();
                TextView textView = new TextView(context2);
                textView.setText(R.string.og_choose_an_account_title);
                textView.setTextAppearance(rrx.av(context2, R.attr.ogTextAppearanceSubhead1));
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
                try {
                    int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
                    typedArrayObtainStyledAttributes2.recycle();
                    textView.setTextColor(color);
                    textView.setGravity(1);
                    textView.setMaxLines(2);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    cww.p(textView, new qtm());
                    return textView;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            }
        };
        final int i3 = 2;
        this.f = new rma() { // from class: rgz
            @Override // defpackage.rma
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int i32 = i3;
                if (i32 == 0) {
                    FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
                    frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
                    return frameLayout;
                }
                if (i32 == 1) {
                    return rhd.c(layoutInflater);
                }
                if (i32 != 2) {
                    Context context = layoutInflater.getContext();
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, rgs.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
                    try {
                        typedArrayObtainStyledAttributes.getColor(4, rrx.aB(context, R.color.og_background_light));
                        typedArrayObtainStyledAttributes.getColor(10, rrx.aB(context, R.color.og_default_icon_color_light));
                        typedArrayObtainStyledAttributes.getColor(11, rrx.aB(context, R.color.og_incognito_top_tight_icon_color_light));
                        typedArrayObtainStyledAttributes.getColor(8, rrx.aB(context, R.color.og_menu_title_color_light));
                        typedArrayObtainStyledAttributes.getColor(9, rrx.aB(context, R.color.google_white));
                        Drawable drawable = AppCompatResources.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
                        typedArrayObtainStyledAttributes.recycle();
                        ImageView imageView = new ImageView(layoutInflater.getContext());
                        imageView.setImageDrawable(drawable);
                        return imageView;
                    } catch (Throwable th) {
                        typedArrayObtainStyledAttributes.recycle();
                        throw th;
                    }
                }
                Context context2 = layoutInflater.getContext();
                TextView textView = new TextView(context2);
                textView.setText(R.string.og_choose_an_account_title);
                textView.setTextAppearance(rrx.av(context2, R.attr.ogTextAppearanceSubhead1));
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
                try {
                    int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
                    typedArrayObtainStyledAttributes2.recycle();
                    textView.setTextColor(color);
                    textView.setGravity(1);
                    textView.setMaxLines(2);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    cww.p(textView, new qtm());
                    return textView;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            }
        };
        this.g = new rgx(rmeVar, qwnVar, rhaVar, wdsVar, 1);
        this.h = new rgx(rmeVar, qwnVar, rhaVar, wdsVar, 0);
        this.i = new rma() { // from class: rgy
            /* JADX WARN: Removed duplicated region for block: B:16:0x00fa  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0254  */
            @Override // defpackage.rma
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final android.view.View a(android.view.LayoutInflater r25, android.view.ViewGroup r26) throws android.content.res.Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 864
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rgy.a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
            }
        };
        this.j = new rgx(qwnVar, rhaVar, wdsVar, rmeVar, 2);
        this.k = new rma() { // from class: rgz
            @Override // defpackage.rma
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int i32 = i;
                if (i32 == 0) {
                    FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
                    frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
                    return frameLayout;
                }
                if (i32 == 1) {
                    return rhd.c(layoutInflater);
                }
                if (i32 != 2) {
                    Context context = layoutInflater.getContext();
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, rgs.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
                    try {
                        typedArrayObtainStyledAttributes.getColor(4, rrx.aB(context, R.color.og_background_light));
                        typedArrayObtainStyledAttributes.getColor(10, rrx.aB(context, R.color.og_default_icon_color_light));
                        typedArrayObtainStyledAttributes.getColor(11, rrx.aB(context, R.color.og_incognito_top_tight_icon_color_light));
                        typedArrayObtainStyledAttributes.getColor(8, rrx.aB(context, R.color.og_menu_title_color_light));
                        typedArrayObtainStyledAttributes.getColor(9, rrx.aB(context, R.color.google_white));
                        Drawable drawable = AppCompatResources.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
                        typedArrayObtainStyledAttributes.recycle();
                        ImageView imageView = new ImageView(layoutInflater.getContext());
                        imageView.setImageDrawable(drawable);
                        return imageView;
                    } catch (Throwable th) {
                        typedArrayObtainStyledAttributes.recycle();
                        throw th;
                    }
                }
                Context context2 = layoutInflater.getContext();
                TextView textView = new TextView(context2);
                textView.setText(R.string.og_choose_an_account_title);
                textView.setTextAppearance(rrx.av(context2, R.attr.ogTextAppearanceSubhead1));
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
                try {
                    int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
                    typedArrayObtainStyledAttributes2.recycle();
                    textView.setTextColor(color);
                    textView.setGravity(1);
                    textView.setMaxLines(2);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    cww.p(textView, new qtm());
                    return textView;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            }
        };
        this.b = new rhb(this);
        tko tkoVar = new tko(this, qwnVar, null);
        tko tkoVar2 = rmeVar.i;
        if (tkoVar2 != null && rmeVar.d) {
            tkoVar2.f();
        }
        rmeVar.i = tkoVar;
        if (rmeVar.d) {
            tkoVar.e();
        }
    }

    public static final qux b(qwn qwnVar, dvk dvkVar) {
        rfg rfgVar = qwnVar.e;
        tst tstVar = rfgVar.k;
        trk trkVar = trk.a;
        tst tstVar2 = rfgVar.g;
        if (tstVar2 == null) {
            throw new NullPointerException("Null criticalAlertFeature");
        }
        reb rebVarA = qux.a();
        rebVarA.b(rdd.k(dvkVar, trkVar, tstVar2));
        return rebVarA.a();
    }

    static /* synthetic */ View c(LayoutInflater layoutInflater) {
        View view = new View(layoutInflater.getContext());
        view.setVisibility(8);
        return view;
    }

    public final void a() {
        ExpandableDialogView expandableDialogView;
        qwn qwnVar = this.a;
        qwo qwoVar = qwnVar.b;
        int i = !qwoVar.b() ? 1 : qwoVar.e().isEmpty() ? 3 : qwoVar.a() != null ? 5 : 4;
        int i2 = this.m;
        if (i != i2) {
            this.m = i;
            a.ab(true);
            int i3 = i - 1;
            rma rmaVar = i3 != 0 ? i3 != 3 ? this.e : this.f : this.l;
            if (rmaVar == null) {
                throw new NullPointerException("Null headerViewProvider");
            }
            rma rmaVar2 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? this.i : this.h : this.g : this.j : this.k;
            if (rmaVar2 == null) {
                throw new NullPointerException("Null contentViewProvider");
            }
            rma rmaVar3 = i == 1 ? this.l : this.d;
            if (rmaVar3 == null) {
                throw new NullPointerException("Null footerViewProvider");
            }
            int iA = i3 != 1 ? i3 != 2 ? i3 != 3 ? R.string.og_account_and_settings : R.string.og_choose_an_account_title : R.string.og_sign_in_ : ((rfq) qwnVar.e.b.c()).a();
            rme rmeVar = this.c;
            rmg rmgVar = new rmg(rmaVar, rmaVar2, rmaVar3, iA);
            sjl.c();
            rmeVar.f = rmgVar;
            ExpandableDialogView expandableDialogView2 = rmeVar.g;
            if (expandableDialogView2 != null) {
                rmeVar.a(rmgVar, expandableDialogView2);
            }
            Dialog dialog = rmeVar.getDialog();
            if (dialog != null) {
                dialog.setTitle(rmgVar.d);
            }
        }
        if (i2 == 0) {
            rme rmeVar2 = this.c;
            sjl.c();
            SparseArray sparseArray = rmeVar2.e;
            if (sparseArray == null || (expandableDialogView = rmeVar2.g) == null) {
                return;
            }
            expandableDialogView.restoreHierarchyState(sparseArray);
        }
    }

    public final void d(int i) {
        qwn qwnVar = this.a;
        Object objA = qwnVar.b.a();
        vtw vtwVarM = wds.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wds wdsVar = (wds) vucVar;
        wdsVar.d = 1;
        wdsVar.b |= 2;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wds wdsVar2 = (wds) vucVar2;
        wdsVar2.f = 8;
        wdsVar2.b |= 32;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        vuc vucVar3 = vtwVarM.b;
        wds wdsVar3 = (wds) vucVar3;
        wdsVar3.e = 3;
        wdsVar3.b = 8 | wdsVar3.b;
        if (!vucVar3.A()) {
            vtwVarM.u();
        }
        ril rilVar = qwnVar.g;
        wds wdsVar4 = (wds) vtwVarM.b;
        wdsVar4.c = i - 1;
        wdsVar4.b |= 1;
        rilVar.a(objA, (wds) vtwVarM.r());
    }
}
