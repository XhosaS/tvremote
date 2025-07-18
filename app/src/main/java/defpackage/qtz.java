package defpackage;

import android.os.health.HealthStats;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qtz extends qty {
    public static final qtz a = new qtz();

    private qtz() {
    }

    @Override // defpackage.qty
    public final /* synthetic */ MessageLite a(String str, Object obj) {
        HealthStats healthStatsM43m = al$$ExternalSyntheticApiModelOutline1.m43m(obj);
        ahqe ahqeVar = ahqe.a;
        ahqd ahqdVar = new ahqd();
        int iA = (int) qub.a(healthStatsM43m, 50001);
        if (iA != 0) {
            if ((ahqdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqdVar.y();
            }
            ahqe ahqeVar2 = (ahqe) ahqdVar.b;
            ahqeVar2.b |= 1;
            ahqeVar2.c = iA;
        }
        int iA2 = (int) qub.a(healthStatsM43m, 50002);
        if (iA2 != 0) {
            if ((ahqdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqdVar.y();
            }
            ahqe ahqeVar3 = (ahqe) ahqdVar.b;
            ahqeVar3.b |= 2;
            ahqeVar3.d = iA2;
        }
        if (str != null) {
            ahpw ahpwVarC = qub.c(str);
            if ((ahqdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqdVar.y();
            }
            ahqe ahqeVar4 = (ahqe) ahqdVar.b;
            ahpwVarC.getClass();
            ahqeVar4.e = ahpwVarC;
            ahqeVar4.b |= 4;
        }
        ahqe ahqeVar5 = (ahqe) ahqdVar.v();
        if (qub.j(ahqeVar5)) {
            return null;
        }
        return ahqeVar5;
    }

    @Override // defpackage.qty
    public final /* synthetic */ MessageLite b(MessageLite messageLite, MessageLite messageLite2) {
        int i;
        int i2;
        ahqe ahqeVar = (ahqe) messageLite;
        ahqe ahqeVar2 = (ahqe) messageLite2;
        if (ahqeVar == null || ahqeVar2 == null) {
            return ahqeVar;
        }
        ahqd ahqdVar = new ahqd();
        if ((ahqeVar.b & 1) != 0 && (i2 = ahqeVar.c - ahqeVar2.c) != 0) {
            if ((ahqdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqdVar.y();
            }
            ahqe ahqeVar3 = (ahqe) ahqdVar.b;
            ahqeVar3.b |= 1;
            ahqeVar3.c = i2;
        }
        if ((ahqeVar.b & 2) != 0 && (i = ahqeVar.d - ahqeVar2.d) != 0) {
            if ((ahqdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqdVar.y();
            }
            ahqe ahqeVar4 = (ahqe) ahqdVar.b;
            ahqeVar4.b |= 2;
            ahqeVar4.d = i;
        }
        ahpw ahpwVar = ahqeVar.e;
        if (ahpwVar == null) {
            ahpwVar = ahpw.a;
        }
        if ((ahqdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqdVar.y();
        }
        ahqe ahqeVar5 = (ahqe) ahqdVar.b;
        ahpwVar.getClass();
        ahqeVar5.e = ahpwVar;
        ahqeVar5.b |= 4;
        ahqe ahqeVar6 = (ahqe) ahqdVar.v();
        if (qub.j(ahqeVar6)) {
            return null;
        }
        return ahqeVar6;
    }

    @Override // defpackage.qty
    public final /* synthetic */ String c(MessageLite messageLite) {
        ahpw ahpwVar = ((ahqe) messageLite).e;
        if (ahpwVar == null) {
            ahpwVar = ahpw.a;
        }
        return ahpwVar.d;
    }
}
