package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qok extends Exception {
    public qok() {
        super("Failed to get ContentProviderClient for accounts from GmsCore");
    }

    public qok(Throwable th) {
        super("Error getting accounts via GmsCore", th);
    }
}
