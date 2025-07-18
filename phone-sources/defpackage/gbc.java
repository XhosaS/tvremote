package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbc<T> extends AbstractList<T> {
    public final List a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public gbc() {
        this.a = new ArrayList();
        this.e = true;
    }

    public final int a() {
        return this.b + this.f + this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        int i2 = i - this.b;
        if (i < 0 || i >= a()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + a());
        }
        if (i2 < 0 || i2 >= this.f) {
            return null;
        }
        List list = this.a;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            int size2 = ((gbn) list.get(i3)).b.size();
            if (size2 > i2) {
                break;
            }
            i3++;
            i2 -= size2;
        }
        return (T) ((gbn) list.get(i3)).b.get(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "leading " + this.b + ", dataCount " + this.f + ", trailing " + this.c + ' ' + yfm.ax(this.a, " ", null, null, null, 62);
    }

    public gbc(gbc gbcVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.e = true;
        arrayList.addAll(gbcVar.a);
        this.b = gbcVar.b;
        this.c = gbcVar.c;
        this.d = gbcVar.d;
        this.e = gbcVar.e;
        this.f = gbcVar.f;
        this.g = gbcVar.g;
    }
}
