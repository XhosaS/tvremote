package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class slh implements slj {
    public final /* synthetic */ slk a;
    private final /* synthetic */ int b;

    public /* synthetic */ slh(slk slkVar, int i) {
        this.b = i;
        this.a = slkVar;
    }

    @Override // defpackage.slj
    public final uhp a(IOException iOException, ulp ulpVar) {
        if (this.b == 0) {
            return ulpVar.as(iOException, this.a.d);
        }
        slk slkVar = this.a;
        return slkVar.f.e(trc.b(new lhx(slkVar, ulpVar, 14)), slkVar.c);
    }
}
