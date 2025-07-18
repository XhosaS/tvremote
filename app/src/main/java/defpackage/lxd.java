package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lxd extends Exception {
    public lxd() {
    }

    public lxd(String str) {
        super(str);
    }

    public lxd(Throwable th) {
        super("ContentProvider query failed", th);
    }
}
