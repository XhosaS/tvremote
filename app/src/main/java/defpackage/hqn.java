package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hqn extends hqc {
    public static final zdy ar = zdy.h("com/google/android/apps/tvsearch/results/searchresultspage/SearchResultsPageFragment");
    public yyk aA;
    public hmm aB;
    public AccessibilityManager as;
    public Display at;
    public agow au;
    public agow av;
    public agow aw;
    boolean ax;
    public boolean ay;
    boolean az;
    private Integer bK = null;
    private Integer bL = null;
    private boolean bM;

    private final hop bI(int i) {
        if (this.bK == null && s() != null) {
            Resources resources = s().getResources();
            Point point = new Point();
            this.at.getSize(point);
            point.x -= resources.getDimensionPixelSize(R.dimen.katniss_browse_padding_start) + resources.getDimensionPixelSize(R.dimen.katniss_browse_padding_end);
            this.bK = Integer.valueOf(point.x);
        }
        Resources resources2 = dZ().getResources();
        return new hop(i, this.bK.intValue(), resources2.getDimensionPixelSize(R.dimen.image_grid_item_padding), resources2.getDimensionPixelSize(R.dimen.amati_carousel_item_image_constant_width));
    }

    private final void bJ(int i, adyn adynVar) {
        hop hopVarBI = bI(adynVar.e.size());
        hol holVar = (hol) this.aw.a();
        holVar.n(s(), hopVarBI, adynVar);
        this.aK.m(i, holVar);
    }

    private final void bK(int i) {
        Queue queue = this.bC;
        int iMin = Math.min(queue.size(), i);
        int iE = this.aK.e();
        for (int i2 = 0; i2 < iMin; i2++) {
            xqe xqeVar = (xqe) queue.poll();
            bp(xqeVar, xqeVar.c);
        }
        if (this.aK.e() > iE) {
            bt();
        }
    }

    @Override // defpackage.hrc, defpackage.hmc
    public final boolean C() {
        return this.bM;
    }

    @Override // defpackage.hrw, defpackage.hmz
    public final void L() {
        if (this.bq != null && this.aQ == gph.a && this.bI && !this.bH) {
            this.bH = true;
            if (((hky) this.bq).r) {
                return;
            }
            bK(Integer.MAX_VALUE);
            if (this.bD) {
                bk(((hky) this.bq).c);
                this.bD = false;
            }
        }
    }

    @Override // defpackage.hrc, defpackage.bq
    public final void Z() {
        View viewFindViewById;
        super.Z();
        View viewBh = bh();
        if (viewBh != null && viewBh.getAlpha() < 1.0f) {
            viewBh.animate().withLayer().alpha(1.0f).setDuration(500L).start();
        }
        ViewGroup viewGroup = (ViewGroup) this.R;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.on_search_loading)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    @Override // defpackage.hrw, defpackage.hmx
    public final void aD(bq bqVar) {
        if (bqVar instanceof hqn) {
            hqn hqnVar = (hqn) bqVar;
            boolean z = hqnVar.ay;
            this.az = z;
            if (z || hqnVar.ax) {
                hqnVar.ax = false;
                hqnVar.ay = false;
                if (this.n == null) {
                    ae(new Bundle(1));
                }
                this.n.putBoolean("is_navigational_search", true);
            }
        }
    }

    @Override // defpackage.hrw, defpackage.hmx
    public final boolean aF() {
        Bundle bundle = this.n;
        return (bundle == null || !bundle.containsKey("is_navigational_search")) ? this.bx : bundle.getBoolean("is_navigational_search");
    }

    @Override // defpackage.hrc
    protected final int aL(Context context) {
        if (this.bM) {
            return super.aL(context);
        }
        return 0;
    }

    @Override // defpackage.hrw
    public final String aM() {
        hkx hkxVar = this.bq;
        if (hkxVar != null) {
            String str = ((hky) hkxVar).l;
            if (!str.isEmpty()) {
                return str;
            }
        }
        return super.aM();
    }

    protected final void aN(int i, xqe xqeVar) {
        this.aK.m(i, new hks(s(), bI(xqeVar.e.size()), xqeVar, this.aQ == gph.a));
    }

    @Override // defpackage.hrw
    protected final void aO(int i) {
        gph gphVar = this.aQ;
        gph gphVar2 = gph.a;
        if (gphVar == gphVar2) {
            aW();
        }
        hkx hkxVar = this.bq;
        if (hkxVar == null) {
            return;
        }
        if (this.aQ == gphVar2 && !this.bI) {
            hky hkyVar = (hky) hkxVar;
            if (hkyVar.r || this.bJ) {
                return;
            }
            List list = hkyVar.f;
            if (list != null && !list.isEmpty()) {
                xqe xqeVar = (xqe) list.get(0);
                bl(i, xqeVar, (xqeVar.b & 1) != 0 ? xqeVar.c : "");
                return;
            }
        }
        hkx hkxVar2 = this.bq;
        if (!((hky) hkxVar2).r) {
            super.aO(i);
            this.bI = true;
            this.bw = true;
        } else if (hkxVar2.j()) {
            List listD = this.bq.d();
            if (listD != null && !listD.isEmpty()) {
                bJ(i, (adyn) listD.get(0));
                return;
            }
            List list2 = ((hky) this.bq).f;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            aN(i, (xqe) list2.get(0));
        }
    }

    @Override // defpackage.hrw
    public final void aP(xpy xpyVar) {
        ((hky) this.bq).g = xpyVar;
        if (this.bI) {
            aW();
        }
    }

    @Override // defpackage.hrw
    public final void aQ(xpu xpuVar) {
        hkx hkxVar = this.bq;
        if (hkxVar == null) {
            return;
        }
        ((hky) hkxVar).h = xpuVar;
        if (this.bI) {
            aX();
        }
    }

    @Override // defpackage.hrw
    public final void aR(int i) {
        if (this.bq == null || this.bI) {
            return;
        }
        if (this.az) {
            this.ba.m(gmc.B);
        }
        this.bw = true;
        this.bI = true;
        hkx hkxVar = this.bq;
        if (((hky) hkxVar).r) {
            if (hkxVar.j()) {
                List listD = this.bq.d();
                if (listD != null && !listD.isEmpty()) {
                    bJ(i, (adyn) listD.get(0));
                    return;
                }
                List list = ((hky) this.bq).f;
                if (list == null || list.isEmpty()) {
                    return;
                }
                aN(i, (xqe) list.get(0));
                return;
            }
            return;
        }
        aX();
        List listD2 = this.bq.d();
        if (listD2 != null && !listD2.isEmpty()) {
            int iE = this.aK.e();
            for (int i2 = 0; i2 < listD2.size(); i2++) {
                adyn adynVar = (adyn) listD2.get(i2);
                String str = adynVar.d;
                if (adynVar.e.size() == 0) {
                    ((zdv) ((zdv) hrw.aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "appendGoogleSearchResultsRow", 1205, "SearchRowsFragment.java")).u("athome.List is empty");
                } else {
                    hpu hpuVar = (hpu) this.bg.a();
                    hpuVar.o(s(), adynVar);
                    bu(hpuVar, str);
                    this.aK.k(hpuVar);
                }
            }
            if (this.aK.e() > iE) {
                bt();
            }
        }
        bK(1);
        if (this.as.isTouchExplorationEnabled()) {
            L();
        }
        aW();
    }

    @Override // defpackage.hrc, defpackage.hrw
    protected final void aS() {
        hkx hkxVar;
        if (this.bM) {
            super.aS();
        } else {
            hkx hkxVar2 = this.bq;
            if (hkxVar2 != null) {
                String str = ((hky) hkxVar2).l;
                if (!str.isEmpty()) {
                    this.aK.s(new hkp(str));
                }
            }
        }
        if (this.aK.x()) {
            this.aS.l();
        }
        if (this.aQ == gph.b || this.aQ == gph.c || (hkxVar = this.bq) == null) {
            return;
        }
        xpu xpuVar = ((hky) hkxVar).h;
        if ((xpuVar == null || xpuVar.b.isEmpty()) && ((hky) this.bq).l.isEmpty()) {
            return;
        }
        if (!((hky) this.bq).l.isEmpty()) {
            aV();
        }
        aX();
    }

    @Override // defpackage.hrw
    public final void aT() {
        View childAt;
        if (this.d <= 0 && this.aK.e() > 0 && this.aK.f() > 0 && !this.as.isTouchExplorationEnabled()) {
            dS((this.az && this.aK.w()) ? this.aK.g() : this.aK.f());
        }
        if (((Boolean) this.au.a()).booleanValue() && this.aK.x()) {
            hvc hvcVar = this.aK;
            if (!(hvcVar.c(hvcVar.c) instanceof hkr) || (childAt = this.b.getChildAt(0)) == null) {
                return;
            }
            childAt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hqe
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.a.bj.Y(4);
                    }
                }
            });
        }
    }

    @Override // defpackage.hrw
    /* renamed from: aU */
    public final void ew(azk azkVar, Object obj, azw azwVar, azr azrVar) {
        if (!(obj instanceof hly)) {
            this.ax = false;
            super.ew(azkVar, obj, azwVar, azrVar);
            return;
        }
        this.ax = true;
        hly hlyVar = (hly) obj;
        this.bj.E(7);
        bx(azkVar, hlyVar, azrVar);
        abvo abvoVar = hlyVar.f;
        String str = hlyVar.e;
        if (abvoVar == null) {
            this.aR.h(str, 4);
            ((zdv) ((zdv) ar.d()).q("com/google/android/apps/tvsearch/results/searchresultspage/SearchResultsPageFragment", "onItemClicked", 909, "SearchResultsPageFragment.java")).x("Pivot intent is null, fall back to text search with query %s", str);
            return;
        }
        this.aR.d(abvoVar, 4);
        if (this.as.isTouchExplorationEnabled()) {
            this.aS.e(str);
        } else {
            this.aR.a();
        }
    }

    final void aV() {
        this.bL = 1;
        VerticalGridView verticalGridView = this.b;
        if (verticalGridView != null) {
            this.bL.intValue();
            verticalGridView.setWindowAlignment(1);
        }
    }

    protected final void aW() {
        hkx hkxVar = this.bq;
        if (hkxVar == null || hkxVar.a() == null || hkxVar.a().b.size() == 0) {
            return;
        }
        xpy xpyVarA = this.bq.a();
        hlz hlzVar = new hlz(s(), xpyVarA);
        hlzVar.b = new hpb(xpyVarA.c);
        hvc hvcVar = this.aK;
        if (hvcVar.a) {
            if (hvcVar.e() > 1 && !hvcVar.u()) {
                Object objQ = agqq.q(hvcVar.b);
                if (objQ instanceof uua) {
                    ((uua) objQ).p(ayj.class, null);
                    hvcVar.o();
                }
            }
            if (hvcVar.y() && hvcVar.v()) {
                hvcVar.z(hlzVar);
            } else if (!hvcVar.y()) {
                hvcVar.A(hlzVar);
            }
        }
        int i = hvcVar.i(hvcVar.d, hlzVar);
        hvcVar.d = hlzVar;
        hvcVar.p(i, hvcVar.f() + hvcVar.e());
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [hqd] */
    protected final void aX() {
        int iA;
        hkx hkxVar = this.bq;
        if (hkxVar == null) {
            return;
        }
        final List listC = hkxVar.c();
        if (listC.isEmpty()) {
            int i = yyk.e;
            this.aA = zcg.b;
            this.ay = false;
            this.aB = null;
            this.aK.r(null);
            return;
        }
        aV();
        final hqi hqiVar = new hqi(this);
        ArrayList arrayList = new ArrayList(listC);
        int i2 = 1;
        if (!arrayList.isEmpty() && (iA = xll.a(((xlm) arrayList.get(0)).g)) != 0) {
            i2 = iA;
        }
        List.EL.sort(arrayList, new Comparator() { // from class: hqf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                if (Objects.equals(obj, obj2)) {
                    return 0;
                }
                hqi hqiVar2 = hqiVar;
                boolean zA = hqiVar2.a(obj);
                if (hqiVar2.a(obj2) ^ zA) {
                    return !zA ? 1 : -1;
                }
                java.util.List list = listC;
                return list.indexOf(obj) - list.indexOf(obj2);
            }
        });
        this.aA = yyk.j(arrayList);
        yyf yyfVar = new yyf(4);
        for (int i3 = 0; i3 < this.aA.size(); i3++) {
            pan panVar = new pan(93800);
            zoq zoqVar = panVar.b;
            if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zoqVar.y();
            }
            zot zotVar = (zot) zoqVar.b;
            zot zotVar2 = zot.a;
            zotVar.b |= 2;
            zotVar.d = i3;
            panVar.f();
            xlm xlmVar = (xlm) this.aA.get(i3);
            if ((xlmVar.b & 32) != 0) {
                acjc acjcVar = xlmVar.h;
                if (acjcVar == null) {
                    acjcVar = acjc.a;
                }
                panVar.d(acjcVar);
            }
            yyfVar.g(panVar);
        }
        hqg hqgVar = new hqg(this);
        int i4 = i2;
        ?? r5 = new Object() { // from class: hqd
        };
        hqj hqjVar = new hqj(hqiVar);
        String string = i4 == 3 ? dZ().getResources().getString(R.string.search_page_recent_searches_row_title) : dZ().getResources().getString(R.string.search_result_page_refinement_row_title);
        if (string == null) {
            throw new NullPointerException("Null rowTitle");
        }
        yyk yykVar = this.aA;
        if (yykVar == null) {
            throw new NullPointerException("Null filters");
        }
        uum uumVar = new uum(string, yykVar, hqjVar, new bar(new hql(hqiVar, hqgVar, r5, i4 - 1, yyfVar.f(), yykVar)));
        hmm hmmVar = (hmm) this.av.a();
        this.aB = hmmVar;
        hmmVar.a = uumVar;
        this.aK.r(hmmVar);
        VerticalGridView verticalGridView = this.b;
        if (verticalGridView != null) {
            verticalGridView.ad.L(new hqk(this, verticalGridView));
        }
    }

    @Override // defpackage.hrw
    public final void aY() {
        super.aY();
        hkx hkxVar = this.bq;
        if (hkxVar != null) {
            this.aK.s(new hkp(((hky) hkxVar).l));
            if (this.aK.x()) {
                this.aS.l();
            }
        }
        aX();
    }

    @Override // defpackage.hrw
    public final void aZ(far farVar) {
        hkx hkxVar = this.bq;
        if (hkxVar == null) {
            return;
        }
        farVar.f = hkxVar.c();
        if (this.bq.a() != null) {
            farVar.g = this.bq.a().b;
            int iA = xpx.a(this.bq.a().d);
            if (iA == 0) {
                iA = 1;
            }
            farVar.j = iA;
        }
    }

    @Override // defpackage.hrc
    protected final void ba(VerticalGridView verticalGridView) {
        int i;
        if (this.aQ == gph.a) {
            Integer num = this.bL;
            if (num == null) {
                i = 0;
            } else {
                num.intValue();
                i = 1;
            }
            verticalGridView.setWindowAlignment(i);
            verticalGridView.setWindowAlignmentOffset(verticalGridView.getResources().getDimensionPixelSize(R.dimen.window_key_line));
            verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
            verticalGridView.setItemAlignmentOffset(0);
            verticalGridView.setItemAlignmentOffsetPercent(-1.0f);
        }
    }

    @Override // defpackage.hrw
    public final void bb() {
        this.bJ = true;
        this.aK.s(new hsk());
        this.aK.r(new hso());
        this.aK.k(new hsm());
        this.aK.k(new hsm());
        aV();
    }

    @Override // defpackage.hrw, defpackage.hna
    public final abnb dJ() {
        hvc hvcVar = this.aK;
        if (hvcVar != null && hvcVar.e() != 0) {
            Object objJ = this.aK.j(0);
            if (objJ instanceof hoh) {
                if (((hoh) objJ).x()) {
                    return abnb.NON_MEDIA_PERSON_PAGE;
                }
            } else if (objJ instanceof hku) {
                return abnb.MEDIA_SEARCH_RESULT_PAGE;
            }
        }
        return abnb.SEARCH_RESULT_PAGE;
    }

    @Override // defpackage.hrw, defpackage.awk
    public final /* bridge */ /* synthetic */ void ew(azk azkVar, Object obj, azw azwVar, Object obj2) {
        ew(azkVar, obj, azwVar, (azr) obj2);
    }

    @Override // defpackage.hqc, defpackage.hrc, defpackage.hqz, defpackage.hra, defpackage.bq
    public final void ex(Context context) {
        Bundle bundle = this.n;
        if (bundle != null) {
            this.bM = bundle.getBoolean("edit_query_enabled", false);
        }
        super.ex(context);
    }
}
