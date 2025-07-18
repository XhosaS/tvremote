package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zef implements zeo, zfp {
    private static final String a = new String();
    public final long b;
    private final Level e;
    public zee c = null;
    private zei f = null;
    public zew d = null;
    private zgu g = null;
    private Object[] h = null;

    protected zef(Level level, long j) {
        level.getClass();
        this.e = level;
        this.b = j;
    }

    private final void W(String str, Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof zea) {
                objArr[i] = ((zea) obj).a();
            }
        }
        if (str != a) {
            this.g = new zgu(j(), str);
        }
        zih zihVarK = zgr.k();
        zif zifVar = zihVarK.c;
        if (!zifVar.isEmpty()) {
            zfx zfxVarC = c();
            zer zerVar = zed.h;
            zih zihVar = (zih) zfxVarC.c(zerVar);
            if (zihVar != null) {
                zif zifVar2 = zihVar.c;
                if (!zifVar2.isEmpty()) {
                    zihVarK = zifVar.isEmpty() ? zihVar : new zih(new zif(zifVar, zifVar2));
                }
            }
            s(zerVar, zihVarK);
        }
        zdo zdoVarL = l();
        try {
            ziw ziwVarA = ziw.a();
            int i2 = ziwVarA.a + 1;
            ziwVarA.a = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    zdoVarL.a.b(this);
                } else {
                    zdo.e("unbounded recursion in log statement", this);
                }
                if (ziwVarA != null) {
                    ziwVarA.close();
                }
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                zdoVarL.a.a(e, this);
            } catch (zfu e2) {
                throw e2;
            } catch (RuntimeException e3) {
                zdo.e(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean X() {
        zej zejVarB;
        zee zeeVar;
        int i;
        if (this.f == null) {
            this.f = zgr.g().a(zef.class, 1);
        }
        if (this.f != zei.a) {
            zejVarB = this.f;
            zee zeeVar2 = this.c;
            if (zeeVar2 != null && (i = zeeVar2.b) > 0) {
                zejVarB.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (zed.f.equals(zeeVar2.b(i2))) {
                        Object objD = zeeVar2.d(i2);
                        zejVarB = objD instanceof zep ? ((zep) objD).b() : new zfa(zejVarB, objD);
                    }
                }
            }
        } else {
            zejVarB = null;
        }
        boolean zK = k(zejVarB);
        zew zewVar = this.d;
        if (zewVar == null) {
            return zK;
        }
        zev zevVar = (zev) zev.a.b(zejVarB, this.c);
        int iIncrementAndGet = zevVar.c.incrementAndGet();
        int i3 = -1;
        if (zewVar != zew.c && zevVar.b.compareAndSet(false, true)) {
            try {
                zewVar.a();
                zevVar.b.set(false);
                zevVar.c.addAndGet(-iIncrementAndGet);
                i3 = (-1) + iIncrementAndGet;
            } catch (Throwable th) {
                zevVar.b.set(false);
                throw th;
            }
        }
        if (zK && i3 > 0 && (zeeVar = this.c) != null) {
            zeeVar.f(zed.e, Integer.valueOf(i3));
        }
        return zK & (i3 >= 0);
    }

    @Override // defpackage.zeo
    public final void A(String str, int i, long j) {
        if (X()) {
            W(str, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // defpackage.zeo
    public final void B(String str, int i, Object obj) {
        if (X()) {
            W(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.zeo
    public final void C(String str, long j, long j2) {
        if (X()) {
            W(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // defpackage.zeo
    public final void D(String str, Object obj, int i) {
        if (X()) {
            W(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.zeo
    public final void E(String str, Object obj, long j) {
        if (X()) {
            W(str, obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.zeo
    public final void F(String str, Object obj, Object obj2) {
        if (X()) {
            W(str, obj, obj2);
        }
    }

    @Override // defpackage.zeo
    public final void G(String str, Object obj, boolean z) {
        if (X()) {
            W(str, obj, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.zeo
    public final void H(String str, boolean z, boolean z2) {
        if (X()) {
            W(str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.zeo
    public final void I(String str, Object obj, Object obj2, Object obj3) {
        if (X()) {
            W(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.zeo
    public final void J(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (X()) {
            W(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.zeo
    public final void K(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (X()) {
            W(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.zeo
    public final void L(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (X()) {
            W(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // defpackage.zeo
    public final void M(String str, Object[] objArr) {
        if (X()) {
            W(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.zeo
    public final zeo N() {
        zer zerVar = zed.b;
        if (h()) {
            return m();
        }
        s(zerVar, 100);
        return m();
    }

    @Override // defpackage.zeo
    public final void O(int i, boolean z) {
        if (X()) {
            W("Uploading volume changes of %d and mute %b.", Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.zeo
    public final void P(Object obj, float f) {
        if (X()) {
            W("Not writing new location since the last one is only %s old and the new one is only %s meters away", obj, Float.valueOf(f));
        }
    }

    @Override // defpackage.zeo
    public final void Q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (X()) {
            W("Ctor: nativeAudioInput = %d chunkSizeMs=%d source=%d sampleRate=%d channels=%d bytesPerSample=%d dspCaptureSession=%d isLoopbackSession=%b allowNonBlockingApiUse=%b acousticEchoCanellerEnabled=%b", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // defpackage.zeo
    public final void R(long j, Object obj) {
        if (X()) {
            W("Appflow End Event is skipped. requestId=%d appFlowEndEvent=%s", Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.zeo
    public final void S(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (X()) {
            W("logDataSharingConsentEvent: %s -> %s; Entry point: %s; Searchable settings app package name: %s; Has neutral button: %b; Eligible for neutral button treatment: %b.", obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.zeo
    public final void T(boolean z, int i) {
        if (X()) {
            W("#onAccountChanged new account added: %s -> %s", Boolean.valueOf(z), Integer.valueOf(i));
        }
    }

    @Override // defpackage.zeo
    public final void U(boolean z, Object obj) {
        if (X()) {
            W("#startSendingS3Requests, multi = %b, entrypoint = %s", Boolean.valueOf(z), obj);
        }
    }

    @Override // defpackage.zeo
    public final void V() {
        if (h()) {
            return;
        }
        l().f(this.e);
    }

    @Override // defpackage.zfp
    public final long a() {
        return this.b;
    }

    @Override // defpackage.zfp
    public final zei b() {
        zei zeiVar = this.f;
        if (zeiVar != null) {
            return zeiVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.zfp
    public final zfx c() {
        zee zeeVar = this.c;
        return zeeVar != null ? zeeVar : zfw.a;
    }

    @Override // defpackage.zfp
    public final zgu d() {
        return this.g;
    }

    @Override // defpackage.zfp
    public final Object e() {
        ziu.b(this.g == null, "cannot get literal argument if a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.zfp
    public final String f() {
        return l().a.d();
    }

    @Override // defpackage.zfp
    public final Level g() {
        return this.e;
    }

    @Override // defpackage.zfp
    public final boolean h() {
        return this.c != null && Boolean.TRUE.equals(this.c.c(zed.g));
    }

    @Override // defpackage.zfp
    public final Object[] i() {
        ziu.b(this.g != null, "cannot get arguments unless a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    protected abstract ziq j();

    protected boolean k(zej zejVar) {
        throw null;
    }

    protected abstract zdo l();

    protected abstract zeo m();

    @Override // defpackage.zeo
    public final zeo n(int i, TimeUnit timeUnit) {
        if (h()) {
            return m();
        }
        zer zerVar = zed.d;
        zel zelVar = zdt.a;
        s(zerVar, new zds(i, timeUnit));
        return m();
    }

    @Override // defpackage.zeo
    public final zeo o(zer zerVar, Object obj) {
        zerVar.getClass();
        if (obj != null) {
            s(zerVar, obj);
        }
        return m();
    }

    @Override // defpackage.zeo
    public final zeo p(Throwable th) {
        return o(zed.a, th);
    }

    @Override // defpackage.zeo
    public final zeo q(String str, String str2, int i, String str3) {
        zei zeiVar = zei.a;
        zeh zehVar = new zeh(str, str2, i, str3);
        if (this.f == null) {
            this.f = zehVar;
        }
        return m();
    }

    @Override // defpackage.zeo
    public final zeo r(zfc zfcVar) {
        zfcVar.getClass();
        if (zfcVar != zfc.NONE) {
            s(zed.i, zfcVar);
        }
        return m();
    }

    protected final void s(zer zerVar, Object obj) {
        if (this.c == null) {
            this.c = new zee();
        }
        this.c.f(zerVar, obj);
    }

    @Override // defpackage.zeo
    public final void t() {
        if (X()) {
            W(a, "");
        }
    }

    @Override // defpackage.zeo
    public final void u(String str) {
        if (X()) {
            W(a, str);
        }
    }

    @Override // defpackage.zeo
    public final void v(String str, int i) {
        if (X()) {
            W(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.zeo
    public final void w(String str, long j) {
        if (X()) {
            W(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.zeo
    public final void x(String str, Object obj) {
        if (X()) {
            W(str, obj);
        }
    }

    @Override // defpackage.zeo
    public final void y(String str, double d, double d2) {
        if (X()) {
            W(str, Double.valueOf(d), Double.valueOf(d2));
        }
    }

    @Override // defpackage.zeo
    public final void z(String str, int i, int i2) {
        if (X()) {
            W(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
