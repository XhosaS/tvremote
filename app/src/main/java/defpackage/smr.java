package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class smr implements zxe {
    final /* synthetic */ zyd a;
    final /* synthetic */ sms b;

    public smr(sms smsVar, zyd zydVar) {
        this.a = zydVar;
        this.b = smsVar;
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int iB;
        rxj rxjVar = (rxj) obj;
        if (rxjVar.b == 1) {
            sms smsVar = this.b;
            rzu rzuVar = rzu.a;
            rzt rztVar = new rzt();
            if (rxjVar.b != 1 || (iB = rxl.b(((Integer) rxjVar.c).intValue())) == 0) {
                iB = 1;
            }
            if ((rztVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rztVar.y();
            }
            rzu rzuVar2 = (rzu) rztVar.b;
            rzuVar2.d = Integer.valueOf(iB - 1);
            rzuVar2.c = 2;
            if ((rztVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rztVar.y();
            }
            rzu rzuVar3 = (rzu) rztVar.b;
            rzuVar3.e = 1;
            rzuVar3.b = 1 | rzuVar3.b;
            smsVar.a();
            zxn.p(this.a, wyo.f(new smq(this)), smsVar.a);
        }
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
    }
}
