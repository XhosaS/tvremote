package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class smq implements zxe {
    final /* synthetic */ smr a;

    public smq(smr smrVar) {
        this.a = smrVar;
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int iB;
        rxd rxdVar = (rxd) obj;
        if (rxdVar.b == 1) {
            smr smrVar = this.a;
            rzu rzuVar = rzu.a;
            rzt rztVar = new rzt();
            if (rxdVar.b != 1 || (iB = rxf.b(((Integer) rxdVar.c).intValue())) == 0) {
                iB = 1;
            }
            if ((rztVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rztVar.y();
            }
            rzu rzuVar2 = (rzu) rztVar.b;
            rzuVar2.d = Integer.valueOf(iB - 1);
            rzuVar2.c = 3;
            if ((rztVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rztVar.y();
            }
            rzu rzuVar3 = (rzu) rztVar.b;
            sms smsVar = smrVar.b;
            rzuVar3.e = 1;
            rzuVar3.b = 1 | rzuVar3.b;
            smsVar.a();
        }
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
    }
}
