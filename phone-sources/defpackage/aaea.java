package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class aaea extends aaeb {
    private final int b;
    private final aabu c;

    public aaea(aabo aaboVar, aabu aabuVar, aabu aabuVar2) {
        super(aaboVar, aabuVar);
        if (!aabuVar2.g()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int iE = (int) (aabuVar2.e() / this.a);
        this.b = iE;
        if (iE < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.c = aabuVar2;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % this.b);
        }
        int i = this.b;
        return (i - 1) + ((int) (((j + 1) / this.a) % i));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int c() {
        return this.b - 1;
    }

    @Override // defpackage.aaeb, defpackage.aadr, defpackage.aabm
    public final long h(long j, int i) {
        vxr.ay(this, i, 0, c());
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return this.c;
    }
}
