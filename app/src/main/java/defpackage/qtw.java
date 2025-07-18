package defpackage;

import android.os.health.HealthStats;
import com.google.protobuf.MessageLite;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qtw extends qty {
    public static final qtw a = new qtw();

    private qtw() {
    }

    @Override // defpackage.qty
    public final /* synthetic */ MessageLite a(String str, Object obj) {
        HealthStats healthStatsM43m = al$$ExternalSyntheticApiModelOutline1.m43m(obj);
        ahpy ahpyVar = ahpy.a;
        ahpx ahpxVar = new ahpx();
        ahpxVar.a(qtz.a.d(qub.b(healthStatsM43m, 40001)));
        ahpxVar.b(qtv.a.d((healthStatsM43m == null || !healthStatsM43m.hasMeasurements(40002)) ? Collections.EMPTY_MAP : healthStatsM43m.getMeasurements(40002)));
        if (str != null) {
            ahpw ahpwVarC = qub.c(str);
            if ((ahpxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahpxVar.y();
            }
            ahpy ahpyVar2 = (ahpy) ahpxVar.b;
            ahpwVarC.getClass();
            ahpyVar2.e = ahpwVarC;
            ahpyVar2.b |= 1;
        }
        ahpy ahpyVar3 = (ahpy) ahpxVar.v();
        if (qub.h(ahpyVar3)) {
            return null;
        }
        return ahpyVar3;
    }

    @Override // defpackage.qty
    public final /* synthetic */ MessageLite b(MessageLite messageLite, MessageLite messageLite2) {
        ahpy ahpyVar = (ahpy) messageLite;
        ahpy ahpyVar2 = (ahpy) messageLite2;
        if (ahpyVar == null || ahpyVar2 == null) {
            return ahpyVar;
        }
        ahpx ahpxVar = new ahpx();
        ahpxVar.a(qtz.a.e(ahpyVar.c, ahpyVar2.c));
        ahpxVar.b(qtv.a.e(ahpyVar.d, ahpyVar2.d));
        ahpw ahpwVar = ahpyVar.e;
        if (ahpwVar == null) {
            ahpwVar = ahpw.a;
        }
        if ((ahpxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahpxVar.y();
        }
        ahpy ahpyVar3 = (ahpy) ahpxVar.b;
        ahpwVar.getClass();
        ahpyVar3.e = ahpwVar;
        ahpyVar3.b |= 1;
        ahpy ahpyVar4 = (ahpy) ahpxVar.v();
        if (qub.h(ahpyVar4)) {
            return null;
        }
        return ahpyVar4;
    }

    @Override // defpackage.qty
    public final /* synthetic */ String c(MessageLite messageLite) {
        ahpw ahpwVar = ((ahpy) messageLite).e;
        if (ahpwVar == null) {
            ahpwVar = ahpw.a;
        }
        return ahpwVar.d;
    }
}
