package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kat extends kfu {
    final /* synthetic */ kau a;
    private final jyq k;
    private final kaa l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kat(kau kauVar, jyq jyqVar, kev kevVar, kaa kaaVar) {
        super(kevVar);
        this.a = kauVar;
        List list = jyw.m;
        this.k = jyqVar;
        this.l = kaaVar;
    }

    @Override // defpackage.kfu
    protected final /* synthetic */ void b(kdz kdzVar) {
        List<aecr> list;
        ArrayList arrayList;
        int i;
        LogEventParcelable logEventParcelableC;
        kab kabVar;
        long j;
        long jLongValue;
        long jA;
        kav kavVar = (kav) kdzVar;
        try {
            jyq jyqVarA = this.k.a();
            if (jyqVarA == null) {
                m(Status.a);
                return;
            }
            aecc aeccVar = jyqVarA.b;
            String str = jyqVarA.k;
            int i2 = ((aecd) aeccVar.b).e;
            if (str == null || str.isEmpty()) {
                str = null;
            }
            jzy jzyVar = jyqVarA.a.d;
            if (str == null) {
                arrayList = new ArrayList();
            } else {
                if (((kbh) jzyVar).e == null) {
                    list = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = kbh.b;
                    rgi rgiVar = (rgi) concurrentHashMap.get(str);
                    if (rgiVar == null) {
                        rgg rggVar = kbh.a;
                        aecs aecsVar = aecs.a;
                        rgf rgfVar = new rgf() { // from class: kbg
                            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
                            
                                if (r2 != false) goto L17;
                             */
                            @Override // defpackage.rgf
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object a(byte[] r5) throws defpackage.abxv {
                                /*
                                    r4 = this;
                                    aecs r0 = defpackage.aecs.a
                                    int r1 = r5.length
                                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                                    abza r2 = defpackage.abza.a
                                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                                    r3 = 0
                                    abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                                    if (r5 == 0) goto L44
                                    r0 = 1
                                    r1 = 0
                                    java.lang.Object r2 = r5.cM(r0, r1)
                                    java.lang.Byte r2 = (java.lang.Byte) r2
                                    byte r2 = r2.byteValue()
                                    if (r2 != r0) goto L1f
                                    goto L44
                                L1f:
                                    if (r2 == 0) goto L3a
                                    abza r2 = defpackage.abza.a
                                    java.lang.Class r3 = r5.getClass()
                                    abzj r2 = r2.a(r3)
                                    boolean r2 = r2.l(r5)
                                    if (r0 == r2) goto L32
                                    goto L33
                                L32:
                                    r1 = r5
                                L33:
                                    r0 = 2
                                    r5.cM(r0, r1)
                                    if (r2 == 0) goto L3a
                                    goto L44
                                L3a:
                                    abzz r5 = new abzz
                                    r5.<init>()
                                    abxv r5 = r5.a()
                                    throw r5
                                L44:
                                    aecs r5 = (defpackage.aecs) r5
                                    return r5
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.kbg.a(byte[]):java.lang.Object");
                            }
                        };
                        AtomicInteger atomicInteger = rgi.b;
                        rgd rgdVar = new rgd(rggVar, str, aecsVar, rgfVar);
                        rgiVar = (rgi) concurrentHashMap.putIfAbsent(str, rgdVar);
                        if (rgiVar == null) {
                            rgiVar = rgdVar;
                        }
                    }
                    list = ((aecs) rgiVar.b()).b;
                }
                ArrayList arrayList2 = new ArrayList();
                for (aecr aecrVar : list) {
                    if ((aecrVar.b & 1) == 0 || (i = aecrVar.c) == 0 || i == i2) {
                        arrayList2.add(aecrVar);
                    }
                }
                arrayList = arrayList2;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jys jysVar = (jys) this.l;
                    if (jysVar.b == 1) {
                        m(new Status(0, "The event was not logged due to sampling.", null, null));
                        LogErrorParcelable logErrorParcelable = new LogErrorParcelable(jyqVarA.k, 1006, 1);
                        kau kauVar = this.a;
                        if (aesh.c(kauVar.b)) {
                            kbc.b().c(logErrorParcelable);
                            return;
                        } else {
                            kauVar.d(new BatchedLogErrorParcelable(Arrays.asList(logErrorParcelable)));
                            return;
                        }
                    }
                    boolean z = jyqVarA instanceof jyv;
                    if (z) {
                        double d = jysVar.a;
                        if (d != 0.0d) {
                            aecc aeccVar2 = ((jyv) jyqVarA).b;
                            if ((aeccVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                aeccVar2.y();
                            }
                            aecd aecdVar = (aecd) aeccVar2.b;
                            aecdVar.b |= 67108864;
                            aecdVar.k = d;
                        }
                    }
                    try {
                        logEventParcelableC = jyqVarA.c();
                        if (z && (kabVar = ((jyv) jyqVarA).p) != null) {
                            aecd aecdVar2 = logEventParcelableC.l;
                            aecdVar2.getClass();
                            kabVar.a(aecdVar2.f);
                            logEventParcelableC.i = new LogVerifierResultParcelable(true);
                        }
                    } catch (RuntimeException e) {
                        Log.e("ClearcutLoggerApiImpl", "Error building the LogEventParcelable.", e);
                        logEventParcelableC = null;
                    }
                    if (logEventParcelableC == null) {
                        h(new Status(10, "MessageProducer", null, null));
                        return;
                    }
                    try {
                        ((kbb) kavVar.v()).e(new kar(this), logEventParcelableC);
                        kau kauVar2 = this.a;
                        Context context = kauVar2.b;
                        if (aesh.c(context)) {
                            kauVar2.d(kbc.b().a());
                        }
                        if (!aese.c(context) || kau.a.getAndSet(true)) {
                            return;
                        }
                        c();
                        return;
                    } catch (RemoteException | RuntimeException e2) {
                        if (e2 instanceof TransactionTooLargeException) {
                            Log.e("ClearcutLoggerApiImpl", "Log event caused a TransactionTooLargeException", e2);
                            LogErrorParcelable logErrorParcelable2 = new LogErrorParcelable(logEventParcelableC.a.f, 31004, 1);
                            kau kauVar3 = this.a;
                            if (aesh.c(kauVar3.b)) {
                                kbc.b().c(logErrorParcelable2);
                            } else {
                                kauVar3.d(new BatchedLogErrorParcelable(Arrays.asList(logErrorParcelable2)));
                            }
                        } else {
                            Log.w("ClearcutLoggerApiImpl", "logEvent exception", e2);
                            Context context2 = this.a.b;
                            if ((!aese.c(context2) || !kbf.c(context2).d(logEventParcelableC)) && aesh.c(context2)) {
                                kbc.b().c(new LogErrorParcelable(logEventParcelableC.a.f, 1003, 1));
                            }
                        }
                        throw e2;
                    }
                }
                aecr aecrVar2 = (aecr) it.next();
                String str2 = aecrVar2.d;
                Context context3 = ((kbh) jzyVar).e;
                if (mhv.g(context3)) {
                    jLongValue = 0;
                    j = 0;
                } else {
                    if (kbh.d != null) {
                        j = 0;
                    } else if (context3 != null) {
                        if (kbh.c == null) {
                            j = 0;
                            kbh.c = Boolean.valueOf(kmb.a.a(context3).a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
                        } else {
                            j = 0;
                        }
                        if (kbh.c.booleanValue()) {
                            kbh.d = Long.valueOf(lwy.c(context3.getContentResolver()));
                        } else {
                            kbh.d = Long.valueOf(j);
                        }
                    } else {
                        j = 0;
                        jLongValue = 0;
                    }
                    jLongValue = kbh.d.longValue();
                }
                if (str2 == null || str2.isEmpty()) {
                    byte[] bArrArray = ByteBuffer.allocate(8).putLong(jLongValue).array();
                    jA = kay.a(bArrArray, bArrArray.length);
                } else {
                    byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
                    byteBufferAllocate.put(bytes);
                    byteBufferAllocate.putLong(jLongValue);
                    byte[] bArrArray2 = byteBufferAllocate.array();
                    jA = kay.a(bArrArray2, bArrArray2.length);
                }
                long j2 = aecrVar2.e;
                long j3 = aecrVar2.f;
                if (j2 >= j && j3 > j) {
                    if ((jA >= j ? jA % j3 : (((Long.MAX_VALUE % j3) + 1) + ((jA & Long.MAX_VALUE) % j3)) % j3) >= j2) {
                        m(Status.a);
                        return;
                    }
                }
            }
        } catch (RuntimeException e3) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e3);
            h(new Status(10, "EventModifier", null, null));
        }
    }

    public final void c() {
        kau kauVar = this.a;
        final kbe kbeVarA = kbf.c(kauVar.b).a();
        if (kbeVarA == null) {
            kau.a.set(false);
            return;
        }
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: kaq
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) throws Exception {
                kat katVar = this.a;
                kbe kbeVar = kbeVarA;
                try {
                    ((kbb) ((kav) obj).v()).e(new kas(katVar, kbeVar), kbeVar.a);
                } catch (Exception e) {
                    try {
                        if (kbf.c(katVar.a.b).b() != null) {
                            kbc.b().c(new LogErrorParcelable(kbeVar.a.a.f, 1003, 1));
                        }
                        throw e;
                    } finally {
                        kau.a.set(false);
                    }
                }
            }
        };
        kauVar.g(2, kibVar.a());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kfc a(Status status) {
        return status;
    }
}
