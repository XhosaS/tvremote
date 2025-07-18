package defpackage;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.tvsearch.results.activity.keyboard.KeyboardSearchActivity;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.android.katniss.R;
import com.google.android.libraries.tv.widgets.layout.FocusListenerConstraintLayout;
import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhd extends hhe implements hka, few, ezb, ezc, hhh, hjy, ffm {
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/results/activity/keyboard/KeyboardSearchActivityPeer");
    private final agow A;
    private final agow B;
    private final gfr C;
    private final ghr D;
    private final String E;
    public final ahbt c;
    public final fyq d;
    public final InputMethodManager e;
    public final KeyboardSearchActivity f;
    public final agow g;
    public final jbd h;
    public final agow i;
    public final agow j;
    public ViewGroup k;
    public hyi l;
    public FocusListenerConstraintLayout m;
    public View n;
    public EditText o;
    public final ewm p;
    public final de q;
    public int r;
    public boolean s;
    public final eyy t;
    public final ewo u;
    private final ActivityManager v;
    private final agow w;
    private final gzu x;
    private final jrs y;
    private final exl z;

    public hhd(ActivityManager activityManager, ahbt ahbtVar, agow agowVar, gzu gzuVar, fyq fyqVar, ewo ewoVar, jrs jrsVar, InputMethodManager inputMethodManager, exl exlVar, agow agowVar2, gtu gtuVar, agow agowVar3, gfr gfrVar, eyy eyyVar, KeyboardSearchActivity keyboardSearchActivity, agow agowVar4, jbd jbdVar, ghr ghrVar, agow agowVar5, agow agowVar6) {
        activityManager.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        gzuVar.getClass();
        agowVar2.getClass();
        gtuVar.getClass();
        gfrVar.getClass();
        eyyVar.getClass();
        agowVar4.getClass();
        jbdVar.getClass();
        ghrVar.getClass();
        agowVar6.getClass();
        this.v = activityManager;
        this.c = ahbtVar;
        this.w = agowVar;
        this.x = gzuVar;
        this.d = fyqVar;
        this.u = ewoVar;
        this.y = jrsVar;
        this.e = inputMethodManager;
        this.z = exlVar;
        this.A = agowVar2;
        this.B = agowVar3;
        this.C = gfrVar;
        this.t = eyyVar;
        this.f = keyboardSearchActivity;
        this.g = agowVar4;
        this.h = jbdVar;
        this.D = ghrVar;
        this.i = agowVar5;
        this.j = agowVar6;
        this.E = "keyboardSearchActivityKey";
        this.p = new ewm() { // from class: hgw
            @Override // defpackage.ewm
            public final void a() {
                hhd hhdVar = this.a;
                hhdVar.G();
                hhdVar.f.finish();
            }
        };
        this.q = ((bw) keyboardSearchActivity).a.a.e;
    }

    private final void K(String str) {
        gfr gfrVar = this.C;
        gfrVar.b(rpm.cZ(), null, null);
        if (((Boolean) this.A.a()).booleanValue()) {
            ((gfn) this.B.a()).a(rpm.db()).b().c();
        } else {
            gfrVar.a(rpm.db(), abqb.OK, null, null);
        }
        ((ffn) this.i.a()).T(str);
        this.D.ad(str, 2, 4);
        q(str, null);
    }

    @Override // defpackage.ffm
    public final void A(Duration duration) {
        duration.getClass();
    }

    @Override // defpackage.ffm
    public final boolean B() {
        return false;
    }

    @Override // defpackage.ffm
    public final void C(bq bqVar) {
        ab abVar = new ab(((bw) this.f).a.a.e);
        abVar.m(bqVar, "on_device_loading_tag");
        abVar.e();
    }

    @Override // defpackage.ffm
    public final bq D() {
        de deVar = ((bw) this.f).a.a.e;
        bq bqVarD = deVar.b.d("on_device_loading_tag");
        if (bqVarD == null) {
            return null;
        }
        ab abVar = new ab(deVar);
        abVar.k(bqVarD);
        abVar.e();
        return bqVarD;
    }

    @Override // defpackage.hka
    /* renamed from: E */
    public final hrc am() {
        hrc hrcVar = new hrc();
        hkb.e(hrcVar);
        return hrcVar;
    }

    public final hrw F() {
        bq bqVarC = this.q.b.c(R.id.fullscreen_results_container);
        if (bqVarC instanceof hrw) {
            return (hrw) bqVarC;
        }
        return null;
    }

    public final void G() {
        EditText editText = this.o;
        if (editText == null) {
            agvy.b("textEntry");
            editText = null;
        }
        this.e.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public final void H(EditText editText) {
        this.D.E(4);
        String string = editText.getText().toString();
        if (((Boolean) this.w.a()).booleanValue()) {
            ((gfn) this.B.a()).b(rpm.t()).b().c();
        }
        if (((Boolean) this.A.a()).booleanValue()) {
            agow agowVar = this.B;
            ((gfn) agowVar.a()).b(rpm.bv()).b().c();
            ((gfn) agowVar.a()).a(rpm.ay()).b().c();
        } else {
            gfr gfrVar = this.C;
            gfrVar.b(rpm.bv(), null, null);
            gfrVar.a(rpm.ay(), abqb.OK, null, null);
        }
        if (agyv.n(string)) {
            return;
        }
        K(string);
    }

    public final void I(Intent intent) {
        String strA = ewj.a(intent, this.v);
        if (strA == null) {
            strA = "";
        }
        this.x.a(strA);
        String stringExtra = intent.getStringExtra("query");
        if (stringExtra == null || agyv.n(stringExtra)) {
            return;
        }
        EditText editText = this.o;
        if (editText == null) {
            agvy.b("textEntry");
            editText = null;
        }
        editText.setText(stringExtra);
        if (((Boolean) this.w.a()).booleanValue()) {
            ((gfn) this.B.a()).b(rpm.t()).b().c();
        }
        if (((Boolean) this.A.a()).booleanValue()) {
            agow agowVar = this.B;
            ((gfn) agowVar.a()).b(rpm.bv()).b().c();
            ((gfn) agowVar.a()).a(rpm.ax()).b().c();
        } else {
            gfr gfrVar = this.C;
            gfrVar.b(rpm.bv(), null, null);
            gfrVar.a(rpm.ax(), abqb.OK, null, null);
        }
        K(stringExtra);
    }

    public final boolean J(Intent intent) {
        if (agvy.c(intent.getAction(), "android.intent.action.ASSIST") && intent.getExtras() != null) {
            int intExtra = intent.getIntExtra("search_type", 1);
            boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.ASSIST_INPUT_HINT_KEYBOARD", false);
            if (intExtra == 2 || booleanExtra) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.hka
    public final /* synthetic */ bq P() {
        return null;
    }

    @Override // defpackage.hka
    public final /* bridge */ /* synthetic */ bq Q(boolean z) {
        hhw hhwVar = new hhw();
        hkb.e(hhwVar);
        Resources resources = this.f.getResources();
        hkb.d(hhwVar, resources.getDimensionPixelSize(R.dimen.space_blue) + resources.getDimensionPixelSize(R.dimen.top_padding_fullscreen));
        return hhwVar;
    }

    @Override // defpackage.hka
    public final /* synthetic */ bq R() {
        return null;
    }

    @Override // defpackage.hka
    public final /* synthetic */ bq S() {
        return null;
    }

    @Override // defpackage.ezb, defpackage.ffm
    public final void a() {
        this.f.finish();
    }

    @Override // defpackage.hjy
    public final void aB(bq bqVar) {
        if (agvy.c(bqVar, F())) {
            EditText editText = this.o;
            if (editText == null) {
                agvy.b("textEntry");
                editText = null;
            }
            editText.setText(((hrw) bqVar).aM());
        }
    }

    @Override // defpackage.hhh
    public final void aE(int i) {
        int i2 = this.r;
        if (i2 <= i) {
            i = i2;
        }
        View view = this.n;
        View view2 = null;
        if (view == null) {
            agvy.b("searchBarContainer");
            view = null;
        }
        float f = -i;
        if (view.getTranslationY() == f) {
            return;
        }
        View view3 = this.n;
        if (view3 == null) {
            agvy.b("searchBarContainer");
        } else {
            view2 = view3;
        }
        view2.setTranslationY(f);
    }

    @Override // defpackage.hka
    public final /* synthetic */ hrw an(boolean z) {
        return am();
    }

    @Override // defpackage.hka
    public final /* synthetic */ hrw ao() {
        return null;
    }

    @Override // defpackage.hka
    public final htu ap(String str) {
        htu htuVar = new htu();
        hts.sw.a(htuVar, str);
        hkb.e(htuVar);
        Resources resources = this.f.getResources();
        hkb.d(htuVar, resources.getDimensionPixelSize(R.dimen.space_purple) + resources.getDimensionPixelSize(R.dimen.top_padding_fullscreen));
        return htuVar;
    }

    @Override // defpackage.ezb
    public final /* synthetic */ void b() {
        this.f.finish();
    }

    @Override // defpackage.ezc
    public final String c() {
        return this.E;
    }

    @Override // defpackage.few
    public final void h(hlx hlxVar) {
        this.z.b(hlxVar.a(), exj.c, exk.a, 1, new hhc(this));
    }

    @Override // defpackage.few, defpackage.ffm
    public final void m(CharSequence charSequence) {
        charSequence.getClass();
        ((jru) this.y).d(charSequence, jru.a);
    }

    @Override // defpackage.ffm
    public final void p(far farVar) {
        farVar.h = abnb.SEARCH_RESULT_PAGE;
        hrw hrwVarF = F();
        if (hrwVarF != null) {
            hrwVarF.H(farVar);
        }
    }

    @Override // defpackage.ffm
    public final void q(String str, String str2) {
        r(new hko());
    }

    @Override // defpackage.ffm
    public final void r(bq bqVar) {
        bqVar.getClass();
        if (this.s) {
            Bundle bundleB = hkb.b(bqVar);
            bundleB.putInt("search_bar_container_height", this.r);
            bundleB.putBoolean("edit_query_enabled", true);
            de deVar = this.q;
            ab abVar = new ab(deVar);
            abVar.q(R.id.fullscreen_results_container, bqVar, null);
            if (bqVar instanceof hko) {
                abVar.n("loading-backstack-entry");
            } else {
                abVar.n(null);
            }
            abVar.i();
            deVar.ac();
        }
    }

    @Override // defpackage.ffm
    public final void s(xoa xoaVar) {
        ((zdv) b.c().q("com/google/android/apps/tvsearch/results/activity/keyboard/KeyboardSearchActivityPeer", "navigateScreen", 618, "KeyboardSearchActivityPeer.kt")).u("Unexpected call to navigateScreen()");
    }

    @Override // defpackage.ffm
    public final void z(SuggestionChipList suggestionChipList) {
        int i = suggestionChipList.g;
        if (i != 0) {
            ((zdv) b.c().q("com/google/android/apps/tvsearch/results/activity/keyboard/KeyboardSearchActivityPeer", "updateSuggestionsView", 630, "KeyboardSearchActivityPeer.kt")).v("Unexpected call to updateSuggestionsView() with %d", i);
        }
    }

    @Override // defpackage.few
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.few
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.few
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.few
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.few
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.few
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.few
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.few
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.ffm
    public final void t() {
    }

    @Override // defpackage.ffm
    public final void u() {
    }

    @Override // defpackage.ffm
    public final void v() {
    }

    @Override // defpackage.ffm
    public final void w() {
    }

    @Override // defpackage.ffm
    public final void x() {
    }

    @Override // defpackage.hhh
    public final void aC(int i) {
    }

    @Override // defpackage.few
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.ffm
    public final void o(List list) {
    }

    @Override // defpackage.ffm
    public final void y(jov jovVar) {
    }
}
