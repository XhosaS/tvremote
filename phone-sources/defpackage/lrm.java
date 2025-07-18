package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrm {
    public ieg a;
    public String b;
    public int c;
    public int d;
    public int e;
    public byte f;

    public final void a(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null account");
        }
        this.a = iegVar;
    }

    public final void b(int i) {
        this.c = i;
        this.f = (byte) (this.f | 1);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null partialQuery");
        }
        this.b = str;
    }
}
