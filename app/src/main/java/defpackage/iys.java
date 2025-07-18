package defpackage;

import android.location.Location;
import android.util.Base64;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iys {
    public static final String a(fog fogVar) {
        int iA;
        Location locationA = gzp.a(fogVar);
        aciu aciuVar = aciu.a;
        acit acitVar = new acit();
        if ((acitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acitVar.y();
        }
        aciu aciuVar2 = (aciu) acitVar.b;
        aciuVar2.c = 1;
        aciuVar2.b |= 1;
        if ((acitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acitVar.y();
        }
        aciu aciuVar3 = (aciu) acitVar.b;
        aciuVar3.d = 12;
        aciuVar3.b |= 2;
        acis acisVar = acis.a;
        acir acirVar = new acir();
        int iA2 = agwm.a(locationA.getLatitude() * 1.0E7d);
        if ((acirVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acirVar.y();
        }
        acis acisVar2 = (acis) acirVar.b;
        acisVar2.b = 1 | acisVar2.b;
        acisVar2.c = iA2;
        int iA3 = agwm.a(locationA.getLongitude() * 1.0E7d);
        if ((acirVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acirVar.y();
        }
        acis acisVar3 = (acis) acirVar.b;
        acisVar3.b |= 2;
        acisVar3.d = iA3;
        acis acisVar4 = (acis) acirVar.v();
        if ((acitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acitVar.y();
        }
        aciu aciuVar4 = (aciu) acitVar.b;
        acisVar4.getClass();
        aciuVar4.f = acisVar4;
        aciuVar4.b |= 16;
        Duration durationOfMillis = Duration.ofMillis(locationA.getTime());
        durationOfMillis.getClass();
        int i = ztt.a;
        long jA = durationOfMillis.getSeconds() < -9223372036854L ? ztc.a(ztc.b(durationOfMillis.getSeconds() + 1, 1000000L), (durationOfMillis.getNano() / 1000) - 1000000) : ztc.a(ztc.b(durationOfMillis.getSeconds(), 1000000L), durationOfMillis.getNano() / 1000);
        if ((acitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acitVar.y();
        }
        aciu aciuVar5 = (aciu) acitVar.b;
        aciuVar5.b |= 4;
        aciuVar5.e = jA;
        if (locationA.hasAccuracy()) {
            float accuracy = locationA.getAccuracy() * 1000.0f;
            if ((acitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acitVar.y();
            }
            aciu aciuVar6 = (aciu) acitVar.b;
            aciuVar6.b |= 128;
            aciuVar6.g = accuracy;
        }
        aciu aciuVar7 = (aciu) acitVar.v();
        aciuVar7.getClass();
        try {
            int i2 = aciuVar7.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(aciuVar7.getClass()).a(aciuVar7);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(aciuVar7.getClass()).a(aciuVar7);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    aciuVar7.memoizedSerializedSize = (aciuVar7.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(aciuVar7.getClass()).m(aciuVar7, abwa.a(abvwVar));
            abvwVar.K();
            return "w ".concat(String.valueOf(Base64.encodeToString(bArr, 10)));
        } catch (IOException e) {
            throw new RuntimeException(a.x(aciuVar7, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
