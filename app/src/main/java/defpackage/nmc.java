package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmc extends mii {
    public nmc() {
        super(197633010, nmd.class, new mim() { // from class: nma
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aegu aeguVar = new aegu();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeguVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nch(aeguVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nmb.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nwf(upbMessage);
        }
        int i = nwf.d;
        return nwe.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nwf.e;
    }
}
