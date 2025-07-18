package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cvc implements cwh {
    public static final cvc a = new cvc();

    private cvc() {
    }

    @Override // defpackage.cwh
    public final /* bridge */ /* synthetic */ Object a(cwm cwmVar, float f) {
        boolean z = cwmVar.q() == 1;
        if (z) {
            cwmVar.h();
        }
        double dA = cwmVar.a();
        double dA2 = cwmVar.a();
        double dA3 = cwmVar.a();
        double dA4 = cwmVar.q() == 7 ? cwmVar.a() : 1.0d;
        if (z) {
            cwmVar.j();
        }
        if (dA <= 1.0d && dA2 <= 1.0d && dA3 <= 1.0d) {
            dA *= 255.0d;
            dA2 *= 255.0d;
            dA3 *= 255.0d;
            if (dA4 <= 1.0d) {
                dA4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dA4, (int) dA, (int) dA2, (int) dA3));
    }
}
