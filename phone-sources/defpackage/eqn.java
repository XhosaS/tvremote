package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqn implements ewy {
    final /* synthetic */ eqo a;

    public eqn(eqo eqoVar) {
        this.a = eqoVar;
    }

    public final void a(Uri uri) {
        ((era) this.a.e.b.get(uri)).e(true);
    }

    @Override // defpackage.ewy
    public final /* bridge */ /* synthetic */ void b(ewz ewzVar) {
        eqo eqoVar = this.a;
        eqoVar.a.b(eqoVar);
    }

    public final void c() {
        eqo eqoVar = this.a;
        int i = eqoVar.b - 1;
        eqoVar.b = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (eqt eqtVar : eqoVar.d) {
            i2 += eqtVar.f().c;
        }
        eba[] ebaVarArr = new eba[i2];
        int i3 = 0;
        for (eqt eqtVar2 : eqoVar.d) {
            int i4 = eqtVar2.f().c;
            int i5 = 0;
            while (i5 < i4) {
                ebaVarArr[i3] = eqtVar2.f().b(i5);
                i5++;
                i3++;
            }
        }
        eqoVar.c = new exi(ebaVarArr);
        eqoVar.a.dp(eqoVar);
    }
}
