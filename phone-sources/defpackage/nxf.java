package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxf extends UnsupportedOperationException {
    private final nvg a;

    public nxf(nvg nvgVar) {
        this.a = nvgVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
