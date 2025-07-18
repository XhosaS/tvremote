package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpq implements daj {
    private final int b;
    private final daj c;

    public dpq(int i, daj dajVar) {
        this.b = i;
        this.c = dajVar;
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (obj instanceof dpq) {
            dpq dpqVar = (dpq) obj;
            if (this.b == dpqVar.b && this.c.equals(dpqVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.daj
    public final int hashCode() {
        return dqm.c(this.c, this.b);
    }
}
