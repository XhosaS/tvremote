package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrs extends obe {
    private final long P;
    private final Bundle Q;
    private nrr R;
    private boolean S;
    private Bundle T;
    private nxs U;
    public njz c;
    public final CastDevice d;
    public final Map e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public double j;
    public nkr k;
    public int l;
    public int m;
    public final AtomicLong n;
    public String o;
    public String p;
    public final Map q;
    public nxs r;
    public final jys s;
    public static final nsf a = new nsf("CastClientImpl");
    public static final Object b = new Object();
    private static final Object O = new Object();

    public nrs(Context context, Looper looper, oav oavVar, CastDevice castDevice, long j, jys jysVar, Bundle bundle, nws nwsVar, nwt nwtVar) {
        super(context, looper, 10, oavVar, nwsVar, nwtVar);
        this.d = castDevice;
        this.s = jysVar;
        this.P = j;
        this.Q = bundle;
        this.e = new HashMap();
        this.n = new AtomicLong(0L);
        this.q = new HashMap();
        m();
        x();
    }

    private final void Y() {
        nsf.e();
        Map map = this.e;
        synchronized (map) {
            map.clear();
        }
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 12800000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        return sew.g(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.oat
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        nsf.e();
        this.d.f(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.P);
        Bundle bundle2 = this.Q;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.R = new nrr(this);
        bundle.putParcelable("listener", new BinderWrapper(this.R));
        String str = this.o;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.p;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // defpackage.oat
    public final Bundle l() {
        Bundle bundle = this.T;
        if (bundle == null) {
            return null;
        }
        this.T = null;
        return bundle;
    }

    public final void m() {
        this.S = false;
        this.l = -1;
        this.m = -1;
        this.c = null;
        this.f = null;
        this.j = 0.0d;
        x();
        this.g = false;
        this.k = null;
    }

    @Override // defpackage.oat, defpackage.nwj
    public final void n() {
        D();
        nsf.e();
        nrr nrrVar = this.R;
        this.R = null;
        if (nrrVar == null || nrrVar.q() == null) {
            nsf.e();
            return;
        }
        Y();
        try {
            try {
                ((nsa) L()).a(ocv.q());
            } catch (RemoteException | IllegalStateException unused) {
                nsf.e();
            }
        } finally {
            super.n();
        }
    }

    @Override // defpackage.oat
    public final void o(nve nveVar) {
        super.o(nveVar);
        Y();
    }

    @Override // defpackage.oat
    protected final void p(int i, IBinder iBinder, Bundle bundle, int i2) {
        nsf.e();
        if (i == 0 || i == 2300) {
            this.S = true;
            this.h = true;
            this.i = true;
        } else {
            this.S = false;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.T = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.p(i, iBinder, bundle, i2);
    }

    public final void q(String str) {
        nkl nklVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        Map map = this.e;
        synchronized (map) {
            nklVar = (nkl) map.remove(str);
        }
        if (nklVar != null) {
            try {
                ((nsa) L()).g(str, ocv.q());
            } catch (IllegalStateException unused) {
                nsf.e();
            }
        }
    }

    public final void r(int i) {
        synchronized (b) {
            nxs nxsVar = this.r;
            if (nxsVar != null) {
                nxsVar.c(new nrq(new Status(i)));
                this.r = null;
            }
        }
    }

    public final void s(long j, int i) {
        nxs nxsVar;
        Map map = this.q;
        synchronized (map) {
            nxsVar = (nxs) map.remove(Long.valueOf(j));
        }
        if (nxsVar != null) {
            nxsVar.c(new Status(i));
        }
    }

    public final void t(int i) {
        synchronized (O) {
            nxs nxsVar = this.U;
            if (nxsVar != null) {
                nxsVar.c(new Status(i));
                this.U = null;
            }
        }
    }

    public final void u(nxs nxsVar) {
        synchronized (b) {
            nxs nxsVar2 = this.r;
            if (nxsVar2 != null) {
                nxsVar2.c(new nrq(new Status(2477)));
            }
            this.r = nxsVar;
        }
    }

    public final void v(nxs nxsVar) {
        synchronized (O) {
            if (this.U != null) {
                nxsVar.c(new Status(2001));
            } else {
                this.U = nxsVar;
            }
        }
    }

    public final boolean w() {
        nrr nrrVar;
        return (!this.S || (nrrVar = this.R) == null || nrrVar.a.get() == null) ? false : true;
    }

    final void x() {
        CastDevice castDevice = this.d;
        ocv.aG(castDevice, "device should not be null");
        if (castDevice.g(RecyclerView.ItemAnimator.FLAG_MOVED) || !castDevice.g(4) || castDevice.g(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }
}
