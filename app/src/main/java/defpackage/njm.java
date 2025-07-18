package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njm extends mii {
    public njm() {
        super(183314536, njn.class, new mim() { // from class: njk
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aegb aegbVar = new aegb();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aegbVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbn(aegbVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return njl.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nua(upbMessage);
        }
        int i = nua.d;
        return ntz.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nua.e;
    }
}
