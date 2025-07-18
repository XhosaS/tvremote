package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqc extends bta {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/VoiceFeature");
    public final PackageManager b;
    public final bqo c;
    public final btf d;
    public final bqv e;
    public final boolean f;
    public final bsi g;

    public bqc(Context context, bsi bsiVar, bqo bqoVar, btf btfVar, bqv bqvVar, boolean z) {
        this.b = context.getPackageManager();
        this.g = bsiVar;
        this.c = bqoVar;
        this.d = btfVar;
        this.e = bqvVar;
        boolean z2 = false;
        if (z && bqvVar.b()) {
            z2 = true;
        }
        this.f = z2;
    }

    public static void a(boolean z, boolean z2) throws btb {
        if (!z) {
            throw new btb(5);
        }
        if (!z2) {
            throw new btb(8);
        }
    }

    @Override // defpackage.bta
    public final /* synthetic */ btc b(bug bugVar) {
        return new bqb(this, bugVar);
    }

    @Override // defpackage.bta
    public final void c(bxj bxjVar) {
    }
}
