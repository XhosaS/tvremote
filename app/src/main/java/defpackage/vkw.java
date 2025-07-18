package defpackage;

import android.content.Context;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkw implements dhe {
    public final Context a;

    public vkw(Context context) {
        this.a = context;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        return new dhd((vpr) obj, Collections.EMPTY_LIST, new vkv(this));
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((vpr) obj).b().j.equals("google");
    }
}
