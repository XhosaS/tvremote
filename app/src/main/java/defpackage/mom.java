package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class mom {
    public final moi a;
    public float b = 1.0f;

    public mom(moi moiVar) {
        this.a = moiVar;
    }

    public final void a() {
        this.b = 1.0f;
        moi moiVar = this.a;
        View view = (View) moiVar.a.get();
        List<mte> list = moiVar.m;
        if (list == null || view == null) {
            return;
        }
        for (mte mteVar : list) {
            mtx mtxVar = mteVar.e;
            oaa oaaVar = mtxVar.b;
            CommandOuterClass$Command commandOuterClass$CommandA = mteVar.a.a();
            obz obzVar = mteVar.b;
            nzw nzwVar = mteVar.c;
            oal oalVar = mteVar.d;
            oaaVar.a(commandOuterClass$CommandA, mtx.g(view, null, 9, null, null, obzVar, nzwVar, oalVar, null)).b(mtxVar.c.a(oalVar)).k();
        }
    }
}
