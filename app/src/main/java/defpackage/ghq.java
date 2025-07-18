package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import j$.time.Duration;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghq implements ghp {
    private static final Map a = agrj.d(new agpi(abnb.UNKNOWN, "Unknown"), new agpi(abnb.ZERO_STATE_SEARCH_TAB, "Search Tab"), new agpi(abnb.SEARCH_RESULT_PAGE, "Search Results Page"), new agpi(abnb.FOR_YOU_TAB, "For You Tab"), new agpi(abnb.MOVIE_TAB, "Movie Tab"), new agpi(abnb.SHOWS_TAB, "Shows Tab"), new agpi(abnb.APP_TAB, "Apps Tab"), new agpi(abnb.LIBRARY_TAB, "Library Tab"), new agpi(abnb.TVM_ENTITY_PAGE, "TVM Entity Page"), new agpi(abnb.PERSON_ENTITY_PAGE, "Person Entity Page"), new agpi(abnb.APP_SEARCH_CTA, "App Search CTA"), new agpi(abnb.MEDIA_SEARCH_RESULT_PAGE, "Media Search Results Page"), new agpi(abnb.NON_MEDIA_PERSON_PAGE, "Non-media Person Page"), new agpi(abnb.ANSWER_PAGE, "Answer Page"));
    private final Context b;
    private final zyh c;
    private final ghn d;

    public ghq(Context context, kak kakVar, zyh zyhVar) {
        context.getClass();
        kakVar.getClass();
        zyhVar.getClass();
        this.b = context;
        this.c = zyhVar;
        this.d = new ghn(zyhVar, new uqn(kakVar.a(context, "STREAMZ_OPA_TV", null), "STREAMZ_OPA_TV"), (Application) context);
    }

    @Override // defpackage.ghp
    public final void a(String str, boolean z) {
        ((uqo) this.d.d.eV()).a(1L, str, Boolean.valueOf(z));
    }

    @Override // defpackage.ghp
    public final void b() {
        ((uqo) this.d.l.eV()).a(1L, new Object[0]);
    }

    @Override // defpackage.ghp
    public final void c() {
        ((uqo) this.d.k.eV()).a(1L, new Object[0]);
    }

    @Override // defpackage.ghp
    public final void d() {
        ((uqo) this.d.h.eV()).a(1L, new Object[0]);
    }

    @Override // defpackage.ghp
    public final void e() {
        ((uqo) this.d.g.eV()).a(1L, new Object[0]);
    }

    @Override // defpackage.ghp
    public final void f(String str) {
        str.getClass();
        ((uqo) this.d.e.eV()).a(1L, str);
    }

    @Override // defpackage.ghp
    public final void g(String str) {
        str.getClass();
        String str2 = Build.MODEL;
        str2.getClass();
        this.d.a("Error", str, str2);
    }

    @Override // defpackage.ghp
    public final void h(String str) {
        str.getClass();
        String str2 = Build.MODEL;
        str2.getClass();
        this.d.a("Success", str, str2);
    }

    @Override // defpackage.ghp
    public final void i(String str, String str2) {
        str2.getClass();
        ((uqo) this.d.b.eV()).a(1L, str, str2);
    }

    @Override // defpackage.ghp
    public final void j(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.d.c(str, str2, "Error");
    }

    @Override // defpackage.ghp
    public final void k() {
        ((uqo) this.d.f.eV()).a(1L, new Object[0]);
    }

    @Override // defpackage.ghp
    public final void l(Duration duration, String str, String str2) {
        str.getClass();
        str2.getClass();
        ((uqq) this.d.c.eV()).b(duration.toMillis(), str, str2);
    }

    @Override // defpackage.ghp
    public final void m(boolean z) {
        ((uqo) this.d.i.eV()).a(1L, Boolean.valueOf(z));
    }

    @Override // defpackage.ghp
    public final void n(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.d.c(str, str2, "Success");
    }

    @Override // defpackage.ghp
    public final void o(abnb abnbVar) {
        this.d.b("Success", (String) Map.EL.getOrDefault(a, abnbVar, "Unknown"), "");
    }

    @Override // defpackage.ghp
    public final void p() {
        String str = Build.MODEL;
        str.getClass();
        ((uqo) this.d.j.eV()).a(1L, "VoiceInputActivityPeer", str);
    }

    @Override // defpackage.ghp
    public final void q() {
        this.d.d("Error");
    }

    @Override // defpackage.ghp
    public final void r() {
        this.d.d("Unknown");
    }

    @Override // defpackage.ghp
    public final void s(abnb abnbVar) {
        this.d.b("Error", (String) Map.EL.getOrDefault(a, abnbVar, "Unknown"), "suggestion_download_failed");
    }
}
