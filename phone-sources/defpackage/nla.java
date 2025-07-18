package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nla extends nwq implements nkn {
    private static final jzs H;
    private static final ocv I;
    public static final nsf a = new nsf("CastClient");
    private Handler G;
    public final nkz b;
    public boolean c;
    public boolean d;
    public final AtomicLong e;
    public final Object f;
    public final Object g;
    public njz h;
    public String i;
    public double j;
    public boolean k;
    public int l;
    public int m;
    public nkr n;
    public final CastDevice o;
    final Map p;
    public final Map q;
    public final List r;
    public int s;
    kwy t;
    kwy u;
    public final jys v;

    static {
        nky nkyVar = new nky();
        I = nkyVar;
        H = new jzs("Cast.API_CXLESS", (ocv) nkyVar, nse.b);
    }

    public nla(Context context, nki nkiVar) {
        super(context, H, nkiVar, nwp.a);
        this.b = new nkz(this);
        this.f = new Object();
        this.g = new Object();
        this.r = DesugarCollections.synchronizedList(new ArrayList());
        ocv.aG(context, "context cannot be null");
        this.v = nkiVar.e;
        this.o = nkiVar.a;
        this.p = new HashMap();
        this.q = new HashMap();
        this.e = new AtomicLong(0L);
        this.s = 1;
        k();
    }

    public static nwk d(int i) {
        return ocv.aL(new Status(i));
    }

    @Override // defpackage.nkn
    public final boolean a() {
        return this.s == 3;
    }

    @Override // defpackage.nkn
    public final void b() {
        oaf oafVar = new oaf();
        oafVar.a = new nku(0);
        oafVar.c = 8403;
        t(oafVar.a());
        f();
        l(this.b);
    }

    public final Handler c() {
        if (this.G == null) {
            this.G = new ogh(this.A);
        }
        return this.G;
    }

    public final void e() {
        ocv.aA(a(), "Not connected to device");
    }

    public final void f() {
        nsf.e();
        Map map = this.q;
        synchronized (map) {
            map.clear();
        }
    }

    public final void g(int i) {
        synchronized (this.f) {
            kwy kwyVar = this.t;
            if (kwyVar != null) {
                kwyVar.t(d(i));
            }
            this.t = null;
        }
    }

    public final void h(long j, int i) {
        kwy kwyVar;
        Map map = this.p;
        synchronized (map) {
            Long lValueOf = Long.valueOf(j);
            kwyVar = (kwy) map.get(lValueOf);
            map.remove(lValueOf);
        }
        if (kwyVar != null) {
            if (i == 0) {
                kwyVar.u(null);
            } else {
                kwyVar.t(d(i));
            }
        }
    }

    public final void i(int i) {
        synchronized (this.g) {
            kwy kwyVar = this.u;
            if (kwyVar == null) {
                return;
            }
            if (i == 0) {
                kwyVar.u(new Status(0));
            } else {
                kwyVar.t(d(i));
            }
            this.u = null;
        }
    }

    public final void j() {
        ocv.aA(this.s != 1, "Not active connection");
    }

    public final void k() {
        CastDevice castDevice = this.o;
        if (castDevice.g(RecyclerView.ItemAnimator.FLAG_MOVED) || !castDevice.g(4) || castDevice.g(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }

    public final void l(nsc nscVar) {
        nzr nzrVar = o(nscVar, "castDeviceControllerListenerKey").b;
        ocv.aG(nzrVar, "Key must not be null");
        s(nzrVar, 8415);
    }

    public final void m(kwy kwyVar) {
        synchronized (this.f) {
            if (this.t != null) {
                g(2477);
            }
            this.t = kwyVar;
        }
    }
}
