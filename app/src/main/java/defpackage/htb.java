package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htb {
    private static final Duration a;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        durationOfMinutes.getClass();
        a = durationOfMinutes;
    }

    public static final adyx a(Duration duration) {
        duration.getClass();
        Duration durationDividedBy = duration.dividedBy(10L);
        durationDividedBy.getClass();
        adyx adyxVar = adyx.a;
        adyw adywVar = new adyw();
        if ((adywVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adywVar.y();
        }
        adyx adyxVar2 = (adyx) adywVar.b;
        adyxVar2.b |= 1;
        adyxVar2.c = true;
        if ((adywVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adywVar.y();
        }
        adyx adyxVar3 = (adyx) adywVar.b;
        adyxVar3.b |= 2;
        adyxVar3.d = true;
        if ((adywVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adywVar.y();
        }
        adyx adyxVar4 = (adyx) adywVar.b;
        adyxVar4.b |= 4;
        adyxVar4.e = true;
        if ((adywVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adywVar.y();
        }
        adyx adyxVar5 = (adyx) adywVar.b;
        adyxVar5.b |= 8;
        adyxVar5.f = true;
        adwy adwyVar = adwy.a;
        adwx adwxVar = new adwx();
        int seconds = (int) (duration.isZero() ? a : duration.minus(durationDividedBy)).getSeconds();
        if ((adwxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adwxVar.y();
        }
        adwy adwyVar2 = (adwy) adwxVar.b;
        adwyVar2.b = 1 | adwyVar2.b;
        adwyVar2.c = seconds;
        int seconds2 = duration.isZero() ? Integer.MAX_VALUE : (int) duration.plus(durationDividedBy).getSeconds();
        if ((adwxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adwxVar.y();
        }
        adwy adwyVar3 = (adwy) adwxVar.b;
        adwyVar3.b |= 2;
        adwyVar3.d = seconds2;
        if ((adywVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adywVar.y();
        }
        adyx adyxVar6 = (adyx) adywVar.b;
        adwy adwyVar4 = (adwy) adwxVar.v();
        adwyVar4.getClass();
        adyxVar6.g = adwyVar4;
        adyxVar6.b |= 32;
        if ((adywVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adywVar.y();
        }
        adyx adyxVar7 = (adyx) adywVar.b;
        adyxVar7.b |= 64;
        adyxVar7.h = 3;
        abxd abxdVarV = adywVar.v();
        abxdVarV.getClass();
        return (adyx) abxdVarV;
    }

    public static final Map b(adyz adyzVar) {
        adyzVar.getClass();
        abxs<adzm> abxsVar = adyzVar.c;
        abxsVar.getClass();
        ArrayList arrayList = new ArrayList(agqq.i(abxsVar, 10));
        for (adzm adzmVar : abxsVar) {
            String str = adzmVar.b;
            adyx adyxVar = adzmVar.c;
            if (adyxVar == null) {
                adyxVar = adyx.a;
            }
            arrayList.add(new agpi(str, adyxVar));
        }
        return agrj.f(arrayList);
    }

    public static final boolean c(adyx adyxVar, htd htdVar, htd htdVar2) {
        int i;
        adyxVar.getClass();
        if (adyxVar.d && !agvy.c(htdVar.d, htdVar2.d)) {
            return false;
        }
        if (adyxVar.f && htdVar2.c.compareTo(Duration.ZERO) > 0 && (adyxVar.b & 32) != 0) {
            Duration duration = htdVar.c;
            adwy adwyVar = adyxVar.g;
            if (adwyVar == null) {
                adwyVar = adwy.a;
            }
            Duration durationOfSeconds = Duration.ofSeconds(adwyVar.c);
            durationOfSeconds.getClass();
            adwy adwyVar2 = adyxVar.g;
            if (adwyVar2 == null) {
                adwyVar2 = adwy.a;
            }
            Duration durationOfSeconds2 = Duration.ofSeconds(adwyVar2.d);
            durationOfSeconds2.getClass();
            if (duration.compareTo(durationOfSeconds) < 0 || duration.compareTo(durationOfSeconds2) > 0) {
                return false;
            }
        }
        return !adyxVar.e || (i = htdVar2.b) <= 0 || htdVar.b == i;
    }
}
