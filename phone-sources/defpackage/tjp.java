package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tjp extends AsyncTask {
    private static tig a;

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) throws NoSuchAlgorithmException, KeyStoreException {
        Context[] contextArr = (Context[]) objArr;
        if (a == null) {
            tig tigVar = new tig(contextArr[0]);
            a = tigVar;
            tigVar.b(tigVar.a());
        }
        return a;
    }
}
