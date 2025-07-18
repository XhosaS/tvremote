package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qfg implements uht {
    public final Context a;
    public final Object b;
    public final HashMap c;
    public final HashMap d;
    public final pmq e;

    public qfg(Context context) {
        pmq pmqVar = new pmq(new mcw());
        this.b = new Object();
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = context;
        this.e = pmqVar;
    }

    @Override // defpackage.uht
    public final uhs a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.uht
    public final uhs b(Uri uri) {
        uhs uhsVar;
        synchronized (this.b) {
            uhsVar = (uhs) this.d.get(uri);
        }
        return uhsVar;
    }

    @Override // defpackage.uht
    public final void f() {
    }
}
