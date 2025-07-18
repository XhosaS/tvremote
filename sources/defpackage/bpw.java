package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.tv.remote.service.RemoteService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpw extends AsyncTask {
    final /* synthetic */ bpy a;
    final bsi b;
    final byj c;

    public bpw(bpy bpyVar, bsi bsiVar, byj byjVar) {
        this.a = bpyVar;
        this.b = bsiVar;
        this.c = byjVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        bty btyVar = new bty(((Context[]) objArr)[0]);
        if (btyVar.b(this.b)) {
            return btyVar;
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        bty btyVar = (bty) obj;
        if (btyVar != null) {
            this.a.a(btyVar);
        }
        ((RemoteService) this.c.a).f(btyVar);
    }
}
