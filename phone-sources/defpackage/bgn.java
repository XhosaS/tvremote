package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgn<T> extends bgh<T> implements ListIterator<T>, yli {
    private final bgl c;
    private int d;
    private bgq e;
    private int f;

    public bgn(bgl bglVar, int i) {
        super(i, bglVar.d);
        this.c = bglVar;
        this.d = bglVar.a();
        this.f = -1;
        f();
    }

    private final void c() {
        if (this.d != this.c.a()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void e() {
        bgl bglVar = this.c;
        this.b = bglVar.d;
        this.d = bglVar.a();
        this.f = -1;
        f();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    private final void f() {
        bgl bglVar = this.c;
        Object[] objArr = bglVar.b;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int iD = bga.d(bglVar.d);
        int iK = ykn.k(this.a, iD);
        int i = bglVar.a / 5;
        bgq bgqVar = this.e;
        int i2 = i + 1;
        if (bgqVar == null) {
            this.e = new bgq(objArr, iK, iD, i2);
            return;
        }
        bgqVar.a = iK;
        bgqVar.b = iD;
        bgqVar.c = i2;
        if (bgqVar.d.length < i2) {
            bgqVar.d = new Object[i2];
        }
        bgqVar.d[0] = objArr;
        ?? r6 = iK == iD ? 1 : 0;
        bgqVar.e = r6;
        bgqVar.c(iK - r6, 1);
    }

    @Override // defpackage.bgh, java.util.ListIterator
    public final void add(T t) {
        c();
        this.c.add(this.a, t);
        this.a++;
        e();
    }

    @Override // defpackage.bgh, java.util.ListIterator, java.util.Iterator
    public final T next() {
        c();
        a();
        int i = this.a;
        int i2 = i + 1;
        this.f = i;
        bgq bgqVar = this.e;
        if (bgqVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return (T) objArr[i];
        }
        if (bgqVar.hasNext()) {
            this.a = i2;
            return (T) bgqVar.next();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return (T) objArr2[i - bgqVar.b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        c();
        b();
        int i = this.a;
        int i2 = i - 1;
        this.f = i2;
        bgq bgqVar = this.e;
        if (bgqVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return (T) objArr[i2];
        }
        int i3 = bgqVar.b;
        if (i <= i3) {
            this.a = i2;
            return (T) bgqVar.previous();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return (T) objArr2[i2 - i3];
    }

    @Override // defpackage.bgh, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        d();
        this.c.d(this.f);
        int i = this.f;
        if (i < this.a) {
            this.a = i;
        }
        e();
    }

    @Override // defpackage.bgh, java.util.ListIterator
    public final void set(T t) {
        c();
        d();
        bgl bglVar = this.c;
        bglVar.set(this.f, t);
        this.d = bglVar.a();
        f();
    }
}
