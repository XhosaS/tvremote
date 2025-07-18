package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pg implements bbk {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public pg(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.media3.exoplayer.ExoPlayer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [dvj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [dvj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [eam, java.lang.Object] */
    @Override // defpackage.bbk
    public final void a() {
        switch (this.c) {
            case 0:
                ((pf) this.a).d.remove(this.b);
                break;
            case 1:
                ((ny) this.b).a.n(this.a);
                break;
            case 2:
                pa paVarB = ((hnj) this.a).b();
                if (paVarB != null) {
                    ((pf) this.b).n(paVarB.a);
                    break;
                }
                break;
            case 3:
                ((pf) this.b).n((pd) this.a);
                break;
            case 4:
                zs zsVar = (zs) this.b;
                int i = zsVar.h - 1;
                zsVar.h = i;
                if (i == 0) {
                    Object obj = this.a;
                    int[] iArr = cww.a;
                    View view = (View) obj;
                    cwm.l(view, null);
                    nxb.q(view, null);
                    view.removeOnAttachStateChangeListener(zsVar.i);
                    break;
                }
                break;
            case 5:
                ((adq) this.a).a.h(this.b);
                break;
            case 6:
                ((ajs) this.a).b.remove(this.b);
                break;
            case 7:
                ((Context) this.a).getApplicationContext().unregisterComponentCallbacks(this.b);
                break;
            case 8:
                ((Context) this.a).getApplicationContext().unregisterComponentCallbacks(this.b);
                break;
            case 9:
                this.b.getLifecycle().d(this.a);
                break;
            case 10:
                ((fwr) this.b).getLifecycle().d(this.a);
                break;
            case 11:
                Iterator it = a.i(this.a).iterator();
                while (it.hasNext()) {
                    ((fyc) this.b).d((fwr) it.next());
                }
                break;
            case 12:
                this.a.X(this.b);
                break;
            default:
                yqe yqeVarG = jxl.g(this.a);
                if (yqeVarG != null) {
                    yqeVarG.t(null);
                }
                jxl.i((ovq) this.b);
                break;
        }
    }

    public pg(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
