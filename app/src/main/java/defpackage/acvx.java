package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvx extends abww implements abyr {
    public acvx() {
        super(acwg.a);
    }

    public final void a(int i) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        acwg acwgVar = (acwg) this.b;
        acwg acwgVar2 = acwg.a;
        abxj abxjVar = acwgVar.e;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            acwgVar.e = abxjVar.d(size + size);
        }
        acwgVar.e.h(i);
    }
}
