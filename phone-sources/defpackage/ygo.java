package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ygo<E> extends ygp<E> implements RandomAccess {
    private final ygp a;
    private final int b;
    private final int c;

    public ygo(ygp ygpVar, int i, int i2) {
        this.a = ygpVar;
        this.b = i;
        a.aC(i, i2, ygpVar.a());
        this.c = i2 - i;
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ygp, java.util.List
    public final E get(int i) {
        a.aA(i, this.c);
        return (E) this.a.get(this.b + i);
    }
}
