package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdc {
    public final xdi a;

    public xdc(xdi xdiVar) {
        this.a = xdiVar;
    }

    public final /* synthetic */ xdl a() {
        abxd abxdVarV = this.a.v();
        abxdVarV.getClass();
        return (xdl) abxdVarV;
    }

    public final void b(int i) {
        xdi xdiVar = this.a;
        if ((xdiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xdiVar.y();
        }
        xdl xdlVar = (xdl) xdiVar.b;
        xdl xdlVar2 = xdl.a;
        xdlVar.k = i - 1;
        xdlVar.b |= 131072;
    }
}
