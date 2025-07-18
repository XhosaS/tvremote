package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mtx implements oec {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final oaa b;
    public final mtb c;
    private final ogr d;

    public mtx(oaa oaaVar, ogr ogrVar, mtb mtbVar) {
        this.b = oaaVar;
        this.d = ogrVar;
        Boolean bool = false;
        bool.getClass();
        this.c = mtbVar;
        bool.getClass();
        bool.getClass();
    }

    public static float d(DisplayMetrics displayMetrics, float f) {
        displayMetrics.getClass();
        return (f / displayMetrics.density) + 0.5f;
    }

    public static actj e(View view, ofs ofsVar, float f, float f2) {
        float left = view.getLeft();
        float top = view.getTop();
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        float fA = ofsVar.a();
        float fB = ofsVar.b();
        float fA2 = left + ofsVar.a() + translationX;
        float fB2 = top + ofsVar.b() + translationY;
        float fA3 = f + ofsVar.a();
        float fB3 = f2 + ofsVar.b();
        actj actjVar = actj.a;
        acti actiVar = new acti();
        acyb acybVar = acyb.a;
        acya acyaVar = new acya();
        float fD = d(displayMetrics, fA);
        if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar.y();
        }
        acyb acybVar2 = (acyb) acyaVar.b;
        acybVar2.b |= 1;
        acybVar2.c = fD;
        float fD2 = d(displayMetrics, fB);
        if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar.y();
        }
        acyb acybVar3 = (acyb) acyaVar.b;
        acybVar3.b |= 2;
        acybVar3.d = fD2;
        if ((actiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actiVar.y();
        }
        actj actjVar2 = (actj) actiVar.b;
        acyb acybVar4 = (acyb) acyaVar.v();
        acybVar4.getClass();
        actjVar2.c = acybVar4;
        actjVar2.b |= 1;
        acya acyaVar2 = new acya();
        float fD3 = d(displayMetrics, fA2);
        if ((acyaVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar2.y();
        }
        acyb acybVar5 = (acyb) acyaVar2.b;
        acybVar5.b |= 1;
        acybVar5.c = fD3;
        float fD4 = d(displayMetrics, fB2);
        if ((acyaVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar2.y();
        }
        acyb acybVar6 = (acyb) acyaVar2.b;
        acybVar6.b |= 2;
        acybVar6.d = fD4;
        if ((actiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actiVar.y();
        }
        actj actjVar3 = (actj) actiVar.b;
        acyb acybVar7 = (acyb) acyaVar2.v();
        acybVar7.getClass();
        actjVar3.d = acybVar7;
        actjVar3.b |= 2;
        acya acyaVar3 = new acya();
        float fD5 = d(displayMetrics, fA3);
        if ((acyaVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar3.y();
        }
        acyb acybVar8 = (acyb) acyaVar3.b;
        acybVar8.b |= 1;
        acybVar8.c = fD5;
        float fD6 = d(displayMetrics, fB3);
        if ((acyaVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar3.y();
        }
        acyb acybVar9 = (acyb) acyaVar3.b;
        acybVar9.b |= 2;
        acybVar9.d = fD6;
        if ((actiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actiVar.y();
        }
        actj actjVar4 = (actj) actiVar.b;
        acyb acybVar10 = (acyb) acyaVar3.v();
        acybVar10.getClass();
        actjVar4.e = acybVar10;
        actjVar4.b |= 4;
        return (actj) actiVar.v();
    }

    public static actl f(View view) {
        float width;
        float height;
        float width2 = view.getWidth();
        float height2 = view.getHeight();
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        float fWidth = rect.width();
        float fHeight = rect.height();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            width = view2.getWidth();
            height = view2.getHeight();
        } else {
            width = 0.0f;
            height = 0.0f;
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        acub acubVar = acub.a;
        acua acuaVar = new acua();
        acys acysVar = acys.a;
        acyr acyrVar = new acyr();
        float fD = d(displayMetrics, width2);
        if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar.y();
        }
        acys acysVar2 = (acys) acyrVar.b;
        acysVar2.b |= 1;
        acysVar2.c = fD;
        float fD2 = d(displayMetrics, height2);
        if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar.y();
        }
        acys acysVar3 = (acys) acyrVar.b;
        acysVar3.b |= 2;
        acysVar3.d = fD2;
        if ((acuaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acuaVar.y();
        }
        acub acubVar2 = (acub) acuaVar.b;
        acys acysVar4 = (acys) acyrVar.v();
        acysVar4.getClass();
        acubVar2.c = acysVar4;
        acubVar2.b |= 1;
        acub acubVar3 = (acub) acuaVar.v();
        acua acuaVar2 = new acua();
        acyr acyrVar2 = new acyr();
        float fD3 = d(displayMetrics, width);
        if ((acyrVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar2.y();
        }
        acys acysVar5 = (acys) acyrVar2.b;
        acysVar5.b |= 1;
        acysVar5.c = fD3;
        float fD4 = d(displayMetrics, height);
        if ((acyrVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar2.y();
        }
        acys acysVar6 = (acys) acyrVar2.b;
        acysVar6.b |= 2;
        acysVar6.d = fD4;
        if ((acuaVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acuaVar2.y();
        }
        acub acubVar4 = (acub) acuaVar2.b;
        acys acysVar7 = (acys) acyrVar2.v();
        acysVar7.getClass();
        acubVar4.c = acysVar7;
        acubVar4.b |= 1;
        acub acubVar5 = (acub) acuaVar2.v();
        acua acuaVar3 = new acua();
        acyr acyrVar3 = new acyr();
        float fD5 = d(displayMetrics, fWidth);
        if ((acyrVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar3.y();
        }
        acys acysVar8 = (acys) acyrVar3.b;
        acysVar8.b |= 1;
        acysVar8.c = fD5;
        float fD6 = d(displayMetrics, fHeight);
        if ((acyrVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar3.y();
        }
        acys acysVar9 = (acys) acyrVar3.b;
        acysVar9.b |= 2;
        acysVar9.d = fD6;
        if ((acuaVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acuaVar3.y();
        }
        acub acubVar6 = (acub) acuaVar3.b;
        acys acysVar10 = (acys) acyrVar3.v();
        acysVar10.getClass();
        acubVar6.c = acysVar10;
        acubVar6.b |= 1;
        acub acubVar7 = (acub) acuaVar3.v();
        actl actlVar = actl.a;
        actk actkVar = new actk();
        if ((actkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actkVar.y();
        }
        actl actlVar2 = (actl) actkVar.b;
        acubVar3.getClass();
        actlVar2.d = acubVar3;
        actlVar2.c |= 1;
        if ((actkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actkVar.y();
        }
        actl actlVar3 = (actl) actkVar.b;
        acubVar5.getClass();
        actlVar3.e = acubVar5;
        actlVar3.c |= 2;
        if ((actkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actkVar.y();
        }
        actl actlVar4 = (actl) actkVar.b;
        acubVar7.getClass();
        actlVar4.f = acubVar7;
        actlVar4.c |= 4;
        return (actl) actkVar.v();
    }

    public static nzx g(View view, View view2, int i, ofs ofsVar, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, obz obzVar, nzw nzwVar, oal oalVar, MotionEvent motionEvent) {
        nzv nzvVarP = nzx.p();
        nzvVarP.f(view);
        nyu nyuVar = (nyu) nzvVarP;
        nyuVar.a = view2;
        nyuVar.h = i;
        nyuVar.b = ofsVar;
        nyuVar.f = oalVar;
        nyuVar.e = ((nyx) oalVar).q;
        if (nzwVar != null) {
            nzvVarP = nzwVar.a(nzvVarP);
        }
        if (senderStateOuterClass$SenderState != null) {
            nyu nyuVar2 = (nyu) nzvVarP;
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = nyuVar2.c;
            if (senderStateOuterClass$SenderState2 == null) {
                nyuVar2.c = senderStateOuterClass$SenderState;
            } else {
                acyk acykVar = new acyk();
                acykVar.B(senderStateOuterClass$SenderState2);
                acykVar.B(senderStateOuterClass$SenderState);
                nyuVar2.c = (SenderStateOuterClass$SenderState) acykVar.v();
            }
        }
        nyu nyuVar3 = (nyu) nzvVarP;
        nyuVar3.g = motionEvent;
        nyuVar3.d = obzVar;
        return nzvVarP.e();
    }

    static SenderStateOuterClass$SenderState h(ofs ofsVar, DisplayMetrics displayMetrics) {
        actz actzVar = actz.a;
        acty actyVar = new acty();
        actx actxVar = actx.a;
        actw actwVar = new actw();
        acyb acybVar = acyb.a;
        acya acyaVar = new acya();
        nzd nzdVar = (nzd) ofsVar;
        float fD = d(displayMetrics, nzdVar.a);
        if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar.y();
        }
        acyb acybVar2 = (acyb) acyaVar.b;
        acybVar2.b |= 1;
        acybVar2.c = fD;
        float fD2 = d(displayMetrics, nzdVar.b);
        if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar.y();
        }
        acyb acybVar3 = (acyb) acyaVar.b;
        acybVar3.b |= 2;
        acybVar3.d = fD2;
        if ((actwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actwVar.y();
        }
        actx actxVar2 = (actx) actwVar.b;
        acyb acybVar4 = (acyb) acyaVar.v();
        acybVar4.getClass();
        actxVar2.c = acybVar4;
        actxVar2.b |= 1;
        if ((actyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actyVar.y();
        }
        actz actzVar2 = (actz) actyVar.b;
        actx actxVar3 = (actx) actwVar.v();
        actxVar3.getClass();
        actzVar2.d = actxVar3;
        actzVar2.c |= 1;
        actz actzVar3 = (actz) actyVar.v();
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
        acyk acykVar = new acyk();
        acykVar.f(actz.b, actzVar3);
        return (SenderStateOuterClass$SenderState) acykVar.v();
    }

    @Override // defpackage.oec
    public final mii a() {
        return ngv.H;
    }

    @Override // defpackage.oee
    public final /* synthetic */ void b(dru druVar, oal oalVar, String str, Object obj, obz obzVar, nzw nzwVar) {
        throw null;
    }

    @Override // defpackage.oee
    public final /* bridge */ /* synthetic */ void c(dru druVar, oal oalVar, String str, niv nivVar, Object obj, final obz obzVar, nzw nzwVar) {
        ngv ngvVar = (ngv) obj;
        if (ngvVar.N()) {
            obzVar.x(new mtn(this, nivVar, this.d.o(ngvVar.s(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.B()) {
            obzVar.j(new mtp(this, this.d.o(ngvVar.h(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.A()) {
            obzVar.h(new mtq(this, this.d.o(ngvVar.g(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.F()) {
            obzVar.p(new mtr(this, this.d.o(ngvVar.k(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.G()) {
            obzVar.q(new mts(this, this.d.o(ngvVar.l(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.H()) {
            obzVar.r(new mtt(this, this.d.o(ngvVar.m(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.C()) {
            ngy ngyVarY = ngvVar.y();
            if (ngyVarY.i()) {
                obzVar.l(new mtu(this, this.d.o(ngyVarY.g(), oalVar), obzVar, nzwVar, oalVar));
            }
            if (ngyVarY.j()) {
                obzVar.k(new mtv(this, this.d.o(ngyVarY.h(), oalVar), obzVar, nzwVar, oalVar));
            }
            Context context = druVar.a;
            int iK = ngyVarY.k() - 1;
            obzVar.H(iK != 0 ? iK != 1 ? new ogc(context, 45.0f, 90.0f) : new ogc(context, 0.0f, 45.0f) : new ogc(context, 0.0f, 90.0f));
            obzVar.a().P(true);
        }
        if (ngvVar.M()) {
            obzVar.w(new mtw(this, this.d.o(ngvVar.r(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.I()) {
            obzVar.v(new mtd(this, this.d.o(ngvVar.n(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.J()) {
            obzVar.u(new mte(this, this.d.o(ngvVar.o(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.K()) {
            obzVar.t(new mtf(this, this.d.o(ngvVar.p(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.L()) {
            obzVar.s(new mtg(this, this.d.o(ngvVar.q(), oalVar), obzVar, nzwVar, oalVar));
            obzVar.a().P(true);
        }
        if (ngvVar.D()) {
            obzVar.m(new mth(this, ngvVar, this.d.o(ngvVar.i(), oalVar), obzVar, nzwVar, oalVar));
        }
        if (ngvVar.S()) {
            obzVar.C(new mti(this, this.d.o(ngvVar.x(), oalVar), obzVar, nzwVar, oalVar));
        }
        if (ngvVar.E()) {
            obzVar.o(new mtj(this, this.d.o(ngvVar.j(), oalVar), obzVar, nzwVar, oalVar));
        }
        if (ngvVar.T()) {
            ogm.c(ngvVar.z(), new ogl() { // from class: mtc
                @Override // defpackage.ogl
                public final void a(int i, nhn nhnVar) {
                    Set set = mtx.a;
                    obzVar.a().J(i, nhnVar.g());
                }
            });
        }
        if (ngvVar.O()) {
            obzVar.z(new mtk(this, this.d.o(ngvVar.t(), oalVar), obzVar, nzwVar, oalVar));
        }
        if (ngvVar.Q()) {
            obzVar.B(new mtl(this, this.d.o(ngvVar.v(), oalVar), obzVar, nzwVar, oalVar));
        }
        if (ngvVar.R()) {
            obzVar.A(new mtm(this, this.d.o(ngvVar.w(), oalVar), obzVar, nzwVar, oalVar));
        }
        if (ngvVar.P()) {
            obzVar.y(new mto(this, this.d.o(ngvVar.u(), oalVar), obzVar, nzwVar, oalVar));
        }
    }
}
