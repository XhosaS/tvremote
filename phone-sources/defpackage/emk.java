package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class emk implements Executor {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public emk(isy isyVar, int i) {
        this.b = i;
        this.a = isyVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ecu, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                ((Handler) this.a).post(runnable);
                break;
            case 1:
                ((Choreographer) this.a).postFrameCallback(new dgq(runnable, 1));
                break;
            case 2:
                ((Handler) this.a).post(runnable);
                break;
            case 3:
                this.a.d(runnable);
                break;
            case 4:
                edt.aB(((foo) this.a).k, runnable);
                break;
            case 5:
                ((Handler) this.a).post(runnable);
                break;
            case 6:
                ((Handler) this.a).post(runnable);
                break;
            case 7:
                ((Handler) ((isy) this.a).b).post(runnable);
                break;
            case 8:
                ((Handler) this.a).post(runnable);
                break;
            default:
                ((Handler) this.a).post(runnable);
                break;
        }
    }

    public /* synthetic */ emk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
