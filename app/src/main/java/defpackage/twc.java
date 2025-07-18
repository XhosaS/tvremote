package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum twc implements abxf {
    UNDEFINED(0),
    INTENT_API(1),
    SERVICE_API(2),
    VOICE_IME(3),
    GRPC_SERVICE_API(4);

    public final int f;

    twc(int i) {
        this.f = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
