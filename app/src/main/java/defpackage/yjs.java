package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjs {
    public final yjt a;

    public yjs(yjt yjtVar) {
        this.a = yjtVar;
    }

    public final /* synthetic */ yju a() {
        abxd abxdVarV = this.a.v();
        abxdVarV.getClass();
        return (yju) abxdVarV;
    }

    public final void b(String str) {
        str.getClass();
        yjt yjtVar = this.a;
        if ((yjtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yjtVar.y();
        }
        yju yjuVar = (yju) yjtVar.b;
        yju yjuVar2 = yju.a;
        yjuVar.b |= 2;
        yjuVar.d = str;
    }

    public final void c(String str) {
        str.getClass();
        yjt yjtVar = this.a;
        if ((yjtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yjtVar.y();
        }
        yju yjuVar = (yju) yjtVar.b;
        yju yjuVar2 = yju.a;
        yjuVar.b |= 1;
        yjuVar.c = str;
    }

    public final void d() {
        yjt yjtVar = this.a;
        if ((yjtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yjtVar.y();
        }
        yju yjuVar = (yju) yjtVar.b;
        yju yjuVar2 = yju.a;
        yjuVar.b |= 8;
        yjuVar.e = true;
    }
}
