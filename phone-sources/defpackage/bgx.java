package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgx<K, V, T> extends bgv<K, V, T> implements Iterator<T>, yli {
    public final bgw d;
    public int e;
    private Object f;
    private boolean g;

    public bgx(bgw bgwVar, bhd[] bhdVarArr) {
        super(bgwVar.a, bhdVarArr);
        this.d = bgwVar;
        this.e = bgwVar.c;
    }

    public final void b(int i, bhc bhcVar, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            bhd[] bhdVarArr = this.a;
            bhd bhdVar = bhdVarArr[i2];
            Object[] objArr = bhcVar.b;
            bhdVar.d(objArr, objArr.length, 0);
            while (!yks.e(bhdVarArr[i2].a(), obj)) {
                bhdVarArr[i2].b += 2;
            }
            this.b = i2;
            return;
        }
        int iBM = 1 << a.bM(i, i3);
        if (bhcVar.l(iBM)) {
            int iB = bhcVar.b(iBM);
            bhd bhdVar2 = this.a[i2];
            Object[] objArr2 = bhcVar.b;
            int iA = bhcVar.a();
            bhdVar2.d(objArr2, iA + iA, iB);
            this.b = i2;
            return;
        }
        int iC = bhcVar.c(iBM);
        bhc bhcVarH = bhcVar.h(iC);
        bhd bhdVar3 = this.a[i2];
        Object[] objArr3 = bhcVar.b;
        int iA2 = bhcVar.a();
        bhdVar3.d(objArr3, iA2 + iA2, iC);
        b(i, bhcVarH, obj, i2 + 1);
    }

    @Override // defpackage.bgv, java.util.Iterator
    public final T next() {
        if (this.d.c != this.e) {
            throw new ConcurrentModificationException();
        }
        this.f = a();
        this.g = true;
        return (T) super.next();
    }

    @Override // defpackage.bgv, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        if (this.c) {
            Object objA = a();
            bgw bgwVar = this.d;
            Object obj = this.f;
            ylh.g(bgwVar);
            bgwVar.remove(obj);
            b(objA != null ? objA.hashCode() : 0, bgwVar.a, objA, 0);
        } else {
            bgw bgwVar2 = this.d;
            Object obj2 = this.f;
            ylh.g(bgwVar2);
            bgwVar2.remove(obj2);
        }
        this.f = null;
        this.g = false;
        this.e = this.d.c;
    }
}
