package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjz extends agtu implements agvb {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjz(int i, List list, agsw agswVar) {
        super(2, agswVar);
        this.b = i;
        this.a = list;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjz) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.c;
        yfc yfcVar = yfc.a;
        yes yesVar = new yes();
        yfa yfaVar = yfa.a;
        yex yexVar = new yex();
        if ((yexVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yexVar.y();
        }
        int i = this.b;
        yfa yfaVar2 = (yfa) yexVar.b;
        yfaVar2.c = i - 1;
        yfaVar2.b |= 1;
        DesugarCollections.unmodifiableList(yfaVar2.d).getClass();
        if ((yexVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yexVar.y();
        }
        yfa yfaVar3 = (yfa) yexVar.b;
        abxs abxsVar = yfaVar3.d;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            yfaVar3.d = abxsVar.d(size + size);
        }
        abus.m(this.a, yfaVar3.d);
        abxd abxdVarV = yexVar.v();
        abxdVarV.getClass();
        yfa yfaVar4 = (yfa) abxdVarV;
        if ((yesVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yesVar.y();
        }
        yfc yfcVar2 = (yfc) yesVar.b;
        yfcVar2.e = yfaVar4;
        yfcVar2.b |= 4;
        yfc yfcVarA = ygu.a(yesVar);
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yfcVarA;
        ycbVar.c = 21;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjz gjzVar = new gjz(this.b, this.a, agswVar);
        gjzVar.c = obj;
        return gjzVar;
    }
}
