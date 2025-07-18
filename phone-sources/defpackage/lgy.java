package defpackage;

import android.media.MediaCryptoException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgy implements Handler.Callback, eox, epi {
    public final boolean a;
    public final idy b;
    public final idy c;
    public final mem d;
    public int e;
    public boolean f;
    public final lhe g;
    public final lmi h;
    private final dyz i;
    private final ecr j;
    private final Handler k;
    private final Handler l;
    private final boolean m;
    private final boolean n;
    private final idy o;
    private final idy p;
    private final idy q;
    private CryptoConfig r;
    private Throwable s;
    private int t;
    private final pku u;

    public lgy(lhe lheVar, dyz dyzVar, boolean z, boolean z2, byte[] bArr, Looper looper, Handler handler, lmi lmiVar, mem memVar, pku pkuVar) {
        this.g = lheVar;
        this.i = dyzVar;
        this.k = handler;
        this.h = lmiVar;
        this.m = z;
        this.a = z2;
        int i = 1;
        this.n = bArr == null;
        this.d = memVar;
        this.u = pkuVar;
        this.e = 2;
        this.j = new ecr();
        Handler handler2 = new Handler(looper, this);
        this.l = handler2;
        ia iaVar = new ia(handler2, 4);
        byte[] bArr2 = null;
        this.b = new krn(iaVar, new lgx(this, 4), i, bArr2);
        this.p = new krn(iaVar, new lgx(this, 3), i, bArr2);
        this.c = new krn(iaVar, new lgx(this, 2), i, bArr2);
        this.q = new krn(iaVar, new lgx(this, 0), i, bArr2);
        this.o = new krn(iaVar, new lgx(this, 1), i, bArr2);
    }

    public static final boolean h(Throwable th) {
        if (!(th instanceof lzk)) {
            return false;
        }
        int i = ((lzk) th).a;
        return (i < 5100 || i >= 5200) && i != 7000;
    }

    @Override // defpackage.eox
    public final int a() {
        return this.e;
    }

    @Override // defpackage.eox
    public final CryptoConfig b() {
        return this.r;
    }

    @Override // defpackage.eox
    public final eow c() {
        if (this.e != 1) {
            return null;
        }
        Throwable th = this.s;
        return th instanceof eow ? (eow) th : new eow(th, 6000);
    }

    @Override // defpackage.eox
    public final UUID d() {
        return dys.d;
    }

    public final void e(String str) {
        if (this.n) {
            this.g.i(str, this.b);
        } else {
            this.g.l(str, this.p);
        }
    }

    @Override // defpackage.epi
    public final void ef(ExoMediaDrm exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.l.sendEmptyMessage(i);
    }

    public final void f(Throwable th, boolean z) {
        this.s = th;
        this.k.post(new gvj(this, th, 20));
        if (th instanceof Exception) {
            Iterator it = this.j.b().iterator();
            while (it.hasNext()) {
                ((eph) it.next()).x((Exception) th);
            }
        }
        if (z) {
            this.e = 1;
        }
    }

    public final void g() {
        try {
            lhe lheVar = this.g;
            this.r = lheVar.a.createCryptoConfig(lheVar.p());
            this.e = 3;
            e("LoadLicenceAfterOpening");
        } catch (MediaCryptoException e) {
            f(e, true);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.e;
        if (i == 3 || i == 4) {
            int i2 = message.what;
            if (i2 == 2) {
                if (this.n) {
                    this.g.i("EventKeyRequired", this.b);
                } else {
                    krd.f("Ignoring EVENT_KEY_REQUIRED for offline playback");
                }
            } else if (i2 == 3) {
                if (this.n) {
                    this.e = 3;
                    this.g.i("EventKeyExpired", this.b);
                } else {
                    krd.f("Ignoring EVENT_KEY_EXPIRED for offline playback");
                }
            } else if (i2 == 1) {
                this.e = 3;
                this.g.r(this.q);
            }
        }
        return true;
    }

    @Override // defpackage.eox
    public final boolean l() {
        return this.m;
    }

    @Override // defpackage.eox
    public final boolean m(String str) {
        return this.g.n(str);
    }

    @Override // defpackage.eox
    public final byte[] n() {
        return this.g.e;
    }

    @Override // defpackage.eox
    public final void o(eph ephVar) {
        if (ephVar != null) {
            this.j.c(ephVar);
        }
        int i = this.t + 1;
        this.t = i;
        if (i == 1) {
            dyz dyzVar = this.i;
            if (dyzVar == null) {
                f(new lgt(), true);
                return;
            }
            lhe lheVar = this.g;
            idy idyVar = this.o;
            lheVar.d(dyzVar.c, dyzVar.d, "OpenSession", idyVar);
        }
    }

    @Override // defpackage.eox
    public final void p(eph ephVar) {
        int i = this.t - 1;
        this.t = i;
        if (i != 0) {
            return;
        }
        this.e = 0;
        this.r = null;
        this.f = false;
        this.g.c();
        this.l.removeCallbacksAndMessages(null);
        ((lha) this.u.a).i = null;
        if (ephVar != null) {
            this.j.d(ephVar);
        }
    }
}
