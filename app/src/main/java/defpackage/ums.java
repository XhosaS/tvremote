package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ums implements uie {
    private final umt a;

    public ums(umt umtVar) {
        this.a = umtVar;
    }

    @Override // defpackage.uie
    public final zyd a(zyd zydVar) {
        final umt umtVar = this.a;
        return zuz.h(zydVar, wyo.c(new zvi() { // from class: umh
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws IOException {
                umt umtVar2 = umtVar;
                umtVar2.d((Uri) zxn.o(umtVar2.b), obj);
                return zxy.a;
            }
        }), umtVar.c);
    }
}
