package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nna extends mii {
    public nna() {
        super(225874218, nnb.class, new mim() { // from class: nmy
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aehd aehdVar = new aehd();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aehdVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new ncp(aehdVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nmz.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nxa(upbMessage);
        }
        int i = nxa.d;
        return nwz.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nxa.e;
    }
}
