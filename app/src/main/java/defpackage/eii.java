package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class eii implements eli {
    final /* synthetic */ eiz a;

    public eii(eiz eizVar) {
        this.a = eizVar;
    }

    @Override // defpackage.eli
    public final void a(int i, int i2, int i3, int i4, int i5) {
        eiz eizVar = this.a;
        eizVar.t = i;
        eizVar.u = i2;
        eizVar.F.b = false;
        eizVar.D();
        int i6 = eizVar.x;
        if (i6 != -1) {
            int iMax = Math.max(i6, i2 - i);
            int i7 = (int) (iMax * eizVar.g);
            List list = eizVar.a;
            int iMin = Math.min(iMax + i + i7, list.size() - 1);
            for (int iMax2 = Math.max(0, i - i7); iMax2 <= iMin; iMax2++) {
                ((efn) list.get(iMax2)).s(iMax2, i, i2);
            }
        }
    }
}
