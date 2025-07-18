package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czc {
    static final czb[] a = new czb[0];
    public czb[] b;
    public int c;
    private boolean d;

    public czc() {
        this(10);
    }

    static czb[] c(czb[] czbVarArr) {
        return czbVarArr.length <= 0 ? a : (czb[]) czbVarArr.clone();
    }

    public final czb a(int i) {
        int i2 = this.c;
        if (i < i2) {
            return this.b[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + i2);
    }

    public final void b(czb czbVar) {
        if (czbVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        int length = this.b.length;
        int i = this.c + 1;
        if ((i > length) | this.d) {
            czb[] czbVarArr = new czb[Math.max(length, (i >> 1) + i)];
            System.arraycopy(this.b, 0, czbVarArr, 0, this.c);
            this.b = czbVarArr;
            this.d = false;
        }
        this.b[this.c] = czbVar;
        this.c = i;
    }

    final czb[] d() {
        int i = this.c;
        if (i == 0) {
            return a;
        }
        czb[] czbVarArr = this.b;
        if (czbVarArr.length == i) {
            this.d = true;
            return czbVarArr;
        }
        czb[] czbVarArr2 = new czb[i];
        System.arraycopy(czbVarArr, 0, czbVarArr2, 0, i);
        return czbVarArr2;
    }

    public czc(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.b = i == 0 ? a : new czb[i];
        this.c = 0;
        this.d = false;
    }
}
