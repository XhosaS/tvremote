package defpackage;

import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class thp {
    @Deprecated
    public static void a(zmw zmwVar, mcw mcwVar) {
        long epochMilli = Instant.now().toEpochMilli();
        if ((zmwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zmwVar.y();
        }
        zmx zmxVar = (zmx) zmwVar.b;
        zmx zmxVar2 = zmx.a;
        zmxVar.b |= 1;
        zmxVar.e = epochMilli;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((zmwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zmwVar.y();
        }
        zmx zmxVar3 = (zmx) zmwVar.b;
        zmxVar3.c |= 32;
        zmxVar3.f = jElapsedRealtime;
        long jA = mcwVar.a();
        if ((zmwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zmwVar.y();
        }
        zmx zmxVar4 = (zmx) zmwVar.b;
        zmxVar4.c |= 8192;
        zmxVar4.g = jA;
    }
}
