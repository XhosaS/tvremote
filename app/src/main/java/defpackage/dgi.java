package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgi implements dhe {
    private final Context a;
    private final dgh b;

    public dgi(Context context, dgh dghVar) {
        this.a = context.getApplicationContext();
        this.b = dghVar;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        Integer num = (Integer) obj;
        Resources.Theme theme = (Resources.Theme) danVar.b(dlr.a);
        return new dhd(new dpt(num), Collections.EMPTY_LIST, new dgg(theme, theme != null ? theme.getResources() : this.a.getResources(), this.b, num.intValue()));
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
