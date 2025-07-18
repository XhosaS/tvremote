package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cwa implements cwh {
    public static final cwa a = new cwa();

    private cwa() {
    }

    @Override // defpackage.cwh
    public final /* bridge */ /* synthetic */ Object a(cwm cwmVar, float f) {
        boolean z = cwmVar.q() == 1;
        if (z) {
            cwmVar.h();
        }
        float fA = (float) cwmVar.a();
        float fA2 = (float) cwmVar.a();
        while (cwmVar.o()) {
            cwmVar.n();
        }
        if (z) {
            cwmVar.j();
        }
        return new cxc((fA / 100.0f) * f, (fA2 / 100.0f) * f);
    }
}
