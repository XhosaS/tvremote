package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyo implements qtr {
    private final qwn a;

    public qyo(qwn qwnVar) {
        this.a = qwnVar;
    }

    @Override // defpackage.qtr
    public final /* synthetic */ void a(Object obj, ImageView imageView) {
        vrn vrnVar = (vrn) obj;
        if (vrnVar == null) {
            this.a.j.a(null, imageView);
            return;
        }
        qwn qwnVar = this.a;
        Object objH = rdd.h(qwnVar, vrnVar);
        if (objH == null) {
            return;
        }
        qwnVar.j.a(objH, imageView);
    }
}
