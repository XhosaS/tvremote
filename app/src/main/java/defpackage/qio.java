package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qio {
    public final ueg a;
    private final Executor b;

    public qio(Executor executor, ueg uegVar) {
        this.b = executor;
        this.a = uegVar;
    }

    public final zyd a(qii qiiVar, int i) {
        final Uri uri = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Uri.parse(qiiVar.g) : Uri.parse(qiiVar.f) : Uri.parse(qiiVar.e) : Uri.parse(qiiVar.d) : Uri.parse(qiiVar.c) : Uri.parse(qiiVar.b);
        return zxn.l(new zvh() { // from class: qin
            @Override // defpackage.zvh
            public final zyd a() {
                return zxn.h((InputStream) this.a.a.c(uri, new uhi()));
            }
        }, this.b);
    }
}
