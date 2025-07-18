package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqz implements err {
    final /* synthetic */ erb a;

    public eqz(erb erbVar) {
        this.a = erbVar;
    }

    @Override // defpackage.err
    public final void b() {
        this.a.c.remove(this);
    }

    @Override // defpackage.err
    public final boolean k(Uri uri, zuw zuwVar, boolean z) {
        era eraVar;
        erb erbVar = this.a;
        if (erbVar.i == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            erm ermVar = erbVar.g;
            String str = edt.a;
            List list = ermVar.c;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                era eraVar2 = (era) erbVar.b.get(((esn) list.get(i2)).e);
                if (eraVar2 != null && jElapsedRealtime < eraVar2.e) {
                    i++;
                }
            }
            aacv aacvVarJ = sew.j(new fht(1, 0, erbVar.g.c.size(), i), zuwVar);
            if (aacvVarJ != null && aacvVarJ.a == 2 && (eraVar = (era) erbVar.b.get(uri)) != null) {
                eraVar.i(aacvVarJ.b);
            }
        }
        return false;
    }
}
