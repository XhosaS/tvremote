package com.google.android.apps.googletv.app.device.presentation.fab;

import android.content.Context;
import android.os.Build;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.videos.R;
import defpackage.by;
import defpackage.cqx;
import defpackage.gag;
import defpackage.gp;
import defpackage.gwp;
import defpackage.gy;
import defpackage.hju;
import defpackage.igw;
import defpackage.ihg;
import defpackage.ith;
import defpackage.itk;
import defpackage.itm;
import defpackage.iua;
import defpackage.iui;
import defpackage.iul;
import defpackage.iuy;
import defpackage.ivw;
import defpackage.pid;
import defpackage.pjx;
import defpackage.sip;
import defpackage.stk;
import defpackage.ykn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaDeviceFloatingActionButton extends stk {
    public static final /* synthetic */ int d = 0;
    private itk I;
    private ihg J;
    private boolean K;
    public gp a;
    public final String[] b;
    public gag c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDeviceFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"} : new String[]{"android.permission.ACCESS_FINE_LOCATION"};
    }

    public final void b() {
        itk itkVar = this.I;
        if (itkVar == null) {
            return;
        }
        ihg ihgVar = this.J;
        if (ihgVar == null || !ihgVar.d()) {
            Context context = getContext();
            context.getClass();
            new iui(context, itkVar, new gwp(20), null, 52).i();
        } else {
            Context context2 = getContext();
            context2.getClass();
            new iul(context2, itkVar, new gwp(19)).h();
        }
    }

    public final void c() {
        itk itkVar = this.I;
        if (itkVar != null) {
            List listF = itkVar.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (((ith) obj).p()) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            setText(size == 0 ? getResources().getString(R.string.media_device_fab_empty_title) : getResources().getQuantityString(R.plurals.media_device_fab_title, size, Integer.valueOf(size)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [idr, java.lang.Object] */
    public final void d() {
        ith ithVarE;
        itk itkVar = this.I;
        setVisibility((itkVar == null || (ithVarE = itkVar.e()) == null || ((iua) ithVarE).d) ? 0 : 8);
        if (getVisibility() != 0) {
            this.K = false;
        }
        if (this.K || getVisibility() != 0 || getHeight() <= 0) {
            return;
        }
        this.K = true;
        gag gagVar = this.c;
        if (gagVar != null) {
            int height = getHeight();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.getClass();
            gagVar.b.c(Integer.valueOf(height + ((cqx) layoutParams).bottomMargin + this.e.h));
        }
    }

    public final void e(itk itkVar, gag gagVar, pjx pjxVar, ihg ihgVar) {
        itkVar.getClass();
        gagVar.getClass();
        pjxVar.getClass();
        ihgVar.getClass();
        this.I = itkVar;
        this.c = gagVar;
        this.J = ihgVar;
        Context context = getContext();
        context.getClass();
        by byVarF = hju.F(context);
        final int i = 1;
        this.a = byVarF != null ? byVarF.registerForActivityResult(new gy(), new pid(itkVar, this, i)) : null;
        m(AppCompatResources.getDrawable(getContext(), R.drawable.gs_youtube_linked_tv_vd_theme_48));
        final int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.fab_margin);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        final cqx cqxVar = (cqx) layoutParams;
        k(getResources().getDimensionPixelOffset(R.dimen.fab_radius));
        setElevation(getResources().getDimension(R.dimen.fab_elevation));
        setBackgroundColor(sip.c(this, R.attr.colorPrimaryContainer));
        ihg ihgVar2 = this.J;
        if (ihgVar2 != null && ihgVar2.e()) {
            int i2 = igw.a;
            setBackgroundColor(igw.c);
        }
        cqxVar.setMarginEnd(getResources().getDimensionPixelOffset(R.dimen.fab_margin));
        cqxVar.bottomMargin = dimensionPixelOffset;
        cqxVar.b(new ivw(this));
        requestLayout();
        if (Build.VERSION.SDK_INT >= 30) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ivv
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    if (i != 0) {
                        view.getClass();
                        windowInsets.getClass();
                        cqxVar.bottomMargin = windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom + dimensionPixelOffset;
                        this.requestLayout();
                        return windowInsets;
                    }
                    view.getClass();
                    windowInsets.getClass();
                    cqxVar.bottomMargin = windowInsets.getSystemWindowInsetBottom() + dimensionPixelOffset;
                    this.requestLayout();
                    return windowInsets;
                }
            });
        } else {
            final int i3 = 0;
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ivv
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    if (i3 != 0) {
                        view.getClass();
                        windowInsets.getClass();
                        cqxVar.bottomMargin = windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom + dimensionPixelOffset;
                        this.requestLayout();
                        return windowInsets;
                    }
                    view.getClass();
                    windowInsets.getClass();
                    cqxVar.bottomMargin = windowInsets.getSystemWindowInsetBottom() + dimensionPixelOffset;
                    this.requestLayout();
                    return windowInsets;
                }
            });
        }
        setOnClickListener(new iuy(pjxVar, this, 2));
        itkVar.b().ea(new itm(this, 7));
        itkVar.c().ea(new itm(this, 8));
        c();
        d();
        y();
    }

    public /* synthetic */ MediaDeviceFloatingActionButton(Context context, AttributeSet attributeSet, int i, ykn yknVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
