package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ccz {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);

    public final boolean f;

    ccz(boolean z) {
        this.f = z;
    }
}
