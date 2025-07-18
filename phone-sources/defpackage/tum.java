package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tum extends twa {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(tuy tuyVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(tuyVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.twa
    public final int b() {
        return this.b;
    }

    @Override // defpackage.twa
    public final tuy c(int i) {
        if (i < this.b) {
            return (tuy) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.twa
    public final Object d(tuy tuyVar) {
        int iA = a(tuyVar);
        if (iA != -1) {
            return tuyVar.c(this.a[iA + iA + 1]);
        }
        return null;
    }

    @Override // defpackage.twa
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void f(tuy tuyVar, Object obj) {
        int iA;
        if (!tuyVar.b && (iA = a(tuyVar)) != -1) {
            obj.getClass();
            this.a[iA + iA + 1] = obj;
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
        tuyVar.getClass();
        objArr2[i3] = tuyVar;
        obj.getClass();
        objArr2[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
