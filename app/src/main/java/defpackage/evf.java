package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Base64;
import android.util.Pair;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ComponentSharedResources;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.ProminenceAlgorithm;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evf implements aejl {
    public final evg a;
    private final eup b;
    private final int c;

    public evf(eup eupVar, evg evgVar, int i) {
        this.b = eupVar;
        this.a = evgVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v113, types: [agow, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v27, types: [agow, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v130, types: [java.lang.Object, oin] */
    @Override // defpackage.agow
    public final Object a() {
        Boolean bool = false;
        switch (this.c) {
            case 0:
                evg evgVar = this.a;
                tmi tmiVar = (tmi) evgVar.h.a();
                yqt yqtVarI = yqt.i(evgVar.a);
                yqt yqtVarM = evgVar.m();
                evgVar.t();
                return new tmm(tmiVar, yqtVarI, yqtVarM, (Context) this.b.n.a());
            case 1:
                eup eupVar = this.b;
                return tmi.a.a(eupVar.bZ, this.a.t(), (Context) eupVar.n.a());
            case 2:
                evg evgVar2 = this.a;
                yqt yqtVarI2 = yqt.i((oco) evgVar2.l.a());
                aejf.b(evgVar2.r);
                bool.getClass();
                oco ocoVar = (oco) ((yqz) yqtVarI2).a;
                elo.a = new ohw(ocoVar);
                return ocoVar;
            case 3:
                evg evgVar3 = this.a;
                eup eupVar2 = evgVar3.g;
                Context context = (Context) eupVar2.n.a();
                zyh zyhVar = (zyh) eupVar2.w.a();
                evgVar3.t();
                return new miz(yzq.q(new tmj((tmm) evgVar3.i.a()), new tmk(new tmg(context, zyhVar, evgVar3.a, evgVar3.m()))));
            case 4:
                ((tmi) this.a.j.a()).f("Runtime.Created");
                return tme.a;
            case 5:
                eup eupVar3 = this.b;
                evg evgVar4 = this.a;
                return tmi.a.b(eupVar3.bZ, evgVar4.t(), (Context) eupVar3.n.a(), evgVar4.a, (tmd) evgVar4.m().f());
            case 6:
                return new nxk(this.a.m);
            case 7:
                evg evgVar5 = this.a;
                yqt.i((ExecutorRegistry) evgVar5.q.a());
                bool.getClass();
                throw new IllegalStateException("Creating DebuggerClient when debugger is disabled");
            case 8:
                bool.getClass();
                throw new IllegalStateException("Creating DebuggerCallback when debugger is disabled");
            case 9:
                return yqt.i((ByteStore) this.a.o.a());
            case 10:
                oat oatVar = (oat) ((aejh) this.a.n).b;
                if (oatVar instanceof mwq) {
                    ByteStore byteStore = (ByteStore) ((mwq) oatVar).a.eV();
                    byteStore.getClass();
                    return byteStore;
                }
                if (!(oatVar instanceof tna)) {
                    throw new NoSuchElementException("Unable to provide the ByteStore");
                }
                throw null;
            case 11:
                ExecutorRegistry executorRegistryCreate = ExecutorRegistry.create(new nxv(new nxs()), new nxv(new nxq((zyh) this.b.m.a())));
                executorRegistryCreate.getClass();
                return executorRegistryCreate;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                evg evgVar6 = this.a;
                oat oatVar2 = (oat) ((aejh) evgVar6.n).b;
                return new tjk(oatVar2, new tok((Context) evgVar6.g.n.a(), oatVar2), (tmm) evgVar6.i.a(), (tmi) evgVar6.j.a());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                evg evgVar7 = this.a;
                Map mapN = evgVar7.n();
                yyr yyrVar = zcl.a;
                tox toxVar = new tox((toy) evgVar7.g.pk.a());
                tli tliVarI = evgVar7.i();
                Iterable iterable = evgVar7.f;
                if (iterable == null) {
                    iterable = agrf.a;
                }
                ArrayList arrayList = new ArrayList(agqq.i(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((tlj) it.next()).a(toxVar, tliVarI));
                }
                return new mih(mapN, yyrVar, yzq.o(agqq.A(arrayList)), (oco) evgVar7.s.a(), yqt.i((oap) evgVar7.T.a()));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new euw(this);
            case 15:
                return Optional.of(true);
            case 16:
                return Optional.of(true);
            case 17:
                evg evgVar8 = this.a;
                Map mapO = evgVar8.o();
                yyk yykVar = muk.a;
                ArrayList arrayList2 = new ArrayList(new ywm(((yyr) mapO).values(), new yqx() { // from class: mui
                    @Override // defpackage.yqx
                    public final boolean a(Object obj) {
                        return muk.a.contains(((oec) obj).getClass());
                    }
                }));
                Collections.sort(arrayList2, new Comparator() { // from class: muj
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        yyk yykVar2 = muk.a;
                        return yykVar2.indexOf(((oec) obj).getClass()) - yykVar2.indexOf(((oec) obj2).getClass());
                    }
                });
                Map mapO2 = evgVar8.o();
                yyf yyfVar = new yyf(4);
                for (oec oecVar : ((yyr) mapO2).values()) {
                    if (!muk.a.contains(oecVar.getClass())) {
                        yyfVar.g(oecVar);
                    }
                }
                yyk yykVarF = yyfVar.f();
                yykVarF.getClass();
                mty mtyVar = new mty(evgVar8.p, aejf.b(evgVar8.M));
                DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties = DirectUpdatePropertiesOuterClass$DirectUpdateProperties.a;
                abyy abwxVar = DirectUpdatePropertiesOuterClass$DirectUpdateProperties.b;
                if (abwxVar == null) {
                    synchronized (DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class) {
                        abwxVar = DirectUpdatePropertiesOuterClass$DirectUpdateProperties.b;
                        if (abwxVar == null) {
                            abwxVar = new abwx(DirectUpdatePropertiesOuterClass$DirectUpdateProperties.a);
                            DirectUpdatePropertiesOuterClass$DirectUpdateProperties.b = abwxVar;
                        }
                    }
                }
                Pair pairCreate = Pair.create(mtyVar, abwxVar);
                pairCreate.getClass();
                mkz mkzVar = new mkz();
                acyq acyqVar = acyq.a;
                abyy abwxVar2 = acyq.b;
                if (abwxVar2 == null) {
                    synchronized (acyq.class) {
                        abwxVar2 = acyq.b;
                        if (abwxVar2 == null) {
                            abwxVar2 = new abwx(acyq.a);
                            acyq.b = abwxVar2;
                        }
                    }
                }
                Pair pairCreate2 = Pair.create(mkzVar, abwxVar2);
                pairCreate2.getClass();
                yyr yyrVarL = yyr.l(mty.class, pairCreate, acyq.class, pairCreate2);
                Iterable iterable2 = evgVar8.e;
                tou touVar = new tou((toy) evgVar8.g.pk.a());
                tli tliVarI2 = evgVar8.i();
                if (iterable2 == null) {
                    iterable2 = agrf.a;
                }
                ArrayList arrayList3 = new ArrayList(agqq.i(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((tlh) it2.next()).a(touVar, tliVarI2));
                }
                yzq yzqVarO = yzq.o(agqq.A(arrayList3));
                yyf yyfVar2 = new yyf(4);
                Iterator<E> it3 = yyrVarL.values().iterator();
                while (it3.hasNext()) {
                    yyfVar2.g((oeb) ((Pair) it3.next()).first);
                }
                yyfVar2.h(yzqVarO);
                yyk yykVarF2 = yyfVar2.f();
                yykVarF2.getClass();
                return new muh(arrayList2, yykVarF, yykVarF2, (oco) this.a.s.a());
            case 18:
                evg evgVar9 = this.a;
                return new msz((mwc) evgVar9.O.a(), (mvv) evgVar9.P.a(), (mtb) evgVar9.Q.a(), evgVar9.b());
            case 19:
                evg evgVar10 = this.a;
                yyn yynVarH = yyr.h(21);
                eup eupVar4 = evgVar10.g;
                final tjr tjrVar = new tjr((Executor) eupVar4.m.a());
                final Executor executor = (Executor) eupVar4.m.a();
                tor torVarL = evgVar10.l();
                tli tliVarI3 = evgVar10.i();
                abxc abxcVar = acqw.b;
                abxcVar.getClass();
                executor.getClass();
                yynVarH.c(acqw.class, new tld(abxcVar, new agvc() { // from class: tkx
                    @Override // defpackage.agvc
                    public final Object a(final Object obj, Object obj2, Object obj3) {
                        final nzx nzxVar = (nzx) obj2;
                        final tli tliVar = (tli) obj3;
                        tliVar.getClass();
                        final tjr tjrVar2 = tjrVar;
                        final agum agumVar = new agum() { // from class: tky
                            @Override // defpackage.agum
                            public final Object a() {
                                zyd zydVarK;
                                final acqw acqwVar = (acqw) obj;
                                if ((acqwVar.c & 1) == 0) {
                                    return zxn.g(new IllegalArgumentException("GetClickTrackingIdentifierCommand does not have a DataStore output path"));
                                }
                                nzx nzxVar2 = nzxVar;
                                if (nzxVar2 == null) {
                                    return zxn.g(new IllegalStateException("No CommandEventData was provided"));
                                }
                                final acxn acxnVarQ = nzxVar2.d().Q();
                                if (acxnVarQ == null) {
                                    return zxn.g(new IllegalStateException("No LoggingNode is associated with the Element"));
                                }
                                ocq ocqVarP = nzxVar2.d().P();
                                if (!(ocqVarP instanceof tkm)) {
                                    return zxn.g(new IllegalStateException("VeElementsInteractionLogger is needed on the client to impress and extract VEs"));
                                }
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    zydVarK = zxn.h(((tkk) ocqVarP).c(acxnVarQ));
                                } else {
                                    final tkk tkkVar = (tkk) ocqVarP;
                                    Callable callable = new Callable() { // from class: tkf
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            return tkkVar.c(acxnVarQ);
                                        }
                                    };
                                    zydVarK = zxn.k(wyo.i(callable), tkkVar.b);
                                }
                                final tli tliVar2 = tliVar;
                                return zuz.g(zydVarK, wyo.a(new yqi() { // from class: tjq
                                    @Override // defpackage.yqi
                                    public final Object apply(Object obj4) {
                                        int iA;
                                        int iA2;
                                        int iA3;
                                        int iA4;
                                        int iA5;
                                        zpk zpkVar = (zpk) obj4;
                                        acqu acquVar = acqu.a;
                                        acqt acqtVar = new acqt();
                                        if ((acqtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            acqtVar.y();
                                        }
                                        acqu acquVar2 = (acqu) acqtVar.b;
                                        zpkVar.getClass();
                                        acquVar2.c = zpkVar;
                                        acquVar2.b |= 1;
                                        byte[] bArrA = new byte[0];
                                        if ((zpkVar.b & 2048) != 0) {
                                            zpj zpjVar = new zpj();
                                            zpn zpnVar = zpkVar.f;
                                            if (zpnVar == null) {
                                                zpnVar = zpn.a;
                                            }
                                            if ((zpjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                zpjVar.y();
                                            }
                                            zpk zpkVar2 = (zpk) zpjVar.b;
                                            zpnVar.getClass();
                                            zpkVar2.f = zpnVar;
                                            zpkVar2.b |= 2048;
                                            zpk zpkVar3 = (zpk) zpjVar.v();
                                            try {
                                                int i = zpkVar3.memoizedSerializedSize;
                                                if ((i & Integer.MIN_VALUE) != 0) {
                                                    iA5 = abza.a.a(zpkVar3.getClass()).a(zpkVar3);
                                                    if (iA5 < 0) {
                                                        throw new IllegalStateException(a.b(iA5, "serialized size must be non-negative, was "));
                                                    }
                                                } else {
                                                    iA5 = i & Integer.MAX_VALUE;
                                                    if (iA5 == Integer.MAX_VALUE) {
                                                        iA5 = abza.a.a(zpkVar3.getClass()).a(zpkVar3);
                                                        if (iA5 < 0) {
                                                            throw new IllegalStateException(a.b(iA5, "serialized size must be non-negative, was "));
                                                        }
                                                        zpkVar3.memoizedSerializedSize = (zpkVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA5;
                                                    }
                                                }
                                                byte[] bArr = new byte[iA5];
                                                boolean z = abvz.e;
                                                abvw abvwVar = new abvw(bArr, 0, iA5);
                                                abza.a.a(zpkVar3.getClass()).m(zpkVar3, abwa.a(abvwVar));
                                                abvwVar.K();
                                                bArrA = zth.a(bArrA, bArr);
                                            } catch (IOException e) {
                                                throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", zpkVar3), e);
                                            }
                                        }
                                        if ((zpkVar.b & 128) != 0) {
                                            zpj zpjVar2 = new zpj();
                                            int i2 = zpkVar.e;
                                            if ((zpjVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                zpjVar2.y();
                                            }
                                            zpk zpkVar4 = (zpk) zpjVar2.b;
                                            zpkVar4.b |= 128;
                                            zpkVar4.e = i2;
                                            zpk zpkVar5 = (zpk) zpjVar2.v();
                                            try {
                                                int i3 = zpkVar5.memoizedSerializedSize;
                                                if ((i3 & Integer.MIN_VALUE) != 0) {
                                                    iA4 = abza.a.a(zpkVar5.getClass()).a(zpkVar5);
                                                    if (iA4 < 0) {
                                                        throw new IllegalStateException(a.b(iA4, "serialized size must be non-negative, was "));
                                                    }
                                                } else {
                                                    iA4 = i3 & Integer.MAX_VALUE;
                                                    if (iA4 == Integer.MAX_VALUE) {
                                                        iA4 = abza.a.a(zpkVar5.getClass()).a(zpkVar5);
                                                        if (iA4 < 0) {
                                                            throw new IllegalStateException(a.b(iA4, "serialized size must be non-negative, was "));
                                                        }
                                                        zpkVar5.memoizedSerializedSize = (zpkVar5.memoizedSerializedSize & Integer.MIN_VALUE) | iA4;
                                                    }
                                                }
                                                byte[] bArr2 = new byte[iA4];
                                                boolean z2 = abvz.e;
                                                abvw abvwVar2 = new abvw(bArr2, 0, iA4);
                                                abza.a.a(zpkVar5.getClass()).m(zpkVar5, abwa.a(abvwVar2));
                                                abvwVar2.K();
                                                bArrA = zth.a(bArrA, bArr2);
                                            } catch (IOException e2) {
                                                throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", zpkVar5), e2);
                                            }
                                        }
                                        if ((zpkVar.b & 8) != 0) {
                                            zpj zpjVar3 = new zpj();
                                            int i4 = zpkVar.d;
                                            if ((zpjVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                zpjVar3.y();
                                            }
                                            zpk zpkVar6 = (zpk) zpjVar3.b;
                                            zpkVar6.b |= 8;
                                            zpkVar6.d = i4;
                                            zpk zpkVar7 = (zpk) zpjVar3.v();
                                            try {
                                                int i5 = zpkVar7.memoizedSerializedSize;
                                                if ((i5 & Integer.MIN_VALUE) != 0) {
                                                    iA3 = abza.a.a(zpkVar7.getClass()).a(zpkVar7);
                                                    if (iA3 < 0) {
                                                        throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                                    }
                                                } else {
                                                    iA3 = i5 & Integer.MAX_VALUE;
                                                    if (iA3 == Integer.MAX_VALUE) {
                                                        iA3 = abza.a.a(zpkVar7.getClass()).a(zpkVar7);
                                                        if (iA3 < 0) {
                                                            throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                                        }
                                                        zpkVar7.memoizedSerializedSize = (zpkVar7.memoizedSerializedSize & Integer.MIN_VALUE) | iA3;
                                                    }
                                                }
                                                byte[] bArr3 = new byte[iA3];
                                                boolean z3 = abvz.e;
                                                abvw abvwVar3 = new abvw(bArr3, 0, iA3);
                                                abza.a.a(zpkVar7.getClass()).m(zpkVar7, abwa.a(abvwVar3));
                                                abvwVar3.K();
                                                bArrA = zth.a(bArrA, bArr3);
                                            } catch (IOException e3) {
                                                throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", zpkVar7), e3);
                                            }
                                        }
                                        zpj zpjVar4 = new zpj();
                                        zpjVar4.B(zpkVar);
                                        if ((zpjVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            zpjVar4.y();
                                        }
                                        zpk zpkVar8 = (zpk) zpjVar4.b;
                                        zpkVar8.f = null;
                                        zpkVar8.b &= -2049;
                                        if ((zpjVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            zpjVar4.y();
                                        }
                                        zpk zpkVar9 = (zpk) zpjVar4.b;
                                        zpkVar9.b &= -129;
                                        zpkVar9.e = 0;
                                        if ((zpjVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            zpjVar4.y();
                                        }
                                        zpk zpkVar10 = (zpk) zpjVar4.b;
                                        zpkVar10.b &= -9;
                                        zpkVar10.d = 0;
                                        zpk zpkVar11 = (zpk) zpjVar4.v();
                                        try {
                                            int i6 = zpkVar11.memoizedSerializedSize;
                                            if ((i6 & Integer.MIN_VALUE) != 0) {
                                                iA = abza.a.a(zpkVar11.getClass()).a(zpkVar11);
                                                if (iA < 0) {
                                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                                }
                                            } else {
                                                iA = i6 & Integer.MAX_VALUE;
                                                if (iA == Integer.MAX_VALUE) {
                                                    iA = abza.a.a(zpkVar11.getClass()).a(zpkVar11);
                                                    if (iA < 0) {
                                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                                    }
                                                    zpkVar11.memoizedSerializedSize = (zpkVar11.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                                }
                                            }
                                            byte[] bArr4 = new byte[iA];
                                            boolean z4 = abvz.e;
                                            abvw abvwVar4 = new abvw(bArr4, 0, iA);
                                            abza.a.a(zpkVar11.getClass()).m(zpkVar11, abwa.a(abvwVar4));
                                            abvwVar4.K();
                                            byte[] bArrA2 = zth.a(bArrA, bArr4);
                                            int i7 = zpkVar.b & 4;
                                            String strValueOf = String.valueOf(Base64.encodeToString(bArrA2, 11));
                                            if ((acqtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                acqtVar.y();
                                            }
                                            acqw acqwVar2 = acqwVar;
                                            tli tliVar3 = tliVar2;
                                            String strConcat = (i7 == 0 ? "0" : "2").concat(strValueOf);
                                            acqu acquVar3 = (acqu) acqtVar.b;
                                            acquVar3.b |= 2;
                                            acquVar3.d = strConcat;
                                            acqu acquVar4 = (acqu) acqtVar.v();
                                            oat oatVarB = tliVar3.b();
                                            String str = acqwVar2.d;
                                            try {
                                                int i8 = acquVar4.memoizedSerializedSize;
                                                if ((i8 & Integer.MIN_VALUE) != 0) {
                                                    iA2 = abza.a.a(acquVar4.getClass()).a(acquVar4);
                                                    if (iA2 < 0) {
                                                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                                    }
                                                } else {
                                                    iA2 = i8 & Integer.MAX_VALUE;
                                                    if (iA2 == Integer.MAX_VALUE) {
                                                        iA2 = abza.a.a(acquVar4.getClass()).a(acquVar4);
                                                        if (iA2 < 0) {
                                                            throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                                        }
                                                        acquVar4.memoizedSerializedSize = (acquVar4.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                                                    }
                                                }
                                                byte[] bArr5 = new byte[iA2];
                                                abvw abvwVar5 = new abvw(bArr5, 0, iA2);
                                                abza.a.a(acquVar4.getClass()).m(acquVar4, abwa.a(abvwVar5));
                                                abvwVar5.K();
                                                oatVarB.b(str, bArr5);
                                                return null;
                                            } catch (IOException e4) {
                                                throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", acquVar4), e4);
                                            }
                                        } catch (IOException e5) {
                                            throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", zpkVar11), e5);
                                        }
                                    }
                                }), tjrVar2.a);
                            }
                        };
                        return zxn.l(wyo.b(new zvh() { // from class: tle
                            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zyd] */
                            @Override // defpackage.zvh
                            public final zyd a() {
                                return agumVar.a();
                            }
                        }), executor);
                    }
                }).a(torVarL, tliVarI3));
                aejl aejlVar = evgVar10.I;
                aejl aejlVar2 = evgVar10.A;
                yynVarH.c(acxv.class, new mvg(aejf.b(aejlVar2), (agfx) aejlVar.a()));
                aehf aehfVarB = aejf.b(aejlVar2);
                yynVarH.c(acxx.class, new mvi(aehfVarB));
                yynVarH.c(acym.class, new mvq(aejf.b(aejlVar2)));
                yynVarH.c(acvd.class, new mvb(aejf.b(aejlVar2), (agfx) aejlVar.a()));
                oat oatVar3 = (oat) ((aejh) evgVar10.n).b;
                yynVarH.c(aczh.class, new mvs(oatVar3));
                yynVarH.c(acvq.class, new mve(oatVar3, aejf.b(aejlVar2)));
                yynVarH.c(acyj.class, new mvo());
                yynVarH.c(actc.class, evgVar10.a());
                ogz.a.getClass();
                yynVarH.c(acxz.class, new mvj(aejf.b(aejlVar2)));
                yynVarH.c(addw.class, new tka(oatVar3));
                aejl aejlVar3 = evgVar10.K;
                yynVarH.c(aczz.class, new mkb((mjz) aejlVar3.a()));
                yynVarH.c(adad.class, new mkf((mjz) aejlVar3.a()));
                yynVarH.c(adah.class, new mkj((mjz) aejlVar3.a()));
                aejl aejlVar4 = evgVar10.s;
                yynVarH.c(aczv.class, new mjv((oco) aejlVar4.a()));
                yynVarH.c(aczp.class, new mjk());
                yynVarH.c(aczl.class, new mjf());
                aejl aejlVar5 = evgVar10.L;
                yynVarH.c(aczr.class, new mjo((mjm) aejlVar5.a(), new mjs(aejm.b(aejlVar2), aejm.b(evgVar10.M))));
                yynVarH.c(adab.class, new mkd((mjm) aejlVar5.a()));
                yynVarH.c(adaf.class, new mkh((mjm) aejlVar5.a()));
                yqt.i(new Object() { // from class: tmp
                });
                yynVarH.c(aczn.class, new mjh());
                yyr yyrVarA = yynVarH.a(true);
                Iterable iterable3 = evgVar10.c;
                yyr yyrVar2 = zcl.a;
                tor torVarL2 = evgVar10.l();
                tli tliVarI4 = evgVar10.i();
                if (iterable3 == null) {
                    iterable3 = agrf.a;
                }
                ArrayList arrayList4 = new ArrayList(agqq.i(iterable3, 10));
                Iterator it4 = iterable3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((tkz) it4.next()).a(torVarL2, tliVarI4));
                }
                yzq yzqVarO2 = yzq.o(agqq.A(arrayList4));
                evgVar10.i();
                yzq yzqVarO3 = yzq.o(agqq.A(new ArrayList(agqq.i(agrf.a, 10))));
                return new mwc(yyrVarA, yyrVar2, yzqVarO2, yzqVarO3, evgVar10.b(), evgVar10.N);
            case 20:
                evg evgVar11 = this.a;
                return new moz(evgVar11.u, evgVar11.v, evgVar11.w, evgVar11.x, evgVar11.y);
            case 21:
                evg evgVar12 = this.a;
                yqt yqtVarI3 = yqt.i(evgVar12.k());
                return ((yqz) yqtVarI3).a;
            case 22:
                return (nya) ((yqz) yqt.i((nya) this.a.E.a())).a;
            case 23:
                return new nya();
            case 24:
                yqt yqtVarI4 = yqt.i(zcl.a);
                yyn yynVar = new yyn(4);
                for (Map.Entry entry : ((yqz) yqtVarI4).a.entrySet()) {
                    yynVar.c(Integer.valueOf(((off) ((Pair) entry.getValue()).first).a().a()), (Pair) entry.getValue());
                }
                return yynVar.a(true);
            case 25:
                return new tlf();
            case 26:
                agfx agfxVar = agoq.c;
                aggz aggzVar = agoh.i;
                agfxVar.getClass();
                return agfxVar;
            case 27:
                evg evgVar13 = this.a;
                eup eupVar5 = this.b;
                aehf aehfVarB2 = aejf.b(evgVar13.A);
                Executor executor2 = (Executor) eupVar5.m.a();
                agfx agfxVar2 = agoq.a;
                agmq agmqVar = new agmq(executor2);
                tlr tlrVar = (tlr) ((yqz) yqt.i(evgVar13.J)).a.a();
                mjz mjzVar = new mjz(aehfVarB2, agmqVar, agmqVar);
                if (tlrVar == null) {
                    return mjzVar;
                }
                tlrVar.a();
                return mjzVar;
            case 28:
                return new mjm();
            case 29:
                evg evgVar14 = this.a;
                final oco ocoVar2 = (oco) evgVar14.s.a();
                DirectUpdateDataRelay directUpdateDataRelay = (DirectUpdateDataRelay) evgVar14.b.a.a(new oey() { // from class: mqz
                    @Override // defpackage.oey
                    public final Object a() {
                        mhw.a();
                        DirectUpdateDataRelay directUpdateDataRelayCreate = DirectUpdateDataRelay.create();
                        if (directUpdateDataRelayCreate != null) {
                            return directUpdateDataRelayCreate;
                        }
                        ocoVar2.b(acsw.LOG_TYPE_INTERNAL_ERROR, oal.A, "Failed to create DirectUpdateDataRelay", new Object[0]);
                        return new mra();
                    }
                });
                directUpdateDataRelay.getClass();
                return directUpdateDataRelay;
            case 30:
                bool.getClass();
                return mzk.b;
            case 31:
                evg evgVar15 = this.a;
                aejl aejlVar6 = evgVar15.O;
                yyr yyrVar3 = zcl.a;
                return new mvv(evgVar15.o, (mwc) aejlVar6.a(), ((yqz) yqt.i(evgVar15.q)).a, evgVar15.N, yqt.i(true), yyrVar3);
            case 32:
                return new mtb((oco) this.a.s.a());
            case 33:
                return new ogr((oco) this.a.s.a());
            case 34:
                Context context2 = (Context) this.b.n.a();
                context2.getClass();
                return afdz.c(context2) ? ogk.a : ogj.a;
            case 35:
                return new eux(this);
            case 36:
                return new euy(this);
            case 37:
                return new euz(this);
            case 38:
                return new eva(this);
            case 39:
                return new evb(this);
            case 40:
                evg evgVar16 = this.a;
                final aejl aejlVar7 = evgVar16.Z;
                oey oeyVar = new oey() { // from class: mrr
                    @Override // defpackage.oey
                    public final Object a() {
                        return new mrw(aejlVar7);
                    }
                };
                mrt mrtVar = evgVar16.d;
                final mrw mrwVar = (mrw) mrtVar.b.a(oeyVar);
                mrwVar.getClass();
                oes oesVar = (oes) mrtVar.c.a(new oey() { // from class: mrp
                    @Override // defpackage.oey
                    public final Object a() {
                        return new msb(mrwVar);
                    }
                });
                oesVar.getClass();
                return oesVar;
            case 41:
                evg evgVar17 = this.a;
                final oco ocoVar3 = (oco) evgVar17.s.a();
                final Context context3 = (Context) this.b.n.a();
                IntersectionEngine intersectionEngine = (IntersectionEngine) evgVar17.d.a.a(new oey() { // from class: mrq
                    @Override // defpackage.oey
                    public final Object a() {
                        mhw.a();
                        IntersectionEngine intersectionEngineCreate = IntersectionEngine.create();
                        if (intersectionEngineCreate == null) {
                            ocoVar3.b(acsw.LOG_TYPE_INTERNAL_ERROR, oal.A, "Failed to create IntersectionEngine.", new Object[0]);
                            return new mrs();
                        }
                        Context context4 = context3;
                        intersectionEngineCreate.setEnableProminence(true, ProminenceAlgorithm.DEFAULT_ALGORITHM);
                        intersectionEngineCreate.setRtl(oha.a(context4.getResources()));
                        return intersectionEngineCreate;
                    }
                });
                intersectionEngine.getClass();
                return intersectionEngine;
            case 42:
                return new mqt();
            case 43:
                return new evc(this);
            case 44:
                return new evd(this);
            case 45:
                final yqt yqtVarI5 = yqt.i(Boolean.valueOf(this.b.he()));
                UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) mzk.a.a(new oey() { // from class: mzi
                    public final /* synthetic */ String a = "localhost:5001";

                    @Override // defpackage.oey
                    public final Object a() {
                        Boolean bool2 = false;
                        bool2.getClass();
                        bool2.getClass();
                        bool2.getClass();
                        Integer num = 0;
                        num.getClass();
                        num.getClass();
                        boolean zBooleanValue = ((Boolean) ((yqz) yqtVarI5).a).booleanValue();
                        num.getClass();
                        bool2.getClass();
                        bool2.getClass();
                        return new UnifiedTemplateResolver(this.a, zBooleanValue);
                    }
                });
                unifiedTemplateResolver.getClass();
                return unifiedTemplateResolver;
            case 46:
                Context context4 = (Context) this.b.n.a();
                evg evgVar18 = this.a;
                return new mxi(context4, (mwt) evgVar18.af.a(), new mws((Context) evgVar18.g.n.a()), Optional.empty(), Optional.of(true));
            case 47:
                return new mwt();
            case 48:
                HashMap map = new HashMap(zcl.a);
                bool.getClass();
                bool.getClass();
                return new ComponentSharedResources(map, null, null);
            case 49:
                Context context5 = (Context) this.b.n.a();
                context5.getClass();
                ogg oggVar = new ogg();
                oggVar.a = false;
                oggVar.l |= 1;
                oggVar.h(false);
                oggVar.g(false);
                oggVar.b = false;
                oggVar.l |= 8;
                oggVar.f(false);
                oggVar.d(0);
                oggVar.c = false;
                int i = oggVar.l;
                oggVar.d = false;
                oggVar.l = i | 192;
                oggVar.c(false);
                oggVar.b(false);
                oggVar.e = false;
                oggVar.l |= 1024;
                oggVar.e(0);
                oggVar.f = false;
                int i2 = oggVar.l;
                oggVar.g = false;
                oggVar.h = false;
                oggVar.i = false;
                oggVar.j = false;
                oggVar.k = false;
                oggVar.l = i2 | 258048;
                afdz afdzVar = afdz.a;
                oggVar.h(afdzVar.eV().k(context5));
                oggVar.f(afdzVar.eV().c(context5));
                oggVar.d((int) afdzVar.eV().a(context5));
                oggVar.e((int) afdzVar.eV().b(context5));
                oggVar.c(afdz.d(context5));
                oggVar.b(afdz.d(context5));
                return oggVar.a();
            case 50:
                return new mpo();
            case 51:
                return new eve(this);
            case 52:
                evg evgVar19 = this.a;
                evgVar19.u();
                aejl aejlVar8 = evgVar19.s;
                yqt yqtVarI6 = yqt.i(evgVar19.o);
                oco ocoVar4 = (oco) aejlVar8.a();
                aejl aejlVar9 = evgVar19.ag;
                aehf aehfVarB3 = aejf.b(evgVar19.ae);
                mxi mxiVar = (mxi) aejlVar9.a();
                mzj mzjVar = (mzj) evgVar19.N.a();
                agfx agfxVar3 = (agfx) evgVar19.I.a();
                yqt yqtVarI7 = yqt.i(Boolean.valueOf(evgVar19.q()));
                aehf aehfVarB4 = aejf.b(evgVar19.ah);
                yqt yqtVarI8 = yqt.i(Boolean.valueOf(evgVar19.p()));
                return new mma(yqtVarI6, ocoVar4, aehfVarB3, mxiVar, evgVar19.m, mzjVar, agfxVar3, yqtVarI7, aehfVarB4, yqtVarI8, yqt.i(true), yqt.i((ComponentConfig) evgVar19.ai.a()), yqt.i((Boolean) evgVar19.ak.a()), yqt.i((Boolean) evgVar19.al.a()));
            case 53:
                Context context6 = (Context) this.b.n.a();
                context6.getClass();
                return Boolean.valueOf(afdz.c(context6));
            case 54:
                Context context7 = (Context) this.b.n.a();
                context7.getClass();
                return Boolean.valueOf(afdz.c(context7));
            case 55:
                return new euu(this);
            case 56:
                return new euv(this);
            case 57:
                return new tls();
            case 58:
                eup eupVar6 = this.b;
                mcw mcwVar = (mcw) eupVar6.i.a();
                Executor executor3 = (Executor) eupVar6.m.a();
                evg evgVar20 = this.a;
                Context context8 = (Context) evgVar20.g.n.a();
                tmi tmiVar2 = (tmi) evgVar20.j.a();
                yqt yqtVarI9 = afdw.a.eV().a(context8) ? yqt.i(new ohx()) : ypv.a;
                if (afdz.a.eV().j(context8)) {
                    yqtVarI9 = yqt.i(new tly(tmiVar2, (oin) yqtVarI9.e(oin.a), context8));
                }
                return yqtVarI9.g() ? new ohu(new tmt(mcwVar), yqtVarI9.c(), executor3) : oce.a;
            default:
                eup eupVar7 = this.b;
                mcw mcwVar2 = (mcw) eupVar7.i.a();
                tmi tmiVar3 = (tmi) this.a.j.a();
                Context context9 = (Context) eupVar7.n.a();
                Executor executor4 = (Executor) eupVar7.m.a();
                if (afdz.a.eV().h(context9)) {
                    return new tmb(new tms(mcwVar2), new tly(tmiVar3, new ohx(), context9), executor4);
                }
                return oct.a;
        }
    }
}
