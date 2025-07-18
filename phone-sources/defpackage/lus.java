package defpackage;

import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lus implements idy {
    public static final String[] a = {"account", "query"};
    public final SharedPreferences b;
    public final long c;
    public final long d;
    public final lyz e;
    private final iea f;
    private final Executor g;

    public lus(iea ieaVar, lyz lyzVar, ExecutorService executorService, SharedPreferences sharedPreferences, lfn lfnVar) {
        this.f = ieaVar;
        this.e = lyzVar;
        this.g = executorService;
        this.b = sharedPreferences;
        this.c = lfnVar.aE();
        this.d = lfnVar.at();
    }

    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        ieg iegVarA = ((ldy) this.f).a();
        String lowerCase = ((String) obj).trim().replaceAll("\\s+", " ").toLowerCase(Locale.getDefault());
        if (iegVarA.k() || lowerCase.isEmpty()) {
            return;
        }
        this.g.execute(new lur(this, (ksn) iegVarA.g(), lowerCase));
    }
}
