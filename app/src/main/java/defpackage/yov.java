package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yov {
    public final yow a;
    public int b = 0;
    public long c = 0;

    public yov(yow yowVar) {
        this.a = yowVar;
    }

    public final int a() {
        return (int) Math.min(r0.c, this.a.a() - this.c);
    }

    public final void b(int i) {
        this.b = (this.b + i) % this.a.c;
    }
}
