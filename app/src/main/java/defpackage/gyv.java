package defpackage;

import j$.time.Duration;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyv implements gyj, gyy {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/platform/init/InitSystem");
    public final agow b;
    public final agow c;
    public final agow d;
    public final agow e;
    public final agow f;
    public final hag g;
    public final yrx h;
    public final HashSet i;
    public final ahni j;
    private final ahbt k;
    private final agow l;
    private final agow m;
    private Set n;
    private final Map o;
    private final String p;

    public gyv(agow agowVar, agow agowVar2, ahbt ahbtVar, Set set, agow agowVar3, agow agowVar4, agow agowVar5, agow agowVar6, agow agowVar7, hag hagVar, yrx yrxVar) {
        agowVar2.getClass();
        ahbtVar.getClass();
        agowVar3.getClass();
        agowVar4.getClass();
        agowVar6.getClass();
        agowVar7.getClass();
        hagVar.getClass();
        this.b = agowVar;
        this.c = agowVar2;
        this.k = ahbtVar;
        this.d = agowVar3;
        this.l = agowVar4;
        this.e = agowVar5;
        this.f = agowVar6;
        this.m = agowVar7;
        this.g = hagVar;
        this.h = yrxVar;
        this.n = set;
        this.i = ((Boolean) agowVar7.a()).booleanValue() ? new HashSet() : new HashSet((Collection) agowVar2.a());
        this.j = new ahnm(true);
        this.o = new LinkedHashMap();
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.p = string;
    }

    static /* synthetic */ ahrs h(gyv gyvVar, Integer num, int i) {
        if (1 == (i & 1)) {
            num = null;
        }
        return gyvVar.i(num, null);
    }

    private final ahrs i(Integer num, Integer num2) {
        abxk abxkVar = ahrs.a;
        ahrq ahrqVar = new ahrq();
        ahrg ahrgVar = ahrg.a;
        ahrf ahrfVar = new ahrf();
        ahqx ahqxVarD = d();
        if ((ahrfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahrfVar.y();
        }
        ahrg ahrgVar2 = (ahrg) ahrfVar.b;
        ahrgVar2.c = ahqxVarD;
        ahrgVar2.b |= 1;
        if (num != null) {
            int iIntValue = num.intValue();
            if ((ahrfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahrfVar.y();
            }
            ahrg ahrgVar3 = (ahrg) ahrfVar.b;
            ahrgVar3.b |= 2;
            ahrgVar3.d = iIntValue;
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            if ((ahrfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahrfVar.y();
            }
            ahrg ahrgVar4 = (ahrg) ahrfVar.b;
            ahrgVar4.b |= 4;
            ahrgVar4.e = iIntValue2;
        }
        abxd abxdVarV = ahrfVar.v();
        abxdVarV.getClass();
        ahrg ahrgVar5 = (ahrg) abxdVarV;
        if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahrqVar.y();
        }
        ahrs ahrsVar = (ahrs) ahrqVar.b;
        ahrsVar.g = ahrgVar5;
        ahrsVar.f = 6;
        return ahta.a(ahrqVar);
    }

    @Override // defpackage.gyj
    public final synchronized void a() {
        Integer num;
        int size = (this.n != null ? 1 : 0) + this.i.size();
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/platform/init/InitSystem", "start", 160, "InitSystem.kt")).x("Processing %s tasks", new qsg(size));
        yrx yrxVar = this.h;
        agow agowVar = this.l;
        yrn yrnVarC = yrn.c(yrxVar);
        if (((Boolean) agowVar.a()).booleanValue()) {
            gfl gflVarA = ((gfn) this.e.a()).b(rpm.T()).a(this.p);
            gflVarA.g(h(this, Integer.valueOf(size), 2));
            gflVarA.c();
        }
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/platform/init/InitSystem", "runCriticalTasks", 190, "InitSystem.kt")).x("Running %s critical task(s)", new qsg(this.n != null ? 1 : 0));
        Set<glu> set = this.n;
        if (set != null) {
            for (glu gluVar : set) {
                gyn gynVar = new gyn(this, gluVar);
                gynVar.c();
                zdv zdvVar = (zdv) zdyVar.b().q("com/google/android/apps/tvsearch/platform/init/InitSystem", "run", 207, "InitSystem.kt");
                gyx gyxVar = gluVar.b;
                zdvVar.x("%s running", new qsk(gyxVar));
                gynVar.b();
                yrn yrnVarC2 = yrn.c(yrxVar);
                qpk qpkVar = (qpk) gluVar.a.a();
                qpkVar.d();
                qpkVar.h();
                Duration durationOfNanos = Duration.ofNanos(yrnVarC2.b());
                durationOfNanos.getClass();
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/platform/init/InitSystem", "run", 214, "InitSystem.kt")).I("%s ran in %s seconds & %s milliseconds", new qsk(gyxVar), new qsg(durationOfNanos.getSeconds()), new qsg(durationOfNanos.toMillisPart()));
                gynVar.a(abqb.OK);
            }
        }
        Duration durationOfNanos2 = Duration.ofNanos(yrnVarC.b());
        durationOfNanos2.getClass();
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/platform/init/InitSystem", "runCriticalTasks", 195, "InitSystem.kt")).F("All critical tasks run in %s seconds & %s milliseconds", new qsg(durationOfNanos2.toSeconds()), new qsg(durationOfNanos2.toMillisPart()));
        Set set2 = this.n;
        if (((Boolean) agowVar.a()).booleanValue()) {
            gfl gflVarA2 = ((gfn) this.e.a()).a(rpm.R()).a(this.p);
            Integer num2 = set2 != null ? 1 : null;
            if (set2 != null) {
                Iterator it = set2.iterator();
                if (it.hasNext()) {
                    num = Integer.MAX_VALUE;
                    while (it.hasNext()) {
                        if (num.compareTo((Integer) Integer.MAX_VALUE) > 0) {
                            num = Integer.MAX_VALUE;
                        }
                    }
                    gflVarA2.g(i(num2, num));
                    gflVarA2.c();
                } else {
                    num = null;
                    gflVarA2.g(i(num2, num));
                    gflVarA2.c();
                }
            } else {
                num = null;
                gflVarA2.g(i(num2, num));
                gflVarA2.c();
            }
        }
        this.n = null;
        if (((Boolean) this.m.a()).booleanValue()) {
            ahal.e(this.k, null, 0, new gyt(this, yrnVarC, null), 3);
        } else {
            ahal.e(this.k, null, 0, new gyu(this, c(yrnVarC), yrnVarC, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r6, defpackage.yrn r7, defpackage.agsw r8) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyv.b(java.util.List, yrn, agsw):java.lang.Object");
    }

    public final List c(yrn yrnVar) {
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.i;
        for (Object obj : hashSet) {
            gyi gyiVar = (gyi) obj;
            if (gyiVar.e().isEmpty()) {
                Objects.toString(gyiVar);
                throw new IllegalStateException(String.valueOf(gyiVar).concat(" must have at least one processId"));
            }
            if (gyiVar.e().contains(this.g) && gyiVar.f() == 1) {
                arrayList.add(obj);
            }
        }
        hashSet.clear();
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/platform/init/InitSystem", "launchStartupAsyncTasks", 229, "InitSystem.kt")).x("Launching %s async tasks", new qsg(arrayList.size()));
        List<gyi> listW = agqq.w(agqq.w(arrayList, new gyq()), new gyr());
        agow agowVar = this.l;
        if (((Boolean) agowVar.a()).booleanValue()) {
            gfl gflVarA = ((gfn) this.e.a()).a(rpm.Q()).a(this.p);
            Integer numValueOf2 = Integer.valueOf(listW.size());
            Iterator it = listW.iterator();
            if (it.hasNext()) {
                numValueOf = Integer.valueOf(((gyi) it.next()).a());
                while (it.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf(((gyi) it.next()).a());
                    if (numValueOf.compareTo(numValueOf3) > 0) {
                        numValueOf = numValueOf3;
                    }
                }
            } else {
                numValueOf = null;
            }
            gflVarA.g(i(numValueOf2, numValueOf));
            gflVarA.c();
        }
        for (gyi gyiVar2 : listW) {
            gyn gynVar = new gyn(this, gyiVar2);
            gynVar.c();
            Object objComputeIfAbsent = Map.EL.computeIfAbsent(this.o, gyiVar2.b(), new Function() { // from class: gyk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo116andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    ((gyx) obj2).getClass();
                    return new ArrayList();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            objComputeIfAbsent.getClass();
            ((Collection) objComputeIfAbsent).add(ahal.e(this.k, null, 0, new gys(gyiVar2, this, gynVar, null), 3));
        }
        Duration durationOfNanos = Duration.ofNanos(yrnVar.b());
        durationOfNanos.getClass();
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/platform/init/InitSystem", "launchStartupAsyncTasks", 245, "InitSystem.kt")).F("All async tasks launched in %s seconds & %s milliseconds", new qsg(durationOfNanos.getSeconds()), new qsg(durationOfNanos.toMillisPart()));
        int size = arrayList.size();
        if (((Boolean) agowVar.a()).booleanValue()) {
            gfl gflVarA2 = ((gfn) this.e.a()).a(rpm.U()).a(this.p);
            gflVarA2.g(h(this, Integer.valueOf(size), 2));
            gflVarA2.c();
        }
        return arrayList;
    }

    public final ahqx d() {
        ahqx ahqxVar = ahqx.a;
        ahqv ahqvVar = new ahqv();
        String strName = this.g.name();
        strName.getClass();
        if ((ahqvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqvVar.y();
        }
        ahqx ahqxVar2 = (ahqx) ahqvVar.b;
        ahqxVar2.b |= 1;
        ahqxVar2.c = strName;
        if ((ahqvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqvVar.y();
        }
        ahqx ahqxVar3 = (ahqx) ahqvVar.b;
        ahqxVar3.d = 1;
        ahqxVar3.b |= 2;
        abxd abxdVarV = ahqvVar.v();
        abxdVarV.getClass();
        return (ahqx) abxdVarV;
    }

    public final void e() {
        if (((Boolean) this.l.a()).booleanValue()) {
            gfg gfgVarA = ((gfn) this.e.a()).c(rpm.eb()).a(this.p);
            gfgVarA.f(h(this, null, 3));
            gfgVarA.c(abqb.OK);
        }
    }

    @Override // defpackage.gyy
    public final synchronized boolean f(gyx... gyxVarArr) {
        boolean z;
        z = true;
        if (!((Boolean) this.m.a()).booleanValue() || !this.j.a()) {
            List<ahdl> list = (List) this.o.get(gyxVarArr[0]);
            if (list == null) {
                z = false;
                break;
            }
            if (!list.isEmpty()) {
                for (ahdl ahdlVar : list) {
                    if (ahdlVar.fB() || ahdlVar.v()) {
                        z = false;
                        break;
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (defpackage.ahah.b(r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007c -> B:32:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008d -> B:32:0x0090). Please report as a decompilation issue!!! */
    @Override // defpackage.gyy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.gyx[] r8, defpackage.agsw r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.gyo
            if (r0 == 0) goto L13
            r0 = r9
            gyo r0 = (defpackage.gyo) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            gyo r0 = new gyo
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            agtg r1 = defpackage.agtg.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r8 = r0.c
            int r2 = r0.b
            gyx[] r5 = r0.g
            defpackage.agpl.b(r9)
            goto L90
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.a
            gyx[] r2 = r0.g
            defpackage.agpl.b(r9)
            goto L68
        L40:
            defpackage.agpl.b(r9)
            agow r9 = r7.m
            java.lang.Object r9 = r9.a()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6c
            ahni r9 = r7.j
            boolean r2 = r9.a()
            if (r2 == 0) goto L6c
            r0.g = r8
            r0.a = r9
            r0.f = r4
            java.lang.Object r2 = r9.b(r0)
            if (r2 != r1) goto L66
            goto L8f
        L66:
            r2 = r8
            r8 = r9
        L68:
            r8.d()
            r8 = r2
        L6c:
            int r9 = r8.length
            r2 = 0
            r5 = r8
            r8 = r9
        L70:
            if (r2 >= r8) goto L92
            r9 = r5[r2]
            java.util.Map r6 = r7.o
            java.lang.Object r9 = r6.get(r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L90
            r0.g = r5
            r6 = 0
            r0.a = r6
            r0.b = r2
            r0.c = r8
            r0.f = r3
            java.lang.Object r9 = defpackage.ahah.b(r9, r0)
            if (r9 != r1) goto L90
        L8f:
            return r1
        L90:
            int r2 = r2 + r4
            goto L70
        L92:
            agpu r8 = defpackage.agpu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyv.g(gyx[], agsw):java.lang.Object");
    }
}
