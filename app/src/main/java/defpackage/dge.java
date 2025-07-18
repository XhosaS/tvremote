package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dge implements dhf, dgh {
    private final Context a;

    public dge(Context context) {
        this.a = context;
    }

    @Override // defpackage.dgh
    public final Class a() {
        return Drawable.class;
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return new dgi(this.a, this);
    }

    @Override // defpackage.dgh
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        Context context = this.a;
        return dlo.a(context, context, i, theme);
    }

    @Override // defpackage.dgh
    public final /* bridge */ /* synthetic */ void d(Object obj) {
    }
}
