package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oaa extends ong implements nws, nwt {
    private static final ocv h = ond.d;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final oav d;
    public onj e;
    public nzf f;
    public final ocv g;

    public oaa(Context context, Handler handler, oav oavVar) {
        ocv ocvVar = h;
        this.a = context;
        this.b = handler;
        this.d = oavVar;
        this.c = oavVar.b;
        this.g = ocvVar;
    }

    @Override // defpackage.ong
    public final void a(onl onlVar) {
        this.b.post(new non(this, onlVar, 9, (short[]) null));
    }

    @Override // defpackage.nzw
    public final void aC(nve nveVar) {
        this.f.b(nveVar);
    }

    @Override // defpackage.nyc
    public final void aD(Bundle bundle) {
        this.e.q(this);
    }

    @Override // defpackage.nyc
    public final void aE(int i) {
        nzf nzfVar = this.f;
        nzd nzdVar = (nzd) nzfVar.e.l.get(nzfVar.b);
        if (nzdVar != null) {
            if (nzdVar.g) {
                nzdVar.k(new nve(17));
            } else {
                nzdVar.aE(i);
            }
        }
    }
}
