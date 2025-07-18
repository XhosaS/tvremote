package defpackage;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyy extends RuntimeException {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("[^A-Za-z0-9 $\\-_\\.\\(\\)<>\\u00a0\\u00a1-\\u1fff\\u2000-\\u200a\\u2010-\\u2027\\u202f\\u2030-\\ud7ff\\ue000-\\uffef\\u10000-\\u10ffff]+");

    public wyy(Throwable th, StackTraceElement[] stackTraceElementArr) {
        super("", th);
        setStackTrace(stackTraceElementArr);
    }

    public static zyd a(final zyd zydVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final wwq wwqVar = wum.c().c;
        final zyd zydVarI = zxn.i(zydVar);
        final zyd zydVarN = zxn.n(zydVarI, j, timeUnit, scheduledExecutorService);
        return zud.h(zydVarN, TimeoutException.class, new zvi() { // from class: wyw
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                TimeoutException timeoutException = (TimeoutException) obj;
                int i = wyy.a;
                zyd zydVar2 = zydVar;
                if (!zydVar2.isDone()) {
                    wwq wwqVar2 = wwqVar;
                    if (wwqVar2 != null) {
                        timeoutException.setStackTrace(wyy.k(wwqVar2, null));
                        wyy.h(wwqVar2, timeoutException);
                        wyy.f(wwqVar2, timeoutException);
                    }
                    zxn.r(zydVarI, zydVar2);
                }
                return zydVarN;
            }
        }, zwk.a);
    }

    public static RuntimeException b() {
        return new wyy(null, k(wum.c().c, null));
    }

    public static String c(String str) {
        return b.matcher(str).replaceAll("");
    }

    public static void d(Collection collection, StackTraceElement[] stackTraceElementArr) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).addSuppressed(new wyx(stackTraceElementArr));
        }
    }

    public static void e(yyr yyrVar) {
        yqt yqtVarH;
        boolean z = wum.a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = wum.b;
        synchronized (weakHashMap) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                wwq wwqVar = ((wwl) entry.getValue()).c;
                if (wwqVar != null) {
                    map.put((Thread) entry.getKey(), wwqVar);
                }
            }
        }
        yzo yzoVar = new yzo();
        Iterator it = yyrVar.keySet().iterator();
        while (it.hasNext()) {
            yzoVar.c(((wwq) it.next()).g());
        }
        yzq yzqVarF = yzoVar.f();
        int iC = Integer.MAX_VALUE;
        for (wwq wwqVar2 : yyrVar.keySet()) {
            if (wwqVar2 instanceof wzq) {
                wzq wzqVar = (wzq) wwqVar2;
                if (wzqVar.c() < iC) {
                    iC = wzqVar.c();
                }
            }
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            Thread thread = (Thread) entry2.getKey();
            wwq wwqVar3 = (wwq) entry2.getValue();
            if (thread != Thread.currentThread()) {
                if (yzqVarF.contains(wwqVar3.g())) {
                    wwq wwqVarA = wwqVar3;
                    while (wwqVarA != null && (!(wwqVarA instanceof wzq) || ((wzq) wwqVarA).c() >= iC)) {
                        if (map2.containsKey(wwqVarA)) {
                            wwqVarA = (wwq) map2.get(wwqVarA);
                            break;
                        } else if (yyrVar.containsKey(wwqVarA)) {
                            break;
                        } else {
                            wwqVarA = wwqVarA.a();
                        }
                    }
                    wwqVarA = null;
                    for (wwq wwqVarA2 = wwqVar3; wwqVarA2 != wwqVarA && !map2.containsKey(wwqVarA2); wwqVarA2 = wwqVarA2.a()) {
                        map2.put(wwqVarA2, wwqVarA);
                    }
                    yqtVarH = yqt.h(wwqVarA);
                } else {
                    yqtVarH = ypv.a;
                }
                if (yqtVarH.g()) {
                    Throwable th = (Throwable) yyrVar.get(yqtVarH.c());
                    meg megVar = new meg(thread);
                    megVar.addSuppressed(new wyy(null, k(wwqVar3, ((wwq) yqtVarH.c()).a())));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement("tk_trace", c(megVar.getMessage()), null, 0));
                    Collections.addAll(arrayList, megVar.getStackTrace());
                    arrayList.toArray(new StackTraceElement[0]);
                    th.addSuppressed(megVar);
                }
            }
        }
    }

    public static void f(wwq wwqVar, Throwable th) {
        if (wzg.c(wwqVar)) {
            e(yyr.k(wwqVar, th));
        }
    }

    public static void g(yyr yyrVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        zdl it = yyrVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            wwq wwqVar = (wwq) entry.getKey();
            if (wwqVar instanceof wzq) {
                wyr wyrVar = (wyr) map.get(((wwq) entry.getKey()).g());
                if (wyrVar == null) {
                    wyrVar = ((wtb) ((wzq) wwqVar).h()).c;
                    map.put(wwqVar.g(), wyrVar);
                }
                Map map3 = (Map) map2.get(wyrVar);
                if (map3 == null) {
                    map3 = new HashMap();
                    map2.put(wyrVar, map3);
                }
                map3.put(Integer.valueOf(((wzq) wwqVar).c()), (Throwable) entry.getValue());
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            wyr wyrVar2 = (wyr) entry2.getKey();
            int iIntValue = ((Integer) Collections.min(((Map) entry2.getValue()).keySet())).intValue();
            HashMap map4 = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = wyrVar2.e.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if ((((wvv) it2.next()).b & 32) == 0) {
                        break;
                    }
                } else {
                    arrayList.add(new StackTraceElement("tk_trace", "No unfinished spans when the app crashed:", null, 0));
                    break;
                }
            }
            wtn wtnVar = wyrVar2.h;
            if (wtnVar == null) {
                wtnVar = wtn.a;
            }
            if ((wtnVar.b & 1) != 0) {
                Locale locale = Locale.US;
                String str = ((wvv) wyrVar2.e.get(0)).c;
                wtn wtnVar2 = wyrVar2.h;
                if (wtnVar2 == null) {
                    wtnVar2 = wtn.a;
                }
                wtm wtmVar = wtnVar2.c;
                if (wtmVar == null) {
                    wtmVar = wtm.a;
                }
                arrayList.add(new StackTraceElement("tk_trace", c(String.format(locale, "Trace %s tried to log too many spans. %s spans dropped", str, Integer.valueOf(wtmVar.c))), null, 0));
            }
            if (arrayList.isEmpty()) {
                i(wyrVar2, (Map) entry2.getValue(), iIntValue, map4);
            } else {
                d(((Map) entry2.getValue()).values(), (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
    }

    public static void h(wwq wwqVar, Throwable th) {
        if (wzg.c(wwqVar)) {
            g(yyr.k(wwqVar, th));
        }
    }

    public static void i(wyr wyrVar, Map map, int i, Map map2) {
        int i2;
        int i3 = 0;
        for (wvv wvvVar : Lists.b(wyrVar.e)) {
            Integer numValueOf = null;
            if (i3 >= 10) {
                d(map.values(), new StackTraceElement[]{new StackTraceElement("tk_trace", "Suppressed exceptions exceeds the limit 10, additional unfinished spans will not be reported", null, 0)});
                return;
            }
            if ((wvvVar.b & 32) == 0 && !map2.containsKey(wvvVar)) {
                abxs abxsVar = wyrVar.e;
                Set setKeySet = map.keySet();
                boolean z = false;
                wvv wvvVar2 = wvvVar;
                while (!z) {
                    if (map2.containsKey(wvvVar2)) {
                        numValueOf = (Integer) map2.get(wvvVar2);
                    } else if (setKeySet.contains(Integer.valueOf(wvvVar2.d))) {
                        numValueOf = Integer.valueOf(wvvVar2.d);
                    } else {
                        int i4 = wvvVar2.e;
                        if (i4 >= i) {
                            wvvVar2 = (wvv) abxsVar.get(i4);
                        }
                    }
                    z = true;
                }
                boolean z2 = false;
                wvv wvvVar3 = wvvVar;
                while (!z2) {
                    if (!map2.containsKey(wvvVar3)) {
                        map2.put(wvvVar3, numValueOf);
                        if ((numValueOf == null || wvvVar3.e != numValueOf.intValue()) && (i2 = wvvVar3.e) >= 0) {
                            wvvVar3 = (wvv) abxsVar.get(i2);
                        }
                    }
                    z2 = true;
                }
                yqt yqtVarH = yqt.h(numValueOf);
                if (yqtVarH.g()) {
                    i3++;
                    Throwable th = (Throwable) map.get(yqtVarH.c());
                    abxs abxsVar2 = wyrVar.e;
                    int iIntValue = ((Integer) yqtVarH.c()).intValue();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(l(wvvVar));
                    while (wvvVar.d != iIntValue) {
                        wvvVar = (wvv) abxsVar2.get(wvvVar.e);
                        arrayList.add(l(wvvVar));
                    }
                    th.addSuppressed(new wyx((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
                }
            }
        }
    }

    public static void j(Throwable th) {
        wub.b(th);
        throw new wyy(th, k(wum.c().c, null));
    }

    public static StackTraceElement[] k(wwq wwqVar, wwq wwqVar2) {
        ArrayList arrayList = new ArrayList();
        for (wwq wwqVarA = wwqVar; wwqVarA != wwqVar2; wwqVarA = wwqVarA.a()) {
            arrayList.add(new StackTraceElement("tk_trace", c(wwqVarA.d()), null, 0));
        }
        if (wwqVar instanceof wtx) {
            arrayList.add(new StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    private static StackTraceElement l(wvv wvvVar) {
        String str;
        if ((wvvVar.b & 32) != 0) {
            str = " " + wvvVar.g + " ms";
        } else {
            str = "(unfinished)";
        }
        return new StackTraceElement("tk_trace", c(String.valueOf(wvvVar.c).concat(str)), null, 0);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
