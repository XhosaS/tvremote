package defpackage;

import j$.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class urm extends urx {
    private final url a;

    public urm(int i, int i2) {
        super(i, i2);
        this.a = new url(this);
    }

    @Override // defpackage.urx
    public final tst a(urw urwVar, urr urrVar) {
        urk urkVarA = this.a.a(urwVar);
        return (urkVarA == null || Instant.now().toEpochMilli() >= urkVarA.b) ? trk.a : tst.i(urkVarA.a());
    }

    @Override // defpackage.urx
    public final tst b(urw urwVar, urr urrVar) {
        urk urkVarA = this.a.a(urwVar);
        if (urkVarA != null) {
            long epochMilli = Instant.now().toEpochMilli();
            if (epochMilli < urkVarA.b) {
                long j = urkVarA.a;
                if (j == -1 || epochMilli < j) {
                    return tst.i(urkVarA.a());
                }
            }
        }
        return trk.a;
    }

    @Override // defpackage.urx
    public final void c() {
        LinkedHashMap linkedHashMap = this.a.a;
        synchronized (linkedHashMap) {
            linkedHashMap.clear();
        }
    }

    @Override // defpackage.urx
    public final void d(urw urwVar, xsm xsmVar, vvj vvjVar, xsm xsmVar2, int i, long j, TimeUnit timeUnit, urr urrVar) {
        long epochMilli = Instant.now().toEpochMilli();
        urk urkVar = new urk(xsmVar, vvjVar, xsmVar2, epochMilli + timeUnit.toMillis(j), epochMilli + urz.a, i);
        url urlVar = this.a;
        LinkedHashMap linkedHashMap = urlVar.a;
        synchronized (linkedHashMap) {
            urlVar.b += urkVar.c;
            urk urkVar2 = (urk) linkedHashMap.put(urwVar, urkVar);
            if (urkVar2 != null) {
                urlVar.b -= urkVar2.c;
            }
            synchronized (linkedHashMap) {
                while (true) {
                    int i2 = urlVar.c.e;
                    if (i2 == -1 || urlVar.b <= i2) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                    linkedHashMap.remove(entry.getKey());
                    urlVar.b -= ((urk) entry.getValue()).c;
                }
            }
        }
    }
}
