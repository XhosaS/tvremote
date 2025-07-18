package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ohx implements oin {
    private final AtomicInteger b = new AtomicInteger();

    @Override // defpackage.oin
    public final int a() {
        return this.b.incrementAndGet();
    }

    @Override // defpackage.oin
    public final String b() {
        return "";
    }

    @Override // defpackage.oin
    public final void c(String str, int i, oik oikVar) throws IOException {
        String strC;
        String str2;
        boolean z;
        long j;
        Long l;
        Long l2;
        ohm ohmVar = (ohm) oikVar;
        oii oiiVar = ohmVar.f;
        long jLongValue = 0;
        if (oiiVar != null) {
            oho ohoVar = (oho) oiiVar;
            strC = new yqn(", ").c(ohoVar.a);
            oif oifVar = ohoVar.b;
            z = oifVar.a;
            j = oifVar.b;
            str2 = ohoVar.c;
        } else {
            strC = "Empty";
            str2 = "";
            z = false;
            j = 0;
        }
        Long l3 = ohmVar.d;
        if (l3 == null && (l = ohmVar.b) != null && (l2 = ohmVar.c) != null) {
            jLongValue = l2.longValue() - l.longValue();
        } else if (l3 != null) {
            jLongValue = l3.longValue();
        }
        Log.println(3, "LogcatTimeSpanLogger", "EmlLogTag: 0, Action Name: " + ohmVar.a + ", Start Time: " + ohmVar.b + ", End Time: " + ohmVar.c + ", Span Length: " + jLongValue + ", isMainThread: " + z + ", threadId: " + j + ", Template Uris: " + strC + ", commandId: 0, NodeId: " + str2 + ", spanId: " + i + ", parentSpanId: " + ohmVar.e);
    }

    @Override // defpackage.oin
    public final int d(String str, oik oikVar) throws IOException {
        int iIncrementAndGet = this.b.incrementAndGet();
        c(str, iIncrementAndGet, oikVar);
        return iIncrementAndGet;
    }
}
