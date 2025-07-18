package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class niq extends mii {
    public niq() {
        super(193805739, nir.class, new mim() { // from class: nio
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aefp aefpVar = new aefp();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aefpVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbg(aefpVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nip.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new ntf(upbMessage);
        }
        int i = ntf.d;
        return nte.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return ntf.e;
    }
}
