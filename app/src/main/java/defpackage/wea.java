package defpackage;

import android.util.Log;
import com.google.protobuf.MessageLite;
import j$.time.Instant;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wea {
    public static final wdt a = new wdt();
    public final int b;
    public final zyg c;
    public final Set d;
    public final wcm e;
    public final agow f;
    public final agow g;
    public final rfr h;
    public final agow i;
    public final wek j;
    public final wdx k;
    public final String l;
    public final mfw m;
    public final agvb n;
    public final agow o;
    public final Executor p;
    public final yrp q;
    public final ujk r;
    public final agow s;
    public final zvh t;
    public final agum u;
    public final vrf v;
    public final String w;
    public final agpc x;
    public final agpc y;
    private final agpc z;

    public wea(int i, zyg zygVar, mcw mcwVar, Set set, wcm wcmVar, agow agowVar, agow agowVar2, rfr rfrVar, agow agowVar3, wek wekVar, wdx wdxVar, String str, final mfw mfwVar, agvb agvbVar, agow agowVar4, Executor executor, yrp yrpVar, ujk ujkVar, agow agowVar5, zvh zvhVar, agum agumVar) {
        zygVar.getClass();
        mcwVar.getClass();
        set.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        rfrVar.getClass();
        agowVar3.getClass();
        wdxVar.getClass();
        str.getClass();
        this.b = i;
        this.c = zygVar;
        this.d = set;
        this.e = wcmVar;
        this.f = agowVar;
        this.g = agowVar2;
        this.h = rfrVar;
        this.i = agowVar3;
        this.j = wekVar;
        this.k = wdxVar;
        this.l = str;
        this.m = mfwVar;
        this.n = agvbVar;
        this.o = agowVar4;
        this.p = executor;
        this.q = yrpVar;
        this.r = ujkVar;
        this.s = agowVar5;
        this.t = zvhVar;
        this.u = agumVar;
        Boolean bool = true;
        bool.getClass();
        this.v = new vrf(new zvh() { // from class: wde
            /* JADX WARN: Removed duplicated region for block: B:21:0x00e6 A[Catch: abxv -> 0x0180, FileNotFoundException -> 0x0193, Exception -> 0x01c4, TryCatch #4 {abxv -> 0x0180, FileNotFoundException -> 0x0193, blocks: (B:19:0x00ba, B:21:0x00e6, B:22:0x00e9, B:24:0x0105, B:25:0x0108, B:27:0x011b, B:28:0x011e, B:30:0x0147, B:32:0x014d, B:34:0x0153), top: B:52:0x00ba, outer: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0105 A[Catch: abxv -> 0x0180, FileNotFoundException -> 0x0193, Exception -> 0x01c4, TryCatch #4 {abxv -> 0x0180, FileNotFoundException -> 0x0193, blocks: (B:19:0x00ba, B:21:0x00e6, B:22:0x00e9, B:24:0x0105, B:25:0x0108, B:27:0x011b, B:28:0x011e, B:30:0x0147, B:32:0x014d, B:34:0x0153), top: B:52:0x00ba, outer: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x011b A[Catch: abxv -> 0x0180, FileNotFoundException -> 0x0193, Exception -> 0x01c4, TryCatch #4 {abxv -> 0x0180, FileNotFoundException -> 0x0193, blocks: (B:19:0x00ba, B:21:0x00e6, B:22:0x00e9, B:24:0x0105, B:25:0x0108, B:27:0x011b, B:28:0x011e, B:30:0x0147, B:32:0x014d, B:34:0x0153), top: B:52:0x00ba, outer: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0152  */
            @Override // defpackage.zvh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.zyd a() {
                /*
                    Method dump skipped, instructions count: 543
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wde.a():zyd");
            }
        }, new Executor() { // from class: wdf
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                mfwVar.d(runnable);
            }
        });
        String strB = rff.b(str);
        strB.getClass();
        this.w = strB;
        this.x = new agpn(new agum() { // from class: wdg
            @Override // defpackage.agum
            public final Object a() {
                wea weaVar = this.a;
                return Boolean.valueOf(weaVar.d.contains(weaVar.w));
            }
        });
        this.z = new agpn(new agum() { // from class: wdh
            @Override // defpackage.agum
            public final Object a() {
                wea weaVar = this.a;
                return weaVar.h.f.c(weaVar.e.a(weaVar.l));
            }
        });
        this.y = new agpn(new agum() { // from class: wdi
            @Override // defpackage.agum
            public final Object a() {
                return zdy.h("com/google/apps/tiktok/experiments/phenotype/MendelPackageState");
            }
        });
    }

    public final rml a() {
        Object objA = this.z.a();
        objA.getClass();
        return (rml) objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0071 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yyr b(defpackage.yzw r14, java.util.Set r15) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wea.b(yzw, java.util.Set):yyr");
    }

    public final yyr c(vzv vzvVar) {
        wag wagVarC;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object objA = this.o.a();
        objA.getClass();
        wah wahVar = (wah) objA;
        for (final vzz vzzVar : vzvVar.f) {
            final wag wagVarA = wahVar.a(vzzVar.e);
            if (wagVarA != null) {
                int i = vzzVar.c;
                if (vzy.b(i) != wagVarA.d) {
                    throw new IllegalStateException("Attempting to set a " + wagVarA + " type flag with a " + ((Object) vzy.a(vzy.b(i))) + " value");
                }
                String str = vzzVar.e;
                vzzVar.getClass();
                int iB = vzy.b(i);
                if (iB == 0) {
                    throw null;
                }
                switch (iB - 1) {
                    case 0:
                        wagVarC = wag.a.c(i == 1 ? ((Long) vzzVar.d).longValue() : 0L);
                        break;
                    case 1:
                        wagVarC = wag.a.a(i == 2 ? ((Boolean) vzzVar.d).booleanValue() : false, false);
                        break;
                    case 2:
                        wagVarC = wag.a.b(i == 3 ? ((Double) vzzVar.d).doubleValue() : 0.0d);
                        break;
                    case 3:
                        waf wafVar = wag.a;
                        String str2 = i == 4 ? (String) vzzVar.d : "";
                        str2.getClass();
                        wagVarC = wafVar.e(str2);
                        break;
                    case 4:
                        wagVarC = new wag(new agum() { // from class: wdq
                            @Override // defpackage.agum
                            public final Object a() {
                                vzz vzzVar2 = vzzVar;
                                abvo abvoVar = vzzVar2.c == 5 ? (abvo) vzzVar2.d : abvo.b;
                                abvoVar.getClass();
                                return abvoVar;
                            }
                        }, 5, false, 4);
                        break;
                    case 5:
                        waf wafVar2 = wag.a;
                        agum agumVar = new agum() { // from class: wdr
                            @Override // defpackage.agum
                            public final Object a() {
                                wag wagVar = wagVarA;
                                vzz vzzVar2 = vzzVar;
                                try {
                                    MessageLite messageLite = wagVar.b;
                                    messageLite.getClass();
                                    abyq abyqVarCy = messageLite.cy();
                                    abyqVarCy.r(vzzVar2.c == 6 ? (abvo) vzzVar2.d : abvo.b);
                                    MessageLite messageLiteV = abyqVarCy.v();
                                    messageLiteV.getClass();
                                    return messageLiteV;
                                } catch (abxv e) {
                                    Log.e("MendelPackageState", "Failed to parse flag", e);
                                    return wagVar.b();
                                } catch (RuntimeException e2) {
                                    Log.e("MendelPackageState", "Failed to parse flag", e2);
                                    return wagVar.b();
                                }
                            }
                        };
                        MessageLite messageLite = wagVarA.b;
                        messageLite.getClass();
                        wagVarC = wafVar2.d(agumVar, messageLite);
                        break;
                    case 6:
                        throw new IllegalStateException("No known flag type");
                    default:
                        throw new agpg();
                }
                linkedHashMap.put(str, wagVarC);
            }
        }
        zdl it = wahVar.b.keySet().iterator();
        it.getClass();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!linkedHashMap.containsKey(str3)) {
                wag wagVarA2 = wahVar.a(str3);
                wagVarA2.getClass();
                linkedHashMap.put(str3, wagVarA2);
            }
        }
        yyr yyrVarJ = yyr.j(linkedHashMap);
        yyrVarJ.getClass();
        return yyrVarJ;
    }

    public final void d(rgo rgoVar) {
        if (a().d) {
            String str = this.l;
            if ((rgoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rgoVar.y();
            }
            rgs rgsVar = (rgs) rgoVar.b;
            rgs rgsVar2 = rgs.a;
            rgsVar.b |= 4;
            rgsVar.e = str;
        }
    }

    public final boolean e() {
        try {
            vrf vrfVar = this.v;
            if (vrfVar.d.isDone()) {
                return ((wcp) zxn.o(vrfVar.b())).d();
            }
            return false;
        } catch (ExecutionException unused) {
            return false;
        }
    }

    public final wdu f(int i) {
        rgs rgsVar = rgs.a;
        rgo rgoVar = new rgo();
        rgr rgrVar = rgr.a;
        rgp rgpVar = new rgp();
        if ((rgpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rgpVar.y();
        }
        rgr rgrVar2 = (rgr) rgpVar.b;
        rgrVar2.c = 1;
        rgrVar2.b = 1 | rgrVar2.b;
        if ((rgpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rgpVar.y();
        }
        rgr rgrVar3 = (rgr) rgpVar.b;
        rgrVar3.d = rgq.a(i);
        rgrVar3.b |= 2;
        if ((rgoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rgoVar.y();
        }
        rgs rgsVar2 = (rgs) rgoVar.b;
        rgr rgrVar4 = (rgr) rgpVar.v();
        rgrVar4.getClass();
        rgsVar2.d = rgrVar4;
        rgsVar2.b |= 2;
        d(rgoVar);
        agvb agvbVar = this.n;
        zcq zcqVar = zcq.d;
        zcqVar.getClass();
        yyr yyrVarB = b(zcqVar, agrf.a);
        abvo abvoVar = abvo.b;
        long epochMilli = Instant.now().toEpochMilli();
        abxd abxdVarV = rgoVar.v();
        abxdVarV.getClass();
        return new wdu((wcp) agvbVar.a(yyrVarB, new wdw("", abvoVar, epochMilli, (rgs) abxdVarV)), i);
    }
}
