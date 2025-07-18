package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aard implements aalb {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int f;

    aard(int i) {
        this.f = i;
    }

    @Override // defpackage.aalb
    public final int a() {
        return this.f;
    }
}
