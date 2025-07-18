package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbg extends pbi {
    public zlv a;
    public Integer b;
    public int[] c;
    public int[] d;
    private String e;
    private MessageLite f;
    private aece g;

    @Override // defpackage.pbi
    public final pbj a() {
        MessageLite messageLite;
        aece aeceVar;
        String str = this.e;
        if (str != null && (messageLite = this.f) != null && (aeceVar = this.g) != null) {
            return new pbh(str, messageLite, this.a, this.b, aeceVar, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" logSource");
        }
        if (this.f == null) {
            sb.append(" message");
        }
        if (this.g == null) {
            sb.append(" qosTier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.pbi
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null logSource");
        }
        this.e = str;
    }

    @Override // defpackage.pbi
    public final void c(MessageLite messageLite) {
        if (messageLite == null) {
            throw new NullPointerException("Null message");
        }
        this.f = messageLite;
    }

    @Override // defpackage.pbi
    public final void d(aece aeceVar) {
        if (aeceVar == null) {
            throw new NullPointerException("Null qosTier");
        }
        this.g = aeceVar;
    }
}
