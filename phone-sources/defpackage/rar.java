package defpackage;

import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rar extends rbn {
    private final rdb a;
    private final rcn b;

    public rar(rdb rdbVar, rcn rcnVar) {
        this.a = rdbVar;
        this.b = rcnVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vpd) obj2).getClass();
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        rbi rbiVar = (rbi) obj;
        vpd vpdVar = (vpd) obj2;
        vpdVar.getClass();
        if (vpdVar instanceof vpt) {
            ((TextView) ((cb) rbiVar.b).a).setVisibility(8);
            Object obj3 = rbiVar.a;
            ((ImageView) ((cb) obj3).a).setVisibility(0);
            this.b.c(obj3, ((vpt) vpdVar).a);
            return;
        }
        if (!(vpdVar instanceof vqm)) {
            throw new yfu();
        }
        ((ImageView) ((cb) rbiVar.a).a).setVisibility(8);
        Object obj4 = rbiVar.b;
        ((TextView) ((cb) obj4).a).setVisibility(0);
        this.a.c(obj4, ((vqm) vpdVar).a);
    }
}
