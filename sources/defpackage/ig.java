package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ig {
    public final ih a = new ih();
    public final int b = 1;
    public final int c;
    public final int d;
    public final int e;
    public final wr f;
    public final /* synthetic */ wq g;

    public ig() {
    }

    public final int a() {
        wr wrVar = this.f;
        if (wrVar == null) {
            return 0;
        }
        return (wrVar.c - wrVar.b) + 1;
    }

    public ig(wq wqVar, int i, int i2, int i3) {
        this.g = wqVar;
        this.c = i;
        this.d = i3;
        this.e = i2;
        this.f = (wr) wqVar.j.get(i3);
    }
}
