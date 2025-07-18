package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxq {
    public int a;
    public int b;
    public Object c;

    public xxq() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final xpv a() {
        return ((xqt) this.c.get(this.a)).c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final SocketAddress b() {
        return (SocketAddress) ((xqt) this.c.get(this.a)).b.get(this.b);
    }

    public final void c() {
        this.a = 0;
        this.b = 0;
    }

    public final pte d() {
        int i;
        int i2;
        Object obj = this.c;
        if (obj != null && (i = this.b) != 0 && (i2 = this.a) != 0) {
            return new pte((ptd) obj, i, i2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" preferenceKey");
        }
        if (this.b == 0) {
            sb.append(" preference");
        }
        if (this.a == 0) {
            sb.append(" preferenceSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public xxq(List list) {
        this.c = list;
    }
}
