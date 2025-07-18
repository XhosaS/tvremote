package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syd extends syi {
    private final Typeface a;
    private final syc b;
    private boolean c;

    public syd(syc sycVar, Typeface typeface) {
        this.a = typeface;
        this.b = sycVar;
    }

    private final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    @Override // defpackage.syi
    public final void a(int i) {
        d(this.a);
    }

    @Override // defpackage.syi
    public final void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public final void c() {
        this.c = true;
    }
}
