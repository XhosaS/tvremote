package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xks {
    public final xkx a;

    public xks(xkx xkxVar) {
        this.a = xkxVar;
    }

    public final /* synthetic */ xky a() {
        abxd abxdVarV = this.a.v();
        abxdVarV.getClass();
        return (xky) abxdVarV;
    }

    public final void b(String str) {
        xkx xkxVar = this.a;
        if ((xkxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xkxVar.y();
        }
        xky xkyVar = (xky) xkxVar.b;
        xky xkyVar2 = xky.a;
        xkyVar.b |= 4;
        xkyVar.d = str;
    }
}
