package defpackage;

import j$.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgd<E> extends ygp<E> implements List<E>, bge {
    private final bge a;
    private final int b;
    private final int c;
    private final int d;

    public bgd(bge bgeVar, int i, int i2) {
        this.a = bgeVar;
        this.b = i;
        this.c = i2;
        a.aC(i, i2, bgeVar.size());
        this.d = i2 - i;
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ygp, java.util.List
    public final E get(int i) {
        a.aA(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.ygp, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        a.aC(i, i2, this.d);
        bge bgeVar = this.a;
        int i3 = this.b;
        return new bgd(bgeVar, i + i3, i3 + i2);
    }
}
