package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkk {
    public final hkl a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ hkm d;

    public hkk(hkm hkmVar, hkl hklVar) {
        this.d = hkmVar;
        this.a = hklVar;
        this.b = hklVar.e ? null : new boolean[hkmVar.d];
    }

    public final void a() {
        this.d.a(this, false);
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
