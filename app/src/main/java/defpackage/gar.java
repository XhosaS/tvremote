package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.apps.tvsearch.launcher.assistant.redirect.AmbientRedirectActivity;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gar {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/launcher/assistant/redirect/AmbientRedirectActivityPeer");
    public final AmbientRedirectActivity b;
    public final Context c;
    public final agte d;
    public final ahbt e;
    public final agow f;
    public final kdv g;
    public final agow h;
    public final ffk i;
    public final agow j;
    public final fmg k;
    public final ztw l;
    public LogoView m;
    public BroadcastReceiver n;
    public final ewm o;
    public final exz p;
    public final ewo q;

    public gar(AmbientRedirectActivity ambientRedirectActivity, Context context, agte agteVar, ahbt ahbtVar, agow agowVar, kdv kdvVar, ewo ewoVar, agow agowVar2, exz exzVar, ffk ffkVar, agow agowVar3, fmg fmgVar, ztw ztwVar) {
        context.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        exzVar.getClass();
        ffkVar.getClass();
        agowVar3.getClass();
        ztwVar.getClass();
        this.b = ambientRedirectActivity;
        this.c = context;
        this.d = agteVar;
        this.e = ahbtVar;
        this.f = agowVar;
        this.g = kdvVar;
        this.q = ewoVar;
        this.h = agowVar2;
        this.p = exzVar;
        this.i = ffkVar;
        this.j = agowVar3;
        this.k = fmgVar;
        this.l = ztwVar;
        this.o = new ewm() { // from class: gam
            @Override // defpackage.ewm
            public final void a() {
                this.a.a();
            }
        };
    }

    public final void a() {
        this.i.n();
        this.b.finish();
    }
}
