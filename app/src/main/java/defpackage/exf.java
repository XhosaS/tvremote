package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class exf extends ewp {
    public jpj e;

    @Override // defpackage.ewp
    protected void B() {
        this.e.g();
    }

    @Override // defpackage.ewp, defpackage.jpg
    public final void eA(Context context, exh exhVar, jpl jplVar, Intent intent) {
        super.eA(context, exhVar, jplVar, intent);
        exg exgVar = this.b;
        exgVar.getClass();
        ViewGroup decorView = exgVar.getDecorView();
        jpj jpjVar = new jpj();
        bel belVar = new bel();
        jpjVar.g = exgVar;
        jpjVar.e = new wiz(this, jpjVar);
        wiz wizVar = jpjVar.e;
        ui uiVar = jpjVar.d;
        decorView.getClass();
        jpjVar.f = new cc(new wjb(jpjVar, wizVar, uiVar, new wja(decorView)));
        jpjVar.h = belVar;
        jpjVar.e.a.dN();
        this.e = jpjVar;
    }

    @Override // defpackage.ewp
    public void f() {
        if (this.e.eE().Y()) {
            return;
        }
        eD();
    }

    @Override // defpackage.ewp
    protected void g() {
        bcl bclVar;
        jpj jpjVar = this.e;
        View decorView = ((exg) jpjVar.g).getDecorView();
        decorView.getClass();
        while (true) {
            if (decorView == null) {
                bclVar = null;
                break;
            }
            Object tag = decorView.getTag(R.id.view_tree_lifecycle_owner);
            bclVar = tag instanceof bcl ? (bcl) tag : null;
            if (bclVar != null) {
                break;
            }
            ViewParent parent = decorView.getParent();
            if (parent == null) {
                Object tag2 = decorView.getTag(R.id.view_tree_disjoint_parent);
                parent = tag2 instanceof ViewParent ? (ViewParent) tag2 : null;
            }
            decorView = parent instanceof View ? parent : null;
        }
        if (bclVar == jpjVar) {
            ben.a(((exg) jpjVar.g).getDecorView(), null);
            beo.a(((exg) jpjVar.g).getDecorView(), null);
            bqt.a(((exg) jpjVar.g).getDecorView(), null);
        }
        jpjVar.a.a = null;
        jpjVar.h.c();
        cc ccVar = jpjVar.f;
        ccVar.getClass();
        ccVar.c();
        jpjVar.b.e(bce.ON_DESTROY);
        this.e = null;
    }

    @Override // defpackage.ewp
    protected void k() {
        this.e.a();
    }

    @Override // defpackage.ewp
    protected void m() {
        this.e.b();
    }

    @Override // defpackage.ewp
    protected void n() {
        this.e.e();
    }

    @Override // defpackage.ewp
    protected void o() {
        this.e.f();
    }

    @Override // defpackage.ewp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z = this.b.e;
        jpj jpjVar = this.e;
        configuration.getClass();
        cc ccVar = jpjVar.f;
        ccVar.getClass();
        ccVar.a.e.n(configuration, true);
        Window window = jpjVar.g;
    }
}
