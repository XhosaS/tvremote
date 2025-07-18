package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum upm implements umj {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int f;

    upm(int i) {
        this.f = i;
    }

    @Override // defpackage.umj
    public final int a() {
        return this.f;
    }
}
