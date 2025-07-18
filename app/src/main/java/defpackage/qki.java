package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qki implements daw {
    final /* synthetic */ qkj a;
    private final qkg b;
    private zyd c;
    private final int d;

    public qki(qkj qkjVar, qkg qkgVar, int i) {
        this.a = qkjVar;
        this.b = qkgVar;
        this.d = i;
    }

    @Override // defpackage.daw
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.daw
    public final void cz() {
        zyd zydVar = this.c;
        if (zydVar != null) {
            zydVar.cancel(false);
            this.c = null;
        }
    }

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) {
        zyd zydVarF = this.a.a.f(((qju) this.b.b()).a, this.d);
        this.c = zydVarF;
        qkh qkhVar = new qkh(davVar);
        zxn.p(zydVarF, wyo.f(qkhVar), zwk.a);
    }

    @Override // defpackage.daw
    public final int g() {
        return 1;
    }

    @Override // defpackage.daw
    public final void d() {
    }
}
