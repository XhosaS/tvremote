package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoo implements eox {
    public final List a;
    public final ExoMediaDrm b;
    public final int c;
    public final epu d;
    public final UUID e;
    public final eom f;
    public int g;
    public byte[] h;
    public epm i;
    public final ghc j;
    public final sew k;
    private final boolean l;
    private final boolean m;
    private final HashMap n;
    private final ecr o;
    private final elk p;
    private final Looper q;
    private int r;
    private HandlerThread s;
    private eok t;
    private CryptoConfig u;
    private eow v;
    private byte[] w;
    private eph x;
    private final pku y;

    public eoo(UUID uuid, ExoMediaDrm exoMediaDrm, ghc ghcVar, pku pkuVar, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap map, epu epuVar, Looper looper, sew sewVar, elk elkVar) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.e = uuid;
        this.j = ghcVar;
        this.y = pkuVar;
        this.b = exoMediaDrm;
        this.c = i;
        this.l = z;
        this.m = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.n = map;
        this.d = epuVar;
        this.o = new ecr();
        this.k = sewVar;
        this.p = elkVar;
        this.g = 2;
        this.q = looper;
        this.f = new eom(this, looper);
    }

    private final void q(ecq ecqVar) {
        Iterator it = this.o.b().iterator();
        while (it.hasNext()) {
            ecqVar.a((eph) it.next());
        }
    }

    private final void r(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || cme.z(th)) {
            this.j.i(this);
        } else {
            f(th, true != z ? 2 : 1);
        }
    }

    private final void s(byte[] bArr, int i, boolean z) {
        try {
            this.x = this.b.getKeyRequest(bArr, this.a, i, this.n);
            eok eokVar = this.t;
            String str = edt.a;
            eph ephVar = this.x;
            ephVar.getClass();
            eokVar.a(2, ephVar, z);
        } catch (Exception | NoSuchMethodError e) {
            r(e, true);
        }
    }

    private final boolean t() {
        try {
            this.b.restoreKeys(this.h, this.w);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            f(e, 1);
            return false;
        }
    }

    @Override // defpackage.eox
    public final int a() {
        i();
        return this.g;
    }

    @Override // defpackage.eox
    public final CryptoConfig b() {
        i();
        return this.u;
    }

    @Override // defpackage.eox
    public final eow c() {
        i();
        if (this.g == 1) {
            return this.v;
        }
        return null;
    }

    @Override // defpackage.eox
    public final UUID d() {
        i();
        return this.e;
    }

    public final void e(boolean z) {
        long jMin;
        if (this.m) {
            return;
        }
        byte[] bArr = this.h;
        String str = edt.a;
        int i = this.c;
        int i2 = 3;
        if (i != 0 && i != 1) {
            if (i != 2) {
                this.w.getClass();
                this.h.getClass();
                s(this.w, 3, z);
                return;
            } else {
                if (this.w == null || t()) {
                    s(bArr, 2, z);
                    return;
                }
                return;
            }
        }
        if (this.w == null) {
            s(bArr, 1, z);
            return;
        }
        if (this.g == 4 || t()) {
            if (dys.d.equals(this.e)) {
                i();
                byte[] bArr2 = this.h;
                Map<String, String> mapQueryKeyStatus = bArr2 == null ? null : this.b.queryKeyStatus(bArr2);
                Pair pair = mapQueryKeyStatus != null ? new Pair(Long.valueOf(cme.y(mapQueryKeyStatus, "LicenseDurationRemaining")), Long.valueOf(cme.y(mapQueryKeyStatus, "PlaybackDurationRemaining"))) : null;
                pair.getClass();
                jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                jMin = Long.MAX_VALUE;
            }
            if (i == 0 && jMin <= 60) {
                edb.g(a.cs(jMin, "Offline license has expired or will expire soon. Remaining seconds: "));
                s(bArr, 2, z);
            } else if (jMin <= 0) {
                f(new ept(), 2);
            } else {
                this.g = 4;
                q(new eoj(i2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Throwable r6, int r7) {
        /*
            r5 = this;
            eow r0 = new eow
            boolean r1 = r6 instanceof android.media.MediaDrm.MediaDrmStateException
            r2 = 1
            if (r1 == 0) goto L17
            r7 = r6
            android.media.MediaDrm$MediaDrmStateException r7 = (android.media.MediaDrm.MediaDrmStateException) r7
            java.lang.String r7 = r7.getDiagnosticInfo()
            int r7 = defpackage.edt.m(r7)
            int r7 = defpackage.edt.l(r7)
            goto L52
        L17:
            boolean r1 = r6 instanceof android.media.MediaDrmResetException
            r3 = 6006(0x1776, float:8.416E-42)
            if (r1 == 0) goto L1f
        L1d:
            r7 = r3
            goto L52
        L1f:
            boolean r1 = r6 instanceof android.media.NotProvisionedException
            r4 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L51
            boolean r1 = defpackage.cme.z(r6)
            if (r1 == 0) goto L2c
            goto L51
        L2c:
            boolean r1 = r6 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L33
            r7 = 6007(0x1777, float:8.418E-42)
            goto L52
        L33:
            boolean r1 = r6 instanceof defpackage.eqc
            if (r1 == 0) goto L3a
            r7 = 6001(0x1771, float:8.409E-42)
            goto L52
        L3a:
            boolean r1 = r6 instanceof defpackage.eos
            if (r1 == 0) goto L41
            r7 = 6003(0x1773, float:8.412E-42)
            goto L52
        L41:
            boolean r1 = r6 instanceof defpackage.ept
            if (r1 == 0) goto L48
            r7 = 6008(0x1778, float:8.419E-42)
            goto L52
        L48:
            if (r7 != r2) goto L4b
            goto L1d
        L4b:
            r1 = 2
            if (r7 != r1) goto L51
            r7 = 6004(0x1774, float:8.413E-42)
            goto L52
        L51:
            r7 = r4
        L52:
            r0.<init>(r6, r7)
            r5.v = r0
            java.lang.String r7 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            defpackage.edb.d(r7, r0, r6)
            boolean r7 = r6 instanceof java.lang.Exception
            if (r7 == 0) goto L6b
            fja r7 = new fja
            r7.<init>(r6, r2)
            r5.q(r7)
            goto L7f
        L6b:
            boolean r7 = r6 instanceof java.lang.Error
            if (r7 == 0) goto L87
            boolean r7 = defpackage.cme.A(r6)
            if (r7 != 0) goto L7f
            boolean r7 = defpackage.cme.z(r6)
            if (r7 == 0) goto L7c
            goto L7f
        L7c:
            java.lang.Error r6 = (java.lang.Error) r6
            throw r6
        L7f:
            int r6 = r5.g
            r7 = 4
            if (r6 == r7) goto L86
            r5.g = r2
        L86:
            return
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected Throwable subclass"
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eoo.f(java.lang.Throwable, int):void");
    }

    public final void g(Object obj, Object obj2) {
        if (obj == this.x && j()) {
            this.x = null;
            int i = 0;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                r((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                int i2 = this.c;
                if (i2 == 3) {
                    ExoMediaDrm exoMediaDrm = this.b;
                    byte[] bArr2 = this.w;
                    String str = edt.a;
                    exoMediaDrm.provideKeyResponse(bArr2, bArr);
                    q(new eoj(i));
                    return;
                }
                byte[] bArrProvideKeyResponse = this.b.provideKeyResponse(this.h, bArr);
                int i3 = 2;
                if ((i2 == 2 || (i2 == 0 && this.w != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.w = bArrProvideKeyResponse;
                }
                this.g = 4;
                q(new eoj(i3));
            } catch (Exception | NoSuchMethodError e) {
                r(e, true);
            }
        }
    }

    public final void h() {
        this.i = this.b.getProvisionRequest();
        eok eokVar = this.t;
        String str = edt.a;
        epm epmVar = this.i;
        epmVar.getClass();
        eokVar.a(1, epmVar, true);
    }

    public final void i() {
        Looper looper = this.q;
        if (Thread.currentThread() != looper.getThread()) {
            edb.f("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    public final boolean j() {
        int i = this.g;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k() {
        /*
            r4 = this;
            boolean r0 = r4.j()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            androidx.media3.exoplayer.drm.ExoMediaDrm r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            byte[] r2 = r0.openSession()     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r4.h = r2     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            elk r3 = r4.p     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r0.setPlayerIdForSession(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            byte[] r2 = r4.h     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            androidx.media3.decoder.CryptoConfig r0 = r0.createCryptoConfig(r2)     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r4.u = r0     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r0 = 3
            r4.g = r0     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            eoj r0 = new eoj     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r0.<init>(r1)     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r4.q(r0)     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            byte[] r0 = r4.h     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            defpackage.a.aq(r0)     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            return r1
        L2e:
            r0 = move-exception
            goto L31
        L30:
            r0 = move-exception
        L31:
            boolean r2 = defpackage.cme.z(r0)
            if (r2 == 0) goto L3d
            ghc r0 = r4.j
            r0.i(r4)
            goto L46
        L3d:
            r4.f(r0, r1)
            goto L46
        L41:
            ghc r0 = r4.j
            r0.i(r4)
        L46:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eoo.k():boolean");
    }

    @Override // defpackage.eox
    public final boolean l() {
        i();
        return this.l;
    }

    @Override // defpackage.eox
    public final boolean m(String str) {
        i();
        byte[] bArr = this.h;
        eci.e(bArr);
        return this.b.requiresSecureDecoder(bArr, str);
    }

    @Override // defpackage.eox
    public final byte[] n() {
        i();
        return this.w;
    }

    @Override // defpackage.eox
    public final void o(eph ephVar) {
        i();
        int i = this.r;
        if (i < 0) {
            edb.c("DefaultDrmSession", a.cf(i, "Session reference count less than zero: "));
            this.r = 0;
        }
        if (ephVar != null) {
            this.o.c(ephVar);
        }
        int i2 = this.r + 1;
        this.r = i2;
        if (i2 == 1) {
            a.ab(this.g == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.s = handlerThread;
            handlerThread.start();
            this.t = new eok(this, this.s.getLooper());
            if (k()) {
                e(true);
            }
        } else if (ephVar != null && j() && this.o.a(ephVar) == 1) {
            ephVar.w(this.g);
        }
        eou eouVar = (eou) this.y.a;
        if (eouVar.a != -9223372036854775807L) {
            eouVar.d.remove(this);
            Handler handler = eouVar.i;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.eox
    public final void p(eph ephVar) {
        i();
        int i = this.r;
        if (i <= 0) {
            edb.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.r = i2;
        if (i2 == 0) {
            this.g = 0;
            eom eomVar = this.f;
            String str = edt.a;
            eomVar.removeCallbacksAndMessages(null);
            this.t.b();
            this.t = null;
            this.s.quit();
            this.s = null;
            this.u = null;
            this.v = null;
            this.x = null;
            this.i = null;
            byte[] bArr = this.h;
            if (bArr != null) {
                this.b.closeSession(bArr);
                this.h = null;
            }
        }
        if (ephVar != null) {
            ecr ecrVar = this.o;
            ecrVar.d(ephVar);
            if (ecrVar.a(ephVar) == 0) {
                ephVar.y();
            }
        }
        pku pkuVar = this.y;
        int i3 = this.r;
        if (i3 == 1) {
            eou eouVar = (eou) pkuVar.a;
            if (eouVar.e > 0) {
                long j = eouVar.a;
                if (j != -9223372036854775807L) {
                    eouVar.d.add(this);
                    Handler handler = eouVar.i;
                    handler.getClass();
                    handler.postAtTime(new emy(this, 3), this, SystemClock.uptimeMillis() + j);
                }
            }
        } else if (i3 == 0) {
            eou eouVar2 = (eou) pkuVar.a;
            eouVar2.b.remove(this);
            if (eouVar2.f == this) {
                eouVar2.f = null;
            }
            if (eouVar2.g == this) {
                eouVar2.g = null;
            }
            ghc ghcVar = eouVar2.k;
            ?? r5 = ghcVar.a;
            r5.remove(this);
            if (ghcVar.b == this) {
                ghcVar.b = null;
                if (!r5.isEmpty()) {
                    ghcVar.b = (eoo) r5.iterator().next();
                    ((eoo) ghcVar.b).h();
                }
            }
            if (eouVar2.a != -9223372036854775807L) {
                Handler handler2 = eouVar2.i;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eouVar2.d.remove(this);
            }
        }
        ((eou) pkuVar.a).b();
    }
}
