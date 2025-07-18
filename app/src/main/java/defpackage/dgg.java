package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgg implements daw {
    private final Resources.Theme a;
    private final Resources b;
    private final dgh c;
    private final int d;
    private Object e;

    public dgg(Resources.Theme theme, Resources resources, dgh dghVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = dghVar;
        this.d = i;
    }

    @Override // defpackage.daw
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.daw
    public final void d() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) {
        try {
            Object objC = this.c.c(this.a, this.b, this.d);
            this.e = objC;
            davVar.b(objC);
        } catch (Resources.NotFoundException e) {
            davVar.e(e);
        }
    }

    @Override // defpackage.daw
    public final int g() {
        return 1;
    }

    @Override // defpackage.daw
    public final void cz() {
    }
}
