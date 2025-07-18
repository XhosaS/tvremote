package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zii {
    static final zih[] a = new zih[0];
    public zih[] b;
    public int c;
    private boolean d;

    public zii() {
        this(10);
    }

    static zih[] c(zih[] zihVarArr) {
        return zihVarArr.length <= 0 ? a : (zih[]) zihVarArr.clone();
    }

    public final zih a(int i) {
        int i2 = this.c;
        if (i < i2) {
            return this.b[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + i2);
    }

    public final void b(zih zihVar) {
        if (zihVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        int length = this.b.length;
        int i = this.c + 1;
        if ((i > length) | this.d) {
            zih[] zihVarArr = new zih[Math.max(length, (i >> 1) + i)];
            System.arraycopy(this.b, 0, zihVarArr, 0, this.c);
            this.b = zihVarArr;
            this.d = false;
        }
        this.b[this.c] = zihVar;
        this.c = i;
    }

    final zih[] d() {
        int i = this.c;
        if (i == 0) {
            return a;
        }
        zih[] zihVarArr = this.b;
        if (zihVarArr.length == i) {
            this.d = true;
            return zihVarArr;
        }
        zih[] zihVarArr2 = new zih[i];
        System.arraycopy(zihVarArr, 0, zihVarArr2, 0, i);
        return zihVarArr2;
    }

    public zii(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.b = i == 0 ? a : new zih[i];
        this.c = 0;
        this.d = false;
    }
}
