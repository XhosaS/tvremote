package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zee extends zfx {
    public Object[] a = new Object[8];
    public int b = 0;

    @Override // defpackage.zfx
    public final int a() {
        return this.b;
    }

    @Override // defpackage.zfx
    public final zer b(int i) {
        if (i < this.b) {
            return (zer) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.zfx
    public final Object c(zer zerVar) {
        int iE = e(zerVar);
        if (iE == -1) {
            return null;
        }
        return zerVar.b.cast(this.a[iE + iE + 1]);
    }

    @Override // defpackage.zfx
    public final Object d(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e(zer zerVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(zerVar)) {
                return i;
            }
        }
        return -1;
    }

    final void f(zer zerVar, Object obj) {
        int iE;
        if (!zerVar.c && (iE = e(zerVar)) != -1) {
            obj.getClass();
            this.a[iE + iE + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i + i > length) {
            this.a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 + i2;
        zerVar.getClass();
        objArr2[i3] = zerVar;
        obj.getClass();
        objArr2[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(b(i));
            sb.append("': ");
            sb.append(d(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
