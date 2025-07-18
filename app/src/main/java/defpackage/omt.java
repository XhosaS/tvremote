package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omt extends omv {
    public yqt a = ypv.a;
    private String b;

    @Override // defpackage.omv
    public final omw a() {
        String str = this.b;
        if (str != null) {
            return new omu(str, this.a);
        }
        throw new IllegalStateException("Missing required properties: key");
    }

    @Override // defpackage.omv
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.b = str;
    }
}
