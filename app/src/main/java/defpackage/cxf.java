package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxf extends cxj {
    public cxh a;

    public cxf(Uri uri) {
        super(uri);
        this.a.a.a.add(new cxm(-1L, "long", "millis", new String[]{"ttl"}));
    }

    @Override // defpackage.cxj
    public final cxl a() {
        return this.a.d();
    }

    @Override // defpackage.cxj
    public final void b(cxi cxiVar) {
        this.a = (cxh) cxiVar;
    }

    @Override // defpackage.cxj
    protected final cxi c() {
        return new cxh(this.b, cxo.a);
    }
}
