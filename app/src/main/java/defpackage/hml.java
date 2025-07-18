package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;
import com.google.android.katniss.R;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hml extends hmk implements hek, hel, hmv {
    private static final zdy an = zdy.h("com/google/android/apps/tvsearch/results/previewslimentity/PreviewSlimEntityFragment");
    public gph a;
    public ghr ah;
    public gnj ai;
    LogoView aj;
    View ak;
    hsj al;
    public hkx am;
    private LinearLayout ao;
    private hep ap;
    private List aq;
    public fev b;
    public few c;
    public wke d;
    public exl e;
    public agow f;

    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        adyd adydVar;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.preview_card_container, viewGroup, false).findViewById(R.id.preview_card_container);
        viewGroup2.setClipChildren(false);
        LogoView logoView = (LogoView) viewGroup2.findViewById(R.id.preview_logo_view);
        this.aj = logoView;
        hvh.a(logoView);
        this.aj.d(10, true);
        hkx hkxVar = this.am;
        if (hkxVar == null) {
            return viewGroup2;
        }
        hky hkyVar = (hky) hkxVar;
        adyj adyjVar = hkyVar.o;
        if (adyjVar != null) {
            adydVar = adyjVar.d;
            if (adydVar == null) {
                adydVar = adyd.a;
            }
        } else {
            adydVar = null;
        }
        hsj hsjVar = (hsj) this.f.a();
        hsjVar.l = this.a == gph.a ? 3 : 2;
        hsjVar.A(adydVar, false);
        this.al = hsjVar;
        this.ak = layoutInflater.inflate(R.layout.preview_slim_entity_metadata_row, viewGroup2, false);
        this.ap = new hep(this.ak.getContext(), this);
        LinearLayout linearLayout = (LinearLayout) this.ak.findViewById(R.id.entity_action_box);
        this.ao = linearLayout;
        linearLayout.setVisibility(0);
        List list = this.al.e;
        this.aq = list;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            hej hejVar = (hej) it.next();
            if (!hejVar.l) {
                it.remove();
            } else if (!hejVar.a() && !hejVar.m) {
                if (z) {
                    it.remove();
                }
                z = true;
            }
        }
        this.ap.d = this.aq;
        this.ao.removeAllViews();
        for (int i = 0; i < this.ap.a(); i++) {
            qv qvVarD = this.ap.d(this.ao, 0);
            this.ap.f(qvVarD, i);
            this.ao.addView(qvVarD.a);
        }
        String strB = this.al.B();
        if (yqv.c(strB)) {
            strB = String.format("%s %s", this.al.n(), this.ak.getResources().getString(R.string.query_routing_partial_response));
        }
        ((TextView) this.ak.findViewById(R.id.entity_row_header_title)).setText(strB);
        viewGroup2.addView(this.ak);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2;
        aac aacVar = new aac();
        aacVar.c(constraintLayout);
        aacVar.j(this.ak.getId(), 3, 3, 0);
        aacVar.j(this.ak.getId(), 6, 6, (int) dZ().getResources().getDimension(R.dimen.amati_search_bar_text_margin_from_parent_start));
        aacVar.j(this.ak.getId(), 7, 7, 0);
        aacVar.b(constraintLayout);
        this.ah.p(zpg.OPA_TV_IMPRESSION_NATIVE_DIRECT_SEARCH, true, yqv.b(hkyVar.j), false, this.aq, null, hkyVar.p, this.ak, aC());
        return viewGroup2;
    }

    final String aC() {
        hkx hkxVar = this.am;
        if (hkxVar != null) {
            return ((hky) hkxVar).n;
        }
        return null;
    }

    @Override // defpackage.hmv
    public final boolean aI() {
        return true;
    }

    @Override // defpackage.hmv
    public final boolean aJ() {
        return true;
    }

    @Override // defpackage.hek
    public final wke k() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    @Override // defpackage.hel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.view.View r14, defpackage.hej r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hml.l(android.view.View, hej):void");
    }

    @Override // defpackage.hek
    public final hel j() {
        return this;
    }
}
