package defpackage;

import com.google.android.libraries.assistant.soda.Soda;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mbo {
    public static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/SodaDetectionHandler");
    private final String A;
    private final boolean B;
    private final abvo C;
    private final boolean D;
    private final boolean E;
    public final String b;
    public final mbg c;
    public final adlo d;
    public final boolean e;
    public final yqt f;
    public final max g;
    public final zyh h;
    private final String i;
    private final String j;
    private final String k;
    private final boolean l;
    private final boolean m;
    private final adoq n;
    private final boolean o;
    private final adlm p;
    private final mca q;
    private final adlu r;
    private final adnx s;
    private final adod t;
    private final adon u;
    private final adnq v;
    private final adno w = null;
    private final int x;
    private final yqt y;
    private final String z;

    public mbo(mbn mbnVar, Map map, yqt yqtVar, max maxVar, zyh zyhVar) {
        mam mamVar = (mam) mbnVar;
        this.i = mamVar.a;
        this.j = mamVar.b;
        this.k = mamVar.c;
        this.C = mamVar.j;
        this.b = mamVar.k;
        this.l = mamVar.d;
        this.m = mamVar.e;
        this.n = mamVar.f;
        this.o = mamVar.g;
        this.p = mamVar.h;
        this.c = mamVar.l;
        this.q = mamVar.m;
        this.r = mamVar.n;
        this.s = mamVar.o;
        this.t = mamVar.p;
        this.u = mamVar.r;
        this.d = mamVar.s;
        this.v = mamVar.q;
        this.x = mamVar.i;
        this.y = yqt.h((mbh) map.get(mamVar.u));
        this.z = mamVar.v;
        this.A = mamVar.w;
        this.e = mamVar.x;
        this.B = mamVar.y;
        this.D = mamVar.z;
        this.E = mamVar.A;
        this.f = yqtVar;
        this.g = maxVar;
        this.h = mee.a(zyhVar);
    }

    public final adot a() {
        ados adosVarA;
        abvo abvoVar = this.C;
        if (abvoVar.A()) {
            String str = this.i;
            String str2 = this.j;
            String str3 = this.k;
            adosVarA = mbx.a(str, str2, adma.UNKNOWN_HOST_APP_ID);
            if (!str3.isEmpty()) {
                adob adobVar = adob.a;
                adoa adoaVar = new adoa();
                adnz adnzVar = adnz.a;
                adny adnyVar = new adny();
                if ((adnyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adnyVar.y();
                }
                adnz adnzVar2 = (adnz) adnyVar.b;
                adnzVar2.b = 6;
                adnzVar2.c = str3;
                adoaVar.a(adnyVar);
                if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adosVarA.y();
                }
                adot adotVar = (adot) adosVarA.b;
                adob adobVar2 = (adob) adoaVar.v();
                adot adotVar2 = adot.a;
                adobVar2.getClass();
                adotVar.d = adobVar2;
                adotVar.b |= 2;
            }
        } else {
            adosVarA = mbx.a(this.i, this.j, adma.UNKNOWN_HOST_APP_ID);
            if (!abvoVar.A()) {
                ((zdv) ((zdv) mbx.a.b()).q("com/google/android/libraries/assistant/soda/SodaUtils", "createDefaultCoreConfigWithHotwordModel", 172, "SodaUtils.java")).u("Setting hotword model");
                adob adobVar3 = adob.a;
                adoa adoaVar2 = new adoa();
                adnz adnzVar3 = adnz.a;
                adny adnyVar2 = new adny();
                if ((adnyVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adnyVar2.y();
                }
                adnz adnzVar4 = (adnz) adnyVar2.b;
                adnzVar4.b = 2;
                adnzVar4.c = abvoVar;
                adoaVar2.a(adnyVar2);
                if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adosVarA.y();
                }
                adot adotVar3 = (adot) adosVarA.b;
                adob adobVar4 = (adob) adoaVar2.v();
                adot adotVar4 = adot.a;
                adobVar4.getClass();
                adotVar3.d = adobVar4;
                adotVar3.b |= 2;
            }
        }
        adob adobVar5 = ((adot) adosVarA.b).d;
        if (adobVar5 == null) {
            adobVar5 = adob.a;
        }
        adoa adoaVar3 = new adoa();
        adoaVar3.B(adobVar5);
        if ((adoaVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adoaVar3.y();
        }
        adob adobVar6 = (adob) adoaVar3.b;
        adobVar6.b |= 4096;
        adobVar6.d = false;
        if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adosVarA.y();
        }
        adot adotVar5 = (adot) adosVarA.b;
        adob adobVar7 = (adob) adoaVar3.v();
        adobVar7.getClass();
        adotVar5.d = adobVar7;
        adotVar5.b |= 2;
        ador adorVar = ((adot) adosVarA.b).e;
        if (adorVar == null) {
            adorVar = ador.a;
        }
        adoo adooVar = new adoo(null);
        adooVar.B(adorVar);
        if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adooVar.y();
        }
        ador adorVar2 = (ador) adooVar.b;
        adorVar2.b |= 262144;
        adorVar2.g = false;
        if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adooVar.y();
        }
        ador adorVar3 = (ador) adooVar.b;
        adorVar3.b |= 1048576;
        adorVar3.i = false;
        boolean z = this.l;
        if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adooVar.y();
        }
        ador adorVar4 = (ador) adooVar.b;
        adorVar4.b |= 512;
        adorVar4.e = z;
        boolean z2 = this.m;
        if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adooVar.y();
        }
        ador adorVar5 = (ador) adooVar.b;
        adorVar5.c |= 2048;
        adorVar5.v = z2;
        if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adooVar.y();
        }
        ador adorVar6 = (ador) adooVar.b;
        adorVar6.c |= 4;
        adorVar6.s = false;
        if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adooVar.y();
        }
        ador adorVar7 = (ador) adooVar.b;
        adorVar7.b |= 524288;
        adorVar7.h = false;
        adlm adlmVar = this.p;
        if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adooVar.y();
        }
        ador adorVar8 = (ador) adooVar.b;
        adorVar8.j = adlmVar.m;
        adorVar8.b |= 4194304;
        boolean z3 = this.B;
        if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adooVar.y();
        }
        ador adorVar9 = (ador) adooVar.b;
        adorVar9.c |= 256;
        adorVar9.t = z3;
        adoq adoqVar = this.n;
        if (adoqVar != null) {
            if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adooVar.y();
            }
            ador adorVar10 = (ador) adooVar.b;
            adorVar10.b |= 67108864;
            adorVar10.m = true;
            if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adooVar.y();
            }
            ador adorVar11 = (ador) adooVar.b;
            adorVar11.o = adoqVar.c;
            adorVar11.b |= 134217728;
            boolean z4 = this.o;
            if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adooVar.y();
            }
            ador adorVar12 = (ador) adooVar.b;
            adorVar12.b |= 268435456;
            adorVar12.p = z4;
        }
        adnx adnxVar = this.s;
        if (adnxVar != null) {
            if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adooVar.y();
            }
            ador adorVar13 = (ador) adooVar.b;
            adorVar13.q = adnxVar;
            adorVar13.c |= 1;
        }
        adod adodVar = this.t;
        if (adodVar != null) {
            if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adooVar.y();
            }
            ador adorVar14 = (ador) adooVar.b;
            adorVar14.k = adodVar;
            adorVar14.b |= 8388608;
        }
        adnq adnqVar = this.v;
        if (adnqVar != null) {
            if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adosVarA.y();
            }
            adot adotVar6 = (adot) adosVarA.b;
            adotVar6.k = adnqVar;
            adotVar6.b |= 262144;
        }
        adon adonVar = this.u;
        if (adonVar != null) {
            if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adooVar.y();
            }
            ador adorVar15 = (ador) adooVar.b;
            adorVar15.l = adonVar;
            adorVar15.b |= 16777216;
        }
        String str4 = this.z;
        if (!str4.isEmpty()) {
            adry adryVar = adry.a;
            adrx adrxVar = new adrx();
            if ((adrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adrxVar.y();
            }
            adry adryVar2 = (adry) adrxVar.b;
            adryVar2.b |= 1;
            adryVar2.c = false;
            adsa adsaVar = adsa.a;
            adrz adrzVar = new adrz();
            if ((adrzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adrzVar.y();
            }
            adsa adsaVar2 = (adsa) adrzVar.b;
            adsaVar2.b |= 2;
            adsaVar2.c = str4;
            if ((adrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adrxVar.y();
            }
            adry adryVar3 = (adry) adrxVar.b;
            adsa adsaVar3 = (adsa) adrzVar.v();
            adsaVar3.getClass();
            adryVar3.d = adsaVar3;
            adryVar3.b |= 2;
            if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adooVar.y();
            }
            ador adorVar16 = (ador) adooVar.b;
            adry adryVar4 = (adry) adrxVar.v();
            adryVar4.getClass();
            adorVar16.d = adryVar4;
            adorVar16.b |= 256;
        }
        String str5 = this.A;
        if (!str5.isEmpty()) {
            if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adooVar.y();
            }
            ador adorVar17 = (ador) adooVar.b;
            adorVar17.c |= 2;
            adorVar17.r = str5;
        }
        adng adngVar = adng.a;
        adnf adnfVar = new adnf();
        boolean z5 = this.D;
        if ((adnfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adnfVar.y();
        }
        adng adngVar2 = (adng) adnfVar.b;
        adngVar2.c |= 512;
        adngVar2.e = z5;
        if (this.E && adonVar == null) {
            if ((adnfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adnfVar.y();
            }
            adng adngVar3 = (adng) adnfVar.b;
            adngVar3.c |= 256;
            adngVar3.d = true;
        }
        adooVar.f(adng.b, (adng) adnfVar.v());
        if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adosVarA.y();
        }
        adot adotVar7 = (adot) adosVarA.b;
        ador adorVar18 = (ador) adooVar.v();
        adorVar18.getClass();
        adotVar7.e = adorVar18;
        adotVar7.b |= 4;
        adrp adrpVar = ((adot) adosVarA.b).j;
        if (adrpVar == null) {
            adrpVar = adrp.a;
        }
        adro adroVar = new adro();
        adroVar.B(adrpVar);
        if ((adroVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adroVar.y();
        }
        adrp adrpVar2 = (adrp) adroVar.b;
        adrpVar2.b |= 1;
        adrpVar2.c = false;
        if ((adroVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adroVar.y();
        }
        adrp adrpVar3 = (adrp) adroVar.b;
        adrpVar3.d = 0;
        adrpVar3.b = 2 | adrpVar3.b;
        if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adosVarA.y();
        }
        adot adotVar8 = (adot) adosVarA.b;
        adrp adrpVar4 = (adrp) adroVar.v();
        adrpVar4.getClass();
        adotVar8.j = adrpVar4;
        adotVar8.b |= 1024;
        adlu adluVar = this.r;
        if (adluVar != null) {
            if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adosVarA.y();
            }
            adot adotVar9 = (adot) adosVarA.b;
            adotVar9.i = adluVar;
            adotVar9.b |= 512;
        }
        if (this.i.isEmpty()) {
            if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adosVarA.y();
            }
            adot adotVar10 = (adot) adosVarA.b;
            adotVar10.e = null;
            adotVar10.b &= -5;
        }
        String str6 = this.b;
        if (str6 != null) {
            adof adofVar = ((adot) adosVarA.b).f;
            if (adofVar == null) {
                adofVar = adof.a;
            }
            adoe adoeVar = new adoe();
            adoeVar.B(adofVar);
            if ((adoeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adoeVar.y();
            }
            adof adofVar2 = (adof) adoeVar.b;
            abxs abxsVar = adofVar2.b;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                adofVar2.b = abxsVar.d(size + size);
            }
            adofVar2.b.add(str6);
            if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adosVarA.y();
            }
            adot adotVar11 = (adot) adosVarA.b;
            adof adofVar3 = (adof) adoeVar.v();
            adofVar3.getClass();
            adotVar11.f = adofVar3;
            adotVar11.b |= 32;
        }
        adns adnsVar = ((adot) adosVarA.b).c;
        if (adnsVar == null) {
            adnsVar = adns.a;
        }
        adnr adnrVar = new adnr();
        adnrVar.B(adnsVar);
        adns adnsVar2 = ((adot) adosVarA.b).c;
        if (adnsVar2 == null) {
            adnsVar2 = adns.a;
        }
        adls adlsVar = adnsVar2.c;
        if (adlsVar == null) {
            adlsVar = adls.a;
        }
        adlp adlpVar = new adlp(null);
        adlpVar.B(adlsVar);
        int i = this.x;
        if ((adlpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adlpVar.y();
        }
        adls adlsVar2 = (adls) adlpVar.b;
        adlsVar2.b |= 4;
        adlsVar2.e = i;
        if ((adnrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adnrVar.y();
        }
        adns adnsVar3 = (adns) adnrVar.b;
        adls adlsVar3 = (adls) adlpVar.v();
        adlsVar3.getClass();
        adnsVar3.c = adlsVar3;
        adnsVar3.b |= 1;
        if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adosVarA.y();
        }
        adot adotVar12 = (adot) adosVarA.b;
        adns adnsVar4 = (adns) adnrVar.v();
        adnsVar4.getClass();
        adotVar12.c = adnsVar4;
        adotVar12.b |= 1;
        adlo adloVar = this.d;
        if (adloVar != null) {
            if ((adosVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adosVarA.y();
            }
            adot adotVar13 = (adot) adosVarA.b;
            adotVar13.h = adloVar;
            adotVar13.b |= 256;
        }
        return (adot) this.y.b(new yqi() { // from class: mbi
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((mbh) obj).a();
            }
        }).e((adot) adosVarA.v());
    }

    public final adsg b() {
        mbt mbtVar;
        ArrayList arrayList;
        int iSum;
        adsg adsgVar;
        long jNativeCreateSharedResources;
        Object obj;
        adux aduxVar;
        admg admgVar;
        int iA;
        zdy zdyVar;
        zdy zdyVar2 = a;
        zdv zdvVar = (zdv) ((zdv) zdyVar2.b()).q("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 214, "SodaDetectionHandler.java");
        boolean z = this.e;
        zdvVar.x("#connect: enableConcurrency: %b", Boolean.valueOf(z));
        if (!z) {
            yqt yqtVar = this.f;
            if (!yqtVar.g()) {
                ((zdv) ((zdv) zdyVar2.d()).q("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 225, "SodaDetectionHandler.java")).u("Not connecting: SODA not present");
                return adsg.UNDEFINED_BEHAVIOR;
            }
            if (((mbt) yqtVar.c()).o()) {
                ((zdv) ((zdv) zdyVar2.d()).q("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 232, "SodaDetectionHandler.java")).u("Not connecting: SODA already initialized");
                return adsg.DOUBLE_INIT;
            }
            String str = this.i;
            if (str.isEmpty()) {
                ((zdv) ((zdv) zdyVar2.d()).q("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 240, "SodaDetectionHandler.java")).u("SODA resources directory string is empty; skipping the check for the existence of LP");
            } else {
                String[] list = new File(str).list();
                if (list == null || list.length == 0) {
                    ((zdv) ((zdv) zdyVar2.c()).q("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 243, "SodaDetectionHandler.java")).u("Invalid config: empty SODA resources directory");
                    return adsg.INVALID_CONFIG;
                }
            }
            ((zdv) ((zdv) zdyVar2.b()).q("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 247, "SodaDetectionHandler.java")).u("Initializing SODA");
            adot adotVarA = a();
            man manVar = new man();
            manVar.a = adotVarA;
            mca mcaVar = this.q;
            if (mcaVar != null) {
                manVar.c = yqt.i(mcaVar);
            }
            mbg mbgVar = this.c;
            if (mbgVar != null) {
                ((mbt) yqtVar.c()).l(mbgVar);
            } else {
                ((zdv) ((zdv) zdyVar2.d()).q("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 270, "SodaDetectionHandler.java")).u("No soda callback provided. Events will not be reported back");
            }
            adsg adsgVarB = adsg.b(((mbt) yqtVar.c()).f(manVar.a()).c);
            if (adsgVarB == null) {
                adsgVarB = adsg.NO_ERROR;
            }
            ((zdv) ((zdv) zdyVar2.b()).q("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 276, "SodaDetectionHandler.java")).x("Initialized SODA with status: %s", adsgVarB);
            return adsgVarB;
        }
        final max maxVar = this.g;
        String strC = c();
        adot adotVarA2 = a();
        mca mcaVar2 = this.q;
        mbg mbgVar2 = this.c;
        Optional optionalOfNullable = Optional.ofNullable(mcaVar2);
        zdy zdyVar3 = max.a;
        ((zdv) ((zdv) zdyVar3.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "connect", 157, "ConcurrentSodaManager.java")).u("#connect");
        Object obj2 = maxVar.j;
        try {
            synchronized (obj2) {
                Map map = maxVar.k;
                if (map.containsKey(strC)) {
                    Iterator it = ((Map) map.get(strC)).entrySet().iterator();
                    while (it.hasNext()) {
                        mbt mbtVar2 = (mbt) ((Map.Entry) it.next()).getValue();
                        if (mbtVar2.o()) {
                            zdyVar = zdyVar3;
                            ((zdv) ((zdv) zdyVar3.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "stopOrDeleteSoda", 507, "ConcurrentSodaManager.java")).u("Stopping existing SODA instance.");
                            mbtVar2.m();
                        } else {
                            zdyVar = zdyVar3;
                        }
                        if (mbtVar2.q(adotVarA2)) {
                            ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "stopOrDeleteSoda", 511, "ConcurrentSodaManager.java")).u("Removing existing SODA instance from the map.");
                            maxVar.e(strC, mbtVar2.d());
                        }
                        zdyVar3 = zdyVar;
                    }
                }
                mbtVar = null;
                if (map.containsKey(strC)) {
                    Iterator it2 = ((Map) map.get(strC)).entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        mbt mbtVar3 = (mbt) ((Map.Entry) it2.next()).getValue();
                        if (!mbtVar3.q(adotVarA2)) {
                            mbtVar = mbtVar3;
                            break;
                        }
                    }
                }
                arrayList = new ArrayList();
                synchronized (obj2) {
                    Stream streamFlatMap = Collection.EL.stream(map.keySet()).flatMap(new Function() { // from class: mar
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo116andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            final String str2 = (String) obj3;
                            return IntStream.CC.range(0, ((Map) maxVar.k.get(str2)).size()).mapToObj(new IntFunction() { // from class: mav
                                @Override // java.util.function.IntFunction
                                public final Object apply(int i) {
                                    return str2;
                                }
                            });
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = yyk.e;
                    arrayList.addAll((java.util.Collection) streamFlatMap.collect(ywk.a));
                }
                return adsgVar;
            }
            int i2 = aduxVar.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(aduxVar.getClass()).a(aduxVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(aduxVar.getClass()).a(aduxVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    aduxVar.memoizedSerializedSize = (aduxVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            abvo abvoVar = abvo.b;
            byte[] bArr = new byte[iA];
            boolean z2 = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(aduxVar.getClass()).m(aduxVar, abwa.a(abvwVar));
            abvo abvoVarA = abvk.a(abvwVar, bArr);
            if ((admgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                admgVar.y();
            }
            admh admhVar = (admh) admgVar.b;
            admhVar.b |= 2;
            admhVar.d = abvoVarA;
            ((mck) obj).b.a((admh) admgVar.v());
            return adsgVar;
        } catch (IOException e) {
            throw new RuntimeException(a.C(aduxVar, "ByteString"), e);
        }
        boolean z3 = true;
        if (mbtVar != null) {
            mbtVar.h();
            ((zdv) ((zdv) max.a.d()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "connect", 171, "ConcurrentSodaManager.java")).u("Reusing SODA");
            Map map2 = (Map) maxVar.k.get(strC);
            map2.remove(mbtVar.d());
            mbtVar.l(mbgVar2);
            map2.put(mbgVar2, mbtVar);
            ador adorVar = adotVarA2.e;
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
            if (iA2 != 0 && iA2 != 1) {
                maxVar.q = mbgVar2;
            }
            adsgVar = adsg.NO_ERROR;
        } else {
            zdy zdyVar4 = max.a;
            ((zdv) ((zdv) zdyVar4.d()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "connect", 190, "ConcurrentSodaManager.java")).u("Creating SODA");
            ((zdv) ((zdv) zdyVar4.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "getSodaCount", 239, "ConcurrentSodaManager.java")).u("#getSodaCount");
            synchronized (maxVar.j) {
                iSum = Collection.EL.stream(maxVar.k.values()).mapToInt(new ToIntFunction() { // from class: maw
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj3) {
                        return ((Map) obj3).size();
                    }
                }).sum();
            }
            if (iSum >= maxVar.h) {
                ((zdv) ((zdv) max.a.d()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 561, "ConcurrentSodaManager.java")).u("Reached max concurrent sessions limit.");
                adsgVar = adsg.CONCURRENCY_LIMIT_REACHED;
            } else {
                ador adorVar2 = adotVarA2.e;
                if (adorVar2 == null) {
                    adorVar2 = ador.a;
                }
                String str2 = adorVar2.f;
                if (str2.isEmpty()) {
                    ((zdv) ((zdv) max.a.d()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 570, "ConcurrentSodaManager.java")).u("SODA resources directory string is empty; skipping the check for the existence of LP");
                } else {
                    String[] list2 = new File(str2).list();
                    if (list2 == null || list2.length == 0) {
                        ((zdv) ((zdv) max.a.c()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 574, "ConcurrentSodaManager.java")).u("Invalid config: empty SODA resources directory");
                        adsgVar = adsg.INVALID_CONFIG;
                    }
                }
                zdy zdyVar5 = max.a;
                ((zdv) ((zdv) zdyVar5.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 578, "ConcurrentSodaManager.java")).x("Initializing SODA for %s", strC);
                final man manVar2 = new man();
                manVar2.a = adotVarA2;
                adrp adrpVar = adotVarA2.j;
                if (adrpVar == null) {
                    adrpVar = adrp.a;
                }
                if (adrpVar.c) {
                    Optional optional = maxVar.g;
                    optional.isPresent();
                    manVar2.b = yqt.i(optional.get());
                }
                Optional.empty();
                ador adorVar3 = adotVarA2.e;
                if (adorVar3 == null) {
                    adorVar3 = ador.a;
                }
                adnx adnxVar2 = adorVar3.q;
                if (adnxVar2 == null) {
                    adnxVar2 = adnx.a;
                }
                abxc abxcVar2 = adnk.b;
                if (abxcVar2.a != adnx.a) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                Object objK2 = adnxVar2.n.k(abxcVar2.d);
                int iA3 = adnj.a(((adnk) (objK2 == null ? abxcVar2.b : abxcVar2.b(objK2))).d);
                if (iA3 == 0) {
                    iA3 = 1;
                }
                if (iA3 == 3) {
                    ((zdv) ((zdv) zdyVar5.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 602, "ConcurrentSodaManager.java")).u("Diarization session is being resumed - cancelling timeout.");
                    Optional.of(Long.valueOf(maxVar.a()));
                    maxVar.c();
                    jNativeCreateSharedResources = maxVar.n;
                } else {
                    jNativeCreateSharedResources = Soda.nativeCreateSharedResources(maxVar);
                }
                long j = jNativeCreateSharedResources;
                optionalOfNullable.ifPresent(new Consumer() { // from class: maq
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        ((man) manVar2).c = yqt.i((mca) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                Soda soda = new Soda(maxVar.b, maxVar.i ? maxVar.c : maxVar.d, maxVar.e, j);
                soda.l(mbgVar2);
                adsg adsgVarB2 = adsg.b(soda.f(manVar2.a()).c);
                if (adsgVarB2 == null) {
                    adsgVarB2 = adsg.NO_ERROR;
                }
                ((zdv) ((zdv) zdyVar5.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 628, "ConcurrentSodaManager.java")).x("Initialized SODA with status: %s", adsgVarB2);
                if (adsgVarB2 != adsg.NO_ERROR) {
                    maxVar.d(soda, false);
                } else {
                    if (iA3 != 1) {
                        maxVar.f.isPresent();
                        maxVar.n = 0L;
                        maxVar.p = strC;
                        maxVar.q = mbgVar2;
                    }
                    synchronized (maxVar.j) {
                        Map map3 = maxVar.k;
                        if (map3.containsKey(strC)) {
                            ((Map) map3.get(strC)).put(mbgVar2, soda);
                        } else {
                            HashMap map4 = new HashMap();
                            map4.put(mbgVar2, soda);
                            map3.put(strC, map4);
                        }
                    }
                }
                adsgVar = adsgVarB2;
            }
            z3 = false;
        }
        Optional optional2 = maxVar.r;
        optional2.isPresent();
        obj = optional2.get();
        adux aduxVar2 = adux.a;
        aduw aduwVar = new aduw();
        aduz aduzVar = aduz.a;
        aduy aduyVar = new aduy();
        adut adutVar = adut.a;
        adus adusVar = new adus();
        adtx adtxVar = adtx.a;
        adtw adtwVar = new adtw();
        adtz adtzVar = adtz.a;
        adty adtyVar = new adty();
        if ((adtyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adtyVar.y();
        }
        adtz adtzVar2 = (adtz) adtyVar.b;
        strC.getClass();
        adtzVar2.b |= 1;
        adtzVar2.c = strC;
        if ((adtyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adtyVar.y();
        }
        adtz adtzVar3 = (adtz) adtyVar.b;
        abxs abxsVar = adtzVar3.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            adtzVar3.e = abxsVar.d(size + size);
        }
        abus.m(arrayList, adtzVar3.e);
        if ((adtyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adtyVar.y();
        }
        adtz adtzVar4 = (adtz) adtyVar.b;
        adtzVar4.d = adsgVar.o;
        adtzVar4.b |= 2;
        if ((adtyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adtyVar.y();
        }
        adtz adtzVar5 = (adtz) adtyVar.b;
        adtzVar5.b |= 4;
        adtzVar5.f = z3;
        if ((adtwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adtwVar.y();
        }
        adtx adtxVar2 = (adtx) adtwVar.b;
        adtz adtzVar6 = (adtz) adtyVar.v();
        adtzVar6.getClass();
        adtxVar2.c = adtzVar6;
        adtxVar2.b = 1;
        if ((adusVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adusVar.y();
        }
        adut adutVar2 = (adut) adusVar.b;
        adtx adtxVar3 = (adtx) adtwVar.v();
        adtxVar3.getClass();
        adutVar2.c = adtxVar3;
        adutVar2.b = 9;
        if ((aduyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aduyVar.y();
        }
        aduz aduzVar2 = (aduz) aduyVar.b;
        adut adutVar3 = (adut) adusVar.v();
        adutVar3.getClass();
        aduzVar2.d = adutVar3;
        aduzVar2.b |= 2;
        if ((aduwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aduwVar.y();
        }
        adux aduxVar3 = (adux) aduwVar.b;
        aduz aduzVar3 = (aduz) aduyVar.v();
        aduzVar3.getClass();
        aduxVar3.c = aduzVar3;
        aduxVar3.b |= 1;
        aduxVar = (adux) aduwVar.v();
        admh admhVar2 = admh.a;
        admgVar = new admg();
        if ((admgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            admgVar.y();
        }
        admh admhVar3 = (admh) admgVar.b;
        admhVar3.b |= 1;
        admhVar3.c = "SODA_CLEARCUT";
    }

    public final String c() {
        adlu adluVar = this.r;
        return adluVar != null ? adluVar.f : "";
    }

    public final void d() {
        if (!this.e) {
            if (g()) {
                ((mbt) this.f.c()).h();
                return;
            }
            return;
        }
        max maxVar = this.g;
        String strC = c();
        mbg mbgVar = this.c;
        ((zdv) ((zdv) max.a.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "cancelTimeout", 332, "ConcurrentSodaManager.java")).u("#cancelTimeout");
        synchronized (maxVar.j) {
            mbt mbtVarB = maxVar.b(strC, mbgVar);
            if (mbtVarB != null) {
                mbtVarB.h();
            }
        }
    }

    public final void e(abwf abwfVar) {
        if (!this.e) {
            if (g()) {
                ((mbt) this.f.c()).k(abwfVar, new Runnable() { // from class: mbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((mbt) this.a.f.c()).j();
                    }
                });
                return;
            }
            return;
        }
        final max maxVar = this.g;
        final String strC = c();
        final mbg mbgVar = this.c;
        ((zdv) ((zdv) max.a.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "scheduleTimeout", 314, "ConcurrentSodaManager.java")).u("#scheduleTimeout");
        synchronized (maxVar.j) {
            Map map = maxVar.m;
            xo xoVar = (xo) map.get(strC);
            if (xoVar != null) {
                xoVar.b(null);
            }
            map.remove(strC);
            mbt mbtVarB = maxVar.b(strC, mbgVar);
            if (mbtVarB != null) {
                mbtVarB.k(abwfVar, new Runnable() { // from class: map
                    @Override // java.lang.Runnable
                    public final void run() {
                        maxVar.e(strC, mbgVar);
                    }
                });
            }
        }
    }

    public final void f() {
        this.h.submit(wyo.h(new Runnable() { // from class: mbk
            @Override // java.lang.Runnable
            public final void run() {
                mbo mboVar = this.a;
                if (!mboVar.e) {
                    if (mboVar.g()) {
                        try {
                            ((mbt) mboVar.f.c()).m();
                            return;
                        } catch (IllegalStateException e) {
                            ((zdv) ((zdv) ((zdv) mbo.a.c()).p(e)).q("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "stopDetection", (char) 624, "SodaDetectionHandler.java")).u("SODA failed to stop capturing.");
                            return;
                        }
                    }
                    return;
                }
                final max maxVar = mboVar.g;
                final String strC = mboVar.c();
                mbg mbgVar = mboVar.c;
                ((zdv) ((zdv) max.a.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "stopDetection", 410, "ConcurrentSodaManager.java")).u("#stopDetection");
                synchronized (maxVar.j) {
                    mbt mbtVarB = maxVar.b(strC, mbgVar);
                    if (mbtVarB != null && mbtVarB.o()) {
                        maxVar.l.put(strC, zxn.n(xt.a(new xq() { // from class: mat
                            @Override // defpackage.xq
                            public final Object a(xo xoVar) {
                                maxVar.m.put(strC, xoVar);
                                return "ConcurrentSodaManager.stopDetection operation";
                            }
                        }), 500L, TimeUnit.MILLISECONDS, maxVar.e));
                        try {
                            mbtVarB.m();
                        } catch (IllegalStateException e2) {
                            ((zdv) ((zdv) ((zdv) max.a.c()).p(e2)).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "stopDetection", 434, "ConcurrentSodaManager.java")).u("SODA failed to stop capturing.");
                        }
                    }
                }
            }
        }));
    }

    public final boolean g() {
        yqt yqtVar = this.f;
        return yqtVar.g() && ((mbt) yqtVar.c()).o();
    }
}
