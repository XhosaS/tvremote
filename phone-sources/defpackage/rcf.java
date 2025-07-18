package defpackage;

import android.support.v7.recyclerview.extensions.ListAdapter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcf extends rbn {
    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vqu) obj2).getClass();
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        rcg rcgVar = (rcg) obj;
        vqu vquVar = (vqu) obj2;
        vquVar.getClass();
        List list = vquVar.a;
        rcgVar.a.setVisibility(true != list.isEmpty() ? 0 : 8);
        ((ListAdapter) rcgVar.b).submitList(list);
    }
}
