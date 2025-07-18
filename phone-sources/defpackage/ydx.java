package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum ydx {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    public final String e;

    ydx(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
