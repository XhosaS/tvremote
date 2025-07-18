package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmg extends Exception {
    public qmg() {
        super("Failed to access GNP API");
    }

    public qmg(Throwable th) {
        super("Failed to parse the response returned from GNP API", th);
    }
}
