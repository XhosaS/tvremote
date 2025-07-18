package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqm extends AsyncTask {
    private final nqo a;
    private final nql b;

    static {
        new nsf("FetchBitmapTask");
    }

    public nqm(Context context, int i, int i2, nql nqlVar) {
        nqo nqoVarG;
        this.b = nqlVar;
        Context applicationContext = context.getApplicationContext();
        nnh nnhVar = new nnh(this, 3);
        int i3 = noe.a;
        try {
            nog nogVarA = noe.a(applicationContext.getApplicationContext());
            nqoVarG = nogVarA.a() >= 233700000 ? nogVarA.g(new odc(applicationContext.getApplicationContext()), new odc(this), nnhVar, i, i2) : nogVarA.f(new odc(this), nnhVar, i, i2);
        } catch (RemoteException | nni unused) {
            nsf.e();
            nqoVarG = null;
        }
        this.a = nqoVarG;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        nqo nqoVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (nqoVar = this.a) == null) {
            return null;
        }
        try {
            return nqoVar.a(uri);
        } catch (RemoteException unused) {
            nsf.e();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        nql nqlVar = this.b;
        Bitmap bitmap = (Bitmap) obj;
        if (nqlVar != null) {
            nqlVar.b = bitmap;
            nqk nqkVar = nqlVar.c;
            if (nqkVar != null) {
                nqkVar.a(nqlVar.b);
            }
            nqlVar.a = null;
        }
    }
}
