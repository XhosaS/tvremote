package com.google.android.libraries.assistant.soda;

import android.content.Context;
import android.os.Build;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.assistant.soda.data.SodaDataProviderJni;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.a;
import defpackage.abvw;
import defpackage.abvz;
import defpackage.abwa;
import defpackage.abwe;
import defpackage.abwf;
import defpackage.abxc;
import defpackage.abxv;
import defpackage.abza;
import defpackage.adch;
import defpackage.adci;
import defpackage.adlr;
import defpackage.adls;
import defpackage.adnj;
import defpackage.adnk;
import defpackage.adnx;
import defpackage.ador;
import defpackage.adot;
import defpackage.adsd;
import defpackage.adse;
import defpackage.adsg;
import defpackage.adsh;
import defpackage.adsq;
import defpackage.adsu;
import defpackage.adsw;
import defpackage.adsx;
import defpackage.adsy;
import defpackage.btt;
import defpackage.mao;
import defpackage.mba;
import defpackage.mbb;
import defpackage.mbc;
import defpackage.mbe;
import defpackage.mbf;
import defpackage.mbg;
import defpackage.mbs;
import defpackage.mbt;
import defpackage.mbu;
import defpackage.mbv;
import defpackage.mbw;
import defpackage.mcd;
import defpackage.mce;
import defpackage.tva;
import defpackage.tvx;
import defpackage.tvy;
import defpackage.wvl;
import defpackage.wyo;
import defpackage.ypv;
import defpackage.yqt;
import defpackage.zdv;
import defpackage.zdy;
import defpackage.zue;
import defpackage.zwk;
import defpackage.zxn;
import defpackage.zyd;
import defpackage.zyf;
import defpackage.zyg;
import defpackage.zyh;
import defpackage.zyn;
import defpackage.zyu;
import defpackage.zyw;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Soda implements mbt {
    public static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/Soda");
    private static final mbc b = new mbc();
    private final String A;
    private final String B;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final int d;
    private final Object e;
    private final ReentrantReadWriteLock f;
    private final Lock g;
    private final Lock h;
    private long i;
    private long j;
    private boolean k;
    private zyf l;
    private zyf m;
    private boolean n;
    private mbf o;
    private zyu p;
    private mbg q;
    private final zyg r;
    private zyh s;
    private yqt t;
    private boolean u;
    private long v;
    private int w;
    private final mbw x;
    private volatile int y;
    private volatile int z;

    public Soda(Context context, zyg zygVar, zyh zyhVar, long j) {
        int andIncrement = b.a.getAndIncrement();
        this.d = andIncrement;
        this.e = new Object();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f = reentrantReadWriteLock;
        this.g = reentrantReadWriteLock.readLock();
        this.h = reentrantReadWriteLock.writeLock();
        this.k = false;
        this.t = ypv.a;
        this.u = false;
        this.v = 0L;
        this.w = 0;
        this.x = new mbw();
        this.y = 0;
        this.z = 0;
        this.A = "addAudioBytes_id" + andIncrement;
        this.B = "addTimestampedAudioBytes_id" + andIncrement;
        mbu.a(context);
        this.r = zygVar;
        this.s = zyhVar;
        this.j = j;
        this.k = j != 0;
        s();
    }

    private native boolean nativeAddAudio(long j, ByteBuffer byteBuffer, long j2);

    private native boolean nativeAddTimestampedAudio(long j, ByteBuffer byteBuffer, long j2, ByteBuffer byteBuffer2, long j3);

    public static native long nativeCreateSharedResources(Object obj);

    private native void nativeDelete(long j);

    private native boolean nativeDeleteDiarizationProcessor(long j);

    public static native boolean nativeDeleteSharedResources(Object obj, long j);

    private native boolean nativeDeleteSharedResourcesIfDiarizationProcessorAbsent(long j);

    private native byte[] nativeInit(long j, byte[] bArr);

    private native boolean nativeRequiresReinitialization(long j, byte[] bArr);

    private native void nativeSetDataProvider(long j, SodaDataProviderJni sodaDataProviderJni);

    private native void nativeSetTransportFactory(long j, SodaTransportFactory sodaTransportFactory);

    private native byte[] nativeStartCapture(long j, byte[] bArr);

    private native void nativeStopCapture(long j);

    private static zyh r(String str, int i) {
        zyw zywVar = new zyw();
        zywVar.b(str);
        zywVar.c(i);
        return zyn.b(Executors.newSingleThreadScheduledExecutor(zyw.a(zywVar)));
    }

    private final void s() {
        if (this.k) {
            if (this.j == 0) {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/Soda", "createNativeSoda", 1532, "Soda.java")).u("SodaSharedResources should never be NULL_PTR when provided externally.");
                this.j = nativeCreateSharedResources(this);
            }
        } else if (this.j == 0) {
            this.j = nativeCreateSharedResources(this);
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/assistant/soda/Soda", "createNativeSoda", 1539, "Soda.java")).u("Creating new SodaSharedResources");
        } else {
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/assistant/soda/Soda", "createNativeSoda", 1541, "Soda.java")).u("Reusing cached SodaSharedResources");
        }
        this.h.lock();
        try {
            this.i = nativeConstruct(this.j);
        } finally {
            this.h.unlock();
        }
    }

    private final void t() {
        if (this.i == 0) {
            throw new IllegalStateException("SODA Android is not initialized");
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, mca] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, mca] */
    private final synchronized void u() {
        this.h.lock();
        try {
            if (this.t.g() && this.t.c().b()) {
                zyg zygVar = this.r;
                if (zygVar != null) {
                    zxn.p(this.t.c().a(), wyo.f(new mbb()), zygVar);
                } else {
                    ((zdv) ((zdv) a.d()).q("com/google/android/libraries/assistant/soda/Soda", "delete", 1204, "Soda.java")).u("No background executor available to tear down data provider.");
                }
            }
            long j = this.i;
            if (j != 0) {
                nativeDelete(j);
                this.i = 0L;
                if (nativeDeleteSharedResourcesIfDiarizationProcessorAbsent(this.j)) {
                    this.j = 0L;
                }
                if (this.j != 0 && b() <= 0) {
                    abwf abwfVar = abwf.a;
                    abwe abweVar = new abwe();
                    if ((abweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        abweVar.y();
                    }
                    ((abwf) abweVar.b).b = 3600L;
                    n((abwf) abweVar.v());
                }
            }
            this.n = false;
        } finally {
            this.h.unlock();
        }
    }

    @Override // defpackage.mbt
    public final long a() {
        return this.j;
    }

    public final synchronized long b() {
        zyf zyfVar = this.l;
        if (zyfVar == null) {
            return -1L;
        }
        return zyfVar.getDelay(TimeUnit.SECONDS);
    }

    public final synchronized long c() {
        zyf zyfVar = this.l;
        if (zyfVar == null) {
            return -1L;
        }
        return 3600000 - zyfVar.getDelay(TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.mbt
    public final mbg d() {
        mbg mbgVar;
        synchronized (this.e) {
            mbgVar = this.q;
        }
        return mbgVar;
    }

    @Override // defpackage.mbt
    public final zyd e(adsy adsyVar, final InputStream inputStream, final yqt yqtVar) {
        adci adciVar;
        int iA;
        zyu zyuVar = this.p;
        if (zyuVar != null && !zyuVar.isDone() && !(this.p.valueField instanceof zue)) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/Soda", "startCapture", 591, "Soda.java")).u("Another SODA capture session is active. Ignoring startCapture request.");
            return zxn.g(new mcd());
        }
        if (adsyVar.c) {
            this.p = null;
        } else {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/Soda", "startCapture", 598, "Soda.java")).u("Blocking calls to Soda.startCapture with InputStream are deprecated.");
            adsx adsxVar = new adsx();
            adsxVar.B(adsyVar);
            if ((adsxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adsxVar.y();
            }
            adsy adsyVar2 = (adsy) adsxVar.b;
            adsyVar2.b |= 1;
            adsyVar2.c = true;
            adsyVar = (adsy) adsxVar.v();
            this.p = new zyu();
        }
        if (this.o == null) {
            zyg zygVarR = this.r;
            if (zygVarR == null) {
                zygVarR = r("soda-background-%d", 1);
            }
            adsq adsqVar = adsyVar.e;
            if (adsqVar == null) {
                adsqVar = adsq.a;
            }
            adls adlsVar = (adsqVar.b == 1 ? (adsw) adsqVar.c : adsw.a).e;
            if (adlsVar == null) {
                adlsVar = adls.a;
            }
            int i = adlsVar.d;
            adsq adsqVar2 = adsyVar.e;
            if (adsqVar2 == null) {
                adsqVar2 = adsq.a;
            }
            adls adlsVar2 = (adsqVar2.b == 1 ? (adsw) adsqVar2.c : adsw.a).e;
            if (adlsVar2 == null) {
                adlsVar2 = adls.a;
            }
            this.o = new mbf(zygVarR, this, i, adlsVar2.e);
        }
        adci adciVar2 = adci.a;
        adch adchVar = new adch();
        if ((adchVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adchVar.y();
        }
        ((adci) adchVar.b).b = 0;
        if (this.c.compareAndSet(false, true)) {
            this.z = 0;
            this.y = 0;
            adsq adsqVar3 = adsyVar.e;
            if (adsqVar3 == null) {
                adsqVar3 = adsq.a;
            }
            adsw adswVar = adsqVar3.b == 1 ? (adsw) adsqVar3.c : adsw.a;
            int iA2 = adsu.a(adswVar.c);
            this.u = iA2 != 0 && iA2 == 3;
            adls adlsVar3 = adswVar.e;
            if (adlsVar3 == null) {
                adlsVar3 = adls.a;
            }
            int i2 = adlsVar3.e;
            int iA3 = adlr.a(adlsVar3.c);
            int i3 = 2;
            if (iA3 == 0) {
                iA3 = 2;
            }
            int i4 = iA3 - 1;
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3) {
                    throw new IllegalArgumentException(String.format("Unexpected SampleFormat: %d", Integer.valueOf(i4)));
                }
                i3 = 4;
            }
            this.w = i2 * i3;
            this.v = 0L;
            this.g.lock();
            try {
                t();
                long j = this.i;
                try {
                    int i5 = adsyVar.memoizedSerializedSize;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(adsyVar.getClass()).a(adsyVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i5 & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(adsyVar.getClass()).a(adsyVar);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            adsyVar.memoizedSerializedSize = (adsyVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(adsyVar.getClass()).m(adsyVar, abwa.a(abvwVar));
                    abvwVar.K();
                    byte[] bArrNativeStartCapture = nativeStartCapture(j, bArr);
                    try {
                        adch adchVar2 = new adch();
                        adchVar2.C(bArrNativeStartCapture, bArrNativeStartCapture.length, ExtensionRegistryLite.getGeneratedRegistry());
                        adciVar = (adci) adchVar2.v();
                    } catch (abxv unused) {
                        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/Soda", "convertToStatus", 1444, "Soda.java")).u("Failed to deserialize received bytes to com.google.rpc.Status proto");
                        adch adchVar3 = new adch();
                        if ((adchVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            adchVar3.y();
                        }
                        ((adci) adchVar3.b).b = 13;
                        if ((adchVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            adchVar3.y();
                        }
                        ((adci) adchVar3.b).c = "failed to deserialize received bytes to com.google.rpc.Status proto";
                        adciVar = (adci) adchVar3.v();
                    }
                    if (adciVar.b != 0) {
                        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/Soda", "startCaptureInternal", 1419, "Soda.java")).u("Failed to start a SODA capture session");
                        m();
                        this.c.set(false);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(a.C(adsyVar, "byte array"), e);
                }
            } finally {
                this.g.unlock();
            }
        } else {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/Soda", "startCaptureInternal", 1427, "Soda.java")).u("Another SODA capture session is active. Ignoring startCapture request.");
            adch adchVar4 = new adch();
            if ((adchVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adchVar4.y();
            }
            ((adci) adchVar4.b).b = 10;
            if ((adchVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adchVar4.y();
            }
            ((adci) adchVar4.b).c = "another SODA capture session is active, ignoring startCapture request";
            adciVar = (adci) adchVar4.v();
        }
        if (adciVar.b != 0) {
            return zxn.g(new mce(adciVar.c));
        }
        final mbf mbfVar = this.o;
        mbfVar.f = new zyu();
        synchronized (mbfVar.g) {
            mbfVar.h = mbfVar.b.submit(new Callable() { // from class: mbd
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    int i6;
                    int i7;
                    mbf mbfVar2 = mbfVar;
                    zyu zyuVar2 = mbfVar2.f;
                    int i8 = mbfVar2.d;
                    if (i8 == 0 || (i7 = mbfVar2.e) < 8000 || i7 > 384000) {
                        ((zdv) ((zdv) mbf.a.c()).q("com/google/android/libraries/assistant/soda/SodaAudioPusher", "getAudioReadSize", 69, "SodaAudioPusher.java")).u("Incorrect Format set");
                        i6 = 0;
                    } else {
                        i6 = (i8 + i8) * (i7 / 1000) * 10;
                    }
                    mbf.b(mbfVar2.c, inputStream, yqtVar, zyuVar2, i6);
                    return null;
                }
            });
            zxn.p(mbfVar.h, new mbe(mbfVar), zwk.a);
        }
        zyu zyuVar2 = mbfVar.f;
        if (this.p == null) {
            return zyuVar2;
        }
        try {
            ((zdv) ((zdv) a.d()).q("com/google/android/libraries/assistant/soda/Soda", "startCapture", 634, "Soda.java")).u("Blocking until capture is stopped.");
            return zyuVar2;
        } catch (InterruptedException | ExecutionException e2) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e2)).q("com/google/android/libraries/assistant/soda/Soda", "startCapture", (char) 637, "Soda.java")).u("Exception while waiting for stop capture.");
            return zyuVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object, mca] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object, mca] */
    /* JADX WARN: Type inference failed for: r4v37, types: [com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, mca] */
    @Override // defpackage.mbt
    public final synchronized adse f(mbs mbsVar) {
        int iA;
        boolean z = true;
        if (this.n) {
            adse adseVar = adse.a;
            adsd adsdVar = new adsd();
            adsg adsgVar = adsg.DOUBLE_INIT;
            if ((adsdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adsdVar.y();
            }
            adse adseVar2 = (adse) adsdVar.b;
            adseVar2.c = adsgVar.o;
            adseVar2.b |= 1;
            if ((adsdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adsdVar.y();
            }
            adse adseVar3 = (adse) adsdVar.b;
            adseVar3.b |= 2;
            adseVar3.d = "SODA cannot be initialized more than once.";
            return (adse) adsdVar.v();
        }
        adot adotVar = ((mao) mbsVar).a;
        yqt yqtVarI = ypv.a;
        ador adorVar = adotVar.e;
        if (adorVar == null) {
            adorVar = ador.a;
        }
        adnx adnxVar = adorVar.q;
        if (adnxVar == null) {
            adnxVar = adnx.a;
        }
        abxc abxcVar = adnk.b;
        if (abxcVar.a != adnx.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK = adnxVar.n.k(abxcVar.d);
        int iA2 = adnj.a(((adnk) (objK == null ? abxcVar.b : abxcVar.b(objK))).d);
        if (iA2 == 0) {
            iA2 = 1;
        }
        if (iA2 == 3 && !this.k) {
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/assistant/soda/Soda", "initSodaWithParams", 338, "Soda.java")).u("Diarization session is being resumed - cancelling timeout.");
            yqtVarI = yqt.i(Long.valueOf(c()));
            abwf abwfVar = abwf.a;
            abwe abweVar = new abwe();
            if ((abweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abweVar.y();
            }
            ((abwf) abweVar.b).b = -1L;
            n((abwf) abweVar.v());
        }
        this.h.lock();
        try {
            if (this.i == 0) {
                s();
            }
            t();
            yqt yqtVar = ((mao) mbsVar).b;
            if (yqtVar.g()) {
                nativeSetTransportFactory(this.i, yqtVar.c());
            }
            yqt yqtVar2 = ((mao) mbsVar).c;
            this.t = yqtVar2;
            if (yqtVar2.g()) {
                if (this.t.c().d()) {
                    zyg zygVar = this.r;
                    if (zygVar != null) {
                        zxn.p(this.t.c().e(), wyo.f(new mba()), zygVar);
                    } else {
                        ((zdv) ((zdv) a.d()).q("com/google/android/libraries/assistant/soda/Soda", "initSodaWithParams", 420, "Soda.java")).u("No background executor available to set up data provider.");
                    }
                }
                nativeSetDataProvider(this.i, new SodaDataProviderJni(yqtVar2.c()));
            }
            long j = this.i;
            try {
                int i = adotVar.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(adotVar.getClass()).a(adotVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(adotVar.getClass()).a(adotVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        adotVar.memoizedSerializedSize = (adotVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z2 = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(adotVar.getClass()).m(adotVar, abwa.a(abvwVar));
                abvwVar.K();
                byte[] bArrNativeInit = nativeInit(j, bArr);
                if (bArrNativeInit == null) {
                    j();
                    adse adseVar4 = adse.a;
                    adsd adsdVar2 = new adsd();
                    adsg adsgVar2 = adsg.UNDEFINED_BEHAVIOR;
                    if ((adsdVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        adsdVar2.y();
                    }
                    adse adseVar5 = (adse) adsdVar2.b;
                    adseVar5.c = adsgVar2.o;
                    adseVar5.b |= 1;
                    if ((adsdVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        adsdVar2.y();
                    }
                    adse adseVar6 = (adse) adsdVar2.b;
                    adseVar6.b |= 2;
                    adseVar6.d = "Unable to parse ConfigResult:  Serialized ConfigResult is null.";
                    return (adse) adsdVar2.v();
                }
                try {
                    adse adseVar7 = adse.a;
                    adsd adsdVar3 = new adsd();
                    adsdVar3.C(bArrNativeInit, bArrNativeInit.length, ExtensionRegistryLite.getGeneratedRegistry());
                    adse adseVar8 = (adse) adsdVar3.v();
                    adsg adsgVarB = adsg.b(adseVar8.c);
                    if (adsgVarB == null) {
                        adsgVarB = adsg.NO_ERROR;
                    }
                    if (adsgVarB != adsg.NO_ERROR) {
                        z = false;
                    }
                    this.n = z;
                    if (yqtVarI.g() && !z) {
                        ((zdv) ((zdv) a.d()).q("com/google/android/libraries/assistant/soda/Soda", "initSodaWithParams", 470, "Soda.java")).u("Resume failed. Deleting soda to ensure processor cached.");
                        u();
                    }
                    return adseVar8;
                } catch (abxv unused) {
                    j();
                    adse adseVar9 = adse.a;
                    adsd adsdVar4 = new adsd();
                    adsg adsgVar3 = adsg.UNDEFINED_BEHAVIOR;
                    if ((adsdVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        adsdVar4.y();
                    }
                    adse adseVar10 = (adse) adsdVar4.b;
                    adseVar10.c = adsgVar3.o;
                    adseVar10.b |= 1;
                    if ((adsdVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        adsdVar4.y();
                    }
                    adse adseVar11 = (adse) adsdVar4.b;
                    adseVar11.b |= 2;
                    adseVar11.d = "Unable to parse ConfigResult: InvalidProtocolBufferException";
                    return (adse) adsdVar4.v();
                }
            } catch (IOException e) {
                throw new RuntimeException(a.A(adotVar, "byte array"), e);
            }
        } finally {
            this.h.unlock();
        }
    }

    protected final void finalize() {
        j();
    }

    public final void g(ByteBuffer byteBuffer, int i) throws Throwable {
        Soda soda;
        if (!this.u) {
            this.g.lock();
            try {
                t();
                if (nativeAddAudio(this.i, byteBuffer, i)) {
                    this.y += i;
                } else {
                    ((zdv) ((zdv) ((zdv) a.d()).n(1, TimeUnit.SECONDS)).q("com/google/android/libraries/assistant/soda/Soda", "addAudio", 1006, "Soda.java")).u("Failed to add audio to SODA.");
                }
                this.g.unlock();
                if (Build.VERSION.SDK_INT < 29 || !btt.e()) {
                    return;
                }
                btt.d(this.A, this.y);
                return;
            } catch (Throwable th) {
                this.g.unlock();
                throw th;
            }
        }
        ((zdv) ((zdv) ((zdv) a.c()).n(30, TimeUnit.SECONDS)).q("com/google/android/libraries/assistant/soda/Soda", "addAudio", 988, "Soda.java")).u("Client explicitly committed to provide timestamps, but called addAudio instead of addTimestampedAudio. Proceeding with fake timestamps.");
        mbw mbwVar = this.x;
        ByteBuffer byteBuffer2 = mbwVar.a;
        if (byteBuffer2 == null || byteBuffer2.capacity() < 16) {
            mbwVar.a = ByteBuffer.allocateDirect(16);
        } else {
            mbwVar.a.clear();
        }
        ByteBuffer byteBuffer3 = mbwVar.a;
        byteBuffer3.putLong(Long.reverseBytes(this.v));
        byteBuffer3.putLong(0L);
        int iCapacity = byteBuffer3.capacity();
        this.g.lock();
        try {
            t();
            this.v += i / this.w;
            try {
                soda = this;
                if (nativeAddTimestampedAudio(this.i, byteBuffer, i, byteBuffer3, iCapacity)) {
                    try {
                        soda.z += i;
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        soda.g.unlock();
                        throw th3;
                    }
                }
                soda.g.unlock();
                if (Build.VERSION.SDK_INT >= 29 && btt.e()) {
                    btt.d(soda.B, soda.z);
                }
                soda.v += i / soda.w;
            } catch (Throwable th4) {
                th = th4;
                soda = this;
            }
        } catch (Throwable th5) {
            th = th5;
            soda = this;
        }
    }

    @Override // defpackage.mbt
    public final synchronized void h() {
        zyf zyfVar = this.m;
        if (zyfVar != null) {
            zyfVar.cancel(false);
            this.m = null;
        }
    }

    protected void handleShutdown() {
        synchronized (this.e) {
            mbg mbgVar = this.q;
            if (mbgVar != null) {
                yqt yqtVar = ((tvx) mbgVar).a;
                if (yqtVar.g()) {
                    ((tva) yqtVar.c()).a();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0302 A[Catch: all -> 0x030f, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x001a, B:8:0x0022, B:9:0x0024, B:82:0x01e5, B:84:0x01ee, B:86:0x01f2, B:87:0x01f4, B:89:0x01fc, B:91:0x020d, B:92:0x020f, B:94:0x0214, B:96:0x0218, B:97:0x021a, B:99:0x0223, B:100:0x0226, B:101:0x0234, B:103:0x023a, B:105:0x023e, B:106:0x0240, B:108:0x0249, B:109:0x024c, B:110:0x025b, B:111:0x0268, B:113:0x026e, B:115:0x0282, B:116:0x0285, B:118:0x029e, B:119:0x02a1, B:121:0x02bc, B:122:0x02bf, B:123:0x02d8, B:125:0x02df, B:126:0x02e2, B:127:0x0302, B:13:0x0039, B:15:0x0043, B:16:0x0045, B:18:0x0051, B:20:0x005d, B:22:0x006c, B:23:0x006f, B:24:0x007d, B:26:0x0084, B:28:0x0088, B:29:0x008a, B:31:0x0093, B:32:0x0096, B:51:0x00fc, B:52:0x0102, B:54:0x0108, B:56:0x011c, B:57:0x011f, B:59:0x0130, B:60:0x0132, B:62:0x0141, B:64:0x014f, B:65:0x0151, B:67:0x0158, B:68:0x015b, B:74:0x0185, B:76:0x0192, B:77:0x0195, B:70:0x016c, B:72:0x0177, B:73:0x017a, B:78:0x01b1, B:80:0x01be, B:81:0x01c1, B:34:0x00a7, B:36:0x00b3, B:38:0x00c2, B:39:0x00c5, B:40:0x00d3, B:42:0x00d9, B:44:0x00dd, B:45:0x00df, B:47:0x00e8, B:48:0x00eb, B:128:0x030d), top: B:133:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void handleSodaEvent(byte[] r17) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.Soda.handleSodaEvent(byte[]):void");
    }

    protected void handleStart() {
        synchronized (this.e) {
            mbg mbgVar = this.q;
            if (mbgVar != null) {
                tvy tvyVar = ((tvx) mbgVar).b;
                wvl wvlVarB = tvyVar.g.b("handleStart", "com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleStart", 869);
                try {
                    final tvx tvxVar = (tvx) mbgVar;
                    tvy.e(tvyVar.b.a(new Callable() { // from class: tvw
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ((zdv) ((zdv) tvy.a.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleStart", 873, "SodaSpeechRecognizer.java")).u("#handleStart");
                            tvx tvxVar2 = tvxVar;
                            tvy tvyVar2 = tvxVar2.b;
                            mbo mboVar = tvyVar2.w;
                            if (mboVar != null) {
                                mboVar.d();
                            }
                            yqt yqtVar = tvyVar2.f;
                            if (yqtVar.g()) {
                                ((trs) yqtVar.c()).a();
                            }
                            yqt yqtVar2 = tvxVar2.a;
                            if (!yqtVar2.g()) {
                                return null;
                            }
                            ((tva) yqtVar2.c()).c();
                            return null;
                        }
                    }, tvyVar.d), "Failed call #handleStart", new Object[0]);
                    wvlVarB.close();
                } finally {
                }
            }
        }
    }

    protected void handleStop(int i) {
        this.c.set(false);
        synchronized (this.e) {
            mbg mbgVar = this.q;
            if (mbgVar != null) {
                final mbv mbvVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? mbv.UNKNOWN : mbv.HOTWORD_TIMEOUT : mbv.ERROR : mbv.MIC_END_OF_DATA : mbv.STOP_CALLED;
                tvy tvyVar = ((tvx) mbgVar).b;
                wvl wvlVarB = tvyVar.g.b("handleStop", "com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleStop", 893);
                try {
                    final tvx tvxVar = (tvx) mbgVar;
                    tvy.e(tvyVar.b.a(new Callable() { // from class: tvv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zdy zdyVar = tvy.a;
                            zdv zdvVar = (zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleStop", 897, "SodaSpeechRecognizer.java");
                            mbv mbvVar2 = mbvVar;
                            zdvVar.x("#handleStop: %s", mbvVar2);
                            tvx tvxVar2 = tvxVar;
                            tvy tvyVar2 = tvxVar2.b;
                            if (mbvVar2 == mbv.ERROR) {
                                tvyVar2.m.c(new trp(3));
                            } else {
                                tvyVar2.m.i();
                            }
                            yqt yqtVar = tvyVar2.f;
                            if (yqtVar.g()) {
                                ((trs) yqtVar.c()).b();
                            }
                            yqt yqtVar2 = tvxVar2.a;
                            if (yqtVar2.g()) {
                                ((tva) yqtVar2.c()).d();
                            }
                            if (tvyVar2.w == null) {
                                return null;
                            }
                            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleStop", 912, "SodaSpeechRecognizer.java")).u("#handleStop: scheduleSodaTimeout");
                            abwf abwfVar = tvyVar2.h;
                            if (abwfVar.b != -1) {
                                tvyVar2.w.e(abwfVar);
                                return null;
                            }
                            mbo mboVar = tvyVar2.w;
                            abwf abwfVar2 = acbg.a;
                            acbg.e(abwfVar2);
                            mboVar.e(abwfVar2);
                            return null;
                        }
                    }, tvyVar.d), "Failed call #handleStop", new Object[0]);
                    wvlVarB.close();
                } finally {
                }
            }
        }
        zyu zyuVar = this.p;
        if (zyuVar != null) {
            zyuVar.p(null);
        }
    }

    public final synchronized void i(adsh adshVar) {
        if (this.k) {
            return;
        }
        zdy zdyVar = a;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/assistant/soda/Soda", "clearDiarizationCache", 1323, "Soda.java")).x("#clearDiarizationCache: %s", adshVar);
        if (this.j == 0) {
            ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/assistant/soda/Soda", "clearDiarizationCache", 1326, "Soda.java")).u("SodaSharedResources is already NULL_PTR, nothing to delete.");
            return;
        }
        zyf zyfVar = this.m;
        if (zyfVar != null && zyfVar.getDelay(TimeUnit.SECONDS) > 0) {
            h();
            ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/assistant/soda/Soda", "clearDiarizationCache", 1339, "Soda.java")).u("Deleting soda early to force caching.");
            j();
        }
        c();
        abwf abwfVar = abwf.a;
        abwe abweVar = new abwe();
        if ((abweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar.y();
        }
        ((abwf) abweVar.b).b = -1L;
        n((abwf) abweVar.v());
        this.g.lock();
        try {
            if (this.i != 0) {
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/assistant/soda/Soda", "clearDiarizationCache", 1360, "Soda.java")).x("DiarizationProcessor deleted from SodaSharedResources: %b", Boolean.valueOf(nativeDeleteDiarizationProcessor(this.j)));
            } else {
                boolean zNativeDeleteSharedResources = nativeDeleteSharedResources(this, this.j);
                this.j = 0L;
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/assistant/soda/Soda", "clearDiarizationCache", 1367, "Soda.java")).x("Deleted SodaSharedResources. Diarization processor present: %b", Boolean.valueOf(zNativeDeleteSharedResources));
            }
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.mbt
    public final synchronized void j() {
        u();
    }

    @Override // defpackage.mbt
    public final synchronized void k(final abwf abwfVar, final Runnable runnable) {
        zyf zyfVar = this.m;
        if (zyfVar != null) {
            zyfVar.cancel(false);
        }
        if (this.s == null) {
            this.s = r("soda-lightweight-%d", 5);
        }
        this.m = this.s.schedule(new Runnable() { // from class: maz
            @Override // java.lang.Runnable
            public final void run() {
                ((zdv) ((zdv) Soda.a.b()).q("com/google/android/libraries/assistant/soda/Soda", "scheduleLiveTimeout", 1244, "Soda.java")).w("TTL (%d seconds) reached - run scheduled task", abwfVar.b);
                runnable.run();
            }
        }, abwfVar.b, TimeUnit.SECONDS);
    }

    @Override // defpackage.mbt
    public final void l(mbg mbgVar) {
        synchronized (this.e) {
            this.q = mbgVar;
        }
    }

    @Override // defpackage.mbt
    public final void m() {
        zyd zydVar;
        this.g.lock();
        try {
            t();
            nativeStopCapture(this.i);
            this.g.unlock();
            mbf mbfVar = this.o;
            if (mbfVar != null) {
                synchronized (mbfVar.g) {
                    if (mbfVar.f != null && (zydVar = mbfVar.h) != null && !zydVar.isDone() && !mbfVar.f.isDone()) {
                        mbfVar.f.cancel(true);
                        mbfVar.i = new zyu();
                    }
                }
                zyu zyuVar = mbfVar.i;
                if (zyuVar != null) {
                    try {
                        zyuVar.s();
                    } catch (InterruptedException | ExecutionException e) {
                        ((zdv) ((zdv) ((zdv) mbf.a.c()).p(e)).q("com/google/android/libraries/assistant/soda/SodaAudioPusher", "stopRunner", (char) 251, "SodaAudioPusher.java")).u("Exception occurred when trying to stop pushing SODA audio.");
                    }
                }
            }
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    public final synchronized void n(final abwf abwfVar) {
        zyf zyfVar;
        if (!this.k) {
            if (abwfVar.b == -1) {
                zyfVar = this.l;
                this.l = null;
            } else {
                if (this.s == null) {
                    this.s = r("soda-lightweight-%d", 5);
                }
                ((zdv) ((zdv) a.b()).q("com/google/android/libraries/assistant/soda/Soda", "updateSharedResourcesTimeout", 1278, "Soda.java")).w("Starting new shared resources timeout future for %d seconds.", abwfVar.b);
                zyf zyfVar2 = this.l;
                this.l = this.s.schedule(new Runnable() { // from class: may
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zdv) ((zdv) Soda.a.b()).q("com/google/android/libraries/assistant/soda/Soda", "updateSharedResourcesTimeout", 1285, "Soda.java")).w("TTL (%d seconds) reached - destroy SodaSharedResources", abwfVar.b);
                        this.a.i(adsh.STOP_TYPE_TIMEOUT);
                    }
                }, abwfVar.b, TimeUnit.SECONDS);
                zyfVar = zyfVar2;
            }
            if (zyfVar != null) {
                zyfVar.cancel(false);
            }
        }
    }

    public native long nativeConstruct(long j);

    @Override // defpackage.mbt
    public final synchronized boolean o() {
        return this.n;
    }

    @Override // defpackage.mbt
    public final boolean p() {
        return this.c.get();
    }

    @Override // defpackage.mbt
    public final synchronized boolean q(adot adotVar) {
        int iA;
        if (!this.n) {
            return true;
        }
        this.g.lock();
        try {
            long j = this.i;
            try {
                int i = adotVar.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(adotVar.getClass()).a(adotVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(adotVar.getClass()).a(adotVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        adotVar.memoizedSerializedSize = (Integer.MIN_VALUE & adotVar.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(adotVar.getClass()).m(adotVar, abwa.a(abvwVar));
                abvwVar.K();
                return nativeRequiresReinitialization(j, bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.A(adotVar, "byte array"), e);
            }
        } finally {
            this.g.unlock();
        }
    }

    public Soda(Context context, zyg zygVar, zyh zyhVar) {
        int andIncrement = b.a.getAndIncrement();
        this.d = andIncrement;
        this.e = new Object();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f = reentrantReadWriteLock;
        this.g = reentrantReadWriteLock.readLock();
        this.h = reentrantReadWriteLock.writeLock();
        this.k = false;
        this.t = ypv.a;
        this.u = false;
        this.v = 0L;
        this.w = 0;
        this.x = new mbw();
        this.y = 0;
        this.z = 0;
        this.A = "addAudioBytes_id" + andIncrement;
        this.B = "addTimestampedAudioBytes_id" + andIncrement;
        mbu.a(context);
        s();
        this.r = zygVar;
        this.s = zyhVar;
    }
}
