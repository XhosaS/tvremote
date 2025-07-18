package defpackage;

import android.content.Context;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qkj implements dhe {
    public final qlz a;
    private final Context b;

    public qkj(Context context, qlz qlzVar) {
        this.b = context;
        this.a = qlzVar;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        qkg qkgVar = (qkg) obj;
        int i3 = 0;
        yqw.B(i == i2, "Width and height must be the same");
        int i4 = 120;
        if (i != Integer.MIN_VALUE) {
            Context context = this.b;
            if (i > 0) {
                float f = i / context.getResources().getDisplayMetrics().density;
                int[] iArr = {32, 48, 64, 120, 240};
                while (true) {
                    if (i3 >= 5) {
                        i4 = 240;
                        break;
                    }
                    i4 = iArr[i3];
                    if (i4 == 0) {
                        throw null;
                    }
                    if (f <= i4) {
                        break;
                    }
                    i3++;
                }
            } else {
                i4 = 64;
            }
        }
        return new dhd(qkgVar, Collections.EMPTY_LIST, new qki(this, qkgVar, i4));
    }

    @Override // defpackage.dhe
    public final /* synthetic */ boolean b(Object obj) {
        return ((qju) ((qkg) obj).b()).d;
    }
}
