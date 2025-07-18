package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xti implements xsl {
    @Override // defpackage.xsl
    public final /* synthetic */ Object a(byte[] bArr) {
        int i;
        byte b;
        List list = xtk.a;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return xtk.b;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return xtk.d.e("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = i + (b2 - 48);
            List list2 = xtk.a;
            if (i2 < list2.size()) {
                return (xtk) list2.get(i2);
            }
        }
        return xtk.d.e("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }

    @Override // defpackage.xsl
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((xtk) obj).n.s;
    }
}
