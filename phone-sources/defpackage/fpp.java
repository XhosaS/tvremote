package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fpp implements fqn {
    public final /* synthetic */ int a;
    public final /* synthetic */ fnl b;
    private final /* synthetic */ int c;

    public /* synthetic */ fpp(fnl fnlVar, int i, int i2) {
        this.c = i2;
        this.b = fnlVar;
        this.a = i;
    }

    @Override // defpackage.fqn
    public final void a(fqt fqtVar, fnw fnwVar, List list) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                fqtVar.T(this.b.a(fnwVar, fqtVar, this.a), list);
                return;
            } else {
                fqtVar.T(this.b.a(fnwVar, fqtVar, this.a), list);
                return;
            }
        }
        int size = list.size();
        int i2 = this.a;
        fnl fnlVar = this.b;
        if (size != 1) {
            fqtVar.Z(fnlVar.a(fnwVar, fqtVar, i2), fnlVar.a(fnwVar, fqtVar, i2 + 1), list);
            return;
        }
        int iA = fnlVar.a(fnwVar, fqtVar, i2);
        dzy dzyVar = (dzy) list.get(0);
        fqtVar.aC();
        ImmutableList immutableListOf = ImmutableList.of(dzyVar);
        ((dyq) fqtVar.a).Z(iA, iA + 1, immutableListOf);
    }
}
