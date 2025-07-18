package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class reg implements rei {
    @Override // defpackage.rei
    public final /* synthetic */ String a(abyq abyqVar) {
        return ((ahpq) ((ahpn) abyqVar).b).f;
    }

    @Override // defpackage.rei
    public final /* synthetic */ String b(abyq abyqVar) {
        return ((ahpq) ((ahpn) abyqVar).b).e;
    }

    @Override // defpackage.rei
    public final /* bridge */ /* synthetic */ void c(abyq abyqVar, Long l) {
        ahpn ahpnVar = (ahpn) abyqVar;
        if (l == null) {
            if ((ahpnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahpnVar.y();
            }
            ahpq ahpqVar = (ahpq) ahpnVar.b;
            ahpq ahpqVar2 = ahpq.a;
            ahpqVar.b &= -3;
            ahpqVar.d = 0L;
            return;
        }
        long jLongValue = l.longValue();
        if ((ahpnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahpnVar.y();
        }
        ahpq ahpqVar3 = (ahpq) ahpnVar.b;
        ahpq ahpqVar4 = ahpq.a;
        ahpqVar3.b |= 2;
        ahpqVar3.d = jLongValue;
    }

    @Override // defpackage.rei
    public final /* synthetic */ void d(abyq abyqVar) {
        ahpn ahpnVar = (ahpn) abyqVar;
        if ((ahpnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahpnVar.y();
        }
        ahpq ahpqVar = (ahpq) ahpnVar.b;
        ahpq ahpqVar2 = ahpq.a;
        ahpqVar.b &= -5;
        ahpqVar.e = ahpq.a.e;
    }
}
