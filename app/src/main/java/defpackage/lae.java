package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class lae implements Runnable {
    private final lad a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map f;

    public lae(String str, lad ladVar, int i, Throwable th, byte[] bArr, Map map) {
        this.a = ladVar;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
