package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sua implements syc {
    final /* synthetic */ sub a;
    private final /* synthetic */ int b;

    public sua(sub subVar, int i) {
        this.b = i;
        this.a = subVar;
    }

    @Override // defpackage.syc
    public final void a(Typeface typeface) {
        if (this.b != 0) {
            sub subVar = this.a;
            if (subVar.H(typeface)) {
                subVar.l();
                return;
            }
            return;
        }
        sub subVar2 = this.a;
        if (subVar2.I(typeface)) {
            subVar2.l();
        }
    }
}
