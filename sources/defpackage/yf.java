package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yf {
    public final Map b;

    public yf(byte[] bArr) {
        this((char[]) null);
    }

    public final void a(ye yeVar, Object obj) {
        this.b.put(yeVar, obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yf) && dnx.aB(this.b, ((yf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ')';
    }

    public yf() {
        this.b = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yf(yf yfVar) {
        this();
        yfVar.getClass();
        Map map = yfVar.b;
        this.b.putAll(map);
    }

    public /* synthetic */ yf(char[] cArr) {
        this(yd.a);
    }
}
