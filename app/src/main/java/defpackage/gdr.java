package defpackage;

import android.graphics.Color;
import android.os.SystemClock;
import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gdr implements Runnable {
    public final /* synthetic */ gdu a;

    public /* synthetic */ gdr(gdu gduVar) {
        this.a = gduVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        gdu gduVar = this.a;
        long j = gduVar.f;
        if (j > jElapsedRealtime) {
            feq.e(gduVar.a, Duration.ofMillis(j - jElapsedRealtime), new gdr(gduVar));
            return;
        }
        while (gduVar.f <= jElapsedRealtime) {
            if (!gduVar.c()) {
                gduVar.g.a();
                return;
            } else {
                long j2 = gduVar.c.c;
                long j3 = gduVar.f;
                gduVar.f = j3 + ((((jElapsedRealtime - j3) / j2) + 1) * j2);
            }
        }
        gdg gdgVar = gduVar.g;
        gdp gdpVar = gduVar.c.b;
        List list = gduVar.b;
        list.getClass();
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Color) list.get(i)).toArgb();
        }
        gdgVar.a.a(iArr);
        gduVar.a.post(new gdr(gduVar));
    }
}
