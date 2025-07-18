package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kr extends yhf {
    final /* synthetic */ kp a;
    private int b;

    public kr(kp kpVar) {
        this.a = kpVar;
    }

    @Override // defpackage.yhf
    public final int a() {
        int i = this.b;
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }
}
