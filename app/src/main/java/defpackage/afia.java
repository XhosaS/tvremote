package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afia extends afid {
    private final afib d;

    public afia(String str, afib afibVar) {
        super(str, false);
        yqw.J(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        afibVar.getClass();
        this.d = afibVar;
    }

    @Override // defpackage.afid
    public final Object a(byte[] bArr) {
        return this.d.a(new String(bArr, StandardCharsets.US_ASCII));
    }

    @Override // defpackage.afid
    public final byte[] b(Object obj) {
        return this.d.b(obj).getBytes(StandardCharsets.US_ASCII);
    }
}
