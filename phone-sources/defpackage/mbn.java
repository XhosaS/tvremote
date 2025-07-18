package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mbn implements Runnable, Comparable {
    private final Runnable a;
    private final int b;
    private final int c;

    public mbn(int i, int i2, Runnable runnable) {
        this.b = i;
        this.c = i2;
        this.a = runnable;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        mbn mbnVar = (mbn) obj;
        int i = mbnVar.b;
        int i2 = this.b;
        return i2 != i ? i2 - i : this.c - mbnVar.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
