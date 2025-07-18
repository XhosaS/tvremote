package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvx implements hlg {
    private final int b;
    private final hlg c;

    public hvx(int i, hlg hlgVar) {
        this.b = i;
        this.c = hlgVar;
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        if (obj instanceof hvx) {
            hvx hvxVar = (hvx) obj;
            if (this.b == hvxVar.b && this.c.equals(hvxVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        return hwp.d(this.c, this.b);
    }
}
