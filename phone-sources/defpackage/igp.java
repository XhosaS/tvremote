package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.google.android.apps.googletv.app.services.workmanager.WorkerWrapper;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igp implements Runnable, yow {
    public final lcz a;
    public final jah b;
    public final kw c;
    private final /* synthetic */ yow d;
    private final iea e;
    private final xhj f;
    private final xjq g;
    private final ihi h;
    private final xjw i;
    private final xjk j;
    private final pio k;
    private final izo l;
    private final Context m;
    private final ldv n;
    private final AtomicBoolean o = new AtomicBoolean(false);
    private final ioi p;
    private final kmy q;
    private final mdw r;
    private final irc s;
    private final irc t;
    private final isy u;

    public igp(iea ieaVar, xhj xhjVar, xjq xjqVar, ihi ihiVar, xjw xjwVar, xjk xjkVar, pio pioVar, ioi ioiVar, kmy kmyVar, jah jahVar, izo izoVar, irc ircVar, irc ircVar2, isy isyVar, lcz lczVar, mdw mdwVar, Context context, kw kwVar, ldv ldvVar, yow yowVar) {
        this.d = yowVar;
        this.e = ieaVar;
        this.f = xhjVar;
        this.g = xjqVar;
        this.h = ihiVar;
        this.i = xjwVar;
        this.j = xjkVar;
        this.k = pioVar;
        this.p = ioiVar;
        this.q = kmyVar;
        this.b = jahVar;
        this.l = izoVar;
        this.s = ircVar;
        this.t = ircVar2;
        this.u = isyVar;
        this.a = lczVar;
        this.r = mdwVar;
        this.m = context;
        this.c = kwVar;
        this.n = ldvVar;
    }

    @Override // defpackage.yow
    public final yil c() {
        return ((ywq) this.d).a;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, xjk] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, lfn] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        onz onzVarR;
        int i2 = 1;
        if (this.o.compareAndSet(false, true)) {
            if (this.g.a()) {
                this.k.a();
            }
            kmy kmyVar = this.q;
            if (kmyVar.j) {
                ykr.q(this, null, 0, new gow(this, (yih) null, 8), 3);
                if (!kmyVar.f) {
                    try {
                        Context context = kmyVar.a;
                        Executor executor = kmyVar.d;
                        Object obj = nmg.a;
                        ocv.aC();
                        if (nmg.b == null) {
                            Context applicationContext = context.getApplicationContext();
                            nnj nnjVarG = nmg.g(applicationContext);
                            nmj castOptions = nnjVarG.getCastOptions(applicationContext);
                            nrn nrnVar = new nrn(applicationContext);
                            onzVarR = osk.p(executor, new upd(applicationContext, castOptions, nnjVarG, new noo(applicationContext, fuy.b(applicationContext), castOptions, nrnVar), nrnVar, 1));
                        } else {
                            onzVarR = osk.r(nmg.b);
                        }
                        onzVarR.k(kmyVar.i);
                    } catch (Exception e) {
                        krd.d("Failed to initialize CastContext", e);
                    }
                }
            }
            if (((Boolean) xjx.a.et(((xjx) this.i).d)).booleanValue()) {
                irc ircVar = this.s;
                gpv gpvVar = new gpv(WorkerWrapper.class, ((Long) xjx.b.et(((xjx) ircVar.b).d)).longValue(), TimeUnit.MILLISECONDS);
                gpvVar.b("google_tv_image_cleanup_tag");
                yfw[] yfwVarArr = {new yfw("google_tv_worker_name_key", "google_tv_image_cleanup_worker_key")};
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i3 = 0; i3 <= 0; i3++) {
                    yfw yfwVar = yfwVarArr[i3];
                    gli.z((String) yfwVar.a, yfwVar.b, linkedHashMap);
                }
                gpvVar.e(gli.y(linkedHashMap));
                fki.aV((Context) ircVar.a).f("google_tv_image_cleanup_tag", 1, gpvVar.f());
            }
            xhj xhjVar = this.f;
            if (xhjVar.c()) {
                ((ldy) this.e).a().o(new jbj(new gxb(this, 6), i2));
            }
            if (xhjVar.a()) {
                irc ircVar2 = this.t;
                gpv gpvVar2 = new gpv(WorkerWrapper.class, ircVar2.b.aw(), TimeUnit.MILLISECONDS);
                gpvVar2.b("google_tv_cache_cleanup_tag");
                yfw[] yfwVarArr2 = {new yfw("google_tv_worker_name_key", "google_tv_cache_cleanup_worker_key")};
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (int i4 = 0; i4 <= 0; i4++) {
                    yfw yfwVar2 = yfwVarArr2[i4];
                    gli.z((String) yfwVar2.a, yfwVar2.b, linkedHashMap2);
                }
                gpvVar2.e(gli.y(linkedHashMap2));
                ((gpz) ircVar2.a).f("google_tv_cache_cleanup_tag", 1, gpvVar2.f());
            }
            if (xhjVar.b()) {
                this.p.a(3);
            }
            ihi ihiVar = this.h;
            if (ihiVar.e()) {
                this.l.a(false);
            }
            if (ihiVar.a()) {
                this.l.d();
            }
            mdw mdwVar = this.r;
            Context context2 = this.m;
            ComponentName componentName = new ComponentName(context2, "com.google.android.apps.googletv.app.presentation.widgets.toppicks.TopPicksWidgetReceiver");
            if (!mdwVar.e.a() || Build.VERSION.SDK_INT < 26) {
                krd.b("Widget has been disabled");
                i = 2;
            } else {
                krd.b("Widget has been enabled");
                i = 1;
            }
            context2.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
            if (this.j.a()) {
                isy isyVar = this.u;
                isyVar.n(true, false);
                isy.p(isyVar);
            } else {
                this.u.m();
            }
            this.c.s();
            this.n.v(new klo(this, 1));
        }
    }
}
