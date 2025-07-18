package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzx {
    public final ybs a;

    public xzx(ybs ybsVar) {
        this.a = ybsVar;
    }

    public final /* synthetic */ ybz a() {
        abxd abxdVarV = this.a.v();
        abxdVarV.getClass();
        return (ybz) abxdVarV;
    }

    public final void b(String str) {
        str.getClass();
        ybs ybsVar = this.a;
        if ((ybsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybsVar.y();
        }
        ybz ybzVar = (ybz) ybsVar.b;
        abxk abxkVar = ybz.a;
        ybzVar.c |= 2048;
        ybzVar.o = str;
    }

    public final void c(String str) {
        ybs ybsVar = this.a;
        if ((ybsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybsVar.y();
        }
        ybz ybzVar = (ybz) ybsVar.b;
        abxk abxkVar = ybz.a;
        ybzVar.c |= 128;
        ybzVar.k = str;
    }

    public final /* synthetic */ void d(ybv ybvVar) {
        ybvVar.getClass();
        ybs ybsVar = this.a;
        if ((ybsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybsVar.y();
        }
        ybz ybzVar = (ybz) ybsVar.b;
        abxk abxkVar = ybz.a;
        abxj abxjVar = ybzVar.s;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            ybzVar.s = abxjVar.d(size + size);
        }
        ybzVar.s.h(ybvVar.d);
    }

    public final void e(int i) {
        ybs ybsVar = this.a;
        if ((ybsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybsVar.y();
        }
        ybz ybzVar = (ybz) ybsVar.b;
        abxk abxkVar = ybz.a;
        ybzVar.x = i - 1;
        ybzVar.c |= 8388608;
    }

    public final /* synthetic */ void f() {
        new abxl(((ybz) this.a.b).s, ybz.a);
    }
}
