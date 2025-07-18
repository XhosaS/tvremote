package com.google.android.libraries.geller.portable;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.protos.assistant.portable.geller.GellerDeleteParams;
import defpackage.a;
import defpackage.abqb;
import defpackage.abre;
import defpackage.abvw;
import defpackage.abvz;
import defpackage.abwa;
import defpackage.abxl;
import defpackage.abxm;
import defpackage.abxs;
import defpackage.abza;
import defpackage.acbx;
import defpackage.acby;
import defpackage.acch;
import defpackage.acci;
import defpackage.accj;
import defpackage.acco;
import defpackage.accp;
import defpackage.accq;
import defpackage.accr;
import defpackage.accs;
import defpackage.acct;
import defpackage.accy;
import defpackage.acdh;
import defpackage.acdl;
import defpackage.acdt;
import defpackage.acdv;
import defpackage.acgd;
import defpackage.acge;
import defpackage.acoa;
import defpackage.acoi;
import defpackage.acoq;
import defpackage.acpe;
import defpackage.omw;
import defpackage.onm;
import defpackage.onn;
import defpackage.onp;
import defpackage.onw;
import defpackage.onx;
import defpackage.ooe;
import defpackage.wyo;
import defpackage.wzx;
import defpackage.yps;
import defpackage.ypv;
import defpackage.yqi;
import defpackage.yqt;
import defpackage.yqw;
import defpackage.yrn;
import defpackage.yrx;
import defpackage.yyk;
import defpackage.yyn;
import defpackage.yyr;
import defpackage.yzq;
import defpackage.zcg;
import defpackage.zdm;
import defpackage.zdv;
import defpackage.zdy;
import defpackage.zvi;
import defpackage.zxn;
import defpackage.zyd;
import defpackage.zyt;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Geller {
    public static final zdy a = zdy.h("com/google/android/libraries/geller/portable/Geller");
    public final Executor b;
    public final Executor c;
    public final Executor d;
    public final onp e;
    public final GellerLoggingCallback f;
    public final GellerStorageOperationsCallback g;
    public final acdh h;
    public final yqt i;
    public final boolean j = false;
    public final yyr k;
    private volatile long l;
    private final Map m;
    private final yyr n;

    public Geller(onn onnVar) {
        int iA;
        this.e = new GellerDatabaseManagerImpl(onnVar.a, onnVar.m, onnVar.h, onnVar.j, onnVar.k, onnVar.l);
        this.m = onnVar.f.a(true);
        GellerLoggingCallback gellerLoggingCallback = onnVar.g;
        this.f = gellerLoggingCallback;
        this.b = onnVar.b;
        this.c = onnVar.c;
        this.d = new zyt(onnVar.d);
        onw onwVar = new onw(this, onnVar.d);
        this.g = onwVar;
        GellerStorageChangeListenerHandler gellerStorageChangeListenerHandler = new GellerStorageChangeListenerHandler(yzq.o(onnVar.e), gellerLoggingCallback);
        acdh acdhVar = onnVar.m;
        try {
            int i = acdhVar.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(acdhVar.getClass()).a(acdhVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(acdhVar.getClass()).a(acdhVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    acdhVar.memoizedSerializedSize = (Integer.MIN_VALUE & acdhVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(acdhVar.getClass()).m(acdhVar, abwa.a(abvwVar));
            abvwVar.K();
            this.l = nativeCreate(onwVar, gellerStorageChangeListenerHandler, gellerLoggingCallback, bArr);
            this.h = onnVar.m;
            this.i = onnVar.n;
            Map map = onnVar.j;
            Map map2 = onnVar.l;
            yyn yynVar = new yyn(4);
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (((Map) entry.getValue()).values().iterator().hasNext()) {
                        yynVar.c((acgd) entry.getKey(), ((ooe) ((Map) entry.getValue()).values().iterator().next()).b());
                    }
                }
            }
            if (!map2.isEmpty()) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    yynVar.c((acgd) entry2.getKey(), ((ooe) entry2.getValue()).b());
                }
            }
            this.n = yynVar.a(true);
            this.k = onnVar.i;
        } catch (IOException e) {
            throw new RuntimeException(a.u(acdhVar, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    private native long nativeCreate(GellerStorageOperationsCallback gellerStorageOperationsCallback, GellerStorageChangeListenerHandler gellerStorageChangeListenerHandler, GellerLoggingCallback gellerLoggingCallback, byte[] bArr);

    public final long a() {
        long j = this.l;
        if (this.h.w && j == 0) {
            throw new IllegalStateException("Native Geller read after free");
        }
        return j;
    }

    public final GellerLoggingCallback b(acgd acgdVar) {
        GellerLoggingCallback gellerLoggingCallback = (GellerLoggingCallback) this.m.get(acgdVar);
        return gellerLoggingCallback == null ? this.f : gellerLoggingCallback;
    }

    public final yyk c(String str, acgd acgdVar, String str2) {
        boolean z;
        String[] strArrNativeReadMetadata;
        yrn yrnVarC = yrn.c(yps.a);
        try {
            try {
                strArrNativeReadMetadata = nativeReadMetadata(a(), this.e.a(str), acgdVar.name(), str2);
                z = true;
            } catch (GellerException e) {
                e = e;
                ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/libraries/geller/portable/Geller", "readMetadata", (char) 691, "Geller.java")).u("readMetadata called failed.");
                z = false;
                strArrNativeReadMetadata = null;
                if (strArrNativeReadMetadata == null) {
                }
                acgdVar.name();
                int i = yyk.e;
                return zcg.b;
            }
        } catch (GellerException e2) {
            e = e2;
        }
        if (strArrNativeReadMetadata == null && strArrNativeReadMetadata.length != 0) {
            b(acgdVar).p(acgdVar, yrnVarC.a(TimeUnit.MILLISECONDS), z);
            return yyk.n(strArrNativeReadMetadata);
        }
        acgdVar.name();
        int i2 = yyk.e;
        return zcg.b;
    }

    public final synchronized zyd d(final yzq yzqVar) {
        return zxn.j(wyo.h(new Runnable() { // from class: onl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f(yzqVar);
            }
        }), this.d);
    }

    public final void e(acgd acgdVar, String str, acoi acoiVar) {
        acoa acoaVar = acoiVar.c;
        if (acoaVar == null) {
            acoaVar = acoa.a;
        }
        if (acoaVar.c == 1) {
            acoa acoaVar2 = acoiVar.c;
            if (acoaVar2 == null) {
                acoaVar2 = acoa.a;
            }
            abxm abxmVar = (acoaVar2.c == 1 ? (acoq) acoaVar2.d : acoq.a).b;
            if (abxmVar.size() > 1) {
                Iterator it = abxmVar.iterator();
                while (it.hasNext()) {
                    b(acgdVar).f(acgdVar, str, (int) ((Long) it.next()).longValue());
                }
                return;
            } else if (abxmVar.size() == 1) {
                b(acgdVar).f(acgdVar, str, ((Long) abxmVar.get(0)).intValue());
                return;
            } else {
                b(acgdVar).g(acgdVar, str);
                return;
            }
        }
        acoa acoaVar3 = acoiVar.c;
        if (acoaVar3 == null) {
            acoaVar3 = acoa.a;
        }
        if (acoaVar3.c != 2) {
            b(acgdVar).g(acgdVar, str);
            return;
        }
        GellerLoggingCallback gellerLoggingCallbackB = b(acgdVar);
        acoa acoaVar4 = acoiVar.c;
        if (acoaVar4 == null) {
            acoaVar4 = acoa.a;
        }
        abre abreVar = acoaVar4.e;
        if (abreVar == null) {
            abreVar = abre.b;
        }
        gellerLoggingCallbackB.e(acgdVar, str, abreVar);
    }

    public final synchronized void f(yzq yzqVar) {
        this.e.c(yzqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zyd g(final String str, final acgd acgdVar, List list) {
        acby acbyVar;
        accr accrVar;
        GellerDeleteParams gellerDeleteParams = GellerDeleteParams.a;
        acch acchVar = new acch();
        if (list.isEmpty()) {
            if ((acchVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acchVar.y();
            }
            GellerDeleteParams gellerDeleteParams2 = (GellerDeleteParams) acchVar.b;
            gellerDeleteParams2.c = 4;
            gellerDeleteParams2.d = true;
        } else {
            accj accjVar = accj.a;
            acci acciVar = new acci();
            zdm zdmVarListIterator = ((yyk) list).listIterator(0);
            while (zdmVarListIterator.hasNext()) {
                omw omwVar = (omw) zdmVarListIterator.next();
                acby acbyVar2 = acby.a;
                acbx acbxVar = new acbx();
                String strB = omwVar.b();
                if ((acbxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acbxVar.y();
                }
                acby acbyVar3 = (acby) acbxVar.b;
                acbyVar3.b |= 2;
                acbyVar3.d = strB;
                if (omwVar.a().g()) {
                    long jLongValue = ((Long) omwVar.a().c()).longValue();
                    if ((acbxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acbxVar.y();
                    }
                    acby acbyVar4 = (acby) acbxVar.b;
                    acbyVar4.b |= 1;
                    acbyVar4.c = jLongValue;
                    acbyVar = (acby) acbxVar.v();
                } else {
                    acbyVar = (acby) acbxVar.v();
                }
                if ((acciVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acciVar.y();
                }
                accj accjVar2 = (accj) acciVar.b;
                acbyVar.getClass();
                abxs abxsVar = accjVar2.b;
                if (!abxsVar.c()) {
                    int size = abxsVar.size();
                    accjVar2.b = abxsVar.d(size + size);
                }
                accjVar2.b.add(acbyVar);
            }
            if ((acchVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acchVar.y();
            }
            GellerDeleteParams gellerDeleteParams3 = (GellerDeleteParams) acchVar.b;
            accj accjVar3 = (accj) acciVar.v();
            accjVar3.getClass();
            gellerDeleteParams3.d = accjVar3;
            gellerDeleteParams3.c = 1;
        }
        final GellerDeleteParams gellerDeleteParams4 = (GellerDeleteParams) acchVar.v();
        yqw.M(true, "delete() not allowed if Geller is read-only");
        yqw.M(true, "delete() not allowed if a blocking executor is not specified");
        yrx yrxVar = yps.a;
        yrn.c(yrxVar);
        final yrn yrnVar = new yrn(yrxVar);
        Callable callable = new Callable() { // from class: ong
            @Override // java.util.concurrent.Callable
            public final Object call() throws GellerException {
                int iA;
                GellerDeleteParams gellerDeleteParams5 = gellerDeleteParams4;
                Geller geller = this.a;
                onp onpVar = geller.e;
                String str2 = str;
                if (onpVar.b(str2) == null) {
                    throw new GellerException(abqb.UNKNOWN, "Geller instance is null.");
                }
                acgd acgdVar2 = acgdVar;
                yrn yrnVar2 = yrnVar;
                yrnVar2.e();
                long jA = geller.a();
                long jA2 = onpVar.a(str2);
                String strName = acgdVar2.name();
                try {
                    int i = gellerDeleteParams5.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(gellerDeleteParams5.getClass()).a(gellerDeleteParams5);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(gellerDeleteParams5.getClass()).a(gellerDeleteParams5);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            gellerDeleteParams5.memoizedSerializedSize = (Integer.MIN_VALUE & gellerDeleteParams5.memoizedSerializedSize) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(gellerDeleteParams5.getClass()).m(gellerDeleteParams5, abwa.a(abvwVar));
                    abvwVar.K();
                    long jNativeDelete = geller.nativeDelete(jA, jA2, strName, bArr);
                    yrnVar2.f();
                    return Long.valueOf(jNativeDelete);
                } catch (IOException e) {
                    throw new RuntimeException(a.u(gellerDeleteParams5, " to a byte array threw an IOException (should never happen)."), e);
                }
            }
        };
        Executor executor = this.d;
        wzx wzxVarH = wzx.g(zxn.k(wyo.i(callable), executor)).e(GellerException.class, new zvi() { // from class: onh
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return zxn.g((GellerException) obj);
            }
        }, executor).h(new yqi() { // from class: oni
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (Long) obj;
            }
        }, executor);
        if (!this.h.f) {
            accs accsVar = accs.a;
            accp accpVar = new accp();
            if ((accpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                accpVar.y();
            }
            accs accsVar2 = (accs) accpVar.b;
            accsVar2.c = acgdVar.dE;
            accsVar2.b |= 1;
            zdm zdmVarListIterator2 = ((yyk) list).listIterator(0);
            while (zdmVarListIterator2.hasNext()) {
                omw omwVar2 = (omw) zdmVarListIterator2.next();
                accr accrVar2 = accr.a;
                accq accqVar = new accq();
                String strB2 = omwVar2.b();
                if ((accqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    accqVar.y();
                }
                accr accrVar3 = (accr) accqVar.b;
                accrVar3.b |= 2;
                accrVar3.d = strB2;
                if (omwVar2.a().g()) {
                    long jLongValue2 = ((Long) omwVar2.a().c()).longValue();
                    if ((accqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        accqVar.y();
                    }
                    accr accrVar4 = (accr) accqVar.b;
                    accrVar4.b |= 1;
                    accrVar4.c = jLongValue2;
                    accrVar = (accr) accqVar.v();
                } else {
                    accrVar = (accr) accqVar.v();
                }
                if ((accpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    accpVar.y();
                }
                accs accsVar3 = (accs) accpVar.b;
                accrVar.getClass();
                abxs abxsVar2 = accsVar3.d;
                if (!abxsVar2.c()) {
                    int size2 = abxsVar2.size();
                    accsVar3.d = abxsVar2.d(size2 + size2);
                }
                accsVar3.d.add(accrVar);
            }
            acct acctVar = acct.a;
            acco accoVar = new acco();
            if ((accoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                accoVar.y();
            }
            acct acctVar2 = (acct) accoVar.b;
            accs accsVar4 = (accs) accpVar.v();
            accsVar4.getClass();
            abxs abxsVar3 = acctVar2.b;
            if (!abxsVar3.c()) {
                int size3 = abxsVar3.size();
                acctVar2.b = abxsVar3.d(size3 + size3);
            }
            acctVar2.b.add(accsVar4);
            zxn.p(wzxVarH, wyo.f(new onm(this, str, (acct) accoVar.v())), this.c);
        }
        return wzxVarH;
    }

    public final zyd h(final String str, final acgd acgdVar, final acdt acdtVar, final acpe acpeVar, final acoi acoiVar) {
        zyd zydVarK;
        final yrn yrnVarC = yrn.c(yps.a);
        yyr yyrVar = this.n;
        yqt yqtVarI = yyrVar.containsKey(acgdVar) ? yqt.i((acge) yyrVar.get(acgdVar)) : ypv.a;
        boolean z = false;
        if (yqtVarI.g()) {
            if (((acge) yqtVarI.c()).equals(acge.CUSTOM_STORAGE_TYPE_PROTODATASTORE)) {
                z = true;
            }
        }
        Boolean.valueOf(z).getClass();
        if (z) {
            zydVarK = zxn.k(wyo.i(new Callable() { // from class: onb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.i(str, acgdVar, acdtVar, acpeVar, acoiVar);
                }
            }), this.d);
        } else {
            zydVarK = zxn.k(wyo.i(new Callable() { // from class: onc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.i(str, acgdVar, acdtVar, acpeVar, acoiVar);
                }
            }), this.c);
        }
        acoa acoaVar = acoiVar.c;
        if (acoaVar == null) {
            acoaVar = acoa.a;
        }
        if (!acoaVar.f) {
            accy accyVar = this.h.n;
            if (accyVar == null) {
                accyVar = accy.d;
            }
            if (new abxl(accyVar.g, accy.c).contains(acgdVar) || new abxl(accyVar.f, accy.b).contains(acgdVar) || new abxl(accyVar.e, accy.a).contains(acgdVar)) {
                zydVarK = wzx.g(zydVarK).i(new zvi() { // from class: ond
                    /* JADX WARN: Type inference failed for: r4v1, types: [aehf, java.lang.Object] */
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        int i;
                        yyk yykVarF;
                        int i2;
                        int i3;
                        final Geller geller = this.a;
                        final acdv acdvVar = (acdv) obj;
                        final acgd acgdVar2 = acgdVar;
                        yqt yqtVar = geller.i;
                        if (!yqtVar.g()) {
                            ((zdv) ((zdv) Geller.a.d()).q("com/google/android/libraries/geller/portable/Geller", "maybeApplyDmaFiltering", 2013, "Geller.java")).x("Policy evaluator absent when evaluating %s", acgdVar2.name());
                            return zxn.h(acdvVar);
                        }
                        absv absvVar = (absv) yqtVar.c().a();
                        accy accyVar2 = geller.h.n;
                        if (accyVar2 == null) {
                            accyVar2 = accy.d;
                        }
                        int i4 = Integer.MIN_VALUE;
                        if (new abxl(accyVar2.g, accy.c).contains(acgdVar2) || new abxl(accyVar2.f, accy.b).contains(acgdVar2)) {
                            i = Integer.MIN_VALUE;
                            String str2 = str;
                            abud abudVar = abud.a;
                            abuc abucVar = new abuc();
                            if (!str2.isEmpty()) {
                                abto abtoVar = abto.a;
                                abtn abtnVar = new abtn();
                                if ((abtnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    abtnVar.y();
                                }
                                abto abtoVar2 = (abto) abtnVar.b;
                                str2.getClass();
                                abtoVar2.b |= 2;
                                abtoVar2.c = str2;
                                if ((abucVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    abucVar.y();
                                }
                                abud abudVar2 = (abud) abucVar.b;
                                abto abtoVar3 = (abto) abtnVar.v();
                                abtoVar3.getClass();
                                abudVar2.c = abtoVar3;
                                abudVar2.b |= 1;
                            }
                            acoi acoiVar2 = acoiVar;
                            abub abubVar = abub.a;
                            abua abuaVar = new abua();
                            acoa acoaVar2 = acoiVar2.c;
                            if (acoaVar2 == null) {
                                acoaVar2 = acoa.a;
                            }
                            Iterator it = (acoaVar2.c == 1 ? (acoq) acoaVar2.d : acoq.a).b.iterator();
                            while (it.hasNext()) {
                                abuaVar.a(((Long) it.next()).intValue());
                            }
                            abqx abqxVar = abqx.a;
                            abqq abqqVar = new abqq();
                            abqs abqsVar = abqs.a;
                            abqr abqrVar = new abqr();
                            acoa acoaVar3 = acoiVar2.c;
                            if (acoaVar3 == null) {
                                acoaVar3 = acoa.a;
                            }
                            abre abreVar = acoaVar3.e;
                            if (abreVar == null) {
                                abreVar = abre.b;
                            }
                            if ((abqrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                abqrVar.y();
                            }
                            abqs abqsVar2 = (abqs) abqrVar.b;
                            abreVar.getClass();
                            abxs abxsVar = abqsVar2.b;
                            if (!abxsVar.c()) {
                                int size = abxsVar.size();
                                abqsVar2.b = abxsVar.d(size + size);
                            }
                            abqsVar2.b.add(abreVar);
                            if ((abqqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                abqqVar.y();
                            }
                            abqx abqxVar2 = (abqx) abqqVar.b;
                            abqs abqsVar3 = (abqs) abqrVar.v();
                            abqsVar3.getClass();
                            abqxVar2.c = abqsVar3;
                            abqxVar2.b = 4;
                            abqx abqxVar3 = (abqx) abqqVar.v();
                            if ((abuaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                abuaVar.y();
                            }
                            abub abubVar2 = (abub) abuaVar.b;
                            abqxVar3.getClass();
                            abubVar2.c = abqxVar3;
                            abubVar2.b |= 1;
                            abtx abtxVar = abtx.a;
                            abtw abtwVar = new abtw();
                            if ((abtwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                abtwVar.y();
                            }
                            abtx abtxVar2 = (abtx) abtwVar.b;
                            abub abubVar3 = (abub) abuaVar.v();
                            abubVar3.getClass();
                            abtxVar2.c = abubVar3;
                            abtxVar2.b |= 1;
                            abtx abtxVar3 = (abtx) abtwVar.v();
                            int i5 = yyk.e;
                            yyf yyfVar = new yyf(4);
                            for (acgi acgiVar : acdvVar.c) {
                                abrj abrjVar = abrj.a;
                                abri abriVar = new abri();
                                if ((acgiVar.b & 16) != 0) {
                                    abtq abtqVar = acgiVar.f;
                                    if (abtqVar == null) {
                                        abtqVar = abtq.a;
                                    }
                                    if ((abriVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        abriVar.y();
                                    }
                                    abrj abrjVar2 = (abrj) abriVar.b;
                                    abtqVar.getClass();
                                    abrjVar2.c = abtqVar;
                                    abrjVar2.b |= 1;
                                }
                                abud abudVar3 = (abud) abucVar.v();
                                if ((abriVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    abriVar.y();
                                }
                                abrj abrjVar3 = (abrj) abriVar.b;
                                abudVar3.getClass();
                                abrjVar3.d = abudVar3;
                                abrjVar3.b |= 2;
                                if ((abriVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    abriVar.y();
                                }
                                abrj abrjVar4 = (abrj) abriVar.b;
                                abtxVar3.getClass();
                                abrjVar4.e = abtxVar3;
                                abrjVar4.b |= 4;
                                yyfVar.g((abrj) abriVar.v());
                            }
                            yykVarF = yyfVar.f();
                        } else {
                            int i6 = yyk.e;
                            yyf yyfVar2 = new yyf(4);
                            for (acgi acgiVar2 : acdvVar.c) {
                                abrj abrjVar5 = abrj.a;
                                abri abriVar2 = new abri();
                                abxk abxkVar = abtv.a;
                                abtu abtuVar = new abtu();
                                if ((abtuVar.b.memoizedSerializedSize & i4) == 0) {
                                    abtuVar.y();
                                }
                                abtv abtvVar = (abtv) abtuVar.b;
                                abtvVar.c |= 8;
                                abtvVar.g = 79541012;
                                abtv abtvVar2 = (abtv) abtuVar.v();
                                acqg acqgVar = acqg.a;
                                acqf acqfVar = new acqf();
                                if ((acqfVar.b.memoizedSerializedSize & i4) == 0) {
                                    acqfVar.y();
                                }
                                acqg acqgVar2 = (acqg) acqfVar.b;
                                acqgVar2.e = 48;
                                acqgVar2.b |= 16384;
                                if ((abtvVar2.c & 1) != 0) {
                                    long j = abtvVar2.d;
                                    if ((acqfVar.b.memoizedSerializedSize & i4) == 0) {
                                        acqfVar.y();
                                    }
                                    acqg acqgVar3 = (acqg) acqfVar.b;
                                    i2 = i4;
                                    acqgVar3.b |= 32768;
                                    acqgVar3.f = j;
                                } else {
                                    i2 = i4;
                                }
                                if ((abtvVar2.c & 8) != 0) {
                                    int i7 = abtvVar2.g;
                                    if ((acqfVar.b.memoizedSerializedSize & i2) == 0) {
                                        acqfVar.y();
                                    }
                                    acqg acqgVar4 = (acqg) acqfVar.b;
                                    acqgVar4.c |= 4096;
                                    acqgVar4.h = i7;
                                }
                                if (!abtvVar2.h.isEmpty()) {
                                    abxj abxjVar = abtvVar2.h;
                                    if ((acqfVar.b.memoizedSerializedSize & i2) == 0) {
                                        acqfVar.y();
                                    }
                                    acqg acqgVar5 = (acqg) acqfVar.b;
                                    abxj abxjVar2 = acqgVar5.i;
                                    if (!abxjVar2.c()) {
                                        int size2 = abxjVar2.size();
                                        acqgVar5.i = abxjVar2.d(size2 + size2);
                                    }
                                    abus.m(abxjVar, acqgVar5.i);
                                }
                                abxj abxjVar3 = abtvVar2.i;
                                abxk abxkVar2 = abtv.a;
                                if (!new abxl(abxjVar3, abxkVar2).isEmpty()) {
                                    abxl abxlVar = new abxl(abtvVar2.i, abxkVar2);
                                    if ((acqfVar.b.memoizedSerializedSize & i2) == 0) {
                                        acqfVar.y();
                                    }
                                    acqg acqgVar6 = (acqg) acqfVar.b;
                                    abxj abxjVar4 = acqgVar6.j;
                                    if (!abxjVar4.c()) {
                                        int size3 = abxjVar4.size();
                                        acqgVar6.j = abxjVar4.d(size3 + size3);
                                    }
                                    Iterator<E> it2 = abxlVar.iterator();
                                    while (it2.hasNext()) {
                                        acqgVar6.j.h(((abqp) it2.next()).a());
                                    }
                                }
                                if ((abtvVar2.c & 64) != 0) {
                                    boolean z2 = abtvVar2.j;
                                    if ((acqfVar.b.memoizedSerializedSize & i2) == 0) {
                                        acqfVar.y();
                                    }
                                    acqg acqgVar7 = (acqg) acqfVar.b;
                                    acqgVar7.c |= 1048576;
                                    acqgVar7.n = z2;
                                }
                                if ((abtvVar2.c & 2) != 0) {
                                    long j2 = abtvVar2.e;
                                    if ((acqfVar.b.memoizedSerializedSize & i2) == 0) {
                                        acqfVar.y();
                                    }
                                    acqg acqgVar8 = (acqg) acqfVar.b;
                                    i3 = 65536;
                                    acqgVar8.b |= 65536;
                                    acqgVar8.g = j2;
                                } else {
                                    i3 = 65536;
                                }
                                if ((abtvVar2.c & 4) != 0) {
                                    String str3 = abtvVar2.f;
                                    if ((acqfVar.b.memoizedSerializedSize & i2) == 0) {
                                        acqfVar.y();
                                    }
                                    acqg acqgVar9 = (acqg) acqfVar.b;
                                    str3.getClass();
                                    acqgVar9.b |= 256;
                                    acqgVar9.d = str3;
                                }
                                if ((abtvVar2.c & 256) != 0) {
                                    boolean z3 = abtvVar2.k;
                                    if ((acqfVar.b.memoizedSerializedSize & i2) == 0) {
                                        acqfVar.y();
                                    }
                                    acqg acqgVar10 = (acqg) acqfVar.b;
                                    acqgVar10.c |= 262144;
                                    acqgVar10.m = z3;
                                }
                                if ((abtvVar2.c & 512) != 0) {
                                    boolean z4 = abtvVar2.l;
                                    if ((acqfVar.b.memoizedSerializedSize & i2) == 0) {
                                        acqfVar.y();
                                    }
                                    acqg acqgVar11 = (acqg) acqfVar.b;
                                    acqgVar11.c |= i3;
                                    acqgVar11.k = z4;
                                }
                                if ((abtvVar2.c & 1024) != 0) {
                                    int iA = abtm.a(abtvVar2.m);
                                    if (iA == 0) {
                                        iA = 1;
                                    }
                                    if ((acqfVar.b.memoizedSerializedSize & i2) == 0) {
                                        acqfVar.y();
                                    }
                                    acqg acqgVar12 = (acqg) acqfVar.b;
                                    acqgVar12.l = iA - 1;
                                    acqgVar12.c |= 131072;
                                }
                                abrn abrnVar = abrn.a;
                                abrm abrmVar = new abrm();
                                acqi acqiVar = acqi.a;
                                acqh acqhVar = new acqh();
                                if ((acqhVar.b.memoizedSerializedSize & i2) == 0) {
                                    acqhVar.y();
                                }
                                acqi acqiVar2 = (acqi) acqhVar.b;
                                acqg acqgVar13 = (acqg) acqfVar.v();
                                acqgVar13.getClass();
                                acqiVar2.c = acqgVar13;
                                acqiVar2.b |= 1;
                                if ((abrmVar.b.memoizedSerializedSize & i2) == 0) {
                                    abrmVar.y();
                                }
                                abrn abrnVar2 = (abrn) abrmVar.b;
                                acqi acqiVar3 = (acqi) acqhVar.v();
                                acqiVar3.getClass();
                                abrnVar2.c = acqiVar3;
                                abrnVar2.b |= 1;
                                abrn abrnVar3 = (abrn) abrmVar.v();
                                abtq abtqVar2 = abtq.a;
                                abtp abtpVar = new abtp();
                                abtpVar.f(abrl.b, abrnVar3);
                                abtq abtqVar3 = (abtq) abtpVar.v();
                                if ((abriVar2.b.memoizedSerializedSize & i2) == 0) {
                                    abriVar2.y();
                                }
                                abrj abrjVar6 = (abrj) abriVar2.b;
                                abtqVar3.getClass();
                                abrjVar6.c = abtqVar3;
                                abrjVar6.b |= 1;
                                abud abudVar4 = abud.a;
                                if ((abriVar2.b.memoizedSerializedSize & i2) == 0) {
                                    abriVar2.y();
                                }
                                abrj abrjVar7 = (abrj) abriVar2.b;
                                abudVar4.getClass();
                                abrjVar7.d = abudVar4;
                                abrjVar7.b |= 2;
                                abtx abtxVar4 = abtx.a;
                                abtw abtwVar2 = new abtw();
                                abub abubVar4 = abub.a;
                                abua abuaVar2 = new abua();
                                abuaVar2.a(79508299);
                                if ((abtwVar2.b.memoizedSerializedSize & i2) == 0) {
                                    abtwVar2.y();
                                }
                                abtx abtxVar5 = (abtx) abtwVar2.b;
                                abub abubVar5 = (abub) abuaVar2.v();
                                abubVar5.getClass();
                                abtxVar5.c = abubVar5;
                                abtxVar5.b |= 1;
                                abtx abtxVar6 = (abtx) abtwVar2.v();
                                if ((abriVar2.b.memoizedSerializedSize & i2) == 0) {
                                    abriVar2.y();
                                }
                                abrj abrjVar8 = (abrj) abriVar2.b;
                                abtxVar6.getClass();
                                abrjVar8.e = abtxVar6;
                                abrjVar8.b |= 4;
                                yyfVar2.g((abrj) abriVar2.v());
                                i4 = i2;
                            }
                            i = i4;
                            yykVarF = yyfVar2.f();
                        }
                        abts abtsVar = abts.a;
                        abtr abtrVar = new abtr();
                        abun abunVar = absu.a;
                        if ((abtrVar.b.memoizedSerializedSize & i) == 0) {
                            abtrVar.y();
                        }
                        abts abtsVar2 = (abts) abtrVar.b;
                        abunVar.getClass();
                        abxs abxsVar2 = abtsVar2.b;
                        if (!abxsVar2.c()) {
                            int size4 = abxsVar2.size();
                            abtsVar2.b = abxsVar2.d(size4 + size4);
                        }
                        abtsVar2.b.add(abunVar);
                        return wzx.g(absvVar.a(yykVarF, (abts) abtrVar.v())).i(new zvi() { // from class: onj
                            @Override // defpackage.zvi
                            public final zyd a(Object obj2) {
                                yyk yykVar = (yyk) obj2;
                                acdv acdvVar2 = acdv.a;
                                acdu acduVar = new acdu();
                                acdv acdvVar3 = acdvVar;
                                aces acesVar = acdvVar3.d;
                                if (acesVar == null) {
                                    acesVar = aces.a;
                                }
                                if ((acduVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    acduVar.y();
                                }
                                acdv acdvVar4 = (acdv) acduVar.b;
                                acesVar.getClass();
                                acdvVar4.d = acesVar;
                                acdvVar4.b |= 1;
                                if (yykVar.size() != acdvVar3.c.size()) {
                                    return zxn.g(new GellerException(abqb.UNKNOWN, "PolicyEvaluator.canForwardBatch response size does not match the request size."));
                                }
                                for (int i8 = 0; i8 < yykVar.size(); i8++) {
                                    if (((abtz) yykVar.get(i8)).c) {
                                        acgi acgiVar3 = (acgi) acdvVar3.c.get(i8);
                                        if ((acduVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            acduVar.y();
                                        }
                                        acdv acdvVar5 = (acdv) acduVar.b;
                                        acgiVar3.getClass();
                                        abxs abxsVar3 = acdvVar5.c;
                                        if (!abxsVar3.c()) {
                                            int size5 = abxsVar3.size();
                                            acdvVar5.c = abxsVar3.d(size5 + size5);
                                        }
                                        acdvVar5.c.add(acgiVar3);
                                    }
                                }
                                Iterator it3 = acdvVar3.c.iterator();
                                int i9 = 0;
                                while (it3.hasNext()) {
                                    if ((((acgi) it3.next()).b & 16) != 0) {
                                        i9++;
                                    }
                                }
                                acgd acgdVar3 = acgdVar2;
                                Geller geller2 = geller;
                                geller2.b(acgdVar3).i(acgdVar3.name(), true, i9);
                                geller2.b(acgdVar3).i(acgdVar3.name(), false, acdvVar3.c.size() - i9);
                                geller2.b(acgdVar3).d(acgdVar3.name(), "DMA_ENFORCEMENT_SUCCESS", ((acdv) acduVar.b).c.size());
                                geller2.b(acgdVar3).h(acgdVar3.name(), "DMA_ENFORCEMENT_SUCCESS", ((acdv) acduVar.b).c.size());
                                geller2.b(acgdVar3).d(acgdVar3.name(), "DMA_ENFORCEMENT_TOTAL", acdvVar3.c.size());
                                geller2.b(acgdVar3).h(acgdVar3.name(), "DMA_ENFORCEMENT_TOTAL", acdvVar3.c.size());
                                accy accyVar3 = geller2.h.n;
                                if (accyVar3 == null) {
                                    accyVar3 = accy.d;
                                }
                                return !new abxl(accyVar3.g, accy.c).contains(acgdVar3) ? zxn.h(acdvVar3) : zxn.h((acdv) acduVar.v());
                            }
                        }, geller.b);
                    }
                }, this.b);
            }
        }
        wzx wzxVarG = wzx.g(zydVarK);
        zvi zviVar = new zvi() { // from class: omz
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                Geller geller = this.a;
                yrn yrnVar = yrnVarC;
                acgd acgdVar2 = acgdVar;
                geller.b(acgdVar2).q(acgdVar2, false, yrnVar.a(TimeUnit.MILLISECONDS));
                return zxn.g((GellerException) obj);
            }
        };
        Executor executor = this.c;
        return wzxVarG.e(GellerException.class, zviVar, executor).h(new yqi() { // from class: ona
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                Geller geller = this.a;
                yrn yrnVar = yrnVarC;
                acgd acgdVar2 = acgdVar;
                acdv acdvVar = (acdv) obj;
                geller.b(acgdVar2).q(acgdVar2, true, yrnVar.a(TimeUnit.MILLISECONDS));
                return acdvVar;
            }
        }, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0, types: [acoi] */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v5 */
    public final acdv i(String str, acgd acgdVar, acdt acdtVar, acpe acpeVar, acoi acoiVar) throws GellerException {
        Geller geller;
        int iA;
        String str2;
        int i;
        int iA2;
        String str3;
        int iA3;
        GellerLoggingCallback gellerLoggingCallbackB;
        int iA4;
        acgd acgdVar2 = acgdVar;
        yrn yrnVarC = yrn.c(yps.a);
        e(acgdVar2, "read_element", acoiVar);
        acdv acdvVar = acdv.a;
        try {
            try {
                long jA = a();
                long jA2 = this.e.a(str);
                String strName = acgdVar2.name();
                try {
                    i = acdtVar.memoizedSerializedSize;
                } catch (IOException e) {
                    e = e;
                    str2 = "byte array";
                }
                if ((i & Integer.MIN_VALUE) == 0) {
                    iA2 = i & Integer.MAX_VALUE;
                    if (iA2 == Integer.MAX_VALUE) {
                        iA2 = abza.a.a(acdtVar.getClass()).a(acdtVar);
                        if (iA2 >= 0) {
                            acdtVar.memoizedSerializedSize = (acdtVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                        } else {
                            str2 = "byte array";
                            try {
                                throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                            } catch (IOException e2) {
                                e = e2;
                            }
                        }
                    }
                    throw new RuntimeException(a.C(acdtVar, str2), e);
                }
                iA2 = abza.a.a(acdtVar.getClass()).a(acdtVar);
                if (iA2 < 0) {
                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                }
                try {
                    byte[] bArr = new byte[iA2];
                    boolean z = abvz.e;
                    acoiVar = -2147483648;
                    try {
                        try {
                            abvw abvwVar = new abvw(bArr, 0, iA2);
                            abza.a.a(acdtVar.getClass()).m(acdtVar, abwa.a(abvwVar));
                            abvwVar.K();
                            try {
                                int i2 = acpeVar.memoizedSerializedSize;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    iA3 = abza.a.a(acpeVar.getClass()).a(acpeVar);
                                    if (iA3 < 0) {
                                        throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                    }
                                } else {
                                    iA3 = i2 & Integer.MAX_VALUE;
                                    if (iA3 == Integer.MAX_VALUE) {
                                        iA3 = abza.a.a(acpeVar.getClass()).a(acpeVar);
                                        if (iA3 < 0) {
                                            str3 = "byte array";
                                            try {
                                                throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                            } catch (IOException e3) {
                                                e = e3;
                                                throw new RuntimeException(a.C(acpeVar, str3), e);
                                            }
                                        }
                                        acpeVar.memoizedSerializedSize = (acpeVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA3;
                                    }
                                }
                                str3 = "byte array";
                            } catch (IOException e4) {
                                e = e4;
                                str3 = "byte array";
                            }
                            try {
                                byte[] bArr2 = new byte[iA3];
                                abvw abvwVar2 = new abvw(bArr2, 0, iA3);
                                abza.a.a(acpeVar.getClass()).m(acpeVar, abwa.a(abvwVar2));
                                abvwVar2.K();
                                byte[] bArrNativeReadElements = nativeReadElements(jA, jA2, strName, bArr, bArr2);
                                geller = this;
                                int length = bArrNativeReadElements.length;
                                if (length > 5000000) {
                                    throw new GellerException(abqb.UNKNOWN, String.format("Result of read exceeded maximum read result size.  The size of the result was: %s, and the maximum size is: %s.", Integer.valueOf(length), 5000000L));
                                }
                                acdv acdvVar2 = (acdv) onx.a(bArrNativeReadElements, acdv.a);
                                try {
                                    gellerLoggingCallbackB = geller.b(acgdVar2);
                                    int i3 = acdvVar2.memoizedSerializedSize;
                                    if ((i3 & Integer.MIN_VALUE) != 0) {
                                        iA4 = abza.a.a(acdvVar2.getClass()).a(acdvVar2);
                                        if (iA4 < 0) {
                                            throw new IllegalStateException(a.b(iA4, "serialized size must be non-negative, was "));
                                        }
                                    } else {
                                        iA4 = i3 & Integer.MAX_VALUE;
                                        if (iA4 == Integer.MAX_VALUE) {
                                            iA4 = abza.a.a(acdvVar2.getClass()).a(acdvVar2);
                                            if (iA4 < 0) {
                                                throw new IllegalStateException(a.b(iA4, "serialized size must be non-negative, was "));
                                            }
                                            acdvVar2.memoizedSerializedSize = (acdvVar2.memoizedSerializedSize & Integer.MIN_VALUE) | iA4;
                                        }
                                    }
                                } catch (GellerException e5) {
                                    e = e5;
                                }
                                try {
                                    gellerLoggingCallbackB.o(acgdVar2, true, iA4, yrnVarC.a(TimeUnit.MILLISECONDS));
                                    return acdvVar2;
                                } catch (GellerException e6) {
                                    e = e6;
                                    acgdVar2 = acgdVar2;
                                    acdvVar = acdvVar2;
                                    ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/Geller", "readElementInternal", (char) 2127, "Geller.java")).u("Geller read failed.");
                                    GellerLoggingCallback gellerLoggingCallbackB2 = geller.b(acgdVar2);
                                    int i4 = acdvVar.memoizedSerializedSize;
                                    if ((i4 & acoiVar) != 0) {
                                        iA = abza.a.a(acdvVar.getClass()).a(acdvVar);
                                        if (iA < 0) {
                                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                        }
                                    } else {
                                        iA = i4 & Integer.MAX_VALUE;
                                        if (iA == Integer.MAX_VALUE) {
                                            iA = abza.a.a(acdvVar.getClass()).a(acdvVar);
                                            if (iA < 0) {
                                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                            }
                                            acdvVar.memoizedSerializedSize = (acdvVar.memoizedSerializedSize & acoiVar) | iA;
                                        }
                                    }
                                    gellerLoggingCallbackB2.o(acgdVar2, false, iA, yrnVarC.a(TimeUnit.MILLISECONDS));
                                    return acdvVar;
                                }
                            } catch (IOException e7) {
                                e = e7;
                                throw new RuntimeException(a.C(acpeVar, str3), e);
                            }
                        } catch (GellerException e8) {
                            e = e8;
                            geller = this;
                        }
                    } catch (IOException e9) {
                        e = e9;
                        str2 = "byte array";
                    }
                } catch (IOException e10) {
                    e = e10;
                    str2 = "byte array";
                    throw new RuntimeException(a.C(acdtVar, str2), e);
                }
            } catch (GellerException e11) {
                e = e11;
                geller = this;
                acoiVar = -2147483648;
            }
        } catch (GellerException e12) {
            e = e12;
        }
    }

    public final void j(String str, acgd acgdVar, acdl acdlVar) {
        GellerDatabase gellerDatabaseB = this.e.b(str);
        if (gellerDatabaseB == null) {
            ((zdv) ((zdv) a.d()).q("com/google/android/libraries/geller/portable/Geller", "markSyncStatus", 1375, "Geller.java")).x("The GellerDatabase is null, skipping marking status for corpus %s", acgdVar.name());
        } else {
            gellerDatabaseB.a(acgdVar.name(), acdlVar);
        }
    }

    public native byte[] nativeCleanupAll(long j, long j2);

    public native long nativeDelete(long j, long j2, String str, byte[] bArr);

    public native byte[] nativeGetCorpusStats(long j, long j2, String[] strArr);

    public native void nativePropagateDeletion(long j, long j2, byte[] bArr);

    public native String[] nativeReadDatabaseInfo(long j, long j2, String str);

    public native byte[] nativeReadElements(long j, long j2, String str, byte[] bArr, byte[] bArr2);

    public native String[] nativeReadMetadata(long j, long j2, String str, String str2);

    public native byte[] nativeReadMetadataForAllCorpora(long j, long j2, String str);

    public native byte[] nativeReadSnapshot(long j, long j2, String[] strArr, int i, boolean z);

    public native String[] nativeUpdate(long j, long j2, byte[] bArr);

    public native boolean nativeUpdateMetadata(long j, long j2, byte[] bArr, boolean z);
}
