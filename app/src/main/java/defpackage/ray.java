package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ray {
    public static ahtj a(ahtj ahtjVar, long j) {
        ahti ahtiVar = new ahti();
        ahtiVar.B(ahtjVar);
        ahtj ahtjVar2 = (ahtj) ahtiVar.b;
        if ((ahtjVar2.b & 2) != 0) {
            long j2 = ahtjVar2.d - j;
            if ((ahtiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtiVar.y();
            }
            ahtj ahtjVar3 = (ahtj) ahtiVar.b;
            ahtjVar3.b |= 2;
            ahtjVar3.d = j2;
        }
        ahtj ahtjVar4 = (ahtj) ahtiVar.b;
        if ((ahtjVar4.b & 4) != 0) {
            long j3 = ahtjVar4.e - j;
            if ((ahtiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtiVar.y();
            }
            ahtj ahtjVar5 = (ahtj) ahtiVar.b;
            ahtjVar5.b |= 4;
            ahtjVar5.e = j3;
        }
        ahtj ahtjVar6 = (ahtj) ahtiVar.b;
        if ((ahtjVar6.b & 8) != 0) {
            long j4 = ahtjVar6.f - j;
            if ((ahtiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtiVar.y();
            }
            ahtj ahtjVar7 = (ahtj) ahtiVar.b;
            ahtjVar7.b |= 8;
            ahtjVar7.f = j4;
        }
        return (ahtj) ahtiVar.v();
    }
}
