package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qxp implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qxp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, rhu] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, uht] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 7;
        qyn qynVar = null;
        Drawable drawable = null;
        qyn qynVar2 = null;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                ((bl) obj2).setStyle(0, R.style.OneGoogle_Dialog_Bento);
                qxr qxrVar = (qxr) obj2;
                qyb qybVarB = qxrVar.b();
                qybVarB.e.a = obj2;
                qyn qynVar3 = qxrVar.i;
                if (qynVar3 == null) {
                    yks.c("appStateDataInterface");
                } else {
                    qynVar = qynVar3;
                }
                qxrVar.e = new qyc(qynVar, qybVarB.a, new bw(obj2, 11), new psn(obj2, i));
                break;
            case 1:
                qyn qynVar4 = ((qxr) this.a).i;
                if (qynVar4 == null) {
                    yks.c("appStateDataInterface");
                } else {
                    qynVar2 = qynVar4;
                }
                tst tstVar = qynVar2.i;
                break;
            case 2:
                ((rdu) this.a).h.b().run();
                break;
            case 3:
                ((rdu) this.a).h.a().run();
                break;
            case 4:
                rfk rfkVar = (rfk) this.a;
                ImmutableList immutableListE = rfkVar.g.e();
                immutableListE.getClass();
                rfkVar.o(immutableListE);
                break;
            case 5:
                rfu rfuVar = (rfu) this.a;
                rfuVar.a(rfuVar.c);
                break;
            case 6:
                rgb rgbVar = (rgb) this.a;
                rgbVar.a(rgbVar.b);
                break;
            case 7:
                rgb rgbVar2 = (rgb) this.a;
                rgbVar2.a(rgbVar2.b);
                break;
            case 8:
                Object obj3 = this.a;
                tae taeVar = (tae) obj3;
                Object obj4 = taeVar.g;
                AccountParticleDisc accountParticleDisc = (AccountParticleDisc) obj4;
                unx unxVar = accountParticleDisc.n;
                qtz qtzVar = (unxVar == null || (obj = unxVar.a) == null) ? null : (qtz) ((qua) obj).a.f();
                if (qtzVar == null || qtzVar.c != 8) {
                    accountParticleDisc.setOnClickListener(null);
                    accountParticleDisc.setClickable(false);
                    accountParticleDisc.setContentDescription(null);
                    int[] iArr = cww.a;
                    View view = (View) obj4;
                    view.setImportantForAccessibility(4);
                    view.setBackground(null);
                    break;
                } else {
                    rhz rhzVar = new rhz(new phn(obj3, i));
                    ?? r0 = taeVar.f;
                    rhzVar.d = r0.b();
                    rhzVar.e = r0.a();
                    accountParticleDisc.setOnClickListener(new rhy(rhzVar));
                    accountParticleDisc.setContentDescription(accountParticleDisc.getResources().getString(R.string.og_obake_feature_a11y));
                    int[] iArr2 = cww.a;
                    View view2 = (View) obj4;
                    view2.setImportantForAccessibility(1);
                    int iAk = rrx.ak(accountParticleDisc.getContext());
                    if (iAk != 0) {
                        drawable = accountParticleDisc.getContext().getDrawable(iAk);
                        if (drawable instanceof RippleDrawable) {
                            ((RippleDrawable) drawable).setRadius(taeVar.a / 2);
                        }
                    }
                    view2.setBackground(drawable);
                    break;
                }
                break;
            case 9:
                sjl.c();
                ExpandableDialogView expandableDialogView = ((rme) this.a).g;
                if (expandableDialogView != null) {
                    View viewFindViewById = expandableDialogView.findViewById(R.id.og_container_disable_content_view);
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.setOnClickListener(new ras(3));
                    break;
                }
                break;
            case 10:
                ((bl) this.a).dismiss();
                break;
            case 11:
                rhp rhpVar = (rhp) this.a;
                if (rhpVar.p.g()) {
                    Object objC = rhpVar.p.c();
                    Context context = rhpVar.getContext();
                    Object objA = rhpVar.n.b.a();
                    ViewGroup viewGroup = rhpVar.e;
                    ((quy) objC).r(context, objA, viewGroup, rhpVar.l, viewGroup, rhpVar.i, true, rhpVar.q.b);
                    break;
                }
                break;
            case 12:
                ((rzy) this.a).q();
                break;
            case 13:
                ((rhy) this.a).a = false;
                break;
            case 14:
                ((snf) ((riv) ((rzy) this.a).a.get()).i.get()).b(new Object[0]);
                break;
            case 15:
                ExpandableDialogView expandableDialogView2 = (ExpandableDialogView) this.a;
                expandableDialogView2.setSystemUiVisibility(expandableDialogView2.getSystemUiVisibility() & (-17));
                if (!expandableDialogView2.h()) {
                    expandableDialogView2.setSystemUiVisibility(expandableDialogView2.getSystemUiVisibility() | 16);
                }
                expandableDialogView2.g();
                break;
            case 16:
                ((rme) this.a).c();
                break;
            case 17:
                unc uncVar = (unc) ((unc) this.a).e;
                ((rnt) uncVar.e).a(new rnz(uncVar));
                break;
            case 18:
                rpb rpbVar = (rpb) this.a;
                rmp rmpVar = rpbVar.h;
                rmpVar.getClass();
                if (rpbVar.b == 0) {
                    rpbVar.c = true;
                    Iterator it = rpbVar.g.iterator();
                    while (it.hasNext()) {
                        ((roo) it.next()).k(rmpVar);
                    }
                }
                rpbVar.h.getClass();
                rpbVar.a();
                break;
            case 19:
                ((rqm) this.a).a();
                break;
            default:
                rro rroVar = (rro) this.a;
                if (((Boolean) rroVar.h.b()).booleanValue()) {
                    rnt rntVar = rroVar.j;
                    Iterator it2 = rntVar.b.iterator();
                    while (it2.hasNext()) {
                        ufn.j(((rnw) it2.next()).a(), new pbb(rntVar, 13), rntVar.a);
                    }
                }
                unc uncVar2 = rroVar.k;
                if (((Boolean) uncVar2.b.b()).booleanValue()) {
                    uncVar2.a.scheduleWithFixedDelay(new qxp(uncVar2, 17), Math.round(((Long) uncVar2.c.b()).longValue() + (((Random) uncVar2.f).nextDouble() * ((Long) r4.b()).longValue())), ((Long) uncVar2.d.b()).longValue(), TimeUnit.MILLISECONDS);
                    break;
                }
                break;
        }
    }
}
