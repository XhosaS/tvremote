package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xi implements xj {
    private final /* synthetic */ int a;

    public xi(int i) {
        this.a = i;
    }

    @Override // defpackage.xj
    public final /* synthetic */ float a() {
        return 0.0f;
    }

    @Override // defpackage.xj
    public final void c(clx clxVar, int i, int[] iArr, int[] iArr2) {
        if (this.a != 0) {
            xk.c(i, iArr, iArr2, false);
        } else {
            xk.b(iArr, iArr2, false);
        }
    }

    public final String toString() {
        return this.a != 0 ? "Arrangement#Bottom" : "Arrangement#Top";
    }
}
