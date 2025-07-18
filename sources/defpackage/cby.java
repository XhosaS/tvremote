package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cby extends cdh {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(cck cckVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(cckVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.cdh
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cdh
    public final cck c(int i) {
        if (i < this.b) {
            return (cck) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.cdh
    public final Object d(cck cckVar) {
        int iA = a(cckVar);
        if (iA != -1) {
            return cckVar.c(this.a[iA + iA + 1]);
        }
        return null;
    }

    @Override // defpackage.cdh
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void f(cck cckVar, Object obj) {
        int iA;
        if (!cckVar.b && (iA = a(cckVar)) != -1) {
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
        cckVar.getClass();
        objArr2[i3] = cckVar;
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
