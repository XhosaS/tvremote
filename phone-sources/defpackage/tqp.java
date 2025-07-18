package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqp {
    public final int a;
    public final int b;
    public final int c;
    public final Object d;

    public tqp(int i, int i2, int i3, cvi cviVar) {
        this.b = i;
        this.a = i2;
        this.c = i3;
        this.d = cviVar;
    }

    public tqp(int i, Object obj, int i2, int i3) {
        this.b = i;
        this.d = obj;
        this.c = i2;
        this.a = i3;
    }

    public tqp(String str, int i, int i2) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = -1;
    }

    public tqp(String str, int i, int i2, int i3) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public tqp(tqq tqqVar, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = tqqVar;
    }
}
