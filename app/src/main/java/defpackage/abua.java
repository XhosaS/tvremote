package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abua extends abww implements abyr {
    public abua() {
        super(abub.a);
    }

    public final void a(int i) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        abub abubVar = (abub) this.b;
        abub abubVar2 = abub.a;
        abxj abxjVar = abubVar.d;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            abubVar.d = abxjVar.d(size + size);
        }
        abubVar.d.h(i);
    }
}
