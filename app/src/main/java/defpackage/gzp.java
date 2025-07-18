package defpackage;

import android.location.Location;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzp {
    public static final Location a(fog fogVar) {
        Location location = new Location(fogVar.e);
        adwm adwmVar = fogVar.c;
        if (adwmVar == null) {
            adwmVar = adwm.a;
        }
        location.setLatitude(adwmVar.b);
        adwm adwmVar2 = fogVar.c;
        if (adwmVar2 == null) {
            adwmVar2 = adwm.a;
        }
        location.setLongitude(adwmVar2.c);
        if ((fogVar.b & 4) != 0) {
            location.setAccuracy(fogVar.g);
        }
        if ((fogVar.b & 2) != 0) {
            abzy abzyVar = fogVar.f;
            if (abzyVar == null) {
                abzyVar = abzy.a;
            }
            abzyVar.getClass();
            Instant instantC = acbh.c(abzyVar);
            instantC.getClass();
            location.setTime(instantC.toEpochMilli());
        }
        return location;
    }
}
