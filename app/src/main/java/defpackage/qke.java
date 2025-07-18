package defpackage;

import android.content.Context;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qke implements dhe {
    private final Context a;

    public qke(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        qkg qkgVar = (qkg) obj;
        yqw.B(i == i2, "Width and height must be the same");
        qjw qjwVar = new qjw(this.a);
        if (i == Integer.MIN_VALUE) {
            i = 120;
        }
        return new dhd(qkgVar, Collections.EMPTY_LIST, new qkf(qjwVar, qkgVar, i));
    }

    @Override // defpackage.dhe
    public final /* synthetic */ boolean b(Object obj) {
        return qjw.a(((qkg) obj).b());
    }
}
