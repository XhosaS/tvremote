package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mme implements lis {
    private final ieh a;
    private final String b;
    private final Intent c;

    public mme(ieh iehVar, String str, Intent intent) {
        this.a = iehVar;
        this.b = str;
        this.c = intent;
    }

    @Override // defpackage.lis
    public final /* synthetic */ void a(Object obj, View view, lid lidVar) {
        mtu mtuVar = (mtu) obj;
        ksy ksyVar = mtuVar.a;
        if (ksy.v(ksyVar)) {
            ieh iehVar = this.a;
            kvf kvfVarU = kvf.U(ksyVar);
            String str = this.b;
            Intent intent = this.c;
            ieg iegVar = mtuVar.s;
            Object obj2 = ((kqd) iehVar).a;
            ((Activity) obj2).startActivity(DetailsActivity.createMovieDetailsIntent((Context) obj2, kvfVarU, str, lidVar, intent, (ieg<lao>) iegVar));
        }
    }
}
