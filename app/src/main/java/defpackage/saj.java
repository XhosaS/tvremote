package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class saj {
    public static final san a(rwu rwuVar, rvf rvfVar) {
        tix tixVarB;
        ruo ruoVar = rvfVar.g;
        if (ruoVar == null) {
            ruoVar = ruo.a;
        }
        ruoVar.getClass();
        san sanVar = san.a;
        sam samVar = new sam();
        sap sapVar = sap.a;
        sao saoVar = new sao();
        if ((saoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            saoVar.y();
        }
        sap sapVar2 = (sap) saoVar.b;
        sapVar2.d = ruoVar;
        sapVar2.b |= 2;
        if ((rwuVar.b & 1) != 0) {
            if ((saoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                saoVar.y();
            }
            sap sapVar3 = (sap) saoVar.b;
            sapVar3.e = rwuVar;
            sapVar3.b |= 4;
        }
        sap sapVarA = sas.a(saoVar);
        if ((samVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            samVar.y();
        }
        san sanVar2 = (san) samVar.b;
        sanVar2.c = sapVarA;
        sanVar2.b |= 1;
        san sanVarA = sak.a(samVar);
        sam samVar2 = new sam();
        samVar2.B(sanVarA);
        if (rvfVar.e != 14 || (tixVarB = tix.b(((Integer) rvfVar.f).intValue())) == null) {
            tixVarB = tix.TAG_DO_NOT_USE;
        }
        tixVarB.getClass();
        if ((samVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            samVar2.y();
        }
        san sanVar3 = (san) samVar2.b;
        sanVar3.d = tixVarB.a();
        sanVar3.b |= 2;
        boolean z = rvfVar.j;
        if ((samVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            samVar2.y();
        }
        san sanVar4 = (san) samVar2.b;
        sanVar4.b |= 4;
        sanVar4.e = z;
        return sak.a(samVar2);
    }
}
