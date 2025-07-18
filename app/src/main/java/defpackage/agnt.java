package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agnt {
    public final Object[] a;
    Object[] b;
    int c;

    public agnt() {
        Object[] objArr = new Object[5];
        this.a = objArr;
        this.b = objArr;
    }

    public final void a(Object obj) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = obj;
        this.c = i + 1;
    }
}
