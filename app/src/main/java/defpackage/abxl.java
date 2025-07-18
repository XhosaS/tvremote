package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abxl extends AbstractList {
    private final abxj a;
    private final abxk b;

    public abxl(abxj abxjVar, abxk abxkVar) {
        this.a = abxjVar;
        this.b = abxkVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
