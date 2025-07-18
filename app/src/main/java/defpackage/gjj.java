package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjj extends agtu implements agvb {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjj(List list, int i, agsw agswVar) {
        super(2, agswVar);
        this.a = list;
        this.b = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjj) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.c;
        ygb ygbVar = ygb.a;
        yft yftVar = new yft();
        DesugarCollections.unmodifiableList(((ygb) yftVar.b).c).getClass();
        List list = this.a;
        ArrayList arrayList = new ArrayList(agqq.i(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                agqq.h();
            }
            gkk gkkVar = (gkk) obj2;
            yga ygaVar = yga.a;
            yfw yfwVar = new yfw();
            if ((yfwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yfwVar.y();
            }
            yga ygaVar2 = (yga) yfwVar.b;
            ygaVar2.b |= 1;
            ygaVar2.c = i;
            ygy.b(gkkVar.d(), yfwVar);
            if ((yfwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yfwVar.y();
            }
            int i3 = this.b;
            yga ygaVar3 = (yga) yfwVar.b;
            ygaVar3.i = i3 - 1;
            ygaVar3.b |= 256;
            arrayList.add(ygy.a(yfwVar));
            i = i2;
        }
        yftVar.a(arrayList);
        ygb ygbVarA = ygx.a(yftVar);
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ygbVarA;
        ycbVar.c = 10;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjj gjjVar = new gjj(this.a, this.b, agswVar);
        gjjVar.c = obj;
        return gjjVar;
    }
}
