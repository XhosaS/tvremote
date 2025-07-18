package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljn extends icu implements Handler.Callback, iej {
    private static final tui k = tui.l("com/google/android/apps/play/movies/common/service/pinning/InternetConnectionChecker");
    public final Handler g;
    public final mem h;
    public final idb i;
    public volatile boolean j;
    private final Executor l;
    private final SharedPreferences m;
    private final Context n;
    private final xmg o;
    private final Runnable p;
    private boolean q;
    private volatile boolean r;
    private volatile boolean s;
    private volatile boolean t;
    private final boolean u;
    private ConnectivityManager v;
    private ljm w;

    public ljn(lfn lfnVar, Executor executor, mem memVar, SharedPreferences sharedPreferences, Context context, xmg xmgVar) {
        executor.getClass();
        this.l = executor;
        this.m = sharedPreferences;
        this.n = context;
        this.o = xmgVar;
        String strBi = lfnVar.bi();
        if (TextUtils.isEmpty(strBi)) {
            this.u = false;
            this.i = icz.b;
        } else {
            try {
                this.u = true;
                this.i = new ljo(new URL(strBi));
            } catch (MalformedURLException e) {
                throw new RuntimeException("Invalid generate http 204 URL", e);
            }
        }
        this.p = new ljl(this, 0);
        this.g = new Handler(Looper.getMainLooper(), this);
        this.h = memVar;
        memVar.ea(this);
        xqr xqrVarG = memVar.g();
        this.s = xqrVarG.j();
        this.j = this.s;
        this.r = this.s && xqrVarG.k();
        this.t = this.s && memVar.f();
        kdw.z(this.t, sharedPreferences);
    }

    private final void b() {
        if (this.u && !this.q) {
            if (!this.s) {
                c(false);
                return;
            }
            this.q = true;
            this.l.execute(this.p);
            this.g.removeMessages(2);
        }
    }

    private final void c(boolean z) {
        e(z, this.r, this.t);
    }

    private final void e(boolean z, boolean z2, boolean z3) {
        if (this.r != z2 || this.j != z || this.t != z3) {
            this.r = z2;
            this.j = z;
            this.t = z3;
            eb();
        }
        if (z || !this.s) {
            this.g.removeMessages(2);
        } else {
            Handler handler = this.g;
            handler.sendMessageDelayed(handler.obtainMessage(2), 60000L);
        }
    }

    public final void a() {
        this.g.sendEmptyMessage(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iej
    public final void dM() {
        mem memVar = this.h;
        xqr xqrVarG = memVar.g();
        boolean zJ = xqrVarG.j();
        byte b = zJ && xqrVarG.k();
        boolean z = zJ && memVar.f();
        if (zJ && b == false && !z && Build.VERSION.SDK_INT >= 30 && this.o.b() && kdw.A(this.m)) {
            ljm ljmVar = this.w;
            if (ljmVar == null) {
                this.v = (ConnectivityManager) this.n.getSystemService("connectivity");
                ljm ljmVar2 = new ljm(this, this);
                this.w = ljmVar2;
                this.v.registerDefaultNetworkCallback(ljmVar2);
            } else if (ljmVar.a) {
                this.v.unregisterNetworkCallback(ljmVar);
            }
        }
        int i = b == true ? 1 : z ? 2 : 0;
        ((tug) ((tug) k.e()).j("com/google/android/apps/play/movies/common/service/pinning/InternetConnectionChecker", "update", 265, "InternetConnectionChecker.java")).t("Network state update. connectionType= %s", i);
        this.g.obtainMessage(4, zJ ? 1 : 0, i).sendToTarget();
        kdw.z(z, this.m);
    }

    @Override // defpackage.icu
    protected final void ed() {
        ljm ljmVar = this.w;
        if (ljmVar != null) {
            this.v.unregisterNetworkCallback(ljmVar);
        }
        this.g.removeCallbacksAndMessages(null);
        this.h.ee(this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            c(true);
            return true;
        }
        if (i == 1) {
            if (this.j) {
                b();
            }
            return true;
        }
        if (i == 2) {
            b();
            return true;
        }
        if (i == 3) {
            boolean z = message.arg1 != 0;
            this.q = false;
            c(z);
            return true;
        }
        if (i != 4) {
            ((tug) ((tug) k.g()).j("com/google/android/apps/play/movies/common/service/pinning/InternetConnectionChecker", "handleMessage", 180, "InternetConnectionChecker.java")).t("Unexpected message: %s", message.what);
            return true;
        }
        boolean z2 = message.arg1 != 0;
        int i2 = message.arg2;
        this.s = z2;
        e(z2, i2 == 1, i2 == 2);
        return true;
    }
}
