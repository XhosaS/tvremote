package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gje extends agtu implements agvb {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ gki d;
    final /* synthetic */ int e;
    final /* synthetic */ gkj f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gje(boolean z, int i, int i2, gki gkiVar, int i3, gkj gkjVar, agsw agswVar) {
        super(2, agswVar);
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = gkiVar;
        this.e = i3;
        this.f = gkjVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gje) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.g;
        ybc ybcVar = ybc.a;
        yaz yazVar = new yaz();
        if ((yazVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yazVar.y();
        }
        boolean z = this.a;
        ybc ybcVar2 = (ybc) yazVar.b;
        ybcVar2.b |= 2;
        ybcVar2.d = z;
        ybb ybbVar = ybb.a;
        yba ybaVar = new yba();
        if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybaVar.y();
        }
        int i = this.b;
        ybb ybbVar2 = (ybb) ybaVar.b;
        ybbVar2.b |= 1;
        ybbVar2.e = i;
        if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybaVar.y();
        }
        gki gkiVar = this.d;
        int i2 = this.c;
        ybb ybbVar3 = (ybb) ybaVar.b;
        ybbVar3.b |= 2;
        ybbVar3.f = i2;
        boolean zM = gkiVar.m();
        if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybaVar.y();
        }
        int i3 = this.e;
        ybb ybbVar4 = (ybb) ybaVar.b;
        ybbVar4.b |= 8;
        ybbVar4.h = zM;
        String strL = gkiVar.l();
        if (strL == null) {
            strL = "";
        }
        xzv.b(strL, ybaVar);
        xzv.c(i3 != 74249 ? gkiVar.f() : "", ybaVar);
        if (i3 != 0) {
            if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ybaVar.y();
            }
            ybb ybbVar5 = (ybb) ybaVar.b;
            ybbVar5.b |= 4;
            ybbVar5.g = i3;
        }
        gkj gkjVar = this.f;
        if (gkjVar != null) {
            ygk ygkVar = ygk.a;
            ygj ygjVar = new ygj();
            yhb.b(gkjVar.d(), ygjVar);
            if ((ygjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ygjVar.y();
            }
            ygk ygkVar2 = (ygk) ygjVar.b;
            ygkVar2.b |= 2;
            ygkVar2.d = i3;
            ygk ygkVarA = yhb.a(ygjVar);
            if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ybaVar.y();
            }
            ybb ybbVar6 = (ybb) ybaVar.b;
            ybbVar6.l = ygkVarA;
            ybbVar6.b |= 64;
        }
        ybb ybbVarA = xzv.a(ybaVar);
        if ((yazVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yazVar.y();
        }
        ybc ybcVar3 = (ybc) yazVar.b;
        ybcVar3.c = ybbVarA;
        ybcVar3.b |= 1;
        ybc ybcVarA = xzw.a(yazVar);
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ybcVarA;
        ycbVar.c = 16;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gje gjeVar = new gje(this.a, this.b, this.c, this.d, this.e, this.f, agswVar);
        gjeVar.g = obj;
        return gjeVar;
    }
}
