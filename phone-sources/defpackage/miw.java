package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.play.movies.common.service.playstore.WatchActionBootstrapActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class miw implements lis {
    private final Context a;
    private final mdy b;
    private final ieg c;
    private final String d = "details";

    public miw(Context context, mdy mdyVar, ieg iegVar) {
        this.a = context;
        this.b = mdyVar;
        this.c = iegVar;
    }

    @Override // defpackage.lis
    public final /* bridge */ /* synthetic */ void a(Object obj, View view, lid lidVar) {
        mit mitVar = (mit) obj;
        ieg iegVar = this.c;
        if (iegVar.m()) {
            kxg kxgVar = mitVar.d;
            if (kxg.c(kxgVar)) {
                Context context = this.a;
                context.startActivity(BootstrapWatchActivity.createMovieIntent(context, mitVar.c, this.d, null));
                return;
            }
            Context context2 = this.a;
            mdy mdyVar = this.b;
            ksn ksnVar = (ksn) iegVar.g();
            ksy ksyVar = ((mir) mitVar).a;
            ieg iegVar2 = ieg.a;
            WatchActionBootstrapActivity.startWatchActionActivity(context2, mdyVar, ksnVar, ksyVar, iegVar2, iegVar2, kxgVar, lidVar);
        }
    }
}
