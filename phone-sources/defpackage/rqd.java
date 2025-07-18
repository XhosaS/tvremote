package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqd {
    public final rqb a;
    public final yfo b;
    public final rvq c;
    public final yfo d;
    public final xbw e;
    private final rne f;
    private final Executor g;

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, yfo] */
    public rqd(rqb rqbVar, yfo yfoVar, rne rneVar, unc uncVar, yfo yfoVar2, Executor executor, xbw xbwVar, yfo yfoVar3) {
        this.a = rqbVar;
        this.f = rneVar;
        this.b = yfoVar;
        this.g = executor;
        this.d = new lii(yfoVar2, 9);
        Context context = (Context) ((xcn) uncVar.d).a;
        Executor executor2 = (Executor) uncVar.a.b();
        executor2.getClass();
        rvt rvtVar = (rvt) uncVar.c.b();
        rvtVar.getClass();
        ((Boolean) uncVar.b.b()).booleanValue();
        this.c = new rvq(context, executor2, rvtVar, xbwVar, true, (tst) ((xcn) uncVar.f).a, yfoVar3, ((rvn) uncVar.e).b());
        this.e = xbwVar;
    }

    public final long a(String str) {
        if (!this.f.a) {
            rvq rvqVar = this.c;
            if (rvqVar.c.b()) {
                return -1L;
            }
            boolean z = rvqVar.b;
            rvu rvuVar = rvqVar.a;
            if (z) {
                return rvuVar.a(str);
            }
        }
        return -1L;
    }

    public final uhp b(final rqa rqaVar) {
        return this.f.a ? sfy.A() : sfy.G(new ufv() { // from class: rqc
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ttm] */
            /* JADX WARN: Type inference failed for: r4v104, types: [java.lang.Object, ttm] */
            /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, yfo] */
            /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object, yfo] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, yfo] */
            @Override // defpackage.ufv
            public final uhp a() {
                zah zahVarC;
                String strC;
                int i;
                rqa rqaVar2 = rqaVar;
                boolean z = rqaVar2.g;
                rqd rqdVar = this.a;
                if (z) {
                    vtw vtwVarM = zah.a.m();
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    zah zahVar = (zah) vtwVarM.b;
                    zahVar.d = 2;
                    zahVar.b |= 4;
                    zahVarC = (zah) vtwVarM.r();
                } else {
                    Long l = rqaVar2.f;
                    rvq rvqVar = rqdVar.c;
                    boolean z2 = rvqVar.b;
                    rvu rvuVar = rvqVar.a;
                    zahVarC = z2 ? rvuVar.c(l) : rvuVar.e();
                }
                if (zahVarC.c == -1) {
                    return uhl.a;
                }
                rqg rqgVar = (rqg) rqdVar.b.b();
                zba zbaVar = rqaVar2.c;
                RuntimeException runtimeException = null;
                vtw vtwVar = (vtw) zbaVar.a(5, null);
                vtwVar.x(zbaVar);
                vtw vtwVarM2 = zak.a.m();
                int i2 = rqgVar.k;
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar = vtwVarM2.b;
                zak zakVar = (zak) vucVar;
                zakVar.e = i2 - 1;
                zakVar.b |= 4;
                String str = rqgVar.b;
                if (str != null) {
                    if (!vucVar.A()) {
                        vtwVarM2.u();
                    }
                    zak zakVar2 = (zak) vtwVarM2.b;
                    zakVar2.b |= 1;
                    zakVar2.c = str;
                }
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar2 = vtwVarM2.b;
                zak zakVar3 = (zak) vucVar2;
                zakVar3.b |= 8;
                zakVar3.f = 770518479L;
                String str2 = rqgVar.d;
                if (str2 != null) {
                    if (!vucVar2.A()) {
                        vtwVarM2.u();
                    }
                    zak zakVar4 = (zak) vtwVarM2.b;
                    zakVar4.b |= 2;
                    zakVar4.d = str2;
                }
                yzn yznVar = zbaVar.f;
                if (yznVar == null) {
                    yznVar = yzn.a;
                }
                zag zagVar = yznVar.d;
                if (zagVar == null) {
                    zagVar = zag.a;
                }
                zaf zafVar = zagVar.c;
                if (zafVar == null) {
                    zafVar = zaf.a;
                }
                if ((zafVar.b & 8) == 0 || !((Boolean) rqgVar.f.b()).booleanValue()) {
                    strC = rqgVar.c;
                } else {
                    yzn yznVar2 = zbaVar.f;
                    if (yznVar2 == null) {
                        yznVar2 = yzn.a;
                    }
                    zag zagVar2 = yznVar2.d;
                    if (zagVar2 == null) {
                        zagVar2 = zag.a;
                    }
                    zaf zafVar2 = zagVar2.c;
                    if (zafVar2 == null) {
                        zafVar2 = zaf.a;
                    }
                    strC = rpd.c(str, zafVar2.f);
                }
                if (strC != null) {
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    zak zakVar5 = (zak) vtwVarM2.b;
                    zakVar5.b |= 16;
                    zakVar5.g = strC;
                }
                vvd vvdVar = rqgVar.m;
                if (((zbaVar.b & 64) != 0 && ((Boolean) vvdVar.a.b()).booleanValue()) || (((zbaVar.b & 131072) != 0 && ((Boolean) vvdVar.d.b()).booleanValue()) || ((Boolean) vvdVar.c.b()).booleanValue())) {
                    tst tstVar = (tst) ((ulp) vvdVar.b).a.get();
                    if (tstVar.g()) {
                        String str3 = (String) tstVar.c();
                        if (str3.equals("com.android.vending")) {
                            if (!vtwVarM2.b.A()) {
                                vtwVarM2.u();
                            }
                            zak zakVar6 = (zak) vtwVarM2.b;
                            zakVar6.b |= 64;
                            zakVar6.h = true;
                        } else {
                            if (!vtwVarM2.b.A()) {
                                vtwVarM2.u();
                            }
                            zak zakVar7 = (zak) vtwVarM2.b;
                            zakVar7.b |= 128;
                            zakVar7.i = str3;
                        }
                    }
                }
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                zba zbaVar2 = (zba) vtwVar.b;
                zak zakVar8 = (zak) vtwVarM2.r();
                zakVar8.getClass();
                zbaVar2.u = zakVar8;
                zbaVar2.b |= 8388608;
                if (osx.g(rqgVar.a)) {
                    vtw vtwVarM3 = zar.a.m();
                    long freeSpace = rqgVar.l.d().getFreeSpace() / 1024;
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    zar zarVar = (zar) vtwVarM3.b;
                    zarVar.b |= 1;
                    zarVar.c = freeSpace;
                    long jLongValue = ((Long) rqgVar.e.get()).longValue();
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    zar zarVar2 = (zar) vtwVarM3.b;
                    zarVar2.b |= 2;
                    zarVar2.d = jLongValue;
                    if (!vtwVar.b.A()) {
                        vtwVar.u();
                    }
                    zba zbaVar3 = (zba) vtwVar.b;
                    zar zarVar3 = (zar) vtwVarM3.r();
                    zarVar3.getClass();
                    zbaVar3.w = zarVar3;
                    zbaVar3.b |= 33554432;
                }
                if (!TextUtils.isEmpty(null)) {
                    zaj zajVar = zbaVar.y;
                    if (zajVar == null) {
                        zajVar = zaj.a;
                    }
                    vtw vtwVar2 = (vtw) zajVar.a(5, null);
                    vtwVar2.x(zajVar);
                    if (((zaj) vtwVar2.b).c.isEmpty()) {
                        if (!vtwVar2.b.A()) {
                            vtwVar2.u();
                        }
                        throw null;
                    }
                    String str4 = ((String) null) + "::" + ((zaj) vtwVar2.b).c;
                    if (!vtwVar2.b.A()) {
                        vtwVar2.u();
                    }
                    zaj zajVar2 = (zaj) vtwVar2.b;
                    zajVar2.b |= 1;
                    zajVar2.c = str4;
                    if (!vtwVar.b.A()) {
                        vtwVar.u();
                    }
                    zba zbaVar4 = (zba) vtwVar.b;
                    zaj zajVar3 = (zaj) vtwVar2.r();
                    zajVar3.getClass();
                    zbaVar4.y = zajVar3;
                    zbaVar4.b |= 134217728;
                }
                if (rqaVar2.k != null && rqgVar.g.g()) {
                    int i3 = rqaVar2.l;
                    ArrayList arrayList = new ArrayList();
                    Collections.sort(arrayList, new qbi(4));
                    vtw vtwVarM4 = zaq.a.m();
                    ArrayList arrayList2 = new ArrayList();
                    int iMax = Math.max(arrayList.size() - i3, 0);
                    if (iMax < arrayList.size()) {
                        Object obj = ((cb) arrayList.get(iMax)).a;
                        throw null;
                    }
                    rof rofVar = new rof((zaq) vtwVarM4.r(), ImmutableList.copyOf((Collection) arrayList2));
                    zaq zaqVar = rofVar.a;
                    if (!vtwVar.b.A()) {
                        vtwVar.u();
                    }
                    vuc vucVar3 = vtwVar.b;
                    zba zbaVar5 = (zba) vucVar3;
                    zbaVar5.r = zaqVar;
                    zbaVar5.b |= 4194304;
                    ImmutableList immutableList = rofVar.b;
                    if (!vucVar3.A()) {
                        vtwVar.u();
                    }
                    zba zbaVar6 = (zba) vtwVar.b;
                    vun vunVar = zbaVar6.s;
                    if (!vunVar.c()) {
                        zbaVar6.s = vuc.s(vunVar);
                    }
                    vsf.h(immutableList, zbaVar6.s);
                }
                tst tstVar2 = rqgVar.h;
                if (tstVar2.g() && rqaVar2.i && (i = rqaVar2.j) > 0) {
                    if (((Boolean) rqgVar.j.b()).booleanValue()) {
                        ImmutableList immutableListC = ((ruq) tstVar2.c()).c();
                        if (!immutableListC.isEmpty()) {
                            vtwVar.bs(Lists.transform(rqg.a(immutableListC, i), new rke(8)));
                        }
                    } else {
                        ImmutableList immutableListD = ((ruq) tstVar2.c()).d();
                        if (!immutableListD.isEmpty()) {
                            vtwVar.bs(Lists.transform(rqg.a(immutableListD, i), new rke(9)));
                        }
                    }
                }
                if (rqaVar2.h != null) {
                    throw null;
                }
                tst tstVar3 = rqgVar.i;
                if (tstVar3.g()) {
                    ImmutableList immutableListA = ((rpy) tstVar3.c()).a();
                    if (!vtwVar.b.A()) {
                        vtwVar.u();
                    }
                    zba zbaVar7 = (zba) vtwVar.b;
                    vun vunVar2 = zbaVar7.t;
                    if (!vunVar2.c()) {
                        zbaVar7.t = vuc.s(vunVar2);
                    }
                    vsf.h(immutableListA, zbaVar7.t);
                }
                zba zbaVar8 = (zba) vtwVar.r();
                vtw vtwVar3 = (vtw) zbaVar8.a(5, null);
                vtwVar3.x(zbaVar8);
                if (!vtwVar3.b.A()) {
                    vtwVar3.u();
                }
                vuc vucVar4 = vtwVar3.b;
                zba zbaVar9 = (zba) vucVar4;
                zahVarC.getClass();
                zbaVar9.p = zahVarC;
                zbaVar9.b |= 2097152;
                String str5 = rqaVar2.a;
                if (rqaVar2.b) {
                    if (str5 != null) {
                        if (!vucVar4.A()) {
                            vtwVar3.u();
                        }
                        zba zbaVar10 = (zba) vtwVar3.b;
                        zbaVar10.b |= 4;
                        zbaVar10.e = str5;
                    } else {
                        if (!vucVar4.A()) {
                            vtwVar3.u();
                        }
                        zba zbaVar11 = (zba) vtwVar3.b;
                        zbaVar11.b &= -5;
                        zbaVar11.e = zba.a.e;
                    }
                } else if (str5 != null) {
                    if (!vucVar4.A()) {
                        vtwVar3.u();
                    }
                    zba zbaVar12 = (zba) vtwVar3.b;
                    zbaVar12.b |= 2;
                    zbaVar12.d = str5;
                } else {
                    if (!vucVar4.A()) {
                        vtwVar3.u();
                    }
                    zba zbaVar13 = (zba) vtwVar3.b;
                    zbaVar13.b &= -3;
                    zbaVar13.d = zba.a.d;
                }
                rqdVar.d.b();
                yzi yziVar = yzi.a;
                vty vtyVar = (vty) yziVar.m();
                yzi yziVar2 = rqaVar2.d;
                ((rpf) rqdVar.e.b()).c();
                if (yziVar2 != null) {
                    vtyVar.x(yziVar2);
                }
                if (!((yzi) vtyVar.r()).equals(yziVar)) {
                    if (!vtwVar3.b.A()) {
                        vtwVar3.u();
                    }
                    zba zbaVar14 = (zba) vtwVar3.b;
                    yzi yziVar3 = (yzi) vtyVar.r();
                    yziVar3.getClass();
                    zbaVar14.x = yziVar3;
                    zbaVar14.b |= 67108864;
                }
                String str6 = rqaVar2.e;
                if (str6 != null) {
                    vtw vtwVarM5 = zaj.a.m();
                    if (!vtwVarM5.b.A()) {
                        vtwVarM5.u();
                    }
                    zaj zajVar4 = (zaj) vtwVarM5.b;
                    zajVar4.b |= 1;
                    zajVar4.c = str6;
                    if (!vtwVar3.b.A()) {
                        vtwVar3.u();
                    }
                    zba zbaVar15 = (zba) vtwVar3.b;
                    zaj zajVar5 = (zaj) vtwVarM5.r();
                    zajVar5.getClass();
                    zbaVar15.y = zajVar5;
                    zbaVar15.b |= 134217728;
                }
                rqb rqbVar = rqdVar.a;
                zba zbaVar16 = (zba) vtwVar3.r();
                ImmutableList immutableList2 = (ImmutableList) rqbVar.a.get();
                ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(immutableList2.size());
                UnmodifiableIterator it = immutableList2.iterator();
                while (it.hasNext()) {
                    try {
                        builderBuilderWithExpectedSize.add((ImmutableList.Builder) ((rvy) it.next()).b(zbaVar16));
                    } catch (RuntimeException e) {
                        ((tug) ((tug) ((tug) rnb.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", '<', "MetricDispatcher.java")).s("One transmitter failed to send message");
                        if (runtimeException == null) {
                            runtimeException = e;
                        } else {
                            runtimeException.addSuppressed(e);
                        }
                    }
                }
                if (runtimeException != null) {
                    throw runtimeException;
                }
                uhp uhpVarA = sfy.O(builderBuilderWithExpectedSize.build()).a(new oym(2), ugk.a);
                rqdVar.c.c.a();
                return uhpVarA;
            }
        }, this.g);
    }

    public final boolean c(String str) {
        return a(str) != -1;
    }

    public final boolean d() {
        rvq rvqVar = this.c;
        return rvqVar.b && rvqVar.a.d();
    }
}
