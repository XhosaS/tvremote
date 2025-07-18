package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qtv extends qty {
    public static final qtv a = new qtv();

    private qtv() {
    }

    @Override // defpackage.qty
    public final /* synthetic */ MessageLite a(String str, Object obj) {
        int iIntValue = ((Long) obj).intValue();
        if (iIntValue == 0) {
            return null;
        }
        ahpu ahpuVar = ahpu.a;
        ahpt ahptVar = new ahpt();
        if ((ahptVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahptVar.y();
        }
        ahpu ahpuVar2 = (ahpu) ahptVar.b;
        ahpuVar2.b |= 1;
        ahpuVar2.c = iIntValue;
        if (str != null) {
            ahpw ahpwVarC = qub.c(str);
            if ((ahptVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahptVar.y();
            }
            ahpu ahpuVar3 = (ahpu) ahptVar.b;
            ahpwVarC.getClass();
            ahpuVar3.d = ahpwVarC;
            ahpuVar3.b |= 2;
        }
        return (ahpu) ahptVar.v();
    }

    @Override // defpackage.qty
    public final /* synthetic */ MessageLite b(MessageLite messageLite, MessageLite messageLite2) {
        int i;
        ahpu ahpuVar = (ahpu) messageLite;
        ahpu ahpuVar2 = (ahpu) messageLite2;
        if (ahpuVar == null || ahpuVar2 == null) {
            return ahpuVar;
        }
        if ((ahpuVar.b & 1) == 0 || (i = ahpuVar.c - ahpuVar2.c) == 0) {
            return null;
        }
        ahpt ahptVar = new ahpt();
        if ((ahpuVar.b & 2) != 0) {
            ahpw ahpwVar = ahpuVar.d;
            if (ahpwVar == null) {
                ahpwVar = ahpw.a;
            }
            if ((ahptVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahptVar.y();
            }
            ahpu ahpuVar3 = (ahpu) ahptVar.b;
            ahpwVar.getClass();
            ahpuVar3.d = ahpwVar;
            ahpuVar3.b |= 2;
        }
        if ((ahptVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahptVar.y();
        }
        ahpu ahpuVar4 = (ahpu) ahptVar.b;
        ahpuVar4.b |= 1;
        ahpuVar4.c = i;
        return (ahpu) ahptVar.v();
    }

    @Override // defpackage.qty
    public final /* synthetic */ String c(MessageLite messageLite) {
        ahpw ahpwVar = ((ahpu) messageLite).d;
        if (ahpwVar == null) {
            ahpwVar = ahpw.a;
        }
        return ahpwVar.d;
    }
}
