package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsu {
    public final Context a;
    public final String b;
    public ntn c = ntn.a;
    public String d;
    public ntc e;

    public nsu(Context context, String str) {
        ocv.aF(context);
        this.a = context;
        ocv.aD(str);
        this.b = str;
    }

    public final nsz a() {
        return new nsz(this.a, this.b, this.d, this.c, null, null, this.e);
    }

    public final void b(ntn ntnVar) {
        ocv.aF(ntnVar);
        this.c = ntnVar;
        nsv.d(ntnVar);
    }
}
