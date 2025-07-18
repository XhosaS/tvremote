package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cwt {
    public static final PointF a = new PointF();

    public static int a(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static PointF b(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void c(css cssVar, int i, List list, css cssVar2, cre creVar) {
        if (cssVar.d(creVar.g(), i)) {
            list.add(cssVar2.b(creVar.g()).c(creVar));
        }
    }

    public static int d(int i) {
        return Math.max(0, Math.min(255, i));
    }
}
