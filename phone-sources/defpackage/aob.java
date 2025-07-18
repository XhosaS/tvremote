package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.apps.googletv.app.presentation.pages.launcher.GtvLauncherActivity;
import com.google.android.videos.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aob implements ysy {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public aob(bco bcoVar, pf pfVar, bdy bdyVar, int i) {
        this.d = i;
        this.a = bcoVar;
        this.c = pfVar;
        this.b = bdyVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v19, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v21, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v24, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, pnl] */
    @Override // defpackage.ysy
    public final /* synthetic */ Object emit(Object obj, yih yihVar) {
        String string;
        int i = this.d;
        boolean zBooleanValue = false;
        irc ircVar = null;
        ProgressBar progressBar = null;
        if (i == 0) {
            wq wqVar = (wq) obj;
            if (wqVar instanceof wn) {
                this.a.add(wqVar);
            } else if (wqVar instanceof wo) {
                this.a.remove(((wo) wqVar).a);
            } else if (wqVar instanceof wl) {
                this.a.add(wqVar);
            } else if (wqVar instanceof wm) {
                this.a.remove(((wm) wqVar).a);
            } else if (wqVar instanceof ws) {
                this.a.add(wqVar);
            } else if (wqVar instanceof wt) {
                this.a.remove(((wt) wqVar).a);
            } else if (wqVar instanceof wr) {
                this.a.remove(((wr) wqVar).a);
            }
            ykr.q(this.b, null, 0, new aoa((aoo) this.c, (wq) yfm.X(this.a), (yih) null, 0), 3);
            return ygi.a;
        }
        if (i == 1) {
            if (((Boolean) obj).booleanValue()) {
                yjz yjzVar = (yjz) this.b.a();
                pf pfVar = (pf) this.c;
                zBooleanValue = ((Boolean) yjzVar.a(pfVar.f(), pfVar.g())).booleanValue();
            }
            ((bco) this.a).b(Boolean.valueOf(zBooleanValue));
            return ygi.a;
        }
        if (i == 2) {
            ?? r0 = this.b;
            fd fdVar = (fd) obj;
            if (r0.a() == null) {
                r0.b(fdVar);
            }
            this.a.b(fdVar);
            Object objE = ((mr) this.c).e(new Float(1.0f - zy.y(fdVar.b)), yihVar);
            return objE == yio.a ? objE : ygi.a;
        }
        if (i == 3) {
            fd fdVar2 = (fd) obj;
            if (a.i(this.b).size() > 1) {
                this.c.b(Boolean.valueOf(true));
                ((bdl) this.a).h(fdVar2.b);
            }
            return ygi.a;
        }
        if (i != 4) {
            qyf qyfVar = (qyf) obj;
            pjt pjtVarA = qyfVar.a();
            Object obj2 = this.b;
            qxr qxrVar = (qxr) obj2;
            qyf qyfVar2 = qxrVar.c;
            if (qyfVar2 == null) {
                qxrVar.c = qyfVar;
                ray rayVarI = ((yyh) qxrVar.b().b.a.b()).i((ViewGroup) this.a);
                vvd vvdVar = qxrVar.b().b.e;
                Object obj3 = this.c;
                rbo rboVar = qxrVar.b().c;
                if (((xwk) vvdVar.c).a == null) {
                    yks.c("clientAuthSideChannel");
                }
                pke pkeVarB = vvdVar.b.b();
                pjr pjrVarJ = vvdVar.j(230389, null);
                pjrVarJ.e(pjtVarA);
                pjrVarJ.e(riz.a);
                View view = (View) obj3;
                pkeVarB.e(view, pjrVarJ);
                rboVar.a = new WeakReference(obj3);
                rboVar.g(true);
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.og_bento_menu_scrim);
                if (frameLayout != null) {
                    vvd vvdVar2 = qxrVar.b().b.e;
                    vvdVar2.o(frameLayout, 90573, null, new nay(vvdVar2, vow.a, 6));
                }
                qxrVar.f = qxrVar.c(rayVarI, qyfVar);
            } else if (!yks.e(qyfVar2.a(), pjtVarA)) {
                ((bl) obj2).dismiss();
            }
            return ygi.a;
        }
        ihz ihzVar = (ihz) obj;
        GtvLauncherActivity gtvLauncherActivity = (GtvLauncherActivity) this.b;
        ProgressBar progressBar2 = gtvLauncherActivity.i;
        if (progressBar2 == null) {
            yks.c("loadingProgressBar");
            progressBar2 = null;
        }
        progressBar2.setVisibility(8);
        if (ihzVar instanceof ihx) {
            ProgressBar progressBar3 = gtvLauncherActivity.i;
            if (progressBar3 == null) {
                yks.c("loadingProgressBar");
            } else {
                progressBar = progressBar3;
            }
            progressBar.setVisibility(0);
            krd.b("ResolveLink is loading.");
        } else if (ihzVar instanceof iht) {
            Objects.toString(ihzVar);
            krd.b("ResolveLink has data: ".concat(String.valueOf(ihzVar)));
            irc ircVar2 = gtvLauncherActivity.g;
            if (ircVar2 == null) {
                yks.c("actionManager");
            } else {
                ircVar = ircVar2;
            }
            wkg wkgVar = ((wob) ((iht) ihzVar).a).b;
            if (wkgVar == null) {
                wkgVar = wkg.a;
            }
            wkgVar.getClass();
            ircVar.e(wkgVar, (Context) this.a, "");
            gtvLauncherActivity.finish();
        } else if (ihzVar instanceof ihy) {
            krd.b("ResolveLink does not have new data.");
        } else {
            if (!(ihzVar instanceof ihw)) {
                throw new yfu();
            }
            Objects.toString(ihzVar);
            krd.c("ResolveLink returned error: ".concat(String.valueOf(ihzVar)));
            ihw ihwVar = (ihw) ihzVar;
            if (ihwVar instanceof ihu) {
                gtvLauncherActivity.a().as(((ihu) ihzVar).a);
            } else {
                if (!(ihwVar instanceof ihv)) {
                    throw new yfu();
                }
                gtvLauncherActivity.a().ar(((ihv) ihzVar).a, gtvLauncherActivity.getLocalClassName());
            }
            Object obj4 = this.c;
            if (obj4 != null && (string = ((Bundle) obj4).getString("entity_name")) != null) {
                krd.b("ResolveLink has extra for the fallback search result: ".concat(string));
                gtvLauncherActivity.b("https://tv.google.com/search/".concat(String.valueOf(string)), null);
                return ygi.a;
            }
            Object obj5 = this.a;
            GtvLauncherActivity gtvLauncherActivity2 = (GtvLauncherActivity) obj5;
            Context context = (Context) obj5;
            Toast.makeText(context, gtvLauncherActivity2.getString(R.string.error_network), 0).show();
            gtvLauncherActivity2.startActivity(jbr.T(context, new Intent()));
            gtvLauncherActivity.finish();
        }
        return ygi.a;
    }

    public aob(bdy bdyVar, bcb bcbVar, bdl bdlVar, int i) {
        this.d = i;
        this.b = bdyVar;
        this.c = bcbVar;
        this.a = bdlVar;
    }

    public aob(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public aob(List list, yow yowVar, aoo aooVar, int i) {
        this.d = i;
        this.a = list;
        this.b = yowVar;
        this.c = aooVar;
    }
}
