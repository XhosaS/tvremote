package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uoh implements uje {
    private final Random a;

    public uoh(Random random) {
        this.a = random;
    }

    @Override // defpackage.uje
    public final zyd a() {
        return zxy.a;
    }

    @Override // defpackage.uje
    public final /* bridge */ /* synthetic */ zyd b(MessageLite messageLite) {
        acin acinVar = (acin) messageLite;
        if (!acinVar.c.isEmpty()) {
            return zxn.h(acinVar);
        }
        long jNextLong = this.a.nextLong();
        acim acimVar = new acim();
        acimVar.B(acinVar);
        String string = Long.toString(jNextLong);
        if ((acimVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acimVar.y();
        }
        acin acinVar2 = (acin) acimVar.b;
        string.getClass();
        acinVar2.b |= 1;
        acinVar2.c = string;
        return zxn.h((acin) acimVar.v());
    }

    @Override // defpackage.uje
    public final zyd c() {
        return zxn.h(true);
    }
}
