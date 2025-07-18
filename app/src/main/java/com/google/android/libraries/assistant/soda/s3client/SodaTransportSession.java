package com.google.android.libraries.assistant.soda.s3client;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.a;
import defpackage.aatd;
import defpackage.aatf;
import defpackage.abvw;
import defpackage.abvz;
import defpackage.abwa;
import defpackage.abxd;
import defpackage.abxv;
import defpackage.abza;
import defpackage.abzz;
import defpackage.adkb;
import defpackage.adkf;
import defpackage.adkp;
import defpackage.adrn;
import defpackage.ageg;
import defpackage.ageh;
import defpackage.mco;
import defpackage.mcr;
import defpackage.mcs;
import defpackage.wvl;
import defpackage.wxc;
import defpackage.zdv;
import defpackage.zdy;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SodaTransportSession implements mcs {
    private static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/s3client/SodaTransportSession");
    private final SodaTransportFactory b;
    private long c;
    private mcr d;

    public SodaTransportSession(SodaTransportFactory sodaTransportFactory) {
        this.b = sodaTransportFactory;
    }

    @Override // defpackage.mcs
    public final void a(String str) {
        long j = this.c;
        if (j == 0) {
            throw new IllegalStateException("No native delegate. Was start/stop called?");
        }
        nativeHandleError(j, str);
    }

    @Override // defpackage.mcs
    public final void b(adkf adkfVar) {
        int iA;
        long j = this.c;
        if (j == 0) {
            throw new IllegalStateException("No native delegate. Was start/stop called?");
        }
        try {
            int i = adkfVar.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(adkfVar.getClass()).a(adkfVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(adkfVar.getClass()).a(adkfVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    adkfVar.memoizedSerializedSize = (Integer.MIN_VALUE & adkfVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(adkfVar.getClass()).m(adkfVar, abwa.a(abvwVar));
            abvwVar.K();
            nativeHandleResponse(j, bArr);
        } catch (IOException e) {
            throw new RuntimeException(a.u(adkfVar, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.mcs
    public final void c(int i) {
        long j = this.c;
        if (j == 0) {
            throw new IllegalStateException("No native delegate. Was start/stop called?");
        }
        nativeHandleState(j, i - 1);
    }

    protected native void nativeHandleError(long j, String str);

    protected native void nativeHandleResponse(long j, byte[] bArr);

    protected native void nativeHandleState(long j, int i);

    public final void sendRequest(byte[] bArr) throws abxv {
        ArrayDeque arrayDeque;
        if (this.d == null) {
            return;
        }
        try {
            abxd abxdVarH = abxd.h(adkb.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            adkb adkbVar = (adkb) abxdVarH;
            mcr mcrVar = this.d;
            synchronized (((mco) mcrVar).b) {
                ageg agegVar = ((mco) mcrVar).f;
                if (agegVar == null) {
                    return;
                }
                if (((ageh) agegVar).b.k() && ((arrayDeque = ((mco) mcrVar).e) == null || arrayDeque.isEmpty())) {
                    ((mco) mcrVar).b(adkbVar);
                } else if (((mco) mcrVar).e.size() < 200) {
                    ((mco) mcrVar).e.addLast(adkbVar);
                } else {
                    ((zdv) ((zdv) mco.a.d()).q("com/google/android/libraries/assistant/soda/s3client/SodaGrpcTransport", "sendRequest", 112, "SodaGrpcTransport.java")).u("Pending request size limit exceeded.");
                    ((mco) mcrVar).c("REQ_LIMIT_EXCEEDED");
                    ((mco) mcrVar).h();
                }
            }
        } catch (Exception e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/libraries/assistant/soda/s3client/SodaTransportSession", "sendRequest", '\\', "SodaTransportSession.java")).u("S3Request parsing failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [ager, mcr] */
    public final boolean start(long j, byte[] bArr) throws abxv {
        byte bByteValue;
        if (j == 0) {
            return false;
        }
        this.c = j;
        try {
            abxd abxdVarH = abxd.h(adrn.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                if (bByteValue != 0) {
                    boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                    abxdVarH.cM(2, true != zL ? null : abxdVarH);
                    if (zL) {
                    }
                }
                throw new abzz().a();
            }
            ?? A = this.b.a((adrn) abxdVarH);
            this.d = A;
            if (A == 0) {
                return false;
            }
            synchronized (((mco) A).b) {
                if (((mco) A).f != null) {
                    ((zdv) ((zdv) mco.a.d()).q("com/google/android/libraries/assistant/soda/s3client/SodaGrpcTransport", "start", 72, "SodaGrpcTransport.java")).u("Already started.");
                    return false;
                }
                ((mco) A).e = new ArrayDeque();
                ((mco) A).h = this;
                try {
                    wvl wvlVarB = ((mco) A).d.b("SodaGrpcTransport#createStub", "com/google/android/libraries/assistant/soda/s3client/SodaGrpcTransport", "start", 82);
                    try {
                        ((mco) A).g = (adkp) ((mco) A).c.call();
                        wvlVarB.close();
                        ((mco) A).g = (adkp) ((mco) A).g.h(aatd.a, new aatf());
                        wxc wxcVar = ((mco) A).d;
                        wvl wvlVarB2 = wxcVar != null ? wxcVar.b("SodaGrpcTransport#start", "com/google/android/libraries/assistant/soda/s3client/SodaGrpcTransport", "start", 92) : null;
                        try {
                            ((mco) A).f = (ageg) ((mco) A).g.b(A);
                            if (wvlVarB2 != null) {
                                wvlVarB2.close();
                            }
                            return true;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e) {
                    ((zdv) ((zdv) ((zdv) mco.a.c()).p(e)).q("com/google/android/libraries/assistant/soda/s3client/SodaGrpcTransport", "start", 85, "SodaGrpcTransport.java")).u("Unable to create S3 gRPC stub!");
                    return false;
                }
            }
        } catch (Exception e2) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e2)).q("com/google/android/libraries/assistant/soda/s3client/SodaTransportSession", "start", 'M', "SodaTransportSession.java")).u("SodaS3TransportConfig parsing failed.");
            return false;
        }
    }

    public final void stop() {
        mcr mcrVar = this.d;
        if (mcrVar == null) {
            this.c = 0L;
            return;
        }
        mcrVar.h();
        this.d = null;
        this.c = 0L;
    }
}
