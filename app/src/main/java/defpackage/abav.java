package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abav extends RuntimeException {
    static final long serialVersionUID = -4086729973971783390L;

    public abav() {
        super("Did not consume the entire document.");
    }

    public abav(String str, Throwable th) {
        super(str, th);
    }

    public abav(Throwable th) {
        super(th);
    }
}
