package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scq extends scb implements sce {
    public static final Handler a;
    public final dvk b;
    public sca c;
    public scf d;
    public long e;
    private View f;
    private boolean g;
    private final duv h;
    private final Runnable i;

    static {
        Handler handlerK = crh.k(Looper.getMainLooper());
        handlerK.getClass();
        a = handlerK;
    }

    public scq(dvk dvkVar, View view) {
        this.b = dvkVar;
        this.f = view;
        scp scpVar = new scp(this);
        this.h = scpVar;
        dvkVar.getLifecycle().c(scpVar);
        this.i = new rtr(this, 19, null);
    }

    private final boolean h() {
        return this.c != null;
    }

    private final boolean i() {
        return this.d != null;
    }

    @Override // defpackage.scb
    public final void b() {
        a.removeCallbacks(this.i);
        this.e = 0L;
        if (h() && d().w != null) {
            if (d().w != this) {
                throw new IllegalArgumentException("Binder cannot unbind. Bindable is already associated with a different Binder");
            }
            d().l();
            d().w = null;
        }
        if (i()) {
            e().H(this);
            if (this.g) {
                e().j(this.f);
            }
        }
        dvk dvkVar = this.b;
        dvkVar.getLifecycle().d(this.h);
        this.g = false;
    }

    @Override // defpackage.sce
    public final void c(int i) {
        synchronized (this) {
            this.e |= 1 << i;
        }
        g();
    }

    public final sca d() {
        sca scaVar = this.c;
        if (scaVar != null) {
            return scaVar;
        }
        yks.c("bindable");
        return null;
    }

    public final scf e() {
        scf scfVar = this.d;
        if (scfVar != null) {
            return scfVar;
        }
        yks.c("model");
        return null;
    }

    @Override // defpackage.scb
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized void a(scf scfVar) {
        scfVar.getClass();
        if (!h()) {
            View view = this.f;
            if (view instanceof ViewStub) {
                ViewStub viewStub = (ViewStub) view;
                int inflatedId = viewStub.getInflatedId();
                viewStub.setInflatedId(-1);
                viewStub.setLayoutResource(scfVar.a());
                View viewInflate = viewStub.inflate();
                viewInflate.getClass();
                this.f = viewInflate;
                if (inflatedId != -1) {
                    if (viewInflate.getId() != -1) {
                        scfVar.D(this.f).x(this.f.getId(), inflatedId);
                    }
                    this.f.setId(inflatedId);
                }
            }
            this.c = scfVar.D(this.f);
            if (d().w != null && d().w != this) {
                throw new IllegalArgumentException("Binder cannot bind. Bindable is already associated with a different Binder");
            }
            d().w = this;
        }
        if (!i()) {
            scfVar.E(this);
        } else if (e() != scfVar) {
            e().H(this);
            e().j(this.f);
            this.e = e().e(scfVar);
            scfVar.E(this);
        }
        this.d = scfVar;
        this.i.run();
        this.g = true;
        e().i(this.f);
    }

    public final void g() {
        a.post(this.i);
    }
}
