package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xve {
    public final xvf a;

    public xve(xvf xvfVar) {
        this.a = xvfVar;
    }

    public final /* synthetic */ xvg a() {
        abxd abxdVarV = this.a.v();
        abxdVarV.getClass();
        return (xvg) abxdVarV;
    }

    public final xvn b() {
        xvn xvnVar = ((xvg) this.a.b).i;
        if (xvnVar == null) {
            xvnVar = xvn.a;
        }
        xvnVar.getClass();
        return xvnVar;
    }

    public final void c(xtv xtvVar) {
        xtvVar.getClass();
        xvf xvfVar = this.a;
        if ((xvfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xvfVar.y();
        }
        xvg xvgVar = (xvg) xvfVar.b;
        xvg xvgVar2 = xvg.a;
        xvgVar.g = xtvVar.an;
        xvgVar.b |= 512;
    }

    public final void d(String str) {
        xvf xvfVar = this.a;
        if ((xvfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xvfVar.y();
        }
        xvg xvgVar = (xvg) xvfVar.b;
        xvg xvgVar2 = xvg.a;
        xvgVar.b |= 1048576;
        xvgVar.j = str;
    }
}
