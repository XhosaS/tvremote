package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class umm implements zvh {
    public final /* synthetic */ umt a;

    public /* synthetic */ umm(umt umtVar) {
        this.a = umtVar;
    }

    @Override // defpackage.zvh
    public final zyd a() {
        final umt umtVar = this.a;
        return zxn.i(zuz.h(umtVar.b, wyo.c(new zvi() { // from class: umj
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                Uri uri = (Uri) obj;
                Uri uriA = unp.a(uri, ".bak");
                try {
                    ueg uegVar = umtVar.d;
                    if (uegVar.h(uriA)) {
                        uegVar.g(uriA, uri);
                    }
                    return zxy.a;
                } catch (IOException e) {
                    return zxn.g(e);
                }
            }
        }), umtVar.c));
    }
}
