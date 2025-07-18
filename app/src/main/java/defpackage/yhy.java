package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yhy {
    public final yig a;

    public yhy(yig yigVar) {
        this.a = yigVar;
    }

    public final /* synthetic */ yil a() {
        abxd abxdVarV = this.a.v();
        abxdVarV.getClass();
        return (yil) abxdVarV;
    }

    public final void b(String str) {
        str.getClass();
        yig yigVar = this.a;
        if ((yigVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yigVar.y();
        }
        yil yilVar = (yil) yigVar.b;
        yil yilVar2 = yil.a;
        yilVar.b |= 256;
        yilVar.g = str;
    }

    public final void c(int i) {
        yig yigVar = this.a;
        if ((yigVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yigVar.y();
        }
        yil yilVar = (yil) yigVar.b;
        yil yilVar2 = yil.a;
        yilVar.n = i - 1;
        yilVar.c |= 524288;
    }
}
