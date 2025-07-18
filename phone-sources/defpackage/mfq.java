package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfq {
    public static final lxq c = new lxq(16);
    public final int a;
    public final ieg b;
    private final String d;
    private final Map e;

    public mfq(int i, String str, byte[] bArr, Map map) {
        this.a = i;
        this.d = str;
        this.e = map;
        this.b = c() ? ieg.f(bArr) : ieg.b(new mfr(i, str));
    }

    public final ieg a() {
        return ieg.b(new mfr(this.a, this.d));
    }

    public final ieg b(String str) {
        return ieg.a((String) this.e.get(ksh.e(str)));
    }

    public final boolean c() {
        return this.a <= 300;
    }
}
