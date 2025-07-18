package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abiz extends abww implements abyr {
    public abiz() {
        super(abja.a);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        abja abjaVar = (abja) this.b;
        abja abjaVar2 = abja.a;
        abxj abxjVar = abjaVar.b;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            abjaVar.b = abxjVar.d(size + size);
        }
        abus.m(iterable, abjaVar.b);
    }
}
