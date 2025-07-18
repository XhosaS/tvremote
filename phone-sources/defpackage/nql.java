package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nql {
    public nqm a;
    public Bitmap b;
    public nqk c;
    private final Context d;
    private final npc e;
    private Uri f;

    public nql(Context context) {
        this(context, new npc(-1, 0, 0));
    }

    private final void c() {
        nqm nqmVar = this.a;
        if (nqmVar != null) {
            nqmVar.cancel(true);
            this.a = null;
        }
        this.f = null;
        this.b = null;
    }

    public final void a() {
        c();
        this.c = null;
    }

    public final void b(Uri uri) {
        int i;
        if (uri == null) {
            c();
            return;
        }
        if (uri.equals(this.f)) {
            return;
        }
        c();
        this.f = uri;
        npc npcVar = this.e;
        int i2 = npcVar.b;
        if (i2 == 0 || (i = npcVar.c) == 0) {
            this.a = new nqm(this.d, 0, 0, this);
        } else {
            this.a = new nqm(this.d, i2, i, this);
        }
        nqm nqmVar = this.a;
        ocv.aF(nqmVar);
        Uri uri2 = this.f;
        ocv.aF(uri2);
        nqmVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public nql(Context context, npc npcVar) {
        this.d = context;
        this.e = npcVar;
        c();
    }
}
