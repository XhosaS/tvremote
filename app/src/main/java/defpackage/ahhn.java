package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahhn extends agtu implements agvd {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ agvb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahhn(long j, agvb agvbVar, agsw agswVar) {
        super(4, agswVar);
        this.d = j;
        this.e = agvbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agvd
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        ahhn ahhnVar = new ahhn(this.d, this.e, obj4);
        ahhnVar.b = obj2;
        ahhnVar.c = jLongValue;
        return ahhnVar.b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        boolean z;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            z = ((Boolean) obj).booleanValue();
        } else {
            Object obj2 = this.b;
            if (this.c < this.d) {
                agvb agvbVar = this.e;
                this.a = 1;
                obj = agvbVar.a(obj2, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
