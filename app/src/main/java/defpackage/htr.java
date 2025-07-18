package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htr {
    static final /* synthetic */ htr a = new htr();

    private htr() {
    }

    public final void a(bq bqVar, String str) {
        str.getClass();
        Bundle bundle = bqVar.n;
        if (bundle == null) {
            bundle = new Bundle();
            bqVar.ae(bundle);
        }
        bundle.putString("response_text", str);
    }
}
