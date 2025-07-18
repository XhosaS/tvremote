package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.katniss.R;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hhw extends hhx implements hmx, hna {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/componentview/fragment/CardFragment");
    public aggi ah;
    public agow ai;
    public gph aj;
    public tkl ak;
    public jrs al;
    public gtu am;
    public agow an;
    public gfr ao;
    public glq ap;
    public gmd aq;
    public agow ar;
    public fex as;
    public gmu at;
    public hkz au;
    public pfq av;
    public ghr aw;
    public tkw ax;
    private ue ay;
    tkk b;
    pbv c;
    View d;
    Optional e = Optional.empty();
    final ArrayDeque f = new ArrayDeque();

    public static void aE(WebView webView) {
        webView.setBackgroundColor(0);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setMixedContentMode(0);
        webView.setWebViewClient(new hai("CardFragment"));
    }

    private final void aI() {
        tkk tkkVar = this.b;
        if (tkkVar != null && !tkkVar.j) {
            tkkVar.h.b();
            tkkVar.c.b();
            tkkVar.i.c();
            tkkVar.j = true;
        }
        pbv pbvVar = this.c;
        if (pbvVar != null) {
            pcm pcmVarA = this.av.a(pbvVar);
            pfq.c(pcmVarA);
            pcmVarA.b();
            this.av.b();
        }
        if (this.d instanceof mid) {
            this.ax.h();
            mid midVar = (mid) this.d;
            midVar.b = null;
            midVar.b(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0226, code lost:
    
        if (r0 != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (r0 != false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03da  */
    @Override // defpackage.bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View D(android.view.LayoutInflater r30, android.view.ViewGroup r31, android.os.Bundle r32) throws defpackage.abxv, android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhw.D(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.bq
    public final void Z() {
        this.P = true;
        if (this.ay != null) {
            ef().dc().b(this, this.ay);
        }
    }

    final hle aB(LayoutInflater layoutInflater, final View view, final boolean z) {
        hlc hlcVar = new hlc() { // from class: hht
            @Override // defpackage.hlc
            public final void a() {
                View view2 = view;
                if (z && view2.hasFocusable()) {
                    view2.requestFocus();
                }
                hhw hhwVar = this.a;
                hhwVar.au.a();
                boolean z2 = view2 instanceof mid;
                hhwVar.aq.q(gmc.D, z2 ? gmc.F : gmc.E, hhwVar.as.a(), hkb.c(hhwVar));
                hhwVar.at.C(z2 ? gmc.F : gmc.E, Instant.EPOCH);
                hhwVar.ap.y(gma.b);
                hhwVar.aw.x(abnb.SEARCH_RESULT_PAGE);
                hhwVar.aw.af();
                rqs rqsVarCj = z2 ? rpm.cj() : rpm.ci();
                if (((Boolean) hhwVar.ar.a()).booleanValue()) {
                    ((gfn) hhwVar.an.a()).a(rqsVarCj).b().c();
                } else {
                    hhwVar.ao.a(rqsVarCj, abqb.OK, null, null);
                }
                if (((Boolean) hhwVar.ai.a()).booleanValue()) {
                    String strC = hkb.c(hhwVar);
                    int length = strC.length();
                    int iCharCount = 0;
                    while (true) {
                        if (iCharCount >= length) {
                            strC = hhwVar.as.b();
                            break;
                        }
                        int iCodePointAt = strC.codePointAt(iCharCount);
                        if (!Character.isWhitespace(iCodePointAt)) {
                            break;
                        } else {
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    if (strC != null) {
                        gfl gflVarA = ((gfn) hhwVar.an.a()).a(z2 ? rpm.ch() : rpm.cc()).a(strC);
                        gflVarA.h(strC);
                        gflVarA.c();
                        gfg gfgVarA = ((gfn) hhwVar.an.a()).c(rpm.dV()).a(strC);
                        gfgVarA.g(strC);
                        gfgVarA.c(abqb.OK);
                    }
                }
                ((zdv) ((zdv) hhw.a.b()).q("com/google/android/apps/tvsearch/results/componentview/fragment/CardFragment", "createFragmentFrame", 454, "CardFragment.java")).u("Result displayed card.");
            }
        };
        if (!(view instanceof WebView)) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            hld hldVar = new hld(layoutInflater);
            hldVar.c(view);
            hldVar.b.e = hlcVar;
            hldVar.d(hkb.i(this));
            return hldVar.a();
        }
        hlq hlqVar = new hlq(layoutInflater, (WebView) view);
        hlqVar.c = new hhv(this);
        hlr hlrVar = hlqVar.a;
        hlrVar.e = hlcVar;
        int i = true == hkb.i(this) ? -1 : -2;
        hlrVar.getLayoutParams().height = i;
        WebView webView = hlqVar.b;
        webView.getLayoutParams().height = i;
        View viewFindViewById = hlrVar.findViewById(R.id.progress);
        webView.addJavascriptInterface(hlrVar, "MotionWebViewFrame");
        webView.setWebViewClient(new hlp(hlqVar, viewFindViewById));
        return hlrVar;
    }

    @Override // defpackage.hmx
    public final boolean aF() {
        return false;
    }

    @Override // defpackage.bq
    public final void aa(View view, Bundle bundle) {
        if (hkb.h(this)) {
            view.setPadding(view.getPaddingLeft(), hkb.a(this), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.hna
    public final abnb dJ() {
        return abnb.SEARCH_RESULT_PAGE;
    }

    @Override // defpackage.bq
    public final void e() {
        aI();
        View view = this.R;
        if (view instanceof hle) {
            ((hle) view).e();
        }
        this.P = true;
    }

    @Override // defpackage.bq
    public final void h() {
        this.P = true;
        this.aw.w(abnb.SEARCH_RESULT_PAGE);
    }

    @Override // defpackage.bq
    public final void i() {
        abnb abnbVar = abnb.SEARCH_RESULT_PAGE;
        this.aw.y(abnbVar);
        this.aw.v(hkb.c(this), abnbVar);
        this.P = true;
    }

    final View l(LayoutInflater layoutInflater) {
        Context context = layoutInflater.getContext();
        this.al.a(R.string.assistant_internal_error);
        return m(layoutInflater, context);
    }

    final ViewGroup m(LayoutInflater layoutInflater, Context context) {
        View view = new View(context);
        this.d = view;
        return aB(layoutInflater, view, false);
    }

    @Override // defpackage.hmx
    public final /* synthetic */ void aD(bq bqVar) {
    }
}
