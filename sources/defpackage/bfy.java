package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfy extends bgd {
    public static final bgd a = new bfy();

    private bfy() {
    }

    @Override // defpackage.bgd
    public final /* synthetic */ bfz b(bft bftVar, String str, Executor executor, bzt bztVar) {
        cli cliVarA;
        if (bftVar.e) {
            cliVarA = cli.a();
        } else {
            cli cliVar = cli.a;
            cni cniVar = cni.a;
            cliVarA = cli.a;
        }
        bge bgeVar = new bge(bftVar.b, cliVarA);
        Uri uri = bftVar.a;
        return new bfz(str, qm.K(uri), bgeVar, executor, bztVar, bftVar.c);
    }

    @Override // defpackage.bgd
    public final void a() {
    }
}
