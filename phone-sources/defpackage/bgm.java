package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgm<T> extends bgh<T> {
    private final Object[] c;
    private final bgq d;

    public bgm(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int iD = bga.d(i2);
        this.d = new bgq(objArr, ykn.k(i, iD), iD, i3);
    }

    @Override // defpackage.bgh, java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        bgq bgqVar = this.d;
        if (bgqVar.hasNext()) {
            this.a++;
            return (T) bgqVar.next();
        }
        Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return (T) objArr[i - bgqVar.b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        b();
        int i = this.a;
        int i2 = i - 1;
        bgq bgqVar = this.d;
        int i3 = bgqVar.b;
        if (i <= i3) {
            this.a = i2;
            return (T) bgqVar.previous();
        }
        Object[] objArr = this.c;
        this.a = i2;
        return (T) objArr[i2 - i3];
    }
}
