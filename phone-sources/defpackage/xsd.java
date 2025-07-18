package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsd extends xsj {
    private final xse d;

    public xsd(String str, xse xseVar) {
        super(str, false);
        sij.v(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        xseVar.getClass();
        this.d = xseVar;
    }

    @Override // defpackage.xsj
    public final Object a(byte[] bArr) {
        return this.d.a(new String(bArr, StandardCharsets.US_ASCII));
    }

    @Override // defpackage.xsj
    public final byte[] b(Object obj) {
        return this.d.b(obj).getBytes(StandardCharsets.US_ASCII);
    }
}
