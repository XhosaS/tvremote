package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaea {
    public static final aaea a = new aaea("SHA1");
    public static final aaea b = new aaea("SHA256");
    public static final aaea c = new aaea("SHA512");
    public final String d;

    private aaea(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
