package defpackage;

import android.os.health.HealthStats;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qtx extends qty {
    public static final qtx a = new qtx();

    private qtx() {
    }

    @Override // defpackage.qty
    public final /* synthetic */ MessageLite a(String str, Object obj) {
        HealthStats healthStatsM43m = al$$ExternalSyntheticApiModelOutline1.m43m(obj);
        ahqc ahqcVar = ahqc.a;
        ahqb ahqbVar = new ahqb();
        long jA = qub.a(healthStatsM43m, 30001);
        if (jA != 0) {
            if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqbVar.y();
            }
            ahqc ahqcVar2 = (ahqc) ahqbVar.b;
            ahqcVar2.b |= 1;
            ahqcVar2.c = jA;
        }
        long jA2 = qub.a(healthStatsM43m, 30002);
        if (jA2 != 0) {
            if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqbVar.y();
            }
            ahqc ahqcVar3 = (ahqc) ahqbVar.b;
            ahqcVar3.b |= 2;
            ahqcVar3.d = jA2;
        }
        long jA3 = qub.a(healthStatsM43m, 30003);
        if (jA3 != 0) {
            if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqbVar.y();
            }
            ahqc ahqcVar4 = (ahqc) ahqbVar.b;
            ahqcVar4.b |= 4;
            ahqcVar4.e = jA3;
        }
        long jA4 = qub.a(healthStatsM43m, 30004);
        if (jA4 != 0) {
            if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqbVar.y();
            }
            ahqc ahqcVar5 = (ahqc) ahqbVar.b;
            ahqcVar5.b |= 8;
            ahqcVar5.f = jA4;
        }
        long jA5 = qub.a(healthStatsM43m, 30005);
        if (jA5 != 0) {
            if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqbVar.y();
            }
            ahqc ahqcVar6 = (ahqc) ahqbVar.b;
            ahqcVar6.b |= 16;
            ahqcVar6.g = jA5;
        }
        long jA6 = qub.a(healthStatsM43m, 30006);
        if (jA6 != 0) {
            if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqbVar.y();
            }
            ahqc ahqcVar7 = (ahqc) ahqbVar.b;
            ahqcVar7.b |= 32;
            ahqcVar7.h = jA6;
        }
        if (str != null) {
            ahpw ahpwVarC = qub.c(str);
            if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqbVar.y();
            }
            ahqc ahqcVar8 = (ahqc) ahqbVar.b;
            ahpwVarC.getClass();
            ahqcVar8.i = ahpwVarC;
            ahqcVar8.b |= 64;
        }
        ahqc ahqcVar9 = (ahqc) ahqbVar.v();
        if (qub.i(ahqcVar9)) {
            return null;
        }
        return ahqcVar9;
    }

    @Override // defpackage.qty
    public final /* synthetic */ MessageLite b(MessageLite messageLite, MessageLite messageLite2) {
        ahqc ahqcVar = (ahqc) messageLite;
        ahqc ahqcVar2 = (ahqc) messageLite2;
        if (ahqcVar == null || ahqcVar2 == null) {
            return ahqcVar;
        }
        ahqb ahqbVar = new ahqb();
        if ((ahqcVar.b & 1) != 0) {
            long j = ahqcVar.c - ahqcVar2.c;
            if (j != 0) {
                if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqbVar.y();
                }
                ahqc ahqcVar3 = (ahqc) ahqbVar.b;
                ahqcVar3.b |= 1;
                ahqcVar3.c = j;
            }
        }
        if ((ahqcVar.b & 2) != 0) {
            long j2 = ahqcVar.d - ahqcVar2.d;
            if (j2 != 0) {
                if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqbVar.y();
                }
                ahqc ahqcVar4 = (ahqc) ahqbVar.b;
                ahqcVar4.b |= 2;
                ahqcVar4.d = j2;
            }
        }
        if ((ahqcVar.b & 4) != 0) {
            long j3 = ahqcVar.e - ahqcVar2.e;
            if (j3 != 0) {
                if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqbVar.y();
                }
                ahqc ahqcVar5 = (ahqc) ahqbVar.b;
                ahqcVar5.b |= 4;
                ahqcVar5.e = j3;
            }
        }
        if ((ahqcVar.b & 8) != 0) {
            long j4 = ahqcVar.f - ahqcVar2.f;
            if (j4 != 0) {
                if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqbVar.y();
                }
                ahqc ahqcVar6 = (ahqc) ahqbVar.b;
                ahqcVar6.b |= 8;
                ahqcVar6.f = j4;
            }
        }
        if ((ahqcVar.b & 16) != 0) {
            long j5 = ahqcVar.g - ahqcVar2.g;
            if (j5 != 0) {
                if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqbVar.y();
                }
                ahqc ahqcVar7 = (ahqc) ahqbVar.b;
                ahqcVar7.b |= 16;
                ahqcVar7.g = j5;
            }
        }
        if ((ahqcVar.b & 32) != 0) {
            long j6 = ahqcVar.h - ahqcVar2.h;
            if (j6 != 0) {
                if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqbVar.y();
                }
                ahqc ahqcVar8 = (ahqc) ahqbVar.b;
                ahqcVar8.b |= 32;
                ahqcVar8.h = j6;
            }
        }
        ahpw ahpwVar = ahqcVar.i;
        if (ahpwVar == null) {
            ahpwVar = ahpw.a;
        }
        if ((ahqbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqbVar.y();
        }
        ahqc ahqcVar9 = (ahqc) ahqbVar.b;
        ahpwVar.getClass();
        ahqcVar9.i = ahpwVar;
        ahqcVar9.b |= 64;
        ahqc ahqcVar10 = (ahqc) ahqbVar.v();
        if (qub.i(ahqcVar10)) {
            return null;
        }
        return ahqcVar10;
    }

    @Override // defpackage.qty
    public final /* synthetic */ String c(MessageLite messageLite) {
        ahpw ahpwVar = ((ahqc) messageLite).i;
        if (ahpwVar == null) {
            ahpwVar = ahpw.a;
        }
        return ahpwVar.d;
    }
}
