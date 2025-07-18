package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkx extends mii {
    public nkx() {
        super(408993103, nky.class, new mim() { // from class: nkv
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aegr aegrVar = new aegr();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aegrVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbz(aegrVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nkw.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nvj(upbMessage);
        }
        int i = nvj.d;
        return nvi.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nvj.e;
    }
}
