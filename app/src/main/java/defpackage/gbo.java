package defpackage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.apps.tvsearch.launcher.searchtab.LauncherUpdateActivity;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbo {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/launcher/searchtab/LauncherUpdateActivityPeer");
    public final LauncherUpdateActivity b;
    public final ahbt c;
    public final agow d;
    public final agow e;
    public final fyq f;
    public final InputMethodManager g;
    public final exl h;
    public final ffp i;
    public final agow j;
    public final gtu k;
    public final agow l;
    public final gfr m;
    public final agow n;
    public final gmd o;
    public final LayoutInflater p;
    public final ghr q;
    public hye r;
    public hyi s;
    public final ahni t;
    public ViewGroup u;

    public gbo(LauncherUpdateActivity launcherUpdateActivity, ahbt ahbtVar, agow agowVar, agow agowVar2, fyq fyqVar, InputMethodManager inputMethodManager, exl exlVar, ffp ffpVar, agow agowVar3, gtu gtuVar, agow agowVar4, gfr gfrVar, agow agowVar5, gmd gmdVar, LayoutInflater layoutInflater, ghr ghrVar) {
        ahbtVar.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        ffpVar.getClass();
        agowVar3.getClass();
        gtuVar.getClass();
        gfrVar.getClass();
        agowVar5.getClass();
        gmdVar.getClass();
        ghrVar.getClass();
        this.b = launcherUpdateActivity;
        this.c = ahbtVar;
        this.d = agowVar;
        this.e = agowVar2;
        this.f = fyqVar;
        this.g = inputMethodManager;
        this.h = exlVar;
        this.i = ffpVar;
        this.j = agowVar3;
        this.k = gtuVar;
        this.l = agowVar4;
        this.m = gfrVar;
        this.n = agowVar5;
        this.o = gmdVar;
        this.p = layoutInflater;
        this.q = ghrVar;
        this.t = new ahnm(false);
    }

    public final void a(String str) {
        ViewGroup viewGroup = this.u;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            agvy.b("launcherUpdateRoot");
            viewGroup = null;
        }
        viewGroup.requireViewById(R.id.on_search_loading).setVisibility(0);
        ViewGroup viewGroup3 = this.u;
        if (viewGroup3 == null) {
            agvy.b("launcherUpdateRoot");
        } else {
            viewGroup2 = viewGroup3;
        }
        ((TextView) viewGroup2.requireViewById(R.id.on_search_loading_message)).setText(this.b.getResources().getString(R.string.on_device_loading, str));
    }

    public final void b(Intent intent) {
        hye hyeVar = null;
        String stringExtra = intent != null ? intent.getStringExtra("query") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() > 0) {
            this.i.o(stringExtra, jlv.INVOCATION_TYPE_TEXT_SEARCH);
            a(stringExtra);
        }
        hye hyeVar2 = this.r;
        if (hyeVar2 == null) {
            agvy.b("keyboardSearchBar");
        } else {
            hyeVar = hyeVar2;
        }
        hyeVar.f.setText(stringExtra);
    }
}
