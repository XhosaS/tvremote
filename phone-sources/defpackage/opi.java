package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class opi extends Exception {
    public opi() {
    }

    public opi(String str) {
        super(str);
    }

    public opi(Throwable th) {
        super("ContentProvider query failed", th);
    }
}
