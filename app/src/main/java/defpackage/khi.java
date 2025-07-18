package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khi {
    public volatile Object a;
    public volatile khg b;
    private final Executor c;

    public khi(Looper looper, Object obj, String str) {
        this.c = new klv(looper);
        kkk.l(obj, "Listener must not be null");
        this.a = obj;
        kkk.h(str);
        this.b = new khg(obj, str);
    }

    public final void a(final khh khhVar) {
        this.c.execute(new Runnable() { // from class: khf
            @Override // java.lang.Runnable
            public final void run() {
                khh khhVar2 = khhVar;
                Object obj = this.a.a;
                if (obj == null) {
                    return;
                }
                khhVar2.a(obj);
            }
        });
    }

    public khi(Executor executor, Object obj, String str) {
        this.c = executor;
        this.a = obj;
        kkk.h(str);
        this.b = new khg(obj, str);
    }
}
