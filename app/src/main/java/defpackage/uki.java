package defpackage;

import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.time.Instant;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uki implements unl {
    public final unl a;
    public final acpf b;
    public final ujs c;
    public final TimeUnit e;
    public final yqt f;
    public final yqt g;
    public zyd i;
    public final int k;
    private final zyh l;
    private final TimeUnit m;
    private final ExtensionRegistryLite n;
    public final zwv d = new zwv();
    public final Object h = new Object();
    public final ukh j = null;

    public uki(ukf ukfVar) {
        this.a = ukfVar.a;
        this.b = ukfVar.b;
        this.c = ukfVar.c;
        this.l = ukfVar.d;
        this.m = ukfVar.h;
        this.e = ukfVar.i;
        this.k = ukfVar.k;
        this.n = ukfVar.e;
        this.f = ukfVar.f;
        this.g = ukfVar.g;
    }

    @Override // defpackage.unl
    public final zvh a() {
        return new zvh() { // from class: ujw
            @Override // defpackage.zvh
            public final zyd a() {
                final uki ukiVar = this.a;
                return zuz.h(new umm((umt) ukiVar.a).a(), wyo.c(new zvi() { // from class: ukd
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        final uki ukiVar2 = ukiVar;
                        return uno.a(ukiVar2.a.h(new zvi() { // from class: ujv
                            @Override // defpackage.zvi
                            public final zyd a(Object obj2) {
                                int iA;
                                MessageLite messageLite = (MessageLite) obj2;
                                ujs ujsVar = ukiVar2.c;
                                if (!ujsVar.d().A()) {
                                    return zxn.h(messageLite);
                                }
                                boolean z = messageLite.g() > 0;
                                acil acilVar = acil.a;
                                acik acikVar = new acik();
                                if ((acikVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    acikVar.y();
                                }
                                acil acilVar2 = (acil) acikVar.b;
                                acilVar2.b |= 8;
                                acilVar2.f = z;
                                acil acilVar3 = (acil) acikVar.v();
                                try {
                                    int i = acilVar3.memoizedSerializedSize;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        iA = abza.a.a(acilVar3.getClass()).a(acilVar3);
                                        if (iA < 0) {
                                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                        }
                                    } else {
                                        iA = i & Integer.MAX_VALUE;
                                        if (iA == Integer.MAX_VALUE) {
                                            iA = abza.a.a(acilVar3.getClass()).a(acilVar3);
                                            if (iA < 0) {
                                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                            }
                                            acilVar3.memoizedSerializedSize = (acilVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                        }
                                    }
                                    byte[] bArr = new byte[iA];
                                    boolean z2 = abvz.e;
                                    abvw abvwVar = new abvw(bArr, 0, iA);
                                    abza.a.a(acilVar3.getClass()).m(acilVar3, abwa.a(abvwVar));
                                    abvk.a(abvwVar, bArr);
                                    return zxn.h(ujsVar.c());
                                } catch (IOException e) {
                                    throw new RuntimeException(a.u(acilVar3, " to a ByteString threw an IOException (should never happen)."), e);
                                }
                            }
                        }, zwk.a, umf.m));
                    }
                }), zwk.a);
            }
        };
    }

    public final void b() {
        synchronized (this.h) {
            zyd zydVar = this.i;
            if (zydVar != null) {
                zydVar.cancel(false);
            }
            this.i = zxn.s(wyo.b(new zvh() { // from class: ukb
                @Override // defpackage.zvh
                public final zyd a() {
                    Log.v("ProtoDataStoreWithLams", "performRpcSyncAndSaveResult()");
                    final uki ukiVar = this.a;
                    return ukiVar.d.b(wyo.b(new zvh() { // from class: ukc
                        @Override // defpackage.zvh
                        public final zyd a() {
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            final AtomicLong atomicLong = new AtomicLong(0L);
                            final uki ukiVar2 = ukiVar;
                            final zyd zydVarB = ((umt) ukiVar2.a).b();
                            zvi zviVarC = wyo.c(new zvi() { // from class: ujz
                                @Override // defpackage.zvi
                                public final zyd a(Object obj) throws abxv {
                                    acpn acpnVar;
                                    Log.v("ProtoDataStoreWithLams", "Calling syncSettings RPC");
                                    uki ukiVar3 = ukiVar2;
                                    acil acilVarC = ukiVar3.c();
                                    abzy abzyVar = acilVarC.h;
                                    if (abzyVar == null) {
                                        abzyVar = abzy.a;
                                    }
                                    yqt yqtVar = ukiVar3.f;
                                    if (yqtVar.g()) {
                                        yqt yqtVar2 = ukiVar3.g;
                                        if (yqtVar2.g()) {
                                            long jA = acbj.a(abzyVar);
                                            if (jA != 0 && Instant.now().toEpochMilli() < jA + TimeUnit.MILLISECONDS.convert(((Long) yqtVar.c()).longValue(), (TimeUnit) yqtVar2.c())) {
                                                atomicBoolean.set(true);
                                                return zxn.h(acpt.a);
                                            }
                                        }
                                    }
                                    acpp acppVar = acpp.a;
                                    acpk acpkVar = new acpk();
                                    int i = ukiVar3.k;
                                    if ((acpkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        acpkVar.y();
                                    }
                                    acpp acppVar2 = (acpp) acpkVar.b;
                                    int i2 = i - 1;
                                    if (i == 0) {
                                        throw null;
                                    }
                                    acppVar2.d = i2;
                                    acppVar2.b |= 2;
                                    ujs ujsVar = ukiVar3.c;
                                    HashSet<acph> hashSet = new HashSet(ujsVar.a());
                                    if (acilVarC.f) {
                                        for (Map.Entry entry : ujsVar.b().entrySet()) {
                                            acpo acpoVar = acpo.a;
                                            acpl acplVar = new acpl();
                                            acph acphVar = (acph) entry.getKey();
                                            if ((acplVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                acplVar.y();
                                            }
                                            acpo acpoVar2 = (acpo) acplVar.b;
                                            acphVar.getClass();
                                            acpoVar2.c = acphVar;
                                            acpoVar2.b |= 1;
                                            yqt yqtVar3 = (yqt) entry.getValue();
                                            abzy abzyVar2 = acilVarC.d;
                                            if (abzyVar2 == null) {
                                                abzyVar2 = abzy.a;
                                            }
                                            if (yqtVar3.g()) {
                                                acpn acpnVar2 = acpn.a;
                                                acpm acpmVar = new acpm();
                                                acpj acpjVar = (acpj) yqtVar3.c();
                                                acpi acpiVar = new acpi();
                                                acpiVar.B(acpjVar);
                                                if ((acpiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                    acpiVar.y();
                                                }
                                                acpj acpjVar2 = (acpj) acpiVar.b;
                                                abzyVar2.getClass();
                                                acpjVar2.c = abzyVar2;
                                                acpjVar2.b |= 2;
                                                if ((acpmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                    acpmVar.y();
                                                }
                                                acpn acpnVar3 = (acpn) acpmVar.b;
                                                acpj acpjVar3 = (acpj) acpiVar.v();
                                                acpjVar3.getClass();
                                                acpnVar3.c = acpjVar3;
                                                acpnVar3.b = 1;
                                                acpnVar = (acpn) acpmVar.v();
                                            } else {
                                                acpn acpnVar4 = acpn.a;
                                                acpm acpmVar2 = new acpm();
                                                if ((acpmVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                    acpmVar2.y();
                                                }
                                                acpn acpnVar5 = (acpn) acpmVar2.b;
                                                abzyVar2.getClass();
                                                acpnVar5.c = abzyVar2;
                                                acpnVar5.b = 2;
                                                acpnVar = (acpn) acpmVar2.v();
                                            }
                                            if ((acplVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                acplVar.y();
                                            }
                                            acpo acpoVar3 = (acpo) acplVar.b;
                                            acpnVar.getClass();
                                            acpoVar3.d = acpnVar;
                                            acpoVar3.b |= 2;
                                            acpkVar.a(acplVar);
                                            hashSet.remove(entry.getKey());
                                        }
                                    }
                                    for (acph acphVar2 : hashSet) {
                                        acpo acpoVar4 = acpo.a;
                                        acpl acplVar2 = new acpl();
                                        if ((acplVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            acplVar2.y();
                                        }
                                        acpo acpoVar5 = (acpo) acplVar2.b;
                                        acphVar2.getClass();
                                        acpoVar5.c = acphVar2;
                                        acpoVar5.b |= 1;
                                        acpkVar.a(acplVar2);
                                    }
                                    atomicLong.set(Instant.now().toEpochMilli());
                                    throw null;
                                }
                            });
                            zwk zwkVar = zwk.a;
                            final zyd zydVarH = zuz.h(zydVarB, zviVarC, zwkVar);
                            zxn.p(zydVarH, new uke(atomicBoolean), zwkVar);
                            return zuz.h(new zwd(yyk.n(new zyd[]{zydVarB, zydVarH}), true), wyo.c(new zvi() { // from class: uka
                                @Override // defpackage.zvi
                                public final zyd a(Object obj) {
                                    final acpt acptVar = (acpt) zxn.o(zydVarH);
                                    if (atomicBoolean.get()) {
                                        return zxy.a;
                                    }
                                    final AtomicLong atomicLong2 = atomicLong;
                                    final uki ukiVar3 = ukiVar2;
                                    return uno.a(ukiVar3.a.h(wyo.c(new zvi() { // from class: uju
                                        @Override // defpackage.zvi
                                        public final zyd a(Object obj2) throws abxv {
                                            int iA;
                                            uki ukiVar4 = ukiVar3;
                                            MessageLite messageLite = (MessageLite) obj2;
                                            acil acilVarC = ukiVar4.c();
                                            acil acilVarC2 = ukiVar4.c();
                                            if (acilVarC.c != acilVarC2.c) {
                                                Log.v("ProtoDataStoreWithLams", "Ignoring stale RPC response");
                                                return zxn.h(messageLite);
                                            }
                                            acpt acptVar2 = acptVar;
                                            ujs ujsVar = ukiVar4.c;
                                            abxs abxsVar = acptVar2.b;
                                            ujsVar.e();
                                            acik acikVar = new acik();
                                            acikVar.B(acilVarC2);
                                            if ((acikVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                acikVar.y();
                                            }
                                            acil acilVar = (acil) acikVar.b;
                                            acilVar.b &= -9;
                                            acilVar.f = false;
                                            if ((acikVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                acikVar.y();
                                            }
                                            ((acil) acikVar.b).g = abzb.b;
                                            abzy abzyVar = acptVar2.c;
                                            if (abzyVar == null) {
                                                abzyVar = abzy.a;
                                            }
                                            if ((acikVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                acikVar.y();
                                            }
                                            acil acilVar2 = (acil) acikVar.b;
                                            abzyVar.getClass();
                                            acilVar2.e = abzyVar;
                                            acilVar2.b |= 4;
                                            abxs abxsVar2 = acptVar2.b;
                                            if ((acikVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                acikVar.y();
                                            }
                                            acil acilVar3 = (acil) acikVar.b;
                                            abxs abxsVar3 = acilVar3.g;
                                            if (!abxsVar3.c()) {
                                                int size = abxsVar3.size();
                                                acilVar3.g = abxsVar3.d(size + size);
                                            }
                                            AtomicLong atomicLong3 = atomicLong2;
                                            abus.m(abxsVar2, acilVar3.g);
                                            abzy abzyVarC = acbj.c(atomicLong3.get());
                                            if ((acikVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                acikVar.y();
                                            }
                                            acil acilVar4 = (acil) acikVar.b;
                                            abzyVarC.getClass();
                                            acilVar4.h = abzyVarC;
                                            acilVar4.b |= 16;
                                            acil acilVar5 = (acil) acikVar.v();
                                            try {
                                                int i = acilVar5.memoizedSerializedSize;
                                                if ((i & Integer.MIN_VALUE) != 0) {
                                                    iA = abza.a.a(acilVar5.getClass()).a(acilVar5);
                                                    if (iA < 0) {
                                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                                    }
                                                } else {
                                                    iA = i & Integer.MAX_VALUE;
                                                    if (iA == Integer.MAX_VALUE) {
                                                        iA = abza.a.a(acilVar5.getClass()).a(acilVar5);
                                                        if (iA < 0) {
                                                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                                        }
                                                        acilVar5.memoizedSerializedSize = (acilVar5.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                                    }
                                                }
                                                abvo abvoVar = abvo.b;
                                                byte[] bArr = new byte[iA];
                                                boolean z = abvz.e;
                                                abvw abvwVar = new abvw(bArr, 0, iA);
                                                abza.a.a(acilVar5.getClass()).m(acilVar5, abwa.a(abvwVar));
                                                abvk.a(abvwVar, bArr);
                                                return zxn.h(ujsVar.c());
                                            } catch (IOException e) {
                                                throw new RuntimeException(a.u(acilVar5, " to a ByteString threw an IOException (should never happen)."), e);
                                            }
                                        }
                                    }), zwk.a, umf.m));
                                }
                            }), zwkVar);
                        }
                    }), zwk.a);
                }
            }), this.m, this.l);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r0 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.acil c() throws defpackage.abxv {
        /*
            r5 = this;
            ujs r0 = r5.c
            abvo r0 = r0.d()
            acil r1 = defpackage.acil.a
            abvt r0 = r0.k()
            acil r1 = new acil
            r1.<init>()
            com.google.protobuf.ExtensionRegistryLite r2 = r5.n
            abza r3 = defpackage.abza.a     // Catch: java.lang.RuntimeException -> L60 java.io.IOException -> L71 defpackage.abzz -> L87 defpackage.abxv -> L8d
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.RuntimeException -> L60 java.io.IOException -> L71 defpackage.abzz -> L87 defpackage.abxv -> L8d
            abzj r3 = r3.a(r4)     // Catch: java.lang.RuntimeException -> L60 java.io.IOException -> L71 defpackage.abzz -> L87 defpackage.abxv -> L8d
            abvu r4 = defpackage.abvu.p(r0)     // Catch: java.lang.RuntimeException -> L60 java.io.IOException -> L71 defpackage.abzz -> L87 defpackage.abxv -> L8d
            r3.i(r1, r4, r2)     // Catch: java.lang.RuntimeException -> L60 java.io.IOException -> L71 defpackage.abzz -> L87 defpackage.abxv -> L8d
            r3.g(r1)     // Catch: java.lang.RuntimeException -> L60 java.io.IOException -> L71 defpackage.abzz -> L87 defpackage.abxv -> L8d
            r2 = 0
            r0.z(r2)
            byte r0 = r1.i
            java.lang.Byte r3 = java.lang.Byte.valueOf(r0)
            r3.getClass()
            r3 = 1
            if (r0 != r3) goto L38
            goto L55
        L38:
            if (r0 == 0) goto L56
            abza r0 = defpackage.abza.a
            java.lang.Class r4 = r1.getClass()
            abzj r0 = r0.a(r4)
            boolean r0 = r0.l(r1)
            if (r3 == r0) goto L4c
            r4 = 0
            goto L4d
        L4c:
            r4 = r1
        L4d:
            if (r4 != 0) goto L50
            goto L51
        L50:
            r2 = r3
        L51:
            r1.i = r2
            if (r0 == 0) goto L56
        L55:
            return r1
        L56:
            abzz r0 = new abzz
            r0.<init>()
            abxv r0 = r0.a()
            throw r0
        L60:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof defpackage.abxv
            if (r1 == 0) goto L70
            java.lang.Throwable r0 = r0.getCause()
            abxv r0 = (defpackage.abxv) r0
            throw r0
        L70:
            throw r0
        L71:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof defpackage.abxv
            if (r1 == 0) goto L81
            java.lang.Throwable r0 = r0.getCause()
            abxv r0 = (defpackage.abxv) r0
            throw r0
        L81:
            abxv r1 = new abxv
            r1.<init>(r0)
            throw r1
        L87:
            r0 = move-exception
            abxv r0 = r0.a()
            throw r0
        L8d:
            r0 = move-exception
            boolean r1 = r0.a
            if (r1 == 0) goto L98
            abxv r1 = new abxv
            r1.<init>(r0)
            throw r1
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uki.c():acil");
    }

    @Override // defpackage.unl
    public final String f() {
        return ((umt) this.a).a;
    }

    @Override // defpackage.unl
    public final zyd h(final zvi zviVar, Executor executor, umc umcVar) {
        Log.v("ProtoDataStoreWithLams", "update()");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return zuz.g(this.a.h(wyo.c(new zvi() { // from class: ujt
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final MessageLite messageLite = (MessageLite) obj;
                zyd zydVarA = zviVar.a(messageLite);
                final uki ukiVar = this.a;
                final AtomicBoolean atomicBoolean2 = atomicBoolean;
                return zuz.h(zydVarA, wyo.c(new zvi() { // from class: ujy
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) throws abxv {
                        int iA;
                        MessageLite messageLite2 = messageLite;
                        if (messageLite2.equals((MessageLite) obj2)) {
                            atomicBoolean2.set(true);
                            return zxn.h(messageLite2);
                        }
                        uki ukiVar2 = ukiVar;
                        acil acilVarC = ukiVar2.c();
                        acik acikVar = new acik();
                        acikVar.B(acilVarC);
                        long j = acilVarC.c + 1;
                        if ((acikVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acikVar.y();
                        }
                        acil acilVar = (acil) acikVar.b;
                        acilVar.b |= 1;
                        acilVar.c = j;
                        abzy abzyVarC = acbj.c(Instant.now().toEpochMilli());
                        if ((acikVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acikVar.y();
                        }
                        acil acilVar2 = (acil) acikVar.b;
                        abzyVarC.getClass();
                        acilVar2.d = abzyVarC;
                        acilVar2.b |= 2;
                        if ((acikVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acikVar.y();
                        }
                        acil acilVar3 = (acil) acikVar.b;
                        acilVar3.b |= 8;
                        acilVar3.f = true;
                        acil acilVar4 = (acil) acikVar.v();
                        try {
                            int i = acilVar4.memoizedSerializedSize;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                iA = abza.a.a(acilVar4.getClass()).a(acilVar4);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA = i & Integer.MAX_VALUE;
                                if (iA == Integer.MAX_VALUE) {
                                    iA = abza.a.a(acilVar4.getClass()).a(acilVar4);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                    acilVar4.memoizedSerializedSize = (acilVar4.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                }
                            }
                            abvo abvoVar = abvo.b;
                            byte[] bArr = new byte[iA];
                            boolean z = abvz.e;
                            abvw abvwVar = new abvw(bArr, 0, iA);
                            abza.a.a(acilVar4.getClass()).m(acilVar4, abwa.a(abvwVar));
                            abvk.a(abvwVar, bArr);
                            return zxn.h(ukiVar2.c.c());
                        } catch (IOException e) {
                            throw new RuntimeException(a.u(acilVar4, " to a ByteString threw an IOException (should never happen)."), e);
                        }
                    }
                }), zwk.a);
            }
        }), executor, umf.m), wyo.a(new yqi() { // from class: ujx
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                MessageLite messageLite = (MessageLite) obj;
                if (!atomicBoolean.get()) {
                    this.a.b();
                }
                return messageLite;
            }
        }), zwk.a);
    }

    @Override // defpackage.unl
    public final zyd i(umb umbVar) {
        Log.v("ProtoDataStoreWithLams", "read()");
        return ((umt) this.a).b();
    }
}
