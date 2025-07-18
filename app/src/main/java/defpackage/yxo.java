package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yxo implements Iterable {
    protected yxo() {
    }

    public static yxo a(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new yxn(iterableArr);
    }

    public String toString() {
        return zag.h(this);
    }
}
