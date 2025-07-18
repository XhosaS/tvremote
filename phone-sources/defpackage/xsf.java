package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsf extends xsj {
    private final xsg d;

    public xsf(String str, xsg xsgVar) {
        super(str, false);
        sij.v(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        sij.o(str.length() > 4, "empty key name");
        xsgVar.getClass();
        this.d = xsgVar;
    }

    @Override // defpackage.xsj
    public final Object a(byte[] bArr) {
        return this.d.a(bArr);
    }

    @Override // defpackage.xsj
    public final byte[] b(Object obj) {
        return this.d.b(obj);
    }
}
