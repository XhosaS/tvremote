package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.notifications.platform.executor.impl.GnpExecutorApiService;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pqi implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pqi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, prj] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, prj] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, ofj] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qth] */
    @Override // java.lang.Runnable
    public final void run() {
        String string;
        int i = 5;
        int i2 = 2;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                ((pqk) this.a).c();
                return;
            case 1:
                Object obj = this.a;
                pqk pqkVar = (pqk) obj;
                pqw pqwVar = pqkVar.g;
                if (pqwVar != null) {
                    pqwVar.bringToFront();
                    if (pqkVar.k) {
                        return;
                    }
                    pqkVar.k = true;
                    tbk tbkVarE = pqkVar.e();
                    if (tbkVarE != null) {
                        ((tvk) pgz.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onAttached", 50, "FeatureHighlightController.java")).s("FeatureHighlight attached");
                    }
                    by activity = ((bv) obj).getActivity();
                    View viewA = activity == null ? null : pqkVar.a.a(activity, pqkVar.a());
                    if (viewA == null) {
                        if (tbkVarE != null) {
                            ((tvk) pgz.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onViewNotFound", 109, "FeatureHighlightController.java")).s("FeatureHighlight view not found");
                            pgz pgzVar = (pgz) tbkVarE.b;
                            pgzVar.e.j(pgzVar.b, pfq.FAILED_VIEW_NOT_FOUND);
                        }
                        pqkVar.c();
                        return;
                    }
                    pqkVar.g.j = pqkVar.a();
                    pqkVar.g.s(new pqj(pqkVar));
                    if (pqkVar.h == 1) {
                        if (pqkVar.j) {
                            pqw pqwVar2 = pqkVar.g;
                            pqwVar2.k(viewA);
                            pqwVar2.addOnLayoutChangeListener(new fta(pqwVar2, 2, null));
                            pqwVar2.requestLayout();
                            return;
                        }
                        pqw pqwVar3 = pqkVar.g;
                        pqi pqiVar = new pqi(obj, i2);
                        pqwVar3.k(viewA);
                        pqwVar3.addOnLayoutChangeListener(new jco(pqwVar3, (Runnable) pqiVar, 4));
                        pqwVar3.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                tbk tbkVarE2 = ((pqk) this.a).e();
                if (tbkVarE2 != null) {
                    ((tvk) pgz.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onShow", 72, "FeatureHighlightController.java")).s("FeatureHighlight shown");
                    pgz pgzVar2 = (pgz) tbkVarE2.b;
                    pgzVar2.e.j(pgzVar2.b, pfq.SUCCESS);
                    return;
                }
                return;
            case 3:
                ((pqk) this.a).b(5);
                return;
            case 4:
                ((pqk) this.a).c();
                return;
            case 5:
                pqw pqwVar4 = ((pqv) this.a).b;
                if (pqwVar4.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pqwVar4.getParent()).removeView(pqwVar4);
                    return;
                }
                return;
            case 6:
                this.a.b();
                return;
            case 7:
                this.a.a();
                return;
            case 8:
                ((qee) this.a).a.cancel(false);
                return;
            case 9:
                ((qgp) this.a).a();
                return;
            case 10:
                r0.c--;
                ((GnpExecutorApiService) this.a).a();
                return;
            case 11:
                ((AccountParticleDisc) this.a).o();
                return;
            case 12:
                AccountParticleDisc accountParticleDisc = (AccountParticleDisc) this.a;
                quj qujVar = accountParticleDisc.e;
                if (qujVar != null) {
                    qujVar.a(AccountParticleDisc.r(accountParticleDisc.n), true);
                    return;
                }
                return;
            case 13:
                Object obj2 = this.a;
                final qtx qtxVar = (qtx) obj2;
                Object obj3 = qtxVar.c;
                Map map = qty.a;
                ImageView imageView = (ImageView) ((WeakReference) obj3).get();
                if (qtxVar.b || imageView == null) {
                    return;
                }
                if (qtxVar.a == null) {
                    try {
                        ((qtx) obj2).b(imageView.getContext());
                        return;
                    } catch (IllegalStateException unused) {
                        rrx.ac(new qto(obj2, imageView, i, bArr));
                        return;
                    }
                }
                Integer num = (Integer) rrx.X(imageView).e(0);
                final int iIntValue = num.intValue();
                ?? r1 = qtxVar.f;
                Object obj4 = qtxVar.a;
                Locale locale = Locale.ROOT;
                if (obj4 == null) {
                    string = "null";
                } else {
                    StringBuilder sb = new StringBuilder(r1.c(obj4));
                    String strE = r1.e(obj4);
                    if (strE != null) {
                        sb.append(" ");
                        sb.append(strE);
                    }
                    string = sb.toString();
                }
                final String str = String.format(locale, "%s %s", string, num);
                Drawable drawable = (Drawable) qty.a.get(str);
                if (drawable != null) {
                    qtxVar.e(drawable, true);
                    return;
                }
                Object obj5 = qtxVar.d;
                final Drawable drawable2 = (Drawable) qty.b.get(str);
                if (drawable2 != null) {
                    qtxVar.e(drawable2, false);
                }
                rif rifVar = (rif) obj5;
                final rih rihVar = rifVar.b;
                rifVar.a.a(obj4, iIntValue, new rig() { // from class: qtv
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qth] */
                    @Override // defpackage.rig
                    public final void a(Bitmap bitmap) {
                        qtx qtxVar2 = qtxVar;
                        if (qtxVar2.b) {
                            return;
                        }
                        String str2 = str;
                        if (bitmap != null) {
                            qtxVar2.d(new lke((Object) qtxVar2, (Object) bitmap, (Object) str2, 16, (byte[]) null));
                            return;
                        }
                        Drawable drawable3 = drawable2;
                        if (drawable3 != null) {
                            qtxVar2.e(drawable3, true);
                        } else if (!cb.z(rii.a(qtxVar2.a, qtxVar2.f))) {
                            rrx.ac(new pqi(qtxVar2, 14));
                        } else {
                            qtxVar2.d(new fqc(qtxVar2, rihVar, iIntValue, str2, 2));
                        }
                    }
                });
                return;
            case 14:
                ((qtx) this.a).c();
                return;
            case 15:
                ((View) this.a).requestLayout();
                return;
            case 16:
                SelectedAccountDisc selectedAccountDisc = ((qwb) this.a).b;
                selectedAccountDisc.setContentDescription(null);
                int[] iArr = cww.a;
                selectedAccountDisc.setImportantForAccessibility(4);
                return;
            case 17:
                ((qwv) this.a).a.a.setEnabled(true);
                return;
            case 18:
                qwn qwnVar = (qwn) ((yyh) this.a).b;
                Object objA = qwnVar.b.a();
                vtw vtwVarM = wds.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                wds wdsVar = (wds) vucVar;
                wdsVar.d = 8;
                wdsVar.b = 2 | wdsVar.b;
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
                wdsVar3.b |= 8;
                if (!vucVar3.A()) {
                    vtwVarM.u();
                }
                ril rilVar = qwnVar.g;
                wds wdsVar4 = (wds) vtwVarM.b;
                wdsVar4.c = 32;
                wdsVar4.b |= 1;
                rilVar.a(objA, (wds) vtwVarM.r());
                return;
            case 19:
                qxr qxrVar = (qxr) this.a;
                qxrVar.b().b.d.a = null;
                qxrVar.b().e.a = null;
                return;
            default:
                Object obj6 = this.a;
                qxr qxrVar2 = (qxr) obj6;
                qxm qxmVar = qxrVar2.d;
                if (qxmVar == null) {
                    return;
                }
                rbi rbiVar = qxrVar2.b().d;
                qxl qxlVar = qxmVar.a;
                if (qxlVar instanceof qxt) {
                    ofr.a(((qxt) qxlVar).a, (ogd) rbiVar.a);
                } else if (qxlVar instanceof qxi) {
                    new qyt((ofj) rbiVar.a, ((qxi) qxlVar).a, 7, (Context) rbiVar.b, 0).a();
                } else if (!yks.e(qxlVar, qyg.a)) {
                    throw new yfu();
                }
                qxrVar2.d = null;
                if (qxmVar.b == vrr.a) {
                    ((bl) obj6).dismiss();
                    return;
                }
                return;
        }
    }

    public pqi(pqv pqvVar, int i) {
        this.b = i;
        this.a = pqvVar;
    }
}
