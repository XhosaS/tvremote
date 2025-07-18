package defpackage;

import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zat extends AbstractList {
    final List a;
    final int b = 100;

    public zat(List list) {
        this.a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        yqw.al(i, size());
        int i2 = this.b;
        List list = this.a;
        int i3 = i * i2;
        return list.subList(i3, Math.min(i2 + i3, list.size()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return zsz.a(this.a.size(), this.b, RoundingMode.CEILING);
    }
}
