package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kt {
    public final aav b = new ks(this);
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public abstract void b();

    public void c(ke keVar) {
        throw null;
    }

    public void d() {
        throw null;
    }

    public final void e() throws Exception {
        Iterator it = this.c.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ii.W((ExecutorService) autoCloseable);
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
        this.b.e();
    }

    public final void f(boolean z) {
        aav aavVar = this.b;
        aavVar.b = z;
        ctj ctjVar = aavVar.c;
        if (ctjVar != null) {
            ctjVar.a();
        }
    }

    public final boolean g() {
        return this.b.b;
    }

    public void a() {
    }
}
