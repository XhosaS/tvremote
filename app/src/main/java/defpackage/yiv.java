package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yiv {
    public final yit a;

    public yiv(yit yitVar) {
        this.a = yitVar;
    }

    public final /* synthetic */ yiu a() {
        abxd abxdVarV = this.a.v();
        abxdVarV.getClass();
        return (yiu) abxdVarV;
    }

    public final void b(String str) {
        str.getClass();
        yit yitVar = this.a;
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar = (yiu) yitVar.b;
        yiu yiuVar2 = yiu.a;
        yiuVar.b |= 256;
        yiuVar.g = str;
    }

    public final void c(String str) {
        yit yitVar = this.a;
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar = (yiu) yitVar.b;
        yiu yiuVar2 = yiu.a;
        yiuVar.b |= 1;
        yiuVar.c = str;
    }

    public final void d(int i) {
        yit yitVar = this.a;
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar = (yiu) yitVar.b;
        yiu yiuVar2 = yiu.a;
        yiuVar.e = i - 1;
        yiuVar.b |= 8;
    }

    public final void e() {
        yit yitVar = this.a;
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar = (yiu) yitVar.b;
        yiu yiuVar2 = yiu.a;
        yiuVar.d = 7;
        yiuVar.b |= 2;
    }
}
