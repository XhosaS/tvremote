package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wxv implements wxp, wso {
    public static final zdy a = zdy.h("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final agow b;
    public final ConcurrentMap c = new ConcurrentHashMap(2, 0.75f, 1);
    public final AtomicLong d;
    public final int e;
    public final int f;
    public final mcw g;
    private final wvh h;
    private final agow i;
    private final wun j;

    public wxv(wvh wvhVar, mcw mcwVar, agow agowVar, agow agowVar2, wun wunVar, Map map, Map map2) {
        this.h = wvhVar;
        this.g = mcwVar;
        this.b = agowVar;
        this.i = agowVar2;
        this.j = wunVar;
        if (map.isEmpty()) {
            this.e = 500;
        } else {
            yqw.B(((zcl) map).c == 1, "Please only specify the max number of spans once.");
            this.e = ((wuy) zag.f(((yyr) map).keySet())).a();
        }
        if (map2.isEmpty()) {
            this.f = 900000;
        } else {
            yqw.B(((zcl) map2).c == 1, "Please only specify the trace deadline limit once.");
            this.f = ((wxf) zag.f(((yyr) map2).keySet())).a();
        }
        this.d = new AtomicLong(this.f);
    }

    private final void f(wwq wwqVar, String str) {
        wtt wttVar;
        if (wwqVar == null || wwqVar == wvs.a || (wwqVar instanceof wvi) || wts.a == 1) {
            return;
        }
        if (wwqVar instanceof wtx) {
            String strL = wum.l(wwqVar);
            if (!"".equals(strL)) {
                strL = ": ".concat(String.valueOf(strL));
            }
            wttVar = new wtt(strL, str, ((wtx) wwqVar).c());
        } else {
            wttVar = new wtt(str);
        }
        wtt wttVar2 = wttVar;
        wttVar2.addSuppressed(wyy.b());
        if (wts.a != 3) {
            throw wttVar2;
        }
        ((zdv) ((zdv) ((zdv) wxo.a.c().o(zfi.a, "TraceManager")).p(wttVar2)).q("com/google/apps/tiktok/tracing/TraceManager", "reportDuplicateTraceException", (char) 133, "TraceManager.java")).u("Duplicate trace");
    }

    private final wwq g(String str, wwc wwcVar, long j, long j2, int i, int i2) {
        UUID uuidB = this.j.b();
        String strFc = wsn.fc(uuidB);
        uuidB.getLeastSignificantBits();
        wyr wyrVar = wyr.a;
        wyp wypVar = new wyp();
        long leastSignificantBits = uuidB.getLeastSignificantBits();
        if ((wypVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wypVar.y();
        }
        wyr wyrVar2 = (wyr) wypVar.b;
        wyrVar2.b |= 2;
        wyrVar2.d = leastSignificantBits;
        long mostSignificantBits = uuidB.getMostSignificantBits();
        if ((wypVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wypVar.y();
        }
        wyr wyrVar3 = (wyr) wypVar.b;
        wyrVar3.b |= 1;
        wyrVar3.c = mostSignificantBits;
        if ((wypVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wypVar.y();
        }
        wyr wyrVar4 = (wyr) wypVar.b;
        wyrVar4.b |= 4;
        wyrVar4.f = j;
        long j3 = j2 / 1000000;
        if ((wypVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wypVar.y();
        }
        wyr wyrVar5 = (wyr) wypVar.b;
        wyrVar5.b |= 8;
        wyrVar5.g = j3;
        if ((wypVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wypVar.y();
        }
        wyr wyrVar6 = (wyr) wypVar.b;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        wyrVar6.i = i3;
        wyrVar6.b |= 64;
        wyr wyrVar7 = (wyr) wypVar.v();
        long millis = i2 == 2 ? j2 : Duration.ofMillis(SystemClock.uptimeMillis()).toMillis() * 1000000;
        wzp wzpVar = new wzp(str, wwcVar, i);
        wzr wzrVar = new wzr(this, uuidB, strFc, wyrVar7, wzpVar, millis, false, this.g);
        wwl wwlVarC = wum.c();
        wvk wvkVar = new wvk(wzpVar, wzrVar, wwlVarC);
        wvh wvhVar = this.h;
        if (wvhVar.d.compareAndSet(false, true)) {
            wvhVar.c.execute(new wve(wvhVar));
        }
        wvg wvgVar = new wvg(wvkVar, wvhVar.b);
        wvh.a.put(wvgVar, true);
        wvf wvfVar = wvgVar.a;
        Executor executor = (Executor) this.b.a();
        wzrVar.f = wvfVar;
        wvfVar.d(wzrVar, executor);
        this.c.put(uuidB, wzrVar);
        wum.g(wwlVarC, wvkVar);
        return wvkVar;
    }

    @Override // defpackage.wso
    public final /* bridge */ /* synthetic */ List a() {
        wyv wyvVarB;
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            wzr wzrVar = (wzr) ((Map.Entry) it.next()).getValue();
            synchronized (wzrVar) {
                wyvVarB = wzrVar.b();
            }
            yyfVar.g(wyvVarB);
        }
        return yyfVar.f();
    }

    @Override // defpackage.wxp
    public final wvl b(String str, wwc wwcVar, int i, String str2, String str3) {
        final wwq wwqVar = wum.c().c;
        f(wwqVar, str);
        final wwq wwqVarG = g(str, wwcVar, Instant.now().toEpochMilli(), this.g.a(), 1, i);
        return wwqVar == ((wvk) wwqVarG).a ? wwqVarG : new wvl() { // from class: wxq
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wwqVarG.close();
                wum.g(wum.c(), wwqVar);
            }
        };
    }

    @Override // defpackage.wxp
    public final wvl c(wwc wwcVar, long j, long j2, int i, String str, String str2) {
        final wwq wwqVar = wum.c().c;
        f(wwqVar, "Application creation");
        final wwq wwqVarG = g("Application creation", wwcVar, j, j2, 1, i);
        return wwqVar == ((wvk) wwqVarG).a ? wwqVarG : new wvl() { // from class: wxr
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wwqVarG.close();
                wum.g(wum.c(), wwqVar);
            }
        };
    }

    @Override // defpackage.wxp
    public final wwp d(String str, wwc wwcVar, int i, String str2, String str3) {
        wwq wwqVar = wum.c().c;
        f(wwqVar, str);
        return new wxu(new wvx(g(str, wwcVar, Instant.now().toEpochMilli(), this.g.a(), 2, i), false), wwqVar);
    }

    public final void e(wyr wyrVar, String str) {
        RuntimeException runtimeException;
        wwl wwlVarC = wum.c();
        wwq wwqVar = wwlVarC.c;
        wum.g(wum.c(), new wvd(str, wvd.a, wvd.b, wwb.a, wwlVarC));
        try {
            Iterator it = ((Set) this.i.a()).iterator();
            RuntimeException e = null;
            loop0: while (true) {
                runtimeException = e;
                while (it.hasNext()) {
                    try {
                        ((wxn) it.next()).b(wyrVar);
                    } catch (RuntimeException e2) {
                        e = e2;
                        if (runtimeException != null) {
                            runtimeException.addSuppressed(e);
                        }
                    }
                }
            }
            if (runtimeException == null) {
            } else {
                throw runtimeException;
            }
        } finally {
            wum.g(wwlVarC, wwqVar);
        }
    }
}
