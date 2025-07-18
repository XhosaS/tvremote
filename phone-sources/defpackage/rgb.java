package defpackage;

import android.content.Context;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgb extends qub {
    public Object b;
    public ImmutableList c = ImmutableList.of();
    public boolean d;
    public final yau e;
    private final quy f;
    private final Context g;

    public rgb(Context context, dvk dvkVar, quy quyVar) {
        this.g = context;
        this.f = quyVar;
        this.e = new yau(context);
        quyVar.d(dvkVar, new req(this, 8));
    }

    @Override // defpackage.qub
    public final void a(Object obj) {
        Object objI;
        sjl.c();
        this.b = obj;
        if (obj == null) {
            objI = trk.a;
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            builder.addAll((Iterable) this.c);
            builder.add((ImmutableList.Builder) this.b);
            ImmutableList immutableListBuild = builder.build();
            quy quyVar = this.f;
            if (quyVar.q(immutableListBuild)) {
                Context context = this.g;
                objI = tst.i(new qua(tst.i(new qtz(rrx.aE(context, context.getColor(true != ric.b(context).a ? R.color.google_grey900 : R.color.google_white), rrx.at(context, R.attr.ogRedColorOnSurface)), context.getString(R.string.og_critical_security_alert_badge_label_a11y), 3)), (this.d && Iterables.any(immutableListBuild, new lqh(quyVar, 7))) ? tst.i(new qup(null, this.e, null, 3)) : trk.a));
            } else {
                objI = trk.a;
            }
        }
        this.a.k(objI);
    }
}
