package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adj extends adg {
    public static final List k = new CopyOnWriteArrayList();
    public final List l;

    public adj(Context context, String str, adv advVar, adk adkVar, ads adsVar) {
        super(context, str, advVar, adkVar, adsVar);
        this.l = new CopyOnWriteArrayList();
    }

    public final adh e(cmz cmzVar, apm apmVar) {
        qp.p(cmzVar);
        adh adhVar = new adh(this, cmzVar);
        adhVar.m = apmVar;
        return adhVar;
    }
}
