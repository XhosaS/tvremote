package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bud extends bvc {
    private static final String[] u = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property v = new btv(PointF.class);
    private static final Property w = new btw(PointF.class);
    private static final Property x = new btx(PointF.class);
    private static final Property y = new bty(PointF.class);
    private static final Property z = new btz(PointF.class);

    private final void f(bvl bvlVar) {
        View view = bvlVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        Map map = bvlVar.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", bvlVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    @Override // defpackage.bvc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.bvl r21, defpackage.bvl r22) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bud.a(android.view.ViewGroup, bvl, bvl):android.animation.Animator");
    }

    @Override // defpackage.bvc
    public final void b(bvl bvlVar) {
        f(bvlVar);
    }

    @Override // defpackage.bvc
    public final void c(bvl bvlVar) {
        f(bvlVar);
    }

    @Override // defpackage.bvc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.bvc
    public final String[] e() {
        return u;
    }
}
