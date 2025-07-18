package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnt extends bta {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/FmrFeature");
    public final Context b;
    private final List c = new ArrayList();

    public bnt(Context context) {
        this.b = context;
    }

    public final synchronized void a(bug bugVar) {
        this.c.remove(bugVar);
    }

    @Override // defpackage.bta
    public final /* synthetic */ btc b(bug bugVar) {
        return new bns(this, bugVar);
    }

    @Override // defpackage.bta
    public final void c(bxj bxjVar) {
        bxjVar.c("Fmr Feature: %d active clients%n", Integer.valueOf(this.c.size()));
    }

    public final synchronized void d(bug bugVar) {
        this.c.add(bugVar);
    }
}
