package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;
import com.google.android.katniss.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hia extends hhy implements hmv {
    public ViewGroup aA;
    View aB;
    View aC;
    ConstraintLayout aD;
    aac aE;
    public hjx aF;
    public boolean ay;
    LogoView az;

    @Override // defpackage.hhw, defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.preview_card_container, viewGroup, false).findViewById(R.id.preview_card_container);
        this.aA = viewGroup2;
        this.aB = super.D(layoutInflater, viewGroup2, bundle);
        this.aC = ((hhw) this).d;
        this.aA.addView(this.aB, new ViewGroup.LayoutParams(0, -2));
        LogoView logoView = (LogoView) this.aA.findViewById(R.id.preview_logo_view);
        this.az = logoView;
        hvh.a(logoView);
        this.az.d(10, true);
        this.aD = (ConstraintLayout) this.aA;
        aac aacVar = new aac();
        this.aE = aacVar;
        aacVar.c(this.aD);
        this.aE.j(this.aB.getId(), 3, 3, 0);
        this.aE.j(this.aB.getId(), 6, 6, (int) dZ().getResources().getDimension(R.dimen.amati_search_bar_text_margin_from_parent_start));
        this.aE.j(this.aB.getId(), 7, 7, 0);
        this.aE.b(this.aD);
        this.ay = true;
        hho.c(true, this.ax);
        return this.aA;
    }

    @Override // defpackage.hmv
    public final boolean aI() {
        return false;
    }

    @Override // defpackage.hmv
    public final boolean aJ() {
        return this.ay;
    }
}
