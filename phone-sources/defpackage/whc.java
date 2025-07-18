package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum whc implements vug {
    UNKNOWN_SUPPORTED_ABI(0),
    ARM64_V8A(1),
    ARMEABI_V7A(2),
    X86_64(3),
    X86(4);

    public final int f;

    whc(int i) {
        this.f = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
