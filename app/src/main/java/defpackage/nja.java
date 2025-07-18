package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nja extends mii {
    public nja() {
        super(505142249, njb.class, new mim() { // from class: niy
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aefv aefvVar = new aefv();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aefvVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbk(aefvVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return niz.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new ntp(upbMessage);
        }
        int i = ntp.d;
        return nto.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return ntp.e;
    }
}
