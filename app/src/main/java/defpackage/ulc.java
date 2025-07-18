package defpackage;

import android.net.Uri;
import com.google.android.libraries.storage.protostore.MappedCounterCacheVersion;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ulc implements uie {
    private final uld a;

    public ulc(uld uldVar) {
        this.a = uldVar;
    }

    @Override // defpackage.uie
    public final zyd a(zyd zydVar) {
        final uld uldVar = this.a;
        return zuz.h(zydVar, new zvi() { // from class: uku
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws IOException {
                uld uldVar2 = uldVar;
                uldVar2.e((Uri) zxn.o(uldVar2.a), obj, (MappedCounterCacheVersion) zxn.o(uldVar2.g.b()));
                return zxy.a;
            }
        }, uldVar.b);
    }
}
