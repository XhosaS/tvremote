package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class reh implements rei {
    @Override // defpackage.rei
    public final /* synthetic */ String a(abyq abyqVar) {
        return ((ahth) ((ahtf) abyqVar).b).c;
    }

    @Override // defpackage.rei
    public final /* synthetic */ String b(abyq abyqVar) {
        return ((ahth) ((ahtf) abyqVar).b).e;
    }

    @Override // defpackage.rei
    public final /* bridge */ /* synthetic */ void c(abyq abyqVar, Long l) {
        ahtf ahtfVar = (ahtf) abyqVar;
        if (l == null) {
            if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtfVar.y();
            }
            ahth ahthVar = (ahth) ahtfVar.b;
            ahth ahthVar2 = ahth.a;
            ahthVar.b &= -3;
            ahthVar.d = 0L;
            return;
        }
        long jLongValue = l.longValue();
        if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtfVar.y();
        }
        ahth ahthVar3 = (ahth) ahtfVar.b;
        ahth ahthVar4 = ahth.a;
        ahthVar3.b |= 2;
        ahthVar3.d = jLongValue;
    }

    @Override // defpackage.rei
    public final /* synthetic */ void d(abyq abyqVar) {
        ahtf ahtfVar = (ahtf) abyqVar;
        if ((ahtfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtfVar.y();
        }
        ahth ahthVar = (ahth) ahtfVar.b;
        ahth ahthVar2 = ahth.a;
        ahthVar.b &= -5;
        ahthVar.e = ahth.a.e;
    }
}
