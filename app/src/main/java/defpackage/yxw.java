package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yxw extends yxx {
    Object[] a;
    int b;
    boolean c;

    public yxw(int i) {
        ywl.b(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    private final void f(int i) {
        int length = this.a.length;
        int iE = e(length, this.b + i);
        if (iE > length || this.c) {
            this.a = Arrays.copyOf(this.a, iE);
            this.c = false;
        }
    }

    public final void a(Object[] objArr, int i) {
        zbw.b(objArr, i);
        f(i);
        System.arraycopy(objArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public final void b(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    @Override // defpackage.yxx
    public /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    @Override // defpackage.yxx
    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof yxy) {
                this.b = ((yxy) collection).b(this.a, this.b);
                return;
            }
        }
        super.d(iterable);
    }
}
