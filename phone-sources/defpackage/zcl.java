package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcl implements Closeable {
    public final zcj a;
    public final zci b;
    public final String c;
    public final int d;
    public final zcb e;
    public final zcc f;
    public final zcn g;
    public final zcl h;
    public final zcl i;
    public final zcl j;
    public final long k;
    public final long l;
    public zbm m;
    public final bmd n;

    public zcl(zcj zcjVar, zci zciVar, String str, int i, zcb zcbVar, zcc zccVar, zcn zcnVar, zcl zclVar, zcl zclVar2, zcl zclVar3, long j, long j2, bmd bmdVar) {
        this.a = zcjVar;
        this.b = zciVar;
        this.c = str;
        this.d = i;
        this.e = zcbVar;
        this.f = zccVar;
        this.g = zcnVar;
        this.h = zclVar;
        this.i = zclVar2;
        this.j = zclVar3;
        this.k = j;
        this.l = j2;
        this.n = bmdVar;
    }

    public static /* synthetic */ String a(zcl zclVar, String str) {
        String strB = zclVar.f.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        zcn zcnVar = this.g;
        if (zcnVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        zcnVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + "}";
    }
}
