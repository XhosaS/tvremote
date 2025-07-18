package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaaz extends zzn {
    public final aaby a;

    public aaaz(aaby aabyVar) throws GeneralSecurityException {
        a(aabyVar);
        this.a = aabyVar;
        if (aabyVar.e.equals(aadj.RAW)) {
            aage.a(new byte[0]);
            return;
        }
        if (aabyVar.e.equals(aadj.TINK)) {
            int iIntValue = aabyVar.f.intValue();
            int i = aabl.a;
            aage.a(ByteBuffer.allocate(5).put((byte) 1).putInt(iIntValue).array());
        } else {
            if (!aabyVar.e.equals(aadj.LEGACY) && !aabyVar.e.equals(aadj.CRUNCHY)) {
                throw new GeneralSecurityException("Unknown output prefix type");
            }
            int iIntValue2 = aabyVar.f.intValue();
            int i2 = aabl.a;
            aage.a(ByteBuffer.allocate(5).put((byte) 0).putInt(iIntValue2).array());
        }
    }

    public static void a(aaby aabyVar) {
        int i = aaay.b[aabyVar.d.ordinal()];
    }
}
