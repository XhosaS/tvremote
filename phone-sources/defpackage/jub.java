package defpackage;

import android.view.View;
import com.google.android.apps.googletv.app.presentation.pages.myepisodes.MyEpisodesActivity;
import com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferencesActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jub implements sch {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jub(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.sch
    public final void a(Object obj, View view) {
        MyEpisodesActivity myEpisodesActivityH;
        idr idrVarA;
        idr idrVarB;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                ((isi) ((jtz) obj2).e).e(new ill(obj2, 15));
                break;
            case 1:
                Object obj3 = this.a;
                ((isi) ((jry) obj3).d).e(new ill(obj3, 14));
                break;
            case 2:
                Object obj4 = this.a;
                ((isi) ((jui) obj4).e).e(new ill(obj4, 16));
                break;
            case 3:
                Object obj5 = this.a;
                View.OnClickListener onClickListener = ((jxv) obj5).c;
                if (onClickListener == null) {
                    ((bl) obj5).dismiss();
                    break;
                } else {
                    onClickListener.onClick(view);
                    break;
                }
            case 4:
                Object obj6 = this.a;
                View.OnClickListener onClickListener2 = ((jxv) obj6).b;
                if (onClickListener2 == null) {
                    ((bl) obj6).dismiss();
                    break;
                } else {
                    onClickListener2.onClick(view);
                    break;
                }
            case 5:
                ((NotificationPreferencesActivity) this.a).recreate();
                break;
            case 6:
                Object obj7 = this.a;
                kea keaVar = (kea) obj7;
                jaf jafVar = keaVar.a;
                if (jafVar == null) {
                    yks.c("veLogger");
                    jafVar = null;
                }
                jafVar.c(view);
                keaVar.e.a();
                ((bl) obj7).dismiss();
                break;
            case 7:
                ((bl) this.a).dismiss();
                break;
            case 8:
                jei jeiVarF = jbr.f(view);
                Object obj8 = this.a;
                if (jeiVarF != null && (idrVarB = jeiVarF.b()) != null) {
                    vtw vtwVarM = wll.a.m();
                    vtwVarM.getClass();
                    wbb.t(((kfr) obj8).b, vtwVarM);
                    idrVarB.c(wbb.s(vtwVarM));
                }
                String str = ((kfr) obj8).c;
                if (str != null && (myEpisodesActivityH = jbr.h(view)) != null && (idrVarA = myEpisodesActivityH.a()) != null) {
                    vtw vtwVarM2 = wni.a.m();
                    vtwVarM2.getClass();
                    wcq.M(str, vtwVarM2);
                    wcq.N(5, vtwVarM2);
                    idrVarA.c(wcq.L(vtwVarM2));
                }
                bl blVarL = ihz.L(view);
                if (blVarL != null) {
                    blVarL.dismiss();
                    break;
                }
                break;
            case 9:
                ((ulp) this.a).ay(new mnx());
                break;
            default:
                int i = ((mob) this.a).a - 1;
                if (i == 0) {
                    kff.s(view, new mos());
                    break;
                } else if (i == 1) {
                    kff.s(view, new mos());
                    break;
                }
                break;
        }
    }
}
