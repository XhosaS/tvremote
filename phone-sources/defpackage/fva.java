package defpackage;

import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fva {
    int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    Bundle f;

    public fva() {
        this.a = 1;
        this.b = Build.VERSION.SDK_INT >= 30;
    }

    public final void a() {
        this.a = 2;
    }

    public final void b(Bundle bundle) {
        this.f = new Bundle(bundle);
    }

    public fva(fvb fvbVar) {
        this.a = 1;
        this.a = fvbVar.a;
        this.c = fvbVar.c;
        this.d = fvbVar.d;
        this.b = fvbVar.b;
        this.e = fvbVar.e;
        Bundle bundle = fvbVar.f;
        this.f = bundle == null ? null : new Bundle(bundle);
    }
}
