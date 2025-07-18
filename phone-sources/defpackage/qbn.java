package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbn {
    public String a;
    public boolean b;
    public byte c;

    public final void a(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }

    public final nhu b() {
        String str;
        if (this.c == 1 && (str = this.a) != null) {
            return new nhu(str, null, null, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" accountType");
        }
        if (this.c == 0) {
            sb.append(" includeRestrictedAccounts");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c() {
        this.a = "com.google";
    }

    public final void d(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null message");
        }
        this.a = str;
    }

    public final void f(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
