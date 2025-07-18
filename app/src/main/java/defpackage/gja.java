package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gja extends agtu implements agvb {
    final /* synthetic */ Set a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ygm c;
    final /* synthetic */ ybo d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gja(int i, Set set, boolean z, ygm ygmVar, int i2, ybo yboVar, boolean z2, agsw agswVar) {
        super(2, agswVar);
        this.f = i;
        this.a = set;
        this.b = z;
        this.c = ygmVar;
        this.g = i2;
        this.d = yboVar;
        this.e = z2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gja) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.h;
        abxk abxkVar = ybp.a;
        ybh ybhVar = new ybh();
        if ((ybhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybhVar.y();
        }
        int i = this.f;
        ybp ybpVar = (ybp) ybhVar.b;
        ybpVar.i = i - 1;
        ybpVar.c |= 32;
        new abxl(ybpVar.g, ybp.a);
        if ((ybhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybhVar.y();
        }
        ybp ybpVar2 = (ybp) ybhVar.b;
        abxj abxjVar = ybpVar2.g;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            ybpVar2.g = abxjVar.d(size + size);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ybpVar2.g.h(((ybl) it.next()).q);
        }
        if ((ybhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybhVar.y();
        }
        boolean z = this.b;
        ybp ybpVar3 = (ybp) ybhVar.b;
        ybpVar3.c |= 2;
        ybpVar3.e = z;
        if ((ybhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybhVar.y();
        }
        ygm ygmVar = this.c;
        ybp ybpVar4 = (ybp) ybhVar.b;
        ybpVar4.h = ygmVar;
        ybpVar4.c |= 8;
        if ((ybhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybhVar.y();
        }
        int i2 = this.g;
        ybp ybpVar5 = (ybp) ybhVar.b;
        ybpVar5.f = i2 - 1;
        ybpVar5.c |= 4;
        if ((ybhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybhVar.y();
        }
        ybo yboVar = this.d;
        ybp ybpVar6 = (ybp) ybhVar.b;
        ybpVar6.d = yboVar.f;
        ybpVar6.c |= 1;
        if ((ybhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybhVar.y();
        }
        boolean z2 = this.e;
        ybp ybpVar7 = (ybp) ybhVar.b;
        ybpVar7.c |= 64;
        ybpVar7.j = z2;
        abxd abxdVarV = ybhVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        ybp ybpVar8 = (ybp) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ybpVar8;
        ycbVar.c = 33;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gja gjaVar = new gja(this.f, this.a, this.b, this.c, this.g, this.d, this.e, agswVar);
        gjaVar.h = obj;
        return gjaVar;
    }
}
