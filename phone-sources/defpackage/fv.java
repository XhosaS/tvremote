package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fv {
    public boolean b;
    private final List a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public fv(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final fyw e() {
        fu fuVar = new fu(this);
        this.a.add(fuVar);
        return fuVar;
    }

    public final void f() throws Exception {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                a.h((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        List list = this.a;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((fyw) it2.next()).e();
        }
        list.clear();
    }

    public final void g(boolean z) {
        this.b = z;
        for (fyw fywVar : this.a) {
            fywVar.a = z;
            fyx fyxVar = fywVar.b;
            if (fyxVar != null) {
                fyxVar.d();
            }
        }
    }

    public void a() {
    }

    public void c(fd fdVar) {
    }

    public void d(fd fdVar) {
    }
}
