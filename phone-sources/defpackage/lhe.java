package defpackage;

import android.content.ContentResolver;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhe {
    private static final tui i = tui.l("com/google/android/apps/play/movies/common/service/drm/exov2/WidevineMediaDrmWrapperV2");
    public final ExoMediaDrm a;
    public final tst b;
    public final int c;
    public final int d;
    public final byte[] e;
    public boolean f;
    public int g;
    public byte[] h;
    private final ksn j;
    private final String k;
    private final ksy l;
    private final String m;
    private final idf n;
    private final Executor o;
    private final lfn p;
    private final HashMap q;
    private final lnu r;
    private Object s;
    private idy t;
    private boolean u;
    private Object v;
    private String w;
    private byte[] x;
    private kso y;
    private final lrq z;

    public lhe(ksn ksnVar, String str, ksy ksyVar, int i2, byte[] bArr, int i3, epi epiVar, tst tstVar, lnu lnuVar, lrq lrqVar, idf idfVar, Executor executor, lfn lfnVar, ExoMediaDrm exoMediaDrm, ContentResolver contentResolver, String str2) {
        HashMap map = new HashMap();
        this.q = map;
        this.f = false;
        this.j = ksnVar;
        krf.c(str);
        this.k = str;
        this.l = ksyVar;
        this.d = i2;
        this.e = bArr;
        this.o = executor;
        this.b = tstVar;
        this.p = lfnVar;
        this.z = lrqVar;
        this.n = idfVar;
        this.r = lnuVar;
        this.a = exoMediaDrm;
        this.m = str2;
        if (i3 > 0) {
            exoMediaDrm.setPropertyString("securityLevel", a.cf(i3, "L"));
        }
        String propertyString = exoMediaDrm.getPropertyString("securityLevel");
        this.c = propertyString.equals("L1") ? 1 : propertyString.equals("L3") ? 3 : -1;
        if (epiVar != null) {
            exoMediaDrm.setOnEventListener(epiVar);
        }
        map.put("aid", Long.toString(lfnVar.aJ()));
        map.put("android_id", Settings.Secure.getString(contentResolver, "android_id"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int i2, boolean z) {
        lnu lnuVar = this.r;
        if (lnuVar != null) {
            lnuVar.d(i2, z);
        }
    }

    private final boolean t() {
        return this.h != null;
    }

    public final synchronized long a() {
        a.ab(t());
        Map<String, String> mapQueryKeyStatus = this.a.queryKeyStatus(this.h);
        if (mapQueryKeyStatus != null && mapQueryKeyStatus.containsKey("LicenseDurationRemaining") && mapQueryKeyStatus.containsKey("PlaybackDurationRemaining")) {
            return Math.min(Long.parseLong(mapQueryKeyStatus.get("LicenseDurationRemaining")), Long.parseLong(mapQueryKeyStatus.get("PlaybackDurationRemaining")));
        }
        return 0L;
    }

    public final String b(String str) {
        return str + ": " + this.k + " " + this.j.toString() + " " + String.valueOf(this.s);
    }

    public final synchronized void c() {
        this.x = null;
        this.v = null;
        this.s = null;
        this.t = null;
        byte[] bArr = this.h;
        if (bArr != null) {
            this.a.closeSession(bArr);
            this.h = null;
        }
    }

    public final synchronized void d(String str, byte[] bArr, Object obj, idy idyVar) {
        a.ab(!t());
        this.s = obj;
        idyVar.getClass();
        this.t = idyVar;
        this.u = false;
        this.w = str;
        this.x = bArr;
        e();
    }

    public final void e() {
        try {
            try {
                Trace.beginSection("MediaDrm.openSession");
                this.h = this.a.openSession();
                Trace.endSection();
                h(ieg.a);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (NotProvisionedException e) {
            k(1, e);
        } catch (Exception e2) {
            krd.d("Unexpected error when opening session", e2);
            g(e2);
        }
    }

    public final void f(int i2) {
        lnu lnuVar = this.r;
        if (lnuVar != null) {
            lnuVar.e(i2);
        }
    }

    public final void g(Throwable th) {
        idy idyVar = this.t;
        this.s = null;
        this.t = null;
        if (idyVar != null) {
            idyVar.c(ieg.b(th));
        } else {
            ((tug) ((tug) ((tug) i.g()).i(th)).j("com/google/android/apps/play/movies/common/service/drm/exov2/WidevineMediaDrmWrapperV2", "reportErrorToClient", (char) 472, "WidevineMediaDrmWrapperV2.java")).s("clientReceiver is null. Logging the error here.");
        }
    }

    public final void h(ieg iegVar) {
        idy idyVar = this.t;
        this.s = null;
        this.t = null;
        idyVar.c(ieg.f(iegVar));
    }

    public final synchronized void i(Object obj, idy idyVar) {
        a.ab(t());
        this.s = obj;
        idyVar.getClass();
        this.t = idyVar;
        this.u = false;
        j();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final void j() {
        try {
            f(8);
            Trace.beginSection("getKeyRequest");
            try {
                int i2 = this.d;
                eph keyRequest = this.a.getKeyRequest(i2 == 3 ? this.e : this.h, Collections.singletonList(new dyz(dys.d, this.w, this.x)), i2, this.q);
                s(8, true);
                Trace.endSection();
                ?? r3 = keyRequest.c;
                int i3 = this.d;
                int i4 = i3 != 1 ? i3 != 2 ? 3 : 2 : 1;
                boolean z = i4 == 1 && this.f && !TextUtils.isEmpty(r3);
                ksn ksnVar = this.j;
                ksy ksyVar = this.l;
                if (ksyVar == null) {
                    throw new NullPointerException("Null assetId");
                }
                String str = this.m;
                if (str == null) {
                    throw new NullPointerException("Null cpn");
                }
                mee meeVar = new mee((byte[]) keyRequest.b);
                boolean z2 = this.e != null;
                kso ksoVar = this.y;
                long jMax = 0;
                if (ksoVar != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - ksoVar.a;
                    if (jCurrentTimeMillis < 0) {
                        jCurrentTimeMillis = 1;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - ksoVar.b;
                    if (jElapsedRealtime < 0) {
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    jMax = Math.max(jCurrentTimeMillis, jElapsedRealtime);
                }
                lrr lrrVar = new lrr(i4, ksnVar, meeVar, z2, jMax, ksyVar, str, z);
                this.v = lrrVar;
                lhc lhcVar = new lhc(this, lrrVar);
                iei ieiVar = new iei(this.z, lrrVar);
                Executor executor = this.o;
                mjo.f(lhcVar, ieiVar, executor, executor);
            } catch (Throwable th) {
                s(8, false);
                Trace.endSection();
                throw th;
            }
        } catch (NotProvisionedException e) {
            k(2, e);
        } catch (Exception e2) {
            krd.d("Unexpected error during license request", e2);
            g(e2);
        }
    }

    public final void k(int i2, NotProvisionedException notProvisionedException) {
        if (this.u) {
            g(notProvisionedException);
            return;
        }
        this.u = true;
        this.g = i2;
        try {
            epm provisionRequest = this.a.getProvisionRequest();
            String strBr = this.p.br((String) provisionRequest.b);
            String str = new String((byte[]) provisionRequest.a, ksg.a);
            mew mewVar = new mew(strBr);
            mewVar.h("signedRequest", str);
            mfp mfpVar = new mfp("POST", mewVar.a(), mfp.a, new HashMap());
            this.v = mfpVar;
            lhd lhdVar = new lhd(this, mfpVar);
            iei ieiVar = new iei(this.n, mfpVar);
            Executor executor = this.o;
            mjo.f(lhdVar, ieiVar, executor, executor);
        } catch (Exception e) {
            krd.d("Unexpected error during provision request", e);
            g(e);
        }
    }

    public final synchronized void l(Object obj, idy idyVar) {
        a.ab(t());
        this.s = obj;
        idyVar.getClass();
        this.t = idyVar;
        this.u = false;
        try {
            ExoMediaDrm exoMediaDrm = this.a;
            byte[] bArr = this.h;
            byte[] bArr2 = this.e;
            exoMediaDrm.restoreKeys(bArr, bArr2);
            h(ieg.f(bArr2));
        } catch (Exception e) {
            idyVar.c(ieg.b(new lgp(e)));
        }
    }

    public final synchronized void m(kso ksoVar) {
        this.y = ksoVar;
    }

    public final boolean n(String str) throws Throwable {
        tui tuiVar = i;
        ((tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/common/service/drm/exov2/WidevineMediaDrmWrapperV2", "requiresSecureDecoder", 176, "WidevineMediaDrmWrapperV2.java")).x("[Playback] WidevineMediaDrmWrapperV2 requiresSecureDecoder: forcedSecurityLevel=%s, cenckeysetid=%s", this.c, this.e);
        tug tugVar = (tug) tuiVar.g();
        tvj tvjVar = tvj.FULL;
        tug tugVar2 = (tug) ((tug) tugVar.k(tvjVar)).j("com/google/android/apps/play/movies/common/service/drm/exov2/WidevineMediaDrmWrapperV2", "requiresSecureDecoder", 180, "WidevineMediaDrmWrapperV2.java");
        ExoMediaDrm exoMediaDrm = this.a;
        tugVar2.E("[Playback] requiresSecureDecoder: sessionId=%s, mimeType=%s, version=%s", this.h, str, exoMediaDrm.getPropertyString(krh.VERSION));
        if (!"16.0.0".equals(exoMediaDrm.getPropertyString(krh.VERSION)) || Build.VERSION.SDK_INT <= 31) {
            boolean zRequiresSecureDecoder = exoMediaDrm.requiresSecureDecoder(this.h, str);
            ((tug) ((tug) ((tug) tuiVar.g()).k(tvjVar)).j("com/google/android/apps/play/movies/common/service/drm/exov2/WidevineMediaDrmWrapperV2", "requiresSecureDecoder", 202, "WidevineMediaDrmWrapperV2.java")).v("[Playback] requiresSecureDecoder: response=%s", Boolean.valueOf(zRequiresSecureDecoder));
            return zRequiresSecureDecoder;
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(dys.d, this.h);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException e) {
                    e = e;
                    mediaCrypto = mediaCrypto2;
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException e2) {
            e = e2;
        }
    }

    public final boolean o(Object obj) {
        if (obj != this.v) {
            return false;
        }
        this.v = null;
        return true;
    }

    public final synchronized byte[] p() {
        return this.h;
    }

    public final synchronized void r(idy idyVar) {
        a.ab(t());
        this.s = "EventProvisionRequired";
        idyVar.getClass();
        this.t = idyVar;
        this.u = false;
        k(0, null);
    }
}
