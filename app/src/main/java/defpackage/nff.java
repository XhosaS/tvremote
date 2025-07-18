package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nff extends mii {
    public nff() {
        super(154604025, nfg.class, new mim() { // from class: nfd
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aeeq aeeqVar = new aeeq();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeeqVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nag(aeeqVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nfe.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nqd(upbMessage);
        }
        int i = nqd.d;
        return nqc.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nqd.e;
    }
}
