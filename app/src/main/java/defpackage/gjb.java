package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjb extends agtu implements agvb {
    final /* synthetic */ ycm a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjb(int i, int i2, ycm ycmVar, long j, agsw agswVar) {
        super(2, agswVar);
        this.c = i;
        this.d = i2;
        this.a = ycmVar;
        this.b = j;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjb) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.e;
        abxk abxkVar = ycq.a;
        ygr ygrVar = new ygr(new yce());
        yce yceVar = ygrVar.a;
        if ((yceVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yceVar.y();
        }
        int i = this.c;
        ycq ycqVar = (ycq) yceVar.b;
        ycqVar.e = i - 1;
        ycqVar.d |= 1;
        if ((yceVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yceVar.y();
        }
        ycm ycmVar = this.a;
        int i2 = this.d;
        ycq ycqVar2 = (ycq) yceVar.b;
        ycqVar2.i = i2 - 1;
        ycqVar2.d |= 16;
        if (ycmVar != null) {
            ygrVar.b();
            yceVar.a(ycmVar);
            boolean z = ycmVar.e;
            if ((yceVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yceVar.y();
            }
            ycq ycqVar3 = (ycq) yceVar.b;
            ycqVar3.d |= 32768;
            ycqVar3.x = z;
            if ((yceVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yceVar.y();
            }
            long j = this.b;
            ycq ycqVar4 = (ycq) yceVar.b;
            ycqVar4.d |= 131072;
            ycqVar4.z = j;
            boolean z2 = ycmVar.f;
            if ((yceVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yceVar.y();
            }
            ycq ycqVar5 = (ycq) yceVar.b;
            ycqVar5.d |= 65536;
            ycqVar5.y = z2;
        }
        ycq ycqVarA = ygrVar.a();
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ycqVarA;
        ycbVar.c = 5;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjb gjbVar = new gjb(this.c, this.d, this.a, this.b, agswVar);
        gjbVar.e = obj;
        return gjbVar;
    }
}
