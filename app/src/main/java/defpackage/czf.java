package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czf {
    public final czg a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ czi d;

    public czf(czi cziVar, czg czgVar) {
        this.d = cziVar;
        this.a = czgVar;
        this.b = czgVar.e ? null : new boolean[cziVar.d];
    }

    public final void a() {
        this.d.b(this, false);
    }

    public final void b() {
        if (this.c) {
            return;
        }
        try {
            a();
        } catch (IOException unused) {
        }
    }
}
