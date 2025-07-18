package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class reb {
    public Object a;
    public Object b;

    public reb(qux quxVar) {
        this.b = trk.a;
        this.b = quxVar.a;
        this.a = quxVar.b;
    }

    public final qux a() {
        Object obj = this.a;
        if (obj != null) {
            return new qux((tst) this.b, (qtl) obj);
        }
        throw new IllegalStateException("Missing required properties: accountCapabilitiesRetriever");
    }

    public final void b(quz quzVar) {
        this.b = tst.i(quzVar);
    }

    public final ptd c() {
        Object obj = this.b;
        if (obj == null) {
            throw new IllegalStateException("Missing required properties: key");
        }
        return new ptd((String) obj, (String) this.a);
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.b = str;
    }

    public reb(byte[] bArr) {
        this.b = trk.a;
    }

    public reb(char[] cArr) {
    }

    public reb() {
        this.a = ImmutableList.of();
        this.b = ImmutableList.of();
    }
}
