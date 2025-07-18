package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nip extends ocv {
    public nip() {
        super((short[]) null);
    }

    @Override // defpackage.ocv
    public final /* synthetic */ nwj b(Context context, Looper looper, oav oavVar, Object obj, nws nwsVar, nwt nwtVar) {
        return new njh(context, looper, oavVar, (GoogleSignInOptions) obj, nwsVar, nwtVar);
    }

    @Override // defpackage.ocv
    public final /* bridge */ /* synthetic */ List c(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.EMPTY_LIST : googleSignInOptions.a();
    }
}
