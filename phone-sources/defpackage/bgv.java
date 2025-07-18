package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgv<K, V, T> implements Iterator<T>, yli {
    public final bhd[] a;
    public int b;
    public boolean c = true;

    public bgv(bhc bhcVar, bhd[] bhdVarArr) {
        this.a = bhdVarArr;
        bhd bhdVar = bhdVarArr[0];
        Object[] objArr = bhcVar.b;
        int iA = bhcVar.a();
        bhdVar.c(objArr, iA + iA);
        this.b = 0;
        d();
    }

    private final int b(int i) {
        bhd[] bhdVarArr = this.a;
        if (bhdVarArr[i].e()) {
            return i;
        }
        if (!bhdVarArr[i].f()) {
            return -1;
        }
        bhd bhdVar = bhdVarArr[i];
        bhdVar.f();
        Object obj = bhdVar.a[bhdVar.b];
        obj.getClass();
        bhc bhcVar = (bhc) obj;
        if (i == 6) {
            bhd bhdVar2 = bhdVarArr[7];
            Object[] objArr = bhcVar.b;
            bhdVar2.c(objArr, objArr.length);
        } else {
            bhd bhdVar3 = bhdVarArr[i + 1];
            Object[] objArr2 = bhcVar.b;
            int iA = bhcVar.a();
            bhdVar3.c(objArr2, iA + iA);
        }
        return b(i + 1);
    }

    private final void c() {
        if (!this.c) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        bhd[] bhdVarArr = this.a;
        if (bhdVarArr[this.b].e()) {
            return;
        }
        for (int i = this.b; i >= 0; i--) {
            int iB = b(i);
            if (iB == -1) {
                if (bhdVarArr[i].f()) {
                    bhdVarArr[i].b();
                    iB = b(i);
                } else {
                    iB = -1;
                }
            }
            if (iB != -1) {
                this.b = iB;
                return;
            }
            if (i > 0) {
                bhdVarArr[i - 1].b();
            }
            bhdVarArr[i].c(bhc.a.b, 0);
        }
        this.c = false;
    }

    protected final Object a() {
        c();
        return this.a[this.b].a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public T next() {
        c();
        T next = this.a[this.b].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
