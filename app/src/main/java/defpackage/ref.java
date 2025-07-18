package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ref implements rei {
    @Override // defpackage.rei
    public final /* synthetic */ String a(abyq abyqVar) {
        return ((ahvw) ((ahvv) abyqVar).b).e;
    }

    @Override // defpackage.rei
    public final /* synthetic */ String b(abyq abyqVar) {
        return ((ahvw) ((ahvv) abyqVar).b).d;
    }

    @Override // defpackage.rei
    public final /* bridge */ /* synthetic */ void c(abyq abyqVar, Long l) {
        ahvv ahvvVar = (ahvv) abyqVar;
        if (l == null) {
            if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahvvVar.y();
            }
            ahvw ahvwVar = (ahvw) ahvvVar.b;
            ahvw ahvwVar2 = ahvw.a;
            ahvwVar.b &= -2;
            ahvwVar.c = 0L;
            return;
        }
        long jLongValue = l.longValue();
        if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahvvVar.y();
        }
        ahvw ahvwVar3 = (ahvw) ahvvVar.b;
        ahvw ahvwVar4 = ahvw.a;
        ahvwVar3.b |= 1;
        ahvwVar3.c = jLongValue;
    }

    @Override // defpackage.rei
    public final /* synthetic */ void d(abyq abyqVar) {
        ahvv ahvvVar = (ahvv) abyqVar;
        if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahvvVar.y();
        }
        ahvw ahvwVar = (ahvw) ahvvVar.b;
        ahvw ahvwVar2 = ahvw.a;
        ahvwVar.b &= -3;
        ahvwVar.d = ahvw.a.d;
    }
}
