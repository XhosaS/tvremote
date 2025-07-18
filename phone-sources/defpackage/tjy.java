package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjy extends tjp {
    final /* synthetic */ tkb a;

    public tjy(tkb tkbVar) {
        this.a = tkbVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        tig tigVar = (tig) obj;
        if (isCancelled()) {
            return;
        }
        tkb tkbVar = this.a;
        tkbVar.e = tigVar;
        tkbVar.e(true);
        tkbVar.g = null;
    }
}
