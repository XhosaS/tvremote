package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gix extends agtu implements agvb {
    final /* synthetic */ yct a;
    final /* synthetic */ ycv b;
    final /* synthetic */ ycv c;
    final /* synthetic */ String d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gix(yct yctVar, ycv ycvVar, ycv ycvVar2, String str, boolean z, boolean z2, agsw agswVar) {
        super(2, agswVar);
        this.a = yctVar;
        this.b = ycvVar;
        this.c = ycvVar2;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gix) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.g;
        ycw ycwVar = ycw.a;
        ycr ycrVar = new ycr();
        if ((ycrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycrVar.y();
        }
        yct yctVar = this.a;
        ycw ycwVar2 = (ycw) ycrVar.b;
        ycwVar2.c = yctVar.j;
        ycwVar2.b |= 1;
        if ((ycrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycrVar.y();
        }
        ycv ycvVar = this.b;
        ycw ycwVar3 = (ycw) ycrVar.b;
        ycwVar3.d = ycvVar.e;
        ycwVar3.b |= 2;
        if ((ycrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycrVar.y();
        }
        ycv ycvVar2 = this.c;
        ycw ycwVar4 = (ycw) ycrVar.b;
        ycwVar4.e = ycvVar2.e;
        ycwVar4.b |= 4;
        if ((ycrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycrVar.y();
        }
        String str = this.d;
        ycw ycwVar5 = (ycw) ycrVar.b;
        ycwVar5.b |= 8;
        ycwVar5.f = str;
        if ((ycrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycrVar.y();
        }
        boolean z = this.e;
        ycw ycwVar6 = (ycw) ycrVar.b;
        ycwVar6.b |= 16;
        ycwVar6.g = z;
        if ((ycrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycrVar.y();
        }
        boolean z2 = this.f;
        ycw ycwVar7 = (ycw) ycrVar.b;
        ycwVar7.b |= 32;
        ycwVar7.h = z2;
        abxd abxdVarV = ycrVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        ycw ycwVar8 = (ycw) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ycwVar8;
        ycbVar.c = 13;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gix gixVar = new gix(this.a, this.b, this.c, this.d, this.e, this.f, agswVar);
        gixVar.g = obj;
        return gixVar;
    }
}
