package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gji extends gju {
    private static final String[] v = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property w = new gja(PointF.class);
    private static final Property x = new gjb(PointF.class);
    private static final Property y = new gjc(PointF.class);
    private static final Property z = new gjd(PointF.class);
    private static final Property A = new gje(PointF.class);

    private static final void f(gke gkeVar) {
        View view = gkeVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        Map map = gkeVar.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", gkeVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    @Override // defpackage.gju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.gke r21, defpackage.gke r22) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gji.a(android.view.ViewGroup, gke, gke):android.animation.Animator");
    }

    @Override // defpackage.gju
    public final void b(gke gkeVar) {
        f(gkeVar);
    }

    @Override // defpackage.gju
    public final void c(gke gkeVar) {
        f(gkeVar);
    }

    @Override // defpackage.gju
    public final boolean d() {
        return true;
    }

    @Override // defpackage.gju
    public final String[] e() {
        return v;
    }
}
