package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hpo implements hlu {
    private final Resources.Theme a;
    private final Resources b;
    private final hpp c;
    private final int d;
    private Object e;

    public hpo(Resources.Theme theme, Resources resources, hpp hppVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = hppVar;
        this.d = i;
    }

    @Override // defpackage.hlu
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.hlu
    public final void d() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.hlu
    public final void f(hjw hjwVar, hlt hltVar) {
        try {
            Object objC = this.c.c(this.a, this.b, this.d);
            this.e = objC;
            hltVar.b(objC);
        } catch (Resources.NotFoundException e) {
            hltVar.e(e);
        }
    }

    @Override // defpackage.hlu
    public final int g() {
        return 1;
    }

    @Override // defpackage.hlu
    public final void dL() {
    }
}
