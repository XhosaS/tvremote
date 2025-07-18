package defpackage;

import android.accounts.Account;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.apps.tvsearch.results.searchentity.info.EntityInfo;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.android.katniss.R;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hrw extends hra implements hel, awk, hpa, awl, hue, hmb, hmc, hrd, hmz, hna {
    public static final zdy aG = zdy.h("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment");
    public hoh aH;
    public hmq aI;
    protected Handler aJ;
    azn aL;
    azn aM;
    public AccessibilityManager aN;
    public agow aO;
    public agow aP;
    public gph aQ;
    public fev aR;
    public few aS;
    public wke aT;
    public exl aU;
    public hmi aV;
    public gtu aW;
    public agow aX;
    public gfr aY;
    public glq aZ;
    private hqb as;
    private htv at;
    protected uuj bA;
    protected boolean bD;
    protected boolean bE;
    protected boolean bG;
    public boolean bH;
    public boolean bI;
    public boolean bJ;
    public gmd ba;
    public agow bb;
    public fex bc;
    public hmj bd;
    public gmu be;
    public hkz bf;
    public agow bg;
    public agow bh;
    public ztw bi;
    public ghr bj;
    public Executor bk;
    public gnj bl;
    public tkw bm;
    hrt bn;
    public hkx bq;
    public SuggestionChipList br;
    public EntityInfo bs;
    public boolean bt;
    protected boolean bu;
    public boolean bv;
    private boolean ar = true;
    public hvc aK = new hvc(null, false);
    public zpg bo = zpg.OPA_TV_IMPRESSION_NATIVE_DIRECT_SEARCH;
    public int bp = 13975;
    private boolean au = false;
    public boolean bw = false;
    public boolean bx = false;
    private boolean av = false;
    public Optional by = Optional.empty();
    public Optional bz = Optional.empty();
    public final List bB = new ArrayList();
    public final Queue bC = new ArrayDeque();
    protected final List bF = new ArrayList();

    private final hqb aW() {
        if (this.as == null) {
            this.as = new hqb(dZ().getResources(), this.aT, LayoutInflater.from(s()));
        }
        return this.as;
    }

    private final void bI(xps xpsVar) {
        int i = xpsVar.b;
        if (i == 1) {
            this.aK.q(new hin((String) xpsVar.c));
            return;
        }
        if (i == 2) {
            hir hirVar = new hir();
            xpm xpmVar = xpsVar.b == 2 ? (xpm) xpsVar.c : xpm.a;
            xpmVar.getClass();
            for (xpq xpqVar : xpmVar.b) {
                List list = hirVar.c;
                xpqVar.getClass();
                list.add(new hik(xpqVar, list.size()));
            }
            this.aK.q(hirVar);
        }
    }

    private final void bJ(abky abkyVar) {
        int iE = this.aK.e();
        hmq hmqVar = new hmq(abkyVar);
        this.aI = hmqVar;
        this.aK.m(iE > 0 ? 1 : 0, hmqVar);
    }

    private final void bK() {
        if (this.bx && this.au) {
            hkx hkxVar = this.bq;
            if ((hkxVar == null && this.bs == null) || this.bw) {
                return;
            }
            boolean z = true;
            if (hkxVar != null) {
                this.bw = true;
            }
            if (this.bs != null && hkxVar == null) {
                if (this.aH != null || es()) {
                    return;
                }
                if (this.bq == null && this.bx && this.bn == null) {
                    this.bn = new hro(this, bh());
                }
                hoh hohVar = (hoh) this.aP.a();
                EntityInfo entityInfo = this.bs;
                boolean z2 = this.bt;
                hohVar.d = null;
                hohVar.c = entityInfo;
                hohVar.g = z2;
                hohVar.j = false;
                this.aH = hohVar;
                this.aK.m(0, hohVar);
                return;
            }
            hrt hrtVar = this.bn;
            if (hrtVar != null) {
                int i = hrtVar.c;
                if (i == 0) {
                    hrtVar.c = 1;
                } else if (i == 2) {
                    hrtVar.c();
                }
            }
            adyj adyjVar = ((hky) this.bq).o;
            int i2 = this.aH != null ? 1 : 0;
            if (hky.o(adyjVar)) {
                hoh hohVar2 = this.aH;
                if (hohVar2 != null) {
                    try {
                        adyd adydVar = adyjVar.d;
                        if (adydVar == null) {
                            adydVar = adyd.a;
                        }
                        if (hohVar2.d != null) {
                            throw new IllegalStateException("Knowledge Panel can only be set once!");
                        }
                        hohVar2.d = adydVar;
                        hohVar2.j = false;
                        hohVar2.u();
                        hohVar2.t();
                        if (hohVar2.d != null) {
                            hohVar2.c = null;
                        }
                        hog hogVar = hohVar2.h;
                        if (hogVar != null) {
                            hogVar.n();
                        }
                        hoh hohVar3 = this.aH;
                        if (((hky) this.bq).c == null) {
                            z = false;
                        }
                        hohVar3.k = z;
                        bt();
                    } catch (IllegalAccessError e) {
                        ((zdv) ((zdv) aG.c()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "handleNavigationSearch", 959, "SearchRowsFragment.java")).x("Refresh entity row: %s", e.getMessage());
                    }
                } else if (!es()) {
                    hoh hohVar4 = (hoh) this.aP.a();
                    adyd adydVar2 = adyjVar.d;
                    if (adydVar2 == null) {
                        adydVar2 = adyd.a;
                    }
                    hohVar4.A(adydVar2, false);
                    this.aH = hohVar4;
                    this.aK.m(i2, hohVar4);
                    i2++;
                }
                adyd adydVar3 = adyjVar.d;
                if (adydVar3 == null) {
                    adydVar3 = adyd.a;
                }
                bz(adydVar3);
            }
            aO(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zyd] */
    private final void bL() {
        if (this.by.isPresent()) {
            this.by.get().cancel(false);
            this.by = Optional.empty();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zyd] */
    private final void bM() {
        if (this.bz.isPresent()) {
            this.bz.get().cancel(false);
            this.bz = Optional.empty();
        }
    }

    private final void bN() {
        if (!this.au || this.bB.isEmpty()) {
            return;
        }
        dK();
        if (this.aK.e() > 0) {
            bt();
        }
    }

    private final void bO() {
        if (!this.au || this.bB.isEmpty()) {
            return;
        }
        eu();
        if (this.aK.e() > 0) {
            bt();
        }
    }

    @Override // defpackage.atn, defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null) {
            return null;
        }
        View viewD = super.D(layoutInflater, viewGroup, bundle);
        viewD.getClass();
        hld hldVar = new hld(layoutInflater);
        hldVar.d = true;
        if (viewD.getLayoutParams() == null) {
            hldVar.b.addView(viewD, new FrameLayout.LayoutParams(-1, hldVar.c));
        } else {
            viewD.getLayoutParams().height = hldVar.c;
            hldVar.b.addView(viewD);
        }
        hle hleVar = hldVar.b;
        hleVar.d = viewD;
        hldVar.d(hkb.i(this));
        hleVar.c = true;
        hleVar.e = new hlc() { // from class: hrg
            @Override // defpackage.hlc
            public final void a() {
                hrw hrwVar = this.a;
                if (!hkb.j(hrwVar)) {
                    hrwVar.bv();
                }
                if (hrwVar.aQ == gph.a) {
                    hrwVar.aR(hrwVar.aH == null ? 0 : 1);
                    if (hrwVar.bE) {
                        hrwVar.bo(((hky) hrwVar.bq).b);
                        hrwVar.bE = false;
                    }
                    if (hkb.j(hrwVar)) {
                        return;
                    }
                    hrwVar.aT();
                }
            }
        };
        return hldVar.a();
    }

    @Override // defpackage.hmc
    public final boolean E() {
        return this.bu;
    }

    @Override // defpackage.hmy
    public final hkx F() {
        return this.bq;
    }

    @Override // defpackage.hmy
    public final SuggestionChipList G() {
        return this.br;
    }

    @Override // defpackage.hmy
    public final void H(far farVar) {
        List list;
        HorizontalGridView horizontalGridViewBi;
        azw azwVarDO = dO(this.d);
        int iBf = 0;
        if (bH(azwVarDO) && (horizontalGridViewBi = bi(azwVarDO)) != null && horizontalGridViewBi.getChildCount() > 0) {
            iBf = bf(horizontalGridViewBi);
        }
        int iF = this.d - this.aK.f();
        ArrayList arrayList = new ArrayList();
        if (iF >= 0 && iF < this.aK.e()) {
            Object objJ = this.aK.j(iF);
            if (objJ instanceof hhl) {
                hhl hhlVar = (hhl) objJ;
                if (hhlVar.f() > 0) {
                    for (int iJ = J(); iJ <= iBf; iJ++) {
                        arrayList.add(hhlVar.g(iJ));
                    }
                }
            }
        }
        farVar.d = arrayList;
        aZ(farVar);
        hoh hohVar = this.aH;
        if (hohVar != null) {
            list = hohVar.e;
        } else {
            int i = yyk.e;
            list = zcg.b;
        }
        farVar.b = list;
        hkx hkxVar = this.bq;
        farVar.c = hkxVar != null ? ((hky) hkxVar).o : null;
    }

    @Override // defpackage.hmy
    public final void I(xoa xoaVar) {
        aJ(this.d, new hrp(this, xoaVar));
    }

    @Override // defpackage.hmz
    public final int J() {
        HorizontalGridView horizontalGridViewBi;
        int iBe;
        azw azwVarDO = dO(this.d);
        if (!bH(azwVarDO) || (horizontalGridViewBi = bi(azwVarDO)) == null || horizontalGridViewBi.getChildCount() <= 0 || (iBe = be(horizontalGridViewBi)) == 0) {
            return 0;
        }
        return iBe + 1;
    }

    @Override // defpackage.hmz
    public final List K() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.bF);
        arrayList.addAll(this.bB);
        return arrayList;
    }

    @Override // defpackage.hmz
    public final boolean M() {
        int iF = this.aK.f();
        if (this.d <= iF || this.aK.e() == 0) {
            return false;
        }
        aJ(iF, new hrm(this));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hpa
    public final boolean N(azk azkVar, Object obj, azr azrVar) {
        if (this.aQ != gph.b && this.aQ != gph.c && (obj instanceof hkk)) {
            hkk hkkVar = (hkk) obj;
            if (!hkkVar.B()) {
                hkkVar.f();
                return false;
            }
            if (hkkVar.z()) {
                if (azrVar instanceof hhl) {
                    hhl hhlVar = (hhl) azrVar;
                    this.bj.m(azkVar.g, hkkVar, this instanceof hmt, this.aK.h(azrVar), hhlVar.a(), hkkVar.b, hhlVar, bj(), dJ());
                } else {
                    this.bj.m(azkVar.g, hkkVar, this instanceof hmt, this.aK.h(azrVar), 0, hkkVar.b, null, bj(), dJ());
                }
                this.aU.a(new Intent("android.intent.action.VIEW", Uri.parse("https://tv.google.com/").buildUpon().path("entitymenu/asset").appendPath(hkkVar.k()).build()).setPackage("com.google.android.apps.tv.launcherx"), new hrl(this));
                return true;
            }
            hkkVar.f();
        }
        return false;
    }

    @Override // defpackage.hrd
    public final void O(boolean z) {
        uuj uujVar;
        if (this.aQ != gph.a || (uujVar = this.bA) == null) {
            return;
        }
        uujVar.n = z;
        if (uujVar.g != null) {
            uujVar.b();
        }
    }

    @Override // defpackage.bq
    public final void X() {
        this.aK.l();
        this.aJ = null;
        bL();
        bM();
        this.P = true;
    }

    public boolean aF() {
        return this.bx;
    }

    public String aM() {
        hkx hkxVar = this.bq;
        return hkxVar != null ? yqv.b(((hky) hkxVar).j) : "";
    }

    protected void aO(int i) {
        if (this.bq == null) {
            return;
        }
        int iE = this.aK.e();
        List listD = this.bq.d();
        if (listD != null && !listD.isEmpty()) {
            for (int i2 = 0; i2 < listD.size(); i2++) {
                adyn adynVar = (adyn) listD.get(i2);
                if (adynVar.e.size() == 0) {
                    ((zdv) ((zdv) aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "addGoogleSearchResultsRows", 1164, "SearchRowsFragment.java")).u("athome.List is empty");
                } else {
                    bm((this.aK.e() + i) - iE, adynVar, (adynVar.b & 2) != 0 ? adynVar.d : "");
                }
            }
        }
        List list = ((hky) this.bq).f;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            xqe xqeVar = (xqe) list.get(i3);
            bl((this.aK.e() + i) - iE, xqeVar, (xqeVar.b & 1) != 0 ? xqeVar.c : "");
        }
    }

    public void aR(int i) {
        this.bw = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.awk
    /* renamed from: aU, reason: merged with bridge method [inline-methods] */
    public void ew(azk azkVar, Object obj, azw azwVar, azr azrVar) {
        gph gphVar;
        gph gphVar2;
        int iA;
        int iA2;
        if ((obj instanceof hkk) && (azkVar instanceof hoz)) {
            hkk hkkVar = (hkk) obj;
            bx(azkVar, hkkVar, azrVar);
            Intent intentD = hkkVar.d();
            if (intentD == null) {
                if (!(hkkVar instanceof fat)) {
                    ((zdv) ((zdv) aG.c()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "onItemClicked", 617, "SearchRowsFragment.java")).u("#onItemClicked: item has no intent.");
                    this.aS.m(dZ().getResources().getString(R.string.assistant_internal_error));
                    return;
                }
                fat fatVar = (fat) hkkVar;
                if (fatVar.dG()) {
                    this.aR.b(fatVar);
                    return;
                } else {
                    ((zdv) ((zdv) aG.c()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "onItemClicked", 610, "SearchRowsFragment.java")).u("#onItemClicked: item instanceof DisplayEntityItem has no tapInput");
                    this.aS.m(dZ().getResources().getString(R.string.assistant_internal_error));
                    return;
                }
            }
            gph gphVar3 = this.aQ;
            gph gphVar4 = gph.a;
            if ((gphVar3 != gphVar4 || !Objects.equals(intentD.getPackage(), "com.google.android.apps.tv.launcherx")) && (((gphVar = this.aQ) != (gphVar2 = gph.b) && gphVar != gph.c) || !Objects.equals(intentD.getPackage(), "com.google.android.tvlauncher"))) {
                gph gphVar5 = this.aQ;
                if ((gphVar5 == gphVar2 || gphVar5 == gph.c) && Objects.equals(intentD.getPackage(), "com.google.android.katniss") && (azrVar instanceof hir)) {
                    this.aS.h(new hri(intentD));
                    return;
                }
                if (Objects.equals(intentD.getPackage(), "com.google.android.katniss") && (azrVar instanceof hir)) {
                    this.aU.b(intentD, exj.c, exk.a, 1, new hrj(this));
                    return;
                }
                if (Objects.equals(intentD.getPackage(), "com.google.android.youtube.tv")) {
                    intentD.setData(bg(intentD.getData(), "launch", "search"));
                    if (this.bc.k()) {
                        intentD.setData(bg(intentD.getData(), "launch_tag", "voice"));
                        intentD.setData(bg(intentD.getData(), "vs", "1"));
                    }
                }
                if (this.aQ == gphVar4 && intentD.getDataString().startsWith("https://play.google.com/store/apps/details")) {
                    Account accountC = this.aW.c();
                    String str = accountC != null ? accountC.name : "";
                    str.getClass();
                    zkl zklVarG = zkl.d.g();
                    int i = zjr.b;
                    byte[] bArrD = zjp.a.a(str, Charset.forName("UTF-8")).d();
                    String strK = zklVarG.k(bArrD, bArrD.length);
                    ((zdv) ((zdv) aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "onItemClicked", 578, "SearchRowsFragment.java")).x("intent: %s", strK);
                    intentD.setData(bg(intentD.getData(), "ah", strK));
                }
                ((zdv) ((zdv) aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "onItemClicked", 581, "SearchRowsFragment.java")).x("intent: %s", intentD.getData());
                this.aU.b(intentD, exj.b, exk.a, 1, new hrk(this));
                return;
            }
            String strBj = bj();
            intentD.putExtra("android.katniss.extra.ASST_SERVER_PARENT_EVENT_ID", strBj);
            try {
                zpp zppVarA = pap.a(strBj);
                zpn zpnVar = zpn.a;
                zpm zpmVar = new zpm();
                if ((zpmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpmVar.y();
                }
                zpn zpnVar2 = (zpn) zpmVar.b;
                zppVarA.getClass();
                zpnVar2.c = zppVarA;
                zpnVar2.b |= 1;
                zpn zpnVar3 = (zpn) zpmVar.v();
                try {
                    int i2 = zpnVar3.memoizedSerializedSize;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(zpnVar3.getClass()).a(zpnVar3);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i2 & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(zpnVar3.getClass()).a(zpnVar3);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            zpnVar3.memoizedSerializedSize = (zpnVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(zpnVar3.getClass()).m(zpnVar3, abwa.a(abvwVar));
                    abvwVar.K();
                    intentD.putExtra("android.katniss.extra.ASST_CLIENT_PARENT_EVENT_ID", bArr);
                    abzy abzyVarA = acbh.a(this.bi.a());
                    try {
                        int i3 = abzyVarA.memoizedSerializedSize;
                        if ((i3 & Integer.MIN_VALUE) != 0) {
                            iA2 = abza.a.a(abzyVarA.getClass()).a(abzyVarA);
                            if (iA2 < 0) {
                                throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                            }
                        } else {
                            iA2 = i3 & Integer.MAX_VALUE;
                            if (iA2 == Integer.MAX_VALUE) {
                                iA2 = abza.a.a(abzyVarA.getClass()).a(abzyVarA);
                                if (iA2 < 0) {
                                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                }
                                abzyVarA.memoizedSerializedSize = (abzyVarA.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                            }
                        }
                        byte[] bArr2 = new byte[iA2];
                        abvw abvwVar2 = new abvw(bArr2, 0, iA2);
                        abza.a.a(abzyVarA.getClass()).m(abzyVarA, abwa.a(abvwVar2));
                        abvwVar2.K();
                        intentD.putExtra("intent_sent_time_instant", bArr2);
                        intentD.getExtras();
                        if (this.aQ == gph.a) {
                            intentD.putExtra("launch-origin", "com.google.android.katniss");
                        } else {
                            intentD.putExtra("source_package", "com.google.android.katniss");
                        }
                        this.aU.a(intentD, new hrh(this));
                    } catch (IOException e) {
                        throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", abzyVarA), e);
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", zpnVar3), e2);
                }
            } catch (IOException e3) {
                ((zdv) ((zdv) ((zdv) aG.c()).p(e3)).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "onItemClicked", (char) 495, "SearchRowsFragment.java")).u("EventIdMessage decoding failed.");
            }
        }
    }

    public void aY() {
        this.bJ = false;
        this.aK.r(null);
        this.aK.l();
        bv();
    }

    @Override // defpackage.atx, defpackage.bq
    public void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        this.an = this;
        VerticalGridView verticalGridView = this.b;
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                atx.aG((ayo) verticalGridView.l(verticalGridView.getChildAt(i))).r = this.an;
            }
        }
        this.ao = this;
        if (this.ak) {
            throw new IllegalStateException("Item clicked listener must be set before views are created");
        }
        this.aj = true;
        VerticalGridView verticalGridView2 = this.b;
        if (verticalGridView2 != null) {
            int childCount2 = verticalGridView2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                atx.aH((ayo) verticalGridView2.l(verticalGridView2.getChildAt(i2)), this.aj);
            }
        }
        bd(bundle);
        bE(this.b);
        gph gphVar = this.aQ;
        gph gphVar2 = gph.a;
        if (gphVar == gphVar2) {
            Resources resources = view.getResources();
            uuj uujVar = new uuj();
            this.bA = uujVar;
            uujVar.f = R.id.row_header_container;
            uujVar.k = resources.getFraction(R.fraction.above_selected_channel_dimming_factor, 1, 1);
            this.bA.l = resources.getFraction(R.fraction.selected_channel_dimming_factor, 1, 1);
            this.bA.m = resources.getFraction(R.fraction.below_selected_channel_dimming_factor, 1, 1);
            uuj uujVar2 = this.bA;
            VerticalGridView verticalGridView3 = this.b;
            verticalGridView3.ah(null);
            uujVar2.g = verticalGridView3;
            uujVar2.h = verticalGridView3.getResources().getDisplayMetrics().widthPixels;
            uujVar2.i = verticalGridView3 instanceof VerticalGridView;
            uujVar2.j = !uujVar2.i && verticalGridView3.getResources().getConfiguration().getLayoutDirection() == 1;
            verticalGridView3.y(uujVar2.b);
            verticalGridView3.ad.L(uujVar2.c);
            verticalGridView3.ad.K(uujVar2.d);
            uujVar2.a();
        }
        this.au = true;
        if (this.ar) {
            hvc hvcVar = new hvc(s(), this.aQ == gphVar2);
            this.aK = hvcVar;
            hmj hmjVar = this.bd;
            gph gphVar3 = hmjVar.b;
            azm hoyVar = gphVar3 == gphVar2 ? new hoy(this, this) : new hqa(this, this);
            hoo hooVar = new hoo(this);
            awo awoVar = new awo();
            awoVar.b(hol.class, hooVar);
            awoVar.b(hin.class, new hio());
            awoVar.b(hir.class, new hit(this));
            awoVar.b(hoh.class, new hne(this, Objects.equals(hmjVar.c.a(), true), this));
            awoVar.b(hjw.class, new hjv(this));
            awoVar.b(hks.class, hooVar);
            awoVar.b(hku.class, hoyVar);
            awoVar.b(hlv.class, new hlw(this));
            awoVar.b(hmq.class, new hms(this));
            awoVar.b(hhf.class, new hhg());
            awoVar.b(hpu.class, hoyVar);
            awoVar.b(hsj.class, new hrx(this, this));
            awoVar.b(hsy.class, new hsz());
            awoVar.b(htg.class, hoyVar);
            if (gphVar3 == gphVar2) {
                awoVar.b(hkp.class, new hkr(this, hmjVar.a));
                awoVar.b(hlz.class, new hma(this, this));
                awoVar.b(hmm.class, new hmp(this, this));
                awoVar.b(hsk.class, new hsl());
                awoVar.b(hsm.class, new hsn());
                awoVar.b(hso.class, new hsp());
            }
            hvcVar.d(awoVar);
            aS();
        }
        hkx hkxVar = this.bq;
        if (hkxVar == null || hkxVar.j()) {
            bO();
        }
        by();
        bN();
        if (this.ar) {
            hvc hvcVar2 = this.aK;
            if (((atn) this).a != hvcVar2) {
                ((atn) this).a = hvcVar2;
                aB();
            }
            if (hkb.j(this)) {
                bb();
            } else if (this.aK.e() <= 0 && !this.bw) {
                ((zdv) ((zdv) aG.c()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "onViewCreated", 1385, "SearchRowsFragment.java")).u("#onViewCreated, during first launch, no response processed");
            } else if (this.aK.e() > 0) {
                aT();
            }
        }
        Bundle bundle2 = this.n;
        if (bundle2 == null || bundle2.getBoolean("need_focus_on_search_result", true)) {
            bD();
        }
        this.ar = false;
    }

    @Override // defpackage.bq
    public final Animator as(int i, int i2) {
        ViewGroup viewGroup = (ViewGroup) this.R;
        if (!(viewGroup instanceof hle)) {
            return null;
        }
        hle hleVar = (hle) viewGroup;
        if (i2 != 0) {
            return AnimatorInflater.loadAnimator(hleVar.getContext(), i2);
        }
        return null;
    }

    @Override // defpackage.hue
    public final void bA(String str) {
        huo.aB(this.aS, str);
        ghr ghrVar = this.bj;
        adwq adwqVar = this.aH.f().c;
        if (adwqVar == null) {
            adwqVar = adwq.a;
        }
        ghrVar.c(adwqVar.d, bj());
    }

    public final void bB(hkx hkxVar, boolean z) {
        if (hkxVar == null || this.bq == hkxVar) {
            return;
        }
        this.bq = hkxVar;
        ((hky) hkxVar).a = this;
        this.bw = false;
        this.bI = false;
        this.bH = false;
        this.bv = z;
        by();
    }

    public final void bC() {
        hmq hmqVar = this.aI;
        if (hmqVar != null) {
            hkx hkxVar = this.bq;
            if (hkxVar != null) {
                ((hky) hkxVar).b = null;
            }
            hvc hvcVar = this.aK;
            int iH = hvcVar.h(hmqVar);
            if (iH >= 0) {
                List list = hvcVar.b;
                if (iH < list.size()) {
                    if (hvcVar.a) {
                        int iE = hvcVar.e();
                        if (iH == 0 && iE > 1 && hvcVar.v()) {
                            Object objJ = hvcVar.j(1);
                            if (objJ instanceof uua) {
                                hvcVar.z((uua) objJ);
                                hvcVar.n(hvcVar.f() + 1);
                            }
                        } else if (iH == iE - 1 && iE > 2 && hvcVar.d == null) {
                            int i = iH - 1;
                            Object objJ2 = hvcVar.j(i);
                            if (objJ2 instanceof uua) {
                                uua uuaVar = (uua) objJ2;
                                hvcVar.A(uuaVar);
                                uuaVar.p(uuh.class, null);
                                hvcVar.n(hvcVar.f() + i);
                            }
                        }
                    }
                    list.remove(iH);
                    hvcVar.e.e(iH + hvcVar.f(), 1);
                }
            }
            this.aI = null;
        }
    }

    protected final void bD() {
        View viewBh = bh();
        if (viewBh != null) {
            viewBh.setFocusable(true);
            viewBh.requestFocus();
        }
    }

    public final void bE(View view) {
        pan panVar = new pan(this.bp);
        panVar.e(1);
        panVar.f();
        paq.c(view, panVar);
    }

    public final void bF() {
        for (int i = 0; i < this.aK.e(); i++) {
            if (this.aK.j(i) instanceof jac) {
                ((jac) this.aK.j(i)).o();
            }
        }
        this.av = true;
    }

    protected final void bG(htg htgVar) {
        hog hogVar;
        hoh hohVar = this.aH;
        if (hohVar != null) {
            if (hohVar.d == null) {
                hohVar.f.add(htgVar);
            } else if (hohVar.y(htgVar) && (hogVar = hohVar.h) != null) {
                hogVar.m();
            }
            bt();
        }
    }

    public final boolean bH(azk azkVar) {
        return this.aQ == gph.a ? azkVar instanceof hox : azkVar instanceof ayx;
    }

    protected void bd(Bundle bundle) {
        this.b.y(new hrv());
    }

    public final int be(HorizontalGridView horizontalGridView) {
        return horizontalGridView.l(horizontalGridView.getChildAt(0)).b();
    }

    public final int bf(HorizontalGridView horizontalGridView) {
        return horizontalGridView.l(horizontalGridView.getChildAt(Math.max(horizontalGridView.getChildCount() - 1, 0))).b();
    }

    final Uri bg(Uri uri, String str, String str2) {
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    public final View bh() {
        hle hleVar = (hle) this.R;
        if (hleVar != null) {
            return hleVar.getFragmentView();
        }
        return null;
    }

    public final HorizontalGridView bi(azk azkVar) {
        return this.aQ == gph.a ? ((hox) azkVar).b : ((ayx) azkVar).a;
    }

    public final String bj() {
        hkx hkxVar = this.bq;
        if (hkxVar != null) {
            return ((hky) hkxVar).n;
        }
        return null;
    }

    public final void bk(xps xpsVar) {
        ((hky) this.bq).c = xpsVar;
        if (this.bH) {
            bI(xpsVar);
        } else {
            this.bD = true;
        }
    }

    protected final void bl(int i, xqe xqeVar, String str) {
        if (xqeVar.e.size() == 0) {
            ((zdv) ((zdv) aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "addGoogleMediaBrowseRow", 1221, "SearchRowsFragment.java")).u("browseList.getMediaList is empty");
            return;
        }
        hku hkuVar = new hku(s(), xqeVar, this.aQ == gph.a);
        if (hkuVar.f() == 0) {
            ((zdv) ((zdv) aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "addGoogleMediaBrowseRow", 1228, "SearchRowsFragment.java")).u("MediaBrowseRow.getChildCount() is empty");
        } else {
            bu(hkuVar, str);
            this.aK.m(i, hkuVar);
        }
    }

    protected final void bm(int i, adyn adynVar, String str) {
        if (adynVar.e.size() == 0) {
            ((zdv) ((zdv) aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "addGoogleSearchResultsRow", 1189, "SearchRowsFragment.java")).u("athome.List is empty");
            return;
        }
        hpu hpuVar = (hpu) this.bg.a();
        hpuVar.o(s(), adynVar);
        bu(hpuVar, str);
        this.aK.m(i, hpuVar);
    }

    public final void bn(List list) {
        this.bB.addAll(list);
        bO();
        bN();
    }

    public final void bo(abky abkyVar) {
        ((hky) this.bq).b = abkyVar;
        if (this.bI) {
            bJ(abkyVar);
        } else {
            this.bE = true;
        }
    }

    public final void bp(xqe xqeVar, String str) {
        if (xqeVar.e.size() == 0) {
            ((zdv) ((zdv) aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "appendGoogleMediaBrowseRow", 1242, "SearchRowsFragment.java")).u("browseList.getMediaList is empty");
            return;
        }
        hku hkuVar = new hku(s(), xqeVar, this.aQ == gph.a);
        if (hkuVar.f() == 0) {
            ((zdv) ((zdv) aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "appendGoogleMediaBrowseRow", 1249, "SearchRowsFragment.java")).u("MediaBrowseRow.getChildCount() is empty");
        } else {
            bu(hkuVar, str);
            this.aK.k(hkuVar);
        }
    }

    protected final void bq(htg htgVar, String str) {
        bu(htgVar, str);
        if (this.aK.e() == 0) {
            dL();
        }
        double d = htgVar.g;
        for (int i = 1; i < this.aK.e(); i++) {
            Object objJ = this.aK.j(i);
            if (d > (objJ instanceof hhn ? ((hhn) objJ).k() : 1.0d)) {
                this.aK.m(i, htgVar);
                htgVar.d();
                return;
            }
        }
        this.aK.k(htgVar);
        htgVar.d();
        this.aK.e();
    }

    public final void br() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            bs();
            return;
        }
        bM();
        Runnable runnableH = wyo.h(new Runnable() { // from class: hre
            @Override // java.lang.Runnable
            public final void run() {
                hrw hrwVar = this.a;
                hrwVar.bs();
                hrwVar.bz = Optional.empty();
            }
        });
        this.bz = Optional.of(zxn.j(wyo.h(runnableH), this.bk));
    }

    public final void bs() {
        for (int i = 0; i < this.aK.e(); i++) {
            if (this.aK.j(i) instanceof jac) {
                ((jac) this.aK.j(i)).p();
            }
        }
        this.av = false;
    }

    protected final void bt() {
        hle hleVar = (hle) this.R;
        if (hleVar != null) {
            hleVar.b(bh());
        }
        hjz.a(this);
    }

    protected final void bu(ays aysVar, String str) {
        aysVar.b = new aye(str);
        aysVar.a.d(n());
    }

    public final void bv() {
        this.bf.a();
        this.ba.o(gmc.G, this.bc.a(), this.bc.b());
        this.bj.af();
        if (((Boolean) this.bb.a()).booleanValue()) {
            ((gfn) this.aX.a()).a(rpm.cl()).b().c();
        } else {
            this.aY.a(rpm.cl(), abqb.OK, null, null);
        }
        hkx hkxVar = this.bq;
        if (hkxVar == null || ((hky) hkxVar).o == null) {
            gmd gmdVar = this.ba;
            gmc gmcVar = gmc.D;
            gmc gmcVar2 = gmc.H;
            gmdVar.q(gmcVar, gmcVar2, this.bc.a(), this.bc.b());
            this.be.C(gmcVar2, Instant.EPOCH);
            this.aZ.y(gma.c);
            if (((Boolean) this.bb.a()).booleanValue()) {
                ((gfn) this.aX.a()).a(rpm.ck()).b().c();
            } else {
                this.aY.a(rpm.ck(), abqb.OK, null, null);
            }
            if (((Boolean) this.aO.a()).booleanValue()) {
                gfg gfgVarA = ((gfn) this.aX.a()).c(rpm.dQ()).a(this.bc.b());
                gfgVarA.g(this.bc.b());
                abxk abxkVar = ahrs.a;
                ahrq ahrqVar = new ahrq();
                ahrc ahrcVar = ahrc.a;
                ahqy ahqyVar = new ahqy();
                String str = fbo.W.ah.a;
                if ((ahqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqyVar.y();
                }
                ahrc ahrcVar2 = (ahrc) ahqyVar.b;
                str.getClass();
                ahrcVar2.b |= 1;
                ahrcVar2.c = str;
                if ((ahqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqyVar.y();
                }
                ahrc ahrcVar3 = (ahrc) ahqyVar.b;
                ahrcVar3.d = 9;
                ahrcVar3.b |= 2;
                if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahrqVar.y();
                }
                ahrs ahrsVar = (ahrs) ahrqVar.b;
                ahrc ahrcVar4 = (ahrc) ahqyVar.v();
                ahrcVar4.getClass();
                ahrsVar.g = ahrcVar4;
                ahrsVar.f = 8;
                String strB = this.bc.b();
                if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahrqVar.y();
                }
                ahrs ahrsVar2 = (ahrs) ahrqVar.b;
                strB.getClass();
                ahrsVar2.e |= 2;
                ahrsVar2.i = strB;
                gfgVarA.f((ahrs) ahrqVar.v());
                gfgVarA.c(abqb.OK);
            }
            ((zdv) ((zdv) aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "logDisplayEvent", 1622, "SearchRowsFragment.java")).u("Result displayed spock carousel.");
        } else {
            gmd gmdVar2 = this.ba;
            gmc gmcVar3 = gmc.D;
            gmc gmcVar4 = gmc.I;
            gmdVar2.q(gmcVar3, gmcVar4, this.bc.a(), this.bc.b());
            this.be.C(gmcVar4, Instant.EPOCH);
            this.aZ.y(gma.e);
            if (((Boolean) this.bb.a()).booleanValue()) {
                ((gfn) this.aX.a()).a(rpm.cm()).b().c();
            } else {
                this.aY.a(rpm.cm(), abqb.OK, null, null);
            }
            ((zdv) ((zdv) aG.b()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "logDisplayEvent", 1584, "SearchRowsFragment.java")).u("Result displayed spock entity.");
        }
        this.bj.x(dJ());
        bw(bh(), false);
    }

    protected final void bw(View view, boolean z) {
        hkx hkxVar = this.bq;
        List list = hkxVar != null ? ((hky) hkxVar).p : null;
        ghr ghrVar = this.bj;
        zpg zpgVar = this.bo;
        boolean z2 = this instanceof hmt;
        String strAM = aM();
        hoh hohVar = this.aH;
        ghrVar.p(zpgVar, z2, strAM, z, hohVar != null ? hohVar.e : null, this.aK, list, view, bj());
        this.bu = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void bx(azk azkVar, hkk hkkVar, azr azrVar) {
        hhl hhlVar;
        int iA;
        if (!TextUtils.isEmpty(hkkVar.l())) {
            this.bl.e(hkkVar.l());
        }
        View view = azkVar.g;
        if (paq.a(view) == null) {
            ((zdv) ((zdv) aG.c()).q("com/google/android/apps/tvsearch/results/searchrows/SearchRowsFragment", "logItemClick", 447, "SearchRowsFragment.java")).u("ViewHolder is missing the Item#getVe()");
            paq.c(view, hkkVar.o());
        }
        if (azrVar instanceof hhl) {
            hhlVar = (hhl) azrVar;
            iA = hhlVar.a();
        } else {
            hhlVar = null;
            iA = 0;
        }
        int iH = this.aK.h(azrVar);
        ghr ghrVar = this.bj;
        boolean z = this instanceof hmt;
        ghrVar.l(view, hkkVar, z, iH, iA, hkkVar.b, hhlVar, bj());
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void by() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrw.by():void");
    }

    final void bz(adyd adydVar) {
        if (!C() && adydVar.i.size() <= 0) {
            adxn adxnVar = adydVar.g;
            if (adxnVar == null) {
                adxnVar = adxn.a;
            }
            if (adxnVar.f.size() <= 0) {
                return;
            }
        }
        bD();
    }

    public abnb dJ() {
        return abnb.UNKNOWN;
    }

    protected void dK() {
        List<htg> list = this.bB;
        for (htg htgVar : list) {
            bq(htgVar, htgVar.d());
            bG(htgVar);
        }
        this.bF.addAll(list);
        list.clear();
    }

    @Override // defpackage.atx, defpackage.bq
    public final void e() {
        uuj uujVar;
        View viewBh = bh();
        if (viewBh != null) {
            this.bG = viewBh.isFocusable();
        }
        this.au = false;
        hoh hohVar = this.aH;
        if (hohVar != null) {
            hohVar.j = false;
        }
        View view = this.R;
        if (view instanceof hle) {
            ((hle) view).e();
        }
        if (this.aQ == gph.a && (uujVar = this.bA) != null) {
            VerticalGridView verticalGridView = this.b;
            uujVar.a.clear();
            yqw.L(verticalGridView == uujVar.g);
            verticalGridView.ac(uujVar.b);
            verticalGridView.ad.W(uujVar.c);
            verticalGridView.ad.V(uujVar.d);
            ValueAnimator valueAnimator = uujVar.e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                uujVar.e = null;
            }
            uujVar.g = null;
        }
        super.e();
        this.aJ.removeCallbacksAndMessages(null);
    }

    protected abstract boolean es();

    public void et(final List list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            bn(list);
            return;
        }
        bL();
        Runnable runnableH = wyo.h(new Runnable() { // from class: hrf
            @Override // java.lang.Runnable
            public final void run() {
                hrw hrwVar = this.a;
                hrwVar.bn(list);
                hrwVar.by = Optional.empty();
            }
        });
        this.by = Optional.of(zxn.j(wyo.h(runnableH), this.bk));
    }

    protected void eu() {
        ListIterator listIterator = this.bB.listIterator();
        while (listIterator.hasNext()) {
            htg htgVar = (htg) listIterator.next();
            if (htgVar.e) {
                bq(htgVar, htgVar.d());
                bG(htgVar);
                listIterator.remove();
                this.bF.add(htgVar);
            }
        }
    }

    @Override // defpackage.bq
    public final void ey(Bundle bundle) {
        super.ey(bundle);
        this.aJ = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.awl
    public final /* bridge */ /* synthetic */ void f(azk azkVar, azw azwVar, Object obj) {
        Object obj2 = (azr) obj;
        if (azwVar.m && azkVar != null && azkVar.g.hasFocus()) {
            this.aS.i();
        }
        if (obj2 instanceof hhl) {
            hhl hhlVar = (hhl) obj2;
            this.bl.f(aM(), hhlVar.e(), hhlVar.f());
        }
    }

    @Override // defpackage.bq
    public final void h() {
        this.P = true;
        hjz.a(this);
        this.bj.w(dJ());
    }

    @Override // defpackage.bq
    public final void i() {
        abnb abnbVarDJ = dJ();
        this.bj.y(abnbVarDJ);
        this.bj.v(bj(), abnbVarDJ);
        bC();
        this.P = true;
    }

    @Override // defpackage.hek
    public final wke k() {
        return this.aT;
    }

    @Override // defpackage.hel
    public final void l(View view, hej hejVar) {
        String str = hejVar.b;
        if (!TextUtils.isEmpty(str)) {
            this.bl.c(str);
        }
        bw(view, true);
        ghr ghrVar = this.bj;
        boolean z = this instanceof hmt;
        String strBj = bj();
        hoh hohVar = this.aH;
        ghrVar.z(view, hejVar, z, strBj, hohVar == null ? null : hohVar.e);
        if (hejVar.a()) {
            this.aR.c();
            return;
        }
        if (hejVar.b()) {
            this.aS.g();
            return;
        }
        if (hejVar.c()) {
            Intent intent = hejVar.h;
            if (intent != null) {
                this.aR.e(intent);
                return;
            }
            return;
        }
        Intent intent2 = hejVar.h;
        if (intent2 != null) {
            xkc xkcVar = hejVar.j;
            if (xkcVar != null) {
                this.aR.g(xkcVar);
            }
            this.aU.b(intent2, exj.b, exk.a, 1, new hrn(this));
        }
    }

    @Override // defpackage.hmb
    public final AccessibilityManager m() {
        return this.aN;
    }

    @Override // defpackage.hmb
    public final azn n() {
        azm hpgVar;
        if (this.aL == null) {
            hmi hmiVar = this.aV;
            awo awoVar = new awo();
            if (hmiVar.b == gph.a) {
                Object objA = hmiVar.a.a();
                objA.getClass();
                hpgVar = new hpt(this, ((Boolean) objA).booleanValue(), hmiVar.c, hmiVar.d);
            } else {
                Object objA2 = hmiVar.a.a();
                objA2.getClass();
                hpgVar = new hpg(this, ((Boolean) objA2).booleanValue(), this);
            }
            awoVar.b(hkk.class, hpgVar);
            awoVar.b(hsq.class, new hss());
            awoVar.b(hiy.class, new hja());
            this.aL = awoVar;
        }
        return this.aL;
    }

    @Override // defpackage.hmb
    public final azn o() {
        if (this.aM == null) {
            hmi hmiVar = this.aV;
            Object objA = hmiVar.a.a();
            objA.getClass();
            this.aM = new bar(new hok(((Boolean) objA).booleanValue(), this, hmiVar.c, hmiVar.d));
        }
        return this.aM;
    }

    @Override // defpackage.hmb
    public final few p() {
        return this.aS;
    }

    @Override // defpackage.hmb
    public final ghr q() {
        return this.bj;
    }

    @Override // defpackage.hmb
    public final gph r() {
        return this.aQ;
    }

    @Override // defpackage.hmb
    public final hpa t() {
        if (this.aQ == gph.a) {
            return this;
        }
        return null;
    }

    @Override // defpackage.hmb
    public final htv u() {
        if (this.at == null) {
            this.at = new htv(s());
        }
        return this.at;
    }

    @Override // defpackage.hmb
    public final tkw v() {
        return this.bm;
    }

    @Override // defpackage.hmb
    public final hqb w() {
        return aW();
    }

    @Override // defpackage.hmb
    public final hqb x() {
        return aW();
    }

    @Override // defpackage.hmc
    public final zpg y() {
        return this.bo;
    }

    public void L() {
    }

    protected void aS() {
    }

    public void aT() {
    }

    protected void bb() {
    }

    protected void dL() {
    }

    @Override // defpackage.hek
    public final hel j() {
        return this;
    }

    public /* synthetic */ void aD(bq bqVar) {
    }

    public void aP(xpy xpyVar) {
    }

    public void aQ(xpu xpuVar) {
    }

    protected void aZ(far farVar) {
    }
}
