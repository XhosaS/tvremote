package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxb {
    public Object a;

    public nxb() {
    }

    public static /* synthetic */ void f(AtomicBoolean atomicBoolean, com comVar, yjk yjkVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            comVar.c(yjkVar.a());
        } catch (Throwable th) {
            comVar.d(th);
        }
    }

    public static void q(View view, cxj cxjVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(cxjVar != null ? new cxo(cxjVar) : null);
            return;
        }
        Interpolator interpolator = cxn.a;
        View.OnApplyWindowInsetsListener cxmVar = cxjVar != null ? new cxm(view, cxjVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, cxmVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(cxmVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0441 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4, types: [long] */
    /* JADX WARN: Type inference failed for: r28v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.util.ArrayList s(defpackage.nxb r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxb.s(nxb, java.lang.String):java.util.ArrayList");
    }

    public final boolean a() {
        oou oouVar = ((oox) this.a).a;
        ocv.aF(oouVar);
        return oouVar.a == 1;
    }

    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null trailers");
        }
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final myz c() {
        ?? r0 = this.a;
        if (r0 != 0) {
            return new myz(r0);
        }
        throw new IllegalStateException("Missing required properties: items");
    }

    public final void d(List list) {
        if (list == null) {
            throw new NullPointerException("Null items");
        }
        this.a = list;
    }

    public final mxy e() {
        return new mxy((tst) this.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final fur g() {
        if (this.a == null) {
            return fur.a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.a);
        return new fur(bundle, this.a);
    }

    public final void h(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i((String) it.next());
        }
    }

    public final void i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("category must not be null");
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (((ArrayList) this.a).contains(str)) {
            return;
        }
        ((ArrayList) this.a).add(str);
    }

    public final void j(fur furVar) {
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        h(furVar.b());
    }

    public final void k() {
        this.a = null;
        List list = edm.a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(this);
            }
        }
    }

    public final void l() {
        Object obj = this.a;
        obj.getClass();
        ((Message) obj).sendToTarget();
        k();
    }

    public final float m() {
        return ((cxq) this.a).h();
    }

    public final float n() {
        return ((cxq) this.a).j();
    }

    public final int o() {
        return ((cxq) this.a).k();
    }

    public final long p() {
        return ((cxq) this.a).l();
    }

    public final void r(float f) {
        ((cxq) this.a).g(f);
    }

    public nxb(Object obj) {
        this.a = obj;
    }

    public nxb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = trk.a;
    }

    public nxb(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = null;
    }

    public nxb(byte[] bArr, short[] sArr, byte[] bArr2) {
        this.a = new float[64];
    }

    public nxb(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new cxp(new WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new cxn(i, interpolator, j);
        }
    }

    public nxb(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new cxp(windowInsetsAnimation);
        }
    }

    public nxb(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = LogSessionId.LOG_SESSION_ID_NONE;
    }

    public nxb(fur furVar) {
        if (furVar != null) {
            furVar.c();
            if (furVar.c.isEmpty()) {
                return;
            }
            this.a = new ArrayList(furVar.c);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public nxb(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = Collections.EMPTY_LIST;
    }
}
