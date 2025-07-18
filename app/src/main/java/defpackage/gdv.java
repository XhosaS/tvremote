package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gdv extends gdq {
    final gdk a;
    private final gdj b;
    private final gdp c;
    private boolean d;

    public gdv(gdp gdpVar, gdk gdkVar) {
        this.c = gdpVar;
        this.b = new gdj(gdkVar);
        this.a = gdkVar;
    }

    @Override // defpackage.gdq
    public final gdp a() {
        return this.c;
    }

    @Override // defpackage.gdq
    public final gdq b() {
        gdk gdkVar = this.a;
        return new gdv((gdp) this.c.clone(), new gdk(new ArrayList(gdkVar.a), new ArrayList(gdkVar.b)));
    }

    @Override // defpackage.gdq
    public final List c() {
        return (List) this.b.a();
    }

    @Override // defpackage.gdq
    public final void d() {
        this.b.b = 0;
    }

    @Override // defpackage.gdq
    public final void e() {
        this.b.b = 0;
        this.d = true;
    }

    @Override // defpackage.gdq
    public final boolean f() {
        if (this.d) {
            return false;
        }
        this.b.b = 1;
        return true;
    }
}
