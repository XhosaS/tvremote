package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjw extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ gkh b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjw(int i, gkh gkhVar, String str, int i2, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.b = gkhVar;
        this.c = str;
        this.d = i2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjw) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        rqs rqsVarCy;
        int i;
        agpl.b(obj);
        xzy xzyVar = (xzy) this.e;
        int i2 = this.a;
        if (i2 != 1) {
            rqsVarCy = i2 != 4 ? null : rpm.cx();
            i = 2;
        } else {
            rqsVarCy = rpm.cy();
            i = 3;
        }
        gkh gkhVar = this.b;
        agow agowVar = gkhVar.g;
        if (((Boolean) agowVar.a()).booleanValue()) {
            if (rqsVarCy != null) {
                ((gfn) gkhVar.d.a()).a(rqsVarCy).b().c();
            }
        } else if (rqsVarCy != null) {
            gfq.b(gkhVar.e, rqsVarCy, null, null, 14);
        }
        String str = this.c;
        int i3 = this.d;
        yeo yeoVar = yeo.a;
        yel yelVar = new yel();
        if ((yelVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yelVar.y();
        }
        yeo yeoVar2 = (yeo) yelVar.b;
        yeoVar2.c = i - 1;
        yeoVar2.b |= 1;
        if ((yelVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yelVar.y();
        }
        yeo yeoVar3 = (yeo) yelVar.b;
        yeoVar3.b |= 2;
        yeoVar3.d = str;
        if ((yelVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yelVar.y();
        }
        yeo yeoVar4 = (yeo) yelVar.b;
        yeoVar4.f = i3 - 1;
        yeoVar4.b |= 8;
        if (i == 2) {
            if ((yelVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yelVar.y();
            }
            yeo yeoVar5 = (yeo) yelVar.b;
            yeoVar5.b = 4 | yeoVar5.b;
            yeoVar5.e = true;
            if (((Boolean) agowVar.a()).booleanValue()) {
                ((gfn) gkhVar.d.a()).a(rpm.cw()).b().c();
            } else {
                gfq.b(gkhVar.e, rpm.cw(), null, null, 14);
            }
        }
        abxd abxdVarV = yelVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yeo yeoVar6 = (yeo) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yeoVar6;
        ycbVar.c = 2;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjw gjwVar = new gjw(this.a, this.b, this.c, this.d, agswVar);
        gjwVar.e = obj;
        return gjwVar;
    }
}
