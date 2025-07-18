package defpackage;

import java.net.URI;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasy {
    static afen a(aasu aasuVar, CronetEngine cronetEngine, yqt yqtVar) {
        aasf aasfVar = (aasf) aasuVar;
        Object objC = aasfVar.f;
        if (objC == null) {
            objC = yqtVar.g() ? yqtVar.c() : new CronetEngine.Builder(aasfVar.a).getDefaultUserAgent();
        }
        URI uri = aasfVar.b;
        afmh afmhVarC = afmh.c(uri.getHost(), uri.getPort(), cronetEngine);
        afuv afuvVar = afmhVarC.c;
        afuvVar.k = (String) objC;
        afuvVar.d(aasfVar.d);
        Executor executor = aasfVar.c;
        if (executor != null) {
            afuvVar.g = new afrb(executor);
        } else {
            afuvVar.g = afuv.c;
        }
        long j = aasfVar.j;
        boolean z = j > 0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yqw.E(z, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) >= 30) {
            afuvVar.o = -1L;
        } else {
            afuvVar.o = Math.max(timeUnit.toMillis(j), afuv.b);
        }
        int i = aasfVar.k;
        yqw.B(i >= 0, "maxMessageSize must be >= 0");
        afmhVarC.e = i;
        ScheduledExecutorService scheduledExecutorService = aasfVar.e;
        if (scheduledExecutorService != null) {
            afmhVarC.a = scheduledExecutorService;
        }
        Integer num = aasfVar.h;
        if (num != null) {
            int iIntValue = num.intValue();
            afmhVarC.h = true;
            afmhVarC.i = iIntValue;
        }
        Integer num2 = aasfVar.i;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            afmhVarC.f = true;
            afmhVarC.g = iIntValue2;
        }
        return afet.a(afuvVar.a(), Arrays.asList(new otr(new otx(aasfVar.g))));
    }
}
