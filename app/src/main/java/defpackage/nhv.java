package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhv extends mii {
    public nhv() {
        super(191923252, nhw.class, new mim() { // from class: nht
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aefl aeflVar = new aefl();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeflVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbc(aeflVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nhu.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nss(upbMessage);
        }
        int i = nss.d;
        return nsr.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nss.e;
    }
}
