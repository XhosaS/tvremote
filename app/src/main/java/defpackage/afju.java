package defpackage;

import io.grpc.Status;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afju implements afig {
    @Override // defpackage.afig
    public final /* synthetic */ Object a(byte[] bArr) {
        int i;
        byte b;
        List list = Status.a;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return Status.OK;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return Status.c.withDescription("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = i + (b2 - 48);
            List list2 = Status.a;
            if (i2 < list2.size()) {
                return (Status) list2.get(i2);
            }
        }
        return Status.c.withDescription("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }

    @Override // defpackage.afig
    public final /* synthetic */ byte[] b(Object obj) {
        return ((Status) obj).getCode().r;
    }
}
