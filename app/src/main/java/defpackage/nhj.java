package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhj extends mii {
    public nhj() {
        super(158796327, nhk.class, new mim() { // from class: nhh
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aefb aefbVar = new aefb();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aefbVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nax(aefbVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nhi.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nsh(upbMessage);
        }
        int i = nsh.d;
        return nsg.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nsh.e;
    }
}
