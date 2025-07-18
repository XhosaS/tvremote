package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zoq extends abwy implements abxa {
    public zoq() {
        super(zot.a);
    }

    public final void a(int i) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        zot zotVar = (zot) this.b;
        zot zotVar2 = zot.a;
        abxj abxjVar = zotVar.e;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            zotVar.e = abxjVar.d(size + size);
        }
        zotVar.e.h(i);
    }
}
