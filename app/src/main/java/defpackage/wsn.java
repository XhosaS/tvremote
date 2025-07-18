package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class wsn implements wwq {
    private final wwq a;
    private final UUID b;
    private final String c;
    private final String d;
    private Thread e;
    private wza f;

    public wsn(String str, wwq wwqVar, wwl wwlVar) {
        str.getClass();
        this.d = str;
        this.a = wwqVar;
        this.b = wwqVar.g();
        this.c = wwqVar.e();
        wza wzaVar = wwlVar.e;
        if (wzaVar == null) {
            this.f = null;
            this.e = Thread.currentThread();
        } else {
            this.f = wzaVar;
            this.e = null;
        }
        if (this.f == wwqVar.b()) {
            wwqVar.f();
        }
    }

    public static String fc(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.wwq
    public final wwq a() {
        return this.a;
    }

    @Override // defpackage.wwq
    public wza b() {
        return this.f;
    }

    @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        wum.m(this);
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.wwq
    public final String d() {
        return this.d;
    }

    @Override // defpackage.wwq
    public final String e() {
        return this.c;
    }

    @Override // defpackage.wwq
    public Thread f() {
        return this.e;
    }

    @Override // defpackage.wwq
    public final UUID g() {
        return this.b;
    }

    public final String toString() {
        return wum.l(this);
    }

    public wsn(String str, UUID uuid, String str2, wwl wwlVar) {
        this.d = str;
        Thread threadCurrentThread = null;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        wza wzaVar = wwlVar.e;
        if (wzaVar == null) {
            this.f = null;
            threadCurrentThread = Thread.currentThread();
        } else {
            this.f = wzaVar;
        }
        this.e = threadCurrentThread;
    }
}
