package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bww {
    public final bwz a;
    public bvp b;
    public final yjz c;
    public final yjz d;
    public final yjz e;

    public bww(bwz bwzVar) {
        this.a = bwzVar;
        this.c = new bkl(this, 7);
        this.d = new bkl(this, 5);
        this.e = new bkl(this, 6);
    }

    public final bvp a() {
        bvp bvpVar = this.b;
        if (bvpVar != null) {
            return bvpVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public bww() {
        this(bvz.a);
    }
}
