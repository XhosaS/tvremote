package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwm {
    public Context a;
    public qwo b;
    public qth c;
    public rfg d;
    public rih e;
    public ril f;
    public rfe g;
    public pnl h;
    public rjg i;
    public tst j;
    private ScheduledExecutorService k;
    private qwi l;
    private tst m;
    private qtr n;
    private ExecutorService o;
    private tst p;
    private rzy q;

    public qwm() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, rih] */
    public final qwn a() {
        qwo qwoVar;
        qth qthVar;
        qwi qwiVar;
        ril rilVar;
        rfe rfeVar;
        qtr qtrVar;
        ExecutorService executorService;
        pnl pnlVar;
        rjg rjgVar;
        ThreadFactory threadFactoryAo = rrx.ao();
        if (!g().g()) {
            ExecutorService executorServiceNewCachedThreadPool = this.k;
            if (executorServiceNewCachedThreadPool == null) {
                executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(threadFactoryAo);
            }
            h(executorServiceNewCachedThreadPool);
        }
        if (this.k == null) {
            this.k = Executors.newSingleThreadScheduledExecutor(threadFactoryAo);
        }
        if (!f().g()) {
            throw new IllegalStateException("Exactly one of setAvatarRetriever and setCustomAvatarImageLoader have to be called.");
        }
        this.n = new qty(b(), g().c(), c(), f().c());
        qwi qwiVar2 = this.l;
        final int i = 1;
        if (!(qwiVar2 == null ? trk.a : tst.i(qwiVar2)).g()) {
            qth qthVarC = c();
            e();
            final qwj qwjVar = new qwj(qthVarC, trk.a, this.j);
            final int i2 = 0;
            this.l = new qwi(new qwh() { // from class: qwl
                @Override // defpackage.qwh, defpackage.qtg
                public final void a(View view, Object obj) {
                    if (obj == null) {
                        return;
                    }
                    qwj qwjVar2 = qwjVar;
                    qth qthVar2 = qwjVar2.a;
                    qthVar2.j(obj);
                    String strD = qthVar2.d(obj);
                    vtw vtwVarM = uzl.a.m();
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    uzl uzlVar = (uzl) vtwVarM.b;
                    uzlVar.b |= 1;
                    uzlVar.c = 1;
                    qvg.b(view, strD, (uzl) vtwVarM.r(), qwjVar2.c);
                }
            }, new qwh() { // from class: qwk
                @Override // defpackage.qwh, defpackage.qtg
                public final void a(View view, Object obj) {
                    if (i2 == 0) {
                        AddAccountActivity.startActivity(view);
                        return;
                    }
                    Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                    intent.addFlags(32768);
                    intent.addFlags(524288);
                    view.getContext().startActivity(intent);
                }
            }, new qwh() { // from class: qwk
                @Override // defpackage.qwh, defpackage.qtg
                public final void a(View view, Object obj) {
                    if (i == 0) {
                        AddAccountActivity.startActivity(view);
                        return;
                    }
                    Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                    intent.addFlags(32768);
                    intent.addFlags(524288);
                    view.getContext().startActivity(intent);
                }
            });
        }
        d();
        e();
        e();
        pnl pnlVar2 = this.h;
        if (pnlVar2 == null) {
            throw new IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        if (!(pnlVar2 instanceof pnk)) {
            this.i = new rjh(c(), d(), pnlVar2, this.j, (ttm) this.p.d(new eik(5)));
        }
        if (this.q == null) {
            this.q = new rzy(b(), this.k);
        }
        rff rffVar = new rff(e());
        if (!e().g.g()) {
            i();
            Context contextB = b();
            qth qthVarC2 = c();
            e();
            rffVar.c = tst.i(new quy(contextB, qthVarC2, trk.a, this.j));
        }
        if (!e().h.g()) {
            i();
            if (xnl.a.get().d(b())) {
                rffVar.d = tst.i(new rfh(c(), b(), this.q, this.j));
            }
        }
        if (!e().d.g()) {
            rffVar.a = tst.i(new cb(this.j));
        }
        if (xnl.a.get().c(b())) {
            rffVar.c(true);
        }
        rfg rfgVarA = rffVar.a();
        this.d = rfgVarA;
        Context context = this.a;
        if (context != null && (qwoVar = this.b) != null && (qthVar = this.c) != null && (qwiVar = this.l) != null && rfgVarA != null && (rilVar = this.f) != null && (rfeVar = this.g) != null && (qtrVar = this.n) != null && (executorService = this.o) != null && (pnlVar = this.h) != null && (rjgVar = this.i) != null) {
            return new qwn(context, qwoVar, qthVar, qwiVar, rfgVarA, this.e, rilVar, rfeVar, this.m, qtrVar, executorService, pnlVar, rjgVar, this.q, this.j, this.p);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" applicationContext");
        }
        if (this.b == null) {
            sb.append(" accountsModel");
        }
        if (this.c == null) {
            sb.append(" accountConverter");
        }
        if (this.l == null) {
            sb.append(" clickListeners");
        }
        if (this.d == null) {
            sb.append(" features");
        }
        if (this.f == null) {
            sb.append(" oneGoogleEventLogger");
        }
        if (this.g == null) {
            sb.append(" configuration");
        }
        if (this.n == null) {
            sb.append(" avatarImageLoader");
        }
        if (this.o == null) {
            sb.append(" backgroundExecutor");
        }
        if (this.h == null) {
            sb.append(" vePrimitives");
        }
        if (this.i == null) {
            sb.append(" visualElements");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final Context b() {
        Context context = this.a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Property \"applicationContext\" has not been set");
    }

    public final qth c() {
        qth qthVar = this.c;
        if (qthVar != null) {
            return qthVar;
        }
        throw new IllegalStateException("Property \"accountConverter\" has not been set");
    }

    public final qwo d() {
        qwo qwoVar = this.b;
        if (qwoVar != null) {
            return qwoVar;
        }
        throw new IllegalStateException("Property \"accountsModel\" has not been set");
    }

    public final rfg e() {
        rfg rfgVar = this.d;
        if (rfgVar != null) {
            return rfgVar;
        }
        throw new IllegalStateException("Property \"features\" has not been set");
    }

    public final tst f() {
        rih rihVar = this.e;
        return rihVar == null ? trk.a : tst.i(rihVar);
    }

    public final tst g() {
        ExecutorService executorService = this.o;
        return executorService == null ? trk.a : tst.i(executorService);
    }

    public final void h(ExecutorService executorService) {
        if (executorService == null) {
            throw new NullPointerException("Null backgroundExecutor");
        }
        this.o = executorService;
    }

    public final void i() {
        if (this.g == null) {
            throw new IllegalStateException("Property \"configuration\" has not been set");
        }
    }

    public qwm(qwn qwnVar) {
        trk trkVar = trk.a;
        this.m = trkVar;
        this.j = trkVar;
        this.p = trkVar;
        this.a = qwnVar.a;
        this.b = qwnVar.b;
        this.c = qwnVar.c;
        this.l = qwnVar.d;
        this.d = qwnVar.e;
        this.e = qwnVar.f;
        this.f = qwnVar.g;
        this.g = qwnVar.h;
        this.m = qwnVar.i;
        this.n = qwnVar.j;
        this.o = qwnVar.k;
        this.h = qwnVar.l;
        this.i = qwnVar.m;
        this.q = qwnVar.p;
        this.j = qwnVar.n;
        this.p = qwnVar.o;
    }

    public qwm(byte[] bArr) {
        trk trkVar = trk.a;
        this.m = trkVar;
        this.j = trkVar;
        this.p = trkVar;
    }
}
