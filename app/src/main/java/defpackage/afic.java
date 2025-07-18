package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afic extends afid {
    public afic(String str, afhy afhyVar) {
        super(str, false);
        yqw.J(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        yqw.B(str.length() > 4, "empty key name");
        afhyVar.getClass();
    }

    @Override // defpackage.afid
    public final byte[] b(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.afid
    public final Object a(byte[] bArr) {
        return bArr;
    }
}
